package com.stratio.streaming.commons.messages;

import java.io.Serializable;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

import com.google.common.collect.Lists;

public class StratioStreamingMessage implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3259551728685320551L;
	private String operation;
	private String streamName;
	private String session_id;
	private String request_id;
	private String request;	
	private Long   timestamp;
	private List<ColumnNameTypeValue> columns;
	private List<StreamQuery> queries;
	private Boolean userDefined;
	


	public StratioStreamingMessage() {
		
	}


	/**
	 * Used in List Operation
	 * 
	 * @param streamName
	 * @param columns
	 */
	public StratioStreamingMessage(String streamName, List<ColumnNameTypeValue> columns, List<StreamQuery> queries) {
		this.streamName = streamName;
		this.columns = columns;
		this.queries = queries;
	}


	/**
	 * Used in events output
	 * 
	 * @param streamName
	 * @param timestamp
	 * @param columns
	 */
	public StratioStreamingMessage(String streamName, Long timestamp, List<ColumnNameTypeValue> columns) {
		this.streamName = streamName;
		this.timestamp = timestamp;
		this.columns = columns;
	}

	
	public void addColumn(ColumnNameTypeValue column) {
		if (columns == null) {
			columns = Lists.newArrayList();
		}
		this.columns.add(column);
	}
	
	public void addQuery(StreamQuery query) {	
		if (queries == null) {
			queries = Lists.newArrayList();
		}
		this.queries.add(query);
	}



	public String getRequest_id() {
		return request_id;
	}





	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}


	public Boolean getUserDefined() {
		return userDefined;
	}


	public void isUserDefined(Boolean userDefined) {
		this.userDefined = userDefined;
	}



	public String getOperation() {
		return operation;
	}


	public void setOperation(String operation) {
		this.operation = operation;
	}


	public String getStreamName() {
		return streamName;
	}


	public void setStreamName(String streamName) {
		this.streamName = streamName;
	}



	public String getSession_id() {
		return session_id;
	}


	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}


	public String getRequest() {
		return request;
	}


	public void setRequest(String request) {
		this.request = request;
	}


	public Long getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}





	public List<ColumnNameTypeValue> getColumns() {
		return columns;
	}

	public void setColumns(List<ColumnNameTypeValue> columns) {
		this.columns = columns;
	}


	public List<StreamQuery> getQueries() {
		return queries;
	}


	public void setQueries(List<StreamQuery> queries) {
		this.queries = queries;
	}
	
	
	
	
}
