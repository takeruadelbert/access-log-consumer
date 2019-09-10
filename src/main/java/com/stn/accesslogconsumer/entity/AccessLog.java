package com.stn.accesslogconsumer.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.stn.accesslogconsumer.entity.enumerate.RequestMethod;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class,property="@id", scope = AccessLog.class)
public class AccessLog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ip_address")
    @JsonProperty("IpAddress")
    private String IPAddress;

    @JsonProperty("URI")
    private String URI;

    @Enumerated(EnumType.STRING)
    @JsonProperty("requestMethod")
    private RequestMethod requestMethod;

    @Column(name = "request_body", length = 9999)
    @JsonProperty("requestBody")
    private String requestBody;

    @CreatedDate
    @CreationTimestamp
    @JsonIgnore
    private Date createdDate;

    @Column(name = "user_id")
    @JsonProperty("userId")
    private Long userId;

    @Column(name = "asset_file_id")
    @JsonProperty("assetFileId")
    private Long assetFileId;
}
