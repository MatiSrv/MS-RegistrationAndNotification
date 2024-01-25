package com.project.microservicesnotification.events;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserRegisteredEvent extends Event<String> {
}
