package com.belhard.university.service;

import com.belhard.university.model.Group;
import com.belhard.university.repository.GroupRepository;

import java.util.List;
import java.util.Scanner;

public class GroupService {
    private GroupRepository groupRepository;
    Group group;

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public void removeGroups (List<Group> removeGroups) {
        removeGroups.forEach(gr -> System.out.println(gr));
        groupRepository.removeGroups(removeGroups);
    }

    public void addGroups (List<Group> newGroups) {
        newGroups.forEach(gr -> System.out.println(gr));
        groupRepository.addGroups(newGroups);
    }

    public  void  SetNumberOfGroup (Group group) {
        Scanner scanner = new Scanner(System.in);
        group.setNumberOfGroup(scanner.nextInt());
    }
    @Override
    public String toString() {
        return "GroupService{" +
                "groupRepository=" + groupRepository +
                '}';
    }
//ДОБАВИТЬ МЕТОД ИЗМЕНЕНИЕ ИМЕНИ ГРУППЫ
    //СОЗДАТЬ два сервиса и репозитория, метод вычисления зп сюда
}
