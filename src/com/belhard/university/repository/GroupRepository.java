package com.belhard.university.repository;

import com.belhard.university.model.Group;

import java.util.ArrayList;
import java.util.List;

public class GroupRepository {
    private List<Group> groups = new ArrayList<>();

    public void addGroups(List<Group> newGroups) {
        groups.addAll(newGroups);
    }

    public void removeGroups(List<Group> removeGroups) {
        groups.remove(removeGroups);
    }

    public List<Group> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        return "GroupRepository{" +
                "groups=" + groups +
                '}';
    }
}
