package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.weex_framework.p;
import com.taobao.search.common.util.l;
import com.taobao.search.musie.q;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import java.util.Map;
import kotlin.TypeCastException;
import tb.isr;
import tb.isv;
import tb.nvc;

/* loaded from: classes8.dex */
public final class nxb extends q implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout b;
    private View c;
    private isr.c.a d;
    private isr.c.a e;

    /* loaded from: classes8.dex */
    public static final class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                nxb.this.destroyAndRemoveFromParent();
            }
        }
    }

    static {
        kge.a(400560848);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(nxb nxbVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1321168327) {
            if (hashCode == 66974264) {
                super.onRenderSuccess((p) objArr[0]);
                return null;
            } else if (hashCode != 1514279453) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.a((Map) objArr[0]);
                return null;
            }
        }
        return new Boolean(super.b((String) objArr[0], (JSONObject) objArr[1], (isr.c.a) objArr[2], (isr.c.a) objArr[3]));
    }

    @Override // com.taobao.android.xsearchplugin.muise.o, tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "MusSideModWidget";
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
    public nxb(Activity activity, ium parent, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model, TemplateBean bean, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, model, bean, viewGroup, iurVar);
        kotlin.jvm.internal.q.c(activity, "activity");
        kotlin.jvm.internal.q.c(parent, "parent");
        kotlin.jvm.internal.q.c(model, "model");
        kotlin.jvm.internal.q.c(bean, "bean");
    }

    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o
    public FrameLayout s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("d9f7991f", new Object[]{this});
        }
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_side_mod_layout, getContainer(), false);
        View findViewById = inflate.findViewById(R.id.v_side_mod_bg);
        kotlin.jvm.internal.q.a((Object) findViewById, "rootView.findViewById(R.id.v_side_mod_bg)");
        this.c = findViewById;
        View view = this.c;
        if (view == null) {
            kotlin.jvm.internal.q.b("mSideModBg");
        }
        view.setOnClickListener(this);
        View findViewById2 = inflate.findViewById(R.id.fl_side_mod_container);
        kotlin.jvm.internal.q.a((Object) findViewById2, "rootView.findViewById(R.id.fl_side_mod_container)");
        this.b = (FrameLayout) findViewById2;
        FrameLayout frameLayout = this.b;
        if (frameLayout == null) {
            kotlin.jvm.internal.q.b("mSideModContainer");
        }
        frameLayout.getLayoutParams().width = l.d(600);
        if (inflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        return (FrameLayout) inflate;
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
        Activity activity = getActivity();
        if (!(activity instanceof com.taobao.android.searchbaseframe.uikit.a)) {
            activity = null;
        }
        com.taobao.android.searchbaseframe.uikit.a aVar = (com.taobao.android.searchbaseframe.uikit.a) activity;
        int statusBarHeight = aVar != null ? aVar.aF_() : false ? SystemBarDecorator.getStatusBarHeight(getActivity()) : 0;
        map.put("containerHeight", String.valueOf(l.b(ntx.a(getActivity(), 0))));
        map.put("statusBarHeight", String.valueOf(l.b(statusBarHeight)));
    }

    @Override // com.taobao.android.xsearchplugin.muise.o, com.taobao.android.weex_framework.g
    public void onRenderSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            return;
        }
        super.onRenderSuccess(pVar);
        com.taobao.android.xsearchplugin.muise.a aVar = this.f16263a;
        FrameLayout frameLayout = this.b;
        if (frameLayout == null) {
            kotlin.jvm.internal.q.b("mSideModContainer");
        }
        aVar.a((ViewGroup) frameLayout, pVar, false);
        a();
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        postEvent(new nvc.a());
        attachToContainer();
        View view = this.c;
        if (view == null) {
            kotlin.jvm.internal.q.b("mSideModBg");
        }
        ObjectAnimator alphaAnim = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        kotlin.jvm.internal.q.a((Object) alphaAnim, "alphaAnim");
        alphaAnim.setDuration(400L);
        alphaAnim.start();
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view == null) {
            kotlin.jvm.internal.q.b("mSideModBg");
        }
        ObjectAnimator alphaAnim = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        kotlin.jvm.internal.q.a((Object) alphaAnim, "alphaAnim");
        alphaAnim.setDuration(150L);
        alphaAnim.addListener(new a());
        alphaAnim.start();
        FrameLayout frameLayout = this.b;
        if (frameLayout == null) {
            kotlin.jvm.internal.q.b("mSideModContainer");
        }
        float[] fArr = new float[2];
        fArr[0] = 0.0f;
        FrameLayout frameLayout2 = this.b;
        if (frameLayout2 == null) {
            kotlin.jvm.internal.q.b("mSideModContainer");
        }
        fArr[1] = frameLayout2.getMeasuredWidth();
        ObjectAnimator transAnim = ObjectAnimator.ofFloat(frameLayout, "translationX", fArr);
        kotlin.jvm.internal.q.a((Object) transAnim, "transAnim");
        transAnim.setDuration(150L);
        transAnim.start();
    }

    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o, com.taobao.android.xsearchplugin.weex.weex.h
    public boolean b(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1409239", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        boolean b = super.b(str, jSONObject, aVar, aVar2);
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode == -209503344) {
                if (str.equals("closeFilter")) {
                    b();
                    return true;
                }
            } else if (hashCode == 899083272 && str.equals("searchOptionWithCallback")) {
                a(jSONObject, aVar, aVar2);
                return true;
            }
        }
        return b;
    }

    private final void a(JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("212dece0", new Object[]{this, jSONObject, aVar, aVar2});
        } else if (jSONObject != null) {
            iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model = getModel();
            kotlin.jvm.internal.q.a((Object) model, "model");
            com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?> d = model.d();
            JSONObject b = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "params");
            if (b == null) {
                return;
            }
            kotlin.jvm.internal.q.a((Object) b, "FastJsonParseUtil.optJSO…rams, \"params\") ?: return");
            for (String str : b.keySet()) {
                String string = b.getString(str);
                if (string == null) {
                    string = "";
                }
                d.setParam(str, string);
            }
            iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model2 = getModel();
            kotlin.jvm.internal.q.a((Object) model2, "model");
            model2.d().subscribe(this);
            this.d = aVar;
            this.e = aVar2;
            d.doNewSearch();
        }
    }

    public final void onEventMainThread(isv.a event) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0bf04c", new Object[]{this, event});
            return;
        }
        kotlin.jvm.internal.q.c(event, "event");
        iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model = getModel();
        kotlin.jvm.internal.q.a((Object) model, "model");
        model.d().unsubscribe(this);
        iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model2 = getModel();
        kotlin.jvm.internal.q.a((Object) model2, "model");
        com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?> d = model2.d();
        kotlin.jvm.internal.q.a((Object) d, "model.scopeDatasource");
        BaseSearchResult baseSearchResult = (BaseSearchResult) d.getLastSearchResult();
        if (baseSearchResult != null) {
            z = baseSearchResult.isSuccess();
        }
        if (z) {
            isr.c.a aVar = this.d;
            if (aVar != null) {
                aVar.a(new JSONObject());
            }
        } else {
            isr.c.a aVar2 = this.e;
            if (aVar2 != null) {
                aVar2.a(new JSONObject());
            }
        }
        isr.c.a aVar3 = null;
        this.d = aVar3;
        this.e = aVar3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else {
            b();
        }
    }
}
