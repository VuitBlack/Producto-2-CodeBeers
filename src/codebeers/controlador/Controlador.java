package codebeers.controlador;

import codebeers.exceptions.ElementoNoExiste;
import codebeers.exceptions.OpcionNoValida;
import codebeers.exceptions.PedidoYaPreparado;
import codebeers.modelo.Cliente;
import codebeers.modelo.Datos;
import codebeers.modelo.Estandar;
import codebeers.modelo.Premium;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;

public class Controlador {

    private final Datos datos;

    public Controlador() {
        datos = new Datos();
    }

    public void addCliente(String nombre, String domicilio, String nif, String email, String tipoCliente) throws OpcionNoValida {
        Cliente cliente = switch (tipoCliente) {
            case "Estandar", "Estándar", "estandar", "estándar" -> new Estandar(nombre, domicilio, nif, email);
            case "Premium", "premium" -> new Premium(nombre, domicilio, nif, email);
            default -> throw new OpcionNoValida();
        };
        datos.addCliente(cliente);
    }

    public ArrayList getClientes(String filtro) {

        ArrayList<Cliente> clientes = datos.getClientes(filtro);
        ArrayList<Map<String, String>> datosClientes = new ArrayList<>();

        for (Cliente cliente: clientes) {
            datosClientes.add(cliente.getDatosCliente());
        }

        return datosClientes;
    }

    public void addArticulo(String id, String descripcion, float pvp, float gastosEnvio, int tiempoPreparacion) {
        codebeers.modelo.Articulo articulo = new codebeers.modelo.Articulo(id, descripcion, pvp, gastosEnvio, tiempoPreparacion);
        datos.addArticulo(articulo);
    }

    public ArrayList getArticulos() {

        ArrayList<codebeers.modelo.Articulo> articulos = datos.getArticulos();
        ArrayList<Map<String, String>> datosArticulos = new ArrayList<>();

        for (codebeers.modelo.Articulo articulo: articulos) {
            datosArticulos.add(articulo.getDatosArticulo());
        }

        return datosArticulos;
    }

    public void addPedido(String nif, String id, int unidades, LocalDateTime fechaHora) throws ElementoNoExiste {
        Cliente cliente = datos.getClienteByNif(nif);
        codebeers.modelo.Articulo articulo = datos.getArticuloById(id);
        codebeers.modelo.Pedido pedido = new codebeers.modelo.Pedido(cliente, articulo, unidades, fechaHora);
        datos.addPedido(pedido);
    }

    public ArrayList getPedidos(String filtro, boolean enviado) {

        ArrayList<codebeers.modelo.Pedido> pedidos = datos.getPedidos(filtro, enviado);
        ArrayList<Map<String, String>> datosPedidos = new ArrayList<>();

        for (codebeers.modelo.Pedido pedido: pedidos) {
            datosPedidos.add(pedido.getDatosPedido());
        }

        return datosPedidos;
    }

    public void deletePedido(int num) throws ElementoNoExiste, PedidoYaPreparado {
        datos.deletePedido(num);
    }

    public boolean clienteExiste(String nif) {
        return datos.compruebaExistenciaCliente(nif);
    }

    public boolean articuloExiste(String id) {
        return datos.compruebaExistenciaArticulo(id);
    }
}