package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.monitor.procedure.v;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001eH\u0002J\u0016\u0010\u001f\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001eH\u0002J\u0010\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"H\u0002J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u001eJ\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100%J\b\u0010&\u001a\u00020\u0018H\u0016J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u0018H\u0016J\u001a\u0010)\u001a\u00020\u001c2\b\u0010*\u001a\u0004\u0018\u00010\u00022\u0006\u0010(\u001a\u00020\u0018H\u0016J\u0018\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0018H\u0016J\u0014\u0010/\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/taobao/mytaobao/pagev2/architecture/MtbAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "mtbContext", "Lcom/taobao/mytaobao/pagev2/architecture/MtbContext;", "weexManager", "Lcom/taobao/mytaobao/pagev2/MtbWeexManager;", "(Lcom/taobao/mytaobao/pagev2/architecture/MtbContext;Lcom/taobao/mytaobao/pagev2/MtbWeexManager;)V", "globalInfo", "Lcom/alibaba/fastjson/JSONObject;", "getGlobalInfo", "()Lcom/alibaba/fastjson/JSONObject;", "setGlobalInfo", "(Lcom/alibaba/fastjson/JSONObject;)V", "mDataList", "", "Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbComponentModel;", "mDataMap", "", "", "parentView", "Landroid/view/View;", "position2Type", "Ljava/util/HashMap;", "", "viewTypeHelper", "Lcom/taobao/mytaobao/pagev2/architecture/viewtype/ViewTypeHelper;", "buildViewTypes", "", "list", "", "considerDownloadDxTemplate", "generateEmptyViewHolder", "context", "Landroid/content/Context;", "getDataList", "getDataMap", "", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", c.MSG_SOURCE_PARENT, "Landroid/view/ViewGroup;", b.VIEW_TYPE, "setData", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xnx extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<xol> f34414a;
    private final Map<String, xol> b;
    private final HashMap<Integer, Integer> c;
    private final xof d;
    private JSONObject e;
    private View f;
    private final xny g;
    private final com.taobao.mytaobao.pagev2.b h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/taobao/mytaobao/pagev2/architecture/MtbAdapter$generateEmptyViewHolder$1", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f34415a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, View view2) {
            super(view2);
            this.f34415a = view;
        }
    }

    static {
        kge.a(629295630);
    }

    public static /* synthetic */ Object ipc$super(xnx xnxVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public xnx(xny mtbContext, com.taobao.mytaobao.pagev2.b weexManager) {
        q.c(mtbContext, "mtbContext");
        q.c(weexManager, "weexManager");
        this.g = mtbContext;
        this.h = weexManager;
        this.f34414a = new ArrayList();
        this.b = new LinkedHashMap();
        this.c = new HashMap<>();
        this.d = new xof();
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.e = jSONObject;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup parent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, parent, new Integer(i)});
        }
        q.c(parent, "parent");
        this.f = parent;
        nwv.f("【onCreateViewHolder】, viewType=" + i);
        if (this.d.a(i)) {
            return new xnz(this.g, new FrameLayout(parent.getContext()), this.e);
        }
        if (this.d.b(i)) {
            parent.getWidth();
            parent.getHeight();
            mxo.g();
            FrameLayout frameLayout = new FrameLayout(parent.getContext());
            frameLayout.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new xoa(this.h, frameLayout);
        }
        Context context = parent.getContext();
        q.a((Object) context, "parent.context");
        return a(context);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        nwv.a("onBindViewHolder" + i);
        nwv.f("onBindViewHolder, position=" + i);
        if (viewHolder instanceof xnz) {
            xnz xnzVar = (xnz) viewHolder;
            xol xolVar = this.f34414a.get(i);
            View view = this.f;
            xnzVar.a(xolVar, view != null ? Integer.valueOf(view.getWidth()) : null);
        } else if (viewHolder instanceof xoa) {
            ((xoa) viewHolder).a(this.f34414a.get(i));
        }
        nwv.e("onBindViewHolder" + i);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.f34414a.size();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        Integer num = this.c.get(Integer.valueOf(i));
        if (num == null) {
            q.a();
        }
        return num.intValue();
    }

    public final List<xol> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f34414a;
    }

    public final Map<String, xol> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.b;
    }

    public final void a(List<xol> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        q.c(list, "list");
        if (!q.a(this.f34414a, list)) {
            this.f34414a.clear();
            this.b.clear();
            for (xol xolVar : list) {
                this.f34414a.add(xolVar);
                Map<String, xol> map = this.b;
                String b = xolVar.b();
                if (b == null) {
                    q.a();
                }
                map.put(b, xolVar);
            }
        }
        b(list);
        c(list);
    }

    private final RecyclerView.ViewHolder a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("150e2f1d", new Object[]{this, context});
        }
        View view = new View(context);
        return new a(view, view);
    }

    private final void b(List<xol> list) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                p.b();
            }
            this.c.put(Integer.valueOf(i), Integer.valueOf(this.d.a((xol) obj)));
            i = i2;
        }
    }

    private final void c(List<xol> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (xol xolVar : list) {
            DXTemplateItem e = xolVar.e();
            if (e != null && q.a((Object) xolVar.c(), (Object) "dinamicx")) {
                arrayList.add(e);
            }
        }
        this.g.c().a(arrayList);
    }
}
