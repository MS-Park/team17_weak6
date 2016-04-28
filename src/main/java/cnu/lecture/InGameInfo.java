package cnu.lecture;

import lombok.Getter;
import lombok.Setter;

public class InGameInfo {
    public static class Observer {
        private String encryptionKey;

		public String getEncryptionKey() {
			return encryptionKey;
		}

		public void setEncryptionKey(String encryptionKey) {
			this.encryptionKey = encryptionKey;
		}
    }

    public static class Participant {
        private String summonerName;

		public String getSummonerName() {
			return summonerName;
		}

		public void setSummonerName(String summonerName) {
			this.summonerName = summonerName;
		}
    }
    
    private String platformId;
    private Observer observers;
    private Participant[] participants;

    public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public Observer getObservers() {
		return observers;
	}

	public void setObservers(Observer observers) {
		this.observers = observers;
	}

	public Participant[] getParticipants() {
		return participants;
	}

	public void setParticipants(Participant[] participants) {
		this.participants = participants;
	}
}
