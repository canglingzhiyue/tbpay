package com.taobao.android.dinamic.dinamic;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.k;
import tb.kge;

/* loaded from: classes5.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static com.taobao.android.dinamicx.template.download.d f11740a;

    static {
        kge.a(-1045888678);
        f11740a = new com.taobao.android.dinamicx.template.download.d(1, true, new k("DXV2PreRender", true));
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            f11740a.execute(runnable);
        }
    }
}
