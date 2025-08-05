package com.taobao.android.waitpay.notification;

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
import java.util.List;
import tb.afg;
import tb.arc;
import tb.bba;
import tb.kge;

/* loaded from: classes6.dex */
public class TBWaitBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IntentFilter f15833a;
    private final Activity b;
    private final String c;
    private String d;

    static {
        kge.a(352793016);
    }

    public static /* synthetic */ Object ipc$super(TBWaitBroadcastReceiver tBWaitBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TBWaitBroadcastReceiver(Activity activity, String str) {
        this.b = activity;
        this.c = str;
    }

    public TBWaitBroadcastReceiver a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBWaitBroadcastReceiver) ipChange.ipc$dispatch("4d1011ab", new Object[]{this, str});
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
        if (this.f15833a == null) {
            this.f15833a = new IntentFilter();
            this.f15833a.addAction("com.alipay.android.app.pay.ACTION_PAY_SUCCESS");
            this.f15833a.addAction("com.alipay.android.app.pay.ACTION_PAY_FAILED");
            this.f15833a.addAction(IAKPopRender.LifecycleType.BLOCK_CLOSE);
            this.f15833a.addAction("auraEventNotification");
            this.f15833a.addCategory("android.intent.category.DEFAULT");
        }
        b();
        LocalBroadcastManager.getInstance(this.b).registerReceiver(this, this.f15833a);
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
        char c = 65535;
        switch (action.hashCode()) {
            case -1240590794:
                if (action.equals(IAKPopRender.LifecycleType.BLOCK_CLOSE)) {
                    c = 2;
                    break;
                }
                break;
            case -669219308:
                if (action.equals("com.alipay.android.app.pay.ACTION_PAY_FAILED")) {
                    c = 1;
                    break;
                }
                break;
            case -51541780:
                if (action.equals("com.alipay.android.app.pay.ACTION_PAY_SUCCESS")) {
                    c = 0;
                    break;
                }
                break;
            case 748268930:
                if (action.equals("auraEventNotification")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1) {
            if (!e.f() || !TBBuyPageMode.halfPageMode.equals(this.c)) {
                return;
            }
            this.b.finish();
        } else if (c != 2) {
            if (c == 3) {
                String stringExtra = intent.getStringExtra("type");
                JSONObject a2 = bba.a(intent.getStringExtra("fields"));
                String str = this.d;
                if (str == null) {
                    return;
                }
                a(context, str, stringExtra, a2);
                return;
            }
            arc.a().a("undefined action");
        } else if (!(this.b instanceof b) || !TBBuyPageMode.halfPageMode.equals(this.c)) {
        } else {
            if ("native".equals(((b) this.b).getRenderContainer())) {
                this.b.finish();
            } else if (afg.a().b()) {
            } else {
                this.b.finish();
            }
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
            arc.a().a("AURAJsStandardEvent instancePool is null");
            a3 = v.a().b();
        }
        for (s sVar : a3) {
            if (str.equals(sVar.c().d())) {
                c.a(sVar, str2, dVar);
            }
        }
    }
}
