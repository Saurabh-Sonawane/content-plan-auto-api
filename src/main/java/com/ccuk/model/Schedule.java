package com.ccuk.model;

import com.ccuk.model.enums.LocationScheduleType;
import com.ccuk.model.enums.LocationType;
import com.ccuk.model.enums.ScheduleStatus;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Document(collection="schedule")
public class Schedule {

    private String id;
    private ObjectId contentPlanId;
    private TimeSchedule timeSchedule;
    private LocationScheduleType locationScheduleType;
    private Map<LocationType, List<Location>> selectedLocations;
    private List<String> creativeIds;
    private List<String> panelIds;
    private int priority;
    private ScheduleStatus status;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContentPlanId() {
        return contentPlanId.toString();
    }

    public void setContentPlanId(ObjectId contentPlanId) {
        this.contentPlanId = contentPlanId;
    }

    public TimeSchedule getTimeSchedule() {
        return timeSchedule;
    }

    public void setTimeSchedule(TimeSchedule timeSchedule) {
        this.timeSchedule = timeSchedule;
    }

    public Map<LocationType, List<Location>> getSelectedLocations() {
        return selectedLocations;
    }

    public void setSelectedLocations(Map<LocationType, List<Location>> selectedLocations) {
        this.selectedLocations = selectedLocations;
    }

    public List<String> getCreativeIds() {
        return creativeIds;
    }

    public void setCreativeIds(List<String> creativeIds) {
        this.creativeIds = creativeIds;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public LocationScheduleType getLocationScheduleType() {
        return locationScheduleType;
    }

    public void setLocationScheduleType(LocationScheduleType locationScheduleType) {
        this.locationScheduleType = locationScheduleType;
    }

    public List<String> getPanelIds() {
        return panelIds;
    }

    public void setPanelIds(List<String> panelIds) {
        this.panelIds = panelIds;
    }

    public ScheduleStatus getStatus() {
        return status;
    }

    public void setStatus(ScheduleStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id='" + id + '\'' +
                ", contentPlanId=" + contentPlanId +
                ", timeSchedule=" + timeSchedule +
                ", locationScheduleType=" + locationScheduleType +
                ", selectedLocations=" + selectedLocations +
                ", creativeIds=" + creativeIds +
                ", panelIds=" + panelIds +
                ", priority=" + priority +
                ", status=" + status +
                '}';
    }
}
