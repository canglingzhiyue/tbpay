package com.taobao.android.abilitykit.ability;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsToastAbility;
import com.taobao.android.abilityidl.ability.ei;
import java.util.Map;
import kotlin.t;
import tb.als;
import tb.dlb;
import tb.dls;
import tb.dlt;
import tb.dmr;
import tb.gml;
import tb.kge;
import tb.mto;

/* loaded from: classes4.dex */
public class ToastAbility extends AbsToastAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_SHOW = "show";
    public static final a Companion;
    public static final int DURATION_TIME_SHORT = 2000;
    public static final String TOAST_KEY = "19624396198704";

    /* renamed from: a  reason: collision with root package name */
    private Handler f8904a;
    private dlt c = dlb.d();

    /* loaded from: classes4.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Toast b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ ei d;

        public b(Toast toast, Context context, ei eiVar) {
            this.b = toast;
            this.c = context;
            this.d = eiVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ToastAbility toastAbility = ToastAbility.this;
            Toast toast = this.b;
            kotlin.jvm.internal.q.b(toast, "toast");
            ToastAbility.access$showToast(toastAbility, toast, this.c, this.d);
        }
    }

    static {
        kge.a(1275051384);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(ToastAbility toastAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(-1174719808);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    public static final /* synthetic */ void access$showToast(ToastAbility toastAbility, Toast toast, Context context, ei eiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d7131e", new Object[]{toastAbility, toast, context, eiVar});
        } else {
            toastAbility.a(toast, context, eiVar);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsToastAbility
    public void show(als abilityContext, ei params, gml callback) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b8441e7", new Object[]{this, abilityContext, params, callback});
            return;
        }
        kotlin.jvm.internal.q.d(abilityContext, "abilityContext");
        kotlin.jvm.internal.q.d(params, "params");
        kotlin.jvm.internal.q.d(callback, "callback");
        Context f = abilityContext.f().f();
        if (f == null) {
            callback.a(a$a.Companion.b("NoAppCtx"));
            return;
        }
        String str = params.f8841a;
        if (!(!TextUtils.isEmpty(str))) {
            str = null;
        }
        if (str == null) {
            callback.a(new ErrorResult("CONTENT_EMPTY", "content is empty", (Map) null, 4, (kotlin.jvm.internal.o) null));
            return;
        }
        if (params.b <= 2000) {
            i = 0;
        }
        Toast toast = Toast.makeText(f, str, i);
        toast.setGravity(23, 0, 0);
        Double d = params.c;
        double doubleValue = d != null ? d.doubleValue() : mto.a.GEO_NOT_SUPPORT;
        if (doubleValue > 0) {
            a().postDelayed(new b(toast, f, params), (long) doubleValue);
            return;
        }
        kotlin.jvm.internal.q.b(toast, "toast");
        a(toast, f, params);
    }

    @Override // com.taobao.android.abilityidl.b, com.taobao.android.abilityidl.c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        dlt dltVar = this.c;
        if (dltVar != null) {
            dltVar.a();
        }
        this.f8904a = null;
    }

    private final void a(Toast toast, Context context, ei eiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3967ea5e", new Object[]{this, toast, context, eiVar});
        } else if (this.c == null || dmr.f()) {
            toast.show();
        } else {
            dlt dltVar = this.c;
            if (dltVar == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (Object) Double.valueOf(eiVar.b));
            jSONObject.put("content", (Object) eiVar.f8841a);
            String str = eiVar.d;
            if (str == null) {
                str = "";
            }
            jSONObject.put("iconFont", (Object) str);
            String str2 = eiVar.e;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("iconURL", (Object) str2);
            jSONObject.put("delay", (Object) eiVar.c);
            t tVar = t.INSTANCE;
            dltVar.a("toast", jSONObject, context, new c(context, toast));
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements dls {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f8906a;
        public final /* synthetic */ Toast b;

        @Override // tb.dls
        public void onEvent(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9589844c", new Object[]{this, str});
            }
        }

        public c(Context context, Toast toast) {
            this.f8906a = context;
            this.b = toast;
        }

        @Override // tb.dls
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
                return;
            }
            kotlin.jvm.internal.q.d(view, "view");
            FrameLayout frameLayout = new FrameLayout(this.f8906a);
            if (view.getLayoutParams() != null) {
                view.setLayoutParams(new FrameLayout.LayoutParams(view.getLayoutParams().width, view.getLayoutParams().height, 17));
            }
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            frameLayout.addView(view);
            this.b.setView(frameLayout);
            this.b.show();
        }

        @Override // tb.dls
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.b.show();
            }
        }
    }

    private final Handler a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("b016d95e", new Object[]{this});
        }
        Handler handler = this.f8904a;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f8904a = handler2;
        return handler2;
    }
}
