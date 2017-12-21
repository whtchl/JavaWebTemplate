
package ky.entity;
import java.util.Date; 

/**
* ********************************************************
* @ClassName: PmsDictionary
* @Description: ???
* @author 用wzl写的自动生成
* @date 2015-06-03 上午 11:56:01 
*******************************************************
*/
public class PmsDictionary{

	private Integer id;		//??
	private String description;		//字典描述
	private String value;		//字典值 
	private String type;		//字典类型
	private String key;		//字典KEY
	private String disValue;	//字典显示值 
	
	private String canupdate;//可不可修改
	
	public String getCanupdate() {
		return canupdate;
	}

	public void setCanupdate(String canupdate) {
		this.canupdate = canupdate;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getDisValue() {
		return disValue;
	}

	public void setDisValue(String disValue) {
		this.disValue = disValue;
	}

}

