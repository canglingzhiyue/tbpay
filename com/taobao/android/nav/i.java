package com.taobao.android.nav;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Uri.Builder f14452a;

    static {
        kge.a(-822513944);
    }

    public Uri a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("d258659f", new Object[]{this}) : this.f14452a.build();
    }
}
