<h1 class="title">Черепахи</h1>

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
<p>Широко известна следующая задача для младших школьников. Три черепахи ползут по дороге. Одна черепаха говорит: “Впереди меня две черепахи”. Другая черепаха говорит: “Позади меня две черепахи”. Третья черепаха говорит: “Впереди меня две черепахи и позади меня две черепахи”. Как такое может быть? Ответ: третья черепаха врет! По дороге одна за другой движутся N черепах. Каждая черепаха говорит фразу вида: “Впереди меня a<sub>i</sub> черепах, а позади меня b<sub>i</sub> черепах”. Ваша задача определить, сколько самое большее количество черепах могут говорить правду.</p>

<h2>Формат ввода</h2>
<p>В первой строке вводится целое число N (1 ≤ N ≤ 10000) строк, содержащих целые числа a<sub>i</sub> и b<sub>i</sub>, по модулю не превосходящие 10000, описывающие высказывание i-ой черепахи.</p>

<h2>Формат вывода</h2>
<p>Выведите целое число M – максимальное количество черепах, которые могут говорить правду.</p>

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
                <br>2 0
                <br>0 2
                <br>2 2</td>
			<td>2</td>
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
			<td>5
                <br>0 4
                <br>1 3
                <br>2 2
                <br>3 1
                <br>4 0</td>
			<td>5</td>
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
			<td>10
                <br>9 1
                <br>8 1
                <br>7 2
                <br>6 2
                <br>5 3
                <br>4 4
                <br>3 6
                <br>2 7
                <br>1 9
                <br>0 8</td>
			<td>4</td>
		</tr>
	</tbody>
</table>