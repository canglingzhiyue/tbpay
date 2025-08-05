package tb;

import io.unicorn.plugin.common.a;
import io.unicorn.plugin.common.b;
import io.unicorn.plugin.common.k;

/* loaded from: classes9.dex */
public class rto {

    /* renamed from: a  reason: collision with root package name */
    public final a<String> f33370a;

    static {
        kge.a(-1888040268);
    }

    public rto(b bVar) {
        this.f33370a = new a<>(bVar, "unicorn/lifecycle", k.INSTANCE);
    }

    public static void e() {
    }

    public void a() {
        rtd.a("LifecycleChannel", "Sending AppLifecycleState.inactive message.");
        this.f33370a.a((a<String>) "AppLifecycleState.inactive");
    }

    public void b() {
        rtd.a("LifecycleChannel", "Sending AppLifecycleState.resumed message.");
        this.f33370a.a((a<String>) "AppLifecycleState.resumed");
    }

    public void c() {
        rtd.a("LifecycleChannel", "Sending AppLifecycleState.paused message.");
        this.f33370a.a((a<String>) "AppLifecycleState.paused");
    }

    public void d() {
        rtd.a("LifecycleChannel", "Sending AppLifecycleState.detached message.");
        this.f33370a.a((a<String>) "AppLifecycleState.detached");
    }
}
