package com.taobao.android.purchase.aura.notification;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.c;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.aura.v;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.purchase.aura.annotation.TBBuyPageMode;
import com.taobao.android.purchase.aura.b;
import com.taobao.android.purchase.aura.utils.e;
import com.taobao.tao.alipay.export.CashdeskConstants;
import java.util.List;
import tb.afg;
import tb.arc;
import tb.ard;
import tb.bba;
import tb.kge;

/* loaded from: classes6.dex */
public class TBBuyBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IntentFilter f14744a;
    private final Activity b;
    private final String c;
    private String d;

    static {
        kge.a(1324653899);
    }

    public static /* synthetic */ Object ipc$super(TBBuyBroadcastReceiver tBBuyBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TBBuyBroadcastReceiver(Activity activity, String str) {
        this.b = activity;
        this.c = str;
    }

    public TBBuyBroadcastReceiver a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBBuyBroadcastReceiver) ipChange.ipc$dispatch("a3775928", new Object[]{this, str});
        }
        this.d = str;
        return this;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.f14744a == null) {
            this.f14744a = new IntentFilter();
            this.f14744a.addAction("com.alipay.android.app.pay.ACTION_PAY_SUCCESS");
            this.f14744a.addAction("com.alipay.android.app.pay.ACTION_PAY_FAILED");
            this.f14744a.addAction(CashdeskConstants.TB_CASH_DESK_BROADCAST_RESULT_ACTION);
            this.f14744a.addAction("auraEventNotification");
            this.f14744a.addAction(IAKPopRender.LifecycleType.BLOCK_CLOSE);
            this.f14744a.addCategory("android.intent.category.DEFAULT");
        }
        b();
        LocalBroadcastManager.getInstance(this.b).registerReceiver(this, this.f14744a);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        ard a2 = arc.a();
        a2.b("onReceive message action :" + action, arc.a.a().b("TBBuyBroadcastReceiver").b());
        char c = 65535;
        switch (action.hashCode()) {
            case -1240590794:
                if (action.equals(IAKPopRender.LifecycleType.BLOCK_CLOSE)) {
                    c = 3;
                    break;
                }
                break;
            case -669219308:
                if (action.equals("com.alipay.android.app.pay.ACTION_PAY_FAILED")) {
                    c = 2;
                    break;
                }
                break;
            case -51541780:
                if (action.equals("com.alipay.android.app.pay.ACTION_PAY_SUCCESS")) {
                    c = 1;
                    break;
                }
                break;
            case 748268930:
                if (action.equals("auraEventNotification")) {
                    c = 4;
                    break;
                }
                break;
            case 1612449344:
                if (action.equals(CashdeskConstants.TB_CASH_DESK_BROADCAST_RESULT_ACTION)) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1 || c == 2) {
            if (!e.f() || !TBBuyPageMode.halfPageMode.equals(this.c)) {
                return;
            }
            this.b.finish();
        } else if (c == 3) {
            if (!(this.b instanceof b) || !TBBuyPageMode.halfPageMode.equals(this.c)) {
                return;
            }
            if ("native".equals(((b) this.b).getRenderContainer())) {
                this.b.finish();
            } else if (afg.a().b()) {
            } else {
                this.b.finish();
            }
        } else if (c == 4) {
            String stringExtra = intent.getStringExtra("type");
            String stringExtra2 = intent.getStringExtra("fields");
            JSONObject a3 = bba.a(stringExtra2);
            ard a4 = arc.a();
            a4.b("auraEventNotification type :" + stringExtra, arc.a.a().a("fields", stringExtra2).b());
            String str = this.d;
            if (str == null) {
                return;
            }
            a(context, str, stringExtra, a3);
        } else {
            arc.a().a("undefined action");
        }
    }

    private void a(Context context, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea64ffc", new Object[]{this, context, str, str2, jSONObject});
            return;
        }
        d dVar = new d();
        dVar.a(jSONObject);
        s a2 = v.a().a(str);
        if (a2 != null) {
            c.a(a2, str2, dVar);
            return;
        }
        List<s> a3 = v.a().a(context);
        if (a3 == null) {
            a3 = v.a().b();
        }
        for (s sVar : a3) {
            if (str.equals(sVar.c().d())) {
                c.a(sVar, str2, dVar);
            }
        }
    }
}
