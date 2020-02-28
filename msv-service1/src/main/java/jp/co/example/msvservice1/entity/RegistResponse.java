package jp.co.example.msvservice1.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * RegistResponseエンティティ.
 */
@Data
@NoArgsConstructor
public class RegistResponse {

    /** ステータス. */
    private String status;

    /** ID. */
    private int id;

    /** Name. */
    private String name;

}
