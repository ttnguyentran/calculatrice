package calculatrice.utils;

public enum ExceptionEnum {
	DIVISION_BY_ZERO(1, "division by zero not authorized"),
	UNKNOWN_OPERATION(2,"operation not implemented yet"),
	METHOD_NOT_IMPLEMENTED(3, "method not implemented yet"),
	OPERAND_IS_NOT_AN_INTEGER(4,"operand should be an integer"),
	INPUT_MISMATCH(5,"input mismatch"),
	SERVER_ERROR(6, "an error has occured on server side"), 
	CLIENT_ERROR(7, "an error has occured on client side");
	
	private final int code;
	public int getCode() {
		return code;
	}
	public String getDefaultMessage() {
		return defaultMessage;
	}
	private final String defaultMessage;
	ExceptionEnum(int code, String defaultMessage){
		this.code=code;
		this.defaultMessage=defaultMessage;
	}
	public static String getNameFromCode(int code) {
		
		for(ExceptionEnum e: ExceptionEnum.values()) {
			if(code==e.code) return e.name();
		}
		return null;
		
	}
}
