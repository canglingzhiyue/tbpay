package com.taobao.mytaobao.ultron.event;

import android.text.TextUtils;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.bga;
import tb.kge;
import tb.mxj;

/* loaded from: classes7.dex */
public class i extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ScheduledExecutorService f18510a;
    private static boolean b;

    static {
        kge.a(235672573);
        ScheduledExecutorService newScheduledThreadPool = VExecutors.newScheduledThreadPool(1, new Schedules.MyThreadNameFactory("mtbUltronUT"));
        f18510a = newScheduledThreadPool;
        ((ThreadPoolExecutor) newScheduledThreadPool).setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
        ((ThreadPoolExecutor) f18510a).allowCoreThreadTimeOut(true);
        b = mxj.a("asyncMTbUTV3", true);
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        final JSONObject fields = b().getFields();
        if (fields == null) {
            return;
        }
        final int i = -1;
        try {
            i = fields.getInteger("eventId").intValue();
        } catch (Exception unused) {
        }
        if (i < 0) {
            return;
        }
        JSONObject jSONObject = fields.getJSONObject("nextPage");
        Runnable runnable = new Runnable() { // from class: com.taobao.mytaobao.ultron.event.i.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String string = fields.getString("page");
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                String string2 = fields.getString("arg1");
                String string3 = fields.getString("arg2");
                String string4 = fields.getString("arg3");
                String str = TextUtils.isEmpty(string3) ? "" : string3;
                String str2 = TextUtils.isEmpty(string4) ? "" : string4;
                JSONObject jSONObject2 = fields.getJSONObject("args");
                HashMap hashMap = new HashMap();
                if (jSONObject2 != null) {
                    for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (!TextUtils.isEmpty(key) && value != null) {
                            hashMap.put(key, String.valueOf(value));
                        }
                    }
                }
                try {
                    UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(string, i, string2, str, str2, hashMap).build());
                } catch (Throwable th) {
                    bga.a.a("mytaobao", "UserTrackSubscriber.onHandleEvent", th);
                }
            }
        };
        if (b && jSONObject == null) {
            f18510a.execute(runnable);
            return;
        }
        runnable.run();
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null) {
                hashMap.put(key, String.valueOf(value));
            }
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap);
        } catch (Throwable th) {
            UnifyLog.d("OptimizeUserTrackSubscriber", th.getMessage());
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap));
        } catch (Throwable th2) {
            UnifyLog.d("OptimizeUserTrackSubscriber", th2.getMessage());
        }
    }
}
