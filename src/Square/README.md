<h1 class="title">Площадь</h1>

<table class="test-description" border="1" style="border-collapse:collapse;" cellpadding="5">
	<tbody>
		<tr>
            <th>Язык</th>
            <th>Ограничение времени</th>
            <th>Ограничение памяти</th>
            <th>Ввод</th>
            <th>Вывод</th>
		</tr>
		<tr>
			<td>Все языки</td>
			<td>0.5 секунд</td>
			<td>64Mb</td>
			<td rowspan="8">стандартный ввод или input.txt</td>
			<td rowspan="8">стандартный вывод или output.txt</td>
		<tr>
			<td><nobr>GNU C11 7.3</nobr></td>
            <td>0.3 секунды</td>
            <td>256Mb</td>
		</tr>
		<tr>
			<td><nobr>GNU c++ 11 4.9</nobr></td>
            <td>0.3 секунды</td>
            <td>256Mb</td>
		</tr>
		<tr>
			<td><nobr>GNU c++ 11 x32 4.9</nobr></td>
            <td>0.3 секунды</td>
            <td>256Mb</td>
		</tr>
		<tr>
			<td><nobr>GCC 5.4.0 C++14</nobr></td>
            <td>0.3 секунды</td>
            <td>256Mb</td>
		</tr>
		<tr>
			<td><nobr>GNU c++ 14 4.9</nobr></td>
            <td>0.3 секунды</td>
            <td>256Mb</td>
		</tr>
		<tr>
			<td><nobr>GNU c++17 7.3</nobr></td>
            <td>0.3 секунды</td>
            <td>256Mb</td>
		</tr>
		<tr>
			<td><nobr>GCC C++17</nobr></td>
            <td>0.3 секунды</td>
            <td>256Mb</td>
		</tr>
	</tbody>
</table>
<p>Городская площадь имеет размер n× m и покрыта квадратной плиткой размером 1 × 1. При плановой замене плитки выяснилось, что новой плитки недостаточно для покрытия всей площади, поэтому было решено покрыть плиткой только дорожку по краю площади, а в центре площади разбить прямоугольную клумбу (см. рисунок к примеру). При этом дорожка должна иметь одинаковую ширину по всем сторонам площади. Определите максимальную ширину дорожки, которую можно выложить из имеющихся плиток.</p>

<h2>Формат ввода</h2>
<p>Первая и вторая строки входных данных содержат по одному числу n и m (3 ≤ n ≤ 2 × 10<sup>9</sup>, 3 ≤ m ≤ 2 × 10<sup>9</sup>) — размеры площади.
<br>Третья строка содержит количество имеющихся плиток t, 1 ≤ t < nm.</p>

<p><b>Обратите внимание, что значение t может быть больше, чем возможное значение 32-битной целочисленной переменной, поэтому необходимо использовать 64-битные числа (тип int64 в языке Pascal, тип long long в C и C++, тип long в Java и C#).</b></p>

<h2>Формат вывода</h2>
<p>Программа должна вывести единственное число — максимальную ширину дорожки, которую можно выложить из имеющихся плиток.</p>

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
			<td>6
                <br>7
                <br>38</td>
			<td>2</td>
		</tr>
	</tbody>
</table>

<h2>Примечания</h2>
<p>Пояснение к примеру. Площадь имеет размеры 6 × 7, из 38 плиток можно выложить дорожку шириной в 2 плитки.</p>
<table class="out" border="1" style="border-collapse:collapse;" cellpadding="5">
	<tbody>
		<tr>
			<td>x</td>
			<td>x</td>
			<td>x</td>
			<td>x</td>
			<td>x</td>
			<td>x</td>
			<td>x</td>
		</tr>
		<tr>
			<td>x</td>
			<td>x</td>
			<td>x</td>
			<td>x</td>
			<td>x</td>
			<td>x</td>
			<td>x</td>
		</tr>
		<tr>
			<td>x</td>
			<td>x</td>
			<td></td>
			<td></td>
			<td></td>
			<td>x</td>
			<td>x</td>
		</tr>
		<tr>
			<td>x</td>
			<td>x</td>
			<td></td>
			<td></td>
			<td></td>
			<td>x</td>
			<td>x</td>
		</tr>
		<tr>
			<td>x</td>
			<td>x</td>
			<td>x</td>
			<td>x</td>
			<td>x</td>
			<td>x</td>
			<td>x</td>
		</tr>
		<tr>
			<td>x</td>
			<td>x</td>
			<td>x</td>
			<td>x</td>
			<td>x</td>
			<td>x</td>
			<td>x</td>
		</tr>
	</tbody>
</table>
<p>Две плитки осталось</p>
<table class="out" border="1" style="border-collapse:collapse;" cellpadding="5">
	<tbody>
		<tr>
			<td>x</td>
			<td>x</td>
		</tr>
	</tbody>
</table>