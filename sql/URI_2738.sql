SELECT  C.NAME, CAST ( ((S.MATH * 2) + (SPECIFIC * 3) + (PROJECT_PLAN * 5)) / 10 AS NUMERIC(15, 2)) AS AVG
FROM CANDIDATE C JOIN SCORE S ON C.ID = S.CANDIDATE_ID
ORDER BY AVG DESC


