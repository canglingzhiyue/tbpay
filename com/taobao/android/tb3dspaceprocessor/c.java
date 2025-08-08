package com.taobao.android.tb3dspaceprocessor;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.android.split.core.splitinstall.m;
import com.alibaba.android.split.core.splitinstall.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import com.taobao.android.nav.Nav;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.log.TLog;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class c implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEATURE = "TB3DSpace";

    /* renamed from: a  reason: collision with root package name */
    public static o f15327a = null;
    private static int c = -1;
    private final Handler b = new Handler(Looper.getMainLooper());
    private Handler d = new Handler(Looper.getMainLooper());

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "tb3dspaceprocessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        c = i;
        return i;
    }

    public static /* synthetic */ int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : c;
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        Uri data;
        String str;
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (intent == null || dVar == null || (data = intent.getData()) == null) {
            return true;
        }
        try {
            str = data.getQueryParameter("appUrl");
        } catch (Throwable th) {
            TLog.loge("3dprocessor", "TaoBaoLife", "process: geturlparameter illegal " + th);
            str = "";
        }
        try {
            z = "true".equals(data.getQueryParameter("forceinstallt3d"));
        } catch (Throwable th2) {
            TLog.loge("3dprocessor", "TaoBaoLife", "process: throwable" + th2);
            z = false;
        }
        try {
            z2 = "true".equals(data.getQueryParameter("isToH5"));
        } catch (Throwable th3) {
            Log.e("TaoBaoLife", "process: isToH5 " + th3);
            z2 = false;
        }
        if (StringUtils.isEmpty(str) || dVar.a() == null) {
            return true;
        }
        q.a("T3DNativeJSAPI", (Class<? extends android.taobao.windvane.jsbridge.e>) T3DNattiveJS.class);
        if (a()) {
            if (Globals.getApplication() == null) {
                return true;
            }
            if (z2) {
                Nav.from(dVar.a()).toUri(str);
                return false;
            }
            return a(dVar, str);
        }
        TLog.loge("3dprocessor", "TaoBaoLife", "process: bundle not install");
        if (z) {
            try {
                Nav.from(dVar.a()).toUri("https://go/installxrspace3d?appUrl=" + URLEncoder.encode(str, "UTF-8"));
                return false;
            } catch (UnsupportedEncodingException e) {
                String str2 = "onCreate: UnsupportedEncodingException" + e;
                return false;
            }
        }
        Nav.from(dVar.a()).toUri(str);
        this.d.postDelayed(new Runnable() { // from class: com.taobao.android.tb3dspaceprocessor.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    c.a((WVCallBackContext) null);
                } catch (Throwable unused) {
                }
            }
        }, 2000L);
        return false;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        String str = TaoPackageInfo.sTTID;
        String str2 = "process: channel id " + str;
        if ("212200".equals(str)) {
            Log.e("TaoBaoLife", "this is google play channel.");
            return true;
        }
        com.alibaba.android.split.core.splitinstall.g c2 = com.taobao.appbundle.c.Companion.a().c();
        if (c2 == null) {
            return true;
        }
        return b.a().c("TB3DSpace") != null && c2.a().contains("TB3DSpace");
    }

    public static synchronized void a(final WVCallBackContext wVCallBackContext) {
        synchronized (c.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca15efa5", new Object[]{wVCallBackContext});
                return;
            }
            f15327a = new o() { // from class: com.taobao.android.tb3dspaceprocessor.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.split.core.listener.b
                public /* synthetic */ void onStateUpdate(m mVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bd17bbbe", new Object[]{this, mVar});
                    } else {
                        a(mVar);
                    }
                }

                public void a(m mVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("398f1780", new Object[]{this, mVar});
                    } else if (mVar == null || mVar.a() != c.b()) {
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        int b = mVar.b();
                        if (b == 2 || b == 3 || b == 4) {
                            return;
                        }
                        if (b == 5) {
                            TLog.loge("3dprocessor", "TaoBaoLife", "Tb3DSpace INSTALLED");
                            c.a(null, "");
                            jSONObject.put("success", "true");
                            WVStandardEventCenter.postNotificationToJS("T3DNativeJSAPI", jSONObject.toString());
                        } else if (b != 6) {
                            if (b == 10) {
                            }
                        } else {
                            try {
                                jSONObject.put("success", "false");
                                WVStandardEventCenter.postNotificationToJS("T3DNativeJSAPI", jSONObject.toString());
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            };
            final com.alibaba.android.split.core.splitinstall.g c2 = com.taobao.appbundle.c.Companion.a().c();
            if (c2 == null) {
                return;
            }
            c2.a(f15327a);
            c2.a(j.a().a("TB3DSpace").a()).a(new com.alibaba.android.split.core.tasks.e<Integer>() { // from class: com.taobao.android.tb3dspaceprocessor.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.split.core.tasks.e
                public /* synthetic */ void onSuccess(Integer num) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, num});
                    } else {
                        a(num);
                    }
                }

                public void a(Integer num) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6cdec50f", new Object[]{this, num});
                        return;
                    }
                    c.a(num.intValue());
                    if (WVCallBackContext.this == null) {
                        return;
                    }
                    TLog.loge("3dprocessor", "TaoBaoLife", "addOnSuccessListener success ");
                    WVCallBackContext.this.success("start install..");
                }
            }).a(new com.alibaba.android.split.core.tasks.d() { // from class: com.taobao.android.tb3dspaceprocessor.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.split.core.tasks.d
                public void onFailure(Exception exc) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                    } else if (WVCallBackContext.this == null) {
                    } else {
                        TLog.loge("3dprocessor", "TaoBaoLife", "addOnSuccessListener fail ");
                        WVCallBackContext.this.error("start download add listener failed.");
                        c2.b(c.f15327a);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("success", "false");
                            WVStandardEventCenter.postNotificationToJS("T3DNativeJSAPI", jSONObject.toString());
                        } catch (Throwable unused) {
                        }
                    }
                }
            });
        }
    }

    public static boolean a(com.taobao.android.nav.d dVar, String str) {
        try {
            Class<?> cls = Class.forName("com.tmall.wireless.web3d.acennr.InitAceNNR");
            cls.getMethod("init", Application.class, Map.class).invoke(null, Globals.getApplication(), new HashMap());
            Boolean bool = (Boolean) cls.getMethod("isInit", new Class[0]).invoke(null, new Object[0]);
            if (bool == null || !bool.booleanValue()) {
                if (dVar != null) {
                    Nav.from(dVar.a()).toUri(str);
                }
                return false;
            }
            Class<?> cls2 = Class.forName("com.taobao.android.acennr.downloader.Downloader");
            Object invoke = cls2.getMethod("Instance", new Class[0]).invoke(null, new Object[0]);
            Method method = cls2.getMethod("registerImplement", Class.forName("com.taobao.android.acennr.downloader.IDownloader"));
            Class<?> cls3 = Class.forName("com.taobao.android.xr_resource.downloader.XRAceDownloader");
            method.invoke(invoke, cls3.getField("INSTANCE").get(cls3));
            if (dVar != null) {
                Nav.from(dVar.a()).toUri(str);
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            Log.e("TaoBaoLife", "process: method or class not found " + th);
            return false;
        }
    }
}
