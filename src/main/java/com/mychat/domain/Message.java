/**
 * 
 */
package com.mychat.domain;

public class Message {

	private Long messageId;
	private Long messageSender;
	private Long messageReciver;
	private String messageDate;
	private String messageInfo;
	private String messageType;
	private String messageRead;
	public String getMessageRead() {
		return messageRead;
	}
	public void setMessageRead(String messageRead) {
		this.messageRead = messageRead;
	}
	public Long getMessageId() {
		return messageId;
	}
	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}
	public Long getMessageSender() {
		return messageSender;
	}
	public void setMessageSender(Long messageSender) {
		this.messageSender = messageSender;
	}
	public Long getMessageReciver() {
		return messageReciver;
	}
	public void setMessageReciver(Long messageReciver) {
		this.messageReciver = messageReciver;
	}
	public String getMessageDate() {
		return messageDate;
	}
	public void setMessageDate(String messageDate) {
		this.messageDate = messageDate;
	}
	public String getMessageInfo() {
		return messageInfo;
	}
	public void setMessageInfo(String messageInfo) {
		this.messageInfo = messageInfo;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	
}
