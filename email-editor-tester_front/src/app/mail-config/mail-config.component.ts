import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ContactService } from '../services/contact/contact.service';
import { EmailSenderService } from '../services/email-sender/email-sender.service';
import { TemplateService } from '../services/template/template.service';
import { Contact } from '../shared/models/contact';
import { EmailMessage } from '../shared/models/emailMessage';

@Component({
  selector: 'app-mail-config',
  templateUrl: './mail-config.component.html',
  styleUrls: ['./mail-config.component.css'],
})
export class MailConfigComponent implements OnInit {
  contactListids: number[] = [];
  contactList: any[] = [];
  contactString!: string;
  showTemplateList = false;
  selectedTemplateId: number = -1;
  selectedTemplateName: any;
  sendOption: string = 'immediate';
  scheduledDate: string = '';
  scheduledTime: string = '';
  showDropdown: boolean = false;
  //emailMessage!:EmailMessage;

  constructor(
    private route: ActivatedRoute,
    private contactService: ContactService,
    private templateService: TemplateService,
    private emailSenderService: EmailSenderService
  ) {}

  ngOnInit(): void {
    const contactListString = this.route.snapshot.paramMap.get('myArray');

    if (contactListString) {
      this.contactListids = contactListString
        .split(',')
        .map((str) => parseInt(str, 10));
    }

    this.contactService.getAllContacts().subscribe((contacts) => {
      const allContacts = contacts;
      this.contactList = this.contactListids.map((id) => {
        return allContacts.find((contact) => contact.id === id);
      });
      if (this.contactList.length == 0) {
        this.contactString = '';
      } else if (this.contactList.length == 1) {
        this.contactString =
          this.contactList[0].firstName + ' ' + this.contactList[0].lastName;
      } else if (this.contactList.length == 2) {
        this.contactString =
          this.contactList[0].firstName +
          ' ' +
          this.contactList[0].lastName +
          ' & ' +
          this.contactList[1].firstName +
          ' ' +
          this.contactList[1].lastName;
      } else {
        this.contactString =
          this.contactList[0].firstName +
          ' ' +
          this.contactList[0].lastName +
          ', ' +
          this.contactList[1].firstName +
          ' ' +
          this.contactList[1].lastName +
          ', ' +
          this.contactList[2].firstName[0] +
          '...&' +
          (this.contactList.length - 2) +
          ' more';
      }
    });
  }

  toggleTemplateList() {
    if (this.selectedTemplateId == -1) {
      this.showTemplateList = !this.showTemplateList;
    } else {
      this.selectedTemplateId = -1;
    }
  }

  handleSelectTemplate(id: any) {
    this.selectedTemplateId = id;
    this.templateService.getTemplate(id).subscribe((template) => {
      this.selectedTemplateName = template.name;
    });
  }

  toggleDropdown() {
    this.showDropdown = !this.showDropdown;
  }

  emailOpened() {
    console.log('email is opened');
  }

  emailClicked() {
    console.log('email is clicked');
  }

  emailBounced() {
    console.log('email is bounced');
  }

  sendEmail() {
    this.templateService
      .getTemplate(this.selectedTemplateId)
      .subscribe((template) => {
        const htmlBody = template.htmlData;
        const emailMessage = new EmailMessage(
          'haythemdilou@gmail.com',
          'test',
          htmlBody
        );
        this.emailSenderService.sendEmail(emailMessage).subscribe();
      });
  }
}
