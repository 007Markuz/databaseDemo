package com.database.demo.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "CONFIGURATION", schema = "PUBLIC")
public class ConfigurationEntity implements Serializable {

  private static final long serialVersionUID = -1531236782666935166L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_configuration")
  private Long idConfiguration;

  @Column(name = "\"group\"")
  private String group;

  @Column(name = "\"key\"")
  private String key;

  @Column(name = "value")
  private String value;

  @Column(name = "\"type\"")
  private String type;

  @Column(name = "description")
  private String description;

  @Column(name = "last_update")
  private LocalDateTime lastUpdate;

}