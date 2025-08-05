package com.taobao.android.detail.core.detail.widget.container;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.widget.container.NestedScrollContainer;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.trade.event.Event;
import java.util.Map;
import tb.dyy;
import tb.ehs;
import tb.epe;
import tb.epz;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class a implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f9667a;

    static {
        kge.a(1305508510);
        kge.a(-285602312);
    }

    @Override // com.taobao.android.trade.locator.callback.d
    public com.taobao.android.trade.locator.callback.a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.locator.callback.a) ipChange.ipc$dispatch("29902195", new Object[]{this, str});
        }
        return null;
    }

    @Override // tb.dxy
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.c
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.c
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.c
    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
        }
    }

    public void a(NestedScrollContainer.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e157bdfd", new Object[]{this, aVar});
        }
    }

    @Deprecated
    public void a(NestedScrollContainer.a aVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a701729", new Object[]{this, aVar, cVar});
        }
    }

    @Override // com.taobao.android.trade.locator.callback.d
    public void a(Object obj, com.taobao.android.trade.locator.callback.a aVar, com.taobao.android.trade.locator.callback.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2928883", new Object[]{this, obj, aVar, bVar});
        }
    }

    public void a(dyy dyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61aa9d4", new Object[]{this, dyyVar});
        }
    }

    @Override // tb.dxy
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    @Override // tb.dxy
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // tb.dxy
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // tb.dxy
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.c
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.c
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.c
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.c
    public float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2860", new Object[]{this})).floatValue();
        }
        return 0.0f;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.c
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.c
    public abstract View k();

    public a(Context context) {
        this.f9667a = context;
    }

    public void a(epe epeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e747977e", new Object[]{this, epeVar});
        } else {
            b(epeVar);
        }
    }

    private void b(epe epeVar) {
        ComponentModel componentModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ca9dff", new Object[]{this, epeVar});
        } else if (epeVar != null) {
            if ((epeVar.events != null && !epeVar.events.isEmpty()) || (componentModel = epeVar.component) == null || componentModel.actionModelList == null || componentModel.actionModelList.isEmpty() || epeVar.mNodeBundle == null) {
                return;
            }
            for (ActionModel actionModel : componentModel.actionModelList) {
                JSONObject jSONObject = actionModel.params;
                if (jSONObject != null) {
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        Object value = entry.getValue();
                        if (epeVar.mNodeBundle.b) {
                            entry.setValue(epz.a(epeVar.mNodeBundle.a(), value, true));
                        } else {
                            entry.setValue(epz.a(epeVar.mNodeBundle.a(), value));
                        }
                    }
                }
                Event a2 = ehs.a(this.f9667a, actionModel, epeVar.mNodeBundle, null, null);
                if (a2 != null) {
                    epeVar.events.add(a2);
                }
            }
        }
    }
}
