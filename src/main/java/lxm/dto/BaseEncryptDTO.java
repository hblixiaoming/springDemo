package lxm.dto;

import lombok.Data;

@Data
public class BaseEncryptDTO {
    private String key;
    private String data;
    private String sign;
}
