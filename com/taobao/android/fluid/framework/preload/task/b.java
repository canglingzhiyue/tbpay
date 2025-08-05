package com.taobao.android.fluid.framework.preload.task;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import java.util.Map;
import tb.kge;
import tb.soo;
import tb.sor;

/* loaded from: classes5.dex */
public class b extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1801369767);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2128160755:
                return super.toString();
            case -1959610954:
                super.a((sor) objArr[0], (com.taobao.android.fluid.core.a) objArr[1]);
                return null;
            case -1950985330:
                super.a((String) objArr[0], objArr[1]);
                return null;
            case 40303500:
                return new Boolean(super.a((JSONObject) objArr[0]));
            case 152292832:
                return super.d();
            case 381435815:
                return super.b();
            case 1972638560:
                return super.a();
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a, com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a
    public /* bridge */ /* synthetic */ void a(String str, Object obj) {
        super.a(str, obj);
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a, com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public /* bridge */ /* synthetic */ void a(sor sorVar, com.taobao.android.fluid.core.a aVar) {
        super.a(sorVar, aVar);
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a, com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public /* bridge */ /* synthetic */ boolean a(JSONObject jSONObject) {
        return super.a(jSONObject);
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a, com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public /* bridge */ /* synthetic */ sor b() {
        return super.b();
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a, com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public /* bridge */ /* synthetic */ Map d() {
        return super.d();
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public b(FluidContext fluidContext, Context context, JSONObject jSONObject, soo sooVar) {
        super(fluidContext, context, jSONObject, sooVar);
    }

    @Override // com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public void b(com.taobao.android.fluid.core.a<sor> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4139c2f", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            aVar.a(null);
        }
    }
}
