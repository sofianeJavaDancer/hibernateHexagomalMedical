
import {Medecin} from './medecin'
import {Patient} from './patient'
import {Consultation} from './consultation'

export interface Meeting {
  id?: string;
  medecin: Medecin;
  patient: Patient;
  consultation?: Consultation;
  date: string;
  heure: string;
}
