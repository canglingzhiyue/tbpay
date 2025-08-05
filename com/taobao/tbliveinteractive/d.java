package com.taobao.tbliveinteractive;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbliveinteractive.a;
import com.taobao.tbliveinteractive.business.list.InteractiveShowInfo;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class d implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(230657714);
        kge.a(782545871);
    }

    @Override // com.taobao.tbliveinteractive.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void a(InteractiveComponent interactiveComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84243444", new Object[]{this, interactiveComponent});
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void a(InteractiveComponent interactiveComponent, InteractiveShowInfo interactiveShowInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767001c2", new Object[]{this, interactiveComponent, interactiveShowInfo});
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void a(InteractiveComponent interactiveComponent, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f37e16c1", new Object[]{this, interactiveComponent, map});
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void b(InteractiveComponent interactiveComponent, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6a9ca02", new Object[]{this, interactiveComponent, map});
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public /* synthetic */ void dl_() {
        a.CC.$default$dl_(this);
    }

    @Override // com.taobao.tbliveinteractive.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        }
    }
}
