package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.cua;

/* loaded from: classes4.dex */
public class cub {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private cua f26534a = new cua();

    static {
        kge.a(1587452740);
    }

    public void a(cua.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647e142c", new Object[]{this, aVar});
        } else {
            this.f26534a.a(aVar);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f26534a.a(str);
        }
    }

    public void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            this.f26534a.a(i, i2, i3);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f26534a.a();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            this.f26534a.b();
        } catch (Throwable th) {
            cot.a("VideoHardDecoder", "release_crash", th);
        }
    }
}
