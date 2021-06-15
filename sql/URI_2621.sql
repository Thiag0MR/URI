SELECT P.NAME
FROM PRODUCTS P JOIN PROVIDERS V ON P.ID_PROVIDERS = V.ID
WHERE P.AMOUNT BETWEEN 10 AND 20 AND V.NAME LIKE 'P%'
