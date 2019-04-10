/**
 * 
 */
package com.iiht.cts.api.resource;

/**
 * Task Manager Restful API Controller for Root Resource ['/'] to list down the links for starting point 
 * 
 * @author Mohamed Yusuff
 */
/*@RestController*/
public class RootResource {

	/**
	 * <strong>Lists all Root Level Links [<tt>GET</tt>]</strong>
	 * 
	 * @return a starting point link with Response Status as 200 OK
	 */
	/*@RequestMapping(value="/", method=RequestMethod.GET)
	public ResponseEntity<ResourceSupport> root() {
		ResourceSupport resourceSupport = new ResourceSupport();
		resourceSupport.add(linkTo(methodOn(RootResource.class).root()).withSelfRel());
		resourceSupport.add(linkTo(methodOn(TaskResource.class).getAllTasks()).withRel("tasks"));
		return ResponseEntity.ok(resourceSupport);
	}*/
}