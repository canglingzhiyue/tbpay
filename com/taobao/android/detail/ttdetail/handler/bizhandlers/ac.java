package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class ac implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "change_sku_frame";

    /* renamed from: a  reason: collision with root package name */
    private Context f10674a;
    private eyx b;

    static {
        kge.a(1630823868);
        kge.a(1967244270);
    }

    public ac(Context context, eyx eyxVar) {
        this.f10674a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        String a2 = a(com.taobao.android.detail.ttdetail.utils.af.a(runtimeAbilityParamArr));
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        this.b.e().a(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH, com.taobao.android.detail.ttdetail.utils.k.a((String) this.b.e().a(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH), a2));
        return true;
    }

    private String a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2583e9f7", new Object[]{this, objArr});
        }
        if (objArr != null && objArr.length > 0 && (objArr[0] instanceof String)) {
            return (String) objArr[0];
        }
        return null;
    }
}
