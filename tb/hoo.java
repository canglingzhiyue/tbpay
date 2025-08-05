package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class hoo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f28747a;
    private static boolean b;
    private static final Map<Class<? extends idl<?>>, idl<?>> c;

    static {
        kge.a(45260341);
        f28747a = false;
        b = false;
        c = new ConcurrentHashMap(8);
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (b) {
        } else {
            b = true;
            a(ipt.class, new ipt());
            a(ips.class, new ips());
            a(idm.class, new idm());
            a(ipp.class, new ipp());
            a(jmk.class, new jmk());
            a(igf.class, new igf());
            a(aag.class, new aag());
            a(ipr.class, new ipr());
        }
    }

    public static void a(Class<? extends idl<?>> cls, idl<?> idlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d81b2cf4", new Object[]{cls, idlVar});
        } else {
            c.put(cls, idlVar);
        }
    }

    public static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!f28747a) {
            f28747a = true;
            if (c()) {
                jqg.b("iCart", "关闭了创建Fragment时开始异步预加载的任务");
                return;
            }
            jqg.b("CartPreloader", "开始执行");
            b();
            for (final idl<?> idlVar : c.values()) {
                jqh.a(new Runnable() { // from class: tb.hoo.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            idl.this.a(context);
                        } catch (Exception e) {
                            bed.a("CartPreloaderError", e.getMessage());
                        }
                    }
                });
            }
            jqg.b("iCart", "创建Fragment时开始异步预加载任务");
        }
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : jqi.a("iCart", "disableCartPreloader", false);
    }

    public static <T> T a(Class<? extends idl<T>> cls, boolean z) {
        idl<?> idlVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("84d9c373", new Object[]{cls, new Boolean(z)});
        }
        if (!c.isEmpty() && f28747a) {
            if (z) {
                idlVar = c.remove(cls);
            } else {
                idlVar = c.get(cls);
            }
            if (idlVar == null) {
                return null;
            }
            try {
                return (T) idlVar.a(z);
            } catch (Exception e) {
                bed.a("getPreloaderResultError", e.getMessage());
            }
        }
        return null;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : f28747a;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!c.isEmpty()) {
            try {
                for (idl<?> idlVar : c.values()) {
                    idlVar.a();
                }
                c.clear();
            } catch (Exception e) {
                bed.a("CartPreloaderDestroyError", e.getMessage());
            }
        }
    }
}
