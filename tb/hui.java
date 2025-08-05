package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class hui {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f28789a = false;
    private static boolean b = false;
    private static boolean c = false;
    private static a d;

    /* loaded from: classes6.dex */
    public interface a {
        void a();

        void b();
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b;
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        b = z;
        return z;
    }

    public static /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : c;
    }

    public static /* synthetic */ boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{new Boolean(z)})).booleanValue();
        }
        c = z;
        return z;
    }

    public static /* synthetic */ a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("28139803", new Object[0]) : d;
    }

    public static /* synthetic */ a c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b39c9f4c", new Object[]{aVar});
        }
        d = aVar;
        return aVar;
    }

    public static void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("798ab97f", new Object[]{aVar});
        } else if (c) {
            aVar.a();
        } else {
            ihq.a().a("mnnqjs", new ihy() { // from class: tb.hui.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ihy
                public void onLoadFinished(ihz ihzVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6344c753", new Object[]{this, ihzVar});
                        return;
                    }
                    if (ihzVar.g()) {
                        hui.b(true);
                        a aVar2 = a.this;
                        if (aVar2 != null) {
                            aVar2.a();
                        }
                    } else {
                        a aVar3 = a.this;
                        if (aVar3 != null) {
                            aVar3.b();
                        }
                    }
                    hui.f28789a = hui.a() & hui.b();
                }
            });
        }
    }

    public static void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36623c0", new Object[]{aVar});
        } else if (f28789a) {
            aVar.a();
        } else {
            d = aVar;
            ihq.a().a("mnn_jsi", new ihy() { // from class: tb.hui.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ihy
                public void onLoadFinished(ihz ihzVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6344c753", new Object[]{this, ihzVar});
                        return;
                    }
                    if (ihzVar.g()) {
                        hui.a(true);
                    } else if (hui.c() != null) {
                        hui.c().b();
                        hui.c(null);
                    }
                    boolean a2 = hui.a() & hui.b();
                    hui.f28789a = a2;
                    if (!a2 || hui.c() == null) {
                        return;
                    }
                    hui.c().a();
                    hui.c(null);
                }
            });
            ihq.a().a("mnnqjs", new ihy() { // from class: tb.hui.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ihy
                public void onLoadFinished(ihz ihzVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6344c753", new Object[]{this, ihzVar});
                        return;
                    }
                    if (ihzVar.g()) {
                        hui.b(true);
                    } else if (hui.c() != null) {
                        hui.c().b();
                        hui.c(null);
                    }
                    boolean a2 = hui.a() & hui.b();
                    hui.f28789a = a2;
                    if (!a2 || hui.c() == null) {
                        return;
                    }
                    hui.c().a();
                    hui.c(null);
                }
            });
        }
    }
}
