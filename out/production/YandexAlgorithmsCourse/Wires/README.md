<h1 class="title">Провода</h1>

<table class="test-description" border="1" style="border-collapse:collapse;" cellpadding="5">
	<tbody>
		<tr>
			<td>Ограничение времени</td>
			<td>1 секунда</td>
		<tr>
			<td>Ограничение памяти</td>
            <td>64Mb</td>
		</tr>
		<tr>
			<td>Ввод</td>
            <td>стандартный ввод или input.txt</td>
		</tr>
		<tr>
			<td>Вывод</td>
            <td>стандартный вывод или output.txt</td>
		</tr>
	</tbody>
</table>
<p>Дано N отрезков провода длиной L<sub>1</sub>, L<sub>2</sub>, ..., L<sub>N</sub> сантиметров. Требуется с помощью разрезания получить из них K равных отрезков как можно большей длины, выражающейся целым числом сантиметров. Если нельзя получить K отрезков длиной даже 1 см, вывести 0.</p>

<h2>Формат ввода</h2>
<p>В первой строке находятся числа N и К. В следующих N строках - L1, L2, ..., LN, по одному числу в строке.
<br>Ограничения: 1 ≤ N, K ≤ 10 000, 100 ≤ L<sub>i</sub> ≤ 10 000 000, все числа целые.</p>

<h2>Формат вывода</h2>
<p>Вывести одно число - полученную длину отрезков.</p>

<h3>Пример 1</h3>
<table class="in-out" border="1" style="border-collapse:collapse;" cellpadding="5">
      <thead>
         <tr>
            <th>Ввод</th>
            <th>Вывод</th>
         </tr>
      </thead>
	<tbody>
		<tr>
			<td>4 11
                <br>802
                <br>743
                <br>457
                <br>539</td>
			<td>200</td>
		</tr>
	</tbody>
</table>