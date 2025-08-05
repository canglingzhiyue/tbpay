package tb;

import java.util.concurrent.ThreadFactory;
import tb.sdd;

/* compiled from: lambda */
/* renamed from: tb.-$$Lambda$sdd$a$kyVqB44YRs9Oy6vMrUFHTGXC8TM  reason: invalid class name */
/* loaded from: classes9.dex */
public final /* synthetic */ class $$Lambda$sdd$a$kyVqB44YRs9Oy6vMrUFHTGXC8TM implements ThreadFactory {
    public static final /* synthetic */ $$Lambda$sdd$a$kyVqB44YRs9Oy6vMrUFHTGXC8TM INSTANCE = new $$Lambda$sdd$a$kyVqB44YRs9Oy6vMrUFHTGXC8TM();

    private /* synthetic */ $$Lambda$sdd$a$kyVqB44YRs9Oy6vMrUFHTGXC8TM() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread d;
        d = sdd.a.d(runnable);
        return d;
    }
}
