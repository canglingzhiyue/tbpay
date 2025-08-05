package com.alibaba.android.ultron.vfw.viewholder;

import android.util.Pair;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.Map;
import tb.bny;
import tb.bpl;
import tb.kge;

/* loaded from: classes2.dex */
public class g implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bny f2741a;
    private int b = 0;
    private Map<String, Pair<e, Integer>> c = new HashMap();
    private Map<Integer, String> d = new HashMap();

    static {
        kge.a(-667824459);
        kge.a(1171232783);
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.f
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public g(bny bnyVar) {
        this.f2741a = bnyVar;
    }

    public void a(String str, e eVar) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8561f26", new Object[]{this, str, eVar});
            return;
        }
        if (!this.c.containsKey(str)) {
            intValue = this.b;
            this.b = intValue + 1;
            this.c.put(str, new Pair<>(eVar, Integer.valueOf(intValue)));
        } else {
            intValue = ((Integer) this.c.get(str).second).intValue();
        }
        this.d.put(Integer.valueOf(intValue), str);
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.f
    public int b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73527efe", new Object[]{this, iDMComponent})).intValue();
        }
        if (!this.c.containsKey(iDMComponent.getType())) {
            return -1;
        }
        if (this.f2741a.u()) {
            int intValue = ((Integer) this.c.get(iDMComponent.getType()).second).intValue();
            try {
                i = this.f2741a.l().a().indexOf(iDMComponent);
            } catch (Exception unused) {
            }
            int i2 = (intValue * 50) + i;
            this.d.put(Integer.valueOf(i2), iDMComponent.getType());
            return i2;
        }
        return ((Integer) this.c.get(iDMComponent.getType()).second).intValue();
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.f
    public h a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("7bf26661", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, this.d.get(Integer.valueOf(i)));
    }

    private h a(ViewGroup viewGroup, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("db43f256", new Object[]{this, viewGroup, str});
        }
        if (str == null) {
            return new h(bpl.a(this.f2741a.k()), null);
        }
        b a2 = ((e) this.c.get(str).first).a(this.f2741a);
        a2.b(viewGroup);
        return new h(a2.a(), a2);
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.f
    public void a(h hVar, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d0eda7", new Object[]{this, hVar, iDMComponent});
            return;
        }
        b b = hVar.b();
        if (b == null) {
            return;
        }
        b.b(iDMComponent);
    }
}
