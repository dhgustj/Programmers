# 문자열 뒤집기 - 120822 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120822) 

### 성능 요약

메모리: 85.6 MB, 시간: 14.29 ms

### 문제 설명

<p>문자열 <code>my_string</code>이 매개변수로 주어집니다. <code>my_string</code>을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>my_string</code>의 길이 ≤ 1,000</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>my_string</th>
<th>return</th>
</tr>
</thead>
        <tbody><tr>
<td>"jaron"</td>
<td>"noraj"</td>
</tr>
<tr>
<td>"bread"</td>
<td>"daerb"</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li><code>my_string</code>이 "jaron"이므로 거꾸로 뒤집은 "noraj"를 return합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li><code>my_string</code>이 "bread"이므로 거꾸로 뒤집은 "daerb"를 return합니다.</li>
</ul>

<hr>

### 코드 설명
`line 3` : 매개변수로 주어진 문자열 my_string을 .toCharArray()를 사용하여 문자 배열 array로 바꿈<br>
`line 4` : return할 문자열 변수 answer를 빈 문자열로 초기화<br>
`line 5` : 문자 배열 array의 길이까지 1만큼 증가시키면서 for문 돌림<br>
`line 6` : array[array.length-i]를 통해 문자 배열의 마지막 값부터 가져와 answer에 추가<br>
`line 8` : answer 리
