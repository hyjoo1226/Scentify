package com.ssafy.scentify.user.model.entity;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserSecuInfo {
	@NotBlank 
    private String userId;
	@NotBlank 
    private String salt;
}