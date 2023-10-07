# 배열의 평균값 - 120817 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120817) 

### 성능 요약

메모리: 84.6 MB, 시간: 0.05 ms

### 문제 설명

<p>정수 배열 <code>numbers</code>가 매개변수로 주어집니다. <code>numbers</code>의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>0 ≤ <code>numbers</code>의 원소 ≤ 1,000</li>
<li>1 ≤ <code>numbers</code>의 길이 ≤ 100</li>
<li>정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다. </li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>numbers</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]</td>
<td>5.5</td>
</tr>
<tr>
<td>[89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]</td>
<td>94.0</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li><code>numbers</code>의 원소들의 평균 값은 5.5입니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li><code>numbers</code>의 원소들의 평균 값은 94.0입니다.</li>
</ul>

<hr>

### 코드 설명
`line 4` : 정수 배열 numbers의 원소들을 더할 때 update를 위한 변수 sum 생성<br>
`line 5` : (배열 mubers의 길이-1)까지 1씩 증가시키면서 for문 돌림<br>
`line 6` : numbers의 원소들 더함<br>
`line 8` : 평균 값이 실수이므로 원소들의 합을 저장한 sum을 실수형으로 형 변환한 다음, 배열 길이로 나누어 평균값 구함<br>
&emsp;&emsp;그 값을 answer에 저장<br>
`line 9` : answer 리턴<br>
