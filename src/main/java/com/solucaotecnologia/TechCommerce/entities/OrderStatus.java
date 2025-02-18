package com.solucaotecnologia.TechCommerce.entities;

public enum OrderStatus {

    //Aguardando pagamento
    WAITING_PAYMENT,

    //Pago
    PAID,

    //Enviado
    SHIPPED,

    //Entregue
    DELIVERED,

    //Cancelado
    CANCELED
}
