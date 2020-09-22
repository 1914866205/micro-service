package soft1851.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName StudentCourse.java
 * @Description TODO
 * @createTime 2020年09月16日 16:04:00
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int studentId;

    @Column
    private int courseId;
}
