export class EmailMessage {
  to?: string;
  subject?: string;
  htmlBody?: string;

  constructor(to?: string, subject?: string, htmlBody?: string) {
    this.to = to;
    this.subject = subject;
    this.htmlBody = htmlBody;
  }
}
