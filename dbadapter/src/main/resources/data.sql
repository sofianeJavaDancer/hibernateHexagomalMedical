insert into MEDECIN(id, name, speciality) values(1, 'Dr House', 'GENERALISTE');
insert into MEDECIN(id, name, speciality) values(2, 'Dr Queen', 'PSYCHIATRE');
insert into MEDECIN(id, name, speciality) values(3, 'Dr Hu', 'OPHTALMOLOGUE');
insert into MEDECIN(id, name, speciality) values(4, 'Dr Melnek', 'UROLOGUE');


insert into PATIENT(id, name, insurance, email) values(1, 'John SNOW', 'AXA', 'john.snow@gmail.com');
insert into PATIENT(id, name, insurance, email) values(2, 'Aria STARK', 'AXA', 'aria.stark@gmail.com');
insert into PATIENT(id, name, insurance, email) values(3, 'Kalicee', 'AXA', 'kalicee@gmail.com');
insert into PATIENT(id, name, insurance, email) values(4, 'Hodor', 'AXA', 'hodor@gmail.com');


insert into MEETING(id, DATE, HEURE, MEDECIN_ID, PATIENT_ID) values(1, '2022-11-02', '18:00:00', 4, 2);
