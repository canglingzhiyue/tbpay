package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.protocol.c;

/* loaded from: classes.dex */
public class ojt implements ovm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ojr f32125a;

    static {
        kge.a(-1494121800);
        kge.a(1527958550);
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "recommend";
    }

    public ojt(c cVar, String str, IHomeSubTabController iHomeSubTabController) {
        this.f32125a = new ojr(new ojk(this, new ojl(iHomeSubTabController, cVar)), str);
        ldf.d("HomeMainLandInfoFlowHelper", "HomeMainLandInfoFlowHelper 构造函数");
    }

    @Override // tb.ovm
    public IHomeSubTabController a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IHomeSubTabController) ipChange.ipc$dispatch("3fee6479", new Object[]{this}) : this.f32125a;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ojr ojrVar = this.f32125a;
        if (ojrVar != null) {
            ojrVar.onDestroy();
            this.f32125a = null;
        }
        ldf.d("HomeMainLandInfoFlowHelper", "destroy");
    }

    public ojr b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ojr) ipChange.ipc$dispatch("16ba5b66", new Object[]{this}) : this.f32125a;
    }
}
