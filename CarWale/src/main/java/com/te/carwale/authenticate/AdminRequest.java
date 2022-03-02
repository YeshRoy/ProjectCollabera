package com.te.carwale.authenticate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AdminRequest {
	private String userName;
	private String password;
}
