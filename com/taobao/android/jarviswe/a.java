package com.taobao.android.jarviswe;

import android.content.Context;
import android.content.Intent;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.jarviswe.jsbridge.LoadTaskPlugin;
import com.taobao.android.jarviswe.tracker.d;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.DAICallback;
import com.tmall.android.dai.DAIError;
import com.tmall.android.dai.internal.util.LogUtil;
import com.tmall.android.dai.internal.util.h;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import tb.gsd;
import tb.gse;
import tb.gsf;
import tb.kaw;
import tb.kge;
import tb.rkq;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_INITIALIZE_COMPLETE = "com.taobao.android.jarviswe.intent.action.INITIALIZE_COMPLETE";

    /* renamed from: a  reason: collision with root package name */
    private static a f12963a;
    private String c;
    private Context d;
    private volatile boolean b = false;
    private volatile boolean e = false;

    static {
        kge.a(-1784772400);
    }

    public static /* synthetic */ Context a(a aVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("2e25655f", new Object[]{aVar, context});
        }
        aVar.d = context;
        return context;
    }

    public static /* synthetic */ String a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72cd1cf5", new Object[]{aVar, str});
        }
        aVar.c = str;
        return str;
    }

    public static /* synthetic */ boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3507c385", new Object[]{aVar})).booleanValue() : aVar.b;
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bf15f77", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.b = z;
        return z;
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a946fbe0", new Object[]{aVar});
        } else {
            aVar.g();
        }
    }

    public static /* synthetic */ void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d86343f", new Object[]{aVar});
        } else {
            aVar.e();
        }
    }

    public static /* synthetic */ void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c56c9e", new Object[]{aVar});
        } else {
            aVar.f();
        }
    }

    private a() {
    }

    public static synchronized a a() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("90782901", new Object[0]);
            }
            if (f12963a == null) {
                f12963a = new a();
            }
            return f12963a;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            q.a(LoadTaskPlugin.API_NAME, (Class<? extends e>) LoadTaskPlugin.class, true);
        } catch (Throwable th) {
            LogUtil.e("JarvisEngine", "init engine failed " + th.getMessage());
        }
    }

    public synchronized void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        final String a2 = h.a(context);
        d().execute(new Runnable() { // from class: com.taobao.android.jarviswe.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    a.a(a.this, a2);
                    if (a.a(a.this)) {
                        return;
                    }
                    a.a(a.this, context);
                    if (gsf.a()) {
                        try {
                            kaw.a().a(context);
                        } catch (Throwable unused) {
                        }
                    }
                    a.b(a.this);
                    a.a(a.this, true);
                    q.a(LoadTaskPlugin.API_NAME, (Class<? extends e>) LoadTaskPlugin.class, true);
                    a.c(a.this);
                } catch (Exception e) {
                    LogUtil.e("JarvisEngine", "launchByBroadCast engine failed " + e.getMessage());
                }
            }
        });
    }

    public void a(String str, final String str2, Map<String, Object> map, final gse gseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85fd9860", new Object[]{this, str, str2, map, gseVar});
            return;
        }
        System.currentTimeMillis();
        DAI.runComputeByAliasWithTriId(str + "#" + str2, map, new DAICallback() { // from class: com.taobao.android.jarviswe.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.tmall.android.dai.DAICallback
            public void onSuccess(Object... objArr) {
                gse gseVar2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f85dc9a6", new Object[]{this, objArr});
                    return;
                }
                String str3 = null;
                if (objArr != null) {
                    try {
                        if (objArr.length > 0 && (objArr[0] instanceof Map)) {
                            Object obj = ((Map) objArr[0]).get("result");
                            if ((obj instanceof String) || (obj instanceof JSON)) {
                                if (gseVar != null) {
                                    gseVar.notify(str2, obj.toString());
                                }
                                if (gseVar2 == null || str3 == null) {
                                }
                                gseVar2.errorReport(str2, "Jarvis Callback Error", str3);
                                return;
                            }
                        }
                    } catch (Exception e) {
                        String message = e.getMessage();
                        if (gseVar2 == null || message == null) {
                            return;
                        }
                        gseVar2.errorReport(str2, "Jarvis Callback Error", message);
                        return;
                    } finally {
                        gseVar2 = gseVar;
                    }
                }
                str3 = "TYPE_ERROR";
                if (gseVar2 == null) {
                }
            }

            @Override // com.tmall.android.dai.DAICallback
            public void onError(DAIError dAIError) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("326e086b", new Object[]{this, dAIError});
                } else if (dAIError == null) {
                } else {
                    String dAIError2 = dAIError.toString();
                    gse gseVar2 = gseVar;
                    if (gseVar2 == null) {
                        return;
                    }
                    gseVar2.errorReport(str2, "Walle Model Run Error", dAIError2);
                }
            }
        }, null);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            Intent intent = new Intent(ACTION_INITIALIZE_COMPLETE);
            intent.setPackage(rkq.d().e().getPackageName());
            rkq.d().e().sendBroadcast(intent);
        } catch (Throwable th) {
            LogUtil.e("JarvisEngine", th.getMessage(), th);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.taobao.android.jarviswe.jsbridge.a.a().b();
        if (this.e) {
            return;
        }
        new Timer().schedule(new TimerTask() { // from class: com.taobao.android.jarviswe.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.this.d().execute(new Runnable() { // from class: com.taobao.android.jarviswe.a.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                d.a().a((d.a) null);
                            }
                        }
                    });
                }
            }
        }, 1000L);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"jarvis_scenes_v3"}, new g() { // from class: com.taobao.android.jarviswe.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.g
                public void onConfigUpdate(String str, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                    } else {
                        a.this.d().execute(new Runnable() { // from class: com.taobao.android.jarviswe.a.4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                try {
                                    gsd.a().b();
                                    a.d(a.this);
                                } catch (Exception e) {
                                    LogUtil.e("JarvisEngine", "loadScenesV3 reCheckPkgInfo error", e);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public Executor d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Executor) ipChange.ipc$dispatch("f6cee4b1", new Object[]{this}) : com.tmall.android.dai.internal.util.b.b().a();
    }
}
