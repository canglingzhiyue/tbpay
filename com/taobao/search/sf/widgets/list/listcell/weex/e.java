package com.taobao.search.sf.widgets.list.listcell.weex;

import android.app.Activity;
import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
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
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.searchbaseframe.util.t;
import com.taobao.search.common.util.r;
import com.taobao.search.musie.InterceptFrameLayout;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.o;
import com.ut.mini.l;
import java.util.Map;
import tb.iru;
import tb.isr;
import tb.ium;
import tb.iuo;
import tb.iur;
import tb.jyx;
import tb.jzf;
import tb.kge;
import tb.noa;
import tb.nva;
import tb.nvb;
import tb.nvc;
import tb.nxb;
import tb.nxd;

/* loaded from: classes8.dex */
public class e extends jzf implements GestureDetector.OnGestureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String b;
    private String c;
    private GestureDetector d;

    static {
        kge.a(-1929922795);
        kge.a(1204268671);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1429617551:
                return super.b((WeexBean) objArr[0]);
            case -1321168327:
                return new Boolean(super.b((String) objArr[0], (JSONObject) objArr[1], (isr.c.a) objArr[2], (isr.c.a) objArr[3]));
            case -506257491:
                super.findAllViews();
                return null;
            case 1372019008:
                return super.r();
            case 2095332987:
                super.a((WeexBean) objArr[0]);
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

    @Override // tb.jzf, tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((WeexBean) obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.FrameLayout, android.view.View] */
    @Override // tb.jzf, tb.ius
    public /* synthetic */ FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : r();
    }

    public e(Activity activity, ium iumVar, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar, TemplateBean templateBean, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, iruVar, templateBean, viewGroup, iurVar);
    }

    @Override // tb.jzf
    public void a(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce43e7b", new Object[]{this, weexBean});
            return;
        }
        this.b = weexBean != null ? weexBean.type : "";
        this.c = q().version;
        super.a(weexBean);
    }

    @Override // tb.jzf
    public FrameLayout r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("51c75940", new Object[]{this});
        }
        if (r.aX()) {
            InterceptFrameLayout interceptFrameLayout = new InterceptFrameLayout(getActivity());
            interceptFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return interceptFrameLayout;
        }
        return super.r();
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

    @Override // tb.jzf
    public Map<String, Object> b(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("aac9c471", new Object[]{this, weexBean});
        }
        Map<String, Object> b = super.b(weexBean);
        String y = y();
        if (b != null && y != null) {
            b.put("iconData", y);
        }
        return b;
    }

    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c806420", new Object[]{this});
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getModel().d().getLastSearchResult();
        return commonSearchResult != null ? commonSearchResult.nxRawIcon : "";
    }

    @Override // tb.jzf
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        map.put("pageName", l.getInstance().getCurrentPageName());
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(jyx.DIMENSION_BUSINESS_NAME, o.i());
        arrayMap.put("tItemType", this.b);
        arrayMap.put("sversion", noa.SERVER_VERSION_VALUE);
        arrayMap.put(jyx.DIMENSION_JSVERSION, this.c);
        try {
            arrayMap.put("rainbow", com.taobao.search.rainbow.a.c(String.format("tbAndroid%sEnableLT", this.b)));
        } catch (Exception unused) {
            k.a("SearchWeexModWidget", "getBucketIdFail");
        }
        map.put("hubbleInfo", arrayMap);
    }

    private com.taobao.search.sf.datasource.c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.sf.datasource.c) ipChange.ipc$dispatch("578e4a58", new Object[]{this}) : (com.taobao.search.sf.datasource.c) getModel().d();
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                a().setParam(entry.getKey(), entry.getValue().toString());
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
                    a().addParam(jSONObject2.getString("key"), jSONObject2.getString("value"));
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
                    a().removeParam(jSONObject2.getString("key"), jSONObject2.getString("value"));
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
                    a().clearParam(string);
                }
            }
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        BaseTypedBean a2 = c().g().a(JSON.parseObject(((BaseSearchResult) getModel().d().getTotalSearchResult()).getExtMod("sideMod")), (BaseSearchResult) getModel().d().getTotalSearchResult());
        TemplateBean template = getModel().d().getTemplate(a2.type);
        if (template == null) {
            return;
        }
        if (a2 instanceof WeexBean) {
            new nxd(getActivity(), (ium) getRoot(), getModel(), template, (ViewGroup) getActivity().getWindow().getDecorView(), new iur() { // from class: com.taobao.search.sf.widgets.list.listcell.weex.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iur
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else {
                        ((ViewGroup) e.this.getActivity().getWindow().getDecorView()).addView(view);
                    }
                }

                @Override // tb.iur
                public void b(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                    } else {
                        t.a(view);
                    }
                }
            }).a((WeexBean) a2);
        } else if (!(a2 instanceof MuiseBean)) {
        } else {
            new nxb(getActivity(), (ium) getRoot(), getModel(), template, (ViewGroup) getActivity().getWindow().getDecorView(), new iur() { // from class: com.taobao.search.sf.widgets.list.listcell.weex.e.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iur
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else {
                        ((ViewGroup) e.this.getActivity().getWindow().getDecorView()).addView(view);
                    }
                }

                @Override // tb.iur
                public void b(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                    } else {
                        t.a(view);
                    }
                }
            }).a((MuiseBean) a2);
        }
    }

    private void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b16e04", new Object[]{this, jSONObject});
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        if (r9.equals("clearParams") != false) goto L13;
     */
    @Override // tb.jzf, com.taobao.android.xsearchplugin.weex.weex.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(java.lang.String r9, com.alibaba.fastjson.JSONObject r10, tb.isr.c.a r11, tb.isr.c.a r12) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.search.sf.widgets.list.listcell.weex.e.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 5
            r7 = 1
            if (r1 == 0) goto L25
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r8
            r1[r7] = r9
            r1[r4] = r10
            r1[r3] = r11
            r1[r2] = r12
            java.lang.String r9 = "b1409239"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L25:
            boolean r11 = super.b(r9, r10, r11, r12)
            if (r11 != 0) goto Lad
            r12 = -1
            int r0 = r9.hashCode()
            switch(r0) {
                case -1688932813: goto L7f;
                case -956863702: goto L74;
                case -703324040: goto L69;
                case -376755062: goto L5f;
                case -102588025: goto L55;
                case -33915294: goto L4a;
                case 485970056: goto L3f;
                case 1098537456: goto L34;
                default: goto L33;
            }
        L33:
            goto L88
        L34:
            java.lang.String r0 = "removeSelf"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L88
            r2 = 0
            goto L89
        L3f:
            java.lang.String r0 = "setParams"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L88
            r2 = 1
            goto L89
        L4a:
            java.lang.String r0 = "openFilter"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L88
            r2 = 6
            goto L89
        L55:
            java.lang.String r0 = "addParams"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L88
            r2 = 2
            goto L89
        L5f:
            java.lang.String r0 = "closeDropLayer"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L88
            r2 = 7
            goto L89
        L69:
            java.lang.String r0 = "openDropLayer"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L88
            r2 = 5
            goto L89
        L74:
            java.lang.String r0 = "removeParams"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L88
            r2 = 3
            goto L89
        L7f:
            java.lang.String r0 = "clearParams"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L88
            goto L89
        L88:
            r2 = -1
        L89:
            switch(r2) {
                case 0: goto La9;
                case 1: goto La5;
                case 2: goto La1;
                case 3: goto L9d;
                case 4: goto L99;
                case 5: goto L95;
                case 6: goto L91;
                case 7: goto L8d;
                default: goto L8c;
            }
        L8c:
            goto Lad
        L8d:
            r8.b()
            goto Lae
        L91:
            r8.d()
            goto Lae
        L95:
            r8.e(r10)
            goto Lae
        L99:
            r8.d(r10)
            goto Lae
        L9d:
            r8.c(r10)
            goto Lae
        La1:
            r8.b(r10)
            goto Lae
        La5:
            r8.a(r10)
            goto Lae
        La9:
            r8.destroyAndRemoveFromParent()
            goto Lae
        Lad:
            r7 = r11
        Lae:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.sf.widgets.list.listcell.weex.e.b(java.lang.String, com.alibaba.fastjson.JSONObject, tb.isr$c$a, tb.isr$c$a):boolean");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
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
        if (r.aX()) {
            com.taobao.search.sf.realtimetag.d.a(t(), (Map<String, String>) null, getActivity(), -1, getModel().d());
        }
        return false;
    }
}
