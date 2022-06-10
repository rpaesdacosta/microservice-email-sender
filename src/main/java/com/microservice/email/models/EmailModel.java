package com.microservice.email.models;

import com.microservice.email.enums.StatusEmail;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;
@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;

    @Column(nullable = false, length = 100)
    private String ownerRef;

    @Column(nullable = false, length = 100)
    private String emailFrom;

    @Column(nullable = false, length = 100)
    private String emailTo;

    @Column(nullable = false, length = 100)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String text;

    @Column(nullable = true, columnDefinition = "TEXT")
    private String error;

    private LocalDateTime sendDate;

    private StatusEmail statusEmail;
}
