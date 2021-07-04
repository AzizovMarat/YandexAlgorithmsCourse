<h1 class="title">Сапер</h1>

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
<p>Вам необходимо построить поле для игры "Сапер" по его конфигурации – размерам и координатам расставленных на нем мин.
<br>Вкратце напомним правила построения поля для игры "Сапер":</p>
<ul>
 <li>Поле состоит из клеток с минами и пустых клеток</li>
 <li>Клетки с миной обозначаются символом *</li>
 <li>Пустые клетки содержат число k<sub>i,j</sub>, 0≤ k<sub>i, j</sub> ≤ 8 – количество мин на соседних клетках. <i>Соседними клетками являются восемь клеток, имеющих смежный угол или сторону.</i></li>
</ul>

<h2>Формат ввода</h2>
<p>В первой строке содержатся три числа: N, 1 ≤ N ≤ 100 - количество строк на поле, M, 1 ≤ M ≤ 100 - количество столбцов на поле, K, 0 ≤ K ≤ N ⋅ M - количество мин на поле.
<br>В следующих K строках содержатся по два числа с координатами мин: p, 1 ≤ p ≤ N - номер строки мины, q, 1 ≤ 1 ≤ M - номер столбца мины.</p>

<h2>Формат вывода</h2>
<p>Выведите построенное поле, разделяя строки поля переводом строки, а столбцы - пробелом.</p>

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
			<td>3 2 2
                <br>1 1
                <br>2 2</td>
			<td>* 2
                <br>2 *
                <br>1 1</td>
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
			<td>2 2 0</td>
			<td>0 0
                <br>0 0</td>
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
			<td>4 4 4
                <br>1 3
                <br>2 1
                <br>4 2
                <br>4 4</td>
			<td>1 2 * 1 
                <br>* 2 1 1 
                <br>2 2 2 1 
                <br>1 * 2 * </td>
		</tr>
	</tbody>
</table>