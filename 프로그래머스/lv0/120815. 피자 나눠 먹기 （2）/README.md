# 피자 나눠 먹기 (2) - 120815 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120815) 

### 문제 설명

<p>머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 <code>n</code>이 매개변수로 주어질 때, <code>n</code>명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.</p>

<hr>

<h5>제한사항</h5>

<p>1 ≤ <code>n</code> ≤ 100</p>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>n</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>6</td>
<td>1</td>
</tr>
<tr>
<td>10</td>
<td>5</td>
</tr>
<tr>
<td>4</td>
<td>2</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>6명이 모두 같은 양을 먹기 위해 한 판을 시켜야 피자가 6조각으로  모두 한 조각씩 먹을 수 있습니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>10명이 모두 같은 양을 먹기 위해 최소 5판을 시켜야 피자가 30조각으로 모두 세 조각씩 먹을 수 있습니다.</li>
</ul>

<p>입출력 예 #3</p>

<ul>
<li>4명이 모두 같은 양을 먹기 위해 최소 2판을 시키면 피자가 12조각으로 모두 세 조각씩 먹을 수 있습니다.</li>
</ul>

<hr>

### 코드 설명
- 피자 한 판을 6조각으로 나누므로 피자 조각은 최대 n*6 조각이 필요함<br>
`line 4` : 피자 한 조각을 의미하는 변수 i를 n * 6까지 1씩 증가시키면 for문을 돌림<br>
`line 5` ~ `line 7` : n * i의 값을 6으로 나눈 뒤 나머지가 0이면, n명이 피자를 남기지 않고 모두 같은 수의 피자를 먹었다는 뜻이므로<br>
&emsp;&emsp;&emsp;&emsp;(n * i)를 6으로 나누어 시켜야 하는 판 수를 구해 변수 answer에 저장<br>
`line 10` : answer 리턴

