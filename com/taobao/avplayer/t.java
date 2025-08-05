package com.taobao.avplayer;

import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kbu;
import tb.kge;

/* loaded from: classes6.dex */
public class t implements com.taobao.avplayer.common.q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DWContext f16616a;
    private com.taobao.avplayer.interactivelifecycle.display.d b;
    private kbu c;
    private com.taobao.avplayer.interactivelifecycle.display.e d;
    private ArrayList<com.taobao.avplayer.common.q> f = new ArrayList<>();

    static {
        kge.a(-1402296374);
        kge.a(556437024);
    }

    public t(DWContext dWContext) {
        this.f16616a = dWContext;
        d();
        e();
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b.a();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.avplayer.interactivelifecycle.display.e eVar = this.d;
        if (eVar == null) {
            return;
        }
        eVar.a(z);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.b = new com.taobao.avplayer.interactivelifecycle.display.d(this.f16616a);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        if (this.f16616a.mInteractiveId != -1) {
            this.d = new com.taobao.avplayer.interactivelifecycle.display.e(this.f16616a, this.b);
            a(this.d);
        }
        this.c = new kbu(this.f16616a);
        a(this.c);
        this.b.b(this.c.b(), new FrameLayout.LayoutParams(-1, -1));
    }

    private void a(com.taobao.avplayer.common.q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4109cfe4", new Object[]{this, qVar});
        } else if (this.f.contains(qVar)) {
        } else {
            this.f.add(qVar);
        }
    }

    @Override // com.taobao.avplayer.common.q
    public void onLifecycleChanged(DWLifecycleType dWLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e41106", new Object[]{this, dWLifecycleType});
            return;
        }
        Iterator<com.taobao.avplayer.common.q> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().onLifecycleChanged(dWLifecycleType);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ArrayList<com.taobao.avplayer.common.q> arrayList = this.f;
        if (arrayList != null) {
            arrayList.clear();
        }
        com.taobao.avplayer.interactivelifecycle.display.e eVar = this.d;
        if (eVar != null) {
            eVar.a();
            this.d = null;
        }
        kbu kbuVar = this.c;
        if (kbuVar == null) {
            return;
        }
        kbuVar.c();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.avplayer.interactivelifecycle.display.e eVar = this.d;
        if (eVar == null) {
            return;
        }
        eVar.b();
    }
}
