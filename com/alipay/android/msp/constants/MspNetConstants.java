package com.alipay.android.msp.constants;

/* loaded from: classes3.dex */
public final class MspNetConstants {
    public static final String NET_SHUTDOWN_TIP = "NetworkShutdown";

    /* loaded from: classes3.dex */
    public final class Request {
        public static final String DEFAULT_CONTENT_TYPE = "application/octet-stream;binary/octet-stream";
        public static final String MSP_PARAM = "Msp-Param";
        public static final String NEW_CLIENT_KEY = "new_client_key";

        public Request() {
        }
    }

    /* loaded from: classes3.dex */
    public final class Response {
        public static final int CODE_ERROR = 503;
        public static final int CODE_GET_RSA_KEY = 1000;
        public static final int CODE_SUCCESS = 0;

        public Response() {
        }
    }
}
