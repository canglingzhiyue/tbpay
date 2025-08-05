package com.ali.user.open.ucc.util;

import android.text.TextUtils;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.service.UserTrackerService;
import com.ali.user.open.ucc.model.UccParams;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTHitBuilders;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class UTHitUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1157088016);
    }

    public static void send(String str, String str2, UccParams uccParams, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be87c542", new Object[]{str, str2, uccParams, map});
            return;
        }
        HashMap hashMap = new HashMap();
        if (uccParams == null || TextUtils.isEmpty(uccParams.site)) {
            hashMap.put("site", AliMemberSDK.getMasterSite());
        } else {
            hashMap.put("site", uccParams.site);
        }
        if (uccParams != null) {
            hashMap.put("bindSite", uccParams.bindSite);
            hashMap.put("userToken", uccParams.userToken);
            if (!TextUtils.isEmpty(uccParams.miniAppId)) {
                hashMap.put("miniAppId", uccParams.miniAppId);
            }
            hashMap.put(UTHitBuilders.a.FIELD_ARG2, uccParams.traceId);
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send(str, str2, hashMap);
    }
}
