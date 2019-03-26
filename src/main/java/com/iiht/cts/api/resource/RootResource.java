/**
 * 
 */
package com.iiht.cts.api.resource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Task Manager Restful API Controller for Root Resource ['/'] to list down the links for starting point 
 * 
 * @author Mohamed Yusuff
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RootResource {

	/**
	 * <strong>Lists all Root Level Links [<tt>GET</tt>]</strong>
	 * 
	 * @return a starting point link with Response Status as 200 OK
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ResponseEntity<ResourceSupport> root() {
		ResourceSupport resourceSupport = new ResourceSupport();
		resourceSupport.add(linkTo(methodOn(RootResource.class).root()).withSelfRel());
		resourceSupport.add(linkTo(methodOn(TaskResource.class).getAllTasks()).withRel("tasks"));
		return ResponseEntity.ok(resourceSupport);
	}
}