SELECT ID, NAME
FROM CUSTOMERS
WHERE ID NOT IN (SELECT ID_CUSTOMERS FROM LOCATIONS)
