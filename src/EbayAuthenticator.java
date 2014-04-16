import java.net.URI;

class EbayAuthenticator {
    public EbayAuthenticator() {
    }

    /**
     * Fetches the URI to direct the user to for authentication.
     * Must be called before getAuthenticatedUser
     * @return the URI
     */
    public URI getAuthenticationURL() {
        // TODO: Make call to eBay to get url
        return null;
    }

    /**
     * Returns the ebay user authenticated at the URI retrieved
     * from previous call to getAuthenticationURL.
     * @return the authenticated user or null if the user did not authenticate
     */
    public EbayUser getAuthenticatedUser() {
        // TODO: Call out to eBay to get the token
        // for the user that just signed in
        return null;
    }
}
