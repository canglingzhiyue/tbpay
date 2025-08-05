package com.taobao.android.abilitykit.ability.pop.presenter;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.tao.log.TLog;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.dmm;
import tb.rul;

/* loaded from: classes4.dex */
public final class AKBasePopPresenter$notifyPopWindowStateChanged$1 extends Lambda implements rul<a<?, ?>, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ JSONObject $data;
    public final /* synthetic */ String $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKBasePopPresenter$notifyPopWindowStateChanged$1(String str, JSONObject jSONObject) {
        super(1);
        this.$state = str;
        this.$data = jSONObject;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(a<?, ?> aVar) {
        invoke2(aVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(a<?, ?> it) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caaa223b", new Object[]{this, it});
            return;
        }
        q.d(it, "it");
        try {
            IAKPopRender<?, ?> g = it.g();
            if (g == null) {
                return;
            }
            g.b(this.$state, this.$data);
        } catch (Throwable th) {
            TLog.loge("stdPopTag", "stdPopTag", "notifyPopWindowStateChanged error = " + dmm.a(th));
        }
    }
}
