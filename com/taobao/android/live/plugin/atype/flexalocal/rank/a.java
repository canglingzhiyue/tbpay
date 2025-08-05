package com.taobao.android.live.plugin.atype.flexalocal.rank;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pmd;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f13999a;

    static {
        kge.a(-18323264);
        f13999a = null;
    }

    public static Boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("5b7a33e5", new Object[0]);
        }
        if (f13999a == null) {
            f13999a = Boolean.valueOf(Boolean.parseBoolean(pmd.a().d().a("tblive", "enableSubscribeAsianGameMsg", "true")));
        }
        return f13999a;
    }
}
