package com.taobao.android.dinamicx.videoc;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fqi;
import tb.fxw;
import tb.kge;

/* loaded from: classes.dex */
public class b implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f11941a;
    private DXVideoControlConfig<fxw> b;
    private final String c;

    static {
        kge.a(-1347224189);
        kge.a(2028149408);
    }

    public b(DXVideoControlConfig<fxw> dXVideoControlConfig, String str) {
        this.b = dXVideoControlConfig;
        this.c = str;
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void a(RecyclerView recyclerView, DXVideoControlConfig<fxw> dXVideoControlConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af1251bf", new Object[]{this, recyclerView, dXVideoControlConfig});
        } else if (this.f11941a == null || !fqi.j()) {
        } else {
            this.f11941a.a(recyclerView, dXVideoControlConfig);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void a(RecyclerView recyclerView, DXVideoControlConfig<fxw> dXVideoControlConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6429c9", new Object[]{this, recyclerView, dXVideoControlConfig, str});
        } else if (this.f11941a == null || !fqi.j()) {
        } else {
            this.f11941a.a(recyclerView, dXVideoControlConfig, str);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void a(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b95e0", new Object[]{this, recyclerView, str});
        } else if (this.f11941a == null || !fqi.j()) {
        } else {
            this.f11941a.a(recyclerView, str);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void b(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f1b1a21", new Object[]{this, recyclerView, str});
        } else if (this.f11941a == null || !fqi.j()) {
        } else {
            this.f11941a.b(recyclerView, str);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
        } else if (this.f11941a == null || !fqi.j()) {
        } else {
            this.f11941a.a(recyclerView);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void c(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92aa9e62", new Object[]{this, recyclerView, str});
        } else if (this.f11941a == null || !fqi.j()) {
        } else {
            this.f11941a.c(recyclerView, str);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1012817", new Object[]{this, recyclerView});
        } else if (this.f11941a == null || !fqi.j()) {
        } else {
            this.f11941a.b(recyclerView);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void d(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("863a22a3", new Object[]{this, recyclerView, str});
        } else if (this.f11941a == null || !fqi.j()) {
        } else {
            this.f11941a.d(recyclerView, str);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void c(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ba1ea98", new Object[]{this, recyclerView});
        } else if (this.f11941a == null || !fqi.j()) {
        } else {
            this.f11941a.c(recyclerView);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void e(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79c9a6e4", new Object[]{this, recyclerView, str});
        } else if (this.f11941a == null || !fqi.j()) {
        } else {
            this.f11941a.e(recyclerView, str);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void d(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1642ad19", new Object[]{this, recyclerView});
        } else if (this.f11941a == null || !fqi.j()) {
        } else {
            this.f11941a.d(recyclerView);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void f(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d592b25", new Object[]{this, recyclerView, str});
        } else if (this.f11941a == null || !fqi.j()) {
        } else {
            this.f11941a.f(recyclerView, str);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f11941a == null || !fqi.j()) {
        } else {
            this.f11941a.a();
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void e(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e36f9a", new Object[]{this, recyclerView});
        } else if (this.f11941a == null || !fqi.j()) {
        } else {
            this.f11941a.e(recyclerView);
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f11941a != null && fqi.j();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f11941a != null) {
        } else {
            DXVideoControlConfig<fxw> dXVideoControlConfig = this.b;
            if (dXVideoControlConfig == null) {
                dXVideoControlConfig = DXVideoControlConfig.b();
            }
            this.f11941a = new a(dXVideoControlConfig, this.c);
        }
    }
}
