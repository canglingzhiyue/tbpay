package com.taobao.avplayer.core.component;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.weex.WXSDKInstance;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<f, c> f16486a = new HashMap();
    private Map<f, c> b = new HashMap();
    private Map<f, c> c = new HashMap();

    static {
        kge.a(804829096);
    }

    public void a(f fVar, f fVar2, f fVar3, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61f494df", new Object[]{this, fVar, fVar2, fVar3, cVar});
            return;
        }
        this.f16486a.put(fVar, cVar);
        this.c.put(fVar2, cVar);
        this.b.put(fVar3, cVar);
    }

    public DWComponent a(f fVar, DWVideoScreenType dWVideoScreenType, DWVideoScreenType dWVideoScreenType2) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWComponent) ipChange.ipc$dispatch("5e4c78aa", new Object[]{this, fVar, dWVideoScreenType, dWVideoScreenType2});
        }
        if (dWVideoScreenType == DWVideoScreenType.NORMAL) {
            cVar = this.f16486a.get(fVar);
        } else if (dWVideoScreenType == DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
            cVar = this.c.get(fVar);
        } else {
            cVar = this.b.get(fVar);
        }
        if (cVar == null) {
            return null;
        }
        return cVar.a(dWVideoScreenType2);
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d6d1f6d", new Object[]{this, fVar});
        } else {
            this.f16486a.remove(fVar);
        }
    }

    public void b(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ae8e2e", new Object[]{this, fVar});
        } else {
            this.f16486a.remove(fVar);
        }
    }

    public void c(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37effcef", new Object[]{this, fVar});
        } else {
            this.f16486a.remove(fVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f16486a.clear();
        this.b.clear();
    }

    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        for (Map.Entry<f, c> entry : this.f16486a.entrySet()) {
            c value = entry.getValue();
            if (value != null) {
                f fVar = value.f16485a.mDWComponentInstance;
                if (fVar != null && (fVar instanceof WXSDKInstance)) {
                    ((com.taobao.avplayer.component.weex.a) fVar).a(str, map);
                }
                f fVar2 = value.c.mDWComponentInstance;
                if (fVar2 != null && (fVar2 instanceof WXSDKInstance)) {
                    ((com.taobao.avplayer.component.weex.a) fVar2).a(str, map);
                }
                f fVar3 = value.b.mDWComponentInstance;
                if (fVar3 != null && (fVar3 instanceof WXSDKInstance)) {
                    ((com.taobao.avplayer.component.weex.a) fVar3).a(str, map);
                }
            }
        }
    }
}
