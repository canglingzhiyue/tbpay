package com.taobao.taolive.adapterimpl.global;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.util.GetAppKeyFromSecurity;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.pne;
import tb.ppp;

/* loaded from: classes8.dex */
public class a implements pne {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f21370a;
    private List<ppp.a> b = new ArrayList();
    private PanguApplication.CrossActivityLifecycleCallback c = new PanguApplication.CrossActivityLifecycleCallback() { // from class: com.taobao.taolive.adapterimpl.global.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc107b13", new Object[]{this, activity});
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onCreated(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f00e362", new Object[]{this, activity});
            } else {
                a.d();
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b167bb", new Object[]{this, activity});
                return;
            }
            for (ppp.a aVar : a.a(a.this)) {
                if (aVar != null) {
                    aVar.b();
                }
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82d37207", new Object[]{this, activity});
                return;
            }
            for (ppp.a aVar : a.a(a.this)) {
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    };

    @Override // tb.pne
    public String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context}) : "taobao";
    }

    public static /* synthetic */ List a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ca2ca37", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : f21370a;
    }

    static {
        kge.a(398219349);
        kge.a(1947868426);
        f21370a = a.class.getSimpleName();
    }

    @Override // tb.pne
    public void a(ppp.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc06e48b", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            if (this.b.isEmpty()) {
                ((PanguApplication) Globals.getApplication()).registerCrossActivityLifecycleCallback(this.c);
            }
            if (this.b.contains(aVar)) {
                return;
            }
            this.b.add(aVar);
        }
    }

    @Override // tb.pne
    public void b(ppp.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15e24ecc", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.b.remove(aVar);
            if (!this.b.isEmpty()) {
                return;
            }
            ((PanguApplication) Globals.getApplication()).unregisterCrossActivityLifecycleCallback(this.c);
        }
    }

    @Override // tb.pne
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : TaoApplication.getTTID();
    }

    @Override // tb.pne
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : GetAppKeyFromSecurity.getAppKey(0);
    }

    @Override // tb.pne
    public Application c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("4bc1c139", new Object[]{this}) : Globals.getApplication();
    }
}
