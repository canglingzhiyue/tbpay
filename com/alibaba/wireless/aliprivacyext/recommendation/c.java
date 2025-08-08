package com.alibaba.wireless.aliprivacyext.recommendation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import anet.channel.request.Request;
import anetwork.channel.interceptor.Callback;
import anetwork.channel.interceptor.Interceptor;
import anetwork.channel.interceptor.InterceptorManager;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.ccrc.service.build.Kb;
import com.alibaba.wireless.aliprivacyext.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.orange.OrangeConfig;
import com.ut.mini.UTAnalytics;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import tb.cfz;
import tb.cgf;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String d = "RecommendModuleCore";

    /* renamed from: a  reason: collision with root package name */
    private Context f4249a;
    private Interceptor b;
    private String c;

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4250a;

        static {
            int[] iArr = new int[LoginAction.values().length];
            f4250a = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4250a[LoginAction.NOTIFY_LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LoginAction valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || (valueOf = LoginAction.valueOf(intent.getAction())) == null) {
            } else {
                com.alibaba.wireless.aliprivacy.c.a(c.d, "login action:" + valueOf.toString());
                int i = a.f4250a[valueOf.ordinal()];
                if (i == 1) {
                    c.this.a(Login.getUserId(), "loginSucces");
                } else if (i != 2) {
                } else {
                    c.this.d();
                }
            }
        }
    }

    /* renamed from: com.alibaba.wireless.aliprivacyext.recommendation.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0161c implements com.alibaba.wireless.aliprivacyext.recommendation.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.alibaba.wireless.aliprivacyext.recommendation.d f4252a;
        public final /* synthetic */ boolean b;

        public C0161c(com.alibaba.wireless.aliprivacyext.recommendation.d dVar, boolean z) {
            this.f4252a = dVar;
            this.b = z;
        }

        @Override // com.alibaba.wireless.aliprivacyext.recommendation.d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.f4252a == null) {
            } else {
                c.a(c.this, this.b);
                this.f4252a.a();
            }
        }

        @Override // com.alibaba.wireless.aliprivacyext.recommendation.d
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            com.alibaba.wireless.aliprivacyext.recommendation.d dVar = this.f4252a;
            if (dVar == null) {
                return;
            }
            dVar.a(str);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements com.alibaba.wireless.aliprivacyext.http.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4253a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ com.alibaba.wireless.aliprivacyext.recommendation.d c;

        public d(String str, boolean z, com.alibaba.wireless.aliprivacyext.recommendation.d dVar) {
            this.f4253a = str;
            this.b = z;
            this.c = dVar;
        }

        @Override // com.alibaba.wireless.aliprivacyext.http.a
        public void a(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd69ac9f", new Object[]{this, aVar});
                return;
            }
            cfz.a(c.a(c.this), this.f4253a, this.b);
            c.a(c.this, this.c);
        }

        @Override // com.alibaba.wireless.aliprivacyext.http.a
        public void b(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0f930e0", new Object[]{this, aVar});
            } else {
                c.a(c.this, this.c, aVar != null ? aVar.getRetMsg() : com.alibaba.wireless.aliprivacyext.jsbridge.a.d);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements com.alibaba.wireless.aliprivacyext.http.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.alibaba.wireless.aliprivacyext.http.a
        public void a(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd69ac9f", new Object[]{this, aVar});
                return;
            }
            c.b(c.this);
            c.c(c.this);
        }

        @Override // com.alibaba.wireless.aliprivacyext.http.a
        public void b(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0f930e0", new Object[]{this, aVar});
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f implements com.alibaba.wireless.aliprivacyext.http.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.alibaba.wireless.aliprivacyext.http.a
        public void a(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd69ac9f", new Object[]{this, aVar});
                return;
            }
            JSONObject a2 = com.alibaba.wireless.aliprivacyext.f.a(aVar.getData());
            if (a2 == null) {
                return;
            }
            boolean b = c.b(c.this, a2.getBoolean("result").booleanValue());
            com.alibaba.wireless.aliprivacy.c.a(c.d, "status:" + b);
            c.a(c.this, b);
            c.a(c.this, b, false, (com.alibaba.wireless.aliprivacyext.recommendation.d) null);
        }

        @Override // com.alibaba.wireless.aliprivacyext.http.a
        public void b(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0f930e0", new Object[]{this, aVar});
            }
        }
    }

    /* loaded from: classes3.dex */
    public class g implements Interceptor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f4256a;
        public final /* synthetic */ Context b;

        public g(List list, Context context) {
            this.f4256a = list;
            this.b = context;
        }

        @Override // anetwork.channel.interceptor.Interceptor
        public Future<?> intercept(Interceptor.Chain chain) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Future) ipChange.ipc$dispatch("793d1164", new Object[]{this, chain});
            }
            Request request = chain.request();
            Callback callback = chain.callback();
            try {
                URL url = request.getUrl();
                if (url == null || this.f4256a == null || this.f4256a.size() == 0) {
                    return chain.proceed(request, callback);
                }
                String path = url.getPath();
                if (path == null || path.contains("mtop.dsm.compliance.external.privacy.log.put")) {
                    return chain.proceed(request, callback);
                }
                String replace = path.replace("/", ".");
                Iterator it = this.f4256a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.alibaba.wireless.aliprivacyext.model.a aVar = (com.alibaba.wireless.aliprivacyext.model.a) it.next();
                    if (replace.contains(aVar.api)) {
                        com.alibaba.wireless.aliprivacyext.recommendation.e a2 = c.this.a("AliPrivacySDK");
                        Request.Builder newBuilder = chain.request().newBuilder();
                        if (!a2.getRecommendSwitchBooleanStatus()) {
                            newBuilder = newBuilder.addHeader("x-recommend-content-close", "true");
                        }
                        if (com.alibaba.wireless.aliprivacyext.recommendation.a.b(this.b)) {
                            newBuilder = newBuilder.addHeader("cro-privacy-recommend-switch-without-uid", String.valueOf(com.alibaba.wireless.aliprivacyext.recommendation.a.a(this.b)));
                        }
                        request = newBuilder.addHeader("cro-privacy-recommend-switch", a2.getStatus()).build();
                        c.a(c.this, this.b, a2, aVar);
                    }
                }
                return chain.proceed(request, callback);
            } catch (Throwable th) {
                com.alibaba.wireless.aliprivacy.c.b(c.d, "init error", th);
                return chain.proceed(request, callback);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class h implements com.taobao.orange.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f4257a;

        public h(Context context) {
            this.f4257a = context;
        }

        @Override // com.taobao.orange.d
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            com.alibaba.wireless.aliprivacy.c.a(c.d, "onConfigUpdate:namespace:" + str);
            c.a(c.this, this.f4257a, str);
        }
    }

    /* loaded from: classes3.dex */
    public class i implements com.alibaba.wireless.aliprivacyext.http.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f4258a;
        public final /* synthetic */ com.alibaba.wireless.aliprivacyext.http.a b;

        public i(Context context, com.alibaba.wireless.aliprivacyext.http.a aVar) {
            this.f4258a = context;
            this.b = aVar;
        }

        @Override // com.alibaba.wireless.aliprivacyext.http.a
        public void a(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd69ac9f", new Object[]{this, aVar});
                return;
            }
            TrackLog.trackGetRecommendStatusFromServerEnd(this.f4258a, true, com.alibaba.wireless.aliprivacyext.f.a(aVar));
            com.alibaba.wireless.aliprivacyext.http.a aVar2 = this.b;
            if (aVar2 == null) {
                return;
            }
            aVar2.a(aVar);
        }

        @Override // com.alibaba.wireless.aliprivacyext.http.a
        public void b(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0f930e0", new Object[]{this, aVar});
                return;
            }
            TrackLog.trackGetRecommendStatusFromServerEnd(this.f4258a, false, com.alibaba.wireless.aliprivacyext.f.a(aVar));
            com.alibaba.wireless.aliprivacyext.http.a aVar2 = this.b;
            if (aVar2 == null) {
                return;
            }
            aVar2.b(aVar);
        }
    }

    /* loaded from: classes3.dex */
    public class j implements com.alibaba.wireless.aliprivacyext.http.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f4259a;
        public final /* synthetic */ String b;
        public final /* synthetic */ com.alibaba.wireless.aliprivacyext.http.a c;

        public j(Context context, String str, com.alibaba.wireless.aliprivacyext.http.a aVar) {
            this.f4259a = context;
            this.b = str;
            this.c = aVar;
        }

        @Override // com.alibaba.wireless.aliprivacyext.http.a
        public void a(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd69ac9f", new Object[]{this, aVar});
                return;
            }
            TrackLog.trackUpdateRecommendStatusEnd(this.f4259a, true, com.alibaba.wireless.aliprivacyext.f.a(aVar), this.b);
            com.alibaba.wireless.aliprivacyext.http.a aVar2 = this.c;
            if (aVar2 == null) {
                return;
            }
            aVar2.a(aVar);
        }

        @Override // com.alibaba.wireless.aliprivacyext.http.a
        public void b(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0f930e0", new Object[]{this, aVar});
                return;
            }
            TrackLog.trackUpdateRecommendStatusEnd(this.f4259a, false, com.alibaba.wireless.aliprivacyext.f.a(aVar), this.b);
            com.alibaba.wireless.aliprivacyext.http.a aVar2 = this.c;
            if (aVar2 == null) {
                return;
            }
            aVar2.b(aVar);
        }
    }

    /* loaded from: classes3.dex */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        public static c f4260a = new c(null);
    }

    public /* synthetic */ c(b bVar) {
        this();
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("e0781b04", new Object[0]) : k.f4260a;
    }

    public static /* synthetic */ void a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed936ad0", new Object[]{cVar, new Boolean(z)});
        } else {
            cVar.a(z);
        }
    }

    public static Context b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[0]) : a().f4249a;
    }

    public static /* synthetic */ void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce656fa3", new Object[]{cVar});
        } else {
            cVar.i();
        }
    }

    public static /* synthetic */ void c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5286c2", new Object[]{cVar});
        } else {
            cVar.j();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            LoginBroadcastHelper.registerLoginReceiver(this.f4249a, new b());
        } catch (Throwable th) {
            com.alibaba.wireless.aliprivacy.c.b(d, "registerLoginListener", th);
        }
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : cfz.a(this.f4249a);
    }

    private com.alibaba.wireless.aliprivacyext.recommendation.e g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.wireless.aliprivacyext.recommendation.e) ipChange.ipc$dispatch("c1f05148", new Object[]{this});
        }
        if (!f()) {
            return com.alibaba.wireless.aliprivacyext.recommendation.e.INVALID;
        }
        return cfz.c(this.f4249a) ? com.alibaba.wireless.aliprivacyext.recommendation.e.OPEN : com.alibaba.wireless.aliprivacyext.recommendation.e.CLOSE;
    }

    private com.alibaba.wireless.aliprivacyext.recommendation.e h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.wireless.aliprivacyext.recommendation.e) ipChange.ipc$dispatch("e7845a49", new Object[]{this});
        }
        String k2 = k();
        if (StringUtils.isEmpty(k2)) {
            return com.alibaba.wireless.aliprivacyext.recommendation.e.NO_UID;
        }
        if (!cfz.a(this.f4249a, k2)) {
            return com.alibaba.wireless.aliprivacyext.recommendation.e.INVALID;
        }
        return cfz.b(this.f4249a, k2) ? com.alibaba.wireless.aliprivacyext.recommendation.e.OPEN : com.alibaba.wireless.aliprivacyext.recommendation.e.CLOSE;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            cfz.c(this.f4249a, k());
        }
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        String b2 = cgf.b(this.f4249a);
        if (StringUtils.isEmpty(b2) || !"0".equals(b2)) {
            return false;
        }
        com.alibaba.wireless.aliprivacy.c.a(d, "syncSwitch:" + b2);
        return true;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            e();
            if (Login.checkSessionValid()) {
                a(Login.getUserId(), RVEnvironmentService.PLATFORM_TB);
            } else {
                d();
            }
        } catch (Throwable th) {
            com.alibaba.wireless.aliprivacy.c.b(d, "syncAndRegisterLoginReceiverForTB error", th);
        }
    }

    private c() {
    }

    public static /* synthetic */ void a(c cVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fca508e", new Object[]{cVar, context, str});
        } else {
            cVar.b(context, str);
        }
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else if (context == null) {
            Log.e(d, "processPrivacyProfile context is null ");
        } else {
            new com.alibaba.wireless.aliprivacyext.recommendation.b().a(context);
        }
    }

    public static /* synthetic */ boolean b(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fe493795", new Object[]{cVar, new Boolean(z)})).booleanValue() : cVar.b(z);
    }

    private String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this});
        }
        try {
            if (!StringUtils.isEmpty(this.c)) {
                return this.c;
            }
            if (Login.checkSessionValid()) {
                String userId = Login.getUserId();
                a(userId, "loginSdk");
                return userId;
            }
            String f2 = cfz.f(this.f4249a);
            a(f2, "cache");
            return f2;
        } catch (Throwable th) {
            com.alibaba.wireless.aliprivacy.c.a(d, "getCurrentLoginUserId error", th);
            return null;
        }
    }

    public static /* synthetic */ Context a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("fce46b7c", new Object[]{cVar}) : cVar.f4249a;
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            cfz.b(this.f4249a);
        }
    }

    public static /* synthetic */ void a(c cVar, com.alibaba.wireless.aliprivacyext.recommendation.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0a3a47", new Object[]{cVar, dVar});
        } else {
            cVar.a(dVar);
        }
    }

    private void b(boolean z, boolean z2, com.alibaba.wireless.aliprivacyext.recommendation.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0db07c2", new Object[]{this, new Boolean(z), new Boolean(z2), dVar});
            return;
        }
        String k2 = k();
        if (z2 && !l()) {
            a(this.f4249a, k2, z, new d(k2, z, dVar), "0");
            return;
        }
        cfz.a(this.f4249a, k2, z);
        a(dVar);
    }

    public static /* synthetic */ void a(c cVar, com.alibaba.wireless.aliprivacyext.recommendation.d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2b60051", new Object[]{cVar, dVar, str});
        } else {
            cVar.a(dVar, str);
        }
    }

    public static /* synthetic */ void a(c cVar, boolean z, boolean z2, com.alibaba.wireless.aliprivacyext.recommendation.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c2e0c7", new Object[]{cVar, new Boolean(z), new Boolean(z2), dVar});
        } else {
            cVar.b(z, z2, dVar);
        }
    }

    public static /* synthetic */ void a(c cVar, Context context, com.alibaba.wireless.aliprivacyext.recommendation.e eVar, com.alibaba.wireless.aliprivacyext.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22df2d62", new Object[]{cVar, context, eVar, aVar});
        } else {
            cVar.a(context, eVar, aVar);
        }
    }

    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else if (context == null) {
            com.alibaba.wireless.aliprivacy.c.a(d, "recommend module init fail,context is null");
        } else {
            this.f4249a = context;
            b(context);
            c(context);
            e();
            a(str, "init");
            com.alibaba.wireless.aliprivacy.c.a(d, "recommend module init success");
        }
    }

    public com.alibaba.wireless.aliprivacyext.recommendation.e a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.wireless.aliprivacyext.recommendation.e) ipChange.ipc$dispatch("e5208a0c", new Object[]{this, str});
        }
        if (this.f4249a == null) {
            com.alibaba.wireless.aliprivacy.c.a(d, "mContext is null");
            return com.alibaba.wireless.aliprivacyext.recommendation.e.INVALID;
        } else if (f()) {
            return g();
        } else {
            return h();
        }
    }

    private void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
            return;
        }
        OrangeConfig.getInstance().registerListener(new String[]{"aliprivacy_config_switch", "aliprivacy_config_mtop_api", "aliprivacy_config_scene_auth_api_v1"}, new h(context), false);
        OrangeConfig.getInstance().getCustomConfig("aliprivacy_config_scene_auth_api_v1", null);
        a(context);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        this.c = str;
        cfz.d(this.f4249a, str);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str)) {
            if (com.alibaba.wireless.aliprivacyext.recommendation.a.b(this.f4249a)) {
                a(com.alibaba.wireless.aliprivacyext.recommendation.a.a(this.f4249a));
            }
            com.alibaba.wireless.aliprivacy.c.a(d, "userId is null");
        } else if (str.equals(this.c)) {
            com.alibaba.wireless.aliprivacy.c.a(d, "userId is not changed");
        } else {
            com.alibaba.wireless.aliprivacy.c.a(d, "userId changed:" + str);
            com.alibaba.wireless.aliprivacy.c.a(d, "source:" + str2);
            b(str);
            if (f()) {
                boolean recommendSwitchBooleanStatus = g().getRecommendSwitchBooleanStatus();
                a(recommendSwitchBooleanStatus);
                a(this.f4249a, str, recommendSwitchBooleanStatus, new e(), "1");
                return;
            }
            a(this.f4249a, new f());
        }
    }

    public void a(boolean z, boolean z2, com.alibaba.wireless.aliprivacyext.recommendation.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dad73c63", new Object[]{this, new Boolean(z), new Boolean(z2), dVar});
            return;
        }
        C0161c c0161c = new C0161c(dVar, z);
        if (f()) {
            a(z, c0161c);
        } else {
            b(z, z2, c0161c);
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("_ut_ps_rec", z ? "1" : "0");
        } catch (Throwable unused) {
        }
    }

    private void a(boolean z, com.alibaba.wireless.aliprivacyext.recommendation.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de43c05f", new Object[]{this, new Boolean(z), dVar});
            return;
        }
        cfz.a(this.f4249a, z);
        a(dVar);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.c = null;
        cfz.e(this.f4249a);
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        Interceptor interceptor = this.b;
        if (interceptor != null) {
            InterceptorManager.removeInterceptor(interceptor);
        }
        g gVar = new g(d(context), context);
        this.b = gVar;
        InterceptorManager.addInterceptor(gVar);
    }

    private void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{this, context, str});
            return;
        }
        if ("aliprivacy_config_mtop_api".equals(str)) {
            String customConfig = OrangeConfig.getInstance().getCustomConfig("aliprivacy_config_mtop_api", null);
            cfz.e(this.f4249a, customConfig);
            a(this.f4249a);
            b(str, customConfig);
        }
        if ("aliprivacy_config_switch".equals(str)) {
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
            if (configs != null) {
                cfz.f(this.f4249a, configs.get("sync_switch"));
                cfz.g(this.f4249a, configs.get("downgrade_without_uid"));
                cfz.l(this.f4249a, configs.get("log_timeInterval"));
                cfz.m(this.f4249a, configs.get(Kb.k));
                cfz.n(this.f4249a, configs.get("log_cache_count"));
                cfz.h(this.f4249a, configs.get("recommend_entrance_name"));
                cfz.i(this.f4249a, configs.get("recommend_linked_h5_url"));
                cfz.j(this.f4249a, configs.get("recommend_ttid_list"));
                cfz.k(this.f4249a, configs.get("recommend_gray_scope"));
            }
            b(str, com.alibaba.wireless.aliprivacyext.f.a(configs));
        }
        if (!"aliprivacy_config_scene_auth_api_v1".equals(str)) {
            return;
        }
        String customConfig2 = OrangeConfig.getInstance().getCustomConfig("aliprivacy_config_scene_auth_api_v1", null);
        com.alibaba.wireless.aliprivacy.b.b(context, customConfig2);
        b(str, com.alibaba.wireless.aliprivacyext.f.a((Object) customConfig2));
    }

    private boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        com.alibaba.wireless.aliprivacy.c.a(d, "revertStatus");
        return !z;
    }

    private List<com.alibaba.wireless.aliprivacyext.model.a> d(Context context) {
        JSONArray b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6609696a", new Object[]{this, context});
        }
        try {
            String a2 = cgf.a(context);
            if (a2 == null || (b2 = com.alibaba.wireless.aliprivacyext.f.b(a2)) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(b2.size());
            for (int i2 = 0; i2 < b2.size(); i2++) {
                JSONObject jSONObject = b2.getJSONObject(i2);
                com.alibaba.wireless.aliprivacyext.model.a aVar = new com.alibaba.wireless.aliprivacyext.model.a();
                String string = jSONObject.getString("api");
                String string2 = jSONObject.getString("fromSource");
                if (!StringUtils.isEmpty(string) && !StringUtils.isEmpty(string2)) {
                    aVar.api = string;
                    aVar.fromSource = string2;
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            com.alibaba.wireless.aliprivacy.c.b(d, "getMTopApiList error", th);
            return null;
        }
    }

    private void a(Context context, com.alibaba.wireless.aliprivacyext.recommendation.e eVar, com.alibaba.wireless.aliprivacyext.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9006bc46", new Object[]{this, context, eVar, aVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("apiName", aVar.api);
        TrackLog.trackQueryRecommendStatusLog(context, eVar.getStatus(), "MTop", aVar.fromSource, com.alibaba.wireless.aliprivacyext.f.a(hashMap));
    }

    private void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        com.alibaba.wireless.aliprivacy.c.a(d, str + ":" + str2);
        TrackLog.trackOrangeConfigUpdate(str, str2);
    }

    private void a(Context context, com.alibaba.wireless.aliprivacyext.http.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ce4c9f", new Object[]{this, context, aVar});
        } else if (l()) {
            aVar.b(null);
        } else {
            TrackLog.trackGetRecommendStatusFromServerStart(context, l());
            i iVar = new i(context, aVar);
            com.alibaba.wireless.aliprivacyext.http.model.request.b bVar = new com.alibaba.wireless.aliprivacyext.http.model.request.b();
            bVar.source = "AliPrivacySDK";
            bVar.code = "CLOSE_PERSONALIZED_RECOMMENDATION";
            com.alibaba.wireless.aliprivacyext.http.b.a(context, bVar, iVar);
        }
    }

    private void a(Context context, String str, boolean z, com.alibaba.wireless.aliprivacyext.http.a aVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdc9b5f", new Object[]{this, context, str, new Boolean(z), aVar, str2});
            return;
        }
        boolean b2 = b(z);
        if (l()) {
            aVar.b(null);
        } else if (StringUtils.isEmpty(str)) {
            aVar.b(null);
        } else {
            TrackLog.trackUpdateRecommendStatusStart(context, l(), z, str2);
            j jVar = new j(context, str2, aVar);
            com.alibaba.wireless.aliprivacyext.http.model.request.c cVar = new com.alibaba.wireless.aliprivacyext.http.model.request.c();
            cVar.value = b2;
            cVar.code = "CLOSE_PERSONALIZED_RECOMMENDATION";
            com.alibaba.wireless.aliprivacyext.http.b.a(context, cVar, jVar);
        }
    }

    private void a(com.alibaba.wireless.aliprivacyext.recommendation.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4178cce3", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            dVar.a();
        }
    }

    private void a(com.alibaba.wireless.aliprivacyext.recommendation.d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a37a3ed", new Object[]{this, dVar, str});
        } else if (dVar == null) {
        } else {
            dVar.a(str);
        }
    }
}
