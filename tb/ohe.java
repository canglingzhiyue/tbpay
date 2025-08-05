package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ohe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ThreadLocal<a> f32053a;

    static {
        kge.a(-305871566);
        f32053a = new ThreadLocal<a>() { // from class: tb.ohe.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, tb.ohe$a] */
            @Override // java.lang.ThreadLocal
            public /* synthetic */ a initialValue() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2908671e", new Object[]{this}) : a();
            }

            public a a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6f90ee15", new Object[]{this}) : new a(new StringBuilder(512));
            }
        };
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6f90ee15", new Object[0]);
        }
        a aVar = f32053a.get();
        if (aVar == null || aVar.b != 0) {
            return new a(new StringBuilder());
        }
        aVar.c();
        return aVar;
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public StringBuilder f32054a;
        public int b = 0;

        static {
            kge.a(979338935);
        }

        public a(StringBuilder sb) {
            this.f32054a = sb;
        }

        public a a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("62df1fb9", new Object[]{this, obj});
            }
            this.f32054a.append(obj);
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2cf5318b", new Object[]{this, str});
            }
            this.f32054a.append(str);
            return this;
        }

        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f32054a.length();
        }

        public String a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bdaf8ad8", new Object[]{this, new Integer(i), new Integer(i2)});
            }
            String substring = this.f32054a.substring(i, i2);
            b();
            return substring;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            String sb = this.f32054a.toString();
            b();
            return sb;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                this.b = 0;
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            this.b++;
            this.f32054a.setLength(0);
        }
    }
}
