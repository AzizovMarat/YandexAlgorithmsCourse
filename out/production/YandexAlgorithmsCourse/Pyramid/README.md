<h1 class="title">Пирамида</h1>

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
<p>Для строительство двухмерной пирамиды используются прямоугольные блоки, каждый из которых характеризуется шириной и высотой. Можно поставить один блок на другой, только если ширина верхнего блока строго меньше ширины нижнего. Самым нижним в пирамиде может быть блок любой ширины. По заданному набору блоков определите, пирамиду какой наибольшей высоты можно построить из них.</p>

<h2>Формат ввода</h2>
<p>В первой строке входных данных задается число <b>N</b> — количество блоков (<b>1 ≤ N ≤ 100000</b>).
<br>В следующий <b>N</b> строках задаются пары натуральных чисел <b>w<sub>i</sub></b> и <b>h<sub>i</sub></b> (<b>1 ≤ w<sub>i</sub>,h<sub>i</sub> ≤ 10<sup>9</sup></b>) — ширина и высота блока соответственно.</p>

<h2>Формат вывода</h2>
<p>Выведите одно целое число — максимальную высоту пирамиды.</p>

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
                <br>3 1
                <br>2 2
                <br>3 3</td>
			<td>5</td>
		</tr>
	</tbody>
</table>

<h2>Примечания</h2>
<p>В примере пирамида будет состоять из двух блоков: нижним блоком будет блок номер 3, а верхним — блок номер 2. Блок номер 1 нельзя использовать вместе с блоком номер 3.</p>