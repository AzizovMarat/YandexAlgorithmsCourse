<h1 class="title">Расшифровка письменности Майя</h1>

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
<p>Расшифровка письменности Майя оказалась более сложной задачей, чем предполагалось ранними исследованиями. На протяжении более чем двух сотен лет удалось узнать не так уж много. Основные результаты были получены за последние 30 лет.
<br>Письменность Майя основывается на маленьких рисунках, известных как значки, которые обозначают звуки. Слова языка Майя обычно записываются с помощью этих значков, которые располагаются рядом друг с другом в некотором порядке.</p>

<p>Одна из проблем расшифровки письменности Майя заключается в определении этого порядка. Рисуя значки некоторого слова, писатели Майя иногда выбирали позиции для значков, исходя скорее из эстетических взглядов, а не определенных правил. Это привело к тому, что, хотя звуки для многих значков известны, археологи не всегда уверены, как должно произноситься записанное слово.</p>

<p>Археологи ищут некоторое слово W. Они знают значки для него, но не знают все возможные способы их расположения. Поскольку они знают, что Вы приедете на IOI ’06, они просят Вас о помощи. Они дадут Вам g значков, составляющих слово W, и последовательность S всех значков в надписи, которую они изучают, в порядке их появления. Помогите им, подсчитав количество возможных появлений слова W.</p>

<p>Задание Напишите программу, которая по значкам слова W и по последовательности S значков надписи подсчитывает количество всех возможных вхождений слова W в S, то есть количество всех различных позиций идущих подряд g значков в последовательности S, которые являются какой-либо перестановкой значков слова W .</p>

<h2>Формат ввода</h2>
<p>1 ≤ g ≤ 3 000, g – количество значков в слове W
<br>g ≤ |S| ≤ 3 000 000 где |S| – количество значков в последовательности S

<p>На вход программы поступают данные в следующем формате:</p>

<p>СТРОКА 1: Содержит два числа, разделенных пробелом – g и |S|.
<br>СТРОКА 2: Содержит g последовательных символов, с помощью которых записывается слово W . Допустимы символы: ‘a’-‘z’ и ‘A’-‘Z’; большие и маленькие буквы считаются различными.
<br>СТРОКА 3: Содержит |S| последовательных символов, которые представляют значки в надписи.
<br>Допустимы символы: ‘a’-‘z’ и ‘A’-‘Z’; большие и маленькие буквы считаются различными.</p>

<h2>Формат вывода</h2>
<p>Единственная строка выходных данных программы должна содержать количество возможных вхождений слова W в S.</p>

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
                <br>cAda
                <br>AbrAcadAbRa</td>
			<td>2</td>
		</tr>
	</tbody>
</table>