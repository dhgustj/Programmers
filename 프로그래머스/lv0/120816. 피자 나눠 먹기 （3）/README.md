# 피자 나눠 먹기 (3) - 120816 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120816) 

### 성능 요약

메모리: 76 MB, 시간: 0.02 ms

### 문제 설명

<p>머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 피자 조각 수 <code>slice</code>와 피자를 먹는 사람의 수 <code>n</code>이 매개변수로 주어질 때, <code>n</code>명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>2 ≤ <code>slice</code> ≤ 10</li>
<li>1 ≤ <code>n</code> ≤ 100</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>slice</th>
<th>n</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>7</td>
<td>10</td>
<td>2</td>
</tr>
<tr>
<td>4</td>
<td>12</td>
<td>3</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>10명이 7조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 2판을 시켜야 합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>12명이 4조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 3판을 시켜야 합니다.</li>
</ul>

<hr>

### 코드 설명
`line 4` : 피자를 먹는 사람의 수 n을 피자 조각 수 slice로 나눈 후 나머지의 값이 0이 아니라면<br>
`line 5` : 피자 조각 수가 부족하다는 뜻이므로 n/slice의 값에 1을 더한 값을 answer에 저장<br>
`line 6` : n을 slice로 나눈 후 나머지의 값이 0이면<br>
`line 7` : 모든 사람이 최소 한 조각 이상 먹을 수 있다는 뜻이므로 n/slice의 값을 answer에 저장<br>
`line 8` : answer 리턴
