/*
Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.



1-film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?
2-film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?
3-film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.
4-payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.
 */

SELECT COUNT(*) from film WHERE length >(select AVG(length) from film);

SELECT COUNT(*) FROM film WHERE rental_rate = (select MAX(rental_rate)from film);

select*from film ORDER BY rental_rate,replacement_cost;

select first_name,last_name from customer WHERE customer_id = ANY (select customer_id from payment WHERE amount=(select MAX(amount) from payment));