import { Injectable } from '@angular/core';

import { ToastInfo, ToastType } from '../models/toast-info';

@Injectable({
  providedIn: 'root'
})
export class ToastService {

  constructor() { }

  toasts: ToastInfo[] = [];

  showError(body: string) {
    this.toasts.push({type: 'ERROR' , body:  body});
  }

  showWarning(body: string) {
    this.toasts.push({type: 'WARNING' , body:  body});
  }

  showSuccess(body: string) {
    this.toasts.push({type: 'SUCCESS' , body:  body});
  }

  showInfo(body: string) {
    this.toasts.push({type: 'INFO' , body:  body});
  }

  remove(toast: ToastInfo) {
    this.toasts = this.toasts.filter(t => t != toast);
  }


}
