package tb;

import com.android.alibaba.ip.runtime.IpChange;

@Deprecated
/* loaded from: classes7.dex */
public final class lln {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Integer f30694a;
    private final Integer b;

    static {
        kge.a(998204539);
    }

    private lln(a aVar) {
        this.f30694a = a.a(aVar);
        this.b = a.b(aVar);
    }

    public Integer a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("5e2c18f", new Object[]{this}) : this.f30694a;
    }

    public Integer b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("50145ad0", new Object[]{this}) : this.b;
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Integer f30695a;
        private Integer b;

        static {
            kge.a(1365479506);
        }

        public static /* synthetic */ Integer a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("f5f0f8b4", new Object[]{aVar}) : aVar.f30695a;
        }

        public static /* synthetic */ Integer b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("73c8b4b5", new Object[]{aVar}) : aVar.b;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("de771bc0", new Object[]{this, new Integer(i)});
            }
            this.f30695a = Integer.valueOf(i);
            return this;
        }

        public lln a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (lln) ipChange.ipc$dispatch("f075ff0", new Object[]{this}) : new lln(this);
        }
    }
}
