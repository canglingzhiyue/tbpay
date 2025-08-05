package com.taobao.monitor.procedure;

import android.support.v4.app.Fragment;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class m implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final m f18224a = new m();
    private e b;

    public static m a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("54729f54", new Object[0]) : f18224a;
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f08d996", new Object[]{this, eVar});
        } else {
            this.b = eVar;
        }
    }

    @Override // com.taobao.monitor.procedure.e
    public IPage a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("e21dac27", new Object[]{this, view, new Boolean(z)});
        }
        e eVar = this.b;
        if (eVar == null) {
            return IPage.DEFAULT_PAGE;
        }
        return eVar.a(view, z);
    }

    @Override // com.taobao.monitor.procedure.e
    public IPage a(Fragment fragment, String str, String str2, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("57381271", new Object[]{this, fragment, str, str2, view, new Boolean(z)});
        }
        e eVar = this.b;
        if (eVar == null) {
            return IPage.DEFAULT_PAGE;
        }
        return eVar.a(fragment, str, str2, view, z);
    }
}
