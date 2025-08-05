package com.taobao.android.fluid.framework.preload.launcher;

import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.framework.data.remote.d;
import com.taobao.android.fluid.framework.preload.IPreloadService;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import com.taobao.android.fluid.framework.preload.task.IPreloadTask;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.pil;
import tb.sjt;
import tb.skw;
import tb.soq;
import tb.spz;

/* loaded from: classes5.dex */
public class TBGuangPickPreloadModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBGuangPickPreloadModul_PickPreloadController";
    private static JSONObject mPreloadArgs;
    private static boolean setPreloadConfigCalled;

    static {
        kge.a(532112758);
        kge.a(-818961104);
        setPreloadConfigCalled = false;
    }

    public static void setPreloadConfig(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a67b10f", new Object[]{cVar});
            return;
        }
        spz.c(TAG, "setPreloadConfig start");
        if (!(cVar.b instanceof JSONObject)) {
            return;
        }
        setPreloadConfigInternal(cVar.a(), (JSONObject) cVar.b);
        setPreloadConfigCalled = true;
    }

    private static void setPreloadConfigInternal(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df4f6b5", new Object[]{context, jSONObject});
            return;
        }
        mPreloadArgs = jSONObject;
        IPreloadService preloadService = getPreloadService(context);
        if (preloadService == null) {
            return;
        }
        preloadService.setPreloadABConfig(jSONObject);
        spz.c(TAG, "setPreloadConfig：" + jSONObject.toJSONString());
    }

    public static void preloadCacheProcess(g.c cVar) {
        ViewGroup f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d44240e2", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            try {
                JSONObject jSONObject = (JSONObject) cVar.b;
                spz.c(TAG, "TBGuangPickPreloadModule.preloadCacheProcess被调用：" + jSONObject.toJSONString());
                Context a2 = cVar.a();
                if ((a2 instanceof Application) && (f = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().f()) != null) {
                    a2 = f.getContext();
                }
                spz.c(TAG, "PickPreloadControllerNew preloadCacheProcess");
                FluidInstance fluidInstance = getFluidInstance(cVar.a());
                if (fluidInstance == null) {
                    return;
                }
                ((IPreloadService) fluidInstance.getService(IPreloadService.class)).doPreloadForInactive(fluidInstance, a2, jSONObject);
            } catch (Throwable th) {
                th.printStackTrace();
                spz.a(TAG, "", th);
            }
        }
    }

    public static void process(g.c cVar) {
        ViewGroup f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61282cc9", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            try {
                pil.a(cVar.a(), null, "gg_GuangPickPreloadModule_process");
                JSONObject jSONObject = (JSONObject) cVar.b;
                spz.c(TAG, "TBGuangPickPreloadModule.process被调用：" + jSONObject.toJSONString());
                Context a2 = cVar.a();
                if ((a2 instanceof Application) && (f = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().f()) != null) {
                    a2 = f.getContext();
                }
                if (!setPreloadConfigCalled) {
                    setPreloadConfigInternal(cVar.a(), jSONObject);
                }
                if (soq.a()) {
                    spz.c(TAG, "PickPreloadControllerNew 视频优化新版");
                    FluidInstance fluidInstance = getFluidInstance(cVar.a());
                    if (fluidInstance != null) {
                        IPreloadService iPreloadService = (IPreloadService) fluidInstance.getService(IPreloadService.class);
                        iPreloadService.doPreload(fluidInstance, a2, jSONObject);
                        IPreloadTask currentPreloadTask = iPreloadService.getCurrentPreloadTask();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put((JSONObject) "enabled", (String) true);
                        if (currentPreloadTask != null && currentPreloadTask.d() != null) {
                            jSONObject2.putAll(currentPreloadTask.d());
                        }
                        cVar.c.a(cVar, jSONObject2);
                    } else {
                        cVar.c.a(cVar, new g.a("AC_ERR_NO_MODULE", "not exist", null));
                    }
                }
                pil.a(cVar.a(), null, "gg_GuangPickPreloadModule_process", null);
            } catch (Throwable th) {
                th.printStackTrace();
                spz.a(TAG, "", th);
                pil.a(cVar.a(), null, "gg_GuangPickPreloadModule_process", null, null);
            }
        }
    }

    public static void getDetailRequestParams(final g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e157c42a", new Object[]{cVar});
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.taobao.android.fluid.framework.preload.launcher.-$$Lambda$TBGuangPickPreloadModule$hgbiCjoakOKUSugqMZMrQyqtVoI
            @Override // java.lang.Runnable
            public final void run() {
                TBGuangPickPreloadModule.lambda$getDetailRequestParams$0(g.c.this);
            }
        };
        if (oeb.a("enableAsyncDetailParams", true)) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public static /* synthetic */ void lambda$getDetailRequestParams$0(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f220401", new Object[]{cVar});
        } else {
            cVar.c.a(cVar, getDetailRequestParamsInternal(cVar));
        }
    }

    private static Map getDetailRequestParamsInternal(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("12ddc062", new Object[]{cVar});
        }
        if ((cVar.b instanceof JSONObject) && sjt.a("mtopprefetch")) {
            JSONObject jSONObject = ((JSONObject) cVar.b).getJSONObject("extParams");
            String str = null;
            if (jSONObject == null) {
                DetailCacheData b = com.taobao.android.fluid.framework.preload.cache.b.b().b();
                if (com.taobao.android.fluid.framework.preload.cache.b.a(b)) {
                    str = b.getContentId();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = skw.FAKE_CONTENT_ID;
            }
            return d.a(jSONObject, str, false, false, 0, null, false).getJSONObject("data");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enable", false);
        return hashMap;
    }

    public static JSONObject getPickPreloadArgs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7ce15996", new Object[0]) : mPreloadArgs;
    }

    public static JSONObject getPickPreloadExtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1e5e7adc", new Object[0]);
        }
        JSONObject jSONObject = mPreloadArgs;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject("extraParams");
    }

    public static void resetPickPreloadArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e951dbdd", new Object[0]);
            return;
        }
        spz.c(TAG, "TBGuangPickPreloadModule resetPickPreloadArgs");
        mPreloadArgs = null;
    }

    private static IPreloadService getPreloadService(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPreloadService) ipChange.ipc$dispatch("91e02a20", new Object[]{context});
        }
        FluidInstance fluidInstance = getFluidInstance(context);
        if (fluidInstance != null) {
            return (IPreloadService) fluidInstance.getService(IPreloadService.class);
        }
        return null;
    }

    private static FluidInstance getFluidInstance(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidInstance) ipChange.ipc$dispatch("279048e2", new Object[]{context}) : FluidSDK.getPreloadRecommendTabInstance(context);
    }
}
