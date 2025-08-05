package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* loaded from: classes5.dex */
public class goq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IDMComponent f28412a;
    private IDMComponent b;
    private List<IDMComponent> c;
    private int d;
    private int e;

    static {
        kge.a(1600689261);
    }

    public goq(a aVar) {
        this.c = a.a(aVar);
        this.d = a.b(aVar);
        this.e = a.c(aVar);
        this.f28412a = this.c.get(this.d);
        this.b = this.c.get(this.e);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DragSwapRequest{mDragComponent=" + this.f28412a + ", mTargetComponent=" + this.b + ", mFromAdapterPos=" + this.d + ", mTargetAdapterPos=" + this.e + '}';
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private List<IDMComponent> f28413a;
        private int b;
        private int c;

        static {
            kge.a(1228638019);
        }

        public static /* synthetic */ List a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("85e2bdf5", new Object[]{aVar}) : aVar.f28413a;
        }

        public static /* synthetic */ int b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3bc65846", new Object[]{aVar})).intValue() : aVar.b;
        }

        public static /* synthetic */ int c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("95a1c287", new Object[]{aVar})).intValue() : aVar.c;
        }

        public a a(List<IDMComponent> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d3f08447", new Object[]{this, list});
            }
            this.f28413a = list;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d61a8445", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2ff5ee86", new Object[]{this, new Integer(i)});
            }
            this.c = i;
            return this;
        }

        public goq a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (goq) ipChange.ipc$dispatch("f0525b5", new Object[]{this}) : new goq(this);
        }
    }

    public IDMComponent a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("acb1e46c", new Object[]{this}) : this.f28412a;
    }

    public IDMComponent b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("d245ed6d", new Object[]{this}) : this.b;
    }

    public List<IDMComponent> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.c;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.d;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.e;
    }
}
