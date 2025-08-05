package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001a\u0010\u0017\u001a\u00020\u00182\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/taobao/mytaobao/pagev2/architecture/MtbDxViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "mtbContext", "Lcom/taobao/mytaobao/pagev2/architecture/MtbContext;", "flContainer", "Landroid/widget/FrameLayout;", "global", "Lcom/alibaba/fastjson/JSONObject;", "(Lcom/taobao/mytaobao/pagev2/architecture/MtbContext;Landroid/widget/FrameLayout;Lcom/alibaba/fastjson/JSONObject;)V", "dxEngine", "Lcom/taobao/android/dinamicx/DinamicXEngineRouter;", "mtbDxTemplateManager", "Lcom/taobao/mytaobao/pagev2/architecture/dx/MtbDxTemplateManager;", iar.FIELD_OLD_DATA, "Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbComponentModel;", ept.SUB_BIND_VIEW, "", "data", "desireWidth", "", "(Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbComponentModel;Ljava/lang/Integer;)V", "getAvailableDxRootView", "Lcom/taobao/android/dinamicx/DXRootView;", "hasChanged", "", "newData", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xnz extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final bd f34417a;
    private final xoc b;
    private xol c;
    private final FrameLayout d;
    private final JSONObject e;

    static {
        kge.a(-422732538);
    }

    public static /* synthetic */ Object ipc$super(xnz xnzVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnz(xny mtbContext, FrameLayout flContainer, JSONObject jSONObject) {
        super(flContainer);
        q.c(mtbContext, "mtbContext");
        q.c(flContainer, "flContainer");
        this.d = flContainer;
        this.e = jSONObject;
        this.f34417a = mtbContext.a();
        this.b = mtbContext.b();
    }

    public final void a(xol data, Integer num) {
        JSONObject a2;
        int a3;
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40fd7f34", new Object[]{this, data, num});
            return;
        }
        q.c(data, "data");
        if (!a(this.c, data)) {
            nwv.f("VH 无diff, moduleName=" + data.b());
            return;
        }
        DXRootView a4 = a(data);
        if (a4 == null || (a2 = data.a()) == null) {
            return;
        }
        if (data.h() == 3) {
            z = false;
        }
        xod xodVar = new xod(data, this.e);
        if (num != null) {
            i = num.intValue();
        }
        if (i > 0) {
            a3 = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        } else {
            a3 = gbg.a();
        }
        this.f34417a.a(a4.getContext(), a2, a4, -1, new DXRenderOptions.a().a(a3).b(gbg.b()).c(z).a((ba) xodVar).a());
        this.c = data;
    }

    private final boolean a(xol xolVar, xol xolVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25d8ed62", new Object[]{this, xolVar, xolVar2})).booleanValue();
        }
        if (xolVar == null) {
            return true;
        }
        if (xolVar2.g()) {
            xolVar2.b(false);
            return true;
        }
        return !q.a((Object) xolVar.d(), (Object) xolVar2.d());
    }

    private final DXRootView a(xol xolVar) {
        DXRootView dXRootView;
        DXResult<DXRootView> a2;
        DXRootView dXRootView2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("2e9f8a14", new Object[]{this, xolVar});
        }
        DXTemplateItem e = xolVar.e();
        if (e == null) {
            return null;
        }
        View childAt = this.d.getChildAt(0);
        if (!(childAt instanceof DXRootView)) {
            childAt = null;
        }
        DXRootView dXRootView3 = (DXRootView) childAt;
        JSONObject a3 = xolVar.a();
        if (a3 != null && !a3.isEmpty()) {
            z = false;
        }
        if (z) {
            return dXRootView3;
        }
        if (dXRootView3 == null) {
            DXTemplateItem a4 = this.b.a(e);
            if (a4 == null || (a2 = this.f34417a.a(this.d.getContext(), a4)) == null || (dXRootView2 = a2.f11780a) == null) {
                return null;
            }
            this.d.removeAllViews();
            this.d.addView(dXRootView2, -1, -2);
            return dXRootView2;
        }
        DXTemplateItem a5 = this.b.a(e);
        if (a5 == null) {
            return null;
        }
        DXTemplateItem dxTemplateItem = dXRootView3.getDxTemplateItem();
        q.a((Object) dxTemplateItem, "oldDxRootView.dxTemplateItem");
        if (q.a((Object) dxTemplateItem.b(), (Object) a5.b())) {
            return dXRootView3;
        }
        DXResult<DXRootView> a6 = this.f34417a.a(this.d.getContext(), a5);
        if (a6 == null || (dXRootView = a6.f11780a) == null) {
            return null;
        }
        this.d.removeAllViews();
        this.d.addView(dXRootView, -1, -2);
        return dXRootView;
    }
}
