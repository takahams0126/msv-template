package jp.co.example.msvservice1.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * RegistRequestエンティティ.
 */
@Data
@NoArgsConstructor
public class RegistRequest {

    /** ID. */
    private int id;
    /** Name. */
    private String name;

}
