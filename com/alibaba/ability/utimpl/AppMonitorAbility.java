package com.alibaba.ability.utimpl;

import com.alibaba.ability.e;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsAppMonitorAbility;
import com.taobao.android.abilityidl.ability.ex;
import com.taobao.android.abilityidl.ability.ey;
import com.taobao.android.abilityidl.ability.ez;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes2.dex */
public final class AppMonitorAbility extends AbsAppMonitorAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ey f1987a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public a(ey eyVar, String str, String str2, String str3) {
            this.f1987a = eyVar;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AppMonitor.Alarm.commitFail(this.b, this.c, this.d, this.f1987a.c, this.f1987a.d);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f1988a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public b(String str, String str2, String str3) {
            this.f1988a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AppMonitor.Alarm.commitSuccess(this.f1988a, this.b, this.c);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ex f1989a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public c(ex exVar, String str, String str2, String str3) {
            this.f1989a = exVar;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AppMonitor.Counter.commit(this.b, this.c, this.d, this.f1989a.c);
            }
        }
    }

    static {
        kge.a(-153672601);
    }

    public static /* synthetic */ Object ipc$super(AppMonitorAbility appMonitorAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppMonitorAbility
    public void alarmFail(als context, ey params, gml callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b11be69", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        String str = params.f8856a;
        String str2 = params.b;
        if (!(str.length() == 0)) {
            if (str2.length() != 0) {
                z = false;
            }
            if (!z) {
                e.c((Runnable) new a(params, str, str2, a(params.e)));
                return;
            }
        }
        ErrorResult b2 = a$a.b("参数不正确");
        q.b(b2, "ErrorResult.StandardError.paramsInvalid(\"参数不正确\")");
        callback.a(b2);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppMonitorAbility
    public void alarmSuccess(als context, ez params, gml callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c20963eb", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        String str = params.f8857a;
        String str2 = params.b;
        if (!(str.length() == 0)) {
            if (str2.length() != 0) {
                z = false;
            }
            if (!z) {
                e.c((Runnable) new b(str, str2, a(params.c)));
                return;
            }
        }
        ErrorResult b2 = a$a.b("参数不正确");
        q.b(b2, "ErrorResult.StandardError.paramsInvalid(\"参数不正确\")");
        callback.a(b2);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppMonitorAbility
    public void counter(als context, ex params, gml callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1509a937", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        String str = params.f8855a;
        String str2 = params.b;
        if (!(str.length() == 0)) {
            if (str2.length() != 0) {
                z = false;
            }
            if (!z) {
                e.c((Runnable) new c(params, str, str2, a(params.d)));
                return;
            }
        }
        ErrorResult b2 = a$a.b("参数不正确");
        q.b(b2, "ErrorResult.StandardError.paramsInvalid(\"参数不正确\")");
        callback.a(b2);
    }

    private final String a(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map});
        }
        if (map == null) {
            return "";
        }
        Object obj = map.get("_dx_arg_");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str != null) {
            return str;
        }
        String jSONString = new JSONObject(map).toJSONString();
        q.b(jSONString, "JSONObject(argMap).toJSONString()");
        return jSONString;
    }
}
