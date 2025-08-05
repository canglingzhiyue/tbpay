package com.taobao.taolive.room.controller2;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.sdk.utils.w;
import tb.ffu;
import tb.kge;
import tb.pla;

/* loaded from: classes8.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1848751114);
    }

    public static d a(Activity activity, String str, pla plaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("d6e60a35", new Object[]{activity, str, plaVar});
        }
        if (aa.ct()) {
            if (com.taobao.taolive.sdk.utils.b.d(activity)) {
                w.a(activity, "公域使用开放直播间");
            }
            return new ffu(activity, str, plaVar);
        }
        if (com.taobao.taolive.sdk.utils.b.d(activity)) {
            w.a(activity, "公域使用老直播间");
        }
        return new q(activity, str, plaVar);
    }

    public static d a(Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("806a603d", new Object[]{activity, intent});
        }
        if (aa.ct()) {
            if (com.taobao.taolive.sdk.utils.b.d(activity)) {
                w.a(activity, "公域使用开放直播间");
            }
            return new ffu(activity, intent);
        }
        if (com.taobao.taolive.sdk.utils.b.d(activity)) {
            w.a(activity, "公域使用老直播间");
        }
        return new q(activity, intent);
    }
}
