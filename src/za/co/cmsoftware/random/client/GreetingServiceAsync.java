package za.co.cmsoftware.random.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
    void generateNumber(String maximum, AsyncCallback<String> callback)
            throws IllegalArgumentException;
}
