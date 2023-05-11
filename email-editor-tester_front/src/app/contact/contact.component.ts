import { Component, OnInit } from '@angular/core';
import { ContactService } from '../services/contact/contact.service';
import { Contact } from '../shared/models/contact';
import { Router } from '@angular/router';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css'],
})
export class ContactComponent implements OnInit {
  contacts: Contact[] = [];
  p = 1;
  selectedContacts: any[] = [];

  constructor(private contactService: ContactService, private router: Router) {}

  ngOnInit(): void {
    this.contactService.getAllContacts().subscribe((contacts) => {
      this.contacts = contacts;
    });
  }

  onContactChecked(event: Event, id: any) {
    const target = event.target as HTMLInputElement;
    if (target.checked) {
      this.selectedContacts.push(id);
    } else {
      const index = this.selectedContacts.indexOf(id);
      if (index !== -1) {
        this.selectedContacts.splice(index, 1);
      }
    }

    const allSelected = this.contacts.every((contact) =>
      this.selectedContacts.includes(contact.id)
    );
    const selectAllCheckbox = document.getElementById(
      'select-all-checkbox'
    ) as HTMLInputElement;
    if (allSelected) {
      selectAllCheckbox.checked = true;
    } else {
      selectAllCheckbox.checked = false;
    }
  }

  selectAllContacts(event: Event) {
    const target = event.target as HTMLInputElement;
    if (target.checked) {
      this.contacts.forEach((contact) => {
        const checkbox = document.getElementById(
          `contact-${contact.id}`
        ) as HTMLInputElement;
        if (!checkbox.checked) {
          checkbox.checked = true;
          this.selectedContacts.push(contact.id);
        }
      });
    } else {
      this.contacts.forEach((contact) => {
        const checkbox = document.getElementById(
          `contact-${contact.id}`
        ) as HTMLInputElement;
        if (checkbox) {
          checkbox.checked = false;
          const index = this.selectedContacts.indexOf(contact.id);
          if (index !== -1) {
            this.selectedContacts.splice(index, 1);
          }
        }
      });
    }
  }

  navigateToMailConfigComponent() {
    this.selectedContacts.sort((a, b) => a - b);
    const selectedContactsString = this.selectedContacts.join(',');

    this.router.navigate(['/mail-config', selectedContactsString]);
  }
}
