package com.ali.user.open.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.service.UserTrackerService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.ut.mini.UTHitBuilders;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class UserTrackBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(UserTrackBridge userTrackBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("commitEvent".equals(str)) {
            commitEvent(str2, wVCallBackContext);
            return true;
        }
        wVCallBackContext.error();
        return false;
    }

    private void commitEvent(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe362731", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("page");
            int optInt = jSONObject.optInt(PopConst.POP_EVENT_ID_KEY);
            String optString2 = jSONObject.optString("arg1");
            String optString3 = jSONObject.optString("arg2");
            String optString4 = jSONObject.optString("args");
            HashMap hashMap = new HashMap();
            if (!StringUtils.isEmpty(optString3)) {
                hashMap.put(UTHitBuilders.a.FIELD_ARG2, optString3);
            }
            if (!StringUtils.isEmpty(optString4)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(optString4);
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject2.optString(next));
                    }
                } catch (Throwable unused) {
                }
            }
            if (optInt == 19999) {
                ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send(optString, optString2, hashMap);
            } else if (optInt != 2101) {
            } else {
                ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).sendControl(optString, optString2, optString3, hashMap);
            }
        } catch (Throwable unused2) {
        }
    }
}
