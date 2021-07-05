<h1 class="title">Двоичный поиск</h1>

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
<p>Реализуйте двоичный поиск в массиве</p>

<h2>Формат ввода</h2>
<p>В первой строке входных данных содержатся натуральные числа N и K (). Во второй строке задаются N элементов первого массива, а в третьей строке – K элементов второго массива. Элементы обоих массивов - целые числа, каждое из которых по модулю не превосходит 10<sup>9</sup></p>

<h2>Формат вывода</h2>
<p>Требуется для каждого из K чисел вывести в отдельную строку "YES", если это число встречается в первом массиве, и "NO" в противном случае.</p>

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
			<td>10 10
                <br>1 61 126 217 2876 6127 39162 98126 712687 1000000000 
                <br>100 6127 1 61 200 -10000 1 217 10000 1000000000</td>
			<td>NO
                <br>YES
                <br>YES
                <br>YES
                <br>NO
                <br>NO
                <br>YES
                <br>YES
                <br>NO
                <br>YES</td>
		</tr>
	</tbody>
</table>
<h3>Пример 2</h3>
<table class="in-out" border="1" style="border-collapse:collapse;" cellpadding="5">
      <thead>
         <tr>
            <th>Ввод</th>
            <th>Вывод</th>
         </tr>
      </thead>
	<tbody>
		<tr>
			<td>10 10
                <br>-8 -6 -4 -4 -2 -1 0 2 3 3 
                <br>8 3 -3 -2 2 -1 2 9 -8 0 </td>
			<td>NO
                <br>YES
                <br>NO
                <br>YES
                <br>YES
                <br>YES
                <br>YES
                <br>NO
                <br>YES
                <br>YES</td>
		</tr>
	</tbody>
</table>
<h3>Пример 3</h3>
<table class="in-out" border="1" style="border-collapse:collapse;" cellpadding="5">
      <thead>
         <tr>
            <th>Ввод</th>
            <th>Вывод</th>
         </tr>
      </thead>
	<tbody>
		<tr>
			<td>10 5
                <br>1 2 3 4 5 6 7 8 9 10 
                <br>-2 0 4 9 12 </td>
			<td>NO
                <br>NO
                <br>YES
                <br>YES
                <br>NO</td>
		</tr>
	</tbody>
</table>