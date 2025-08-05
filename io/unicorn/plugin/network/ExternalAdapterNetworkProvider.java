package io.unicorn.plugin.network;

import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public interface ExternalAdapterNetworkProvider {

    /* loaded from: classes9.dex */
    public static class Request {
        public static final int DEFAULT_TIMEOUT_MS = 3000;
        public String body;
        public String method;
        public Map<String, String> params;
        public int timeout = 3000;
        public String url;

        static {
            kge.a(1999274883);
        }
    }

    /* loaded from: classes9.dex */
    public interface RequestListener {
        void onRequestFinish(int i, byte[] bArr);
    }

    void sendRequest(Request request, RequestListener requestListener);
}
