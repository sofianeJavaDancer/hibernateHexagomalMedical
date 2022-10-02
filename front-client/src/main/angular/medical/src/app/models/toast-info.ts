export interface ToastInfo {
  type: string;
  body: string;
  delay?: number;
}

export enum ToastType {
  ERROR,
  DANGER,
  SUCCESS,
  INFO
}
