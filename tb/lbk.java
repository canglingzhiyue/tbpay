package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.page.weexv2.WeexSecondFloorFragment;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.homepage.HomepageFragment;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;

/* loaded from: classes7.dex */
public class lbk implements TBSwipeRefreshLayout.OnPullRefreshListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lbi f30453a;

    static {
        kge.a(-1330447125);
        kge.a(-1272151845);
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
    public void onPullDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
    public void onRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
        }
    }

    public lbk(lbo lboVar) {
        this.f30453a = new lbi(lboVar);
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
    public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
            return;
        }
        if (refreshState2 == TBRefreshHeader.RefreshState.SECOND_FLOOR_END) {
            ksp.c("PopLayer_And_ucp_trigger", "进入二楼了触发pop隐藏");
            b();
        }
        if (refreshState != TBRefreshHeader.RefreshState.SECOND_FLOOR_END || refreshState2 != TBRefreshHeader.RefreshState.NONE || !(TBMainHost.a().getCurrentFragment() instanceof HomepageFragment)) {
            return;
        }
        ksp.c("PopLayer_And_ucp_trigger", "进入二楼了触发pop展示");
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f30453a.b(lbi.POP_LAYER_RECOMMEND_TAB_NAME);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("actionType", (Object) "backToHome");
        this.f30453a.a(lbj.RECOMMEND_SCENE, "", jSONObject);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f30453a.b(WeexSecondFloorFragment.class.getSimpleName());
        this.f30453a.a(WeexSecondFloorFragment.class.getName(), "", null);
    }
}
