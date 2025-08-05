package tb;

import java.util.concurrent.ThreadFactory;

/* compiled from: lambda */
/* renamed from: tb.-$$Lambda$sdf$PeWuus06BQ-NQIS1UFz2c7EY-r4  reason: invalid class name */
/* loaded from: classes9.dex */
public final /* synthetic */ class $$Lambda$sdf$PeWuus06BQNQIS1UFz2c7EYr4 implements ThreadFactory {
    public static final /* synthetic */ $$Lambda$sdf$PeWuus06BQNQIS1UFz2c7EYr4 INSTANCE = new $$Lambda$sdf$PeWuus06BQNQIS1UFz2c7EYr4();

    private /* synthetic */ $$Lambda$sdf$PeWuus06BQNQIS1UFz2c7EYr4() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread a2;
        a2 = sdf.a(runnable);
        return a2;
    }
}
