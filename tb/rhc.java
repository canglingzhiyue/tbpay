package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public final class rhc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f33153a;
    private mrj b;
    private mri c;

    static {
        kge.a(-338534763);
    }

    public static /* synthetic */ String a(rhc rhcVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("374fd96b", new Object[]{rhcVar, str});
        }
        rhcVar.f33153a = str;
        return str;
    }

    public static /* synthetic */ mri a(rhc rhcVar, mri mriVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mri) ipChange.ipc$dispatch("82b20b6b", new Object[]{rhcVar, mriVar});
        }
        rhcVar.c = mriVar;
        return mriVar;
    }

    public static /* synthetic */ mrj a(rhc rhcVar, mrj mrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mrj) ipChange.ipc$dispatch("1796be4b", new Object[]{rhcVar, mrjVar});
        }
        rhcVar.b = mrjVar;
        return mrjVar;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f33153a;
    }

    public mrj b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mrj) ipChange.ipc$dispatch("16b98fb8", new Object[]{this}) : this.b;
    }

    public mri c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mri) ipChange.ipc$dispatch("1e6b34f8", new Object[]{this}) : this.c;
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private rhc f33154a = new rhc();

        static {
            kge.a(1930416236);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3212d2aa", new Object[]{this, str});
            }
            rhc.a(this.f33154a, str);
            return this;
        }

        public a a(mrj mrjVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8a982a9", new Object[]{this, mrjVar});
            }
            rhc.a(this.f33154a, mrjVar);
            return this;
        }

        public a a(mri mriVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1a267c28", new Object[]{this, mriVar});
            }
            rhc.a(this.f33154a, mriVar);
            return this;
        }

        public rhc a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rhc) ipChange.ipc$dispatch("f0a09d1", new Object[]{this}) : this.f33154a;
        }
    }
}
