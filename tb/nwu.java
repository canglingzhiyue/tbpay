package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.busniess.model.g;
import com.taobao.tao.navigation.model.NavigationTabConstraints;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.protocol.c;
import tb.lji;

/* loaded from: classes7.dex */
public class nwu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lji f31819a;
    private final c c;
    private final IHomeSubTabController d;
    private String e = g.TAO;
    private final lji.a b = c();

    static {
        kge.a(272542634);
    }

    public static /* synthetic */ IHomeSubTabController a(nwu nwuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IHomeSubTabController) ipChange.ipc$dispatch("614a229d", new Object[]{nwuVar}) : nwuVar.d;
    }

    public static /* synthetic */ String a(nwu nwuVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41a1ad0a", new Object[]{nwuVar, str});
        }
        nwuVar.e = str;
        return str;
    }

    public static /* synthetic */ c b(nwu nwuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("53e34854", new Object[]{nwuVar}) : nwuVar.c;
    }

    public nwu(lji ljiVar, c cVar, IHomeSubTabController iHomeSubTabController) {
        this.f31819a = ljiVar;
        this.c = cVar;
        this.d = iHomeSubTabController;
        this.f31819a.a(this.b);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f31819a.b(this.b);
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.e;
    }

    private lji.a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lji.a) ipChange.ipc$dispatch("2e4bf7f4", new Object[]{this}) : new lji.a() { // from class: tb.nwu.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lji.a
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : "updateNavigationTabBarButtonStatus";
            }

            @Override // tb.lji.a
            public void a(String str, JSONObject jSONObject, lji.a.InterfaceC1153a interfaceC1153a) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e0e36ce9", new Object[]{this, str, jSONObject, interfaceC1153a});
                } else if (jSONObject == null || jSONObject.isEmpty()) {
                    interfaceC1153a.a("bridge params is empty");
                } else {
                    if (TextUtils.equals(NavigationTabConstraints.TAB_ALIEN_EFFECTIVE_ROCKET, jSONObject.getString("status"))) {
                        nwu.b(nwu.this).a(nwu.a(nwu.this), NavigationTabConstraints.TAB_ALIEN_EFFECTIVE_ROCKET);
                        nwu.a(nwu.this, NavigationTabConstraints.TAB_ALIEN_EFFECTIVE_ROCKET);
                        ldf.d("TabBarButtonService", "前端通知变更小火箭状态为ROCKET");
                    } else {
                        nwu.b(nwu.this).a(nwu.a(nwu.this), g.TAO);
                        nwu.a(nwu.this, g.TAO);
                        ldf.d("TabBarButtonService", "前端通知变更小火箭状态为TAO");
                    }
                    interfaceC1153a.b("update success");
                }
            }
        };
    }
}
