package tb;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.protocol.c;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ojj implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ojl f32117a;
    private final ovm b;

    static {
        kge.a(-1325970053);
        kge.a(-764917408);
    }

    public ojj(ovm ovmVar, ojl ojlVar) {
        this.f32117a = ojlVar;
        this.b = ovmVar;
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public void a(IHomeSubTabController iHomeSubTabController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d85b7b", new Object[]{this, iHomeSubTabController, new Boolean(z)});
            return;
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("enablePullReFresh self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        sb.append(", isEnable : ");
        sb.append(z);
        strArr[0] = sb.toString();
        ldf.d("AbstractMainLandInfoFlowCallBack", strArr);
        if (l(iHomeSubTabController)) {
            return;
        }
        this.f32117a.a(z);
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public void a(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6cd2679", new Object[]{this, iHomeSubTabController});
            return;
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("setRefreshing self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        strArr[0] = sb.toString();
        ldf.d("AbstractMainLandInfoFlowCallBack", strArr);
        if (l(iHomeSubTabController)) {
            return;
        }
        this.f32117a.a();
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public void b(IHomeSubTabController iHomeSubTabController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5097d37c", new Object[]{this, iHomeSubTabController, new Boolean(z)});
            return;
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("setSecondFloorEnable self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        sb.append(", isEnable : ");
        sb.append(z);
        strArr[0] = sb.toString();
        ldf.d("AbstractMainLandInfoFlowCallBack", strArr);
        if (l(iHomeSubTabController)) {
            return;
        }
        this.f32117a.b(z);
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public void b(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552e2a58", new Object[]{this, iHomeSubTabController});
            return;
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("refreshFinish self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        strArr[0] = sb.toString();
        ldf.d("AbstractMainLandInfoFlowCallBack", strArr);
        if (l(iHomeSubTabController)) {
            return;
        }
        this.f32117a.b();
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public boolean c(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d38f2e3b", new Object[]{this, iHomeSubTabController})).booleanValue();
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("isRefreshing self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        strArr[0] = sb.toString();
        ldf.d("AbstractMainLandInfoFlowCallBack", strArr);
        if (!l(iHomeSubTabController)) {
            return this.f32117a.c();
        }
        return false;
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public void a(IHomeSubTabController iHomeSubTabController, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05d0403", new Object[]{this, iHomeSubTabController, str});
            return;
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("setTabBarActionButtonState self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        sb.append(", tabBarShowState : ");
        sb.append(str);
        strArr[0] = sb.toString();
        ldf.d("AbstractMainLandInfoFlowCallBack", strArr);
        if (l(iHomeSubTabController)) {
            return;
        }
        this.f32117a.a(str);
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public void c(IHomeSubTabController iHomeSubTabController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e574b7d", new Object[]{this, iHomeSubTabController, new Boolean(z)});
            return;
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("setTabBarActionButtonState self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        sb.append(", isRocket : ");
        sb.append(z);
        strArr[0] = sb.toString();
        ldf.d("AbstractMainLandInfoFlowCallBack", strArr);
        if (l(iHomeSubTabController)) {
            return;
        }
        this.f32117a.c(z);
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public void a(IHomeSubTabController iHomeSubTabController, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92c5d3ec", new Object[]{this, iHomeSubTabController, map});
            return;
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("updatePageProperties self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        sb.append(", aProperties : ");
        sb.append(map);
        strArr[0] = sb.toString();
        ldf.d("AbstractMainLandInfoFlowCallBack", strArr);
        if (l(iHomeSubTabController)) {
            return;
        }
        this.f32117a.a(map);
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public void b(IHomeSubTabController iHomeSubTabController, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf0e6e22", new Object[]{this, iHomeSubTabController, str});
            return;
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("updatePageUtparam self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        sb.append(", aPageUtparam : ");
        sb.append(str);
        strArr[0] = sb.toString();
        ldf.d("AbstractMainLandInfoFlowCallBack", strArr);
        if (l(iHomeSubTabController)) {
            return;
        }
        this.f32117a.b(str);
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public void d(IHomeSubTabController iHomeSubTabController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec16c37e", new Object[]{this, iHomeSubTabController, new Boolean(z)});
            return;
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("onReachTopChanged self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        sb.append(", isReachTop : ");
        sb.append(z);
        strArr[0] = sb.toString();
        ldf.d("AbstractMainLandInfoFlowCallBack", strArr);
        if (l(iHomeSubTabController)) {
            return;
        }
        this.f32117a.d(z);
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public JSONObject d(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7d710536", new Object[]{this, iHomeSubTabController});
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("getSubContainerParam self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        strArr[0] = sb.toString();
        ldf.d("AbstractMainLandInfoFlowCallBack", strArr);
        if (!l(iHomeSubTabController)) {
            return this.f32117a.g();
        }
        return null;
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public int e(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d05135e8", new Object[]{this, iHomeSubTabController})).intValue();
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("getPullDownDistance self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        strArr[0] = sb.toString();
        ldf.d("AbstractMainLandInfoFlowCallBack", strArr);
        if (!l(iHomeSubTabController)) {
            return this.f32117a.j();
        }
        return 0;
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public JSONObject f(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3e7494f4", new Object[]{this, iHomeSubTabController});
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("getGlobalBgConfig self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        strArr[0] = sb.toString();
        ldf.d("AbstractMainLandInfoFlowCallBack", strArr);
        return this.f32117a.k();
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public JSONObject g(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1ef65cd3", new Object[]{this, iHomeSubTabController});
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("getSelfTabInformation self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        strArr[0] = sb.toString();
        ldf.d("AbstractMainLandInfoFlowCallBack", strArr);
        return this.f32117a.b(iHomeSubTabController);
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public int h(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b744185", new Object[]{this, iHomeSubTabController})).intValue();
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("getCurrentBgViewId self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        strArr[0] = sb.toString();
        ldf.d("AbstractMainLandInfoFlowCallBack", strArr);
        return this.f32117a.d();
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public void a(IHomeSubTabController iHomeSubTabController, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2225b9", new Object[]{this, iHomeSubTabController, view});
            return;
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("setBgView self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        strArr[0] = sb.toString();
        ldf.d("AbstractMainLandInfoFlowCallBack", strArr);
        this.f32117a.a(view);
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public JSONObject i(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("dff9ec91", new Object[]{this, iHomeSubTabController}) : this.f32117a.h();
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public float j(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("48364940", new Object[]{this, iHomeSubTabController})).floatValue() : this.f32117a.f();
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public Map<String, Integer> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("c27656b1", new Object[]{this, str, str2}) : this.f32117a.a(str, str2);
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public void k(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6974d2f", new Object[]{this, iHomeSubTabController});
        } else {
            this.f32117a.i();
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f32117a.m();
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public void a(llh llhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f30282f0", new Object[]{this, llhVar});
        } else {
            this.f32117a.a(llhVar);
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public Context c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c833dc62", new Object[]{this}) : this.f32117a.l();
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.f32117a.n();
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.f32117a.o();
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public boolean a(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8549977", new Object[]{this, view, layoutParams})).booleanValue() : this.f32117a.a(view, layoutParams);
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.f32117a.p();
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public JSONObject h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("fa36400f", new Object[]{this}) : this.f32117a.r();
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.f32117a.u();
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.f32117a.v();
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public View a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("fef0fbf4", new Object[]{this, str}) : this.f32117a.c(str);
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public Fragment j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("c48dc553", new Object[]{this}) : this.f32117a.t();
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.f32117a.q();
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public List<String> b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("89cdf874", new Object[]{this, str}) : this.f32117a.d(str);
    }

    @Override // com.taobao.tao.topmultitab.protocol.c
    public void a(IHomeSubTabController iHomeSubTabController, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18797", new Object[]{this, iHomeSubTabController, jSONObject});
            return;
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("refreshSearchBox self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        strArr[0] = sb.toString();
        ldf.d("AbstractMainLandInfoFlowCallBack", strArr);
        if (l(iHomeSubTabController)) {
            return;
        }
        this.f32117a.a(jSONObject);
    }

    public boolean l(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44f85112", new Object[]{this, iHomeSubTabController})).booleanValue();
        }
        IHomeSubTabController a2 = this.b.a();
        ldf.d("AbstractMainLandInfoFlowCallBack", "currentTabController:" + a2 + "当前传进来的值是:" + iHomeSubTabController);
        return (iHomeSubTabController == a2 || a2 == null) ? false : true;
    }
}
