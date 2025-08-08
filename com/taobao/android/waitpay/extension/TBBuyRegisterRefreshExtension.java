package com.taobao.android.waitpay.extension;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.b;
import tb.arv;
import tb.kge;

@AURAExtensionImpl(code = "tbwaitpay.impl.event.registerNotify")
/* loaded from: classes6.dex */
public final class TBBuyRegisterRefreshExtension extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private InnerReceiver f15828a;

    static {
        kge.a(-896312896);
    }

    public static /* synthetic */ Object ipc$super(TBBuyRegisterRefreshExtension tBBuyRegisterRefreshExtension, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != -1219783041) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        }
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "registerNotify";
    }

    @Override // tb.arv, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            super.onCreate(qVar, fVar);
        }
    }

    private InnerReceiver f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InnerReceiver) ipChange.ipc$dispatch("f887ea77", new Object[]{this});
        }
        if (this.f15828a == null) {
            this.f15828a = new InnerReceiver(b().e());
        }
        return this.f15828a;
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        JSONObject c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        Boolean bool = (Boolean) d().get("hasRegistered", Boolean.class);
        if ((bool != null && bool.booleanValue()) || (c = aURAEventIO.getEventModel().c()) == null) {
            return;
        }
        String string = c.getString("eventName");
        if (StringUtils.isEmpty(string)) {
            return;
        }
        a(b().e(), string);
        d().update("hasRegistered", true);
    }

    /* loaded from: classes6.dex */
    public static class InnerReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f15829a;

        static {
            kge.a(1142143585);
        }

        public InnerReceiver(Context context) {
            this.f15829a = context;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            Context context2 = this.f15829a;
            if (!(context2 instanceof b)) {
                return;
            }
            ((b) context2).refreshPage(true);
        }
    }

    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else if (f() == null) {
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(str);
            intentFilter.addCategory("android.intent.category.DEFAULT");
            a(context);
            LocalBroadcastManager.getInstance(context).registerReceiver(f(), intentFilter);
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (f() == null) {
        } else {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(f());
        }
    }

    @Override // tb.arv, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        a(b().e());
    }
}
