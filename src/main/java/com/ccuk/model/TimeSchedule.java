package com.ccuk.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.ccuk.constants.ApplicationConstant;
import com.ccuk.model.enums.DateTimeScheduleType;
import com.fasterxml.jackson.annotation.JsonFormat;

public class TimeSchedule {

	private DateTimeScheduleType dateRangeType;
	private DateTimeScheduleType daysOfWeekType;
	private DateTimeScheduleType timeRangeType;

	@JsonFormat(pattern = ApplicationConstant.DATE_FORMAT)
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate startDate;

	@JsonFormat(pattern = ApplicationConstant.DATE_FORMAT)
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate endDate;

	private List<String> daysOfWeekList;

	@JsonFormat(pattern = ApplicationConstant.TIME_FORMAT)
	@DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
	private LocalTime startTime;

	@JsonFormat(pattern = ApplicationConstant.TIME_FORMAT)
	@DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
	private LocalTime endTime;

	public DateTimeScheduleType getDateRangeType() {
		return dateRangeType;
	}

	public void setDateRangeType(DateTimeScheduleType dateRangeType) {
		this.dateRangeType = dateRangeType;
	}

	public DateTimeScheduleType getDaysOfWeekType() {
		return daysOfWeekType;
	}

	public void setDaysOfWeekType(DateTimeScheduleType daysOfWeekType) {
		this.daysOfWeekType = daysOfWeekType;
	}

	public DateTimeScheduleType getTimeRangeType() {
		return timeRangeType;
	}

	public void setTimeRangeType(DateTimeScheduleType timeRangeType) {
		this.timeRangeType = timeRangeType;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public List<String> getDaysOfWeekList() {
		return daysOfWeekList;
	}

	public void setDaysOfWeekList(List<String> daysOfWeekList) {
		this.daysOfWeekList = daysOfWeekList;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		TimeSchedule that = (TimeSchedule) o;

		if (dateRangeType != that.dateRangeType)
			return false;
		if (daysOfWeekType != that.daysOfWeekType)
			return false;
		if (timeRangeType != that.timeRangeType)
			return false;
		if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null)
			return false;
		if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null)
			return false;
		if (daysOfWeekList != null ? !daysOfWeekList.equals(that.daysOfWeekList) : that.daysOfWeekList != null)
			return false;
		if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null)
			return false;
		return endTime != null ? endTime.equals(that.endTime) : that.endTime == null;
	}

	@Override
	public int hashCode() {
		int result = dateRangeType != null ? dateRangeType.hashCode() : 0;
		result = 31 * result + (daysOfWeekType != null ? daysOfWeekType.hashCode() : 0);
		result = 31 * result + (timeRangeType != null ? timeRangeType.hashCode() : 0);
		result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
		result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
		result = 31 * result + (daysOfWeekList != null ? daysOfWeekList.hashCode() : 0);
		result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
		result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "TimeSchedule{" + "dateRangeType=" + dateRangeType + ", daysOfWeekType=" + daysOfWeekType
				+ ", timeRangeType=" + timeRangeType + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", daysOfWeekList=" + daysOfWeekList + ", startTime='" + startTime + '\'' + ", endTime='" + endTime
				+ '\'' + '}';
	}
}
