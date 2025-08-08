package tb;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.j;
import com.taobao.homepage.business.getconfig.a;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.tao.topmultitab.c;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;

/* loaded from: classes7.dex */
public class odf implements nrt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_UPDATE_GUANG_GUANG_TABICON = "UpdateGuangGuangTabIconVisibility";
    public static final String KEY_UPDATE_GUANG_GUANG_TABICON_ACTION = "show";

    /* renamed from: a  reason: collision with root package name */
    private final lbo f31939a;
    private final Activity b;

    static {
        kge.a(-1878117285);
        kge.a(-474408725);
    }

    public odf(Activity activity, lbo lboVar) {
        this.f31939a = lboVar;
        this.b = activity;
    }

    @Override // tb.nrt
    public boolean a(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8961214", new Object[]{this, refreshState, refreshState2})).booleanValue() : refreshState == TBRefreshHeader.RefreshState.SECOND_FLOOR_END && refreshState2 == TBRefreshHeader.RefreshState.NONE;
    }

    @Override // tb.nrt
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8eef2e", new Object[]{this, aVar});
        } else if (!com.taobao.homepage.page.weexv2.a.d()) {
        } else {
            b(aVar);
            a();
            this.f31939a.m().a();
            d();
            c();
            ohu.b();
            b();
            com.taobao.homepage.page.weexv2.a.a(false);
            HomePageUtility.a(this.b);
            e.e("BackToHomeStatusProcessor", "从二楼回首页");
        }
    }

    private void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d309156f", new Object[]{this, aVar});
            return;
        }
        oht.a();
        oht.a("Page_Home", aVar.c());
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!StringUtils.equals(j.a("homePageBackRequestEnable", "true"), "true")) {
        } else {
            oqc.a().a(new String[]{oqc.a().l(), oqc.a().m()});
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(KEY_UPDATE_GUANG_GUANG_TABICON);
        intent.putExtra("show", true);
        LocalBroadcastManager.getInstance(this.b).sendBroadcast(intent);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ViewGroup e = c.a().e();
        int visibility = e.getVisibility();
        e.e("BackToHomeStatusProcessor", "showViewPagerContainer,current visibility: " + visibility);
        if (visibility == 0) {
            return;
        }
        e.setVisibility(0);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ohv e = this.f31939a.e();
        if (e == null) {
            e.e("BackToHomeStatusProcessor", "homeSearchBarManager == null");
        } else {
            e.a(0);
        }
    }
}
