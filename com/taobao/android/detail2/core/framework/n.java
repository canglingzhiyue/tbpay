package com.taobao.android.detail2.core.framework;

import android.content.Intent;
import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import tb.ecd;
import tb.fjt;
import tb.ipa;
import tb.kge;
import tb.ojy;
import tb.xjv;
import tb.xjw;
import tb.xjx;

/* loaded from: classes5.dex */
public class n extends c implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(197450546);
        kge.a(-719787762);
    }

    public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
        if (str.hashCode() == -2026073663) {
            return new Boolean(super.process((Intent) objArr[0], (com.taobao.android.nav.d) objArr[1]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail2.core.framework.c
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail2.core.framework.c, com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        ipa.h("simpleNav");
        ipa.i("simpleNav");
        ipa.aJ();
        dVar.a("com.taobao.taobao");
        dVar.b("com.taobao.android.detail2.core.framework.NewDetailActivity");
        boolean process = super.process(intent, dVar);
        fjt.a("NewDetailSimpleNavProcessor", "拦截器调用 super.process  >>> result = " + process);
        return process;
    }

    @Override // com.taobao.android.detail2.core.framework.c
    public boolean a(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40d54a33", new Object[]{this, intent, dVar})).booleanValue();
        }
        b(intent);
        b();
        ojy<JSONObject, JSONObject> ojyVar = new ojy<>();
        if (this.f) {
            boolean b = b(intent, dVar, ojyVar);
            if (ipa.r()) {
                fjt.a("NewDetailSimpleNavProcessor", "CheckEUrl: SkipCheck ad e url .");
                return b;
            }
            b(intent, dVar);
            return b;
        }
        if (ipa.r()) {
            fjt.a("NewDetailSimpleNavProcessor", "CheckEUrl: SkipCheck ad e url .");
        } else {
            b(intent, dVar);
        }
        return b(intent, dVar, ojyVar);
    }

    private void b(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a299f70", new Object[]{this, intent, dVar});
            return;
        }
        boolean p = ipa.p();
        Uri a2 = xjx.a(intent.getData());
        xjw xjwVar = new xjw();
        xjwVar.c = a2;
        new xjv().a(intent, dVar, xjwVar);
        if (p) {
            fjt.a("NewDetailSimpleNavProcessor", "CheckEUrl: ForceCheck ad e url .");
            xjwVar.f34343a = true;
        }
        if (xjwVar.f34343a) {
            a(intent, xjwVar);
            fjt.a("NewDetailSimpleNavProcessor", "广告拦截器拦截成功。");
            return;
        }
        intent.setData(a2);
        fjt.a("NewDetailSimpleNavProcessor", "广告拦截器拦截失败。");
    }

    private void a(Intent intent, xjw xjwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0450fb0", new Object[]{this, intent, xjwVar});
            return;
        }
        try {
            String uri = xjwVar.c.toString();
            String handleAdUrl = AlimamaAdvertising.instance().handleAdUrl(uri);
            fjt.a("NewDetailSimpleNavProcessor", "广告链路兜底处理中... oldUrl: " + uri + " newUrl:" + handleAdUrl);
            intent.setData(Uri.parse(handleAdUrl));
            intent.putExtra(ecd.K_EFFECT_AD_TYPE, "1.0");
        } catch (Exception e) {
            fjt.a("NewDetailSimpleNavProcessor", "广告拦截器处理出错", e);
        }
    }
}
