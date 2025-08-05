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
import com.taobao.android.xsearchplugin.weex.weex.d;
import com.taobao.search.sf.widgets.list.listcell.weex.e;
import com.taobao.taobao.R;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.iqt;
import tb.nvc;
import tb.nww;

/* loaded from: classes8.dex */
public class nvb extends e implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    public static boolean b;
    private PopupWindow c;
    private FrameLayout d;
    private int e;

    static {
        kge.a(-23567355);
        kge.a(-1201612728);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(nvb nvbVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -211767613) {
            super.onComponentDestroy();
            return null;
        } else if (hashCode != 1583554882) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((d) objArr[0]);
            return null;
        }
    }

    @Override // tb.jzf, tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "CommonWeexDropLayerWidget";
    }

    public final void onEventMainThread(iqt.a event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd5c88c", new Object[]{this, event});
        } else {
            q.c(event, "event");
        }
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
    public nvb(Activity activity, ium parent, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model, TemplateBean bean, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, model, bean, viewGroup, iurVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(model, "model");
        q.c(bean, "bean");
        postEvent(new nvc.a());
        subscribeEvent(this);
        subscribeScopeEvent(this, "childPageWidget");
        model.d().subscribe(this);
    }

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(1551027469);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.e, tb.jzf
    public FrameLayout r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("51c75940", new Object[]{this});
        }
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_lbs_drop_layer, (ViewGroup) new FrameLayout(getActivity()), false);
        if (inflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        return (FrameLayout) inflate;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.e, tb.jzf
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            map.put("containerHeight", String.valueOf(this.e));
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.e, tb.ius, tb.iup
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
            q.a();
        }
        container.getLocationOnScreen(iArr);
        int i = iArr[1];
        ViewGroup container2 = getContainer();
        if (container2 == null) {
            q.a();
        }
        q.a((Object) container2, "container!!");
        this.e = ntx.a(i, container2.getHeight(), getActivity());
        frameLayout.getLayoutParams().height = this.e;
    }

    @Override // tb.jzf, com.taobao.android.xsearchplugin.weex.weex.a.InterfaceC0626a
    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e632142", new Object[]{this, dVar});
            return;
        }
        super.a(dVar);
        d();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
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
            q.a();
        }
        popupWindow2.showAsDropDown(getContainer());
        b = true;
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
        return new nuz(getActivity(), getCore(), this, this, q, model);
    }

    @Override // tb.jzf, tb.iut
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        unsubscribeScopeEvent(this, "childPageWidget");
        iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model = getModel();
        q.a((Object) model, "model");
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
        } else if (!q.a(view, this.d)) {
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
        q.c(activityResult, "activityResult");
        com.taobao.android.xsearchplugin.weex.weex.a mWeexRenderer = this.f29878a;
        q.a((Object) mWeexRenderer, "mWeexRenderer");
        mWeexRenderer.c().a(activityResult.f31822a, activityResult.b, activityResult.c);
    }

    public final void onEventMainThread(nvc.a event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb86e9d", new Object[]{this, event});
            return;
        }
        q.c(event, "event");
        a();
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a();
        }
    }
}
