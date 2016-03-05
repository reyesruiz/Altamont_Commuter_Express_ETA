package com.digitalruiz.altamontcommuterexpresseta;

import com.loopj.android.http.*;


/**
 * Created by reyes on 3/4/16.
 */

public class AsyncHttpClient {

    private static final String BASE_URL = "yahoo.com";

    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.post(getAbsoluteUrl(url), params, responseHandler);
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }
}
