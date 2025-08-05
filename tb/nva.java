package tb;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.weex_framework.p;
import com.taobao.search.musie.q;
import com.taobao.taobao.R;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import tb.iqt;
import tb.nvc;
import tb.nww;

/* loaded from: classes8.dex */
public class nva extends q implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    public static boolean b;
    private PopupWindow c;
    private FrameLayout d;
    private int e;

    static {
        kge.a(-2092275597);
        kge.a(-1201612728);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(nva nvaVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -211767613) {
            super.onComponentDestroy();
            return null;
        } else if (hashCode != 66974264) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onRenderSuccess((p) objArr[0]);
            return null;
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.o, tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "CommonWeexDropLayerWidget";
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
    public nva(Activity activity, ium parent, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model, TemplateBean bean, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, model, bean, viewGroup, iurVar);
        kotlin.jvm.internal.q.c(activity, "activity");
        kotlin.jvm.internal.q.c(parent, "parent");
        kotlin.jvm.internal.q.c(model, "model");
        kotlin.jvm.internal.q.c(bean, "bean");
        postEvent(new nvc.a());
        subscribeEvent(this);
        subscribeScopeEvent(this, "childPageWidget");
        model.d().subscribe(this);
    }

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(-1212899333);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o
    public FrameLayout s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("d9f7991f", new Object[]{this});
        }
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_lbs_drop_layer, (ViewGroup) new FrameLayout(getActivity()), false);
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
        } else if (map == null) {
        } else {
            map.put("containerHeight", String.valueOf(this.e));
        }
    }

    @Override // com.taobao.search.musie.q, tb.ius, tb.iup
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout == null) {
            return;
        }
        this.d = (FrameLayout) frameLayout.findViewById(R.id.black_cover);
        FrameLayout frameLayout2 = this.d;
        if (frameLayout2 != null) {
            frameLayout2.setOnClickListener(this);
        }
        int[] iArr = new int[2];
        ViewGroup container = getContainer();
        if (container == null) {
            kotlin.jvm.internal.q.a();
        }
        container.getLocationOnScreen(iArr);
        int i = iArr[1];
        ViewGroup container2 = getContainer();
        if (container2 == null) {
            kotlin.jvm.internal.q.a();
        }
        kotlin.jvm.internal.q.a((Object) container2, "container!!");
        this.e = ntx.a(i, container2.getHeight(), getActivity());
        frameLayout.getLayoutParams().height = this.e;
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
        this.c = new PopupWindow((View) getView());
        PopupWindow popupWindow = this.c;
        if (popupWindow == null) {
            return;
        }
        popupWindow.setAnimationStyle(0);
        popupWindow.setWidth(ntx.a());
        popupWindow.setHeight(this.e);
        PopupWindow popupWindow2 = this.c;
        if (popupWindow2 == null) {
            kotlin.jvm.internal.q.a();
        }
        popupWindow2.showAsDropDown(getContainer());
        b = true;
    }

    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o, tb.iut
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        unsubscribeScopeEvent(this, "childPageWidget");
        iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model = getModel();
        kotlin.jvm.internal.q.a((Object) model, "model");
        model.d().unsubscribe(this);
        PopupWindow popupWindow = this.c;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        b = false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (!kotlin.jvm.internal.q.a(view, this.d)) {
        } else {
            a();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            destroyAndRemoveFromParent();
        }
    }

    public final void onEventMainThread(nww.a activityResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26bf964a", new Object[]{this, activityResult});
            return;
        }
        kotlin.jvm.internal.q.c(activityResult, "activityResult");
        com.taobao.android.xsearchplugin.muise.a mMuiseRenderer = this.f16263a;
        kotlin.jvm.internal.q.a((Object) mMuiseRenderer, "mMuiseRenderer");
        mMuiseRenderer.e().onActivityResult(activityResult.f31822a, activityResult.b, activityResult.c);
    }

    public final void onEventMainThread(nvc.a event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb86e9d", new Object[]{this, event});
            return;
        }
        kotlin.jvm.internal.q.c(event, "event");
        a();
    }

    public final void onEventMainThread(iqt.a event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd5c88c", new Object[]{this, event});
            return;
        }
        kotlin.jvm.internal.q.c(event, "event");
        a();
    }

    @Override // com.taobao.search.musie.q
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else {
            a();
        }
    }
}
