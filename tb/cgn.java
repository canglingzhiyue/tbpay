package tb;

import com.alilive.adapter.uikit.e;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class cgn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static e f26295a;
    private static cgx b;

    static {
        kge.a(-832833728);
    }

    public static e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("eb5850b4", new Object[0]) : f26295a;
    }

    public static void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16988b34", new Object[]{eVar});
        } else {
            f26295a = eVar;
        }
    }

    public static cgx b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cgx) ipChange.ipc$dispatch("16b4dc69", new Object[0]) : b;
    }

    public static void a(cgx cgxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e367b5c4", new Object[]{cgxVar});
        } else {
            b = cgxVar;
        }
    }
}
