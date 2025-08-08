package com.taobao.search.sf.widgets.list.listcell.weex;

import android.app.Activity;
import android.content.Context;
import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.xsearchplugin.weex.weex.a;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.r;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.o;
import com.taobao.search.sf.realtimetag.IRealTimeTagContainer;
import com.taobao.taobao.R;
import com.ut.mini.l;
import java.util.Map;
import tb.iob;
import tb.iru;
import tb.isr;
import tb.ium;
import tb.jyx;
import tb.jzc;
import tb.kge;
import tb.nnd;
import tb.noa;

/* loaded from: classes8.dex */
public class d extends jzc<iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>>> implements GestureDetector.OnGestureListener, a.InterfaceC0626a, IRealTimeTagContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WeexCellBean l;
    private String m;
    private String n;
    private FrameLayout o;
    private GestureDetector p;

    static {
        kge.a(1666884386);
        kge.a(512613135);
        kge.a(367364596);
        kge.a(-1225658221);
        kge.a(1204268671);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1321168327:
                return new Boolean(super.b((String) objArr[0], (JSONObject) objArr[1], (isr.c.a) objArr[2], (isr.c.a) objArr[3]));
            case -747638089:
                super.a(((Number) objArr[0]).intValue(), (int) objArr[1]);
                return null;
            case 61439048:
                super.A();
                return null;
            case 69750737:
                super.J();
                return null;
            case 93762287:
                return new Boolean(super.d());
            case 108538619:
                super.t();
                return null;
            case 114079745:
                super.z();
                return null;
            case 830706776:
                return super.a((WeexCellBean) objArr[0], ((Number) objArr[1]).intValue(), ((Boolean) objArr[2]).booleanValue(), (ListStyle) objArr[3]);
            case 1803856233:
                return new Boolean(super.a((ListStyle) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.search.sf.realtimetag.IRealTimeTagContainer
    public void clearTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a22e8814", new Object[]{this});
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

    public d(Activity activity, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar, ium iumVar, ListStyle listStyle, ViewGroup viewGroup, int i) {
        super(activity, b(activity, viewGroup), iumVar, listStyle, i, iruVar);
        this.m = "";
        this.n = "";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.jzc, tb.jzd
    public Map<String, Object> a(WeexCellBean weexCellBean, int i, boolean z, ListStyle listStyle) {
        CommonSearchResult commonSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("31839458", new Object[]{this, weexCellBean, new Integer(i), new Boolean(z), listStyle});
        }
        Map<String, Object> a2 = super.a(weexCellBean, i, z, listStyle);
        if ((((iru) j()).d().getLastSearchResult() instanceof CommonSearchResult) && (commonSearchResult = (CommonSearchResult) ((iru) j()).d().getLastSearchResult()) != null) {
            a2.put("iconData", commonSearchResult.nxRawIcon);
            Object obj = weexCellBean.mExtraObj.get("iconStyle");
            if (obj instanceof String) {
                a2.put("iconStyle", obj);
            }
        }
        return a2;
    }

    @Override // tb.jzc, tb.jzd
    public boolean a(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b84a969", new Object[]{this, listStyle})).booleanValue() : super.a(listStyle) || O();
    }

    private boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue();
        }
        if (l() == null) {
            return false;
        }
        Object obj = l().mExtraObj.get("fullSpan");
        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            return true;
        }
        JSONObject b = com.taobao.android.searchbaseframe.util.a.b(l().mWeexBean.model, "info");
        if (b == null) {
            return false;
        }
        return b.getBooleanValue("adjustFullSpan");
    }

    public static View b(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("739ef400", new Object[]{context, viewGroup});
        }
        return LayoutInflater.from(context).inflate(r.aX() ? R.layout.tbsearch_item_weex_cell_intercept : R.layout.tbsearch_item_weex_cell, viewGroup, false);
    }

    @Override // tb.jzd
    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
            return;
        }
        super.J();
        this.o = (FrameLayout) this.itemView.findViewById(R.id.fl_inner_card_container);
        if (!(this.itemView instanceof com.taobao.android.searchbaseframe.uikit.b)) {
            return;
        }
        this.p = new GestureDetector(getActivity().getApplicationContext(), this);
        ((com.taobao.android.searchbaseframe.uikit.b) this.itemView).setOnInterceptTouchEventListener(new com.taobao.search.common.util.e(this.p));
    }

    @Override // tb.jzc
    public void a(Map<String, Object> map, WeexCellBean weexCellBean) {
        CommonSearchResult commonSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87011aae", new Object[]{this, map, weexCellBean});
            return;
        }
        map.put("pageName", l.getInstance().getCurrentPageName());
        map.put("rainbow", com.taobao.search.rainbow.a.c());
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(jyx.DIMENSION_BUSINESS_NAME, o.i());
        arrayMap.put("tItemType", this.m);
        arrayMap.put("sversion", noa.SERVER_VERSION_VALUE);
        arrayMap.put(jyx.DIMENSION_JSVERSION, this.n);
        try {
            arrayMap.put("rainbow", com.taobao.search.rainbow.a.c(String.format("tbAndroid%sEnableLT", this.m)));
        } catch (Exception unused) {
            k.a("SearchListWeexCellVH", "getBucketIdFail");
        }
        map.put("hubbleInfo", arrayMap);
        if ((((iru) j()).d().getTotalSearchResult() instanceof CommonSearchResult) && (commonSearchResult = (CommonSearchResult) ((iru) j()).d().getTotalSearchResult()) != null) {
            if (commonSearchResult.getMainInfo().pageTraceArgs != null) {
                map.put("spm", commonSearchResult.getMainInfo().pageTraceArgs.get("spm-cnt"));
            }
            map.put(k.a.PARAM_KEY_FIRST_RN, commonSearchResult.getMainInfo().rn);
        }
        WeexCellBean weexCellBean2 = this.l;
        if (weexCellBean2 == null) {
            return;
        }
        map.put("srp_seq", String.valueOf(weexCellBean2.pageNo));
        map.put("srp_pos", String.valueOf(this.l.pagePos));
    }

    @Override // tb.jzd, tb.itd
    public void a(int i, WeexCellBean weexCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5c822ac", new Object[]{this, new Integer(i), weexCellBean});
            return;
        }
        this.l = weexCellBean;
        WeexCellBean weexCellBean2 = this.l;
        String str = "";
        this.m = weexCellBean2 != null ? weexCellBean2.type : str;
        TemplateBean a2 = this.f29876a.a(a(this.l));
        if (a2 != null) {
            str = a2.version;
        }
        this.n = str;
        this.f29876a.a(a(this.l));
        super.a(i, (int) weexCellBean);
        b(weexCellBean);
    }

    private void b(WeexCellBean weexCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc79757a", new Object[]{this, weexCellBean});
            return;
        }
        Object obj = weexCellBean.mExtraObj.get("dynamicCardBean");
        if (!(obj instanceof DynamicCardBean)) {
            this.o.removeAllViews();
            return;
        }
        DynamicCardBean dynamicCardBean = (DynamicCardBean) obj;
        View view = com.taobao.search.sf.realtimetag.c.a(this, getActivity(), dynamicCardBean, m()).itemView;
        this.o.addView(view);
        if (!dynamicCardBean.firstRender) {
            return;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f);
        scaleAnimation.setDuration(300L);
        view.startAnimation(scaleAnimation);
        dynamicCardBean.firstRender = false;
    }

    @Override // com.taobao.search.sf.realtimetag.IRealTimeTagContainer
    public ListStyle getContainerListStyle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ListStyle) ipChange.ipc$dispatch("1c77b9ec", new Object[]{this}) : u();
    }

    @Override // tb.jzc, com.taobao.android.xsearchplugin.weex.weex.h
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
                        c = 4;
                        break;
                    }
                    break;
                case -956863702:
                    if (str.equals("removeParams")) {
                        c = 3;
                        break;
                    }
                    break;
                case -102588025:
                    if (str.equals("addParams")) {
                        c = 2;
                        break;
                    }
                    break;
                case 485970056:
                    if (str.equals("setParams")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1098537456:
                    if (str.equals("removeSelf")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                destroyAndRemoveFromParent();
                return true;
            } else if (c == 1) {
                a(jSONObject);
                return true;
            } else if (c == 2) {
                b(jSONObject);
                return true;
            } else if (c == 3) {
                c(jSONObject);
                return true;
            } else if (c == 4) {
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
                P().setParam(entry.getKey(), entry.getValue().toString());
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
                    P().addParam(jSONObject2.getString("key"), jSONObject2.getString("value"));
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
                    P().removeParam(jSONObject2.getString("key"), jSONObject2.getString("value"));
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
                if (!StringUtils.isEmpty(string)) {
                    P().clearParam(string);
                }
            }
        }
    }

    private com.taobao.search.sf.datasource.c P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.sf.datasource.c) ipChange.ipc$dispatch("fe7ddf07", new Object[]{this}) : (com.taobao.search.sf.datasource.c) ((iru) j()).d();
    }

    @Override // tb.jzd, tb.itd
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        super.t();
        if (!(getParent() instanceof iob)) {
            return;
        }
        ((iob) getParent()).A();
    }

    @Override // tb.jzd, tb.itd
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        super.z();
        if (!r.Z()) {
            return;
        }
        this.f29876a.j();
    }

    @Override // tb.jzd, tb.itd
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        super.A();
        if (!r.Z()) {
            return;
        }
        this.f29876a.i();
    }

    @Override // tb.jzc, tb.irw
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (nnd.a(((iru) j()).d())) {
            return super.d();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
        }
        if (r.aX()) {
            com.taobao.search.sf.realtimetag.d.a(l(), (Map<String, String>) null, getActivity(), m(), ((iru) j()).d());
        }
        return false;
    }
}
