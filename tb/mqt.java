package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.android.split.k;
import com.alibaba.android.split.t;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.DynamicFeatureInfo;
import com.android.tools.bundleInfo.b;
import com.google.android.gms.common.GoogleApiAvailability;
import com.taobao.android.address.f;
import com.taobao.appbundle.c;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.bho;

/* loaded from: classes4.dex */
public class mqt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DYNAMIC_NAME_TAOBAO_ANDROID_ADDRESS_DYNAMIC = "taobao_android_address_dynamic";
    public static final String DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC = "order_map";
    public static final String TAG = "DynamicUtils";

    public static boolean a(Context context) {
        boolean z = false;
        try {
            AdapterForTLog.loge(TAG, "AddressDynamic start init");
            Class<?> cls = Class.forName("com.taobao.android.address.AddressDynamic");
            z = ((Boolean) cls.getMethod("init", Context.class).invoke(cls, context)).booleanValue();
            AdapterForTLog.loge(TAG, "AddressDynamic init:" + z);
            return z;
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "init AddressDynamic error", th);
            return z;
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        try {
            AdapterForTLog.loge(TAG, "observerAddressDynamic start");
            bhm.a().a(DYNAMIC_NAME_TAOBAO_ANDROID_ADDRESS_DYNAMIC, new bho.a() { // from class: tb.mqt.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bho.a
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                        return;
                    }
                    String a2 = t.a().a(mqt.DYNAMIC_NAME_TAOBAO_ANDROID_ADDRESS_DYNAMIC, "baseline");
                    AdapterForTLog.loge(mqt.TAG, "taobao_android_address_dynamic install status:" + i + " installSource:" + a2);
                    if (i != 3) {
                        return;
                    }
                    AdapterForTLog.loge(mqt.TAG, "observerAddressDynamic start load and init");
                    ayq.a(new Runnable() { // from class: tb.mqt.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                boolean a3 = k.a().a(f.a(), false, mqt.DYNAMIC_NAME_TAOBAO_ANDROID_ADDRESS_DYNAMIC);
                                AdapterForTLog.loge(mqt.TAG, "observerAddressDynamic load:" + a3);
                                boolean a4 = mqt.a(f.a());
                                AdapterForTLog.loge(mqt.TAG, "observerAddressDynamic init:" + a4);
                            } catch (Exception e) {
                                AdapterForTLog.loge(mqt.TAG, "observerAddressDynamic init err", e);
                            }
                        }
                    });
                }
            }, ayq.a());
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "observerAddressDynamic error", th);
        }
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
        } else if (!efe.c("isAddressDynamicFeatureInstallSync")) {
        } else {
            ayq.a(new Runnable() { // from class: tb.mqt.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    mqt.b(mqt.DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC);
                    mqt.b(mqt.DYNAMIC_NAME_TAOBAO_ANDROID_ADDRESS_DYNAMIC);
                }
            }, efe.a("dynamicFeatureInstallMs", i));
        }
    }

    public static synchronized boolean a(String str) {
        synchronized (mqt.class) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
            }
            try {
                AdapterForTLog.loge(TAG, "isAddressDynamicFeatureInstall featureName:" + str);
                g c = c.Companion.a().c();
                if (c != null) {
                    DynamicFeatureInfo c2 = b.a().c(str);
                    if (c2 == null) {
                        AdapterForTLog.loge("模块内置：" + c2.featureName, new String[0]);
                    } else if (c.a().contains(c2.featureName)) {
                        AdapterForTLog.loge("模块已经安装完成：" + c2.featureName, new String[0]);
                    } else {
                        z = false;
                    }
                    try {
                        AdapterForTLog.loge(TAG, "isAddressDynamicFeatureInstall install:" + z + " featureName:" + str);
                    } catch (Throwable th) {
                        th = th;
                        AdapterForTLog.loge(TAG, "isAddressDynamicFeatureInstall error dump:", th);
                        return z;
                    }
                } else {
                    AdapterForTLog.loge("manager is null", new String[0]);
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
            return z;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(3:10|11|(2:12|13))|(2:15|(9:17|18|19|20|21|22|23|24|25)(1:33))|34|21|22|23|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0129, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x012a, code lost:
        r2 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean b(final java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mqt.b(java.lang.String):boolean");
    }

    public static void a(Activity activity, int i, int i2, Intent intent, boolean z) {
        try {
            AdapterForTLog.loge(TAG, "ocrMgronActivityResult");
            Class<?> cls = Class.forName("com.taobao.android.address.ocr.OcrMgr");
            cls.getMethod("onActivityResult", Activity.class, Integer.TYPE, Integer.TYPE, Intent.class, Boolean.TYPE).invoke(cls.getMethod("getInstance", new Class[0]).invoke(cls, new Object[0]), activity, Integer.valueOf(i), Integer.valueOf(i2), intent, Boolean.valueOf(z));
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "ocrMgronActivityResult error dump: ", th);
        }
    }

    public static boolean c(Context context) {
        boolean z = false;
        try {
            AdapterForTLog.loge(TAG, "addressOverseaDynamicInit start init");
            Class<?> cls = Class.forName("com.taobao.android.address.oversea.AddressOverseaDynamic");
            z = ((Boolean) cls.getMethod("init", Context.class).invoke(cls, context)).booleanValue();
            AdapterForTLog.loge(TAG, "addressOverseaDynamicInit init:" + z);
            return z;
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "init addressOverseaDynamicInit error", th);
            return z;
        }
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue();
        }
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "isGooglePlayServicesAvailable error", th);
            return false;
        }
    }
}
