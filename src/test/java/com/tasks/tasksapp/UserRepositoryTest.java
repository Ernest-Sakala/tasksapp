package com.tasks.tasksapp;

import com.tasks.tasksapp.model.UserModel;
import com.tasks.tasksapp.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserRepositoryTest {


    @Mock
    private UserRepository userRepository;


    @Test
    public void testUserCreation(){

        MockitoAnnotations.openMocks(this);

        // given
        UserModel userModel = new UserModel();
        userModel.setPassword("123");
        userModel.setUsername("Ernest");

        UserModel savedUser = new UserModel();
        savedUser.setId(1);
        savedUser.setPassword("123");
        savedUser.setUsername("Ernest");

        //  when
        // mock calls

        Mockito.when(userRepository.save(userModel)).thenReturn(savedUser);

        UserModel userModel1 = userRepository.save(userModel);



        // then

        assertEquals(1, userModel1.getId());


    }
}
