package android.taobao.windvane.util;

import android.content.res.Resources;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1066963305);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : Resources.getSystem().getDisplayMetrics().heightPixels;
    }
}
