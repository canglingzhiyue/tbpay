package com.taobao.android.detail2.core.framework.base.weex;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes5.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static WeakReference<MUSDKInstance> f11505a;

    static {
        kge.a(1401363682);
    }

    public static MUSDKInstance a() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("f294aa0e", new Object[0]);
        } else {
            WeakReference<MUSDKInstance> weakReference = f11505a;
            f11505a = null;
            if (weakReference == null) {
                return null;
            }
            obj = weakReference.get();
        }
        return (MUSDKInstance) obj;
    }
}
