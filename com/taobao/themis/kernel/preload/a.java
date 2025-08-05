package com.taobao.themis.kernel.preload;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.inside.adapter.TLogAdapterImpl;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.metaInfo.appinfo.core.AppInfoStrategy;
import com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.AbsAppInfoRequestConfig;
import com.taobao.themis.kernel.preload.GetTopAppClient;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.utils.j;
import java.util.ArrayList;
import tb.kge;
import tb.qpt;
import tb.riy;
import tb.sfs;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-540714558);
    }

    public static /* synthetic */ Boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("a5abcd26", new Object[0]) : d();
    }

    public static /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            e();
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!n.o()) {
        } else {
            ((IExecutorService) qpt.a(IExecutorService.class)).getExecutor(ExecutorType.NORMAL).execute(new Runnable() { // from class: com.taobao.themis.kernel.preload.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!a.b().booleanValue()) {
                    } else {
                        a.c();
                    }
                }
            });
        }
    }

    private static Boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("3a0effa8", new Object[0]);
        }
        TMSLogger.b("TopAppPreloadJob", "try preload");
        Application applicationContext = ((IEnvironmentService) qpt.a(IEnvironmentService.class)).getApplicationContext();
        long b = j.b((Context) applicationContext, "lastTopAppPreloadTimeStamp", -1L);
        long n = n.n();
        TMSLogger.b("TopAppPreloadJob", "lastResourcePreloadTimeStamp: " + b + ", minSecondsFromLast : " + n);
        if (b == -1 || b < System.currentTimeMillis() - (n * 1000)) {
            j.a(applicationContext, "lastTopAppPreloadTimeStamp", System.currentTimeMillis());
            TMSLogger.b("TopAppPreloadJob", "need preload");
            return true;
        }
        return false;
    }

    private static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        JSONArray f = f();
        if (f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < f.size(); i++) {
            JSONObject jSONObject = f.getJSONObject(i);
            String string = jSONObject.getString("app_id");
            String string2 = jSONObject.getString("url");
            if (com.taobao.themis.kernel.metaInfo.appinfo.a.a().a(AppInfoScene.ONLINE, string) != AppInfoStrategy.LOCAL_LOAD) {
                TMSLogger.b("TopAppPreloadJob", "add preload appid [" + string + riy.ARRAY_END_STR);
                arrayList.add(new AbsAppInfoRequestConfig.BasicRequestParam(string, "*", string2));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.a aVar = new com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.a(arrayList);
        aVar.b = true;
        aVar.c = AbsAppInfoRequestConfig.AppInfoRequestScene.PRELOAD;
        com.taobao.themis.kernel.metaInfo.appinfo.a.a().a(aVar, (sfs) null);
    }

    private static JSONArray f() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("215b3ab1", new Object[0]);
        }
        JSONArray jSONArray = new JSONArray();
        String D = n.D();
        if (!TextUtils.isEmpty(D)) {
            for (String str : D.split(",")) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("app_id", (Object) str);
                jSONArray.add(jSONObject);
            }
        }
        com.taobao.themis.kernel.network.c<JSONArray, JSONObject> execute = new GetTopAppClient().execute(new GetTopAppClient.getTopAppParam(null));
        if (execute.f22556a) {
            jSONArray.addAll(execute.d);
            return jSONArray;
        }
        TMSLogger.d(TLogAdapterImpl.TLOG_MODULE, "getTopAppError: " + execute.c);
        return jSONArray;
    }
}
