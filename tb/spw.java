package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class spw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f33835a;
    private String b;
    private snv c;
    private sjq d;

    static {
        kge.a(-349792622);
    }

    public spw() {
    }

    public spw(String str, snv snvVar, sjq sjqVar) {
        this.b = str;
        this.c = snvVar;
        this.d = sjqVar;
    }

    public snv a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snv) ipChange.ipc$dispatch("f0a9703", new Object[]{this}) : this.c;
    }

    public sjq b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sjq) ipChange.ipc$dispatch("16bc2cc3", new Object[]{this}) : this.d;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f33835a;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f33835a = z;
        }
    }
}
