<h1 class="title">Подстрока</h1>

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
<p>В этой задаче Вам требуется найти максимальную по длине подстроку данной строки, такую что каждый символ встречается в ней не более k раз.</p>

<h2>Формат ввода</h2>
<p>В первой строке даны два целых числа n и k (1 ≤ n ≤ 100 000, 1 ≤ k ≤ n ) , где n – количество символов в строке. Во второй строке n символов – данная строка, состоящая только из строчных латинских букв.</p>

<h2>Формат вывода</h2>
<p>В выходной файл выведите два числа – длину искомой подстроки и номер её первого символа. Если решений несколько, выведите любое.</p>

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
			<td>3 1
                <br>abb</td>
			<td>2 1</td>
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
			<td>5 2
                <br>ababa</td>
			<td>4 1</td>
		</tr>
	</tbody>
</table>