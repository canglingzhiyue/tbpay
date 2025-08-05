package com.taobao.android.fluid.business.undermode.helper;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.login4android.api.Login;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.aej;
import tb.aek;
import tb.ael;
import tb.aem;
import tb.kge;
import tb.oca;
import tb.occ;
import tb.ocd;
import tb.spz;

/* loaded from: classes5.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b INSTANCE;
    public static final String TAG = "UnderageModeHelper";

    /* renamed from: a  reason: collision with root package name */
    private static final a f12413a;

    static {
        kge.a(345282627);
        INSTANCE = new b();
        f12413a = new a();
    }

    private b() {
    }

    /* loaded from: classes5.dex */
    public static final class a implements aek {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<Activity> f12414a;
        private WeakReference<FluidContext> b;

        public final void a(FluidContext fluidContext, Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab1b6f6c", new Object[]{this, fluidContext, activity});
                return;
            }
            q.d(fluidContext, "fluidContext");
            q.d(activity, "activity");
            this.b = new WeakReference<>(fluidContext);
            this.f12414a = new WeakReference<>(activity);
        }

        @Override // tb.aek
        public ael onEvent(int i, aej context, Object[] obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), context, obj});
            }
            q.d(context, "context");
            q.d(obj, "obj");
            if (i == 3005 && (obj[0] instanceof String)) {
                Object obj2 = obj[0];
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                String str = (String) obj2;
                spz.c("UnderageModeHelper", "registTimeLockResult paramsString:" + str);
                JSONObject parseObject = JSON.parseObject(str);
                if (q.a((Object) (parseObject != null ? parseObject.getString("event") : null), (Object) "ITAO_YOUNG_CLOSE_LOCK_SUCCESS")) {
                    JSONObject jSONObject = parseObject.getJSONObject("param");
                    if (q.a((Object) (jSONObject != null ? jSONObject.getString("bizCode") : null), (Object) "tab2")) {
                        b.INSTANCE.a(context.c, true);
                        WeakReference<Activity> weakReference = this.f12414a;
                        if ((weakReference != null ? weakReference.get() : null) != null) {
                            com.taobao.android.fluid.business.undermode.helper.a aVar = com.taobao.android.fluid.business.undermode.helper.a.INSTANCE;
                            WeakReference<FluidContext> weakReference2 = this.b;
                            q.a(weakReference2);
                            FluidContext fluidContext = weakReference2.get();
                            q.a(fluidContext);
                            q.b(fluidContext, "fluidContextRef!!.get()!!");
                            WeakReference<Activity> weakReference3 = this.f12414a;
                            q.a(weakReference3);
                            Activity activity = weakReference3.get();
                            q.a(activity);
                            q.b(activity, "activityRef!!.get()!!");
                            aVar.a(fluidContext, activity);
                        }
                    }
                }
            }
            return null;
        }
    }

    public final void a(FluidContext fluidContext, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1b6f6c", new Object[]{this, fluidContext, activity});
            return;
        }
        q.d(fluidContext, "fluidContext");
        q.d(activity, "activity");
        a();
        f12413a.a(fluidContext, activity);
        aem.a().a(f12413a);
        spz.c("UnderageModeHelper", "registTimeLockResult");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        spz.c("UnderageModeHelper", "unregistTimeLockResult");
        aem.a().b(f12413a);
    }

    public final void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{this, context, new Boolean(z)});
            return;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        spz.c("UnderageModeHelper", "setTimeLockState currentTime:" + valueOf + " ; isClosed=" + z + ", context=" + context);
        if (z) {
            occ.a(context, b(), valueOf.toString());
        } else {
            occ.a(context, b(), "");
        }
    }

    public final boolean a(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        q.d(context, "context");
        String a2 = occ.a(context, b());
        spz.c("UnderageModeHelper", "isTimeLockClosed closeTime:" + a2);
        String str = a2;
        if (str != null && !n.a((CharSequence) str)) {
            z = false;
        }
        if (z || n.e(a2) == null) {
            return false;
        }
        boolean a3 = ocd.a(Long.parseLong(a2), System.currentTimeMillis());
        spz.c("UnderageModeHelper", "isTimeLockClosed isSameDay:" + a3);
        return a3;
    }

    private final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        return "UnderageTimeLock" + oca.a(Login.getUserId());
    }
}
