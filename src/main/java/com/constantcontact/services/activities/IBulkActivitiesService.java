package com.constantcontact.services.activities;

import java.util.List;

import com.constantcontact.components.activities.contacts.request.AddContactsRequest;
import com.constantcontact.components.activities.contacts.request.ClearListsRequest;
import com.constantcontact.components.activities.contacts.request.ExportContactsRequest;
import com.constantcontact.components.activities.contacts.request.RemoveContactsRequest;
import com.constantcontact.components.activities.contacts.response.ContactsResponse;
import com.constantcontact.components.activities.contacts.response.DetailedStatusReport;
import com.constantcontact.components.activities.contacts.response.SummaryReport;
import com.constantcontact.components.activities.contacts.types.BulkActivityStatus;
import com.constantcontact.components.activities.contacts.types.BulkActivityType;
import com.constantcontact.exceptions.service.ConstantContactServiceException;
import com.constantcontact.services.base.IBaseService;
import com.constantcontact.util.http.MultipartBody;

/**
 * Interface for the {@link BulkActivitiesService} in Constant Contact.
 * 
 * @author ConstantContact
 * 
 */
public interface IBulkActivitiesService extends IBaseService {

	/**
	 * Implements the bulk add Contacts operation by calling the ConstantContact server side.
	 * 
	 * @param request The request
	 * @return A response containing the values returned from the server for the requested operation on success; <br/>
	 *         An exception is thrown otherwise.
	 * @throws ConstantContactServiceException When something went wrong in the Constant Contact flow or an error is returned from server.
	 */
	public ContactsResponse addContacts(AddContactsRequest request) throws ConstantContactServiceException;

	/**
     * Implements the bulk add Contacts operation by calling the ConstantContact server side.
     * 
     * @param multiPartRequest The request
     * @return A response containing the values returned from the server for the requested operation on success; <br/>
     *         An exception is thrown otherwise.
     * @throws ConstantContactServiceException When something went wrong in the Constant Contact flow or an error is returned from server.
     */
    public ContactsResponse addContacts(MultipartBody multiPartRequest) throws ConstantContactServiceException;
	
	/**
	 * Implements the bulk remove Contacts From Lists operation by calling the ConstantContact server side.
	 * 
	 * @param request The request
	 * @return A response containing the values returned from the server for the requested operation on success; <br/>
	 *         An exception is thrown otherwise.
	 * @throws ConstantContactServiceException When something went wrong in the Constant Contact flow or an error is returned from server.
	 */
	public ContactsResponse removeContactsFromLists(RemoveContactsRequest request) throws ConstantContactServiceException;

    /**
     * Implements the bulk remove Contacts From Lists operation by calling the ConstantContact server side.
     * 
     * @param multiPartRequest The request
     * @return A response containing the values returned from the server for the requested operation on success; <br/>
     *         An exception is thrown otherwise.
     * @throws ConstantContactServiceException When something went wrong in the Constant Contact flow or an error is returned from server.
     */
    public ContactsResponse removeContactsFromLists(MultipartBody multiPartRequest) throws ConstantContactServiceException;	
	
	/**
	 * Implements the bulk clear Lists operation by calling the ConstantContact server side.
	 * 
	 * @param request The request
	 * @return A response containing the values returned from the server for the requested operation on success; <br/>
	 *         An exception is thrown otherwise.
	 * @throws ConstantContactServiceException When something went wrong in the Constant Contact flow or an error is returned from server.
	 */
	public ContactsResponse clearLists(ClearListsRequest request) throws ConstantContactServiceException;

	/**
	 * Implements the bulk export Contacts operation by calling the ConstantContact server side.
	 * 
	 * @param request The request
	 * @return A response containing the values returned from the server for the requested operation on success; <br/>
	 *         An exception is thrown otherwise.
	 * @throws ConstantContactServiceException When something went wrong in the Constant Contact flow or an error is returned from server.
	 */
	public ContactsResponse exportContacts(ExportContactsRequest request) throws ConstantContactServiceException;

	/**
	 * Implements the bulk get Summary Report operation by calling the ConstantContact server side.
<<<<<<< HEAD
	 *
	 * @param accessToken Constant Contact OAuth2 access token.\
	 * @param status The status, as seen in {@link BulkActivityStatus}
	 * @param type The type, as seen in {@link BulkActivityType}
=======
	 * 
>>>>>>> 148a2af3efc1ccdc3b6e30fe3cf343c22cd07b9c
	 * @return A response containing the values returned from the server for the requested operation on success; <br/>
	 *         An exception is thrown otherwise.
	 * @throws ConstantContactServiceException When something went wrong in the Constant Contact flow or an error is returned from server.
	 */
<<<<<<< HEAD
	public List<SummaryReport> getSummaryReport(String accessToken, String status, String type) throws ConstantContactServiceException;

	/**
	 * Implements the bulk get Detailed Status Report operation by calling the ConstantContact server side.
	 *
	 * @param accessToken Constant Contact OAuth2 access token.
=======
	public List<SummaryReport> getSummaryReport() throws ConstantContactServiceException;

	/**
	 * Implements the bulk get Detailed Status Report operation by calling the ConstantContact server side.
	 * 
	 * @param status The status, as seen in {@link BulkActivityStatus}
	 * @param type The type, as seen in {@link BulkActivityType}
>>>>>>> 148a2af3efc1ccdc3b6e30fe3cf343c22cd07b9c
	 * @param id The id
	 * @return A response containing the values returned from the server for the requested operation on success; <br/>
	 *         An exception is thrown otherwise.
	 * @throws ConstantContactServiceException When something went wrong in the Constant Contact flow or an error is returned from server.
	 */
<<<<<<< HEAD
	public DetailedStatusReport getDetailedStatusReport(String accessToken, String id) throws ConstantContactServiceException;
=======
	public List<DetailedStatusReport> getDetailedStatusReport(String status, String type, String id) throws ConstantContactServiceException;
>>>>>>> 148a2af3efc1ccdc3b6e30fe3cf343c22cd07b9c
}
