package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.AchievementItem;
import io.swagger.model.DestinationItem;
import io.swagger.model.MementoItem;
import io.swagger.model.ReportItem;
import io.swagger.model.UserItem;
import io.swagger.model.WarningItem;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T18:06:22.527Z[GMT]")

public abstract class UserApiService {
    
    public abstract Response adduser(UserItem body,Long userId,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response deleteUser(Long userId,String apiKey,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response getAllReportsOfUser(Long userId,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response getAllWarningsOfUser(Long userId,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response getUserById(Long userId,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response getallachievementsofuser(Long userId,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response getalldestinationsofuser(Long userId,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response getallmementosofuser(Long userId,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response updateUser(UserItem body,Long userId,SecurityContext securityContext) throws NotFoundException;
    
}

