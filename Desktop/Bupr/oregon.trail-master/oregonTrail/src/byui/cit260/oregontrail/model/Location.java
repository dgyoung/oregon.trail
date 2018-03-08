/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import byui.cit260.oregontrail.control.GameControl;
/**
 *
 * @author allie
 */
public class Location implements Serializable{
    
    private String label; /**name of current location on map*/
    private int next;  /**distance to next location on map*/
    private int position; /**distance from start*/
    private int end; /**distance to final location on map*/
    private String weather;
    private Calendar calendar;
    
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
    
    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(String month) {
        this.calendar = calendar;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.label);
        hash = 67 * hash + this.next;
        hash = 67 * hash + this.position;
        hash = 67 * hash + this.end;
        hash = 67 * hash + Objects.hashCode(this.weather);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "label=" + label + ", next=" + next + ", position=" + position + ", end=" + end + ", weather=" + weather + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.next != other.next) {
            return false;
        }
        if (this.position != other.position) {
            return false;
        }
        if (this.end != other.end) {
            return false;
        }
        if (!Objects.equals(this.label, other.label)) {
            return false;
        }
        if (!Objects.equals(this.weather, other.weather)) {
            return false;
        }
        return true;
    }

}
