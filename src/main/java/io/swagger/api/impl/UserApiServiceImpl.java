package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.AchievementItem;
import io.swagger.model.DestinationItem;
import io.swagger.model.MementoItem;
import io.swagger.model.ReportItem;
import io.swagger.model.UserItem;
import io.swagger.model.WarningItem;


import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T18:06:22.527Z[GMT]")

public class UserApiServiceImpl extends UserApiService {
    
    List<UserItem> list_users = new ArrayList<UserItem>();
    
    @Override
    public Response adduser(UserItem body, Long userId, SecurityContext securityContext) throws NotFoundException {
        UserItem user_item = new UserItem();
        user_item.setBirthday(body.getBirthday());
        user_item.setName(body.getName());
        user_item.setIdUser(body.getIdUser());
        user_item.setDestinations(body.getDestinations());
        user_item.setMementos(body.getMementos());
        user_item.setAchievements(body.getAchievements());
        user_item.setWarnings(body.getWarnings());
        user_item.setReports(body.getReports());
        list_users.add(user_item);
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "user added!")).build();
    }
    
    @Override
    public Response deleteUser(Long userId, String apiKey, SecurityContext securityContext) throws NotFoundException {
        for(int index=0;index<list_users.size();index++){
            if(list_users.get(index).getIdUser().equals(userId)){
                list_users.remove(index);
                return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "user deleted!")).build();
            }
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "user not found!")).build();
    }
    
    @Override
    public Response getAllReportsOfUser(Long userId, SecurityContext securityContext) throws NotFoundException {
        for(int index=0;index<list_users.size();index++){
            if(list_users.get(index).getIdUser().equals(userId)){
                return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, list_users.get(index).getReports().toString())).build();
            }
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "user not found!")).build();
    }
    
    @Override
    public Response getAllWarningsOfUser(Long userId, SecurityContext securityContext) throws NotFoundException {
        for(int index=0;index<list_users.size();index++){
            if(list_users.get(index).getIdUser().equals(userId)){
                return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, list_users.get(index).getWarnings().toString())).build();
            }
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "user not found!")).build();
    }
    
    @Override
    public Response getUserById(Long userId, SecurityContext securityContext) throws NotFoundException {
        for(int index=0;index<list_users.size();index++){
            if(list_users.get(index).getIdUser().equals(userId)){
                return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, list_users.get(index).getName())).build();
            }
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "user not found!")).build();
    }
    
    @Override
    public Response getallachievementsofuser(Long userId, SecurityContext securityContext) throws NotFoundException {
        for(int index=0;index<list_users.size();index++){
            if(list_users.get(index).getIdUser().equals(userId)){
                return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, list_users.get(index).getAchievements().toString())).build();
            }
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "user not found!")).build();
    }
    
    @Override
    public Response getalldestinationsofuser(Long userId, SecurityContext securityContext) throws NotFoundException {
        for(int index=0;index<list_users.size();index++){
            if(list_users.get(index).getIdUser().equals(userId)){
                return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, list_users.get(index).getDestinations().toString())).build();
            }
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "user not found!")).build();
    }
    
    @Override
    public Response getallmementosofuser(Long userId, SecurityContext securityContext) throws NotFoundException {
        for(int index=0;index<list_users.size();index++){
            if(list_users.get(index).getIdUser().equals(userId)){
                return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, list_users.get(index).getMementos().toString())).build();
            }
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "user not found!")).build();
    }
    
    @Override
    public Response updateUser(UserItem body, Long userId, SecurityContext securityContext) throws NotFoundException {
        for(int index=0;index<list_users.size();index++){
            if(list_users.get(index).getIdUser().equals(body.getIdUser())){
                list_users.get(index).setBirthday(body.getBirthday());
                list_users.get(index).setName(body.getName());
                list_users.get(index).setIdUser(body.getIdUser());
                list_users.get(index).setDestinations(body.getDestinations());
                list_users.get(index).setMementos(body.getMementos());
                list_users.get(index).setAchievements(body.getAchievements());
                list_users.get(index).setWarnings(body.getWarnings());
                list_users.get(index).setReports(body.getReports());
                return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "User updated!")).build();
            }
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "user not found!")).build();
    }
    
}

