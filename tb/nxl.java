package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.a;
import com.taobao.search.sf.remote.b;
import com.taobao.search.sf.remote.c;
import com.taobao.search.sf.remote.d;
import com.taobao.search.sf.widgets.topbar.SFTopBarBean;

/* loaded from: classes8.dex */
public class nxl extends ius<SFTopBarBean, ViewGroup, iru<? extends a<? extends BaseSearchResult, ?>>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TOPBAR_STATUS_NORMAL = 1;
    public static final int TOPBAR_STATUS_TRANSPARENT = 2;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f31833a;
    private ius b;
    private SFTopBarBean c;

    static {
        kge.a(-660595525);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "topBar";
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "SFTopBarDelegateWidget";
    }

    public static /* synthetic */ FrameLayout a(nxl nxlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("2280c763", new Object[]{nxlVar}) : nxlVar.f31833a;
    }

    public static /* synthetic */ ius a(nxl nxlVar, ius iusVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ius) ipChange.ipc$dispatch("335f17c0", new Object[]{nxlVar, iusVar});
        }
        nxlVar.b = iusVar;
        return iusVar;
    }

    public static /* synthetic */ ius b(nxl nxlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ius) ipChange.ipc$dispatch("cab99488", new Object[]{nxlVar}) : nxlVar.b;
    }

    public static /* synthetic */ SFTopBarBean c(nxl nxlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SFTopBarBean) ipChange.ipc$dispatch("16ac6ee3", new Object[]{nxlVar}) : nxlVar.c;
    }

    @Override // tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((SFTopBarBean) obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, android.view.ViewGroup] */
    @Override // tb.ius
    public /* synthetic */ ViewGroup onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : a();
    }

    public nxl(Activity activity, ium iumVar, iru<? extends a<? extends BaseSearchResult, ?>> iruVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, iruVar, viewGroup, iurVar);
    }

    public ViewGroup a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("8c7138ad", new Object[]{this});
        }
        this.f31833a = new FrameLayout(getActivity());
        this.f31833a.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        c.INSTANCE.a(b(), new d(this.mActivity, this, getModel(), this.f31833a, new iur() { // from class: tb.nxl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iur
            public void b(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                }
            }

            @Override // tb.iur
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else {
                    nxl.a(nxl.this).addView(view);
                }
            }
        }), new b() { // from class: tb.nxl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.search.sf.remote.b
            public void a(ius<?, ? extends View, ?> iusVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ee67ccb1", new Object[]{this, iusVar});
                    return;
                }
                iusVar.attachToContainer();
                nxl.a(nxl.this, iusVar);
                if (nxl.b(nxl.this) == null || nxl.c(nxl.this) == null) {
                    return;
                }
                nxl.b(nxl.this).bindWithData(nxl.c(nxl.this));
            }
        });
        return this.f31833a;
    }

    public void a(SFTopBarBean sFTopBarBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9826a56d", new Object[]{this, sFTopBarBean});
            return;
        }
        this.c = sFTopBarBean;
        ius iusVar = this.b;
        if (iusVar == null || sFTopBarBean == null) {
            return;
        }
        iusVar.bindWithData(sFTopBarBean);
    }
}
