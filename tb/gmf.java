package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class gmf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f28378a;
    private Object b;
    private Object c;
    private Object d;
    private gme e;

    static {
        kge.a(-439563036);
    }

    public Object a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.b;
    }

    public gme b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gme) ipChange.ipc$dispatch("16b6c21e", new Object[]{this}) : this.e;
    }

    public Object c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ca3f7d08", new Object[]{this}) : this.c;
    }

    private gmf(a aVar) {
        this.f28378a = "default";
        this.f28378a = a.a(aVar);
        this.d = a.b(aVar);
        this.b = a.c(aVar);
        this.c = a.d(aVar);
        this.e = a.e(aVar);
    }

    /* loaded from: classes.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f28379a = "default";
        private Object b;
        private Object c;
        private Object d;
        private gme e;

        static {
            kge.a(-69566533);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("82e5f945", new Object[]{aVar}) : aVar.f28379a;
        }

        public static /* synthetic */ Object b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("18535bb6", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ Object c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a0839b95", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ Object d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("28b3db74", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ gme e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (gme) ipChange.ipc$dispatch("52a55788", new Object[]{aVar}) : aVar.e;
        }

        public a a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("557f44a5", new Object[]{this, obj});
            }
            this.b = obj;
            return this;
        }

        public a b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ddaf8484", new Object[]{this, obj});
            }
            this.c = obj;
            return this;
        }

        public a a(gme gmeVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c9237850", new Object[]{this, gmeVar});
            }
            this.e = gmeVar;
            return this;
        }

        public gmf a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (gmf) ipChange.ipc$dispatch("f051cde", new Object[]{this}) : new gmf(this);
        }
    }
}
