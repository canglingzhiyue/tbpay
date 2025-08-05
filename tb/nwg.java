package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.android.searchbaseframe.util.s;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.android.xsearchplugin.muise.k;
import com.taobao.search.musie.q;
import java.util.Map;
import tb.isr;
import tb.nwf;

/* loaded from: classes8.dex */
public final class nwg extends q implements k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Integer b;
    private Object c;
    private a d;
    private b e;

    /* loaded from: classes8.dex */
    public interface a {
        void a();

        void a(JSONObject jSONObject);

        void b();
    }

    /* loaded from: classes8.dex */
    public interface b {
        ListStyle a();

        void a(BaseCellBean baseCellBean, int i);

        nwh b();
    }

    static {
        kge.a(1031752791);
        kge.a(-956844622);
    }

    public static /* synthetic */ Object ipc$super(nwg nwgVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1321168327:
                return new Boolean(super.b((String) objArr[0], (JSONObject) objArr[1], (isr.c.a) objArr[2], (isr.c.a) objArr[3]));
            case -749917094:
                return new Boolean(super.a((String) objArr[0], (JSONObject) objArr[1], (isr.c.a) objArr[2], (isr.c.a) objArr[3]));
            case -638084833:
                return super.s();
            case -604580575:
                super.a((com.taobao.android.xsearchplugin.muise.a) objArr[0]);
                return null;
            case 66974264:
                super.onRenderSuccess((p) objArr[0]);
                return null;
            case 302831676:
                super.destroyAndRemoveFromParent();
                return null;
            case 1112741915:
                super.onRenderFailed((p) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case 1514279453:
                super.a((Map) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.o
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.FrameLayout, android.view.View] */
    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o, tb.ius
    public /* synthetic */ FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : s();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwg(Activity activity, ium parent, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model, TemplateBean bean, ViewGroup viewGroup, iur iurVar, Integer num, Object obj, a aVar, b negativeFeedbackProvider) {
        super(activity, parent, model, bean, viewGroup, iurVar);
        kotlin.jvm.internal.q.c(activity, "activity");
        kotlin.jvm.internal.q.c(parent, "parent");
        kotlin.jvm.internal.q.c(model, "model");
        kotlin.jvm.internal.q.c(bean, "bean");
        kotlin.jvm.internal.q.c(negativeFeedbackProvider, "negativeFeedbackProvider");
        this.b = num;
        this.c = obj;
        this.d = aVar;
        this.e = negativeFeedbackProvider;
    }

    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o
    public FrameLayout s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("d9f7991f", new Object[]{this});
        }
        FrameLayout parent = super.s();
        subscribeEvent(this);
        ViewGroup it = getContainer();
        if (it != null) {
            kotlin.jvm.internal.q.a((Object) parent, "parent");
            ViewGroup.LayoutParams layoutParams = parent.getLayoutParams();
            kotlin.jvm.internal.q.a((Object) it, "it");
            layoutParams.height = it.getHeight();
        }
        kotlin.jvm.internal.q.a((Object) parent, "parent");
        return parent;
    }

    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        super.a(map);
        if (map == null) {
            return;
        }
        iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model = getModel();
        kotlin.jvm.internal.q.a((Object) model, "model");
        com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?> b2 = model.b();
        kotlin.jvm.internal.q.a((Object) b2, "model.currentDatasource");
        map.put(com.ap.zlz.toyger.zdoc.b.INFO_PAGE_NUMBER, Integer.valueOf(b2.getCurrentPage()));
        map.put("index", String.valueOf(this.b));
        map.put("layoutStyle", Integer.valueOf(ListStyle.toNum(this.e.a())));
        ViewGroup parent = getContainer();
        if (parent != null) {
            kotlin.jvm.internal.q.a((Object) parent, "parent");
            map.put("containerWidth", Float.valueOf(j.d(parent.getWidth())));
        }
        Object obj = this.c;
        if (obj == null) {
            return;
        }
        map.put("negFeedbackActions", obj);
    }

    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o, com.taobao.android.xsearchplugin.weex.weex.h
    public boolean b(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        a aVar3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1409239", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        if (str != null && str.hashCode() == -725085627 && str.equals("requestLostFocus") && (aVar3 = this.d) != null) {
            aVar3.b();
        }
        return super.b(str, jSONObject, aVar, aVar2);
    }

    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o, com.taobao.android.xsearchplugin.weex.weex.h
    public boolean a(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        Object obj;
        a aVar3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d34d2c5a", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        if (str != null && str.hashCode() == 2044506841 && str.equals("negativeFeedbackOptionClick")) {
            if (jSONObject == null || (obj = jSONObject.get("isSub")) == null) {
                obj = "";
            }
            boolean a2 = kotlin.jvm.internal.q.a(obj, (Object) "true");
            a(jSONObject);
            if (!a2 && (aVar3 = this.d) != null) {
                aVar3.a(jSONObject);
            }
            return true;
        }
        return super.a(str, jSONObject, aVar, aVar2);
    }

    private final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        Activity activity = getActivity();
        nwh b2 = this.e.b();
        iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model = getModel();
        kotlin.jvm.internal.q.a((Object) model, "model");
        nwj.a(activity, b2, jSONObject, model.f().getBooleanParam(noa.KEY_SEARCH_ELDER_HOME_OPEN));
    }

    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o
    public void a(com.taobao.android.xsearchplugin.muise.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf6d521", new Object[]{this, aVar});
            return;
        }
        super.a(aVar);
        if (aVar == null) {
            return;
        }
        aVar.a((k) this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    @Override // com.taobao.android.xsearchplugin.muise.o, com.taobao.android.weex_framework.g
    public void onRenderSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            return;
        }
        super.onRenderSuccess(pVar);
        if (getContainer() == null || getView() == 0) {
            return;
        }
        s.a(getContainer(), (View) getView());
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout == null) {
            kotlin.jvm.internal.q.a();
        }
        kotlin.jvm.internal.q.a((Object) frameLayout, "view!!");
        int childCount = frameLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            FrameLayout frameLayout2 = (FrameLayout) getView();
            if (frameLayout2 == null) {
                kotlin.jvm.internal.q.a();
            }
            View childAt = frameLayout2.getChildAt(i);
            if (childAt instanceof MUSView) {
                childAt.sendAccessibilityEvent(8);
                return;
            }
        }
    }

    @Override // tb.ius, tb.iut, tb.iul
    public void destroyAndRemoveFromParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120cd83c", new Object[]{this});
            return;
        }
        super.destroyAndRemoveFromParent();
        if (getContainer() == null) {
            return;
        }
        s.a(getContainer());
    }

    @Override // com.taobao.android.xsearchplugin.muise.o, com.taobao.android.weex_framework.g
    public void onRenderFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        super.onRenderFailed(pVar, i, str, z);
        a aVar = this.d;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (((tb.nus) r0).x() != false) goto L12;
     */
    @Override // com.taobao.android.xsearchplugin.muise.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.taobao.android.weex_framework.p r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.nwg.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            r1[r2] = r5
            java.lang.String r5 = "11e8b525"
            r0.ipc$dispatch(r5, r1)
            return
        L15:
            android.app.Activity r0 = r4.getActivity()
            boolean r0 = r0 instanceof tb.nus
            if (r0 == 0) goto L34
            android.app.Activity r0 = r4.getActivity()
            if (r0 == 0) goto L2c
            tb.nus r0 = (tb.nus) r0
            boolean r0 = r0.x()
            if (r0 == 0) goto L34
            goto L35
        L2c:
            kotlin.TypeCastException r5 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type com.taobao.search.sf.widgets.ITaobao2021SwitchProvider"
            r5.<init>(r0)
            throw r5
        L34:
            r2 = 0
        L35:
            if (r5 == 0) goto L41
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "tb2021"
            r5.addInstanceEnv(r1, r0)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nwg.a(com.taobao.android.weex_framework.p):void");
    }

    public final void onEventMainThread(nwf.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd33bb", new Object[]{this, aVar});
            return;
        }
        a aVar2 = this.d;
        if (aVar2 == null) {
            return;
        }
        aVar2.b();
    }
}
