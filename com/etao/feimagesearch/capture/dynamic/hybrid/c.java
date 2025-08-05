package com.etao.feimagesearch.capture.dynamic.hybrid;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.y;
import com.taobao.android.weex_ability.page.MSHCNavAdapter;
import com.taobao.android.weex_framework.p;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class c extends MSHCNavAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AppCompatActivity e;

    static {
        kge.a(-385416817);
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a a(p pVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_ability.page.a) ipChange.ipc$dispatch("4f62fd29", new Object[]{this, pVar, jSONObject});
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.b
    public boolean a(p pVar, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("835e5297", new Object[]{this, pVar, menu})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a b(p pVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_ability.page.a) ipChange.ipc$dispatch("b0c2b48", new Object[]{this, pVar, jSONObject});
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a c(p pVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_ability.page.a) ipChange.ipc$dispatch("c6b55967", new Object[]{this, pVar, jSONObject});
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a d(p pVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_ability.page.a) ipChange.ipc$dispatch("825e8786", new Object[]{this, pVar, jSONObject});
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a e(p pVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_ability.page.a) ipChange.ipc$dispatch("3e07b5a5", new Object[]{this, pVar, jSONObject});
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a f(p pVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_ability.page.a) ipChange.ipc$dispatch("f9b0e3c4", new Object[]{this, pVar, jSONObject});
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AppCompatActivity activity) {
        super(activity);
        q.c(activity, "activity");
        this.e = activity;
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a a(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_ability.page.a) ipChange.ipc$dispatch("93f2092f", new Object[]{this, pVar});
        }
        Integer a2 = y.INSTANCE.a(this.e);
        if (a2 == null) {
            return null;
        }
        a2.intValue();
        return new com.taobao.android.weex_ability.page.a(String.valueOf(a2.intValue()), "");
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a b(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_ability.page.a) ipChange.ipc$dispatch("746b5f30", new Object[]{this, pVar});
        }
        Integer a2 = y.INSTANCE.a((Activity) this.e);
        if (a2 == null) {
            return null;
        }
        a2.intValue();
        return new com.taobao.android.weex_ability.page.a(String.valueOf(a2.intValue()), "");
    }
}
