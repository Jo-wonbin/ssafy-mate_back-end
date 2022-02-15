package com.ssafy.ssafymate.dto.RequestMessageDto;

import com.ssafy.ssafymate.entity.RequestMessage;
import com.ssafy.ssafymate.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Getter
@Setter
public class RequestUserMessageDto {
    Long requestId;
    Long userId;
    String profileImgUrl;
    String userName;
    String job1;
    String requestStatus;
    String message;
    LocalDateTime createdTime;

    public static RequestUserMessageDto of(RequestMessage requestMessages,String type) {
        RequestUserMessageDto res = new RequestUserMessageDto();
        User user;
        if(type.equals("receiver"))
            user = requestMessages.getSender();
        else{
            user = requestMessages.getReceiver();
        }
        res.setRequestId(requestMessages.getId());
        res.setUserId(user.getId());
        res.setProfileImgUrl(user.getProfileImg());
        res.setUserName(user.getStudentName());
        res.setJob1(user.getJob1());
        res.setRequestStatus(requestMessages.getRequestStatus());
        res.setMessage(requestMessages.getMessage());
        res.setCreatedTime(requestMessages.getCreatedDateTime().atZone(ZoneId.of("Asia/Seoul")).toLocalDateTime());
        return res;
    }
}
