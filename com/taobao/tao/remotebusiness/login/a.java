package com.taobao.tao.remotebusiness.login;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.media.ExifInterface;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ucp.util.LoginBroadcastReceiver;
import com.taobao.login4android.constants.LoginConstants;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.stat.IUploadStats;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import tb.kge;

/* loaded from: classes.dex */
public abstract class a implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Context b;
    private static ThreadLocal<C0878a> c;
    private static volatile AtomicBoolean p;
    private Class<?> d;
    private Class<?> e;
    private Class<?> f;
    private Method g;
    private Method h;
    private Method i;
    private Method j;
    private Method k;
    private Method l;
    private Method m;
    private Mtop o;
    private e n = new e();

    /* renamed from: a */
    public BroadcastReceiver f21032a = null;

    public static /* synthetic */ AtomicBoolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("49f1dfa8", new Object[0]) : p;
    }

    public static /* synthetic */ Mtop a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Mtop) ipChange.ipc$dispatch("1f2d7c68", new Object[]{aVar}) : aVar.o;
    }

    static {
        kge.a(1706987872);
        kge.a(-960100151);
        c = new ThreadLocal<>();
        p = new AtomicBoolean(false);
    }

    public a(Context context, Mtop mtop) throws ClassNotFoundException, NoSuchMethodException {
        try {
            this.d = Class.forName("com.taobao.login4android.api.Login");
        } catch (ClassNotFoundException unused) {
            this.d = Class.forName("com.taobao.login4android.Login");
        }
        this.g = this.d.getDeclaredMethod("login", Boolean.TYPE, Bundle.class);
        this.h = this.d.getDeclaredMethod("checkSessionValid", new Class[0]);
        this.j = this.d.getDeclaredMethod("getSid", new Class[0]);
        this.k = this.d.getDeclaredMethod("getUserId", new Class[0]);
        this.l = this.d.getDeclaredMethod("getNick", new Class[0]);
        this.f = Class.forName("com.taobao.login4android.constants.LoginStatus");
        this.i = this.f.getDeclaredMethod("isLogining", new Class[0]);
        this.e = Class.forName("com.taobao.login4android.broadcast.LoginBroadcastHelper");
        this.m = this.e.getMethod("registerLoginReceiver", Context.class, BroadcastReceiver.class);
        if (mtop != null && this.o == null) {
            this.o = mtop;
        }
        if (context != null && b == null) {
            b = context;
        }
        b();
        TBSdkLog.e("mtopsdk.AbsRemoteLogin", "register login event receiver");
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f21032a != null) {
        } else {
            if (b == null) {
                TBSdkLog.e("mtopsdk.AbsRemoteLogin", "[registerReceiver]Context is null, register receiver fail.");
                return;
            }
            synchronized (b.class) {
                if (this.f21032a == null) {
                    this.f21032a = new BroadcastReceiver() { // from class: com.taobao.tao.remotebusiness.login.AbsRemoteLogin$1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context, Intent intent) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                            } else if (intent == null) {
                            } else {
                                String action = intent.getAction();
                                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                                    TBSdkLog.e("mtopsdk.AbsRemoteLogin", "[onReceive]Login Broadcast Received. action=" + action);
                                }
                                char c2 = 65535;
                                int hashCode = action.hashCode();
                                if (hashCode != -1186442906) {
                                    if (hashCode != -1100695767) {
                                        if (hashCode == -542410121 && action.equals(LoginBroadcastReceiver.NOTIFY_LOGIN_SUCCESS)) {
                                            c2 = 0;
                                        }
                                    } else if (action.equals("NOTIFY_LOGIN_FAILED")) {
                                        c2 = 1;
                                    }
                                } else if (action.equals("NOTIFY_LOGIN_CANCEL")) {
                                    c2 = 2;
                                }
                                if (c2 == 0) {
                                    f.a(a.a(a.this) == null ? Mtop.instance(null) : a.a(a.this), null).a();
                                } else if (c2 == 1) {
                                    f.a(a.a(a.this) == null ? Mtop.instance(null) : a.a(a.this), null).b();
                                } else if (c2 != 2) {
                                } else {
                                    f.a(a.a(a.this) == null ? Mtop.instance(null) : a.a(a.this), null).c();
                                }
                            }
                        }
                    };
                    a(this.m, b, this.f21032a);
                }
            }
        }
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (obj instanceof MtopResponse) {
            c.set(new C0878a((MtopResponse) obj, (String) a(this.l, new Object[0])));
        } else if (obj instanceof MtopRequest) {
            c.set(new C0878a((MtopRequest) obj));
        } else if (!(obj instanceof MtopBuilder)) {
        } else {
            c.set(new C0878a(((MtopBuilder) obj).request, true));
        }
    }

    private <T> T a(Method method, Object... objArr) {
        if (method != null) {
            try {
                return (T) method.invoke(this.d, objArr);
            } catch (Exception e) {
                TBSdkLog.e("mtopsdk.AbsRemoteLogin", "[invokeMethod]invokeMethod error,method:" + method + ",args:" + objArr, e);
                return null;
            }
        }
        return null;
    }

    @Override // com.taobao.tao.remotebusiness.login.c
    public void login(i iVar, boolean z) {
        Bundle bundle;
        Exception e;
        final IUploadStats iUploadStats;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("978d321d", new Object[]{this, iVar, new Boolean(z)});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
            TBSdkLog.e("mtopsdk.AbsRemoteLogin", "[login]call login,showLoginUI:" + z + " , listener:" + iVar);
        }
        final C0878a c0878a = c.get();
        if (c0878a != null) {
            try {
                try {
                    bundle = new Bundle();
                    try {
                        String a2 = c0878a.a();
                        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                            TBSdkLog.e("mtopsdk.AbsRemoteLogin", "[login]apiRefer=" + a2);
                        }
                        bundle.putString("apiReferer", a2);
                        iUploadStats = Mtop.instance(b).getMtopConfig().uploadStats;
                    } catch (Exception e2) {
                        e = e2;
                        TBSdkLog.e("mtopsdk.AbsRemoteLogin", "[login]  login extra bundle error.", e);
                        b();
                        a(this.g, Boolean.valueOf(z), bundle);
                    }
                } finally {
                    c.remove();
                }
            } catch (Exception e3) {
                bundle = null;
                e = e3;
            }
            if (iUploadStats == null) {
                return;
            }
            MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: com.taobao.tao.remotebusiness.login.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (a.a().compareAndSet(false, true)) {
                            HashSet hashSet = new HashSet();
                            hashSet.add("long_nick");
                            hashSet.add("apiName");
                            hashSet.add("apiV");
                            hashSet.add("msgCode");
                            hashSet.add("S_STATUS");
                            hashSet.add("processName");
                            hashSet.add("appBackGround");
                            if (iUploadStats != null) {
                                iUploadStats.onRegister("mtoprb", "SessionInvalid", hashSet, null, false);
                            }
                            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                                TBSdkLog.e("mtopsdk.AbsRemoteLogin", "onRegister called. module=mtoprb,monitorPoint=SessionInvalid");
                            }
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("long_nick", c0878a.b);
                        hashMap.put("apiName", c0878a.c);
                        hashMap.put("apiV", c0878a.d);
                        hashMap.put("msgCode", c0878a.e);
                        hashMap.put("S_STATUS", c0878a.f);
                        hashMap.put("processName", c0878a.g);
                        hashMap.put("appBackGround", c0878a.h ? "1" : "0");
                        if (iUploadStats == null) {
                            return;
                        }
                        iUploadStats.onCommit("mtoprb", "SessionInvalid", hashMap, null);
                    } catch (Exception e4) {
                        TBSdkLog.e("mtopsdk.AbsRemoteLogin", "upload  SessionInvalid Stats error.", e4);
                    }
                }
            });
        } else {
            bundle = null;
        }
        b();
        a(this.g, Boolean.valueOf(z), bundle);
    }

    @Override // com.taobao.tao.remotebusiness.login.c
    public boolean isSessionValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f14699db", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) a(this.h, new Object[0]);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.taobao.tao.remotebusiness.login.c
    public boolean isLogining() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0fde62e", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) a(this.i, new Object[0]);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.taobao.tao.remotebusiness.login.c
    public e getLoginContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("45c557e", new Object[]{this});
        }
        this.n.f21035a = (String) a(this.j, new Object[0]);
        this.n.b = (String) a(this.k, new Object[0]);
        this.n.c = (String) a(this.l, new Object[0]);
        return this.n;
    }

    /* renamed from: com.taobao.tao.remotebusiness.login.a$a */
    /* loaded from: classes8.dex */
    public static class C0878a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public String f21034a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public boolean h;

        static {
            kge.a(1154213685);
        }

        public C0878a(MtopResponse mtopResponse, String str) {
            this.f21034a = LoginConstants.EVENT_SESSION_INVALID;
            this.b = str;
            this.c = mtopResponse.getApi();
            this.d = mtopResponse.getV();
            this.e = mtopResponse.getRetCode();
            this.f = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), ExifInterface.LATITUDE_SOUTH);
            this.g = MtopUtils.getCurrentProcessName(a.b);
            this.h = mtopsdk.xstate.a.b();
        }

        public C0878a(MtopRequest mtopRequest) {
            this(mtopRequest, false);
        }

        public C0878a(MtopRequest mtopRequest, boolean z) {
            this.f21034a = z ? "BX_RETRY" : "REQUEST_NEED_LOGIN";
            this.c = mtopRequest.getApiName();
            this.d = mtopRequest.getVersion();
            this.g = MtopUtils.getCurrentProcessName(a.b);
            this.h = mtopsdk.xstate.a.b();
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eventName", (Object) this.f21034a);
            jSONObject.put("apiName", (Object) this.c);
            jSONObject.put("v", (Object) this.d);
            jSONObject.put("processName", (Object) this.g);
            jSONObject.put("appBackGround", (Object) Boolean.valueOf(this.h));
            if (!TextUtils.isEmpty(this.b)) {
                jSONObject.put("long_nick", (Object) this.b);
            }
            if (!TextUtils.isEmpty(this.e)) {
                jSONObject.put("msgCode", (Object) this.e);
            }
            if (!TextUtils.isEmpty(this.f)) {
                jSONObject.put("S_STATUS", (Object) this.f);
            }
            return jSONObject.toJSONString();
        }
    }
}
