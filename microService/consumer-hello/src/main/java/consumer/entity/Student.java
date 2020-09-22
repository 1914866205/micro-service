package consumer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName Student.java
 * @Description TODO
 * @createTime 2020年09月13日 16:09:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer age;
    private String name;
}
