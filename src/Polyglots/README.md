<h1 class="title">Полиглоты</h1>

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
<p>Каждый из N школьников некоторой школы знает M<sub>i</sub> языков. Определите, какие языки знают все школьники и языки, которые знает хотя бы один из школьников.</p>

<h2>Формат ввода</h2>
<p>Первая строка входных данных содержит количество школьников N. Далее идет N чисел M<sub>i</sub>, после каждого из чисел идет M<sub>i</sub> строк, содержащих названия языков, которые знает i-й школьник. Длина названий языков не превышает 1000 символов, количество различных языков не более 1000. 1 ≤ N ≤ 1000, 1 ≤ M<sub>i</sub> ≤ 500.</p>

<h2>Формат вывода</h2>
<p>В первой строке выведите количество языков, которые знают все школьники. Начиная со второй строки - список таких языков. Затем - количество языков, которые знает хотя бы один школьник, на следующих строках - список таких языков.</p>

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
			<td>3
                <br>3
                <br>Russian
                <br>English
                <br>Japanese
                <br>2
                <br>Russian
                <br>English
                <br>1
                <br>English</td>
			<td>1
                <br>English
                <br>3
                <br>Russian
                <br>Japanese
                <br>English</td>
		</tr>
	</tbody>
</table>