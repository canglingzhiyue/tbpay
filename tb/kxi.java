package tb;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.homepage.datasource.OnDataSourceUpdatedListener;
import com.taobao.homepage.utils.NewRangerOptions;
import com.taobao.homepage.utils.f;
import com.taobao.homepage.utils.h;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.topmultitab.c;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class kxi implements j<kwy> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lbo f30376a;

    static {
        kge.a(-120505313);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(kwy kwyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, kwyVar}) : a(kwyVar);
    }

    public kxi(lbo lboVar) {
        this.f30376a = lboVar;
    }

    public i a(kwy kwyVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("a1572764", new Object[]{this, kwyVar});
        }
        b(kwyVar);
        if (kwyVar.h == null) {
            return i.FAILURE;
        }
        List<SectionModel> g = kwyVar.h.g(oqc.a().l());
        List<SectionModel> g2 = kwyVar.h.g(oqc.a().m());
        if ((g != null && !g.isEmpty()) || (g2 != null && !g2.isEmpty())) {
            z = false;
        }
        if (z) {
            return i.FAILURE;
        }
        try {
            if (kwyVar.a() == OnDataSourceUpdatedListener.DataSourceType.DS_TYPE_CACHED_CONTENT) {
                alj.a().a("homepage", "homePageCacheRender");
                ksp.a("Home.NDFSubscriber", "NewDataRefreshSubscriber.homePageCacheRender");
            }
            if (kwyVar.c == 0) {
                a(this.f30376a, kwyVar.h.b(oqc.a().l()).getExt());
            }
        } catch (Throwable unused) {
        }
        lao.a(kwyVar.a(), this.f30376a);
        return i.SUCCESS;
    }

    private void b(kwy kwyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0736dac", new Object[]{this, kwyVar});
            return;
        }
        try {
            Activity curActivity = this.f30376a.a().getCurActivity();
            ope opeVar = kwyVar.h;
            if (curActivity != null && opeVar != null) {
                if (c.a().D() && opeVar.d() != null) {
                    kss.a(curActivity, (Map) JSON.parseObject(opeVar.d().toJSONString(), new TypeReference<HashMap<String, String>>() { // from class: tb.kxi.1
                    }, new Feature[0]));
                    kss.a(curActivity, opeVar.e().toJSONString());
                }
                AwesomeGetContainerData b = opeVar.b(ksk.NEW_FACE_PARENT.f30287a);
                JSONObject rangerParams = b == null ? null : b.getRangerParams();
                if (rangerParams != null) {
                    h.a(curActivity, rangerParams, new NewRangerOptions());
                    f.a(rangerParams);
                }
                if (kwyVar.c != 0) {
                    return;
                }
                a(opeVar.f());
            }
        } catch (Throwable th) {
            e.b("Home.NDFSubscriber", th, new String[0]);
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            for (String str : jSONObject.keySet()) {
                UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty(str, jSONObject.getString(str));
            }
        }
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    public static void a(lbo lboVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fa88051", new Object[]{lboVar, jSONObject});
            return;
        }
        try {
            String string = jSONObject.getString(com.taobao.tao.infoflow.multitab.e.KEY_BG_COLOR);
            if (!TextUtils.isEmpty(string)) {
                lboVar.a().getRootView().setBackgroundColor(com.taobao.android.tbtheme.c.a(2, Color.parseColor(string)));
            } else {
                lboVar.a().getRootView().setBackgroundResource(R.color.homepage_background);
            }
        } catch (Throwable unused) {
            lboVar.a().getRootView().setBackgroundResource(R.color.homepage_background);
        }
    }
}
