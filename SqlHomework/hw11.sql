/*
 Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.



1-actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.
2-actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.
3-actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.
4-İlk 3 sorguyu tekrar eden veriler için de yapalım.
 */

(select first_name from actor) UNION (select first_name from customer);

(select first_name from actor) INTERSECT (select first_name from customer);

(select first_name from actor) EXCEPT (select first_name from customer);

(select first_name from actor) UNION ALL (select first_name from customer);

(select first_name from actor) INTERSECT ALL (select first_name from customer);

(select first_name from actor) EXCEPT ALL (select first_name from customer);