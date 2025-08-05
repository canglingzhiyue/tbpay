package com.taobao.android.detail.ttdetail.widget.scrollerlayout;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.android.detail.ttdetail.utils.o;
import tb.kge;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f11050a;

    static {
        kge.a(1692566381);
        f11050a = o.a(f.a());
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (!j.L() && !f11050a) {
        } else {
            i.a(str, str2);
        }
    }
}
