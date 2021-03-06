/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.2-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.util.List;
import org.openapitools.model.User;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Validated
@Api(value = "user", description = "the user API")
public interface UserApi {

    @ApiOperation(value = "Create user", nickname = "createUser", notes = "This can only be done by the logged in user.", tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/user",
        method = RequestMethod.POST)
    default ResponseEntity<Mono<Void>> createUser(@ApiParam(value = "Created user object" ,required=true )  @Valid @RequestBody Mono<User> user, ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(user.then(result));

    }


    @ApiOperation(value = "Creates list of users with given input array", nickname = "createUsersWithArrayInput", notes = "", tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/user/createWithArray",
        method = RequestMethod.POST)
    default ResponseEntity<Mono<Void>> createUsersWithArrayInput(@ApiParam(value = "List of user object" ,required=true )  @Valid @RequestBody Flux<List> user, ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(user.then(result));

    }


    @ApiOperation(value = "Creates list of users with given input array", nickname = "createUsersWithListInput", notes = "", tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/user/createWithList",
        method = RequestMethod.POST)
    default ResponseEntity<Mono<Void>> createUsersWithListInput(@ApiParam(value = "List of user object" ,required=true )  @Valid @RequestBody Flux<List> user, ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(user.then(result));

    }


    @ApiOperation(value = "Delete user", nickname = "deleteUser", notes = "This can only be done by the logged in user.", tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{username}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Mono<Void>> deleteUser(@ApiParam(value = "The name that needs to be deleted",required=true) @PathVariable("username") String username, ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(result);

    }


    @ApiOperation(value = "Get user by user name", nickname = "getUserByName", notes = "", response = User.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{username}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Mono<User>> getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing.",required=true) @PathVariable("username") String username, ServerWebExchange exchange) {
        Mono<User> result = Mono.empty();
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                result = ApiUtil.getExampleResponse(exchange, "{  \"firstName\" : \"firstName\",  \"lastName\" : \"lastName\",  \"password\" : \"password\",  \"userStatus\" : 6,  \"phone\" : \"phone\",  \"id\" : 0,  \"email\" : \"email\",  \"username\" : \"username\"}")
                        .then(Mono.empty());
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                result = ApiUtil.getExampleResponse(exchange, "<User>  <id>123456789</id>  <username>aeiou</username>  <firstName>aeiou</firstName>  <lastName>aeiou</lastName>  <email>aeiou</email>  <password>aeiou</password>  <phone>aeiou</phone>  <userStatus>123</userStatus></User>")
                        .then(Mono.empty());
                break;
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(result);

    }


    @ApiOperation(value = "Logs user into the system", nickname = "loginUser", notes = "", response = String.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class),
        @ApiResponse(code = 400, message = "Invalid username/password supplied") })
    @RequestMapping(value = "/user/login",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Mono<String>> loginUser(@NotNull @ApiParam(value = "The user name for login", required = true) @Valid @RequestParam(value = "username", required = true) String username,@NotNull @ApiParam(value = "The password for login in clear text", required = true) @Valid @RequestParam(value = "password", required = true) String password, ServerWebExchange exchange) {
        Mono<String> result = Mono.empty();
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(result);

    }


    @ApiOperation(value = "Logs out current logged in user session", nickname = "logoutUser", notes = "", tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/user/logout",
        method = RequestMethod.GET)
    default ResponseEntity<Mono<Void>> logoutUser(ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(result);

    }


    @ApiOperation(value = "Updated user", nickname = "updateUser", notes = "This can only be done by the logged in user.", tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid user supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{username}",
        method = RequestMethod.PUT)
    default ResponseEntity<Mono<Void>> updateUser(@ApiParam(value = "name that need to be deleted",required=true) @PathVariable("username") String username,@ApiParam(value = "Updated user object" ,required=true )  @Valid @RequestBody Mono<User> user, ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(user.then(result));

    }

}
