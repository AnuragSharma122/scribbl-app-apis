package com.anurag.scribbl.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDTO {
	private Integer id;
	private String name;
	private Integer score;
}
