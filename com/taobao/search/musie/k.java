package com.taobao.search.musie;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.xsearchplugin.muise.MuiseHolderContainer;
import com.taobao.search.common.util.k;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.datasource.c;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.ipq;
import tb.iru;
import tb.ise;
import tb.isp;
import tb.isr;
import tb.ium;
import tb.kge;
import tb.noa;
import tb.not;
import tb.noz;
import tb.ntb;
import tb.ntd;
import tb.nwg;

/* loaded from: classes7.dex */
public class k extends r implements MuiseHolderContainer.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_LIST_SCROLL = "listScroll";
    public static final String ACTION_START_SCROLL = "startScroll";
    public static final String ACTION_STOP_SCROLL = "stopScroll";
    public static final ise<ipq, k> CREATOR;
    private MuiseCellBean b_;
    private final RecyclerView.OnScrollListener m;
    private boolean n;
    private final MuiseHolderContainer o;
    private Boolean p;
    private RecyclerView q;
    private ntd r;

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1544682378:
                return super.e((MuiseBean) objArr[0], (MuiseBean) objArr[1]);
            case -1321168327:
                return new Boolean(super.b((String) objArr[0], (JSONObject) objArr[1], (isr.c.a) objArr[2], (isr.c.a) objArr[3]));
            case -881651591:
                return new Boolean(super.c(((Number) objArr[0]).intValue(), (int) objArr[1]));
            case -836700697:
                return super.R();
            case -749917094:
                return new Boolean(super.a((String) objArr[0], (JSONObject) objArr[1], (isr.c.a) objArr[2], (isr.c.a) objArr[3]));
            case 63286090:
                super.C();
                return null;
            case 64209611:
                super.D();
                return null;
            case 66974264:
                super.onRenderSuccess((com.taobao.android.weex_framework.p) objArr[0]);
                return null;
            case 71597779:
                super.L();
                return null;
            case 118043724:
                super.a(((Number) objArr[0]).intValue(), (MuiseCellBean) objArr[1]);
                return null;
            case 511551807:
                super.a((k) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 1464435420:
                super.b((MuiseBean) objArr[0], (MuiseBean) objArr[1]);
                return null;
            case 1544639176:
                super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1827617930:
                super.a((Map) objArr[0], (MuiseCellBean) objArr[1]);
                return null;
            case 2094523359:
                super.onRefreshSuccess((com.taobao.android.weex_framework.p) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue() : i >= 0;
    }

    @Override // com.taobao.search.musie.r
    public boolean bI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c204b1a3", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ void a(k kVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("955ddff4", new Object[]{kVar, str});
        } else {
            kVar.d(str);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public /* synthetic */ int a(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3e483130", new Object[]{this, muiseBean, muiseCellBean})).intValue() : e2(muiseBean, muiseCellBean);
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public /* synthetic */ void b(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574982dc", new Object[]{this, muiseBean, muiseCellBean});
        } else {
            d2(muiseBean, muiseCellBean);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public /* synthetic */ boolean c(int i, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cb731079", new Object[]{this, new Integer(i), muiseCellBean})).booleanValue() : b(i, muiseCellBean);
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public /* synthetic */ int d(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("894c260d", new Object[]{this, muiseBean, muiseCellBean})).intValue() : a2(muiseBean, muiseCellBean);
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public /* synthetic */ ListStyle e(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ListStyle) ipChange.ipc$dispatch("a3ee0476", new Object[]{this, muiseBean, muiseCellBean}) : b2(muiseBean, muiseCellBean);
    }

    static {
        kge.a(413851651);
        kge.a(276508641);
        CREATOR = new ise<ipq, k>() { // from class: com.taobao.search.musie.k.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public k a(ipq ipqVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("fa5e3d70", new Object[]{this, ipqVar}) : new k(ipqVar.c, ipqVar.e, ipqVar.d, ipqVar.b, ipqVar.f, ipqVar.f29218a);
            }
        };
    }

    public k(Activity activity, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar, ium iumVar, ListStyle listStyle, ViewGroup viewGroup, int i) {
        super(activity, b(activity, viewGroup), iruVar, iumVar, listStyle, viewGroup, i);
        this.m = new RecyclerView.OnScrollListener() { // from class: com.taobao.search.musie.k.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 806944192) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode != 2142696127) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i2)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i2);
                if (i2 == 0) {
                    k.a(k.this, "stopScroll");
                } else if (i2 != 1) {
                } else {
                    k.a(k.this, k.ACTION_START_SCROLL);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i2), new Integer(i3)});
                    return;
                }
                super.onScrolled(recyclerView, i2, i3);
                k.a(k.this, k.ACTION_LIST_SCROLL);
            }
        };
        this.n = false;
        this.o = (MuiseHolderContainer) this.itemView;
        this.o.setHeightChangeListener(this);
        if (viewGroup instanceof RecyclerView) {
            this.q = (RecyclerView) viewGroup;
        }
        this.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.search.musie.k.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue() : motionEvent.getAction() == 0;
            }
        });
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (this.f16257a == null || this.f16257a.e() == null) {
        } else {
            this.f16257a.e().fireNativeEvent(str, "");
        }
    }

    public static View b(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("739ef400", new Object[]{context, viewGroup}) : LayoutInflater.from(context).inflate(R.layout.tbsearch_ns_muise_cell, viewGroup, false);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public int a2(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        TemplateBean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11088479", new Object[]{this, muiseBean, muiseCellBean})).intValue();
        }
        if (muiseBean == null || (a2 = this.f16257a.a(muiseBean)) == null) {
            return 0;
        }
        return a(b2(muiseBean, muiseCellBean), muiseCellBean) ? a2.listHeight : a2.midHeight;
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

    @Override // com.taobao.search.musie.r, com.taobao.android.xsearchplugin.muise.c, com.taobao.android.xsearchplugin.muise.b, com.taobao.android.weex_framework.g
    public void onRenderSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            return;
        }
        this.o.setObserveHeightChange(true);
        super.onRenderSuccess(pVar);
    }

    @Override // com.taobao.search.musie.r, com.taobao.android.xsearchplugin.muise.c, com.taobao.android.xsearchplugin.muise.b, com.taobao.android.weex_framework.g
    public void onRefreshSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
            return;
        }
        this.o.setObserveHeightChange(true);
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

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public ListStyle b2(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("6c63ff04", new Object[]{this, muiseBean, muiseCellBean});
        }
        ListStyle e = super.e(muiseBean, (MuiseBean) muiseCellBean);
        return a(e, muiseCellBean) ? ListStyle.LIST : e;
    }

    @Override // com.taobao.search.musie.r
    public nwg.b T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nwg.b) ipChange.ipc$dispatch("f66d21cf", new Object[]{this}) : new not(l(), a(l().combo.n(), l()), (c) ((iru) j()).d(), Y());
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public int c(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c49c1efb", new Object[]{this, muiseBean, muiseCellBean})).intValue() : b2(muiseBean, muiseCellBean) == ListStyle.LIST ? a(muiseBean) : b(muiseBean);
    }

    /* renamed from: d  reason: avoid collision after fix types in other method */
    public void d2(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e65ec49", new Object[]{this, muiseBean, muiseCellBean});
            return;
        }
        this.o.setObserveHeightChange(false);
        super.b(muiseBean, (MuiseBean) muiseCellBean);
    }

    /* renamed from: e  reason: avoid collision after fix types in other method */
    public int e2(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("782fb97d", new Object[]{this, muiseBean, muiseCellBean})).intValue();
        }
        if (muiseBean == null) {
            return -1;
        }
        return muiseBean.getCachedHeight(b2(muiseBean, muiseCellBean));
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public void a(MuiseCellBean muiseCellBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac062784", new Object[]{this, muiseCellBean, new Integer(i)});
            return;
        }
        this.o.setObserveHeightChange(false);
        super.a((k) muiseCellBean, i);
    }

    @Override // com.taobao.search.musie.r, com.taobao.android.xsearchplugin.muise.c
    public void a(Map<String, Object> map, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cef3c8a", new Object[]{this, map, muiseCellBean});
            return;
        }
        super.a(map, muiseCellBean);
        c cVar = (c) ((iru) j()).d();
        CommonSearchResult commonSearchResult = (CommonSearchResult) cVar.getTotalSearchResult();
        if (commonSearchResult != null && commonSearchResult.newSearch && muiseCellBean.combo != null) {
            noz nozVar = (noz) muiseCellBean.combo;
            map.put(k.a.PARAM_KEY_FIRST_RN, nozVar.a().rn);
            map.put("native", "true");
            if (commonSearchResult.guideSearch) {
                map.put("guideSearch", "true");
            }
            map.put(noa.VALUE_BIZ_TYPE_NEW_SEARCH, "true");
            map.put(com.taobao.android.detail.sdk.request.combo.a.K_COMBO_ID, String.valueOf(nozVar.t()));
            map.put("comboStyle", nozVar.n().getValue());
            com.taobao.search.refactor.g Y = Y();
            int aa = nozVar.aa();
            if (((iru) j()).d() == ((iru) j()).c() && aa > 0) {
                map.put("tab", nozVar.Q());
            }
            map.put("comboBizType", nozVar.Q());
            map.put(k.a.PARAM_KEY_FIRST_RN, nozVar.a().rn);
            map.put("comboHeaderCount", String.valueOf(nozVar.H().size() + nozVar.I().size()));
            map.put("indexInCombo", String.valueOf(muiseCellBean.comboIndex));
            map.put("comboType", muiseCellBean.comboType);
            map.put("tabIndex", String.valueOf(cVar.getIndex()));
            JSONObject jSONObject = commonSearchResult.pageInfo;
            Map<String, String> map2 = commonSearchResult.getMainInfo().pageTraceArgs;
            String str = commonSearchResult.getMainInfo().pageTraceName;
            if (((iru) j()).d() != ((iru) j()).c()) {
                jSONObject = nozVar.R();
                map2 = nozVar.a().pageTraceArgs;
                str = nozVar.a().pageTraceName;
            }
            if (((CommonSearchResult) ((c) ((iru) j()).d()).getTotalSearchResult()).guideSearch) {
                jSONObject = nozVar.R();
            }
            Map<String, String> a2 = a(nozVar);
            if (a2 != null && jSONObject != null) {
                jSONObject = (JSONObject) jSONObject.clone();
                jSONObject.putAll(a2);
            }
            if (jSONObject != null) {
                map.put("pageInfo", jSONObject);
            }
            map.put("isJiaGou", String.valueOf(commonSearchResult.isAddCartSupported));
            if (map2 != null) {
                map.put("spm", map2.get("spm-cnt"));
            }
            String k = Y.k();
            if (k != null) {
                map.put("show_tabs", k);
            }
            map.put("floor_info", nozVar.Q() + "_" + nozVar.t());
            map.put("pageName", str);
        }
        a(map);
    }

    private void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (!(((iru) j()).d() instanceof c)) {
        } else {
            CommonSearchResult commonSearchResult = (CommonSearchResult) ((c) ((iru) j()).d()).getTotalSearchResult();
            if (!commonSearchResult.guideSearch || !commonSearchResult.guideSearchNative) {
                return;
            }
            map.put("pageName", commonSearchResult.getMainInfo().pageName);
        }
    }

    private Map<String, String> a(noz nozVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b1616954", new Object[]{this, nozVar});
        }
        if (nozVar == null) {
            return null;
        }
        Map<String, String> map = (Map) nozVar.T().get("whiteListParams");
        if (map == null) {
            map = new HashMap<>();
            nozVar.T().put("whiteListParams", map);
            String[] Y = com.taobao.search.common.util.r.Y();
            Map<String, String> X = X();
            for (String str : Y) {
                String str2 = X.get(str);
                if (!TextUtils.isEmpty(str2)) {
                    map.put(str, str2);
                }
            }
        }
        return map;
    }

    @Override // com.taobao.search.musie.r, com.taobao.android.xsearchplugin.muise.c, com.taobao.android.xsearchplugin.weex.weex.h
    public boolean a(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d34d2c5a", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -72204429) {
            if (hashCode != 2161725) {
                if (hashCode == 2014054120 && str.equals("refreshAuction")) {
                    c = 0;
                }
            } else if (str.equals("searchOption")) {
                c = 1;
            }
        } else if (str.equals("refreshCombo")) {
            c = 2;
        }
        if (c == 0) {
            a(false);
            return true;
        } else if (c != 1) {
            if (c == 2) {
                a(true);
                return true;
            }
            return super.a(str, jSONObject, aVar, aVar2);
        } else {
            if (this.f16257a != null && this.f16257a.e() != null) {
                this.f16257a.e().sendInstanceMessage("MUISE", "paramsChange", null);
            }
            a(false);
            return true;
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        c cVar = (c) ((iru) j()).d();
        HashMap hashMap = new HashMap();
        hashMap.put("searchType", z ? "all" : "auction");
        cVar.doNewSearch((com.taobao.search.refactor.e) l().combo, false, hashMap);
    }

    private int b(noz nozVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e521afd3", new Object[]{this, nozVar})).intValue();
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

    @Override // com.taobao.search.musie.r, com.taobao.android.xsearchplugin.muise.c, com.taobao.android.xsearchplugin.muise.b, tb.itd
    public void a(int i, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709344c", new Object[]{this, new Integer(i), muiseCellBean});
            return;
        }
        super.a(i, muiseCellBean);
        this.b_ = muiseCellBean;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
        if (r9.equals("showPopup") != false) goto L11;
     */
    @Override // com.taobao.search.musie.r, com.taobao.android.xsearchplugin.muise.c, com.taobao.android.xsearchplugin.weex.weex.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(java.lang.String r9, com.alibaba.fastjson.JSONObject r10, tb.isr.c.a r11, tb.isr.c.a r12) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.musie.k.b(java.lang.String, com.alibaba.fastjson.JSONObject, tb.isr$c$a, tb.isr$c$a):boolean");
    }

    private com.taobao.search.refactor.g Y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.refactor.g) ipChange.ipc$dispatch("7c439197", new Object[]{this}) : (com.taobao.search.refactor.g) ((iru) j()).e().b("controller");
    }

    private void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509c7e1", new Object[]{this});
        } else if (this.r != null || !(getActivity() instanceof ntb)) {
        } else {
            this.r = ((ntb) getActivity()).A();
        }
    }

    private void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        Z();
        this.r.a(jSONObject.getJSONObject("options"), jSONObject.getJSONObject("data"), getParent(), this, this);
    }

    private void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
            return;
        }
        ntd ntdVar = this.r;
        if (ntdVar == null) {
            return;
        }
        ntdVar.a(jSONObject);
    }

    @Override // com.taobao.android.xsearchplugin.muise.c
    public String R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce20f5e7", new Object[]{this});
        }
        if (l() == null) {
            return super.R();
        }
        ListStyle b2 = b2(l().mMuiseBean, l());
        boolean a2 = a(b2, l());
        Boolean bool = this.p;
        if (bool != null && a2 != bool.booleanValue()) {
            this.w = 0;
        }
        this.p = Boolean.valueOf(a2);
        return a(this.itemView, b2, false);
    }

    public JSONObject U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84c18d7c", new Object[]{this});
        }
        Map<String, String> paramsSnapShot = ((c) ((iru) j()).d()).getParamsSnapShot();
        if (paramsSnapShot == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(paramsSnapShot);
        return jSONObject;
    }

    public boolean b(int i, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54c8ac51", new Object[]{this, new Integer(i), muiseCellBean})).booleanValue();
        }
        if (!muiseCellBean.forceUpdate) {
            return super.c(i, (int) muiseCellBean);
        }
        return false;
    }

    @Override // com.taobao.android.xsearchplugin.muise.b, tb.itd
    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        super.C();
        if (this.n) {
            return;
        }
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.m);
        }
        this.n = true;
    }

    @Override // com.taobao.android.xsearchplugin.muise.b, tb.itd
    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        super.D();
        if (!this.n) {
            return;
        }
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.m);
        }
        this.n = false;
    }
}
