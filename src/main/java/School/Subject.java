package School;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Subject {

    private String name;

    @Override
    public String toString() {
        return "\n" +
                name + "";}

}
