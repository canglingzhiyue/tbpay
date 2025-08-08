package com.taobao.android.detail2.core.framework.view.feeds;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import tb.ctu;
import tb.fjp;
import tb.fjt;
import tb.fkr;
import tb.flf;
import tb.fmb;
import tb.fmd;
import tb.ipa;
import tb.kge;

/* loaded from: classes5.dex */
public class c extends RecyclerView.Adapter<d> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private fmb<d> f11588a;
    private fmd b;
    private a d;
    private com.taobao.android.detail2.core.framework.b e;
    private List<com.taobao.android.detail2.core.framework.data.model.d> c = new ArrayList();
    private boolean f = true;
    private List<d> g = new ArrayList();
    private List<d> h = new ArrayList();
    private boolean i = false;

    /* loaded from: classes5.dex */
    public interface a {
        void a(d dVar);
    }

    /* loaded from: classes5.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f11589a;
        public List<C0464c> b = new ArrayList();

        static {
            kge.a(-1126066936);
        }

        public b() {
        }
    }

    /* renamed from: com.taobao.android.detail2.core.framework.view.feeds.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C0464c {

        /* renamed from: a  reason: collision with root package name */
        public com.taobao.android.detail2.core.framework.data.model.d f11590a;
        public com.taobao.android.detail2.core.framework.data.model.d b;

        static {
            kge.a(124844585);
        }

        public C0464c(com.taobao.android.detail2.core.framework.data.model.d dVar, com.taobao.android.detail2.core.framework.data.model.d dVar2) {
            this.f11590a = dVar;
            this.b = dVar2;
        }
    }

    static {
        kge.a(1725807286);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 1707705895) {
            return new Integer(super.getItemViewType(((Number) objArr[0]).intValue()));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, dVar, new Integer(i)});
        } else {
            a(dVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.android.detail2.core.framework.view.feeds.d, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ d mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public c(com.taobao.android.detail2.core.framework.b bVar, fmd fmdVar, List<? extends com.taobao.android.detail2.core.framework.data.model.d> list, fmb fmbVar) {
        this.e = bVar;
        a(list);
        this.f11588a = fmbVar;
        this.b = fmdVar;
    }

    public List<com.taobao.android.detail2.core.framework.data.model.d> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.c;
    }

    public void a(List<? extends com.taobao.android.detail2.core.framework.data.model.d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.c.clear();
        if (list == null) {
            return;
        }
        this.c.addAll(list);
        fjt.a(fjt.TAG_RENDER, "刷新所有节点");
        for (int i = 0; i < this.c.size(); i++) {
            com.taobao.android.detail2.core.framework.data.model.d dVar = this.c.get(i);
            if (dVar != null) {
                dVar.f = i;
                dVar.a("nativeHalfGuide", (Object) String.valueOf(f().a(dVar.f, dVar.g)));
                fjp.a(dVar, fjp.BIZ_CONTEXT_KEY_CARD_INDEX, String.valueOf(dVar.f));
            }
        }
    }

    public void b(List<? extends com.taobao.android.detail2.core.framework.data.model.d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        a(list);
        notifyItemRangeChanged(0, list == null ? 0 : list.size());
    }

    public void c(List<? extends com.taobao.android.detail2.core.framework.data.model.d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        } else if (list != null && list.size() != 0) {
            List<com.taobao.android.detail2.core.framework.data.model.d> list2 = this.c;
            if (list2 == null || list2.size() == 0) {
                a(list);
                notifyItemRangeInserted(0, list.size());
            }
            com.taobao.android.detail2.core.framework.data.model.d dVar = this.c.get(0);
            int i = dVar != null ? dVar.f : 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                com.taobao.android.detail2.core.framework.data.model.d dVar2 = list.get(i2);
                if (dVar2 != null) {
                    dVar2.f = (i - list.size()) + i2;
                    dVar2.a("nativeHalfGuide", (Object) String.valueOf(f().a(dVar2.f, dVar2.g)));
                    fjp.a(dVar2, fjp.BIZ_CONTEXT_KEY_CARD_INDEX, String.valueOf(dVar2.f));
                    StringBuilder sb = new StringBuilder();
                    sb.append("在头部添加节点，下标：");
                    sb.append(dVar2.f);
                    sb.append("，根节点个数：");
                    sb.append(dVar2.j != null ? dVar2.j.size() : 0);
                    sb.append("，itemId：");
                    sb.append(dVar2.k);
                    fjt.a(fjt.TAG_RENDER, sb.toString());
                }
            }
            this.c.addAll(0, list);
            notifyItemRangeInserted(0, list.size());
        }
    }

    public void d(List<? extends com.taobao.android.detail2.core.framework.data.model.d> list) {
        int i;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd009dc", new Object[]{this, list});
        } else if (list != null) {
            int itemCount = getItemCount();
            List<com.taobao.android.detail2.core.framework.data.model.d> list2 = this.c;
            com.taobao.android.detail2.core.framework.data.model.d dVar = list2.get(list2.size() - 1);
            int i2 = dVar == null ? -1 : dVar.f;
            if (!ipa.an() || this.i || this.c.size() != 2 || !flf.SECOND_PLACE_HOLDER_NID.equals(this.c.get(1).k)) {
                i = i2;
                z = false;
            } else {
                i = i2 - 1;
                z = true;
            }
            for (int i3 = 0; i3 < list.size(); i3++) {
                com.taobao.android.detail2.core.framework.data.model.d dVar2 = list.get(i3);
                if (dVar2 != null) {
                    dVar2.f = i3 + i + 1;
                    dVar2.a("nativeHalfGuide", (Object) String.valueOf(f().a(dVar2.f, dVar2.g)));
                    fjp.a(dVar2, fjp.BIZ_CONTEXT_KEY_CARD_INDEX, String.valueOf(dVar2.f));
                    StringBuilder sb = new StringBuilder();
                    sb.append("在尾部添加节点，下标：");
                    sb.append(dVar2.f);
                    sb.append("，根节点个数：");
                    sb.append(dVar2.j != null ? dVar2.j.size() : 0);
                    sb.append("，itemId：");
                    sb.append(dVar2.k);
                    fjt.a(fjt.TAG_RENDER, sb.toString());
                }
            }
            if (ipa.an() && z && !list.isEmpty()) {
                com.taobao.android.detail2.core.framework.data.model.d dVar3 = list.get(0);
                list.remove(dVar3);
                this.c.set(1, dVar3);
                notifyItemChanged(1);
                this.i = true;
            }
            this.c.addAll(list);
            notifyItemRangeInserted(itemCount, list.size());
        }
    }

    public void a(boolean z, String str, com.taobao.android.detail2.core.framework.data.model.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba5438c", new Object[]{this, new Boolean(z), str, dVar});
        } else if (dVar == null || StringUtils.isEmpty(str)) {
            fjt.a(fjt.TAG_RENDER, "node为空或者nid为空，丢弃refreshnode请求");
        } else {
            for (int i = 0; i < this.c.size(); i++) {
                com.taobao.android.detail2.core.framework.data.model.d dVar2 = this.c.get(i);
                if (dVar2.k != null && dVar2.k.equals(str)) {
                    dVar.a("nativeHalfGuide", (Object) String.valueOf(f().a(dVar.f, dVar.g)));
                    fjp.a(dVar, fjp.BIZ_CONTEXT_KEY_CARD_INDEX, String.valueOf(dVar.f));
                    dVar2.k = dVar.k;
                    dVar2.B = z;
                    dVar2.C = dVar.C;
                    Activity g = this.e.g();
                    fjt.a(g, fjt.TAG_UT, i + "isPreload更新执行： " + dVar2.C);
                    if (dVar2.j != null) {
                        fjt.a(fjt.TAG_RENDER, "刷新第" + i + "个节点, 根节点个数：" + dVar2.j.size() + ", itemid: " + dVar2.k);
                    } else {
                        fjt.a(fjt.TAG_RENDER, "刷新第" + i + "个节点, 错误状态：" + dVar2.y + ", itemid: " + dVar2.k);
                    }
                    notifyItemChanged(i, dVar);
                    return;
                }
            }
            fjt.a(fjt.TAG_RENDER, "没有在列表中找到对应nid的数据节点，丢弃refreshnode请求");
        }
    }

    public b a(List<? extends com.taobao.android.detail2.core.framework.data.model.d> list, int i) {
        com.taobao.android.detail2.core.framework.data.model.d dVar;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e63469fe", new Object[]{this, list, new Integer(i)});
        }
        b bVar = new b();
        if (i < 0 || i >= this.c.size()) {
            fjt.a(fjt.TAG_REARRANGE, "UI侧得出的positionFinal<0或超出列表size，不刷新,positionFinal: " + i);
            bVar.f11589a = i;
            return bVar;
        }
        int i3 = -1;
        if (list == null || list.size() == 0) {
            fjt.a(fjt.TAG_REARRANGE, "UI侧收到的刷新列表为空，丢弃结果");
            bVar.f11589a = -1;
            return bVar;
        }
        List<com.taobao.android.detail2.core.framework.data.model.d> list2 = this.c;
        ListIterator<com.taobao.android.detail2.core.framework.data.model.d> listIterator = list2.subList(i, list2.size()).listIterator();
        int i4 = i - 1;
        int i5 = (i4 >= 0 && (dVar = this.c.get(i4)) != null) ? dVar.f : -1;
        while (listIterator.hasNext()) {
            i3++;
            com.taobao.android.detail2.core.framework.data.model.d next = listIterator.next();
            if (next != null && !next.U) {
                if (i2 >= list.size()) {
                    break;
                }
                com.taobao.android.detail2.core.framework.data.model.d dVar2 = list.get(i2);
                while (dVar2 == null && i2 < list.size() - 1) {
                    i2++;
                    dVar2 = list.get(i2);
                }
                if (dVar2 == null) {
                    break;
                }
                dVar2.f = i3 + i5 + 1;
                next.a("nativeHalfGuide", (Object) String.valueOf(f().a(next.f, next.g)));
                fjp.a(next, fjp.BIZ_CONTEXT_KEY_CARD_INDEX, String.valueOf(next.f));
                bVar.b.add(new C0464c(next, dVar2));
                listIterator.remove();
                listIterator.add(dVar2);
                i2++;
            }
        }
        notifyItemRangeChanged(i, this.c.size() - i);
        bVar.f11589a = i;
        return bVar;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        for (int i = 0; i < this.c.size(); i++) {
            com.taobao.android.detail2.core.framework.data.model.d dVar = this.c.get(i);
            if (dVar != null && StringUtils.equals(dVar.k, str)) {
                if (dVar.j != null) {
                    fjt.a(fjt.TAG_RENDER, "删除第" + i + "个节点, 根节点个数：" + dVar.j.size() + ", itemid: " + dVar.k);
                } else {
                    fjt.a(fjt.TAG_RENDER, "删除第" + i + "个节点, 错误状态：" + dVar.y + ", itemid: " + dVar.k);
                }
                this.c.remove(dVar);
                notifyItemRemoved(i);
                return;
            }
        }
    }

    public int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        for (int i = 0; i < this.c.size(); i++) {
            com.taobao.android.detail2.core.framework.data.model.d dVar = this.c.get(i);
            if (dVar != null && StringUtils.equals(dVar.k, str)) {
                return i;
            }
        }
        return -1;
    }

    public int a(String str, int i) {
        com.taobao.android.detail2.core.framework.data.model.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        List<com.taobao.android.detail2.core.framework.data.model.d> list = this.c;
        if (list == null) {
            return -1;
        }
        return (i < 0 || i >= list.size() || (dVar = this.c.get(i)) == null || !StringUtils.equals(dVar.k, str)) ? b(str) : i;
    }

    public d a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("362988a9", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (this.f11588a == null) {
            return null;
        }
        ctu.a("generateViewHolder_viewType_" + i);
        d a2 = this.f11588a.a(this.e, this.b, viewGroup, i);
        ctu.a();
        if (a2 == null) {
            return null;
        }
        fjt.a(fjt.TAG_RENDER, "onCreateViewHolder: " + a2);
        if (!this.h.contains(a2)) {
            this.h.add(a2);
        }
        return a2;
    }

    public void a(d dVar, int i) {
        List<com.taobao.android.detail2.core.framework.data.model.d> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b90bafec", new Object[]{this, dVar, new Integer(i)});
        } else if (this.e.g() == null) {
            fjp.b("main", fjp.ERROR_CODE_COMMON_CONTEXT_NULL, "上下文为空，onBindViewHolder" + i + "停止执行", (Map<String, String>) null);
        } else if (dVar == null || (list = this.c) == null || list.size() <= i) {
        } else {
            b(dVar, i);
            com.taobao.android.detail2.core.framework.data.model.d dVar2 = this.c.get(i);
            if (dVar2 != null) {
                fjt.a(fjt.TAG_RENDER, "onBindViewHolder" + i + ", nid:" + dVar2.k + ", " + dVar);
            }
            try {
                ctu.a("onBindViewHolder_bindData_" + i);
                dVar.b((d) dVar2);
                ctu.a();
            } catch (Throwable th) {
                T t = dVar.i;
                fjp.a((com.taobao.android.detail2.core.framework.data.model.d) t, fjp.ERROR_CODE_COMMON_ADAPTER_BIND_DATA_ERROR, "卡片[" + dVar.getAdapterPosition() + "] bindData出现异常: ", th, true);
                StringBuilder sb = new StringBuilder();
                sb.append(dVar.getAdapterPosition());
                sb.append("adapter onBindViewHolder执行异常");
                fjt.a(fjt.TAG_RENDER, sb.toString(), th);
            }
            a aVar = this.d;
            if (aVar == null) {
                return;
            }
            aVar.a(dVar);
        }
    }

    private void b(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d4a1f8b", new Object[]{this, dVar, new Integer(i)});
        } else if ((!f().z() && !f().C()) || !this.f || i == 0) {
        } else {
            this.g.add(dVar);
            dVar.r();
        }
    }

    private fkr f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkr) ipChange.ipc$dispatch("357cdd4c", new Object[]{this}) : this.e.h();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<com.taobao.android.detail2.core.framework.data.model.d> list = this.c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        List<com.taobao.android.detail2.core.framework.data.model.d> list = this.c;
        if (list == null) {
            return super.getItemViewType(i);
        }
        com.taobao.android.detail2.core.framework.data.model.d dVar = list.get(i);
        if (dVar == null) {
            return super.getItemViewType(i);
        }
        return this.f11588a.a(dVar.g);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("657c7fbb", new Object[]{this, aVar});
        } else {
            this.d = aVar;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (f().z() || f().C()) {
            this.f = false;
            for (d dVar : this.g) {
                if (dVar != null) {
                    dVar.s();
                }
            }
            this.g.clear();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (d dVar : this.h) {
            if (dVar != null) {
                dVar.w();
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        for (d dVar : this.h) {
            if (dVar != null) {
                dVar.x();
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        for (d dVar : this.h) {
            if (dVar != null) {
                dVar.y();
            }
        }
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        for (d dVar : this.h) {
            if (dVar != null) {
                fjt.a(fjt.TAG_RENDER, dVar.F() + "sendEventToAllHolderWeex: " + str);
                dVar.c(str, jSONObject);
            }
        }
    }
}
