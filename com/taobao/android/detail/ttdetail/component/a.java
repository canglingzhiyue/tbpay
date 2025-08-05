package com.taobao.android.detail.ttdetail.component;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.detail.ttdetail.utils.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.eyk;
import tb.eyl;
import tb.eym;
import tb.eyn;
import tb.eyo;
import tb.eyp;
import tb.eyx;
import tb.eyy;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f10528a;
    private eyx b;
    private Map<String, ComponentViewMeta> c = new HashMap();
    private Map<String, eyl> d = new HashMap();
    private List<String> e = new ArrayList();

    static {
        kge.a(-2140601035);
    }

    public a(Context context, eyx eyxVar) {
        this.f10528a = context;
        this.b = eyxVar;
        a(context);
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        a("native", new eym(context));
        a("dinamicx", new eyk(context));
        a("weex", new eyo(context));
        a("weex2", new eyn(context));
    }

    public <C extends d> C a(eyy eyyVar, DataEntry... dataEntryArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("456c2e00", new Object[]{this, eyyVar, dataEntryArr});
        }
        if (eyyVar == null) {
            i.a("ComponentManager", "getComponent return null, because of argument data is null");
            return null;
        }
        String c = eyyVar.c();
        ComponentViewMeta a2 = a(c);
        if (a2 == null) {
            i.a("ComponentManager", "getComponentViewMeta return null, because not found ComponentViewMeta for type: " + c);
            return null;
        }
        String type = a2.getType();
        if (com.taobao.android.detail.ttdetail.utils.b.a(type, this.e)) {
            eyl b = b(type);
            eyp a3 = b.a(a2.getName());
            if (a3 == null) {
                i.a("ComponentManager", "getComponentBuilder return null, because not found IComponentBuilder for name: " + a2.getName() + " in ComponentSpace for type: " + c);
                a3 = b.a();
                if (a3 == null) {
                    i.a("ComponentManager", "getComponent return null, because not found DefaultComponentBuilder in ComponentSpace for type: " + c);
                    return null;
                }
            }
            return (C) a3.a(this.f10528a, this.b, eyyVar, dataEntryArr);
        }
        i.a("ComponentManager", "getComponent return null, because not found ComponentSpace for type: " + c);
        return null;
    }

    private boolean a(String str, eyl eylVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27b40f6e", new Object[]{this, str, eylVar})).booleanValue();
        }
        if (str == null || eylVar == null) {
            return false;
        }
        this.d.put(str, eylVar);
        this.e.add(str);
        return true;
    }

    private <S extends eyl> S b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (S) ipChange.ipc$dispatch("7d1bb67b", new Object[]{this, str});
        }
        if (str != null) {
            return (S) this.d.get(str);
        }
        return null;
    }

    public boolean a(String str, eyp eypVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27b5e0ea", new Object[]{this, str, eypVar})).booleanValue();
        }
        if (str == null || eypVar == null) {
            return false;
        }
        eyl b = b(str);
        if (b == null) {
            i.a("ComponentManager", "view space: " + str + " is null, register default component builder failed");
            return false;
        }
        b.a((eyl) eypVar);
        return true;
    }

    public boolean a(String str, String str2, eyp eypVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("283e3834", new Object[]{this, str, str2, eypVar})).booleanValue();
        }
        if (str == null || str2 == null || eypVar == null) {
            return false;
        }
        eyl b = b(str);
        if (b == null) {
            i.a("ComponentManager", "view space: " + str + " is null, register component builder name: " + str2 + "failed");
            return false;
        }
        return b.a(str2, eypVar);
    }

    public void a(String str, ComponentViewMeta componentViewMeta) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d45155df", new Object[]{this, str, componentViewMeta});
        } else {
            this.c.put(str, componentViewMeta);
        }
    }

    public void a(Map<String, ComponentViewMeta> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
            this.c.clear();
        } else {
            this.c.putAll(map);
        }
    }

    public ComponentViewMeta a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentViewMeta) ipChange.ipc$dispatch("839ae191", new Object[]{this, str});
        }
        if (str != null) {
            return this.c.get(str);
        }
        return null;
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.f10528a;
    }
}
