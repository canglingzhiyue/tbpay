package com.taobao.themis.open.permission.auth;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.k;
import com.taobao.themis.open.permission.auth.model.d;
import com.taobao.themis.open.permission.auth.ui.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.qpt;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 )2\u00020\u0001:\u0002()B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\u0019\u001a\u00020\u0012J&\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0012H\u0002J\b\u0010 \u001a\u00020\u0015H\u0002J\b\u0010!\u001a\u00020\u0012H\u0002J\b\u0010\"\u001a\u00020\u0012H\u0002J\u001a\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010&\u001a\u00020\u0012H\u0002J\b\u0010'\u001a\u00020\u0012H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u00130\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/taobao/themis/open/permission/auth/TMSAuthHelper;", "", "context", "Landroid/content/Context;", "requestModel", "Lcom/taobao/themis/open/permission/auth/model/AuthRequestModel;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "callback", "Lcom/taobao/themis/open/permission/auth/TMSAuthHelper$AuthCallback;", "(Landroid/content/Context;Lcom/taobao/themis/open/permission/auth/model/AuthRequestModel;Lcom/taobao/themis/kernel/TMSInstance;Lcom/taobao/themis/kernel/page/ITMSPage;Lcom/taobao/themis/open/permission/auth/TMSAuthHelper$AuthCallback;)V", "authResult", "Lcom/taobao/themis/open/permission/auth/model/AuthResultModel;", "authTasks", "Ljava/util/Queue;", "Lkotlin/Function0;", "", "Lcom/taobao/themis/open/permission/auth/AuthTask;", "hasFinish", "", "scopeTypeMap", "", "", "auth", "callbackErrorResult", "errorCode", "errorMsg", "ext", "Lcom/alibaba/fastjson/JSONObject;", "checkAuthStorage", "checkHasFinish", "moveToNext", "sendAuthCheckRequest", "sendResult", "success", "data", "showAuthDialog", "updateAuthStatus", "AuthCallback", "Companion", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion;
    public static final String ERROR_CODE_CANCEL = "PC_USER_CANCEL";
    public static final String ERROR_CODE_EXCEPTION = "PC_EXCEPTION";
    public static final String ERROR_CODE_PARAMS = "PC_PARAMS_ERROR";
    public static final String ERROR_MESSAGE_CANCEL = "用户取消授权";
    public static final String ERROR_MESSAGE_PARAMS = "scopes至少传入1个，且最大支持5个";
    public static final String TAG = "TMSAuthHelper";

    /* renamed from: a  reason: collision with root package name */
    private boolean f22684a;
    private Map<String, String> b;
    private final d c;
    private final Queue<ruk<t>> d;
    private final Context e;
    private final com.taobao.themis.open.permission.auth.model.c f;
    private final f g;
    private final ITMSPage h;
    private final a i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/taobao/themis/open/permission/auth/TMSAuthHelper$AuthCallback;", "", "onCallBack", "", "success", "", "result", "Lcom/alibaba/fastjson/JSONObject;", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface a {
        void a(boolean z, JSONObject jSONObject);
    }

    static {
        kge.a(2050413754);
        Companion = new b(null);
    }

    public c(Context context, com.taobao.themis.open.permission.auth.model.c requestModel, f instance, ITMSPage iTMSPage, a callback) {
        q.d(context, "context");
        q.d(requestModel, "requestModel");
        q.d(instance, "instance");
        q.d(callback, "callback");
        this.e = context;
        this.f = requestModel;
        this.g = instance;
        this.h = iTMSPage;
        this.i = callback;
        this.b = AuthUtils.INSTANCE.a(this.g, this.f.b());
        this.c = new d();
        this.d = new LinkedList();
        c cVar = this;
        this.d.add(new TMSAuthHelper$1(cVar));
        this.d.add(new TMSAuthHelper$2(cVar));
        this.d.add(new TMSAuthHelper$3(cVar));
        this.d.add(new TMSAuthHelper$4(cVar));
    }

    public static final /* synthetic */ com.taobao.themis.open.permission.auth.model.c a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.open.permission.auth.model.c) ipChange.ipc$dispatch("e5bc24d4", new Object[]{cVar}) : cVar.f;
    }

    public static final /* synthetic */ void a(c cVar, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d26172", new Object[]{cVar, str, str2, jSONObject});
        } else {
            cVar.a(str, str2, jSONObject);
        }
    }

    public static final /* synthetic */ Map b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("bc3e7260", new Object[]{cVar}) : cVar.b;
    }

    public static final /* synthetic */ f c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("4af9ce6f", new Object[]{cVar}) : cVar.g;
    }

    public static final /* synthetic */ d d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("54fcbfd0", new Object[]{cVar}) : cVar.c;
    }

    public static final /* synthetic */ void e(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b1aa2e", new Object[]{cVar});
        } else {
            cVar.b();
        }
    }

    public static final /* synthetic */ void f(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2bd06f", new Object[]{cVar});
        } else {
            cVar.d();
        }
    }

    public static final /* synthetic */ void g(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0a5f6b0", new Object[]{cVar});
        } else {
            cVar.e();
        }
    }

    public static final /* synthetic */ void h(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46201cf1", new Object[]{cVar});
        } else {
            cVar.f();
        }
    }

    public static final /* synthetic */ void i(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb9a4332", new Object[]{cVar});
        } else {
            cVar.g();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/taobao/themis/open/permission/auth/TMSAuthHelper$Companion;", "", "()V", "ERROR_CODE_CANCEL", "", "ERROR_CODE_EXCEPTION", "ERROR_CODE_PARAMS", "ERROR_MESSAGE_CANCEL", "ERROR_MESSAGE_PARAMS", RPCDataItems.SWITCH_TAG_LOG, "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b {
        static {
            kge.a(-1099456638);
        }

        private b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (!this.f.b().isEmpty() && this.f.b().size() <= 5) {
                ruk<t> poll = this.d.poll();
                if (poll == null) {
                    return;
                }
                poll.mo2427invoke();
                return;
            }
            a(ERROR_CODE_PARAMS, ERROR_MESSAGE_PARAMS, null);
        } catch (Throwable th) {
            TMSLogger.b(TAG, " ", th);
            a(ERROR_CODE_EXCEPTION, th.getMessage(), null);
        }
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (c()) {
        } else {
            ruk<t> poll = this.d.poll();
            if (poll == null) {
                a(true, null);
            } else {
                poll.mo2427invoke();
            }
        }
    }

    private final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (this.f22684a) {
            return true;
        }
        if (!this.f.b().isEmpty()) {
            return false;
        }
        a(this.c.a().c().isEmpty(), null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.permission.auth.c.d():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e() {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.permission.auth.c.e():void");
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        TMSLogger.b(TAG, "enter showAuthDialog");
        ITMSPage iTMSPage = this.h;
        if (iTMSPage != null && iTMSPage.l()) {
            TMSLogger.c(TAG, "auth should show dailog but page is exited!");
            a(ERROR_CODE_CANCEL, "页面已退出", null);
            return;
        }
        com.taobao.themis.open.permission.auth.a aVar = com.taobao.themis.open.permission.auth.a.INSTANCE;
        String h = this.g.h();
        q.b(h, "instance.appId");
        for (String str : aVar.c(h)) {
            if (this.f.b().remove(str)) {
                TMSLogger.c(TAG, str + " hit refusedScopes");
                this.c.a().c().put(str, ERROR_CODE_CANCEL);
            }
        }
        if (this.f.b().isEmpty()) {
            TMSLogger.c(TAG, "all hit refusedScopes, callback error");
            a(ERROR_CODE_CANCEL, ERROR_MESSAGE_CANCEL, null);
            return;
        }
        Activity o = this.g.o();
        q.b(o, "instance.activity");
        new e(o, this.g, this.c.b(), this.f.b(), new C0965c()).a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\t"}, d2 = {"com/taobao/themis/open/permission/auth/TMSAuthHelper$showAuthDialog$2", "Lcom/taobao/themis/open/permission/auth/ui/AuthDialogCallback;", "onCancel", "", "canceledScopes", "", "", "onConfirm", "confirmedScopes", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.open.permission.auth.c$c  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0965c implements com.taobao.themis.open.permission.auth.ui.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
        /* renamed from: com.taobao.themis.open.permission.auth.c$c$a */
        /* loaded from: classes9.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    c.e(c.this);
                }
            }
        }

        public C0965c() {
        }

        @Override // com.taobao.themis.open.permission.auth.ui.b
        public void a(List<String> confirmedScopes) {
            Executor executor;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, confirmedScopes});
                return;
            }
            q.d(confirmedScopes, "confirmedScopes");
            TMSLogger.c(c.TAG, "onConfirm");
            ArrayList arrayList = new ArrayList();
            for (String str : c.a(c.this).b()) {
                if (AuthUtils.INSTANCE.a(str, c.b(c.this))) {
                    arrayList.add(str);
                    com.taobao.themis.open.permission.auth.a.INSTANCE.b(k.o(c.c(c.this)), str, true);
                    c.d(c.this).a().b().add(str);
                }
            }
            c.a(c.this).b().removeAll(arrayList);
            IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
            if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.NORMAL)) == null) {
                return;
            }
            executor.execute(new a());
        }

        @Override // com.taobao.themis.open.permission.auth.ui.b
        public void b(List<String> canceledScopes) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d39e1eda", new Object[]{this, canceledScopes});
                return;
            }
            q.d(canceledScopes, "canceledScopes");
            TMSLogger.c(c.TAG, "onCancel");
            com.taobao.themis.open.permission.auth.a aVar = com.taobao.themis.open.permission.auth.a.INSTANCE;
            String h = c.c(c.this).h();
            q.b(h, "instance.appId");
            aVar.a(h, canceledScopes);
            for (String str : c.a(c.this).b()) {
                if (AuthUtils.INSTANCE.a(str, c.b(c.this))) {
                    com.taobao.themis.open.permission.auth.a.INSTANCE.b(k.o(c.c(c.this)), str, false);
                } else {
                    com.taobao.themis.open.permission.auth.a.INSTANCE.a(k.o(c.c(c.this)), str, false);
                }
            }
            c.a(c.this, c.ERROR_CODE_CANCEL, c.ERROR_MESSAGE_CANCEL, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x028b, code lost:
        if (kotlin.jvm.internal.q.a((java.lang.Object) "TOPAUTH_ACCESSTOKEN_EXPIRED", (java.lang.Object) (r1 != null ? r1.getErrorMsg() : null)) != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g() {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.permission.auth.c.g():void");
    }

    private final void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "errorCode", str);
        jSONObject3.put((JSONObject) "errorMessage", str2);
        if (jSONObject != null) {
            jSONObject2.putAll(jSONObject);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str3 : this.f.b()) {
            linkedHashMap.put(str3, str == null ? "" : str);
        }
        this.c.a().c().putAll(linkedHashMap);
        a(false, jSONObject2);
    }

    private final void a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
        } else if (this.f22684a) {
        } else {
            this.f22684a = true;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObject2 = jSONObject;
            String a2 = this.c.a().a();
            if (a2 == null) {
                a2 = "";
            }
            jSONObject2.put((JSONObject) "accessToken", a2);
            jSONObject2.put((JSONObject) "authSuccessScopes", (String) com.taobao.themis.kernel.utils.f.INSTANCE.a(this.c.a().b()));
            jSONObject2.put((JSONObject) "authErrorScopes", (String) new JSONObject(this.c.a().c()));
            this.i.a(z, jSONObject);
        }
    }
}
