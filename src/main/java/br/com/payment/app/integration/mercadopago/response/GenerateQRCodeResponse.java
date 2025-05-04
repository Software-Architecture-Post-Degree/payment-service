package br.com.payment.app.integration.mercadopago.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GenerateQRCodeResponse {

    @JsonProperty("in_store_order_id")
    private String externalOrderId;

    @JsonProperty("qr_data")
    private String qrcode;
}
