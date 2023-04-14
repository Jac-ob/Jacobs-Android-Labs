package algonquin.cst2335.domp0017;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ChatMessage {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo( name = "id" )
    public int id;

    @ColumnInfo( name = "Message")
    protected String message;

    @ColumnInfo(name = "TimeSent")
    protected String timeSent;

    @ColumnInfo(name = "SendOrReceive")
    protected boolean isSentButton;

    //constructor
    public ChatMessage(){

    }

    public ChatMessage(String m, String t, boolean sent){
        message = m;
        timeSent = t;
        isSentButton = sent;
    }

    //getter methods
    public String getMessage(){
        return  message;
    }
    public void setMessage(String message){
        this.message =  message;
    }

    public String getTimeSent(){
        return timeSent;
    }
    public void setTimeSent(String timeSent){
        this.timeSent =  timeSent;
    }

    public boolean getIsSentButton(){
        return isSentButton;
    }
    public void setSentButton(boolean isSentButton){
        this.isSentButton =  isSentButton;
    }
}
