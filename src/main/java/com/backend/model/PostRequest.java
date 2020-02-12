package com.backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostRequest {
	public String authorName;
	public String noteBody;
	public String noteTitle;
	public String CreatedDate;
	public String lastEditedOn;
}
