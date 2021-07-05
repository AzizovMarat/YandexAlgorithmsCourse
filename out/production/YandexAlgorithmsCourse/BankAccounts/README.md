<h1 class="title">Банковские счета</h1>

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
<p>Некоторый банк хочет внедрить систему управления счетами клиентов, поддерживающую следующие операции:
<br>Пополнение счета клиента. Снятие денег со счета. Запрос остатка средств на счете. Перевод денег между счетами клиентов. Начисление процентов всем клиентам.</p>

<p>Вам необходимо реализовать такую систему. Клиенты банка идентифицируются именами (уникальная строка, не содержащая пробелов). Первоначально у банка нет ни одного клиента. Как только для клиента проводится операция пололнения, снятия или перевода денег, ему заводится счет с нулевым балансом. Все дальнейшие операции проводятся только с этим счетом. Сумма на счету может быть как положительной, так и отрицательной, при этом всегда является целым числом.</p>

<h2>Формат ввода</h2>
<p>Входной файл содержит последовательность операций. Возможны следующие операции: DEPOSIT name sum - зачислить сумму sum на счет клиента name. Если у клиента нет счета, то счет создается. WITHDRAW name sum - снять сумму sum со счета клиента name. Если у клиента нет счета, то счет создается. BALANCE name - узнать остаток средств на счету клиента name. TRANSFER name1 name2 sum - перевести сумму sum со счета клиента name1 на счет клиента name2. Если у какого-либо клиента нет счета, то ему создается счет. INCOME p - начислить всем клиентам, у которых открыты счета, p% от суммы счета. Проценты начисляются только клиентам с положительным остатком на счету, если у клиента остаток отрицательный, то его счет не меняется. После начисления процентов сумма на счету остается целой, то есть начисляется только целое число денежных единиц. Дробная часть начисленных процентов отбрасывается.</p>

<h2>Формат вывода</h2>
<p>Для каждого запроса BALANCE программа должна вывести остаток на счету данного клиента. Если же у клиента с запрашиваемым именем не открыт счет в банке, выведите ERROR.</p>

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
			<td>DEPOSIT Ivanov 100
                <br>INCOME 5
                <br>BALANCE Ivanov
                <br>TRANSFER Ivanov Petrov 50
                <br>WITHDRAW Petrov 100
                <br>BALANCE Petrov
                <br>BALANCE Sidorov</td>
			<td>105
                <br>-50
                <br>ERROR</td>
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
			<td>BALANCE Ivanov
                <br>BALANCE Petrov
                <br>DEPOSIT Ivanov 100
                <br>BALANCE Ivanov
                <br>BALANCE Petrov
                <br>DEPOSIT Petrov 150
                <br>BALANCE Petrov
                <br>DEPOSIT Ivanov 10
                <br>DEPOSIT Petrov 15
                <br>BALANCE Ivanov
                <br>BALANCE Petrov
                <br>DEPOSIT Ivanov 46
                <br>BALANCE Ivanov
                <br>BALANCE Petrov
                <br>DEPOSIT Petrov 14
                <br>BALANCE Ivanov
                <br>BALANCE Petrov</td>
			<td>ERROR
                <br>ERROR
                <br>100
                <br>ERROR
                <br>150
                <br>110
                <br>165
                <br>156
                <br>165
                <br>156
                <br>179</td>
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
			<td>BALANCE a
                <br>BALANCE b
                <br>DEPOSIT a 100
                <br>BALANCE a
                <br>BALANCE b
                <br>WITHDRAW a 20
                <br>BALANCE a
                <br>BALANCE b
                <br>WITHDRAW b 78
                <br>BALANCE a
                <br>BALANCE b
                <br>WITHDRAW a 784
                <br>BALANCE a
                <br>BALANCE b
                <br>DEPOSIT b 849
                <br>BALANCE a
                <br>BALANCE b</td>
			<td>ERROR
                <br>ERROR
                <br>100
                <br>ERROR
                <br>80
                <br>ERROR
                <br>80
                <br>-78
                <br>-704
                <br>-78
                <br>-704
                <br>771</td>
		</tr>
	</tbody>
</table>