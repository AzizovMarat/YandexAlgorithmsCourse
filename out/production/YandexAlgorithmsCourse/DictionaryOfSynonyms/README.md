<h1 class="title">Словарь синонимов</h1>

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
<p>Вам дан словарь, состоящий из пар слов. Каждое слово является синонимом к парному ему слову. Все слова в словаре различны. Для одного данного слова определите его синоним.</p>

<h2>Формат ввода</h2>
<p>Программа получает на вход количество пар синонимов N. Далее следует N строк, каждая строка содержит ровно два слова-синонима. После этого следует одно слово.</p>

<h2>Формат вывода</h2>
<p>Программа должна вывести синоним к данному слову.</p>

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
                <br>Hello Hi
                <br>Bye Goodbye
                <br>List Array
                <br>Goodbye</td>
			<td>Bye</td>
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
			<td>1
                <br>beep Car
                <br>Car</td>
			<td>beep</td>
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
			<td>2
                <br>Ololo Ololo
                <br>Numbers 1234567890
                <br>Numbers</td>
			<td>1234567890</td>
		</tr>
	</tbody>
</table>

<h2>Примечания</h2>
<p>Эту задачу можно решить и без словарей (сохранив все входные данные в списке), но решение со словарем будет более простым.</p>