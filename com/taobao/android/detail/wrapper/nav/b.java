package com.taobao.android.detail.wrapper.nav;

import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.preload.core.task.PreloadTaskEntity;
import com.taobao.android.detail.core.utils.o;
import tb.dyo;
import tb.ebw;
import tb.ecg;
import tb.emu;
import tb.kge;
import tb.nfc;

/* loaded from: classes5.dex */
public class b implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Intent f11419a;
    private String b;

    static {
        kge.a(-1012791129);
        kge.a(-1390502639);
    }

    public static /* synthetic */ Intent a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("e1488e9", new Object[]{bVar}) : bVar.f11419a;
    }

    public b(Intent intent, String str) {
        this.f11419a = intent;
        this.b = str;
        emu.a("com.taobao.android.detail.wrapper.nav.DetailNavPreloadRunnable");
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            final long uptimeMillis = SystemClock.uptimeMillis();
            String a2 = a();
            com.taobao.android.detail.core.utils.i.c(com.taobao.android.detail.core.performance.l.a("DetailNavPreloadRunnable"), a2);
            com.taobao.android.detail.wrapper.ext.preload.b bVar = new com.taobao.android.detail.wrapper.ext.preload.b();
            bVar.a(true);
            bVar.a(new com.taobao.android.detail.core.performance.preload.core.task.f<Long>() { // from class: com.taobao.android.detail.wrapper.nav.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.performance.preload.core.task.f
                public void a(PreloadTaskEntity preloadTaskEntity, Exception exc) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad4a8a3c", new Object[]{this, preloadTaskEntity, exc});
                    }
                }

                @Override // com.taobao.android.detail.core.performance.preload.core.task.f
                public void a(PreloadTaskEntity preloadTaskEntity, Long l) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("40f3a2c9", new Object[]{this, preloadTaskEntity, l});
                    } else {
                        o.c(b.a(b.this).getStringExtra(dyo.STREAM_FLAG), l.longValue() - uptimeMillis);
                    }
                }
            });
            com.taobao.android.detail.core.performance.preload.j.a().a(a2, bVar, true);
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a("DetailNavPreloadRunnable", "导航预加载执行异常", e);
        }
    }

    private String a(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b1abe71b", new Object[]{this, intent}) : (intent == null || intent.getData() == null) ? "" : intent.getData().toString();
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String a2 = ebw.a(this.f11419a);
        if (TextUtils.isEmpty(a2)) {
            ecg.d(this.b, "nav");
            com.taobao.android.detail.core.utils.i.c(com.taobao.android.detail.core.performance.l.a("DetailNavPreloadRunnable"), "导航预加载itemId为空");
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(a(this.f11419a))) {
            jSONObject.put("url", (Object) this.f11419a.getData().toString());
        }
        jSONObject.put("itemId", (Object) a2);
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("bizName", (Object) "page_detail");
        jSONObject2.put("sourceFrom", (Object) this.b);
        jSONObject2.put("items", (Object) jSONArray);
        jSONObject2.put(nfc.PHA_MONITOR_DIMENSION_PRELOAD_TYPE, (Object) "nav");
        return jSONObject2.toJSONString();
    }
}
