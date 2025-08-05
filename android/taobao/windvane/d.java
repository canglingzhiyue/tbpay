package android.taobao.windvane;

import android.content.Context;
import android.taobao.windvane.config.f;
import android.taobao.windvane.config.h;
import android.taobao.windvane.config.i;
import android.taobao.windvane.config.j;
import android.taobao.windvane.extra.InitWVParamsTask;
import android.taobao.windvane.extra.WVIAdapter;
import android.taobao.windvane.extra.WVSchemeProcessor;
import android.taobao.windvane.extra.config.TBConfigManager;
import android.taobao.windvane.extra.jsbridge.TBJsApiManager;
import android.taobao.windvane.extra.uc.WVUCPrecacheManager;
import android.taobao.windvane.extra.uc.pool.WebViewPool;
import android.taobao.windvane.monitor.WVLocPerformanceMonitor;
import android.taobao.windvane.monitor.o;
import android.taobao.windvane.util.e;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.ProcessInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.application.common.a;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.t;
import com.uc.webview.export.multiprocess.PreStartup;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.aea;
import tb.aej;
import tb.aek;
import tb.ael;
import tb.aem;
import tb.kge;

/* loaded from: classes2.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WindVaneSDKForTB";
    public static final String[] TB_UC_SDK_APP_KEY_SEC;

    /* renamed from: a  reason: collision with root package name */
    public static WVIAdapter f1580a;
    private static boolean b;
    private static AtomicBoolean c;

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        b = z;
        return z;
    }

    static {
        kge.a(-496250709);
        b = false;
        c = new AtomicBoolean(false);
        TB_UC_SDK_APP_KEY_SEC = new String[]{"YKIXAXN/9v6Tez0oeIRx9ilCfTkSFozXf+nmGRTPG7ruP1KycnZL8vCcjyaMMGajricmE9blrBlr\nO+HGrJUsuw==\n", "RjpgSKj6piHyametkuIC/9mWn1DKkVntRLhh4mOYlf6/g/wO1kioAHE7weTqAdqn05FXCu0dJU+p6pKC6I+k8w=="};
        f1580a = null;
    }

    public static void a(Context context, String str, int i, h hVar, HashMap<String, Object> hashMap) {
        String c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("242c374a", new Object[]{context, str, new Integer(i), hVar, hashMap});
        } else if (t.b(context.getApplicationContext())) {
            TMSLogger.d("TMSEarlyInitializer", "skip WindVaneSDKForTB");
        } else {
            if (ABGlobal.isFeatureOpened(context, "OptInitWindVane")) {
                c2 = (String) hashMap.get("process");
            } else {
                c2 = android.taobao.windvane.util.a.c(context);
            }
            if (TextUtils.isEmpty(c2) || c2.endsWith("sandboxed_process0") || c2.endsWith("sandboxed_privilege_process0") || c2.endsWith(ProcessInfo.ALIAS_GPU_PROCESS)) {
                return;
            }
            if (c.compareAndSet(false, true)) {
                long currentTimeMillis = System.currentTimeMillis();
                if (hVar.i == null) {
                    hVar.i = TB_UC_SDK_APP_KEY_SEC;
                }
                if (ABGlobal.isFeatureOpened(context, "OptInitWvParam") || InitWVParamsTask.isInitWVParamOpenV2(context)) {
                    try {
                        if (j.commonConfig.as) {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            PreStartup.startup(context);
                            m.e(TAG, "opt useTime PreStartup " + (System.currentTimeMillis() - currentTimeMillis2));
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                WVUCPrecacheManager.getInstance();
                f fVar = new f();
                fVar.f1557a = "windvane";
                fVar.b = "vKFaqtcEUEHI15lIOzsI6jIQldPpaCZ3";
                fVar.e = 1;
                fVar.d = 1;
                fVar.c = e.b();
                hVar.j = fVar;
                if (!i.a().b()) {
                    i.a().a(hVar);
                    android.taobao.windvane.config.a.a().a(hVar);
                }
                TBConfigManager.getInstance().initEarly(context);
                WindVaneSDK.init(context, str, i, hVar);
                TBConfigManager.getInstance().initConfig();
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                aea.getInstance().init(context, true);
                android.taobao.windvane.jsbridge.api.c.a();
                android.taobao.windvane.monitor.i.init();
                TBJsApiManager.initJsApi();
                if (e.a()) {
                    aem.a().a(WVLocPerformanceMonitor.getInstance(), aem.c);
                    aem.a().a(3009);
                }
                android.taobao.windvane.webview.j.a(new WVSchemeProcessor());
                try {
                    aem.a().a(new a(context), aem.f25291a);
                    final com.taobao.application.common.d a2 = com.taobao.application.common.c.a();
                    com.taobao.application.common.c.a(new a.b() { // from class: android.taobao.windvane.d.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.application.common.IApmEventListener
                        public void onEvent(int i2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i2)});
                                return;
                            }
                            d.a(com.taobao.application.common.d.this.a("isInBackground", false));
                            boolean z = o.getPackageMonitorInterface() != null;
                            if (i2 == 2) {
                                long currentTimeMillis4 = System.currentTimeMillis();
                                m.c(d.TAG, "app active at time : " + currentTimeMillis4);
                                android.taobao.windvane.config.a.b = false;
                                if (z && o.getPackageMonitorInterface() != null) {
                                    o.getPackageMonitorInterface().uploadStartAppTime(currentTimeMillis4);
                                }
                            }
                            if (i2 != 1) {
                                return;
                            }
                            long currentTimeMillis5 = System.currentTimeMillis();
                            m.c(d.TAG, "app background at time : " + currentTimeMillis5);
                            android.taobao.windvane.config.a.b = true;
                            if (!z || o.getPackageMonitorInterface() == null) {
                                return;
                            }
                            o.getPackageMonitorInterface().uploadBackgroundTime(currentTimeMillis5);
                        }
                    });
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                android.taobao.windvane.monitor.a.commitWVInitTime(currentTimeMillis3, System.currentTimeMillis() - currentTimeMillis);
                WebViewPool.setUp(context);
                return;
            }
            m.e("InitWindVane", "windvane has already initiated");
        }
    }

    /* loaded from: classes2.dex */
    public static class a implements aek {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f1582a;

        static {
            kge.a(799542907);
            kge.a(1845411121);
        }

        public a(Context context) {
            this.f1582a = context;
        }

        @Override // tb.aek
        public ael onEvent(int i, aej aejVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, objArr});
            }
            ael aelVar = new ael(false);
            if (i == 7001) {
                m.c("WVConfigManager", "receive orange register");
                TBConfigManager.getInstance().initAfterAWP(this.f1582a);
                aem.a().b(this);
            }
            return aelVar;
        }
    }
}
