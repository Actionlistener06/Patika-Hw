/*
 Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.

1-city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
2-customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
3-customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.

 */

SELECT city,country.country from city JOIN country ON country.country_id=city.country_id;

select payment_id,customer.first_name,customer.last_name from payment JOIN customer ON customer.customer_id=payment.customer_id;

select rental_id,customer.first_name,customer.last_name from rental JOIN customer ON customer.customer_id=rental.customer_id;

