package com.taobao.tao;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.navigation.TBFragmentTabHost;
import tb.kge;

/* loaded from: classes.dex */
public class TBMainHost implements k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private k f19785a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final TBMainHost f19786a;

        static {
            kge.a(-1194414335);
            f19786a = new TBMainHost();
        }
    }

    static {
        kge.a(981459215);
        kge.a(-1479396665);
    }

    private TBMainHost() {
    }

    public static TBMainHost a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMainHost) ipChange.ipc$dispatch("2abdd3ea", new Object[0]) : a.f19786a;
    }

    public static k a(Context context) {
        Context context2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("4a34751a", new Object[]{context});
        }
        if (context instanceof k) {
            return (k) context;
        }
        TBMainHost a2 = a();
        if (a2 != null && (context2 = a2.getContext()) != null && context2.equals(context)) {
            return a2;
        }
        return null;
    }

    public static k fromActivity(Activity activity) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("e04d1388", new Object[]{activity});
        }
        if (activity instanceof k) {
            return (k) activity;
        }
        TBMainHost a2 = a();
        if (a2 != null && (context = a2.getContext()) != null && context.equals(activity)) {
            return a2;
        }
        return null;
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else if (!(context instanceof k)) {
        } else {
            this.f19785a = (k) context;
        }
    }

    public void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d2168c", new Object[]{this, kVar});
        } else {
            this.f19785a = kVar;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f19785a = null;
        }
    }

    @Override // com.taobao.tao.k
    public <T extends View> T findViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)});
        }
        k kVar = this.f19785a;
        if (kVar != null) {
            return (T) kVar.findViewById(i);
        }
        return null;
    }

    @Override // com.taobao.tao.k
    public void restoreTabHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5767576", new Object[]{this});
            return;
        }
        k kVar = this.f19785a;
        if (kVar == null) {
            return;
        }
        kVar.restoreTabHost();
    }

    @Override // com.taobao.tao.k
    public boolean isLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99ed9676", new Object[]{this})).booleanValue();
        }
        k kVar = this.f19785a;
        if (kVar == null) {
            return false;
        }
        return kVar.isLowMemory();
    }

    @Override // com.taobao.tao.k
    public TBFragmentTabHost getFragmentTabHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFragmentTabHost) ipChange.ipc$dispatch("d6e2078b", new Object[]{this});
        }
        k kVar = this.f19785a;
        if (kVar == null) {
            return null;
        }
        return kVar.getFragmentTabHost();
    }

    @Override // com.taobao.tao.k
    public Fragment getCurrentFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("4789611c", new Object[]{this});
        }
        k kVar = this.f19785a;
        if (kVar == null) {
            return null;
        }
        return kVar.getCurrentFragment();
    }

    @Override // com.taobao.tao.k
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        k kVar = this.f19785a;
        if (kVar == null) {
            return null;
        }
        return kVar.getName();
    }

    @Override // com.taobao.tao.k
    public String getSimpleName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f06186", new Object[]{this});
        }
        k kVar = this.f19785a;
        if (kVar == null) {
            return null;
        }
        return kVar.getSimpleName();
    }

    @Override // com.taobao.tao.k
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        k kVar = this.f19785a;
        if (kVar == null) {
            return null;
        }
        return kVar.getContext();
    }

    @Override // com.taobao.tao.navigation.c
    public void doLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26139725", new Object[]{this});
            return;
        }
        k kVar = this.f19785a;
        if (kVar == null) {
            return;
        }
        kVar.doLogin();
    }

    @Override // com.taobao.tao.navigation.c
    public boolean checkLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71efb4c", new Object[]{this})).booleanValue();
        }
        k kVar = this.f19785a;
        if (kVar == null) {
            return false;
        }
        return kVar.checkLogin();
    }
}
