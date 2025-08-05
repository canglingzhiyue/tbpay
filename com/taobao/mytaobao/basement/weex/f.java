package com.taobao.mytaobao.basement.weex;

import android.app.Activity;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex.h;
import com.taobao.android.weex.q;
import com.taobao.android.weex.s;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.DensityUtil;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.text.n;
import tb.kge;
import tb.ljl;
import tb.mtr;
import tb.mtz;
import tb.mxe;
import tb.nwv;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$H\u0007J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$J\u0006\u0010&\u001a\u00020!J\u0006\u0010'\u001a\u00020!J \u0010(\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\fH\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0006R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u0012@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/taobao/mytaobao/basement/weex/WeexInstanceLoadHelper;", "", "()V", "acceptImmediately", "", "getAcceptImmediately", "()Z", "setAcceptImmediately", "(Z)V", "acceptResult", "Lcom/taobao/android/weex/WeexInstance;", "callback", "Lcom/taobao/mytaobao/basement/listener/BasementCommonCallback;", "<set-?>", "hasRenderSuccess", "getHasRenderSuccess", "loadState", "", "", "renderErrorMsg", "getRenderErrorMsg", "()Ljava/lang/String;", "result", "Lcom/taobao/android/weex/WeexInstanceCreateCallback$Result;", "start", "", "getStart", "()J", "setStart", "(J)V", Baggage.Linkage.RPT_TICKET, "Lcom/taobao/android/weex/WeexInstanceAsyncBuilder$Ticket;", "asyncCreateWxInstance", "", "weexUrl", "aty", "Landroid/app/Activity;", "considerPreInitWxInstance", "considerStealTicket", "destroy", "getWeexInstance", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private s.a f18354a;
    private int b;
    private mtr<WeexInstance> c;
    private q.a d;
    private long e;
    private boolean f;
    private String g;
    private WeexInstance h;
    private boolean i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/mytaobao/basement/weex/WeexInstanceLoadHelper$asyncCreateWxInstance$2", "Lcom/taobao/android/weex/WeexInstanceCreateCallback;", "onInstanceCreatedInMain", "", "instance", "Lcom/taobao/android/weex/WeexInstanceCreateCallback$Result;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class b implements s {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Activity b;

        public b(Activity activity) {
            this.b = activity;
        }

        @Override // com.taobao.android.weex.s
        public void a(s.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8d89384", new Object[]{this, aVar});
                return;
            }
            f.a(f.this, aVar);
            if (f.this.f()) {
                f.a(f.this, aVar != null ? aVar.a(this.b) : null);
            }
            f.a(f.this, 2);
            if (f.a(f.this) != null) {
                WeexInstance b = f.b(f.this);
                WeexInstance a2 = b == null ? aVar != null ? aVar.a(this.b) : null : b;
                mtr a3 = f.a(f.this);
                if (a3 != null) {
                    a3.onResult(true, null, a2);
                }
                f.a(f.this, (mtr) null);
                f.a(f.this, (WeexInstance) null);
            }
            nwv.b("asyncCreateWxInstance", 0);
            nwv.a("dsw", "onInstanceCreatedInMain:=============" + (System.currentTimeMillis() - f.this.a()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ Activity c;

        public c(String str, Activity activity) {
            this.b = str;
            this.c = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                f.this.a(this.b, this.c);
            }
        }
    }

    static {
        kge.a(-389470246);
    }

    public static final /* synthetic */ mtr a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mtr) ipChange.ipc$dispatch("70f895f8", new Object[]{fVar}) : fVar.c;
    }

    public static final /* synthetic */ void a(f fVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6780b680", new Object[]{fVar, new Integer(i)});
        } else {
            fVar.b = i;
        }
    }

    public static final /* synthetic */ void a(f fVar, WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9532fdc1", new Object[]{fVar, weexInstance});
        } else {
            fVar.h = weexInstance;
        }
    }

    public static final /* synthetic */ void a(f fVar, s.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74881ce9", new Object[]{fVar, aVar});
        } else {
            fVar.f18354a = aVar;
        }
    }

    public static final /* synthetic */ void a(f fVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34aeafed", new Object[]{fVar, str});
        } else {
            fVar.g = str;
        }
    }

    public static final /* synthetic */ void a(f fVar, mtr mtrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d15064c8", new Object[]{fVar, mtrVar});
        } else {
            fVar.c = mtrVar;
        }
    }

    public static final /* synthetic */ void a(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6780f651", new Object[]{fVar, new Boolean(z)});
        } else {
            fVar.f = z;
        }
    }

    public static final /* synthetic */ WeexInstance b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexInstance) ipChange.ipc$dispatch("467092b2", new Object[]{fVar}) : fVar.h;
    }

    public final long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.e;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.g;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.i;
    }

    public final boolean a(Activity aty) {
        String k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{this, aty})).booleanValue();
        }
        kotlin.jvm.internal.q.c(aty, "aty");
        nwv.a("dsw", "isSnapshotWeex=" + mxe.INSTANCE.d() + " weexUrl=" + mxe.INSTANCE.k());
        if (!mxe.INSTANCE.d() || (k = mxe.INSTANCE.k()) == null) {
            return false;
        }
        mtz.a(new c(k, aty));
        return true;
    }

    public final void a(String weexUrl, Activity aty) {
        int i;
        View findViewById;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a5b204", new Object[]{this, weexUrl, aty});
            return;
        }
        kotlin.jvm.internal.q.c(weexUrl, "weexUrl");
        kotlin.jvm.internal.q.c(aty, "aty");
        TLog.loge("mtbMainLink", "asyncCreateWxInstance");
        this.b = 1;
        nwv.a("asyncCreateWxInstance", 0);
        this.e = System.currentTimeMillis();
        com.taobao.android.weex.config.b bVar = new com.taobao.android.weex.config.b();
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        weexUnicornConfig.a(WeexUnicornConfig.RenderMode.texture);
        bVar.a(weexUnicornConfig);
        JSONObject jSONObject = null;
        if (n.b((CharSequence) weexUrl, (CharSequence) "wotao-basement", false, 2, (Object) null)) {
            jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(BizContext.KEY_SETTING_FILTER, (Object) jSONObject2);
            jSONObject2.put("enable-async-shell-setup", (Object) false);
        }
        String a2 = g.a(true, weexUrl);
        kotlin.jvm.internal.q.a((Object) a2, "WeexUtils.processUrl(true, weexUrl)");
        q b2 = com.taobao.android.weex.e.b(aty, a2, WeexInstanceMode.DOM, WeexRenderType.UNICORN, jSONObject, bVar);
        try {
            findViewById = aty.findViewById(R.id.tbTabFragment);
        } catch (Throwable th) {
            th = th;
            i = 0;
        }
        if (findViewById == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        i = findViewById.getWidth();
        try {
            i2 = (findViewById.getHeight() - SystemBarDecorator.getStatusBarHeight(Globals.getApplication())) - DensityUtil.dip2px(Globals.getApplication(), 48.0f);
        } catch (Throwable th2) {
            th = th2;
            nwv.d("R.id.tbTabFragment size incorrect, throwable=" + th.getMessage());
            nwv.a("dsw", "dstWidth=" + i + " dstHeight=" + i2);
            if (i > 0) {
                b2.a(i, i2);
            }
            b2.a(a2);
            b2.a(new a());
            b2.a((WeexValue) null);
            this.d = b2.a(new b(aty));
        }
        nwv.a("dsw", "dstWidth=" + i + " dstHeight=" + i2);
        if (i > 0 && i2 > 0) {
            b2.a(i, i2);
        }
        b2.a(a2);
        b2.a(new a());
        b2.a((WeexValue) null);
        this.d = b2.a(new b(aty));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J&\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J&\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J.\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u0010\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J.\u0010\u0011\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u0013\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J&\u0010\u0014\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u0015"}, d2 = {"com/taobao/mytaobao/basement/weex/WeexInstanceLoadHelper$asyncCreateWxInstance$1", "Lcom/taobao/android/weex/WeexInstanceListener;", "onDestroyed", "", "instance", "Lcom/taobao/android/weex/WeexInstance;", "onEngineException", "type", "Lcom/taobao/android/weex/WeexErrorType;", "errorMsg", "", "onExecuteFailed", "onExecuteSuccess", "onInitFailed", "isCache", "", "onInitSuccess", "onRenderFailed", "isRefresh", ljl.RENDER_SUCCESS_TIME, "onScriptException", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.weex.h
        public void onDestroyed(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
            }
        }

        @Override // com.taobao.android.weex.h
        public void onEngineException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // com.taobao.android.weex.h
        public void onExecuteFailed(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // com.taobao.android.weex.h
        public void onExecuteSuccess(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
            }
        }

        @Override // com.taobao.android.weex.h
        public void onInitFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            }
        }

        @Override // com.taobao.android.weex.h
        public void onInitSuccess(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
            }
        }

        @Override // com.taobao.android.weex.h
        public void onScriptException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        public a() {
        }

        @Override // com.taobao.android.weex.h
        public void onRenderFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                return;
            }
            f fVar = f.this;
            if (str == null) {
                str = "weex报错";
            }
            f.a(fVar, str);
        }

        @Override // com.taobao.android.weex.h
        public void onRenderSuccess(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
            } else {
                f.a(f.this, true);
            }
        }
    }

    public final void a(Activity aty, mtr<WeexInstance> callback) {
        WeexInstance weexInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b6cea9f", new Object[]{this, aty, callback});
            return;
        }
        kotlin.jvm.internal.q.c(aty, "aty");
        kotlin.jvm.internal.q.c(callback, "callback");
        q.a aVar = this.d;
        if (aVar == null) {
            nwv.a("dsw", "getWeexInstance null =================");
            callback.onResult(false, "ticket is null", null);
            return;
        }
        if (aVar != null) {
            aVar.c();
        }
        int i = this.b;
        if (i == 0) {
            nwv.a("dsw", "getWeexInstance null1 =================");
            callback.onResult(false, "loadState=0不符合预期", null);
        } else if (i == 1) {
            nwv.a("dsw", "getWeexInstance wait =================");
            this.c = callback;
        } else {
            nwv.a("dsw", "getWeexInstance yes =================");
            WeexInstance weexInstance2 = this.h;
            if (weexInstance2 == null) {
                s.a aVar2 = this.f18354a;
                weexInstance = aVar2 != null ? aVar2.a(aty) : null;
            } else {
                weexInstance = weexInstance2;
            }
            callback.onResult(true, null, weexInstance);
            this.h = null;
        }
        this.d = null;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        s.a aVar = this.f18354a;
        if (aVar != null) {
            aVar.a();
        }
        this.f18354a = null;
        this.h = null;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        q.a aVar = this.d;
        if (aVar == null) {
            return;
        }
        aVar.c();
    }
}
