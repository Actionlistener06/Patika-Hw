/*
 Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.



1-city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz LEFT JOIN sorgusunu yazınız.
2-customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz RIGHT JOIN sorgusunu yazınız.
3-customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz FULL JOIN sorgusunu yazınız.

 */

select city,country.country from city LEFT JOIN country ON city.country_id=country.country_id;

select payment.payment_id,first_name,last_name from customer RIGHT JOIN payment ON customer.customer_id=payment.customer_id;

select rental.rental_id,first_name,last_name from customer FULL JOIN rental ON customer.customer_id=rental.rental_id;

