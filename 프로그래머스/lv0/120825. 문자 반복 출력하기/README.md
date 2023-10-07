# 문자 반복 출력하기 - 120825 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120825) 

### 성능 요약

메모리: 67 MB, 시간: 12.00 ms

### 문제 설명

<p>문자열 <code>my_string</code>과 정수 <code>n</code>이 매개변수로 주어질 때, <code>my_string</code>에 들어있는 각 문자를 <code>n</code>만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>2 ≤ <code>my_string</code> 길이 ≤ 5</li>
<li>2 ≤ <code>n</code> ≤ 10</li>
<li>"my_string"은 영어 대소문자로 이루어져 있습니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>my_string</th>
<th>n</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"hello"</td>
<td>3</td>
<td>"hhheeellllllooo"</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>"hello"의 각 문자를 세 번씩 반복한 "hhheeellllllooo"를 return 합니다.</li>
</ul>

<hr>

### 코드 설명
`line 3` : 매개변수로 주어진 문자열 my_string을 .toCharArray()를 사용하여 문자 배열 array로 바꿈<br>
`line 4` : return할 문자열 변수 answer를 빈 문자열로 초기화<br>
`line 5` ~ `line 7` : for문을 돌면서 배열의 각 인덱스에 해당하는 문자를 n번만큼 answer에 추가<br> 
`line 10` : answer 리턴
