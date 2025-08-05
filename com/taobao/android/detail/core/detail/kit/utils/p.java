package com.taobao.android.detail.core.detail.kit.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import java.util.HashMap;
import tb.emu;
import tb.eps;
import tb.kge;

/* loaded from: classes4.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-332979732);
        emu.a("com.taobao.android.detail.core.detail.kit.utils.DetailTrackUtil");
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        HashMap hashMap = new HashMap();
        if (context instanceof DetailCoreActivity) {
            DetailCoreActivity detailCoreActivity = (DetailCoreActivity) context;
            if (detailCoreActivity.y() != null && detailCoreActivity.y().t != null) {
                hashMap.put("itemId", detailCoreActivity.y().t.i());
            }
        }
        eps.a("Page_Detail", "Event_" + str, hashMap);
    }
}
