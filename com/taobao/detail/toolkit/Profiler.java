package com.taobao.detail.toolkit;

import com.android.alibaba.ip.runtime.IpChange;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.mto;
import tb.riy;

/* loaded from: classes7.dex */
public final class Profiler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean SWITCHER;

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal f17064a;

    /* loaded from: classes7.dex */
    public interface b {
        String a();
    }

    static {
        kge.a(-169049307);
        SWITCHER = true;
        f17064a = new ThreadLocal();
    }

    public static void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[0]);
        } else if (!SWITCHER) {
        } else {
            start((String) null);
        }
    }

    public static void start(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a37a973", new Object[]{str});
        } else if (!SWITCHER) {
        } else {
            f17064a.set(new a(str, null, null));
        }
    }

    public static void start(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b55915", new Object[]{bVar});
        } else if (!SWITCHER) {
        } else {
            f17064a.set(new a(bVar, null, null));
        }
    }

    public static void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[0]);
        } else if (!SWITCHER) {
        } else {
            f17064a.set(null);
        }
    }

    public static void enter(String str) {
        a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bcf0f69", new Object[]{str});
        } else if (!SWITCHER || (a2 = a()) == null) {
        } else {
            a.a(a2, str);
        }
    }

    public static void enter(b bVar) {
        a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda4280b", new Object[]{bVar});
        } else if (!SWITCHER || (a2 = a()) == null) {
        } else {
            a.a(a2, bVar);
        }
    }

    public static void release() {
        a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[0]);
        } else if (!SWITCHER || (a2 = a()) == null) {
        } else {
            a.a(a2);
        }
    }

    public static long getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[0])).longValue();
        }
        if (!SWITCHER) {
            return 0L;
        }
        a aVar = (a) f17064a.get();
        if (aVar == null) {
            return -1L;
        }
        return aVar.c();
    }

    public static String dump() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f87f7585", new Object[0]) : !SWITCHER ? "" : dump("", "");
    }

    public static String dump(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f3b749bb", new Object[]{str}) : dump(str, str);
    }

    public static String dump(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa12bc71", new Object[]{str, str2});
        }
        a aVar = (a) f17064a.get();
        return aVar != null ? a.a(aVar, str, str2) : "";
    }

    public static a getEntry() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("95638c40", new Object[0]) : (a) f17064a.get();
    }

    private static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("32ae983b", new Object[0]);
        }
        a aVar = (a) f17064a.get();
        a aVar2 = null;
        if (aVar == null) {
            return aVar2;
        }
        do {
            aVar2 = aVar;
            aVar = a.b(aVar2);
        } while (aVar != null);
        return aVar2;
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final List f17065a;
        private final Object b;
        private final a c;
        private final a d;
        private final long e;
        private final long f;
        private long g;

        static {
            kge.a(-1946983917);
        }

        public static /* synthetic */ String a(a aVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8fcc2737", new Object[]{aVar, str, str2}) : aVar.a(str, str2);
        }

        public static /* synthetic */ void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b19db1f5", new Object[]{aVar});
            } else {
                aVar.g();
            }
        }

        public static /* synthetic */ void a(a aVar, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b46ee91", new Object[]{aVar, obj});
            } else {
                aVar.a(obj);
            }
        }

        public static /* synthetic */ a b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("bdc81cad", new Object[]{aVar}) : aVar.i();
        }

        private a(Object obj, a aVar, a aVar2) {
            this.f17065a = new ArrayList(4);
            this.b = obj;
            this.f = System.currentTimeMillis();
            this.c = aVar;
            this.d = aVar2 == null ? this : aVar2;
            this.e = aVar2 == null ? 0L : aVar2.f;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
            }
            Object obj = this.b;
            if (obj instanceof String) {
                return (String) obj;
            }
            if (!(obj instanceof b)) {
                return null;
            }
            return ((b) obj).a();
        }

        public long b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue();
            }
            long j = this.e;
            if (j <= 0) {
                return 0L;
            }
            return this.f - j;
        }

        public long c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
            }
            long j = this.g;
            long j2 = this.f;
            if (j >= j2) {
                return j - j2;
            }
            return -1L;
        }

        public long d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue();
            }
            long c = c();
            if (c < 0) {
                return -1L;
            }
            if (this.f17065a.isEmpty()) {
                return c;
            }
            for (int i = 0; i < this.f17065a.size(); i++) {
                c -= ((a) this.f17065a.get(i)).c();
            }
            if (c >= 0) {
                return c;
            }
            return -1L;
        }

        public double e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5a4ca5a", new Object[]{this})).doubleValue();
            }
            double c = c();
            a aVar = this.c;
            double c2 = (aVar == null || !aVar.h()) ? 0.0d : this.c.c();
            return (c <= mto.a.GEO_NOT_SUPPORT || c2 <= mto.a.GEO_NOT_SUPPORT) ? mto.a.GEO_NOT_SUPPORT : c / c2;
        }

        public double f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5b2e1db", new Object[]{this})).doubleValue();
            }
            double c = c();
            a aVar = this.d;
            double c2 = (aVar == null || !aVar.h()) ? 0.0d : this.d.c();
            return (c <= mto.a.GEO_NOT_SUPPORT || c2 <= mto.a.GEO_NOT_SUPPORT) ? mto.a.GEO_NOT_SUPPORT : c / c2;
        }

        private void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            } else if (!Profiler.SWITCHER) {
            } else {
                this.g = System.currentTimeMillis();
            }
        }

        private boolean h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.g > 0;
        }

        private void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            } else {
                this.f17065a.add(new a(obj, this, this.d));
            }
        }

        private a i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6dd84133", new Object[]{this});
            }
            if (this.f17065a.isEmpty()) {
                return null;
            }
            List list = this.f17065a;
            a aVar = (a) list.get(list.size() - 1);
            if (!aVar.h()) {
                return aVar;
            }
            return null;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : a("", "");
        }

        private String a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
            }
            StringBuffer stringBuffer = new StringBuffer();
            a(stringBuffer, str, str2);
            return stringBuffer.toString();
        }

        private void a(StringBuffer stringBuffer, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b18c2c66", new Object[]{this, stringBuffer, str, str2});
                return;
            }
            stringBuffer.append(str);
            String a2 = a();
            long b = b();
            long c = c();
            long d = d();
            double e = e();
            double f = f();
            Object[] objArr = {a2, new Long(b), new Long(c), new Long(d), new Double(e), new Double(f)};
            StringBuffer stringBuffer2 = new StringBuffer("{1,number} ");
            if (h()) {
                stringBuffer2.append("[{2,number}ms");
                if (d > 0 && d != c) {
                    stringBuffer2.append(" ({3,number}ms)");
                }
                if (e > mto.a.GEO_NOT_SUPPORT) {
                    stringBuffer2.append(", {4,number,##%}");
                }
                if (f > mto.a.GEO_NOT_SUPPORT) {
                    stringBuffer2.append(", {5,number,##%}");
                }
                stringBuffer2.append(riy.ARRAY_END_STR);
            } else {
                stringBuffer2.append("[UNRELEASED]");
            }
            if (a2 != null) {
                stringBuffer2.append(" - {0}");
            }
            stringBuffer.append(MessageFormat.format(stringBuffer2.toString(), objArr));
            for (int i = 0; i < this.f17065a.size(); i++) {
                a aVar = (a) this.f17065a.get(i);
                stringBuffer.append('\n');
                if (i == this.f17065a.size() - 1) {
                    aVar.a(stringBuffer, str2 + "`---", str2 + "    ");
                } else if (i == 0) {
                    aVar.a(stringBuffer, str2 + "+---", str2 + "|   ");
                } else {
                    aVar.a(stringBuffer, str2 + "+---", str2 + "|   ");
                }
            }
        }
    }
}
