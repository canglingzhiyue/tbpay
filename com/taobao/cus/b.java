package com.taobao.cus;

import android.app.Application;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;
import tb.mre;
import tb.mrg;
import tb.rfy;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1411598096);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        try {
            com.alibaba.poplayer.utils.c.a("UpdaterInit.init", new Object[0]);
            mrg.a().b();
            a.a().a(application);
            q.a("WVAPKUpdatePlugin", (Class<? extends e>) WVCusPlugin.class, true);
            rfy.getInstance().registerInterceptor("main", $$Lambda$b$o0mddpXQ6jyS9KV6bFe6GEdas8A.INSTANCE);
            com.alibaba.poplayer.utils.c.a("UpdaterInit.init.done", new Object[0]);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("Updater.init.error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(JSONObject jSONObject, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ed9571a", new Object[]{jSONObject, new Boolean(z), str})).booleanValue();
        }
        if (!mre.a().b()) {
            com.alibaba.poplayer.utils.c.b("ApkUpdater", "", "ApkUpdater.interrupt.isNewStrategyEnable=false.");
            return false;
        } else if (!mre.a().d()) {
            com.alibaba.poplayer.utils.c.b("ApkUpdater", "", "ApkUpdater.interrupt.isNewUpdateForbidMTLPopEnable=false.");
            return false;
        } else {
            String h = a.a().h();
            com.alibaba.poplayer.utils.c.b("ApkUpdater", "", "ApkUpdater.interrupt.isMTLPopForOfficialErrorCode=" + h);
            return TextUtils.isEmpty(h);
        }
    }
}
