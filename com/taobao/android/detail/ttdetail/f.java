package com.taobao.android.detail.ttdetail;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.h;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.handler.event.a;
import com.taobao.android.detail.ttdetail.utils.bc;
import tb.eyx;
import tb.kge;
import tb.pir;
import tb.pkw;
import tb.qpk;
import tb.tpd;

/* loaded from: classes4.dex */
public class f extends d implements com.taobao.android.detail.ttdetail.communication.g<h> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TTMainScreenContainer";

    static {
        kge.a(331863465);
        kge.a(-767194759);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == 91915241) {
            super.b();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public /* synthetic */ boolean receiveMessage(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("318750e6", new Object[]{this, hVar})).booleanValue() : a(hVar);
    }

    public f(Context context, String str) {
        this(context, str, null);
    }

    public f(Context context, String str, eyx eyxVar) {
        super(context, str, eyxVar);
        e();
        com.taobao.android.detail.ttdetail.communication.c.a(context, h.class, this);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            bc.a(a(), a().g());
        }
    }

    public View c() {
        qpk h;
        tpd i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this});
        }
        pir pirVar = (pir) a().a().a(pkw.PARSER_ID);
        if (pirVar == null || (h = pirVar.h()) == null || (i = h.i()) == null) {
            return null;
        }
        i.c();
        View b = i.b(a().d());
        i.d();
        i.e();
        return b;
    }

    public com.taobao.android.detail.ttdetail.component.module.d f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.ttdetail.component.module.d) ipChange.ipc$dispatch("b7001af8", new Object[]{this}) : a().b().a("bottomBar");
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        a().a().a(jSONObject);
        d();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            a().b().c();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10595a, this);
        super.b();
    }

    public boolean a(final h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a00aa1d", new Object[]{this, hVar})).booleanValue();
        }
        JSONObject bZ_ = hVar.bZ_();
        if (bZ_ != null) {
            a().c().a(new a(bZ_), hVar.e());
        } else {
            a().c().a(new a(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.TTMainScreenContainer$1
                {
                    put("type", (Object) hVar.b());
                    put("fields", (Object) hVar.c());
                }
            }), hVar.e());
        }
        return false;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public ThreadMode onRunThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this}) : ThreadMode.MainThread;
    }
}
