SELECT P.NAME, C.NAME
FROM PRODUCTS P JOIN CATEGORIES C ON P.ID_CATEGORIES = C.ID
WHERE P.AMOUNT > 100 AND C.ID IN (1,2,3,6,9)
ORDER BY C.ID
