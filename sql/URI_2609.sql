SELECT C.NAME, SUM (P.AMOUNT)
FROM PRODUCTS P JOIN CATEGORIES C ON C.ID = P.ID_CATEGORIES
GROUP BY C.NAME

