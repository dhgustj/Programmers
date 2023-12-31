-- 코드를 입력하세요
SELECT TITLE, BOARD.BOARD_ID AS 'BOARD_ID', REPLY_ID, REPLY.WRITER_ID AS 'WRITER_ID', REPLY.CONTENTS AS 'CONTENTS', DATE_FORMAT(REPLY.CREATED_DATE ,'%Y-%m-%d') AS 'CREATED_DATE'
FROM USED_GOODS_BOARD BOARD, USED_GOODS_REPLY REPLY
WHERE BOARD.BOARD_ID = REPLY.BOARD_ID AND DATE_FORMAT(BOARD.CREATED_DATE,'%Y-%m') LIKE '2022-10'
ORDER BY REPLY.CREATED_DATE ASC, BOARD.TITLE ASC; 