SELECT P.NAME, V.NAME
FROM PRODUCTS P JOIN PROVIDERS V ON P.ID_PROVIDERS = V.ID
WHERE V.NAME = 'Ajax SA'