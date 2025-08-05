package com.alibaba.android.ultron.vfw.weex2;

import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.bny;
import tb.kge;

/* loaded from: classes2.dex */
public class h implements com.alibaba.android.ultron.vfw.viewholder.f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bny f2770a;
    private List<Pair<String, Integer>> b = new ArrayList();
    private List<g> c = new ArrayList();
    private b d;

    static {
        kge.a(1672118067);
        kge.a(1171232783);
    }

    public h(bny bnyVar) {
        this.f2770a = bnyVar;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.f
    public int b(IDMComponent iDMComponent) {
        JSONObject containerInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73527efe", new Object[]{this, iDMComponent})).intValue();
        }
        if (iDMComponent == null || (containerInfo = iDMComponent.getContainerInfo()) == null) {
            return 0;
        }
        String string = containerInfo.getString("url");
        if (TextUtils.isEmpty(string)) {
            return 0;
        }
        for (Pair<String, Integer> pair : this.b) {
            if (pair != null && TextUtils.equals(string, (CharSequence) pair.first)) {
                return ((Integer) pair.second).intValue();
            }
        }
        int hashCode = string.hashCode();
        this.b.add(new Pair<>(string, Integer.valueOf(hashCode)));
        return hashCode;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.f
    public com.alibaba.android.ultron.vfw.viewholder.h a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.viewholder.h) ipChange.ipc$dispatch("7bf26661", new Object[]{this, viewGroup, new Integer(i)});
        }
        Iterator<Pair<String, Integer>> it = this.b.iterator();
        while (true) {
            if (it.hasNext()) {
                Pair<String, Integer> next = it.next();
                if (next != null && ((Integer) next.second).intValue() == i) {
                    Object obj = next.first;
                    break;
                }
            } else {
                break;
            }
        }
        g gVar = new g(this.f2770a);
        gVar.b(viewGroup);
        gVar.a(this.d);
        this.c.add(gVar);
        return new com.alibaba.android.ultron.vfw.viewholder.h(gVar.a(), gVar);
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b497d115", new Object[]{this, bVar});
        } else {
            this.d = bVar;
        }
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.f
    public void a(com.alibaba.android.ultron.vfw.viewholder.h hVar, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d0eda7", new Object[]{this, hVar, iDMComponent});
        } else if (hVar == null) {
            UnifyLog.d("Weex2ViewHolderProvider.bindData", "viewHolder is null");
        } else {
            com.alibaba.android.ultron.vfw.viewholder.b b = hVar.b();
            if (b == null) {
                UnifyLog.d("Weex2ViewHolderProvider.bindData", "subViewHolder is null");
            } else {
                b.b(iDMComponent);
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (g gVar : this.c) {
            if (gVar != null) {
                gVar.e();
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (g gVar : this.c) {
            if (gVar != null) {
                gVar.f();
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        for (g gVar : this.c) {
            if (gVar != null) {
                gVar.g();
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        for (g gVar : this.c) {
            if (gVar != null) {
                gVar.h();
            }
        }
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.f
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (g gVar : this.c) {
            if (gVar != null) {
                gVar.d();
            }
        }
        this.c.clear();
    }
}
