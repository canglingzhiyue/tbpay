package com.taobao.themis.kernel.launcher.step;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.page.ITMSPageFactory;
import com.taobao.themis.kernel.utils.d;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.qpp;
import tb.qpr;

/* loaded from: classes9.dex */
public final class c extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1875074213);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f instance, qpr launcher, qpp listener) {
        super(instance, launcher, listener);
        q.d(instance, "instance");
        q.d(launcher, "launcher");
        q.d(listener, "listener");
    }

    @Override // com.taobao.themis.kernel.launcher.step.b
    public ITMSPage f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("4e6ddf4", new Object[]{this});
        }
        d dVar = d.INSTANCE;
        f mInstance = this.f22538a;
        q.b(mInstance, "mInstance");
        ITMSPageFactory m = mInstance.m();
        f mInstance2 = this.f22538a;
        q.b(mInstance2, "mInstance");
        String g = mInstance2.g();
        q.b(g, "mInstance.url");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) com.taobao.themis.kernel.entity.a.KEY_IS_HOME_PAGE, (String) true);
        f mInstance3 = this.f22538a;
        q.b(mInstance3, "mInstance");
        jSONObject2.put((JSONObject) com.taobao.themis.kernel.entity.a.KEY_WEEX_INIT_DATA, (String) mInstance3.q().getExtraData().get(com.taobao.themis.kernel.entity.a.KEY_WEEX_INIT_DATA));
        t tVar = t.INSTANCE;
        ITMSPage a2 = ITMSPageFactory.a.a(m, g, null, jSONObject, null, 8, null);
        d dVar2 = d.INSTANCE;
        if (a2 != null) {
            f mInstance4 = this.f22538a;
            q.b(mInstance4, "mInstance");
            mInstance4.b().a(a2);
        }
        return a2;
    }
}
