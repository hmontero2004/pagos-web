<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hola mundo:)</title>
</head>
<body>
	<h1>Pago</h1>

	<button
		onclick="window.location.href='/Pagosss/findOne?idPago=1'; return false">
		Agregar</button>

	<table>
		<thead>
			<tr>
				<th>ID_Pago</th>
				<th>ID_Pedido</th>
				<th>Fecha_Pago</th>
				<th>ID_Tipo_Pago</th>
				<th>Monto</th>
				<th>Acciones</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${pago}">
				<tr>
					<td>${item.idPago}</td>
					<td>${item.idPedido}</td>
					<td>${item.fechaPago}</td>
					<td>${item.idTipoPago}</td>
					<td>${item.monto}</td>
					<td>
						<button
							onclick="window.location.href='/Pagosss/findOne?idPago=${item.idPago}&opcion=1'; return false">
							Actualizar</button>
						<button
							onclick="window.location.href='/Pagosss/findOne?idPago=${item.idPago}&opcion=2'; return false">
							Eliminar</button>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>