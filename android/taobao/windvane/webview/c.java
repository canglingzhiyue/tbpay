package android.taobao.windvane.webview;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f1722a;
    private final String b;

    static {
        kge.a(1536419683);
    }

    private c(int i, String str) {
        this.f1722a = i;
        this.b = str;
    }

    public static c a(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("1367daad", new Object[]{new Integer(i), str}) : new c(i, str);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }
}
