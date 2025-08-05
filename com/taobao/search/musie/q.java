package com.taobao.search.musie;

import android.app.Activity;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.common.util.k;
import com.taobao.search.musie.component.filter.TbFilter;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.datasource.c;
import java.util.Iterator;
import java.util.Map;
import tb.hth;
import tb.ipk;
import tb.irp;
import tb.iru;
import tb.ise;
import tb.isr;
import tb.isv;
import tb.itl;
import tb.itn;
import tb.ium;
import tb.iuo;
import tb.iur;
import tb.jyx;
import tb.kge;
import tb.noa;
import tb.noz;
import tb.ntb;
import tb.ntd;
import tb.nva;
import tb.nvb;
import tb.nvc;
import tb.nxb;
import tb.nxd;

/* loaded from: classes7.dex */
public class q extends com.taobao.android.xsearchplugin.muise.o implements GestureDetector.OnGestureListener, com.taobao.android.xsearchplugin.muise.l, com.taobao.search.refactor.a, itl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ise<irp, ? extends itn> CREATOR;
    private String b;
    private String c;
    private GestureDetector d;
    private ntd e;
    private boolean f;

    public static /* synthetic */ Object ipc$super(q qVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1321168327:
                return new Boolean(super.b((String) objArr[0], (JSONObject) objArr[1], (isr.c.a) objArr[2], (isr.c.a) objArr[3]));
            case -1261951496:
                return super.getModel();
            case -749917094:
                return new Boolean(super.a((String) objArr[0], (JSONObject) objArr[1], (isr.c.a) objArr[2], (isr.c.a) objArr[3]));
            case -638084833:
                return super.s();
            case -506257491:
                super.findAllViews();
                return null;
            case -504750508:
                return super.c((MuiseBean) objArr[0]);
            case -211767613:
                super.onComponentDestroy();
                return null;
            case 189826977:
                super.a((MuiseBean) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.itl
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.itl
    public void a(boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1901d4", new Object[]{this, new Boolean(z), new Float(f)});
        }
    }

    @Override // tb.itl
    public void aG_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b4c520", new Object[]{this});
        }
    }

    @Override // tb.itl
    public void aH_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b699dbf", new Object[]{this});
        }
    }

    @Override // tb.itl
    public com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a) ipChange.ipc$dispatch("26ed9943", new Object[]{this});
        }
        return null;
    }

    @Override // tb.itl
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.itl
    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        return 0;
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

    public static /* synthetic */ void a(q qVar, MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94c651a5", new Object[]{qVar, muiseBean});
        } else {
            super.a(muiseBean);
        }
    }

    public static /* synthetic */ void a(q qVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc803fae", new Object[]{qVar, str});
        } else {
            qVar.a(str);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.l
    public /* synthetic */ iru S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iru) ipChange.ipc$dispatch("a34f0f00", new Object[]{this}) : (iru) super.getModel();
    }

    @Override // com.taobao.android.xsearchplugin.muise.o, tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((MuiseBean) obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.FrameLayout, android.view.View] */
    @Override // com.taobao.android.xsearchplugin.muise.o, tb.ius
    public /* synthetic */ FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : s();
    }

    static {
        kge.a(-1456378089);
        kge.a(1204268671);
        kge.a(733709958);
        kge.a(1988455501);
        kge.a(92233292);
        CREATOR = new ise<irp, itn>() { // from class: com.taobao.search.musie.q.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public itn a(irp irpVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (itn) ipChange.ipc$dispatch("5ff18412", new Object[]{this, irpVar}) : new q(irpVar.c, irpVar.d, irpVar.e, irpVar.f29258a, irpVar.f, irpVar.g);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    public q(Activity activity, ium iumVar, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar, TemplateBean templateBean, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, iruVar, templateBean, viewGroup, iurVar);
        this.f = true;
        if (activity instanceof com.taobao.android.xsearchplugin.muise.f) {
            ((com.taobao.android.xsearchplugin.muise.f) activity).closeViewDarkMode(getView());
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.o
    public void a(com.taobao.android.xsearchplugin.muise.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf6d521", new Object[]{this, aVar});
            return;
        }
        aVar.a((com.taobao.android.xsearchplugin.muise.l) this);
        new d().a(aVar, getModel().f().getBooleanParam(noa.KEY_SEARCH_ELDER_HOME_OPEN));
        if (!(this.mActivity instanceof ipk)) {
            return;
        }
        ((ipk) this.mActivity).d().b(this.b, this.c, aVar);
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        a();
        if (this.e == null) {
            return;
        }
        this.e.a(jSONObject.getJSONObject("options"), jSONObject.getJSONObject("data"), getParent(), this, null);
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        a();
        ntd ntdVar = this.e;
        if (ntdVar == null) {
            return;
        }
        ntdVar.a(jSONObject);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.e != null || !(getActivity() instanceof ntb)) {
        } else {
            this.e = ((ntb) getActivity()).A();
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.o
    public FrameLayout s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("d9f7991f", new Object[]{this});
        }
        if (com.taobao.search.common.util.r.aX()) {
            InterceptFrameLayout interceptFrameLayout = new InterceptFrameLayout(getActivity());
            interceptFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return interceptFrameLayout;
        }
        return super.s();
    }

    @Override // tb.ius, tb.iup
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        super.findAllViews();
        if (!(getView() instanceof com.taobao.android.searchbaseframe.uikit.b)) {
            return;
        }
        this.d = new GestureDetector(getActivity().getApplicationContext(), this);
        ((com.taobao.android.searchbaseframe.uikit.b) getView()).setOnInterceptTouchEventListener(new com.taobao.search.common.util.e(this.d));
    }

    @Override // com.taobao.android.xsearchplugin.muise.o
    public void a(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5087a1", new Object[]{this, muiseBean});
            return;
        }
        this.b = muiseBean != null ? muiseBean.type : "";
        this.c = r().version;
        if (this.f16263a == null && (this.mActivity instanceof ipk) && ((ipk) this.mActivity).d().a(this.b, this.c)) {
            this.f16263a = p();
            this.f16263a.a(false);
            a(this.f16263a);
        }
        d(muiseBean);
    }

    private void d(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d5be9be", new Object[]{this, muiseBean});
            return;
        }
        a(this, muiseBean);
        if (!getModel().d().isSubscribed(this)) {
            getModel().d().subscribe(this);
        }
        hth d = d();
        if (!(d instanceof com.taobao.search.refactor.g)) {
            return;
        }
        ((com.taobao.search.refactor.g) d).a((c) getModel().d(), this);
    }

    @Override // com.taobao.android.xsearchplugin.muise.o
    public Map<String, Object> c(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e1ea1e54", new Object[]{this, muiseBean});
        }
        Map<String, Object> c = super.c(muiseBean);
        BaseSearchResult baseSearchResult = (BaseSearchResult) getModel().d().getLastSearchResult();
        if ((baseSearchResult instanceof CommonSearchResult) && c != null) {
            c.put("iconData", ((CommonSearchResult) baseSearchResult).nxRawIcon);
        }
        a(c, muiseBean);
        return c;
    }

    public void a(Map<String, Object> map, MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9adda4c", new Object[]{this, map, muiseBean});
            return;
        }
        JSONObject jSONObject = muiseBean.pageInfoExtraStatus;
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        jSONObject2.put("pageName", (Object) com.ut.mini.l.getInstance().getCurrentPageName());
        map.put("pageInfo", jSONObject2);
    }

    public void onEventMainThread(isv.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0c64ab", new Object[]{this, bVar});
        } else {
            v();
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.o, tb.iut
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        if (getModel().d().isSubscribed(this)) {
            getModel().d().unsubscribe(this);
        }
        hth d = d();
        if (!(d instanceof com.taobao.search.refactor.g)) {
            return;
        }
        ((com.taobao.search.refactor.g) d).b((c) getModel().d(), this);
    }

    @Override // com.taobao.android.xsearchplugin.muise.o
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        String currentPageName = com.ut.mini.l.getInstance().getCurrentPageName();
        map.put("pageName", currentPageName);
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(jyx.DIMENSION_BUSINESS_NAME, com.taobao.search.sf.o.BIZ_TBSEARCH);
        arrayMap.put("tItemType", this.b);
        arrayMap.put("sversion", noa.SERVER_VERSION_VALUE);
        arrayMap.put(jyx.DIMENSION_JSVERSION, this.c);
        try {
            arrayMap.put("rainbow", com.taobao.search.rainbow.a.c(String.format("tbAndroid%sEnableLT", this.b)));
        } catch (Exception unused) {
            com.taobao.android.searchbaseframe.util.k.a("SearchWeexModWidget", "getBucketIdFail");
        }
        map.put("hubbleInfo", arrayMap);
        String str = null;
        BaseSearchResult baseSearchResult = (BaseSearchResult) getModel().d().getTotalSearchResult();
        if (baseSearchResult != null) {
            Map<String, String> map2 = baseSearchResult.getMainInfo().pageTraceArgs;
            if (map2 != null) {
                str = map2.get("spm-cnt");
                map.put("spm", str == null ? "" : str);
            }
            map.put(k.a.PARAM_KEY_FIRST_RN, baseSearchResult.getMainInfo().rn);
            if (baseSearchResult instanceof CommonSearchResult) {
                map.put("switches", ((CommonSearchResult) baseSearchResult).switches);
            }
        }
        if (baseSearchResult instanceof CommonSearchResult) {
            Object obj = map.get("pageInfo");
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                jSONObject.put("pageName", (Object) currentPageName);
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("spm", (Object) str);
                }
                ResultMainInfoBean mainInfo = baseSearchResult.getMainInfo();
                jSONObject.put("pageTraceArgs", (Object) mainInfo.originalPageTraceArgs);
                jSONObject.put("pageSize", (Object) Integer.valueOf(mainInfo.pageSize));
                jSONObject.put("page", (Object) Integer.valueOf(mainInfo.page));
                jSONObject.put("totalPage", (Object) Integer.valueOf(mainInfo.totalPage));
                jSONObject.put("totalResults", (Object) Integer.valueOf(mainInfo.totalResult));
                jSONObject.put("pageTraceName", (Object) mainInfo.pageTraceName);
                jSONObject.put("sessionid", (Object) mainInfo.sessionid);
                jSONObject.put("rootPageName", (Object) currentPageName);
                jSONObject.put("style", (Object) getModel().d().getUIListStyle().getValue());
            }
        }
        map.put("elderHome", String.valueOf(com.taobao.search.mmd.util.j.INSTANCE.a()));
        boolean booleanParam = getModel().f().getBooleanParam(noa.KEY_SEARCH_ELDER_HOME_OPEN);
        com.taobao.search.common.util.m mVar = com.taobao.search.common.util.m.INSTANCE;
        map.put("fontSizeLevel", Integer.valueOf(com.taobao.search.common.util.m.a(booleanParam)));
        map.put(noa.KEY_EDITION_CODE, com.taobao.search.mmd.util.g.d());
        map.put(noa.KEY_GRAY_HAIR, String.valueOf(booleanParam));
        map.put("rainbow", com.taobao.search.rainbow.a.c());
        if (getModel().d().getTotalSearchResult() instanceof CommonSearchResult) {
            boolean z = ((CommonSearchResult) getModel().d().getTotalSearchResult()).hasTopHeader;
            if (getModel().f() instanceof CommonSearchContext) {
                z = z || (((CommonSearchContext) getModel().f()).isPopupSrp() && (((CommonSearchContext) getModel().f()).isPopupDrag() || ((CommonSearchContext) getModel().f()).isPopupIcon()));
            }
            map.put(noa.KEY_HAS_TOP_HEADER, z ? "1" : "0");
        }
        r.a(map, getActivity());
        Object obj2 = t().mExtraObj.get("pageData");
        if (obj2 == null) {
            return;
        }
        map.put("pageData", obj2);
    }

    @Override // com.taobao.android.xsearchplugin.muise.o, com.taobao.android.xsearchplugin.weex.weex.h
    public boolean a(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d34d2c5a", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        if (getActivity() instanceof BaseResultActivity) {
            return super.a(str, jSONObject, aVar, aVar2);
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 2161725) {
            if (hashCode == 2014054120 && str.equals("refreshAuction")) {
                c = 0;
            }
        } else if (str.equals("searchOption")) {
            c = 1;
        }
        if (c == 0) {
            if (jSONObject == null) {
                com.taobao.android.searchbaseframe.util.k.a("SearchWeexModWidget", "doRefreshAuction: paramsObject is null");
                return true;
            }
            JSONObject b = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "params");
            if (b == null) {
                com.taobao.android.searchbaseframe.util.k.a("SearchWeexModWidget", "doRefreshAuction: realParamsObject is null");
                return true;
            }
            c cVar = (c) getModel().d();
            for (String str2 : b.keySet()) {
                String string = b.getString(str2);
                if (string == null) {
                    string = "";
                }
                cVar.setParam(str2, string);
            }
            cVar.doRefreshListSearch();
            return true;
        } else if (c != 1) {
            return false;
        } else {
            if (jSONObject == null) {
                com.taobao.android.searchbaseframe.util.k.a("SearchWeexModWidget", "doNewSearch: paramsObject is null");
                return true;
            }
            JSONObject b2 = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "params");
            if (b2 == null) {
                com.taobao.android.searchbaseframe.util.k.a("SearchWeexModWidget", "doNewSearch: realParamsObject is null");
                return true;
            }
            c cVar2 = (c) getModel().d();
            for (String str3 : b2.keySet()) {
                String string2 = b2.getString(str3);
                if (string2 == null) {
                    string2 = "";
                }
                cVar2.setParam(str3, string2);
                if (CommonSearchContext.sOtherTabWhiteList.contains(str3)) {
                    getModel().f().setParam(str3, string2);
                }
            }
            cVar2.doNewSearch();
            return true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
        if (r9.equals("addParams") != false) goto L13;
     */
    @Override // com.taobao.android.xsearchplugin.muise.o, com.taobao.android.xsearchplugin.weex.weex.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(java.lang.String r9, com.alibaba.fastjson.JSONObject r10, tb.isr.c.a r11, tb.isr.c.a r12) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.musie.q.b(java.lang.String, com.alibaba.fastjson.JSONObject, tb.isr$c$a, tb.isr$c$a):boolean");
    }

    private int a(noz nozVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f69ea952", new Object[]{this, nozVar})).intValue();
        }
        if (nozVar == null) {
            return 0;
        }
        Iterator<BaseCellBean> it = nozVar.I().iterator();
        while (it.hasNext()) {
            i += ((MuiseCellBean) it.next()).mMuiseBean.getCachedHeight(ListStyle.LIST);
        }
        return i;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.f16263a == null || this.f16263a.e() == null) {
        } else {
            this.f16263a.e().fireNativeEvent(str, "");
        }
    }

    private com.taobao.android.meta.data.a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.meta.data.a) ipChange.ipc$dispatch("5546d509", new Object[]{this});
        }
        if (!(getModel().d() instanceof com.taobao.search.refactor.j)) {
            return null;
        }
        com.taobao.search.refactor.j jVar = (com.taobao.search.refactor.j) getModel().d();
        if (jVar.i() == null) {
            return null;
        }
        return jVar.i().getCombo(0);
    }

    private hth d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hth) ipChange.ipc$dispatch("261a9bdf", new Object[]{this}) : (hth) getModel().e().b("controller");
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        BaseTypedBean a2 = c().g().a(JSON.parseObject(((BaseSearchResult) getModel().d().getTotalSearchResult()).getExtMod("sideMod")), (BaseSearchResult) getModel().d().getTotalSearchResult());
        TemplateBean template = getModel().d().getTemplate(a2.type);
        if (template == null) {
            return;
        }
        if (a2 instanceof WeexBean) {
            new nxd(getActivity(), (ium) getRoot(), getModel(), template, (ViewGroup) getActivity().getWindow().getDecorView(), new iur() { // from class: com.taobao.search.musie.q.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iur
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else {
                        ((ViewGroup) q.this.getActivity().getWindow().getDecorView()).addView(view);
                    }
                }

                @Override // tb.iur
                public void b(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                    } else {
                        com.taobao.android.searchbaseframe.util.t.a(view);
                    }
                }
            }).a((WeexBean) a2);
        } else if (!(a2 instanceof MuiseBean)) {
        } else {
            new nxb(getActivity(), (ium) getRoot(), getModel(), template, (ViewGroup) getActivity().getWindow().getDecorView(), new iur() { // from class: com.taobao.search.musie.q.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iur
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else {
                        ((ViewGroup) q.this.getActivity().getWindow().getDecorView()).addView(view);
                    }
                }

                @Override // tb.iur
                public void b(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                    } else {
                        com.taobao.android.searchbaseframe.util.t.a(view);
                    }
                }
            }).a((MuiseBean) a2);
        }
    }

    private void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        BaseTypedBean a2 = c().g().a(jSONObject, (BaseSearchResult) getModel().d().getTotalSearchResult());
        TemplateBean template = getModel().d().getTemplate(a2.type);
        if (template == null) {
            return;
        }
        if (a2 instanceof WeexBean) {
            new nvb(getActivity(), this, getModel(), template, (ViewGroup) getView(), new iuo()).a((WeexBean) a2);
        } else if (!(a2 instanceof MuiseBean)) {
        } else {
            new nva(getActivity(), this, getModel(), template, (ViewGroup) getView(), new iuo()).a((MuiseBean) a2);
        }
    }

    private void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                w().setParam(entry.getKey(), entry.getValue().toString());
            }
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.taobao.android.meta.data.a b = b();
        if (b != null && b.q() != null) {
            b().q().removeAllParams();
        }
        w().removeAllParams();
        com.taobao.android.searchbaseframe.context.a f = getModel().f();
        if (!(f instanceof CommonSearchContext)) {
            return;
        }
        w().setParams(((CommonSearchContext) f).getOtherTabParams());
    }

    private void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b16e04", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "params");
            for (int i = 0; i < a2.size(); i++) {
                JSONObject jSONObject2 = a2.getJSONObject(i);
                if (jSONObject2 != null) {
                    w().addParam(jSONObject2.getString("key"), jSONObject2.getString("value"));
                }
            }
        }
    }

    private void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9040aa3", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "params");
            for (int i = 0; i < a2.size(); i++) {
                JSONObject jSONObject2 = a2.getJSONObject(i);
                if (jSONObject2 != null) {
                    w().removeParam(jSONObject2.getString("key"), jSONObject2.getString("value"));
                }
            }
        }
    }

    private void g(JSONObject jSONObject) {
        JSONArray a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a56a742", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "keys")) != null) {
            for (int i = 0; i < a2.size(); i++) {
                String string = a2.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    w().clearParam(string);
                }
            }
        }
    }

    private com.taobao.android.searchbaseframe.datasource.a w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.datasource.a) ipChange.ipc$dispatch("2afbb74a", new Object[]{this}) : getModel().d();
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else {
            postEvent(new nvc.a());
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
        }
        if (com.taobao.search.common.util.r.aX()) {
            com.taobao.search.sf.realtimetag.d.a(t(), (Map<String, String>) null, getActivity(), -1, getModel().d());
        }
        return false;
    }

    @Override // com.taobao.search.refactor.a
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
        } else if (this.f16263a.e() == null || this.f16263a.e().isDestroyed() || this.f16263a.e().getTag(TbFilter.FILTER_TAG) != TbFilter.FILTER_TAG) {
        } else {
            this.f16263a.e().sendInstanceMessage("MUISE", "paramsChange", null);
        }
    }
}
