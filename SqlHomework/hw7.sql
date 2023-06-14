/*
 Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.

-film tablosunda bulunan filmleri rating değerlerine göre gruplayınız.
-film tablosunda bulunan filmleri replacement_cost sütununa göre grupladığımızda film sayısı 50 den fazla olan replacement_cost değerini ve karşılık gelen film sayısını sıralayınız.
-customer tablosunda bulunan store_id değerlerine karşılık gelen müşteri sayılarını nelerdir?
-city tablosunda bulunan şehir verilerini country_id sütununa göre gruplandırdıktan sonra en fazla şehir sayısı barındıran country_id bilgisini ve şehir sayısını paylaşınız.
 */

select rating from film group by rating;

select replacement_cost,COUNT(*) from film GROUP BY replacement_cost HAVING COUNT(*) > 50;

select store_id,COUNT(*) from customer GROUP BY store_id ;

select country_id,COUNT(*) from city GROUP BY country_id  ORDER BY COUNT(*) DESC LIMIT 1;