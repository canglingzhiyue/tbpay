package tb;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.android.weex_framework.p;
import com.taobao.android.xsearchplugin.muise.b;
import com.taobao.android.xsearchplugin.muise.f;
import com.taobao.android.xsearchplugin.weex.weex.h;
import com.taobao.monitor.procedure.v;
import com.taobao.search.common.util.r;
import com.taobao.search.musie.d;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.MuiseActivateCellBean;
import com.taobao.search.searchdoor.sf.widgets.e;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.isr;

/* loaded from: classes7.dex */
public class nqm extends b<MuiseActivateCellBean, e> implements com.taobao.android.xsearchplugin.muise.e, h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    public static final int LIST_STUB_HEIGHT;
    public static final int WF_STUB_HEIGHT;

    public static /* synthetic */ Object ipc$super(nqm nqmVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1795038358) {
            super.a((View) objArr[0]);
            return null;
        } else if (hashCode == 66056653) {
            super.F();
            return null;
        } else if (hashCode != 113156224) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.y();
            return null;
        }
    }

    @Override // tb.itd
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "MuiseActivateCellViewHolder";
    }

    @Override // com.taobao.android.xsearchplugin.muise.k
    public void a(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e8b525", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public /* synthetic */ MuiseBean e(MuiseActivateCellBean muiseActivateCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MuiseBean) ipChange.ipc$dispatch("7f384101", new Object[]{this, muiseActivateCellBean}) : a(muiseActivateCellBean);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqm(Activity activity, ium parent, ListStyle style, ViewGroup viewGroup, int i, e eVar) {
        super(activity, parent, style, viewGroup, i, eVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(style, "style");
        E();
        if (b() || !r.bi()) {
            return;
        }
        f fVar = (f) (!(activity instanceof f) ? null : activity);
        if (fVar == null) {
            return;
        }
        fVar.a(this);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-24877154);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(360566742);
        kge.a(502437767);
        kge.a(1351750140);
        Companion = new a(null);
        LIST_STUB_HEIGHT = j.a(128.0f);
        WF_STUB_HEIGHT = j.a(172.0f);
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        super.F();
        View view = this.e;
        if (view == null) {
            return;
        }
        view.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_IGNORE);
    }

    private final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Activity activity = getActivity();
        if (!(activity instanceof f)) {
            activity = null;
        }
        f fVar = (f) activity;
        return fVar != null && fVar.g();
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        Activity activity = getActivity();
        imn core = getCore();
        nqm nqmVar = this;
        nqm nqmVar2 = this;
        e j = j();
        if (j == null) {
            q.a();
        }
        com.taobao.search.searchdoor.sf.widgets.b b = j.b();
        q.a((Object) b, "model!!.searchDoorHelper");
        nqx nqxVar = new nqx(activity, core, nqmVar, nqmVar2, b);
        a((com.taobao.android.xsearchplugin.muise.a) nqxVar);
        d dVar = new d();
        e j2 = j();
        if (j2 == null) {
            q.a();
        }
        dVar.a(nqxVar, q.a((Object) "true", (Object) j2.a().a(noa.KEY_SEARCH_ELDER_HOME_OPEN)));
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        super.a(view);
        if (!b() || view == null) {
            return;
        }
        view.setBackgroundResource(R.color.tbsearch_main_card_bg_night);
    }

    @Override // com.taobao.android.xsearchplugin.muise.b, tb.itd
    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        super.y();
        if (!r.bi()) {
            return;
        }
        Activity activity = getActivity();
        if (!(activity instanceof f)) {
            activity = null;
        }
        f fVar = (f) activity;
        if (fVar == null) {
            return;
        }
        fVar.b(this);
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public int a(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b508794", new Object[]{this, muiseBean})).intValue() : LIST_STUB_HEIGHT;
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public int b(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("115452f3", new Object[]{this, muiseBean})).intValue() : WF_STUB_HEIGHT;
    }

    public MuiseBean a(MuiseActivateCellBean bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MuiseBean) ipChange.ipc$dispatch("9bebc237", new Object[]{this, bean});
        }
        q.c(bean, "bean");
        return bean.getMuiseBean();
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public Map<String, Object> a(MuiseActivateCellBean bean, int i, boolean z, ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f9fcbe73", new Object[]{this, bean, new Integer(i), new Boolean(z), listStyle});
        }
        q.c(bean, "bean");
        MuiseBean muiseBean = bean.getMuiseBean();
        HashMap hashMap = new HashMap();
        String str = muiseBean.type;
        q.a((Object) str, "muiseBean.type");
        hashMap.put("__nxType__", str);
        JSONObject jSONObject = muiseBean.model;
        q.a((Object) jSONObject, "muiseBean.model");
        hashMap.put("model", jSONObject);
        e model = j();
        q.a((Object) model, "model");
        HashMap<String, Object> initStatus = model.a().a(bean.suggestRn, bean.tab, bean.type);
        q.a((Object) initStatus, "initStatus");
        initStatus.put("videoCanAutoPlay", String.valueOf(nnd.a()));
        a(initStatus);
        hashMap.put("status", initStatus);
        return hashMap;
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.h
    public boolean b(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1409239", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        if (str != null && str.hashCode() == -97777589 && str.equals("scrollCellToTop")) {
            a(jSONObject != null ? jSONObject.getIntValue("offset") : 0);
        }
        return false;
    }

    public void a(HashMap<String, Object> status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, status});
            return;
        }
        q.c(status, "status");
        HashMap<String, Object> hashMap = status;
        e model = j();
        q.a((Object) model, "model");
        SearchDoorContext a2 = model.a();
        q.a((Object) a2, "model.searchDoorContext");
        hashMap.put("channelSrp", a2.f());
        com.taobao.search.musie.r.a(hashMap, getActivity());
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.h
    public boolean a(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d34d2c5a", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        if (str == null) {
            q.a();
        }
        postEvent(isr.c.a(str, jSONObject, aVar, aVar2));
        return true;
    }

    private final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        View itemView = this.itemView;
        q.a((Object) itemView, "itemView");
        ViewParent parent = itemView.getParent();
        if (!(parent instanceof RecyclerView)) {
            parent = null;
        }
        RecyclerView recyclerView = (RecyclerView) parent;
        if (recyclerView == null) {
            return;
        }
        View itemView2 = this.itemView;
        q.a((Object) itemView2, "itemView");
        int top = itemView2.getTop();
        if (top > 0) {
            return;
        }
        recyclerView.scrollBy(0, top + i);
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public void ag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab470dad", new Object[]{this});
            return;
        }
        G();
        H();
    }

    @Override // com.taobao.android.xsearchplugin.muise.e
    public void onHitDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95f2594", new Object[]{this});
        } else {
            ag();
        }
    }
}
