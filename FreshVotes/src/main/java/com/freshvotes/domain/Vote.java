package com.freshvotes.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Vote {

	// Obj that contains the foreign keys
	private VoteId pk;
	private Boolean upvote;

	@EmbeddedId
	public VoteId getPk() {
		return pk;
	}

	public void setPk(VoteId pk) {
		this.pk = pk;
	}

	public Boolean getUpvote() {
		return upvote;
	}

	public void setUpvote(Boolean upvote) {
		this.upvote = upvote;
	}
}
