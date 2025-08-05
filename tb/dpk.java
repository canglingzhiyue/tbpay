package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.c;

/* loaded from: classes4.dex */
public class dpk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1092977561);
    }

    public static c a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("4c6f3216", new Object[]{new Boolean(z)}) : new dpj();
    }
}
