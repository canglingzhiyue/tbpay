package com.taobao.android.buy.internal.status;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.status.e;
import tb.kge;

/* loaded from: classes4.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private e.c f9245a;
    private e.c b;
    private e.b c;
    private e.a d;
    private final Context e;
    private e.c f;

    static {
        kge.a(-270950988);
    }

    public f(Context context) {
        this.e = context;
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.d = new a();
        this.f9245a = new c();
        this.f = new c();
        this.c = new b();
        Context context = this.e;
        if (!(context instanceof Activity)) {
            return;
        }
        this.b = new d((Activity) context);
    }

    public void a(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
        } else if (this.f9245a == null || a(this.e)) {
        } else {
            this.f9245a.a(this.e, bool);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.f9245a == null || a(this.e)) {
        } else {
            this.f9245a.a(this.e, i);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f9245a == null || a(this.e)) {
        } else {
            this.f9245a.a(this.e);
        }
    }

    public void c(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b26617a3", new Object[]{this, bool});
        } else if (this.f == null || a(this.e)) {
        } else {
            this.f.a(this.e, bool);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f == null || a(this.e)) {
        } else {
            this.f.a(this.e);
        }
    }

    private boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        if (context instanceof Activity) {
            return ((Activity) context).isFinishing();
        }
        return false;
    }

    public void b(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66488c4", new Object[]{this, bool});
            return;
        }
        e.c cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.a(this.e, bool);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        e.c cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.a(this.e);
    }

    public void a(e.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80a9f9da", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            this.f9245a = cVar;
        }
    }

    @Deprecated
    public void a(e.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80a9857b", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            this.c = bVar;
        }
    }

    @Deprecated
    public void a(e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80a9111c", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.d = aVar;
        }
    }

    public void b(e.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("803393db", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            this.b = cVar;
        }
    }
}
