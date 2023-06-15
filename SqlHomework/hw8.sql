/*
-test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
-Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
-Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
-Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

 */
---
CREATE TABLE employee (
                          id SERIAL PRIMARY KEY,
                          name VARCHAR(50) NOT NULL,
                          birthday DATE,
                          email VARCHAR(100)
);
---
insert into employee (id, name, birthday, email) values (1, 'Dorthea Le Count', '2000-04-01', 'dle0@salon.com');
insert into employee (id, name, birthday, email) values (2, 'Carmine Tackett', '1999-07-13', 'ctackett1@intel.com');
insert into employee (id, name, birthday, email) values (3, 'Charlean Speerman', '1997-09-11', 'cspeerman2@apache.org');
insert into employee (id, name, birthday, email) values (4, 'Roana Bantham', '1997-02-26', 'rbantham3@adobe.com');
insert into employee (id, name, birthday, email) values (5, 'Alana Fosse', '1994-10-30', 'afosse4@fda.gov');
insert into employee (id, name, birthday, email) values (6, 'Nesta Exelby', '1997-09-28', 'nexelby5@cargocollective.com');
insert into employee (id, name, birthday, email) values (7, 'Delmar Bullocke', '1998-04-18', 'dbullocke6@hud.gov');
insert into employee (id, name, birthday, email) values (8, 'Cherry Reolfi', '1996-11-23', 'creolfi7@desdev.cn');
insert into employee (id, name, birthday, email) values (9, 'Luis Haselwood', '1995-09-08', 'lhaselwood8@oakley.com');
insert into employee (id, name, birthday, email) values (10, 'Leandra Paish', '1994-09-14', 'lpaish9@bandcamp.com');
insert into employee (id, name, birthday, email) values (11, 'Juliane Haslock', '1996-06-16', 'jhaslocka@ftc.gov');
insert into employee (id, name, birthday, email) values (12, 'Ted Kerss', '2000-05-26', 'tkerssb@opera.com');
insert into employee (id, name, birthday, email) values (13, 'Ashleigh Dugall', '1999-04-19', 'adugallc@gravatar.com');
insert into employee (id, name, birthday, email) values (14, 'Merrick Grew', '1998-02-19', 'mgrewd@nationalgeographic.com');
insert into employee (id, name, birthday, email) values (15, 'Waverley Gellert', '1999-12-08', 'wgellerte@gravatar.com');
insert into employee (id, name, birthday, email) values (16, 'Alexi Mityushin', '1996-04-09', 'amityushinf@un.org');
insert into employee (id, name, birthday, email) values (17, 'Karla O''Lagen', '1999-02-03', 'kolageng@smh.com.au');
insert into employee (id, name, birthday, email) values (18, 'Kristofor Giannotti', '1996-05-30', 'kgiannottih@google.com.au');
insert into employee (id, name, birthday, email) values (19, 'Riane Fransseni', '1996-07-10', 'rfranssenii@tripadvisor.com');
insert into employee (id, name, birthday, email) values (20, 'Glenine Dymick', '1999-01-30', 'gdymickj@state.tx.us');
insert into employee (id, name, birthday, email) values (21, 'Teresa Calvert', '1994-12-18', 'tcalvertk@barnesandnoble.com');
insert into employee (id, name, birthday, email) values (22, 'Rustin D''Agostini', '2000-05-10', 'rdagostinil@ehow.com');
insert into employee (id, name, birthday, email) values (23, 'Alica Fordham', '1997-01-09', 'afordhamm@sciencedaily.com');
insert into employee (id, name, birthday, email) values (24, 'Danyelle Heilds', '1993-08-08', 'dheildsn@salon.com');
insert into employee (id, name, birthday, email) values (25, 'Jammal Seaward', '1999-01-27', 'jseawardo@plala.or.jp');
insert into employee (id, name, birthday, email) values (26, 'Dolley Oakden', '1996-04-14', 'doakdenp@ucoz.ru');
insert into employee (id, name, birthday, email) values (27, 'Jennifer Mil', '2000-06-13', 'jmilq@purevolume.com');
insert into employee (id, name, birthday, email) values (28, 'Findley List', '2000-02-21', 'flistr@behance.net');
insert into employee (id, name, birthday, email) values (29, 'Kassie Benbow', '1994-08-30', 'kbenbows@ucoz.com');
insert into employee (id, name, birthday, email) values (30, 'Margette Pybus', '1995-04-27', 'mpybust@drupal.org');
insert into employee (id, name, birthday, email) values (31, 'Rod Youel', '1995-05-28', 'ryouelu@accuweather.com');
insert into employee (id, name, birthday, email) values (32, 'Zachary Hannum', '1998-08-22', 'zhannumv@fda.gov');
insert into employee (id, name, birthday, email) values (33, 'Riane Tressler', '1995-09-10', 'rtresslerw@mayoclinic.com');
insert into employee (id, name, birthday, email) values (34, 'Donaugh Tomlett', '1999-10-09', 'dtomlettx@sciencedaily.com');
insert into employee (id, name, birthday, email) values (35, 'Caryl Harmstone', '1998-03-23', 'charmstoney@economist.com');
insert into employee (id, name, birthday, email) values (36, 'Briano Piotrkowski', '1996-12-03', 'bpiotrkowskiz@springer.com');
insert into employee (id, name, birthday, email) values (37, 'Lev Cridlon', '1995-07-02', 'lcridlon10@dailymotion.com');
insert into employee (id, name, birthday, email) values (38, 'Melesa Sanzio', '1995-03-22', 'msanzio11@bizjournals.com');
insert into employee (id, name, birthday, email) values (39, 'Fleur Colebrook', '1999-04-09', 'fcolebrook12@arizona.edu');
insert into employee (id, name, birthday, email) values (40, 'Carree Wrench', '1999-10-31', 'cwrench13@paginegialle.it');
insert into employee (id, name, birthday, email) values (41, 'Bengt Swaine', '1997-09-25', 'bswaine14@barnesandnoble.com');
insert into employee (id, name, birthday, email) values (42, 'Willy Bruntjen', '1996-06-03', 'wbruntjen15@fotki.com');
insert into employee (id, name, birthday, email) values (43, 'Vidovik Kippin', '1998-08-18', 'vkippin16@nps.gov');
insert into employee (id, name, birthday, email) values (44, 'Roanne Krystek', '1995-02-18', 'rkrystek17@bloglines.com');
insert into employee (id, name, birthday, email) values (45, 'Erastus Plumer', '1999-09-24', 'eplumer18@ehow.com');
insert into employee (id, name, birthday, email) values (46, 'Dar Thiem', '1997-08-21', 'dthiem19@weather.com');
insert into employee (id, name, birthday, email) values (47, 'Sam Heephy', '1999-02-20', 'sheephy1a@ed.gov');
insert into employee (id, name, birthday, email) values (48, 'Chester Braunfeld', '1999-08-20', 'cbraunfeld1b@chron.com');
insert into employee (id, name, birthday, email) values (49, 'Maggy Lamberto', '1997-03-18', 'mlamberto1c@sogou.com');
insert into employee (id, name, birthday, email) values (50, 'Aldwin Sprakes', '1997-12-13', 'asprakes1d@symantec.com');
---
UPDATE employee SET name='Seda Sayan',birthday='1994-12-18',email='sayanseda@magazin.com' WHERE id=1;
UPDATE employee SET id=51,birthday='1990-12-18',email='cctackett@patika.com' WHERE name='Carmine Tackett';
UPDATE employee SET id=52,name='Duygu Aktukmak',email='duyguaktukmak@patika.com' WHERE birthday='1999-10-09';
UPDATE employee SET id=61 ,  name='Duygu Aktukmak', birthday='1960-10-09' WHERE email='duyguaktukmak@patika.com';
UPDATE employee SET name='Duygu Aktukmak', birthday='1960-10-09',email='duyguaktukmak@patika.com' WHERE id IN(43,44,45,46,47);
---
DELETE from employee WHERE name='Delmar Bullocke';
DELETE from employee WHERE id=20;
DELETE from employee WHERE birthday>'1999-01-01';
DELETE from employee WHERE email LIKE '%@adobe.com';
DELETE from employee;
---