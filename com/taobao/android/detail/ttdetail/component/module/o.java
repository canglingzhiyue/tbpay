package com.taobao.android.detail.ttdetail.component.module;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.eyx;
import tb.eyy;
import tb.ezg;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class o<T extends ezg> extends d<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<d> f10555a;

    static {
        kge.a(-642432235);
    }

    public static /* synthetic */ Object ipc$super(o oVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1022038770:
                super.willAppear();
                return null;
            case 395904714:
                super.disAppear();
                return null;
            case 743476054:
                return super.findComponentByUltronName((String) objArr[0]);
            case 761516512:
                return super.findComponent((String) objArr[0]);
            case 1368016771:
                super.create();
                return null;
            case 1580371323:
                super.didAppear();
                return null;
            case 2099530776:
                super.willDisAppear();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public o(Context context, eyx eyxVar, T t, DataEntry... dataEntryArr) {
        super(context, eyxVar, t, dataEntryArr);
        List<eyy> m = ((ezg) this.mComponentData).m();
        if (m != null) {
            for (eyy eyyVar : m) {
                d a2 = this.mDetailContext.d().a(eyyVar, dataEntryArr);
                if (a2 != null) {
                    a(a2);
                }
            }
        }
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b69e8833", new Object[]{this, dVar});
            return;
        }
        if (this.f10555a == null) {
            this.f10555a = new ArrayList();
        }
        dVar.mParentGroup = this;
        this.f10555a.add(dVar);
    }

    public void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca25392", new Object[]{this, dVar});
            return;
        }
        List<d> list = this.f10555a;
        if (list == null) {
            return;
        }
        list.remove(dVar);
    }

    public <C extends d> C a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("e131fe26", new Object[]{this, new Integer(i)});
        }
        List<d> list = this.f10555a;
        if (list != null && i >= 0 && i < list.size()) {
            return (C) this.f10555a.get(i);
        }
        return null;
    }

    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue();
        }
        List<d> list = this.f10555a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public <C extends d> C findComponent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("2d63d1e0", new Object[]{this, str});
        }
        List<d> list = this.f10555a;
        if (list != null) {
            for (d dVar : list) {
                C c = (C) dVar.findComponent(str);
                if (c != null) {
                    return c;
                }
            }
        }
        return (C) super.findComponent(str);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public <C extends d> C findComponentByUltronName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("2c508b56", new Object[]{this, str});
        }
        List<d> list = this.f10555a;
        if (list != null) {
            for (d dVar : list) {
                C c = (C) dVar.findComponentByUltronName(str);
                if (c != null) {
                    return c;
                }
            }
        }
        return (C) super.findComponentByUltronName(str);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518a4783", new Object[]{this});
            return;
        }
        List<d> list = this.f10555a;
        if (list != null) {
            for (d dVar : list) {
                dVar.create();
            }
        }
        super.create();
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
            return;
        }
        List<d> list = this.f10555a;
        if (list != null) {
            for (d dVar : list) {
                dVar.willAppear();
            }
        }
        super.willAppear();
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        List<d> list = this.f10555a;
        if (list != null) {
            for (d dVar : list) {
                dVar.didAppear();
            }
        }
        super.didAppear();
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void willDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d244c18", new Object[]{this});
            return;
        }
        List<d> list = this.f10555a;
        if (list != null) {
            for (d dVar : list) {
                dVar.willDisAppear();
            }
        }
        super.willDisAppear();
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void disAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("179906ca", new Object[]{this});
            return;
        }
        List<d> list = this.f10555a;
        if (list != null) {
            for (d dVar : list) {
                dVar.disAppear();
            }
        }
        super.disAppear();
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        List<d> list = this.f10555a;
        if (list != null) {
            for (d dVar : list) {
                dVar.destroy();
            }
        }
        super.destroy();
    }
}
