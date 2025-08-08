package com.taobao.tbpoplayer.nativerender;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TSchedule;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.tbpoplayer.nativerender.dsl.DSLModel;
import com.taobao.tbpoplayer.nativerender.dsl.PreLoadModel;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import tb.kge;
import tb.nfc;
import tb.qnu;
import tb.tbt;

/* loaded from: classes8.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final h f22241a;
    private String b;
    private String c;
    private boolean d;

    static {
        kge.a(1932849826);
    }

    public n(h hVar) {
        this.f22241a = hVar;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        long j = 0;
        if (!a() || !b(str)) {
            z = false;
        } else {
            HashMap hashMap = new HashMap();
            long currentTimeStamp = PopLayer.getReference().getCurrentTimeStamp(false);
            hashMap.put("ugExpTime", String.valueOf(currentTimeStamp));
            str = qnu.a(str, hashMap);
            j = currentTimeStamp;
        }
        if (z) {
            a(j);
        }
        return str;
    }

    public void a(DSLModel dSLModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733aa727", new Object[]{this, dSLModel});
            return;
        }
        PreLoadModel preLoadModel = dSLModel.preload;
        if (preLoadModel == null || !preLoadModel.isValid()) {
            return;
        }
        this.b = a(preLoadModel);
        if (StringUtils.isEmpty(this.b)) {
            return;
        }
        b();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) tbt.PRE_RENDER);
        jSONObject.put(JarvisConstant.KEY_JARVIS_TRIGGER, (Object) "PopLayer");
        jSONObject.put("bizCode", (Object) (!StringUtils.isEmpty(preLoadModel.containerType) ? preLoadModel.containerType : "h5"));
        jSONObject.put("version", (Object) "1.0");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("url", (Object) this.b);
        jSONObject2.put("timeout", (Object) 10000);
        jSONObject2.put("spmVerifyValue", (Object) "*");
        jSONObject2.put("ignoreStatusCheck", (Object) Boolean.valueOf(preLoadModel.ignoreStatusCheck));
        jSONObject.put("params", (Object) jSONObject2);
        this.d = TSchedule.preloadWithConfig("PopLayer", "pop_user_growth", Collections.singletonList(jSONObject), new ScheduleProtocolCallback() { // from class: com.taobao.tbpoplayer.nativerender.PreLoader$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
            public void onPreload(ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType, HashMap<String, String> hashMap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("df1a7672", new Object[]{this, scheduleProtocolCallbackType, hashMap});
                }
            }

            @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
            public boolean resolveParameter(String str, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("1ba0efdb", new Object[]{this, str, map})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
            public boolean resolveType(ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("8945bdc1", new Object[]{this, scheduleProtocolCallbackType})).booleanValue();
                }
                return true;
            }
        });
        com.alibaba.poplayer.utils.c.a("PreLoader.startPreLoad.preloadWithConfig.mPreLoadStartSuccess=%s", Boolean.valueOf(this.d));
        if (!this.d) {
            return;
        }
        c();
    }

    private String a(PreLoadModel preLoadModel) {
        String str;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b36c3eed", new Object[]{this, preLoadModel});
        }
        if (!StringUtils.isEmpty(preLoadModel.url)) {
            str = preLoadModel.url;
        } else {
            if (!StringUtils.isEmpty(preLoadModel.ERTestUrl)) {
                Response syncSend = new DegradableNetwork(this.f22241a.k().a()).syncSend(new RequestImpl(preLoadModel.ERTestUrl), null);
                if (syncSend == null) {
                    return "";
                }
                com.alibaba.poplayer.utils.c.a("PreLoader.fetchERTestUrl.%s", syncSend);
                if (syncSend.getStatusCode() < 0) {
                    com.alibaba.poplayer.utils.c.a("PreLoader.fetchERTestUrl.statusCodeError", new Object[0]);
                    return "";
                }
                try {
                    String str2 = new String(syncSend.getBytedata(), "UTF-8");
                    com.alibaba.poplayer.utils.c.a("PreLoader.fetchERTestUrl.data=%s", str2);
                    str = JSONObject.parseObject(str2).getJSONObject("group_config").getString("url");
                    z = "true".equals(Uri.parse(str).getQueryParameter("usePreload"));
                    if (!z) {
                        str = "";
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            str = "";
            z = false;
        }
        if (!z || StringUtils.isEmpty(str)) {
            return "";
        }
        this.c = UUID.randomUUID().toString().substring(0, 8);
        HashMap hashMap = new HashMap();
        hashMap.put("ugPreloadTraceId", this.c);
        hashMap.put("ugPopAid", this.f22241a.k().z());
        return qnu.a(str, hashMap);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.d;
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        try {
            Uri parse = Uri.parse(this.b);
            Uri parse2 = Uri.parse(str);
            if (parse.getHost().equals(parse2.getHost())) {
                if (parse.getPath().equals(parse2.getPath())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PreLoader.isJumpUrlEqualsPreLoadUrl.error", th);
            return false;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            com.alibaba.poplayer.trigger.d k = this.f22241a.k();
            k.t().ar.put(nfc.PHA_MONITOR_MEASURE_PRELOAD_START, (Object) true);
            HashMap hashMap = new HashMap();
            hashMap.put("gokey", "activityId=" + k.z());
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("https://market.m.taobao.com/app/global-popup/xRender/prod/native", 2201, "/poplayer-website.popup_buried_point.popup-expose-data-statistic", "", "", hashMap).build());
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PreLoader.trackOnDisplay.error", th);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            this.f22241a.k().t().ar.put("preloadSuccess", (Object) true);
            HashMap hashMap = new HashMap();
            hashMap.put("gokey", "activityId=" + this.f22241a.k().z() + "&ugPreloadTraceId=" + this.c + "&timestamp=" + PopLayer.getReference().getCurrentTimeStamp(false));
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("https://market.m.taobao.com/app/global-popup/xRender/prod/native", 19999, "/poplayer-website.popup_buried_point.preload-success-data-statistic", "", "", hashMap).build());
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PreLoader.trackOnPreLoadSuccess.error", th);
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("gokey", "activityId=" + this.f22241a.k().z() + "&ugPreloadTraceId=" + this.c + "&timestamp=" + j);
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("https://market.m.taobao.com/app/global-popup/xRender/prod/native", 2101, "/poplayer-website.popup_buried_point.popup-click-data-statistic", "", "", hashMap).build());
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PreLoader.trackOnJump.error", th);
        }
    }
}
