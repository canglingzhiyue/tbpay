package tb;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.business.getconfig.a;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;

/* loaded from: classes7.dex */
public class odj implements nrt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lbo f31944a;
    private final Activity b;

    static {
        kge.a(116653426);
        kge.a(-474408725);
    }

    public odj(lbo lboVar, Activity activity) {
        this.f31944a = lboVar;
        this.b = activity;
    }

    @Override // tb.nrt
    public boolean a(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8961214", new Object[]{this, refreshState, refreshState2})).booleanValue() : refreshState2 == TBRefreshHeader.RefreshState.SECOND_FLOOR_START;
    }

    @Override // tb.nrt
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8eef2e", new Object[]{this, aVar});
            return;
        }
        a();
        b();
        ohu.a();
        e.e("StartEnterSecondFloorStatusProcessor", "开始进入二楼");
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ohv e = this.f31944a.e();
        if (e == null) {
            e.e("StartEnterSecondFloorStatusProcessor", "homeSearchBarManager == null");
        } else {
            e.a(8);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(odf.KEY_UPDATE_GUANG_GUANG_TABICON);
        intent.putExtra("show", false);
        LocalBroadcastManager.getInstance(this.b).sendBroadcast(intent);
    }
}
