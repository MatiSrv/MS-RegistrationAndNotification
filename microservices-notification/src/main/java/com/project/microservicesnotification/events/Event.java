<<<<<<< HEAD
package com.project.microservicesnotification.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public  class Event<T> {
    private String id;
    private Date date;
    private EventType type;
    private T data;
}
=======
package com.project.microservicesnotification.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public  class Event<T> {
    private String id;
    private Date date;
    private EventType type;
    private T data;
}
>>>>>>> 6dffb2f602151f3c012b6ca788e6b1fc3a806994
