package com.alibaba.triver.bundle.nav;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.nav.Nav;
import com.taobao.tao.log.TLog;
import tb.ecd;
import tb.kge;

/* loaded from: classes.dex */
public class d implements Nav.f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f3635a;
    private TriverNavProcessor b;

    @Override // com.taobao.android.nav.Nav.e
    public boolean a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c9cc21", new Object[]{this, context, intent})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(-997387403);
        kge.a(8326638);
        f3635a = 1;
    }

    @Override // com.taobao.android.nav.Nav.f
    public boolean a(Context context, Nav nav, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("178742ec", new Object[]{this, context, nav, intent})).booleanValue();
        }
        Uri data = intent.getData();
        if (data != null) {
            try {
                if (com.taobao.alimama.utils.c.k()) {
                    Uri parse = Uri.parse(AlimamaAdvertising.instance().handleAdUrl(data.toString()));
                    TLog.loge("AlimamaAd", "AriverTriver:TriverNavHooker", String.format("originUri=[%1$s],newUri=[%2$s]", data.toString(), parse.toString()));
                    intent.setData(parse);
                    intent.putExtra(ecd.K_EFFECT_AD_TYPE, "1.0");
                }
            } catch (Exception unused) {
            }
        }
        return b(context, intent);
    }

    private boolean b(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23e54ac0", new Object[]{this, context, intent})).booleanValue();
        }
        if (this.b == null) {
            this.b = new TriverNavProcessor();
        }
        return this.b.triverHook(context, intent);
    }
}
