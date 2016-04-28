package cnu.lecture;

import lombok.Getter;
import lombok.Setter;


/**
 * Created by tchi on 2016. 4. 25..
 */
public class SummonerInfo {
    private String id;

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
