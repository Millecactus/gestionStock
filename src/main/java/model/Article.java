package model;

import ch.qos.logback.core.net.SyslogOutputStream;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name="Article")
public class Article extends AbstractEntity{



}
