package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.android.ultron.vfw.viewholder.h;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.goods.list.IDMComponentsFrameLayout;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.goods.list.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.e;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.g;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.b;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.i;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/* loaded from: classes6.dex */
public abstract class kas<DataType> extends jwg<DataType> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public c f29922a;
    public ItemCategory b;
    public List<DataType> c;
    public b d;
    private String e;
    private i g;
    private boolean h;
    private a i;
    private kxo j;
    private int l = new Random().nextInt();
    private RecyclerView m;
    private jzm n;

    static {
        kge.a(999198439);
    }

    public static /* synthetic */ Object ipc$super(kas kasVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1324657775) {
            super.onViewRecycled((RecyclerView.ViewHolder) objArr[0]);
            return null;
        } else if (hashCode != -955520525) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        }
    }

    @Override // tb.jwg
    public abstract com.taobao.taolive.sdk.goodlist.a a(int i);

    public abstract int b();

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    public kas(c cVar, ItemCategory itemCategory, List<DataType> list, RecyclerView recyclerView) {
        this.i = null;
        this.f29922a = cVar;
        this.b = itemCategory;
        this.c = list;
        this.m = recyclerView;
        this.g = new i(itemCategory);
        this.g.a(this.f29922a);
        d B = this.f29922a.B();
        this.i = new a(this.f29922a, B.q().v(), B, true);
        this.i.a(recyclerView);
        this.j = new kxo(this.f29922a, this.i);
        his.b("BaseGoodStateAdapter", "BaseGoodStateAdapter 创建");
        this.n = new jzm();
    }

    @Override // tb.jwg
    public List<DataType> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.c;
    }

    @Override // tb.jwg
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    @Override // tb.jwg
    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("704c2d47", new Object[]{this, bVar});
        } else {
            this.d = bVar;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : this.j.a(i);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        com.taobao.taolive.sdk.goodlist.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.h && i == this.c.size()) {
            return 9;
        }
        List<DataType> list = this.c;
        if (list != null && list.size() > i && (a2 = a(i)) != null) {
            return a2.f21830a;
        }
        return 4;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
        } else if (i == this.c.size()) {
        } else {
            this.l = new Random().nextInt();
            com.taobao.taolive.sdk.goodlist.a a2 = a(i);
            if (a2 == null || viewHolder.itemView == null) {
                return;
            }
            his.a("BaseGoodStateAdapter", "onBindViewHolder| , index=" + a2.c + " holder=" + viewHolder);
            long currentTimeMillis = System.currentTimeMillis();
            if (!hjn.a(a2.f21830a)) {
                DataType datatype = this.c.get(0);
                boolean a3 = this.g.a(this.f29922a, a2.b, datatype instanceof e ? ((e) datatype).g : false, false);
                b bVar = this.d;
                if (bVar != null && a3) {
                    bVar.a(this.f29922a, a2.b);
                }
            }
            JSONObject jSONObject = (JSONObject) a2.b.clone();
            int b = b();
            if (i >= b) {
                i -= b;
            }
            jSONObject.put("item_position", (Object) Integer.valueOf(i + 1));
            g gVar = (g) viewHolder;
            if (gVar.c() == null) {
                z = true;
            }
            boolean a4 = a(gVar.d());
            String a5 = gVar.d().a();
            if (!com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.m() || !a4) {
                if (gVar.d() != null) {
                    gVar.d().a(gVar, jSONObject, a2.c);
                }
            } else {
                if ((viewHolder.itemView instanceof FrameLayout) && ((FrameLayout) viewHolder.itemView).getChildCount() == 0) {
                    c cVar = this.f29922a;
                    int a6 = hiq.a(jSONObject, cVar, a5, hiq.a(cVar));
                    View view = new View(this.f29922a.f());
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, hin.a(a6)));
                    ((FrameLayout) viewHolder.itemView).addView(view);
                    his.a("BaseGoodStateAdapter", "index=" + a2.c + " type=" + a5 + "    holdHeight=" + a6);
                }
                this.n.a(gVar, jSONObject, a2.c);
            }
            if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() != null && 4 == viewHolder.getItemViewType() && this.l % 10 == 0 && (this.f29922a.p() || (!com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.m() && this.l % 30 == 0))) {
                long currentTimeMillis2 = System.currentTimeMillis();
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("time", Long.toString(currentTimeMillis2 - currentTimeMillis));
                hashMap.put("isFirst", Boolean.toString(z));
                hashMap.put(fjp.BIZ_CONTEXT_KEY_CARD_TYPE, gVar.d().a());
                hashMap.put("glNewPage", com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(this.f29922a) ? "1" : "0");
                com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("GLBindDataTime", hashMap);
            }
            this.l++;
            if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.m()) {
                return;
            }
            hib.b();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<DataType> list = this.c;
        if (list != null && list.size() > 0) {
            return this.c.size() + (this.h ? 1 : 0);
        }
        return 0;
    }

    @Override // tb.jwg
    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        boolean z2 = this.h;
        this.h = z;
        return z2 != this.h;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c70be9f3", new Object[]{this, viewHolder});
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        int adapterPosition = viewHolder.getAdapterPosition();
        com.taobao.taolive.sdk.goodlist.a a2 = a(adapterPosition);
        if (a2 == null || a2.b == null) {
            return;
        }
        a2.b.remove("native_topItemAnimShow");
        if (!this.f29922a.J()) {
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.track.c.a(this.e, a2, adapterPosition, b(), this.f29922a);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10b5391", new Object[]{this, viewHolder});
            return;
        }
        super.onViewRecycled(viewHolder);
        if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.m() || !(viewHolder instanceof g) || !(viewHolder.itemView instanceof IDMComponentsFrameLayout)) {
            return;
        }
        IDMComponentsFrameLayout iDMComponentsFrameLayout = (IDMComponentsFrameLayout) viewHolder.itemView;
        List<IDMComponent> components = iDMComponentsFrameLayout.getComponents();
        List<h> recyclerViewHolders = iDMComponentsFrameLayout.getRecyclerViewHolders();
        for (int i = 0; i < recyclerViewHolders.size(); i++) {
            this.i.a(recyclerViewHolders.get(i), components.get(i), false);
        }
        iDMComponentsFrameLayout.removeAllViews();
        iDMComponentsFrameLayout.clearIDMComponents();
        iDMComponentsFrameLayout.clearRecyclerViewHolders();
    }

    @Override // tb.jwg
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.n.a();
        }
    }

    public void a(List<IDMComponentsFrameLayout> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                int position = this.m.getLayoutManager().getPosition(list.get(i));
                his.a("BaseGoodStateAdapter", "refreshHolder | pos=" + position);
                if (position >= 0) {
                    notifyItemChanged(position);
                }
            }
        }
    }

    private boolean a(kuj kujVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f1cd669c", new Object[]{this, kujVar})).booleanValue() : kujVar instanceof lsc;
    }
}
