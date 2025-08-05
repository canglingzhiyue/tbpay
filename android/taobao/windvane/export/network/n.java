package android.taobao.windvane.export.network;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import tb.kge;

/* loaded from: classes2.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile Boolean f1605a;

    static {
        kge.a(1431384035);
        f1605a = null;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (f1605a != null) {
            return f1605a.booleanValue();
        }
        synchronized (n.class) {
            if (f1605a != null) {
                return f1605a.booleanValue();
            }
            f1605a = Boolean.valueOf(ABGlobal.isFeatureOpened(context, "wvEnableImagePrefetch"));
            return f1605a.booleanValue();
        }
    }
}
