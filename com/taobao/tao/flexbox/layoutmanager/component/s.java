package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.ah;
import tb.kge;
import tb.ogl;

/* loaded from: classes8.dex */
public class s extends Component<View, ogl> implements ah {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-596087149);
        kge.a(-64703456);
    }

    public static /* synthetic */ Object ipc$super(s sVar, String str, Object... objArr) {
        if (str.hashCode() == -613926416) {
            super.onLayout();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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
    public void onLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6839f0", new Object[]{this});
            return;
        }
        super.onLayout();
        for (com.taobao.tao.flexbox.layoutmanager.core.aa aaVar : this.node.d) {
            aaVar.a(Float.NaN, Float.NaN);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildAdded(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc32990", new Object[]{this, aaVar, new Integer(i), aaVar2});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa J = this.node.J();
        if (J == null || J.x() == null || !aaVar2.K().equals("header")) {
            return;
        }
        ((m) J.I()).b(this.node.f());
        ((m) J.I()).a(17, i, -1, false, aaVar2);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildDeleted(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80fbc97", new Object[]{this, aaVar, new Integer(i), aaVar2});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa J = this.node.J();
        if (J == null || J.x() == null || !aaVar2.K().equals("header")) {
            return;
        }
        ((m) J.I()).b(this.node.f());
        ((m) J.I()).a(18, i, -1, false, aaVar2);
    }
}
