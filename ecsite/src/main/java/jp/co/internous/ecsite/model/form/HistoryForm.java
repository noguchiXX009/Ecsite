package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HistoryForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String userId;
}
