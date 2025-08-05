package com.ali.user.open.core.webview;

import android.text.TextUtils;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.service.UserTrackerService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.ut.mini.UTHitBuilders;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class UserTrackBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1436180861);
    }

    @BridgeMethod
    public void commitEvent(BridgeCallbackContext bridgeCallbackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b18108", new Object[]{this, bridgeCallbackContext, str});
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
            if (!TextUtils.isEmpty(optString3)) {
                hashMap.put(UTHitBuilders.a.FIELD_ARG2, optString3);
            }
            if (!TextUtils.isEmpty(optString4)) {
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
            if (AliMemberSDK.getService(UserTrackerService.class) == null) {
                return;
            }
            if (optInt == 19999) {
                ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send(optString, optString2, hashMap);
            } else if (optInt == 2101) {
                ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).sendControl(optString, optString2, optString3, hashMap);
            } else if (optInt != 2001) {
            } else {
                ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).updatePageName(bridgeCallbackContext.getActivity(), optString, hashMap);
            }
        } catch (Throwable unused2) {
        }
    }
}
