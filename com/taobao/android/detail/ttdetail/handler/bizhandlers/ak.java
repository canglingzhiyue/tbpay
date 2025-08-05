package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class ak implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "update_sku";

    /* renamed from: a  reason: collision with root package name */
    private Context f10686a;
    private eyx b;
    private a c;

    /* loaded from: classes5.dex */
    public interface a {
        void a(String str);
    }

    static {
        kge.a(-796793571);
        kge.a(1967244270);
    }

    public ak(Context context, eyx eyxVar, a aVar) {
        this.f10686a = context;
        this.b = eyxVar;
        this.c = aVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || (b = aVar.b()) == null) {
            return false;
        }
        String string = b.getString("skuId");
        String string2 = b.getString(com.taobao.android.detail.core.aura.utils.g.KEY_PV_PATH);
        if (!TextUtils.isEmpty(string)) {
            this.b.e().a("lastPageSetSkuId", string);
            this.c.a(string);
        } else if (!TextUtils.isEmpty(string2)) {
            this.b.e().a(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH, com.taobao.android.detail.ttdetail.utils.k.a((String) this.b.e().a(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH), string2));
        }
        return true;
    }
}
