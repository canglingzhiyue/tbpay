package com.taobao.monitor.procedure;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class s implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static s f18233a = new s();
    private j b;

    private s() {
    }

    public s a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("cd6fcbe5", new Object[]{this, jVar});
        }
        this.b = jVar;
        return this;
    }

    @Override // com.taobao.monitor.procedure.j
    @Deprecated
    public g a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("54729e9a", new Object[]{this});
        }
        j jVar = this.b;
        if (jVar == null) {
            return g.DEFAULT;
        }
        return jVar.a();
    }

    @Override // com.taobao.monitor.procedure.j
    public g b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("7a3f5227", new Object[]{this, activity});
        }
        j jVar = this.b;
        if (jVar == null) {
            return g.DEFAULT;
        }
        return jVar.b(activity);
    }

    @Override // com.taobao.monitor.procedure.j
    @Deprecated
    public g b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("c8b1d6f9", new Object[]{this});
        }
        j jVar = this.b;
        if (jVar == null) {
            return g.DEFAULT;
        }
        return jVar.b();
    }

    @Override // com.taobao.monitor.procedure.j
    public g b(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("8b5c2cf9", new Object[]{this, fragment});
        }
        j jVar = this.b;
        if (jVar == null) {
            return g.DEFAULT;
        }
        return jVar.b(fragment);
    }

    @Override // com.taobao.monitor.procedure.j
    public g b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("b9a31c99", new Object[]{this, view});
        }
        j jVar = this.b;
        if (jVar == null) {
            return g.DEFAULT;
        }
        return jVar.b(view);
    }

    @Override // com.taobao.monitor.procedure.j
    public g a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("5ccf4590", new Object[]{this, str});
        }
        j jVar = this.b;
        if (jVar == null) {
            return g.DEFAULT;
        }
        return jVar.a(str);
    }

    @Override // com.taobao.monitor.procedure.j
    public g c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("3cf10f58", new Object[]{this});
        }
        j jVar = this.b;
        if (jVar == null) {
            return g.DEFAULT;
        }
        return jVar.c();
    }

    @Override // com.taobao.monitor.procedure.j
    public g d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("b13047b7", new Object[]{this});
        }
        j jVar = this.b;
        if (jVar == null) {
            return g.DEFAULT;
        }
        return jVar.d();
    }
}
