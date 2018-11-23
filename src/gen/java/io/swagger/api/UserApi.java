package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UserApiService;
import io.swagger.api.factories.UserApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

import javax.validation.constraints.*;


@Path("/user")


@io.swagger.annotations.Api(description = "the user API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T18:06:22.527Z[GMT]")

public class UserApi  {
   private final UserApiService delegate;

   public UserApi(@Context ServletConfig servletContext) {
      UserApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("UserApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (UserApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = UserApiServiceFactory.getUserApi();
      }

      this.delegate = delegate;
   }


    @POST
    @Path("/{userId}")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "add a new user in system", notes = "add a new user in system", response = Void.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "User created", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid User Input", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "User already exist", response = Void.class) })
    public Response adduser(@ApiParam(value = "User to store" ,required=true) UserItem body
,@ApiParam(value = "ID of user to return",required=true) @PathParam("userId") Long userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adduser(body,userId,securityContext);
    }

    @DELETE
    @Path("/{userId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes a user", notes = "", response = Void.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = Void.class) })
    public Response deleteUser(@ApiParam(value = "User id to delete",required=true) @PathParam("userId") Long userId
,@ApiParam(value = "" )@HeaderParam("api_key") String apiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteUser(userId,apiKey,securityContext);
    }

    @GET
    @Path("/{userId}/report")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "returns the registred reports for the user.", notes = "returns the registred reports for the user.", response = ReportItem.class, responseContainer = "List", tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ReportItem.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class) })
    public Response getAllReportsOfUser(@ApiParam(value = "ID of user to return",required=true) @PathParam("userId") Long userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllReportsOfUser(userId,securityContext);
    }

    @GET
    @Path("/{userId}/warning")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "returns the registred warnings for the user.", notes = "returns the registred warnings for the user.", response = WarningItem.class, responseContainer = "List", tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WarningItem.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class) })
    public Response getAllWarningsOfUser(@ApiParam(value = "ID of user to return",required=true) @PathParam("userId") Long userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllWarningsOfUser(userId,securityContext);
    }

    @GET
    @Path("/{userId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find user by ID", notes = "Returns user's info", response = UserItem.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = UserItem.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = Void.class) })
    public Response getUserById(@ApiParam(value = "ID of user to return",required=true) @PathParam("userId") Long userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserById(userId,securityContext);
    }

    @GET
    @Path("/{userId}/achievement")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "returns the registred achievements for the user.", notes = "returns the registred achievements for the user.", response = AchievementItem.class, responseContainer = "List", tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementItem.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class) })
    public Response getallachievementsofuser(@ApiParam(value = "ID of user to return",required=true) @PathParam("userId") Long userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getallachievementsofuser(userId,securityContext);
    }

    @GET
    @Path("/{userId}/destination")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "returns the registred destinations for the user.", notes = "returns the registred destinations for the user.", response = DestinationItem.class, responseContainer = "List", tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = DestinationItem.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class) })
    public Response getalldestinationsofuser(@ApiParam(value = "ID of user to return",required=true) @PathParam("userId") Long userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getalldestinationsofuser(userId,securityContext);
    }

    @GET
    @Path("/{userId}/memento")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "returns the registred mementos for the user.", notes = "returns the registred mementos for the user.", response = MementoItem.class, responseContainer = "List", tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MementoItem.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class) })
    public Response getallmementosofuser(@ApiParam(value = "ID of user to return",required=true) @PathParam("userId") Long userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getallmementosofuser(userId,securityContext);
    }

    @PUT
    @Path("/{userId}")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Update the user", notes = "", response = Void.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Validation exception", response = Void.class) })
    public Response updateUser(@ApiParam(value = "User object that needs to be added to the store" ,required=true) UserItem body
,@ApiParam(value = "ID of user to return",required=true) @PathParam("userId") Long userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateUser(body,userId,securityContext);
    }

}

