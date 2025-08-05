package com.taobao.android.layoutmanager.adapter.impl;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.WindvaneModule;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.a;
import com.taobao.tao.flexbox.layoutmanager.component.AnimationViewComponent;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.util.ArrayList;
import java.util.List;
import tb.gwh;
import tb.kge;
import tb.oec;

/* loaded from: classes5.dex */
public class d implements PanguApplication.CrossActivityLifecycleCallback, com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<a.InterfaceC0836a> f13117a;
    private boolean b = oec.h(ab.a());

    static {
        kge.a(-27936136);
        kge.a(1574951708);
        kge.a(1621500039);
    }

    @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onCreated(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f00e362", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc107b13", new Object[]{this, activity});
        }
    }

    public d() {
        ((PanguApplication) ab.a()).registerCrossActivityLifecycleCallback(this);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.a
    public void a(ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691da4af", new Object[]{this, abVar});
            return;
        }
        gwh.b(abVar.l());
        AnimationViewComponent.b(abVar.l());
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.a
    public void a(ab abVar, int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5389e00c", new Object[]{this, abVar, new Integer(i), new Integer(i2), intent});
        } else {
            WindvaneModule.onActivityResult(abVar, i, i2, intent);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.a
    public void a(a.InterfaceC0836a interfaceC0836a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b90a1ca7", new Object[]{this, interfaceC0836a});
            return;
        }
        if (this.f13117a == null) {
            this.f13117a = new ArrayList();
        }
        if (this.f13117a.contains(interfaceC0836a)) {
            return;
        }
        this.f13117a.add(interfaceC0836a);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.a
    public void b(a.InterfaceC0836a interfaceC0836a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2339a4c6", new Object[]{this, interfaceC0836a});
            return;
        }
        List<a.InterfaceC0836a> list = this.f13117a;
        if (list == null) {
            return;
        }
        list.remove(interfaceC0836a);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.a
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
    }

    @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b167bb", new Object[]{this, activity});
            return;
        }
        this.b = true;
        List<a.InterfaceC0836a> list = this.f13117a;
        if (list == null) {
            return;
        }
        for (a.InterfaceC0836a interfaceC0836a : list) {
            interfaceC0836a.a();
        }
    }

    @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82d37207", new Object[]{this, activity});
            return;
        }
        this.b = false;
        List<a.InterfaceC0836a> list = this.f13117a;
        if (list == null) {
            return;
        }
        for (a.InterfaceC0836a interfaceC0836a : list) {
            interfaceC0836a.b();
        }
    }
}
