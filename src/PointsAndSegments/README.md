<h1 class="title">Точки и отрезки</h1>

<table class="test-description" border="1" style="border-collapse:collapse;" cellpadding="5">
	<tbody>
		<tr>
			<td>Ограничение времени</td>
			<td>3 секунды</td>
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
<p>Дано n отрезков на числовой прямой и m точек на этой же прямой. Для каждой из данных точек определите, скольким отрезкам они принадлежат. Точка x считается принадлежащей отрезку с концами a и b, если выполняется двойное неравенство min(a, b) ≤ x ≤ max(a, b).</p>

<h2>Формат ввода</h2>
<p>Первая строка содержит два целых числа n (1 ≤ n ≤ 10<sup>5</sup>) – число отрезков и m (1 ≤ m ≤ 10<sup>5</sup>) – число точек. В следующих n строках по два целых числи a<sub>i</sub> и b<sub>i</sub> – координаты концов соответствующего отрезка. В последней строке m целых чисел – координаты точек. Все числа по модулю не превосходят 10<sup>9</sup></p>

<h2>Формат вывода</h2>
<p>В выходной файл выведите m чисел – для каждой точки количество отрезков, в которых она содержится.</p>

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
			<td>3 2
                <br>0 5
                <br>-3 2
                <br>7 10
                <br>1 6</td>
			<td>2 0 </td>
		</tr>
	</tbody>
</table>