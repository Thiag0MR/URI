SELECT name, customers_number
FROM lawyers
WHERE CUSTOMERS_NUMBER IN (SELECT MAX(customers_number) FROM lawyers)

UNION ALL

SELECT name, customers_number
FROM lawyers
WHERE CUSTOMERS_NUMBER IN (SELECT MIN(customers_number) FROM lawyers)

UNION ALL

SELECT 'Average', ROUND (AVG (customers_number), 0)
FROM lawyers
