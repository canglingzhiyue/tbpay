package com.taobao.search.musie;

import android.app.Activity;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.xsl.module.XslDatasource;
import com.taobao.android.xsearchplugin.muise.MuiseHolderContainer;
import com.taobao.android.xsearchplugin.muise.c;
import com.taobao.search.common.util.k;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.Map;
import tb.iny;
import tb.ipq;
import tb.iru;
import tb.ise;
import tb.iso;
import tb.isp;
import tb.isr;
import tb.ist;
import tb.ium;
import tb.jyx;
import tb.kge;
import tb.nnd;
import tb.noa;

/* loaded from: classes7.dex */
public class p extends c<iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>>> implements GestureDetector.OnGestureListener, MuiseHolderContainer.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ise<ipq, p> CREATOR;
    private String m;
    private String n;
    private MuiseCellBean o;
    private MuiseHolderContainer p;
    private GestureDetector q;

    public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1991498227:
                return new Integer(super.d((MuiseBean) objArr[0], (MuiseBean) objArr[1]));
            case -1544682378:
                return super.e((MuiseBean) objArr[0], (MuiseBean) objArr[1]);
            case -1321168327:
                return new Boolean(super.b((String) objArr[0], (JSONObject) objArr[1], (isr.c.a) objArr[2], (isr.c.a) objArr[3]));
            case -604580575:
                super.a((com.taobao.android.xsearchplugin.muise.a) objArr[0]);
                return null;
            case 66974264:
                super.onRenderSuccess((com.taobao.android.weex_framework.p) objArr[0]);
                return null;
            case 71597779:
                super.L();
                return null;
            case 93762287:
                return new Boolean(super.d());
            case 118043724:
                super.a(((Number) objArr[0]).intValue(), (MuiseCellBean) objArr[1]);
                return null;
            case 300463397:
                super.a((com.taobao.android.weex_framework.p) objArr[0]);
                return null;
            case 410220614:
                return new Boolean(super.a((ListStyle) objArr[0], (MuiseCellBean) objArr[1]));
            case 511551807:
                super.a((p) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 1044918576:
                return new Integer(super.a((MuiseBean) objArr[0], (MuiseBean) objArr[1]));
            case 1464435420:
                super.b((MuiseBean) objArr[0], (MuiseBean) objArr[1]);
                return null;
            case 1544639176:
                super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1883952238:
                return new Integer(super.c((MuiseBean) objArr[0], (MuiseBean) objArr[1]));
            case 2094523359:
                super.onRefreshSuccess((com.taobao.android.weex_framework.p) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b398c1c3", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public /* synthetic */ int a(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3e483130", new Object[]{this, muiseBean, muiseCellBean})).intValue() : d2(muiseBean, muiseCellBean);
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public /* synthetic */ void b(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574982dc", new Object[]{this, muiseBean, muiseCellBean});
        } else {
            c2(muiseBean, muiseCellBean);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public /* synthetic */ int c(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("704ad46e", new Object[]{this, muiseBean, muiseCellBean})).intValue() : b2(muiseBean, muiseCellBean);
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public /* synthetic */ int d(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("894c260d", new Object[]{this, muiseBean, muiseCellBean})).intValue() : e2(muiseBean, muiseCellBean);
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public /* synthetic */ ListStyle e(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ListStyle) ipChange.ipc$dispatch("a3ee0476", new Object[]{this, muiseBean, muiseCellBean}) : a2(muiseBean, muiseCellBean);
    }

    static {
        kge.a(737371840);
        kge.a(276508641);
        kge.a(1204268671);
        CREATOR = new ise<ipq, p>() { // from class: com.taobao.search.musie.p.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public p a(ipq ipqVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("fa5e3e0b", new Object[]{this, ipqVar}) : new p(ipqVar.c, ipqVar.e, ipqVar.d, ipqVar.b, ipqVar.f, ipqVar.f29218a);
            }
        };
    }

    public p(Activity activity, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar, ium iumVar, ListStyle listStyle, ViewGroup viewGroup, int i) {
        super(activity, iruVar, iumVar, listStyle, viewGroup, i);
        this.m = "";
        this.n = "";
        this.p = (MuiseHolderContainer) this.itemView;
        this.p.setHeightChangeListener(this);
        if (com.taobao.search.common.util.r.aX()) {
            this.q = new GestureDetector(getActivity().getApplicationContext(), this);
            ((com.taobao.android.searchbaseframe.uikit.b) this.itemView).setOnInterceptTouchEventListener(new com.taobao.search.common.util.e(this.q));
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public void a(com.taobao.android.xsearchplugin.muise.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf6d521", new Object[]{this, aVar});
            return;
        }
        super.a(aVar);
        new d().a(aVar, ((iru) j()).f().getBooleanParam(noa.KEY_SEARCH_ELDER_HOME_OPEN));
    }

    @Override // com.taobao.android.xsearchplugin.muise.c, com.taobao.android.xsearchplugin.muise.b, tb.itd
    public void a(int i, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709344c", new Object[]{this, new Integer(i), muiseCellBean});
            return;
        }
        if (i == 0) {
            X();
        }
        this.o = muiseCellBean;
        MuiseCellBean muiseCellBean2 = this.o;
        String str = "";
        this.m = muiseCellBean2 != null ? muiseCellBean2.type : str;
        TemplateBean a2 = this.f16257a.a(c(this.o));
        if (a2 != null) {
            str = a2.version;
        }
        this.n = str;
        super.a(i, muiseCellBean);
    }

    @Override // com.taobao.android.xsearchplugin.muise.c, com.taobao.android.xsearchplugin.muise.k
    public void a(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e8b525", new Object[]{this, pVar});
            return;
        }
        super.a(pVar);
        pVar.addInstanceEnv("tb2021", "true");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.android.xsearchplugin.muise.c, com.taobao.android.xsearchplugin.muise.b
    public boolean a(ListStyle listStyle, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18737846", new Object[]{this, listStyle, muiseCellBean})).booleanValue() : super.a(listStyle, muiseCellBean) || U();
    }

    private boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c35260", new Object[]{this})).booleanValue();
        }
        if (l() == null) {
            return false;
        }
        Object obj = l().mExtraObj.get("fullSpan");
        return (obj instanceof Boolean) && ((Boolean) obj).booleanValue();
    }

    @Override // com.taobao.android.xsearchplugin.muise.c
    public void a(Map<String, Object> map, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cef3c8a", new Object[]{this, map, muiseCellBean});
            return;
        }
        map.put("pageName", com.ut.mini.l.getInstance().getCurrentPageName());
        map.put("rainbow", com.taobao.search.rainbow.a.c());
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(jyx.DIMENSION_BUSINESS_NAME, com.taobao.search.sf.o.BIZ_TBSEARCH);
        arrayMap.put("tItemType", this.m);
        arrayMap.put("sversion", noa.SERVER_VERSION_VALUE);
        arrayMap.put(jyx.DIMENSION_JSVERSION, this.n);
        try {
            arrayMap.put("rainbow", com.taobao.search.rainbow.a.c(String.format("tbAndroid%sEnableLT", this.m)));
        } catch (Exception unused) {
            com.taobao.android.searchbaseframe.util.k.a("RcmdMuiseViewHolder", "getBucketIdFail");
        }
        map.put("hubbleInfo", arrayMap);
        BaseSearchResult baseSearchResult = (BaseSearchResult) ((iru) j()).d().getTotalSearchResult();
        if (baseSearchResult != null) {
            Map<String, String> map2 = baseSearchResult.getMainInfo().pageTraceArgs;
            if (map2 != null) {
                String str = map2.get("spm-cnt");
                if (str == null) {
                    str = "";
                }
                map.put("spm", str);
            }
            map.put(k.a.PARAM_KEY_FIRST_RN, baseSearchResult.getMainInfo().rn);
        }
        MuiseCellBean muiseCellBean2 = this.o;
        if (muiseCellBean2 != null) {
            map.put("srp_seq", String.valueOf(muiseCellBean2.pageNo));
            map.put("srp_pos", String.valueOf(this.o.pagePos));
        }
        map.put(noa.KEY_EDITION_CODE, com.taobao.search.mmd.util.g.d());
        map.put("elderHome", String.valueOf(com.taobao.search.mmd.util.j.INSTANCE.a()));
        boolean booleanParam = ((iru) j()).f().getBooleanParam(noa.KEY_SEARCH_ELDER_HOME_OPEN);
        com.taobao.search.common.util.m mVar = com.taobao.search.common.util.m.INSTANCE;
        map.put("fontSizeLevel", Integer.valueOf(com.taobao.search.common.util.m.a(booleanParam)));
        map.put(noa.KEY_GRAY_HAIR, String.valueOf(booleanParam));
    }

    @Override // com.taobao.android.xsearchplugin.muise.c, tb.irw
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (l() == null) {
            return false;
        }
        if (l().videoForcePlay) {
            return true;
        }
        return super.d() && nnd.a(((iru) j()).d());
    }

    @Override // com.taobao.android.xsearchplugin.muise.c, com.taobao.android.xsearchplugin.weex.weex.h
    public boolean b(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1409239", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        boolean b = super.b(str, jSONObject, aVar, aVar2);
        if (!b) {
            char c = 65535;
            switch (str.hashCode()) {
                case -1688932813:
                    if (str.equals("clearParams")) {
                        c = 3;
                        break;
                    }
                    break;
                case -956863702:
                    if (str.equals("removeParams")) {
                        c = 2;
                        break;
                    }
                    break;
                case -102588025:
                    if (str.equals("addParams")) {
                        c = 1;
                        break;
                    }
                    break;
                case 485970056:
                    if (str.equals("setParams")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a(jSONObject);
                return true;
            } else if (c == 1) {
                b(jSONObject);
                return true;
            } else if (c == 2) {
                c(jSONObject);
                return true;
            } else if (c == 3) {
                d(jSONObject);
                return true;
            }
        }
        return b;
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                V().setParam(entry.getKey(), entry.getValue().toString());
            }
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "params");
            for (int i = 0; i < a2.size(); i++) {
                JSONObject jSONObject2 = a2.getJSONObject(i);
                if (jSONObject2 != null) {
                    V().addParam(jSONObject2.getString("key"), jSONObject2.getString("value"));
                }
            }
        }
    }

    private void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "params");
            for (int i = 0; i < a2.size(); i++) {
                JSONObject jSONObject2 = a2.getJSONObject(i);
                if (jSONObject2 != null) {
                    V().removeParam(jSONObject2.getString("key"), jSONObject2.getString("value"));
                }
            }
        }
    }

    private void d(JSONObject jSONObject) {
        JSONArray a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "keys")) != null) {
            for (int i = 0; i < a2.size(); i++) {
                String string = a2.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    V().clearParam(string);
                }
            }
        }
    }

    private com.taobao.android.searchbaseframe.datasource.a V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.searchbaseframe.datasource.a) ipChange.ipc$dispatch("f66ad5a9", new Object[]{this});
        }
        if (j() != 0) {
            return ((iru) j()).d();
        }
        return null;
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[]{this});
        } else if (l() == null || !(l() instanceof MuiseCellBean) || !(V() instanceof XslDatasource)) {
        } else {
            int m = m();
            XslDatasource xslDatasource = (XslDatasource) V();
            postEvent(iso.a(xslDatasource.getCurrentTabIndex(), m));
            a(m, xslDatasource.getCurrentTabIndex(), l().mMuiseBean.id);
        }
    }

    private void a(int i, int i2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26197cfc", new Object[]{this, new Integer(i), new Integer(i2), new Long(j)});
            return;
        }
        PartnerRecyclerView W = W();
        if (W == null || !W.isScrollDown()) {
            return;
        }
        postEvent(new ist(W.getScrollSpeed(), i2, i, j));
    }

    private PartnerRecyclerView W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PartnerRecyclerView) ipChange.ipc$dispatch("9ea888da", new Object[]{this});
        }
        ViewGroup viewGroup = (ViewGroup) this.itemView.getParent();
        if (!(viewGroup instanceof PartnerRecyclerView)) {
            return null;
        }
        return (PartnerRecyclerView) viewGroup;
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
        } else if (l() == null || !(l() instanceof MuiseCellBean) || !(V() instanceof XslDatasource)) {
        } else {
            postEvent(iso.b(((XslDatasource) V()).getCurrentTabIndex(), m()));
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.c, com.taobao.android.xsearchplugin.muise.b, com.taobao.android.weex_framework.g
    public void onRenderSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            return;
        }
        this.p.setObserveHeightChange(true);
        super.onRenderSuccess(pVar);
        if (m() != 0) {
            return;
        }
        Y();
    }

    @Override // com.taobao.android.xsearchplugin.muise.c, com.taobao.android.xsearchplugin.muise.b, com.taobao.android.weex_framework.g
    public void onRefreshSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
            return;
        }
        this.p.setObserveHeightChange(true);
        super.onRefreshSuccess(pVar);
    }

    @Override // com.taobao.android.xsearchplugin.muise.c, com.taobao.android.xsearchplugin.muise.b
    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
            return;
        }
        super.L();
        ((iru) j()).d().postEvent(new isp());
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.a(i, i2);
        if (i == i2) {
            return;
        }
        ((iru) j()).d().postEvent(new isp());
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public ListStyle a2(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("e9b4e403", new Object[]{this, muiseBean, muiseCellBean});
        }
        if (com.taobao.search.common.util.r.az()) {
            return super.e(muiseBean, (MuiseBean) muiseCellBean);
        }
        ListStyle e = super.e(muiseBean, (MuiseBean) muiseCellBean);
        return a(e, muiseCellBean) ? ListStyle.LIST : e;
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public int b2(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ead251ba", new Object[]{this, muiseBean, muiseCellBean})).intValue();
        }
        if (com.taobao.search.common.util.r.az()) {
            return super.c(muiseBean, (MuiseBean) muiseCellBean);
        }
        return a2(muiseBean, muiseCellBean) == ListStyle.LIST ? a(muiseBean) : b(muiseBean);
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public void c2(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49c1f08", new Object[]{this, muiseBean, muiseCellBean});
            return;
        }
        this.p.setObserveHeightChange(false);
        super.b(muiseBean, (MuiseBean) muiseCellBean);
    }

    /* renamed from: d  reason: avoid collision after fix types in other method */
    public int d2(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e65ec3c", new Object[]{this, muiseBean, muiseCellBean})).intValue();
        }
        if (com.taobao.search.common.util.r.az()) {
            return super.a(muiseBean, (MuiseBean) muiseCellBean);
        }
        if (muiseBean == null) {
            return -1;
        }
        return muiseBean.getCachedHeight(a2(muiseBean, muiseCellBean));
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public void a(MuiseCellBean muiseCellBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac062784", new Object[]{this, muiseCellBean, new Integer(i)});
            return;
        }
        this.p.setObserveHeightChange(false);
        super.a((p) muiseCellBean, i);
    }

    public final int T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b53ace", new Object[]{this})).intValue();
        }
        try {
            return getLayoutPosition() - ((TRecyclerView) ((iny) getParent()).B()).getHeaderViewsCount();
        } catch (Throwable unused) {
            return getLayoutPosition();
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.MuiseHolderContainer.a
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            N();
        }
    }

    /* renamed from: e  reason: avoid collision after fix types in other method */
    public int e2(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        TemplateBean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("782fb97d", new Object[]{this, muiseBean, muiseCellBean})).intValue();
        }
        if (com.taobao.search.common.util.r.az()) {
            return super.d(muiseBean, (MuiseBean) muiseCellBean);
        }
        if (muiseBean == null || (a2 = this.f16257a.a(muiseBean)) == null) {
            return 0;
        }
        return a(a2(muiseBean, muiseCellBean), muiseCellBean) ? a2.listHeight : a2.midHeight;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
        }
        if (com.taobao.search.common.util.r.aX()) {
            com.taobao.search.sf.realtimetag.d.a(l(), (Map<String, String>) null, getActivity(), T(), ((iru) j()).d());
        }
        return false;
    }

    private void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed98df", new Object[]{this});
            return;
        }
        com.taobao.android.searchbaseframe.track.d firstRequestPerf = ((iru) j()).d().getFirstRequestPerf();
        if (firstRequestPerf == null || firstRequestPerf.r) {
            return;
        }
        firstRequestPerf.t = System.currentTimeMillis();
    }

    private void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fbb060", new Object[]{this});
            return;
        }
        com.taobao.android.searchbaseframe.datasource.impl.a d = ((iru) j()).d();
        com.taobao.android.searchbaseframe.track.d firstRequestPerf = d.getFirstRequestPerf();
        if (firstRequestPerf == null || firstRequestPerf.r) {
            return;
        }
        firstRequestPerf.u = System.currentTimeMillis();
        firstRequestPerf.r = true;
        if (d.perfStaticsCallback == null) {
            return;
        }
        d.perfStaticsCallback.a(firstRequestPerf.a());
    }
}
