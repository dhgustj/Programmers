-- 코드를 입력하세요
SELECT M.MEMBER_NAME, R.REVIEW_TEXT, DATE_FORMAT(R.REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
FROM MEMBER_PROFILE M, REST_REVIEW R
WHERE M.MEMBER_ID = R.MEMBER_ID AND R.MEMBER_ID = (SELECT MEMBER_ID
                                                  FROM REST_REVIEW
                                                  GROUP BY MEMBER_ID
                                                  ORDER BY COUNT(REVIEW_ID) DESC
                                                  LIMIT 1)
ORDER BY REVIEW_DATE, R.REVIEW_TEXT;
                                                  