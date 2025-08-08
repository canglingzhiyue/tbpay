package com.xiaomi.push;

import mtopsdk.common.util.StringUtils;
import com.xiaomi.mipush.sdk.MiPushClient;

/* loaded from: classes9.dex */
public enum fn {
    COMMAND_REGISTER("register"),
    COMMAND_UNREGISTER(MiPushClient.COMMAND_UNREGISTER),
    COMMAND_SET_ALIAS(MiPushClient.COMMAND_SET_ALIAS),
    COMMAND_UNSET_ALIAS(MiPushClient.COMMAND_UNSET_ALIAS),
    COMMAND_SET_ACCOUNT(MiPushClient.COMMAND_SET_ACCOUNT),
    COMMAND_UNSET_ACCOUNT(MiPushClient.COMMAND_UNSET_ACCOUNT),
    COMMAND_SUBSCRIBE_TOPIC(MiPushClient.COMMAND_SUBSCRIBE_TOPIC),
    COMMAND_UNSUBSCRIBE_TOPIC(MiPushClient.COMMAND_UNSUBSCRIBE_TOPIC),
    COMMAND_SET_ACCEPT_TIME(MiPushClient.COMMAND_SET_ACCEPT_TIME),
    COMMAND_CHK_VDEVID("check-vdeviceid");
    

    /* renamed from: a  reason: collision with other field name */
    public final String f362a;

    fn(String str) {
        this.f362a = str;
    }

    public static int a(String str) {
        fn[] values;
        int i = -1;
        if (StringUtils.isEmpty(str)) {
            return -1;
        }
        for (fn fnVar : values()) {
            if (fnVar.f362a.equals(str)) {
                i = fc.a(fnVar);
            }
        }
        return i;
    }
}
