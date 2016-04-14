package com.shiva.upload;

import org.springframework.web.multipart.MultipartFile;

public class Fileupload {

	private MultipartFile file;

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
}
