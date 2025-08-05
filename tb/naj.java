package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class naj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile naj b;

    /* renamed from: a  reason: collision with root package name */
    private nai f31355a;

    static {
        kge.a(-1906050384);
    }

    private naj() {
    }

    public static naj a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (naj) ipChange.ipc$dispatch("f081ee7", new Object[0]);
        }
        if (b == null) {
            synchronized (naj.class) {
                if (b == null) {
                    b = new naj();
                }
            }
        }
        return b;
    }

    public nai a(nai naiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nai) ipChange.ipc$dispatch("7375c3ee", new Object[]{this, naiVar});
        }
        if (naiVar != null) {
            this.f31355a = naiVar;
        }
        return this.f31355a;
    }

    public nai b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nai) ipChange.ipc$dispatch("16b9c427", new Object[]{this}) : this.f31355a;
    }
}
