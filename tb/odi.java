package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.business.getconfig.a;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.tao.topmultitab.c;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;

/* loaded from: classes7.dex */
public class odi implements nrt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ohp f31943a;
    private final lbo b;
    private final Activity c;

    static {
        kge.a(-1494068327);
        kge.a(-474408725);
    }

    public odi(Activity activity, ohp ohpVar, lbo lboVar) {
        this.f31943a = ohpVar;
        this.b = lboVar;
        this.c = activity;
    }

    @Override // tb.nrt
    public boolean a(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8961214", new Object[]{this, refreshState, refreshState2})).booleanValue() : refreshState2 == TBRefreshHeader.RefreshState.SECOND_FLOOR_END;
    }

    @Override // tb.nrt
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8eef2e", new Object[]{this, aVar});
            return;
        }
        this.f31943a.a(0, "second_floor_commit_track", null);
        b(aVar);
        c.a().e().setVisibility(8);
        this.f31943a.d();
        this.b.m().b();
        com.taobao.homepage.page.weexv2.a.a(true);
        HomePageUtility.a(this.c);
        e.e("SecondFloorEndStatusProcessor", "当前在二楼");
    }

    private void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d309156f", new Object[]{this, aVar});
            return;
        }
        oht.a();
        oht.a(oht.TARCK_KEY_PAGE_MINI_APP_HOME, aVar.c());
    }
}
