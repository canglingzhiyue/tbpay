package com.taobao.message.message_open_api_adapter;

import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/taobao/message/message_open_api_adapter/Constants;", "", "()V", "DIM_API", "", "DIM_API_URL", "DIM_CHANNEL", "DIM_IDENTIFIER", "DIM_URL", "KEY_CHANNEL_TAG", "KEY_SUBSCRIBE_TAG", "MEA_TIME", "MONITOR_MODULE", "MONITOR_POINT_RATE", "Keys", "Modules", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class Constants {
    public static final String DIM_API = "api";
    public static final String DIM_API_URL = "url";
    public static final String DIM_CHANNEL = "channel";
    public static final String DIM_IDENTIFIER = "identifier";
    public static final String DIM_URL = "weexurl";
    public static final Constants INSTANCE;
    public static final String KEY_CHANNEL_TAG = "channel_tag";
    public static final String KEY_SUBSCRIBE_TAG = "subscribe_tag";
    public static final String MEA_TIME = "time";
    public static final String MONITOR_MODULE = "OpenAPI";
    public static final String MONITOR_POINT_RATE = "invokeRate";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/taobao/message/message_open_api_adapter/Constants$Keys;", "", "()V", "KEY_API", "", "KEY_CHANNEL", "KEY_PARAMS", "KEY_URL", "message_base_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class Keys {
        public static final Keys INSTANCE;
        public static final String KEY_API = "api";
        public static final String KEY_CHANNEL = "channel";
        public static final String KEY_PARAMS = "params";
        public static final String KEY_URL = "url";

        static {
            kge.a(-1918361296);
            INSTANCE = new Keys();
        }

        private Keys() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/taobao/message/message_open_api_adapter/Constants$Modules;", "", "()V", "API_ARIVER", "", "API_JSI", "API_MEGA", "API_UNI", "API_WEEX", "API_WINDVANE", "message_base_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class Modules {
        public static final String API_ARIVER = "openAPIAriver";
        public static final String API_JSI = "openAPIJSI";
        public static final String API_MEGA = "openAPIMega";
        public static final String API_UNI = "openAPIUni";
        public static final String API_WEEX = "openAPIWeex";
        public static final String API_WINDVANE = "openAPIWindVane";
        public static final Modules INSTANCE;

        static {
            kge.a(975542987);
            INSTANCE = new Modules();
        }

        private Modules() {
        }
    }

    static {
        kge.a(-515238904);
        INSTANCE = new Constants();
    }

    private Constants() {
    }
}
