package com.alibaba.android.icart.core.groupcharge;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import tb.bei;
import tb.jqi;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int c;
    private long d;
    private boolean e;
    private List<IDMComponent> f;
    private HashSet<IDMComponent> b = new HashSet<>();

    /* renamed from: a  reason: collision with root package name */
    private c f2357a = new c("B&C", com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21680), 0);

    static {
        kge.a(1663652600);
    }

    public c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("73653dff", new Object[]{this}) : this.f2357a;
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef2279b9", new Object[]{this, cVar});
        } else {
            this.f2357a = cVar;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (this.b.size() == 1) {
            IDMComponent next = this.b.iterator().next();
            String str = (String) bei.a(next, (Class<Object>) String.class, "shopName");
            return TextUtils.isEmpty(str) ? (String) bei.a(next, (Class<Object>) String.class, "title") : str;
        }
        c cVar = this.f2357a;
        return cVar == null ? "" : cVar.a();
    }

    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
        } else if (iDMComponent == null) {
        } else {
            this.b.add(iDMComponent);
        }
    }

    public HashSet<IDMComponent> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashSet) ipChange.ipc$dispatch("52e25407", new Object[]{this}) : this.b;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.c;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        if (jqi.a("iCart", "enableTotalPriceDecimal", true)) {
            BigDecimal valueOf = BigDecimal.valueOf(this.d / h());
            return f() + valueOf.setScale(2, 4).doubleValue();
        }
        return f() + String.format("%1$.2f", Double.valueOf(this.d / h()));
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        List<IDMComponent> list = this.f;
        if (list == null || list.isEmpty()) {
            return "￥";
        }
        String str = (String) bei.a(this.f.get(0), (Class<Object>) String.class, "pay", "currencySymbol");
        return TextUtils.isEmpty(str) ? "￥" : str;
    }

    private int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue();
        }
        List<IDMComponent> list = this.f;
        if (list == null || list.isEmpty()) {
            return 100;
        }
        Integer num = (Integer) bei.a(this.f.get(0), (Class<Object>) Integer.class, "pay", "currencyUnitFactor");
        if (num == null || num.intValue() == 0) {
            num = 100;
        }
        return num.intValue();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.d = j;
        }
    }

    public List<IDMComponent> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this}) : this.f;
    }

    public void a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.f = list;
        }
    }
}
