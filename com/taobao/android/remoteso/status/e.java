package com.taobao.android.remoteso.status;

import com.android.alibaba.ip.runtime.IpChange;
import tb.ijd;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static c a(ijd ijdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("10b68930", new Object[]{ijdVar}) : ijdVar.a("key_new_status_manager_enabled", true) ? new d() : new b();
    }
}
