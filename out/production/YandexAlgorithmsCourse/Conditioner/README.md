<h1 class="title">Кондиционер</h1>

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
<p>В офисе, где работает программист Петр, установили кондиционер нового типа. Этот кондиционер отличается особой простотой в управлении. У кондиционера есть всего лишь два управляемых параметра: желаемая температура и режим работы.
<br>Кондиционер может работать в следующих четырех режимах:</p>

<p>«freeze» — охлаждение. В этом режиме кондиционер может только уменьшать температуру. Если температура в комнате и так не больше желаемой, то он выключается.</p>

<p>«heat» — нагрев. В этом режиме кондиционер может только увеличивать температуру. Если температура в комнате и так не меньше желаемой, то он выключается.</p>

<p>«auto» — автоматический режим. В этом режиме кондиционер может как увеличивать, так и уменьшать температуру в комнате до желаемой.</p>

<p>«fan» — вентиляция. В этом режиме кондиционер осуществляет только вентиляцию воздуха и не изменяет температуру в комнате.</p>

<p>Кондиционер достаточно мощный, поэтому при настройке на правильный режим работы он за час доводит температуру в комнате до желаемой.</p>

<p>Требуется написать программу, которая по заданной температуре в комнате t<sub>room</sub>, установленным на кондиционере желаемой температуре t<sub>cond</sub> и режиму работы определяет температуру, которая установится в комнате через час.</p>

<h2>Формат ввода</h2>
<p>Первая строка входного файла содержит два целых числа t<sub>room</sub>, и t<sub>cond</sub>, разделенных ровно одним пробелом (–50 ≤ t<sub>room</sub> ≤ 50, –50 ≤ t<sub>cond</sub> ≤ 50).</p>

<p>Вторая строка содержит одно слово, записанное строчными буквами латинского алфавита — режим работы кондиционера.</p>

<h2>Формат вывода</h2>
<p>Выходной файл должен содержать одно целое число — температуру, которая установится в комнате через час.</p>

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
			<td>10 20<br>heat</td>
			<td>20</td>
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
			<td>10 20<br>freeze</td>
			<td>10</td>
		</tr>
	</tbody>
</table>

<h2>Примечания</h2>
<p>В первом примере кондиционер находится в режиме нагрева. Через час он нагреет комнату до желаемой температуры в 20 градусов.
<br>Во втором примере кондиционер находится в режиме охлаждения. Поскольку температура в комнате ниже, чем желаемая, кондиционер самостоятельно выключается и температура в комнате не поменяется.</p>