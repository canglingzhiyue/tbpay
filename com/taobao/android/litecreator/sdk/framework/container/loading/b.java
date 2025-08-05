package com.taobao.android.litecreator.sdk.framework.container.loading;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static b f13450a;
    private String b;
    private float c;
    private boolean d;
    private boolean e;
    private boolean f;
    private int g;

    /* renamed from: com.taobao.android.litecreator.sdk.framework.container.loading.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0519b {
        void a();
    }

    static {
        kge.a(-728957645);
        f13450a = new a().a(false).a(0.5f).a(com.alibaba.ability.localization.b.a(R.string.gg_pub_please_wait_1)).a();
    }

    private b(a aVar) {
        this.b = a.a(aVar);
        this.c = a.b(aVar);
        this.d = a.c(aVar);
        this.e = a.d(aVar);
        this.g = a.e(aVar);
        this.f = a.f(aVar);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.f;
    }

    public float b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : this.c;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.g;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.e;
    }

    /* loaded from: classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f13451a;
        private float b;
        private boolean c;
        private boolean d;
        private boolean e;
        private int f;

        static {
            kge.a(-1064767222);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("39d5847d", new Object[]{aVar}) : aVar.f13451a;
        }

        public static /* synthetic */ float b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("369fcd74", new Object[]{aVar})).floatValue() : aVar.b;
        }

        public static /* synthetic */ boolean c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fdabb489", new Object[]{aVar})).booleanValue() : aVar.c;
        }

        public static /* synthetic */ boolean d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c4b79b8a", new Object[]{aVar})).booleanValue() : aVar.d;
        }

        public static /* synthetic */ int e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8bc3827a", new Object[]{aVar})).intValue() : aVar.f;
        }

        public static /* synthetic */ boolean f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("52cf698c", new Object[]{aVar})).booleanValue() : aVar.e;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e7d6b8ff", new Object[]{this, str});
            }
            this.f13451a = str;
            return this;
        }

        public a a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f4f57319", new Object[]{this, new Float(f)});
            }
            this.b = f;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9f9694f6", new Object[]{this, new Integer(i)});
            }
            this.f = i;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("667cff85", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2d88e686", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f494cd87", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("33cc0e6", new Object[]{this}) : new b(this);
        }
    }
}
