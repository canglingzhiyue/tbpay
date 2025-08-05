package com.taobao.android.diagnose.collector;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.v;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Application f11694a;
    private com.taobao.android.diagnose.model.a b;
    private List<f> c = null;
    private a d = null;
    private d e = null;
    private h f = null;

    static {
        kge.a(356902656);
    }

    public e(Application application, com.taobao.android.diagnose.model.a aVar) {
        this.f11694a = application;
        this.b = aVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!com.taobao.android.diagnose.config.a.c()) {
            v.d("CollectorManager", "CollectorManager is disable");
        } else {
            this.d = new a(this.f11694a, this.b);
            this.e = new d(this.f11694a, this.b);
            this.f = new h(this.f11694a, this.b);
            this.c = new ArrayList();
            this.c.add(this.d);
            this.c.add(this.e);
            this.c.add(this.f);
            for (f fVar : this.c) {
                fVar.a();
            }
            if (!com.taobao.android.diagnose.config.a.m.abnormalEnable) {
                return;
            }
            b.a().b();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a aVar = this.d;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    public void a(com.taobao.android.diagnose.scene.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc45ab9", new Object[]{this, aVar});
            return;
        }
        if (com.taobao.android.diagnose.config.a.m.abnormalEnable) {
            b.a().a(aVar);
        }
        a aVar2 = this.d;
        if (aVar2 == null) {
            return;
        }
        aVar2.a(aVar);
    }
}
