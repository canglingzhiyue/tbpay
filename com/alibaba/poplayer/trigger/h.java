package com.alibaba.poplayer.trigger;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.config.model.predeal.PreDealCustomEventParams;
import com.alibaba.poplayer.config.model.predeal.PreDealIndexContent;
import com.alibaba.poplayer.norm.IModuleSwitchAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import tb.bzl;
import tb.caa;
import tb.cab;
import tb.caf;
import tb.cag;
import tb.cai;
import tb.kge;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DEAL_END_TIME = "dealEndTime";
    public static final String KEY_DEAL_START_TIME = "dealStartTime";
    public static final String KEY_INDEX_MAP = "indexMap";
    public static final String KEY_NO_ALG_FILTER_MAP = "noAlgFilterMap";
    public static final String KEY_SDK_WAIT_TIME = "sdkWaitTime";
    public static final String KEY_TRACE_ID = "traceId";
    public static final String KEY_TRACK_MAP = "trackMap";
    public static final String KEY_URI_SET = "uriSet";

    /* renamed from: a  reason: collision with root package name */
    private final InternalTriggerController f3213a;

    static {
        kge.a(-1227121116);
    }

    public h(InternalTriggerController internalTriggerController) {
        this.f3213a = internalTriggerController;
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            com.alibaba.poplayer.utils.c.c("triggerEvent", "", "TriggerBroadcastProcessor.triggerSchemaPop.onReceive?uri=" + str + "&param=" + str2);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (PopLayer.getReference().internalGetCurrentActivity() == null) {
                com.alibaba.poplayer.utils.c.c("triggerEvent", "", "TriggerBroadcastProcessor.triggerSchemaPop.onReceive curActivity is empty.");
                return;
            }
            if (str2 == null) {
                str2 = "";
            }
            if (!str.startsWith(cag.PAGE_SCHEME) && !TextUtils.isEmpty(str3) && str3.contains("clean")) {
                String c = caf.a().c();
                cag.i().a(c, c, true);
            }
            cag.i().c(str, str2);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("InternalBroadcastReceiver.onReceive.fail", th);
        }
    }

    public void a(String str, String str2, String str3, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("573e3146", new Object[]{this, str, str2, str3, new Boolean(z), new Boolean(z2)});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                com.alibaba.poplayer.utils.c.c("triggerEvent", "", "TriggerBroadcastProcessor.triggerFragmentSwitchPop.onReceive?fragmentName is empty");
                return;
            }
            if (str2 == null) {
                str2 = "";
            }
            com.alibaba.poplayer.utils.c.c("triggerEvent", "", "TriggerBroadcastProcessor.triggerFragmentSwitchPop..onReceive.fragmentName=" + str + ",param=" + str2 + ",needAcParam=" + z + ".fromBroadcast=" + z2);
            if (!TextUtils.isEmpty(str3) && str3.contains("clean")) {
                String c = caf.a().c();
                cag.i().a(InternalTriggerController.a(c, str), c, false);
                return;
            }
            this.f3213a.a(str, str2, z);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("FragmentSwitchBroadcastReceiver.onReceive.fail", th);
        }
    }

    public void a(String str, String str2, String str3, JSONObject jSONObject, String str4, long j, long j2, long j3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ad41c4", new Object[]{this, str, str2, str3, jSONObject, str4, new Long(j), new Long(j2), new Long(j3), new Boolean(z)});
            return;
        }
        try {
            com.alibaba.poplayer.utils.c.c("triggerEvent", "", "TriggerBroadcastProcessor.triggerPreDealPop.onReceive.fromBroadcast=" + z);
            cab.a("start", "", new HashMap());
            IModuleSwitchAdapter b = bzl.a().b();
            if (b != null && !b.isPreDealTriggerEnable()) {
                com.alibaba.poplayer.utils.c.c("triggerEvent", "", "TriggerBroadcastProcessor.triggerPreDealPop.onReceive.isPreDealTriggerEnable=false.return.");
                return;
            }
            com.alibaba.poplayer.utils.c.c("triggerEvent", "", "TriggerBroadcastProcessor.triggerPreDealPop.onReceive.uriSet=" + str + ".traceId=" + str4 + ".indexMap=" + str2);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (PopLayer.getReference().internalGetCurrentActivity() == null) {
                com.alibaba.poplayer.utils.c.c("triggerEvent", "", "TriggerBroadcastProcessor.triggerPreDealPop.onReceive.current Activity is empty.");
                return;
            }
            PreDealCustomEventParams a2 = a(str, str2, str3, jSONObject, str4, j, j2, j3);
            if (a2 != null && !a2.isValid()) {
                com.alibaba.poplayer.utils.c.c("triggerEvent", "", "TriggerBroadcastProcessor.triggerPreDealPop.onReceive.preDealCustomEventParams.isInvalid.");
                return;
            }
            caa.a(a2);
            cag.i().a(a2);
            com.alibaba.poplayer.utils.c.c("triggerEvent", "", "TriggerBroadcastProcessor.triggerPreDealPop.onReceive.acceptDone.uriSet=" + str + "&indexMap=" + str2 + ".traceId=" + str4);
            cab.a("end", str4, new HashMap());
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("TriggerBroadcastProcessor.triggerPreDealPop.onReceive.fail", th);
        }
    }

    public void a(BaseConfigItem baseConfigItem, String str, String str2, JSONObject jSONObject, cai caiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e05f73", new Object[]{this, baseConfigItem, str, str2, jSONObject, caiVar});
        } else {
            cag.i().a(baseConfigItem, str, str2, jSONObject, caiVar);
        }
    }

    private PreDealCustomEventParams a(String str, String str2, String str3, JSONObject jSONObject, String str4, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreDealCustomEventParams) ipChange.ipc$dispatch("aad56710", new Object[]{this, str, str2, str3, jSONObject, str4, new Long(j), new Long(j2), new Long(j3)});
        }
        try {
            PreDealCustomEventParams preDealCustomEventParams = new PreDealCustomEventParams();
            if (!TextUtils.isEmpty(str)) {
                preDealCustomEventParams.setUriSet(new HashSet(Arrays.asList(str.split(","))));
            }
            if (!TextUtils.isEmpty(str2)) {
                preDealCustomEventParams.setIndexMap((Map) JSON.parseObject(str2, new TypeReference<HashMap<String, PreDealIndexContent>>() { // from class: com.alibaba.poplayer.trigger.h.1
                }, new Feature[0]));
            }
            preDealCustomEventParams.setTrackMap(jSONObject);
            preDealCustomEventParams.setTraceId(str4);
            preDealCustomEventParams.setDealStartTime(j);
            preDealCustomEventParams.setDealEndTime(j2);
            preDealCustomEventParams.setSdkWaitTime(j3);
            return preDealCustomEventParams;
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("TriggerBroadcastProcessor.triggerPreDealPop.getPreDealCustomEventParams.error.", th);
            return null;
        }
    }
}
