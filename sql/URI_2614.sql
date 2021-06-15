SELECT C.NAME, R.RENTALS_DATE
FROM CUSTOMERS C JOIN RENTALS R ON C.ID = R.ID_CUSTOMERS
WHERE EXTRACT (MONTH FROM R.RENTALS_DATE) = 9 AND EXTRACT (YEAR FROM R.RENTALS_DATE) = 2016
