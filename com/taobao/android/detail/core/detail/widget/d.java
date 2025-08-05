package com.taobao.android.detail.core.detail.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.utils.i;
import tb.dyy;
import tb.ehc;
import tb.ehd;
import tb.emu;
import tb.end;
import tb.epe;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f9677a;
    private View b;
    private c c;
    private dyy d;
    private Handler e = new Handler() { // from class: com.taobao.android.detail.core.detail.widget.d.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what != 4097) {
            } else {
                d.a(d.this);
            }
        }
    };
    private e f;

    static {
        kge.a(-890644659);
    }

    public static /* synthetic */ void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("162b5ea5", new Object[]{dVar});
        } else {
            dVar.g();
        }
    }

    public d(Context context) {
        this.f9677a = context;
        this.d = new dyy(context);
        this.b = this.d.g();
        emu.a("com.taobao.android.detail.core.detail.widget.TTMainFloatController");
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b;
    }

    public dyy b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dyy) ipChange.ipc$dispatch("16b59479", new Object[]{this}) : this.d;
    }

    public void a(epe epeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e747977e", new Object[]{this, epeVar});
        } else if (!(epeVar instanceof ehd)) {
            i.a(com.taobao.android.detail.core.performance.i.a("TTMainFloatController", BTags.TTFloat), "addElevator invalid data");
        } else {
            ehc a2 = ((ehd) epeVar).a();
            if (a2 == null) {
                i.a(com.taobao.android.detail.core.performance.i.a("TTMainFloatController", BTags.TTFloat), "addElevator no DetailTTElevatorViewModel");
                return;
            }
            c cVar = this.c;
            if (cVar != null) {
                cVar.a();
            }
            this.c = new c(this.f9677a, a2);
            this.c.a(this.d.a());
        }
    }

    public void a(end endVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e72af41d", new Object[]{this, endVar});
        } else if (!e.a(endVar)) {
        } else {
            JSONObject jSONObject = endVar.f27459a.f10055a.a().getJSONObject("detail3FloatView").getJSONObject("bottomDX");
            e eVar = this.f;
            if (eVar != null) {
                eVar.a();
            }
            if (this.f == null) {
                this.f = new e(this.f9677a, jSONObject);
            }
            this.f.a(this.d.b());
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.a();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.a(str);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.b();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.c();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.d();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.e();
        h();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.c == null) {
        } else {
            h();
            this.c.e();
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.e.removeMessages(4097);
        this.e.sendMessageDelayed(Message.obtain(this.e, 4097), 2000L);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.b(str);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        c cVar = this.c;
        if (cVar != null) {
            cVar.h();
        }
        e eVar = this.f;
        if (eVar == null) {
            return;
        }
        eVar.c();
    }
}
