package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.homepage.datasource.OnDataSourceUpdatedListener;
import com.taobao.homepage.datasource.a;
import com.taobao.homepage.datasource.b;
import com.taobao.homepage.utils.NewRangerOptions;
import com.taobao.homepage.utils.f;
import com.taobao.homepage.utils.h;
import com.taobao.homepage.view.widgets.bgcontainer.c;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class kwz implements j<kwy> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lbo f30367a;
    private final int c = 10;
    private Map<String, Integer> b = new HashMap();

    static {
        kge.a(-726887590);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(kwy kwyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, kwyVar}) : a(kwyVar);
    }

    public kwz(lbo lboVar) {
        this.f30367a = lboVar;
    }

    public i a(kwy kwyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("a1572764", new Object[]{this, kwyVar});
        }
        if (kwyVar.d) {
            return i.FAILURE;
        }
        String a2 = com.taobao.android.home.component.utils.i.a();
        if (!TextUtils.equals(a2, kwyVar.c())) {
            return i.FAILURE;
        }
        e.b("Home.DSRSubscriber", "Receive data source refreshed event: ", kwyVar.a().toString());
        a b = lbo.b();
        if (!kwyVar.b()) {
            return i.FAILURE;
        }
        List<SectionModel> b2 = b.b(a2);
        if (kwyVar.a().isPresentedAsContent()) {
            b a3 = b.a(a2);
            if (a()) {
                kss.a(this.f30367a.a().getCurActivity(), a3.a());
                kss.a(this.f30367a.a().getCurActivity(), a3.c());
            }
            if (kwyVar.a().isHomeLoadContent()) {
                Map<String, Object> b3 = a3.b();
                NewRangerOptions newRangerOptions = new NewRangerOptions();
                Activity curActivity = this.f30367a.a().getCurActivity();
                if (curActivity != null) {
                    h.a(curActivity, b3, newRangerOptions);
                }
                f.a(b3);
            }
        }
        if (b2.isEmpty()) {
            return i.FAILURE;
        }
        this.b.put(a2, Integer.valueOf(b2.size()));
        if (kwyVar.a() == OnDataSourceUpdatedListener.DataSourceType.DS_TYPE_CACHED_CONTENT) {
            alj.a().a("homepage", "homePageCacheRender");
            ksp.a("Home.DSRSubscriber", "HomePageRecyclerAdapter.homePageCacheRender");
        }
        c d = this.f30367a.d();
        if (d != null) {
            d.a(kwyVar.g, b.f17235a.get(kwyVar.c()));
        }
        lao.a(kwyVar.a(), this.f30367a);
        return i.SUCCESS;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : com.taobao.tao.topmultitab.c.a().D();
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
