package algonquin.cst2335.domp0017;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;


import java.util.List;

// class for doing CRUD
@Dao
public interface ChatMessageDAO {

    @Insert
     long insertMessage(ChatMessage m);

    @Query("Select * from ChatMessage")
     List<ChatMessage> getAllMessages();

    @Delete
    void deleteMessage(ChatMessage m);

//    @Query("Delete From ChatMessage Where id = :id")
//    public void deleteChatMessageByID(int id);





}
