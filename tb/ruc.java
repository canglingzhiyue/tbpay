package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.connection.state.a;
import tb.syk;

/* loaded from: classes9.dex */
public class ruc implements a.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ rud f33384a;

    static {
        kge.a(277939617);
        kge.a(544005498);
    }

    public ruc(rud rudVar) {
        this.f33384a = rudVar;
    }

    @Override // com.taobao.accs.connection.state.a.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!str.equals(kaq.a().getPackageName())) {
        } else {
            this.f33384a.b();
            if (syk.a.f33954a.b(kaq.a())) {
                return;
            }
            a.a().b(this);
        }
    }

    @Override // com.taobao.accs.connection.state.a.b
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        }
    }
}
