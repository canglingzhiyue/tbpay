package com.taobao.themis.pub_kit.foot;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.pub_kit.foot.AddFootClient;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-281263149);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            new AddFootClient(new AddFootClient.AddFootprintParam(str), null).a();
        }
    }
}
