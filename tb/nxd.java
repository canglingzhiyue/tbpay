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
import com.taobao.android.xsearchplugin.weex.weex.d;
import com.taobao.search.common.util.l;
import com.taobao.search.sf.widgets.list.listcell.weex.e;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.weex.WXSDKInstance;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.isr;
import tb.isv;
import tb.nvc;

/* loaded from: classes8.dex */
public final class nxd extends e implements View.OnClickListener {
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
                nxd.this.destroyAndRemoveFromParent();
            }
        }
    }

    static {
        kge.a(170087235);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(nxd nxdVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1321168327) {
            if (hashCode == 1514279453) {
                super.a((Map) objArr[0]);
                return null;
            } else if (hashCode != 1583554882) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.a((d) objArr[0]);
                return null;
            }
        }
        return new Boolean(super.b((String) objArr[0], (JSONObject) objArr[1], (isr.c.a) objArr[2], (isr.c.a) objArr[3]));
    }

    @Override // tb.jzf, tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "SideModWidget";
    }

    @Override // tb.jzf
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.FrameLayout, android.view.View] */
    @Override // com.taobao.search.sf.widgets.list.listcell.weex.e, tb.jzf, tb.ius
    public /* synthetic */ FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : r();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxd(Activity activity, ium parent, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model, TemplateBean bean, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, model, bean, viewGroup, iurVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(model, "model");
        q.c(bean, "bean");
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.e, tb.jzf
    public FrameLayout r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("51c75940", new Object[]{this});
        }
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_side_mod_layout, getContainer(), false);
        View findViewById = inflate.findViewById(R.id.v_side_mod_bg);
        q.a((Object) findViewById, "rootView.findViewById(R.id.v_side_mod_bg)");
        this.c = findViewById;
        View view = this.c;
        if (view == null) {
            q.b("mSideModBg");
        }
        view.setOnClickListener(this);
        View findViewById2 = inflate.findViewById(R.id.fl_side_mod_container);
        q.a((Object) findViewById2, "rootView.findViewById(R.id.fl_side_mod_container)");
        this.b = (FrameLayout) findViewById2;
        FrameLayout frameLayout = this.b;
        if (frameLayout == null) {
            q.b("mSideModContainer");
        }
        frameLayout.getLayoutParams().width = l.d(600);
        if (inflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        return (FrameLayout) inflate;
    }

    @Override // tb.jzf
    public com.taobao.android.xsearchplugin.weex.weex.a p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.xsearchplugin.weex.weex.a) ipChange.ipc$dispatch("b97cef3c", new Object[]{this});
        }
        TemplateBean q = q();
        iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model = getModel();
        q.a((Object) model, "model");
        return new nxc(getActivity(), getCore(), this, this, q, model);
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.e, tb.jzf
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

    @Override // tb.jzf, com.taobao.android.xsearchplugin.weex.weex.a.InterfaceC0626a
    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e632142", new Object[]{this, dVar});
            return;
        }
        super.a(dVar);
        com.taobao.android.xsearchplugin.weex.weex.a aVar = this.f29878a;
        FrameLayout frameLayout = this.b;
        if (frameLayout == null) {
            q.b("mSideModContainer");
        }
        aVar.a((ViewGroup) frameLayout, (WXSDKInstance) dVar, false);
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
            q.b("mSideModBg");
        }
        ObjectAnimator alphaAnim = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        q.a((Object) alphaAnim, "alphaAnim");
        alphaAnim.setDuration(400L);
        alphaAnim.start();
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view == null) {
            q.b("mSideModBg");
        }
        ObjectAnimator alphaAnim = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        q.a((Object) alphaAnim, "alphaAnim");
        alphaAnim.setDuration(150L);
        alphaAnim.addListener(new a());
        alphaAnim.start();
        FrameLayout frameLayout = this.b;
        if (frameLayout == null) {
            q.b("mSideModContainer");
        }
        float[] fArr = new float[2];
        fArr[0] = 0.0f;
        FrameLayout frameLayout2 = this.b;
        if (frameLayout2 == null) {
            q.b("mSideModContainer");
        }
        fArr[1] = frameLayout2.getMeasuredWidth();
        ObjectAnimator transAnim = ObjectAnimator.ofFloat(frameLayout, "translationX", fArr);
        q.a((Object) transAnim, "transAnim");
        transAnim.setDuration(150L);
        transAnim.start();
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.e, tb.jzf, com.taobao.android.xsearchplugin.weex.weex.h
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
                    d();
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
            q.a((Object) model, "model");
            com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?> d = model.d();
            JSONObject b = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "params");
            if (b == null) {
                return;
            }
            q.a((Object) b, "FastJsonParseUtil.optJSO…rams, \"params\") ?: return");
            for (String str : b.keySet()) {
                String string = b.getString(str);
                if (string == null) {
                    string = "";
                }
                d.setParam(str, string);
            }
            iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model2 = getModel();
            q.a((Object) model2, "model");
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
        q.c(event, "event");
        iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model = getModel();
        q.a((Object) model, "model");
        model.d().unsubscribe(this);
        iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model2 = getModel();
        q.a((Object) model2, "model");
        com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?> d = model2.d();
        q.a((Object) d, "model.scopeDatasource");
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
            d();
        }
    }
}
