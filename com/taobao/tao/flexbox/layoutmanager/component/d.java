package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.ah;
import tb.kge;
import tb.oeb;
import tb.ogl;

/* loaded from: classes8.dex */
public class d extends Component<View, ogl> implements ah {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1550645657);
        kge.a(-64703456);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildAdded(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc32990", new Object[]{this, aaVar, new Integer(i), aaVar2});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa aaVar3 = null;
        com.taobao.tao.flexbox.layoutmanager.core.aa J = this.node.J();
        if (J != null) {
            aaVar3 = J.J();
        }
        if (aaVar3 == null || aaVar3.x() == null) {
            return;
        }
        ((m) aaVar3.I()).b(this.node.f());
        ((m) aaVar3.I()).a(1, i, -1, this.node.d.size() >= i + 1, aaVar2);
        if (!oeb.bo()) {
            return;
        }
        handleChildChanged(aaVar3.L(), aaVar3);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildDeleted(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80fbc97", new Object[]{this, aaVar, new Integer(i), aaVar2});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa aaVar3 = null;
        com.taobao.tao.flexbox.layoutmanager.core.aa J = this.node.J();
        if (J != null) {
            aaVar3 = J.J();
        }
        if (aaVar3 == null || aaVar3.x() == null) {
            return;
        }
        ((m) aaVar3.I()).b(this.node.f());
        ((m) aaVar3.I()).a(2, i, -1, false, aaVar2);
        if (!oeb.bo()) {
            return;
        }
        handleChildChanged(aaVar3.L(), aaVar3);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildMoved(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, int i2, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f8fdf6", new Object[]{this, aaVar, new Integer(i), new Integer(i2), aaVar2});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa aaVar3 = null;
        com.taobao.tao.flexbox.layoutmanager.core.aa J = this.node.J();
        if (J != null) {
            aaVar3 = J.J();
        }
        if (aaVar3 == null || aaVar3.x() == null) {
            return;
        }
        ((m) aaVar3.I()).b(this.node.f());
        ((m) aaVar3.I()).a(8, i, i2, false, aaVar2);
    }
}
