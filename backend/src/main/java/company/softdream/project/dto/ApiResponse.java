package company.softdream.project.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ApiResponse<T> {
    private String status;
    private String message;
    private T data;
    private Object error;
}
