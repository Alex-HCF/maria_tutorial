package com.example.maria.processor;

import lombok.experimental.UtilityClass;

@UtilityClass
public class UtilClass {

    public String getKey(Project project) {
        return project.getKey();

    }

    public String getKey(Issue issue) {
        return issue.getKey();
    }

    public String getKey(User user) {
        return user.getUsername();
    }
}
