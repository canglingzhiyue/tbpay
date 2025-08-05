package com.alibaba.ability.impl.loading;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsLoadingAbility;
import com.taobao.android.abilityidl.ability.fv;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.als;
import tb.dlj;
import tb.gml;
import tb.kge;

/* loaded from: classes2.dex */
public final class LoadingAbility extends AbsLoadingAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_HIDE = "hide";
    public static final String API_SHOW = "show";
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private dlj f1906a;

    static {
        kge.a(132988490);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(LoadingAbility loadingAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(-1365027566);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLoadingAbility
    public void show(als context, fv params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e0cae3b", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        a(context, callback, params);
    }

    private final void a(als alsVar, gml gmlVar, fv fvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("481b6d1f", new Object[]{this, alsVar, gmlVar, fvVar});
            return;
        }
        Context f = alsVar.f().f();
        if (!(f instanceof Activity)) {
            f = null;
        }
        Activity activity = (Activity) f;
        if (!(activity instanceof Activity)) {
            gmlVar.a(new ErrorResult("400", "NoActivity", (Map) null, 4, (o) null));
            return;
        }
        dlj dljVar = this.f1906a;
        if (dljVar == null) {
            dljVar = new dlj();
        }
        this.f1906a = dljVar;
        Dialog a2 = dljVar.a();
        if (a2 != null && a2.isShowing()) {
            return;
        }
        dljVar.a(new JSONObject(a(fvVar)), activity);
    }

    private final HashMap<String, Object> a(fv fvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("52689b90", new Object[]{this, fvVar});
        }
        if (fvVar == null) {
            return null;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        String str = fvVar.f8876a;
        if (str != null) {
            hashMap.put("message", str);
        }
        String str2 = fvVar.b;
        if (str2 != null) {
            hashMap.put("style", str2);
        }
        return hashMap;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLoadingAbility
    public void hide(als context, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5ba52fb", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        dlj dljVar = this.f1906a;
        if (dljVar == null) {
            return;
        }
        dljVar.b();
    }
}
