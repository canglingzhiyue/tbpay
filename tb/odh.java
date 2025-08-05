package tb;

import android.app.Activity;
import android.os.Vibrator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.business.getconfig.a;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;

/* loaded from: classes7.dex */
public class odh implements nrt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ohp f31942a;
    private final Activity b;

    static {
        kge.a(946787462);
        kge.a(-474408725);
    }

    public odh(ohp ohpVar, Activity activity) {
        this.f31942a = ohpVar;
        this.b = activity;
    }

    @Override // tb.nrt
    public boolean a(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8961214", new Object[]{this, refreshState, refreshState2})).booleanValue() : refreshState == TBRefreshHeader.RefreshState.RELEASE_TO_REFRESH && refreshState2 == TBRefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR;
    }

    @Override // tb.nrt
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8eef2e", new Object[]{this, aVar});
            return;
        }
        a(this.b, 50L);
        this.f31942a.a(0, "second_floor_fetch_mtop_event", null);
        e.e("PrepareToSecondFloorStatusProcessor", "当前是准备进入二楼状态");
    }

    private void a(Activity activity, long j) {
        Vibrator vibrator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb084a", new Object[]{this, activity, new Long(j)});
        } else if (!com.taobao.homepage.page.weexv2.a.c() || activity == null || (vibrator = (Vibrator) activity.getSystemService("vibrator")) == null) {
        } else {
            vibrator.vibrate(j);
        }
    }
}
