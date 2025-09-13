package dev.raksmey.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiRespond<P>{
    int code;
    String message;
    P data;
    String requestId;
}
