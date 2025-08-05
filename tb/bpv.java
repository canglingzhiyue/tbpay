package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes.dex */
public class bpv<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f26041a;
    private final String b;
    private final String c;
    private final bpu<T> d;
    private String e = null;
    private T f = null;

    public bpv(String str, String str2, String str3, bpu<T> bpuVar) {
        this.f26041a = str;
        this.b = str2;
        this.c = str3;
        this.d = bpuVar;
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a(this.c);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.e = OrangeConfig.getInstance().getConfig(this.f26041a, this.b, str);
        this.f = null;
    }
}
