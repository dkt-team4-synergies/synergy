package com.synergies.synergy.service;



import com.synergies.synergy.domain.dto.NotificationDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NotificationService {
    List<NotificationDto> notificationList();

    int notificationAdd(NotificationDto notification);

    int notificationModify(NotificationDto notification);

    int notificationRemove(int id);
}
