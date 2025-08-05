package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class cft {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private cfo f26269a;
    private final cfn b;

    public static /* synthetic */ cfo a(cft cftVar, cfo cfoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfo) ipChange.ipc$dispatch("6eadf0ef", new Object[]{cftVar, cfoVar});
        }
        cftVar.f26269a = cfoVar;
        return cfoVar;
    }

    private cft(cfn cfnVar) {
        this.b = cfnVar;
    }

    public cfo a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cfo) ipChange.ipc$dispatch("f033232", new Object[]{this}) : this.f26269a;
    }

    public cfn b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cfn) ipChange.ipc$dispatch("16b4d772", new Object[]{this}) : this.b;
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public cfo f26270a;
        public cfn b;

        public a(cfn cfnVar) {
            this.b = cfnVar;
        }

        public a a(cfo cfoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7e93e32c", new Object[]{this, cfoVar});
            }
            this.f26270a = cfoVar;
            return this;
        }

        public cft a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cft) ipChange.ipc$dispatch("f0332cd", new Object[]{this});
            }
            cft cftVar = new cft(this.b);
            cft.a(cftVar, this.f26270a);
            return cftVar;
        }
    }
}
