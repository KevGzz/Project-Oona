package LogicaNegocio.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class EntidadBase {
        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        protected String id;

        protected LocalDateTime createdAt=LocalDateTime.now();

        protected LocalDateTime updatedAt;

        protected LocalDateTime deletedAt;
}
