package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

@Embeddable
public class ReservationKey implements Serializable {
	private static final long serialVersionUID = 1L;
	private long salle;
	private long creneau;
	
	
	
	public ReservationKey() {
		super();
	}
	public ReservationKey(long salle, long creneau) {
		this.salle = salle;
		this.creneau = creneau;
	}

/*
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservationKey ReservationKey = (ReservationKey) o;
        return accountNumber.equals(accountId.accountNumber) &&
                accountType.equals(accountId.accountType);
    }
	@Override
    public int hashCode() {
        return Objects.hash(salle, creneau);
    }*/

}


