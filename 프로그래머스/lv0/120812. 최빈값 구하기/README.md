# 최빈값 구하기 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120812) 

### 문제 설명

<p>최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 <code>array</code>가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>0 &lt; <code>array</code>의 길이 &lt; 100</li>
<li>0&nbsp;≤&nbsp;<code>array</code>의 원소 &lt; 1000</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>array</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>[1, 2, 3, 3, 3, 4]</td>
<td>3</td>
</tr>
<tr>
<td>[1, 1, 2, 2]</td>
<td>-1</td>
</tr>
<tr>
<td>[1]</td>
<td>1</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>[1, 2, 3, 3, 3, 4]에서 1은 1개 2는 1개 3은 3개 4는 1개로 최빈값은 3입니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>[1, 1, 2, 2]에서 1은 2개 2는 2개로 최빈값이 1, 2입니다. 최빈값이 여러 개이므로 -1을 return 합니다.</li>
</ul>

<p>입출력 예 #3</p>

<ul>
<li>[1]에는 1만 있으므로 최빈값은 1입니다.</li>
</ul>

<hr>

### 코드 설명 (다른 사람 코드 참고했음)
`line 4` : 주어진 값이 몇 번 나왔는지 새는 count의 값을 update하면, update된 값을 저장하는 변수 maxcount<br>
`line 5` : return 값<br>
`line 6` : 주어진 값들을 key로 사용하는 Map <Integer,Integer> Hashmap 생성<br>
`line 7` : for문을 이용하여 최빈값 구하기<br>
`line 8` - map.getOrDefault(Object key, V DefaultValue)를 이용하여 찾는 key가 있으면 그 key의 value에 1을 더한 값을 count에 저장<br>
&emsp;&emsp;&emsp;&emsp;- key의 value값이 없거나 null이면 기본값 0에 1을 더한 값을 count에 저장<br>
`line 9` ~ `line 12`: count가 maxcount보다 크다면 maxcount와 answer를 update<br>
`line 13` ~ `line 15` : count와 maxcount가 같다면 answer에 -1을 저장<br>
`line 16` : number와 count를 map에 넣음<br>
`line 18` : answer값을 return<br>
