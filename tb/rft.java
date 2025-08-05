package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public abstract class rft implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private rfz f33123a;

    static {
        kge.a(1442229518);
        kge.a(-1390502639);
    }

    public rfz getUpdateListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rfz) ipChange.ipc$dispatch("d5b2dca6", new Object[]{this}) : this.f33123a;
    }

    public rft(rfz rfzVar) {
        this.f33123a = rfzVar;
    }
}
