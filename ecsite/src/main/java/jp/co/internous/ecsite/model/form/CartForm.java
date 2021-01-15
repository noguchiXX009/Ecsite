package jp.co.internous.ecsite.model.form;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long userId;
	private List<Cart> cartList;
}
