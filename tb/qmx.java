package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.tcp;

/* loaded from: classes4.dex */
public class qmx implements qmw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public static boolean f32948a;
    private static final Executor b;
    private static final tcp c;
    private static final tcp d;

    /* renamed from: lambda$Ob_6Aeu9aJeVZugeZG-Dv5HsoqU */
    public static /* synthetic */ void m2488lambda$Ob_6Aeu9aJeVZugeZGDv5HsoqU(tcp.b bVar, String str) {
        a(bVar, str);
    }

    public static /* synthetic */ Map lambda$_pjoQwUuuIvkSullC3bPfuoqZgc(File file) {
        return b(file);
    }

    public static /* synthetic */ HashMap lambda$wzlZ6hpFHnnOf_BWVZPevSENbC0(File file) {
        return a(file);
    }

    public static /* synthetic */ tcp a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tcp) ipChange.ipc$dispatch("f0ae15d", new Object[0]) : c;
    }

    public static /* synthetic */ tcp b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tcp) ipChange.ipc$dispatch("16bc86bc", new Object[0]) : d;
    }

    static {
        kge.a(-1027354457);
        kge.a(872656749);
        f32948a = true;
        b = VExecutors.newSingleThreadExecutor(new h() { // from class: tb.qmx.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.virtual_thread.face.h
            public String newThreadName() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this}) : "fast_sp_computer";
            }
        });
        c = new tcp("kv", "none", "kv");
        d = new tcp("xml", "none", "xml");
        Executor executor = b;
        if (executor instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor) executor).setKeepAliveTime(1L, TimeUnit.SECONDS);
            ((ThreadPoolExecutor) b).allowCoreThreadTimeOut(true);
        }
    }

    @Override // tb.qmw
    public void a(final Map<String, ?> map, final File file, final File file2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac4ab4b", new Object[]{this, map, file, file2});
            return;
        }
        final String replace = file2.getName().replace(".kv", "");
        c.a(new tcp.b() { // from class: tb.qmx.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                qmx.this = this;
            }

            @Override // tb.tcp.b
            public void run() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                try {
                    tct.a(map, bufferedOutputStream);
                    bufferedOutputStream.close();
                    qmx.a().a(replace, file2.length());
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        if (th != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        } else {
                            bufferedOutputStream.close();
                        }
                        throw th2;
                    }
                }
            }
        }, replace, "write");
        final tcp.b bVar = new tcp.b() { // from class: tb.qmx.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                qmx.this = this;
            }

            @Override // tb.tcp.b
            public void run() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    tcu.a(map, bufferedOutputStream);
                    bufferedOutputStream.close();
                    qmx.b().a(replace, file.length());
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        if (th != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        } else {
                            bufferedOutputStream.close();
                        }
                        throw th2;
                    }
                }
            }
        };
        if (f32948a) {
            b.execute(new Runnable() { // from class: tb.-$$Lambda$qmx$Ob_6Aeu9aJeVZugeZG-Dv5HsoqU
                @Override // java.lang.Runnable
                public final void run() {
                    qmx.m2488lambda$Ob_6Aeu9aJeVZugeZGDv5HsoqU(tcp.b.this, replace);
                }
            });
        }
        tco.a("KvStoreFirstFileAction", "write to", file2.getAbsolutePath());
    }

    public static /* synthetic */ void a(tcp.b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb553fa3", new Object[]{bVar, str});
            return;
        }
        try {
            d.a(bVar, str, "write");
        } catch (Exception e) {
            tco.a(e);
        }
    }

    @Override // tb.qmw
    public Map<String, ?> a(final File file, final File file2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3e7ceacb", new Object[]{this, file, file2});
        }
        String replace = file2.getName().replace(".kv", "");
        if (file2.exists()) {
            tco.a("KvStoreFirstFileAction", "read from", file2.getAbsolutePath());
            return (Map) c.a(new Callable() { // from class: tb.-$$Lambda$qmx$_pjoQwUuuIvkSullC3bPfuoqZgc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return qmx.lambda$_pjoQwUuuIvkSullC3bPfuoqZgc(file2);
                }
            }, replace, "read");
        } else if (file.exists()) {
            tco.a("KvStoreFirstFileAction", "read from", file.getAbsolutePath());
            return (Map) d.a(new Callable() { // from class: tb.-$$Lambda$qmx$wzlZ6hpFHnnOf_BWVZPevSENbC0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return qmx.lambda$wzlZ6hpFHnnOf_BWVZPevSENbC0(file);
                }
            }, replace, "read");
        } else {
            return new HashMap();
        }
    }

    public static /* synthetic */ Map b(File file) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3700bbd5", new Object[]{file}) : tct.a(file);
    }

    public static /* synthetic */ HashMap a(File file) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("fa943b82", new Object[]{file}) : tcu.a(new BufferedInputStream(new FileInputStream(file)));
    }
}
