package com.taobao.android.gateway.util;

import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static final String KEY_ACTION_NAME = "actionName";
    public static final String KEY_ACTION_PARAM = "actionParam";
    public static final String KEY_BIZ_PARAM = "bizParam";
    public static final String KEY_CALLBACK = "callback";
    public static final String KEY_CALLBACK_PARAM = "callbackParam";
    public static final String KEY_EVENT_PARAM = "eventParam";
    public static final String KEY_TARGET_COMPONENT = "targetComponent";
    public static final Map<String, Integer> kvStoreKeyDict;

    static {
        kge.a(27475590);
        kvStoreKeyDict = new HashMap<String, Integer>() { // from class: com.taobao.android.gateway.util.GatewayConstantKey$1
            {
                put("logTrackDegrade", 1);
            }
        };
    }
}
