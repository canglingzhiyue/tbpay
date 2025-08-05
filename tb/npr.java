package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class npr<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private npq f31632a;
    private npp<T> b;
    private nul c;

    static {
        kge.a(39779327);
    }

    public static /* synthetic */ npp a(npr nprVar, npp nppVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (npp) ipChange.ipc$dispatch("8bb9af6e", new Object[]{nprVar, nppVar});
        }
        nprVar.b = nppVar;
        return nppVar;
    }

    public static /* synthetic */ npq a(npr nprVar, npq npqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (npq) ipChange.ipc$dispatch("209e624e", new Object[]{nprVar, npqVar});
        }
        nprVar.f31632a = npqVar;
        return npqVar;
    }

    public static /* synthetic */ nul a(npr nprVar, nul nulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nul) ipChange.ipc$dispatch("5e9f318e", new Object[]{nprVar, nulVar});
        }
        nprVar.c = nulVar;
        return nulVar;
    }

    private npr() {
    }

    public npo<nno> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (npo) ipChange.ipc$dispatch("f0857d1", new Object[]{this}) : new npo<>(this.f31632a, null, this.c);
    }

    public npo<T> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (npo) ipChange.ipc$dispatch("16b9fd30", new Object[]{this}) : new npo<>(this.f31632a, this.b, this.c);
    }

    /* loaded from: classes7.dex */
    public static class b<M> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private a<M> f31634a = new a<>();

        static {
            kge.a(-1710922794);
        }

        public b<M> a(npq npqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("1e02b26f", new Object[]{this, npqVar});
            }
            this.f31634a.f31633a = npqVar;
            return this;
        }

        public b<M> a(npp<M> nppVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2f7fabee", new Object[]{this, nppVar});
            }
            this.f31634a.b = nppVar;
            return this;
        }

        public b<M> a(nul nulVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("dec88205", new Object[]{this, nulVar});
            }
            this.f31634a.c = nulVar;
            return this;
        }

        public npr<M> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (npr) ipChange.ipc$dispatch("f08582e", new Object[]{this});
            }
            npr<M> nprVar = new npr<>();
            npr.a(nprVar, this.f31634a.f31633a);
            npr.a(nprVar, this.f31634a.b);
            npr.a(nprVar, this.f31634a.c);
            return nprVar;
        }
    }

    /* loaded from: classes7.dex */
    public static class a<M> {

        /* renamed from: a  reason: collision with root package name */
        public npq f31633a;
        public npp<M> b;
        public nul c;

        static {
            kge.a(1775468623);
        }

        private a() {
        }
    }
}
