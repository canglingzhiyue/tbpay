package tb;

import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.base.IItemRenderService;
import com.taobao.infoflow.protocol.view.item.c;
import java.util.ArrayList;
import java.util.List;
import tb.acj;

/* loaded from: classes7.dex */
public class lia extends RecyclerView.Adapter<lib> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<BaseSectionModel> b;
    private final c c;
    private final lla d;
    private final a e;
    private final lig g;
    private final lid h;
    private final lif i;

    /* renamed from: a  reason: collision with root package name */
    private List<BaseSectionModel> f30644a = new ArrayList();
    private final lie f = new lie();
    private final lic j = new lic();

    /* loaded from: classes7.dex */
    public interface a {
        void a(List<BaseSectionModel> list);
    }

    static {
        kge.a(1989189194);
    }

    public static /* synthetic */ Object ipc$super(lia liaVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(lib libVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, libVar, new Integer(i)});
        } else {
            a(libVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [tb.lib, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ lib mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public lia(ljs ljsVar, RecyclerView recyclerView, lla llaVar, a aVar) {
        this.d = llaVar;
        this.e = aVar;
        this.c = a(ljsVar);
        this.g = new lig(recyclerView, this.c);
        this.h = new lid(recyclerView, this.c);
        this.i = new lif(recyclerView);
        this.f30644a.add(com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.model.a.a());
    }

    public void a(List<BaseSectionModel> list, com.taobao.infoflow.protocol.model.datamodel.action.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4226b813", new Object[]{this, list, aVar});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (list != null && list == this.b) {
            if (aVar.c()) {
                ldf.d("InfoFlowRVAdapter", "refreshData 强制刷新");
                notifyDataSetChanged();
                ldf.d("InfoFlowRVAdapter", "refreshData isForceRefresh 强制刷新, cost: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
                return;
            } else if (aVar.a()) {
                ldf.d("InfoFlowRVAdapter", "refreshData isBaseRefresh");
                return;
            }
        }
        this.b = list;
        List<BaseSectionModel> list2 = this.f30644a;
        this.f30644a = a(list, aVar.b());
        a(this.f30644a);
        if (aVar.a()) {
            if ("l".equals(ldc.a()) && xnh.a()) {
                ADaemon.boostCpu(500);
            }
            ldf.d("InfoFlowRVAdapter", "refreshData 通知全量刷新");
            notifyDataSetChanged();
            return;
        }
        ldf.d("InfoFlowRVAdapter", "refreshData 通知差量刷新");
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        acj.b a2 = acj.a(new lih(list2, this.f30644a), false);
        ldf.d("InfoFlowRVAdapter", "DiffUtil.calculateDiff 耗时： " + (SystemClock.elapsedRealtime() - elapsedRealtime2) + " ms");
        a2.a(this);
        ldf.d("InfoFlowRVAdapter", "refreshData 差量刷新, cost: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
    }

    public void a(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc98adb0", new Object[]{this, baseSectionModel});
            return;
        }
        int a2 = lix.a(baseSectionModel.getSectionBizCode(), this.f30644a);
        if (a2 == -1) {
            return;
        }
        this.f30644a.set(a2, baseSectionModel);
        notifyItemChanged(a2);
    }

    public lib a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lib) ipChange.ipc$dispatch("56b381e5", new Object[]{this, viewGroup, new Integer(i)});
        }
        View createView = this.c.createView(viewGroup, i);
        View a2 = this.i.a(createView);
        this.d.c(createView);
        return new lib(a2, createView);
    }

    public void a(lib libVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67db3730", new Object[]{this, libVar, new Integer(i)});
            return;
        }
        List<BaseSectionModel> list = this.f30644a;
        if (list == null || list.isEmpty() || libVar.itemView == null) {
            return;
        }
        if (xnh.a()) {
            gso.a();
        }
        BaseSectionModel<?> baseSectionModel = this.f30644a.get(i);
        boolean a2 = this.j.a(baseSectionModel, libVar);
        if (a2) {
            nuw.a("InfoFlowRVAdapter", baseSectionModel.getSectionBizCode());
            this.c.bindData(libVar.b(), baseSectionModel);
            nuw.b("InfoFlowRVAdapter", baseSectionModel.getSectionBizCode());
            libVar.a(baseSectionModel);
        }
        nuw.a("InfoFlowRVAdapter", "notifyOnBindData");
        this.d.a(a2, i, baseSectionModel, libVar.b());
        nuw.b("InfoFlowRVAdapter", "notifyOnBindData");
        nuw.a("InfoFlowRVAdapter", "bindDataViewCompensation");
        this.f.a(baseSectionModel, libVar);
        nuw.b("InfoFlowRVAdapter", "bindDataViewCompensation");
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<BaseSectionModel> list = this.f30644a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        BaseSectionModel a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        List<BaseSectionModel> list = this.f30644a;
        if (list == null || list.isEmpty()) {
            this.f30644a = new ArrayList(1);
            a2 = com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.model.a.a();
            this.f30644a.add(a2);
        } else {
            a2 = this.f30644a.get(i);
            a2.put("position", (Object) Integer.valueOf(i));
        }
        return this.c.getViewType(a2);
    }

    private void a(List<BaseSectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.e.a(list);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.h.a(this.f30644a, false);
        this.g.a(this.f30644a, true, "NONE");
    }

    public List<BaseSectionModel> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.f30644a;
    }

    public BaseSectionModel<?> a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("f8d4363", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.f30644a.size()) {
            return this.f30644a.get(i);
        }
        return null;
    }

    public List<BaseSectionModel> a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("135b967f", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (i >= 0 && i2 < this.f30644a.size()) {
            return this.f30644a.subList(i, i2);
        }
        ldf.d("InfoFlowRVAdapter", "范围异常， fromIndex： " + i + "， toIndex ： " + i2 + ", mDataList.size() : " + this.f30644a.size());
        return null;
    }

    private c a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("9ebbe588", new Object[]{this, ljsVar});
        }
        IItemRenderService iItemRenderService = (IItemRenderService) ljsVar.a(IItemRenderService.class);
        if (iItemRenderService == null) {
            throw new IllegalArgumentException("InfoFlowRVAdapter， IItemRenderService 为必须注册服务");
        }
        return iItemRenderService.getItemRenderPresenter();
    }

    private List<BaseSectionModel> a(List<BaseSectionModel> list, boolean z) {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d637f44c", new Object[]{this, list, new Boolean(z)});
        }
        if (list == null || list.isEmpty()) {
            ldf.b("InfoFlowRVAdapter", "InfoFlowRVAdapter", "cards is empty");
            arrayList = new ArrayList(1);
            arrayList.add(com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.model.a.a());
        } else {
            arrayList = new ArrayList(list.size() + 1);
            arrayList.addAll(list);
        }
        if (b(list, z)) {
            arrayList.add(com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.model.a.b());
            this.g.a(this.f30644a, false, "LOADING");
        }
        return arrayList;
    }

    private boolean b(List<BaseSectionModel> list, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0266f3e", new Object[]{this, list, new Boolean(z)})).booleanValue() : list != null && !list.isEmpty() && !z;
    }
}
