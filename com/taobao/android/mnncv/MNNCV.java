package com.taobao.android.mnncv;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnpython.AliNNPython;
import com.taobao.android.mnncv.mtop.e;
import com.taobao.mrt.f;
import com.taobao.mrt.service.b;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.mrt.task.desc.MRTPythonLibDescription;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import com.taobao.mrt.task.g;
import com.taobao.mrt.utils.a;
import com.taobao.orange.OrangeConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.huj;
import tb.huk;
import tb.ihq;
import tb.msm;

/* loaded from: classes6.dex */
public class MNNCV {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_WALLE_CONFIG_SYNC = "com.taobao.mrt.walle_config";
    public static final String CONFIG_UPDATE_ORANGE_NAMESPACE = "EdgeComputingIsEnabled";
    private static final String TAG = "MNNCV";
    public static final String TASK_READY = "com.taobao.mrt.cv_task_ready";
    private static boolean mAvailable = false;
    private static boolean mInit = false;
    private static volatile boolean mRemoteConfigArrive = false;
    public static final String mServiceId = "MNNCV";
    public static final String mServiceIdCache = "MNNCV-Cache";
    private static volatile boolean mTaskReadyMsgSend = false;
    private static HashSet mValidTaskName = new HashSet();

    public static /* synthetic */ void access$000(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe40831", new Object[]{context});
        } else {
            asyncFetchCVTask(context);
        }
    }

    public static /* synthetic */ void access$100(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd8dda", new Object[]{context, str});
        } else {
            parseAndUpdateConfig(context, str);
        }
    }

    public static synchronized void init(final Context context) {
        synchronized (MNNCV.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("609fd211", new Object[]{context});
            } else if (mInit) {
            } else {
                a.a("MNNCV", "init");
                AliNNPython.initialize(context);
                if (!AliNNPython.nativeAvailable()) {
                    a.c("MNNCV", "AliNNPython init failed");
                    return;
                }
                com.taobao.mrt.utils.c.b();
                huj.a(context);
                if (isLowDevice()) {
                    a.c("MNNCV", "low device,not start MNNCV");
                    mInit = true;
                    return;
                }
                initMNNPyBridge(context);
                mAvailable = ihq.a().c("mnncv").g();
                a.a("[MNNCV]", "Load Lib With RemoteSo -" + mAvailable);
                g.a().a(1, 0, "MNNCV");
                g.a().a(0, 1, mServiceIdCache);
                asyncFetchCVTask(context);
                com.taobao.android.mnncv.mtop.e.a(new Runnable() { // from class: com.taobao.android.mnncv.MNNCV.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            MNNCV.access$000(context);
                        }
                    }
                });
                mInit = true;
            }
        }
    }

    public static boolean isAvailable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[0])).booleanValue() : mAvailable && com.taobao.mrt.c.a();
    }

    public static boolean isCVDisabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eea224c4", new Object[0])).booleanValue();
        }
        try {
            return Boolean.valueOf(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "isCVDisabled", "false")).booleanValue();
        } catch (Throwable th) {
            a.a("MNNCV", "get orange config failed", th);
            return false;
        }
    }

    public static boolean isTaskRunnable(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("77d2f3a1", new Object[]{str})).booleanValue() : mValidTaskName.contains(str);
    }

    private static synchronized void sendCVTaskReady(Context context) {
        synchronized (MNNCV.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6b9a89e", new Object[]{context});
            } else if (mTaskReadyMsgSend) {
                a.a("MNNCV", "cv_task_ready msg has sent");
            } else {
                if (isAvailable()) {
                    mTaskReadyMsgSend = true;
                    LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("com.taobao.mrt.cv_task_ready"));
                    com.taobao.mrt.utils.c.d();
                    a.c("MNNCV", "send cv_task_ready msg");
                }
            }
        }
    }

    private static boolean isLowDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[0])).booleanValue();
        }
        b d = f.a().d();
        if (d != null) {
            return "low".equalsIgnoreCase(d.getDeviceLevel());
        }
        return false;
    }

    private static void asyncFetchCVTask(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f3ed2b", new Object[]{context});
        } else if (isCVDisabled()) {
        } else {
            com.taobao.android.mnncv.mtop.e.a(com.taobao.mrt.c.f18243a, new e.a() { // from class: com.taobao.android.mnncv.MNNCV.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.mnncv.mtop.e.a
                public void a(MRTRuntimeException mRTRuntimeException, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("84d11cb4", new Object[]{this, mRTRuntimeException, str});
                        return;
                    }
                    if (com.taobao.mrt.c.c()) {
                        a.b("MNNCV", "e:" + mRTRuntimeException + ", config:" + str);
                    }
                    MNNCV.access$100(context, str);
                    com.taobao.android.mnncv.mtop.a.a().a(str);
                }
            });
        }
    }

    private static synchronized void parseAndUpdateConfig(Context context, String str) {
        synchronized (MNNCV.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1cf71c", new Object[]{context, str});
            } else if (!StringUtils.isEmpty(str)) {
                com.taobao.android.mnncv.mtop.c cVar = new com.taobao.android.mnncv.mtop.c(str);
                if (cVar.b != null && cVar.b.size() > 0) {
                    List<String> tppLibs = getTppLibs();
                    for (MRTPythonLibDescription mRTPythonLibDescription : cVar.b) {
                        if (!tppLibs.contains(mRTPythonLibDescription.resourceName)) {
                            msm.a().a(mRTPythonLibDescription);
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (MRTTaskDescription mRTTaskDescription : cVar.f14407a) {
                    if (mRTTaskDescription != null) {
                        registerOrUpdateTask(mRTTaskDescription);
                        hashSet.add(mRTTaskDescription.name);
                    }
                }
                mRemoteConfigArrive = true;
                updateValidTaskNameMap(hashSet);
                Intent intent = new Intent(ACTION_WALLE_CONFIG_SYNC);
                intent.putExtra("result", cVar.c);
                LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
                sendCVTaskReady(context);
            } else {
                a.c("MNNCV", "cv config sync failed:");
            }
        }
    }

    public static void registerOrUpdateTask(MRTTaskDescription mRTTaskDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21353657", new Object[]{mRTTaskDescription});
            return;
        }
        MRTTaskDescription b = g.a().b(mRTTaskDescription.name);
        if (b == null) {
            g.a().a(mRTTaskDescription);
        } else if (!mRTTaskDescription.equals(b)) {
            g.a().a(mRTTaskDescription);
        } else {
            a.a("MNNCV", "task " + mRTTaskDescription.name + " config is same :" + mRTTaskDescription.cid + "&" + b.cid);
        }
    }

    public static void updateValidTaskNameMap(Set set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce668fdf", new Object[]{set});
            return;
        }
        synchronized (mValidTaskName) {
            mValidTaskName.clear();
            mValidTaskName.addAll(set);
        }
    }

    public static void addToValidTaskNameMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bf0c9d", new Object[]{str});
            return;
        }
        synchronized (mValidTaskName) {
            mValidTaskName.add(str);
        }
    }

    private static void initMNNPyBridge(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fccbcdb2", new Object[]{context});
            return;
        }
        try {
            if (huk.a()) {
                a.b("mnncv", "MNNBridge load success");
            } else {
                a.d("mnncv", "MNNBridge load fail");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void initNumPy(Context context) {
        Method method;
        try {
            Class<?> cls = Class.forName("com.alibaba.numpy.Numpy");
            if (cls == null || (method = cls.getMethod("init", Context.class)) == null) {
                return;
            }
            method.invoke(null, context);
        } catch (Throwable th) {
            a.a("MRT.cv", "init numpy or cv error", th);
        }
    }

    private static void initOpenCV(Context context) {
        Method method;
        try {
            Class<?> cls = Class.forName("com.alibaba.opencv.OpenCv");
            if (cls == null || (method = cls.getMethod("init", Context.class)) == null) {
                return;
            }
            method.invoke(null, context);
        } catch (Throwable th) {
            a.a("MRT.cv", "init alicvkit or cv error", th);
        }
    }

    public static List<String> getTppLibs() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fd700974", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        try {
            String config = OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "libName", "");
            if (!StringUtils.isEmpty(config) && (split = config.trim().split(",")) != null) {
                for (String str : split) {
                    arrayList.add(str.trim());
                }
            }
        } catch (Throwable th) {
            a.a("MNNCV", "get orange config failed", th);
        }
        return arrayList;
    }
}
