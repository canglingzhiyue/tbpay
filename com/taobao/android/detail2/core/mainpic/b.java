package com.taobao.android.detail2.core.mainpic;

import android.view.MotionEvent;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fhi;
import tb.fho;
import tb.fmd;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.detail2.core.mainpic.a f11660a;
    private com.taobao.android.detail2.core.framework.b b;
    private com.taobao.android.detail2.core.framework.base.weex.c c;
    private com.taobao.android.detail2.core.framework.view.feeds.a d;
    private fmd e;
    private fhi f;
    private fho g;
    private a h = new a() { // from class: com.taobao.android.detail2.core.mainpic.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail2.core.mainpic.b.a
        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : b.b(b.this).b();
        }

        @Override // com.taobao.android.detail2.core.mainpic.b.a
        public void a(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            } else if (b.c(b.this) == null) {
            } else {
                b.c(b.this).a(str, jSONObject);
            }
        }

        @Override // com.taobao.android.detail2.core.mainpic.b.a
        public com.taobao.android.detail2.core.framework.b b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("56944398", new Object[]{this}) : b.a(b.this);
        }

        @Override // com.taobao.android.detail2.core.mainpic.b.a
        public fmd c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fmd) ipChange.ipc$dispatch("1e67f2ff", new Object[]{this}) : b.d(b.this);
        }

        @Override // com.taobao.android.detail2.core.mainpic.b.a
        public com.taobao.android.detail2.core.framework.view.feeds.a d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.view.feeds.a) ipChange.ipc$dispatch("1e6943bd", new Object[]{this}) : b.b(b.this);
        }

        @Override // com.taobao.android.detail2.core.mainpic.b.a
        public fhi e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fhi) ipChange.ipc$dispatch("2dcb2b93", new Object[]{this}) : b.e(b.this);
        }

        @Override // com.taobao.android.detail2.core.mainpic.b.a
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            } else {
                b.f(b.this).Z();
            }
        }
    };

    /* loaded from: classes5.dex */
    public interface a {
        int a();

        void a(String str, JSONObject jSONObject);

        com.taobao.android.detail2.core.framework.b b();

        fmd c();

        com.taobao.android.detail2.core.framework.view.feeds.a d();

        fhi e();

        void f();
    }

    static {
        kge.a(-510627086);
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("57f93933", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.view.feeds.a b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.view.feeds.a) ipChange.ipc$dispatch("f9b727c5", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.base.weex.c c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.base.weex.c) ipChange.ipc$dispatch("4c3ed1a0", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ fmd d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fmd) ipChange.ipc$dispatch("cdbb56e8", new Object[]{bVar}) : bVar.e;
    }

    public static /* synthetic */ fhi e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fhi) ipChange.ipc$dispatch("f70f99ff", new Object[]{bVar}) : bVar.f;
    }

    public static /* synthetic */ fho f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fho) ipChange.ipc$dispatch("2063effa", new Object[]{bVar}) : bVar.g;
    }

    public b(View view, com.taobao.android.detail2.core.framework.b bVar, com.taobao.android.detail2.core.framework.base.weex.c cVar, com.taobao.android.detail2.core.framework.view.feeds.a aVar, fmd fmdVar, fho fhoVar) {
        this.b = bVar;
        this.c = cVar;
        this.d = aVar;
        this.e = fmdVar;
        this.f11660a = new com.taobao.android.detail2.core.mainpic.a(view, this.h);
        this.g = fhoVar;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f11660a.b(i);
        }
    }

    public boolean a(fhi fhiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e88d8595", new Object[]{this, fhiVar})).booleanValue();
        }
        if (fhiVar == null || fhiVar.ae == null) {
            this.f11660a.b();
            return false;
        }
        this.f = fhiVar;
        return this.f11660a.a(fhiVar.ae);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f11660a.f();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f11660a.g();
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f11660a.b(str);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.f11660a.a(str);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f11660a.e();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f11660a.j();
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.f11660a.a(jSONObject);
        }
    }

    public void a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
        } else {
            this.f11660a.a(motionEvent);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.f11660a.c();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.f11660a.h();
        }
    }
}
