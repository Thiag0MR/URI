SELECT  name, CAST (EXTRACT (DAY FROM PAYDAY) AS INT) AS DAY
FROM loan
