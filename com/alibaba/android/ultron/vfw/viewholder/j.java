package com.alibaba.android.ultron.vfw.viewholder;

import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.bnu;
import tb.bny;
import tb.bod;
import tb.boe;
import tb.bpl;
import tb.jqi;
import tb.kge;

/* loaded from: classes2.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EMPTY_VIEW_TYPE = -1;
    private g d;
    private bny e;
    private boe g;
    private d h;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, f> f2743a = new HashMap<>();
    private Map<f, Set<Integer>> b = new HashMap();
    private final Map<f, Integer> c = new HashMap();
    private Set<Integer> f = new HashSet();

    static {
        kge.a(709467791);
    }

    public j(bny bnyVar) {
        this.e = bnyVar;
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        bny bnyVar = this.e;
        this.h = new d(bnyVar, jqi.a(bnyVar.r(), "enableDowngradeDXButter", false));
        a("dinamicx", this.h);
        a("dinamic", new d(this.e));
        this.d = new g(this.e);
        a("native", this.d);
        k kVar = new k(this.e);
        a("weex", kVar);
        a("h5", kVar);
        a("weex2", new com.alibaba.android.ultron.vfw.weex2.h(this.e));
    }

    public void a(com.alibaba.android.ultron.vfw.weex2.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b497d115", new Object[]{this, bVar});
            return;
        }
        f fVar = this.f2743a.get("weex2");
        if (!(fVar instanceof com.alibaba.android.ultron.vfw.weex2.h)) {
            return;
        }
        ((com.alibaba.android.ultron.vfw.weex2.h) fVar).a(bVar);
    }

    public void a(boe boeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21af620", new Object[]{this, boeVar});
        } else {
            this.g = boeVar;
        }
    }

    public void a(String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8561f26", new Object[]{this, str, eVar});
        } else {
            this.d.a(str, eVar);
        }
    }

    public void a(String str, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8569385", new Object[]{this, str, fVar});
            return;
        }
        this.f2743a.put(str, fVar);
        Map<f, Integer> map = this.c;
        map.put(fVar, Integer.valueOf(map.size() * 1000));
    }

    public h a(ViewGroup viewGroup, int i) {
        DXTemplateItem a2;
        DXTemplateItem a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("7bf26661", new Object[]{this, viewGroup, new Integer(i)});
        }
        bod bodVar = (bod) this.e.a(bod.class);
        f a4 = a(i);
        int intValue = i - this.c.get(a4).intValue();
        if (a4 != null) {
            if (this.f.contains(Integer.valueOf(i)) && bodVar != null && (a3 = ((d) a4).a(intValue)) != null) {
                return bodVar.a(viewGroup, bnu.a(a3));
            }
            h a5 = a4.a(viewGroup, intValue);
            if (a5.a()) {
                this.f.add(Integer.valueOf(i));
                if (bodVar != null && (a2 = ((d) a4).a(intValue)) != null) {
                    return bodVar.a(viewGroup, bnu.a(a2));
                }
            }
            return a5;
        }
        View a6 = bpl.a(this.e.k());
        boe boeVar = this.g;
        if (boeVar != null) {
            boeVar.a(viewGroup, i, (Map<String, Object>) null);
        }
        return new h(a6);
    }

    public void a(h hVar, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d0eda7", new Object[]{this, hVar, iDMComponent});
        } else if (iDMComponent == null) {
        } else {
            if (iDMComponent.getStatus() == 0) {
                hVar.itemView.setVisibility(8);
                if (hVar.itemView.getTag(R.id.view_holder_origin_height) == null) {
                    if (hVar.itemView.getLayoutParams() != null) {
                        hVar.itemView.setTag(R.id.view_holder_origin_height, Integer.valueOf(hVar.itemView.getLayoutParams().height));
                    } else {
                        hVar.itemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        hVar.itemView.setTag(R.id.view_holder_origin_height, -2);
                    }
                }
                hVar.itemView.getLayoutParams().height = 0;
                return;
            }
            hVar.itemView.setVisibility(0);
            Object tag = hVar.itemView.getTag(R.id.view_holder_origin_height);
            if (hVar.itemView.getLayoutParams() != null && (tag instanceof Integer)) {
                hVar.itemView.getLayoutParams().height = ((Integer) tag).intValue();
            }
            if (b(iDMComponent).booleanValue()) {
                this.d.a(hVar, iDMComponent);
            } else {
                f fVar = this.f2743a.get(iDMComponent.getContainerType());
                if (fVar != null) {
                    fVar.a(hVar, iDMComponent);
                }
            }
            boe boeVar = this.g;
            if (boeVar == null) {
                return;
            }
            boeVar.a(hVar, iDMComponent, hVar.d());
        }
    }

    private Boolean b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("4a3c03c8", new Object[]{this, iDMComponent});
        }
        ArrayMap<String, Object> extMap = iDMComponent.getExtMap();
        if (extMap == null) {
            return Boolean.FALSE;
        }
        Object obj = extMap.get(bod.KEY_DOWNGRADE_STATE);
        if (obj != null && (obj instanceof Boolean)) {
            return (Boolean) obj;
        }
        return Boolean.FALSE;
    }

    public void a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            for (IDMComponent iDMComponent : list) {
                if (iDMComponent != null && !StringUtils.isEmpty(iDMComponent.getType()) && !StringUtils.isEmpty(iDMComponent.getContainerType())) {
                    f fVar = this.f2743a.get(iDMComponent.getContainerType());
                    if (fVar instanceof a) {
                        ((a) fVar).a(iDMComponent);
                    }
                }
            }
        }
    }

    public int a(IDMComponent iDMComponent) {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e66567df", new Object[]{this, iDMComponent})).intValue();
        }
        if (iDMComponent == null || StringUtils.isEmpty(iDMComponent.getType()) || StringUtils.isEmpty(iDMComponent.getContainerType()) || (fVar = this.f2743a.get(iDMComponent.getContainerType())) == null) {
            return -1;
        }
        int b = fVar.b(iDMComponent) + this.c.get(fVar).intValue();
        a(fVar, b);
        return b;
    }

    private void a(f fVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("264e81d4", new Object[]{this, fVar, new Integer(i)});
            return;
        }
        Set<Integer> set = this.b.get(fVar);
        if (set == null) {
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(i));
            this.b.put(fVar, hashSet);
            return;
        }
        set.add(Integer.valueOf(i));
    }

    private f a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("5f560002", new Object[]{this, new Integer(i)});
        }
        for (f fVar : this.b.keySet()) {
            if (this.b.get(fVar).contains(Integer.valueOf(i))) {
                return fVar;
            }
        }
        return null;
    }

    public f a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("35797219", new Object[]{this, str}) : this.f2743a.get(str);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        d dVar = this.h;
        if (dVar != null) {
            dVar.a();
        }
        HashMap<String, f> hashMap = this.f2743a;
        if (hashMap == null) {
            return;
        }
        for (f fVar : hashMap.values()) {
            if (fVar != null) {
                fVar.a();
            }
        }
    }
}
