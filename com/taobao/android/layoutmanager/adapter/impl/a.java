package com.taobao.android.layoutmanager.adapter.impl;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.util.HashMap;
import java.util.Map;
import tb.guc;
import tb.kge;
import tb.oeb;
import tb.ogy;
import tb.tjy;

/* loaded from: classes5.dex */
public class a implements com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, Object> f13113a = new HashMap<>();

    static {
        kge.a(-1761936827);
        kge.a(-1629118992);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.b
    public synchronized Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, obj});
        }
        Object b = ogy.b(str);
        if (b != null) {
            return b;
        }
        if (oeb.ar()) {
            Object obj2 = this.f13113a.get(str);
            if (obj2 != null) {
                return obj2;
            }
            Object b2 = b(str, obj);
            this.f13113a.put(str, b2);
            return b2;
        }
        return b(str, obj);
    }

    private Object b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("cfa9a883", new Object[]{this, str, obj}) : c(str, obj);
    }

    private Object c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5c96bfa2", new Object[]{this, str, obj});
        }
        String[] split = str.split("\\.");
        if (split.length == 1 && oeb.a("enableAppABTest", true)) {
            return Boolean.valueOf(guc.a(ab.a(), split[0]));
        }
        if (split.length != 3 && split.length != 2) {
            return obj;
        }
        String str2 = split[0];
        String str3 = split[1];
        String str4 = split.length == 3 ? split[2] : "";
        VariationSet activate = UTABTest.activate(str2, str3, a(), null);
        if (activate != null) {
            long experimentId = activate.getExperimentId();
            long experimentReleaseId = activate.getExperimentReleaseId();
            long experimentBucketId = activate.getExperimentBucketId();
            tjy.a("tab2", experimentId, experimentReleaseId, experimentBucketId);
            JSONObject jSONObject = new JSONObject();
            Variation variation = activate.getVariation(str4);
            if (variation == null && activate.size() > 0) {
                for (Variation variation2 : activate) {
                    if (variation2 != null) {
                        jSONObject.put(variation2.getName(), (Object) variation2.getValueAsString(""));
                    }
                }
                jSONObject.put("experimentId", (Object) Long.valueOf(experimentId));
                jSONObject.put("experimentReleaseId", (Object) Long.valueOf(experimentReleaseId));
                jSONObject.put("experimentBucketId", (Object) Long.valueOf(experimentBucketId));
                return jSONObject;
            } else if (variation != null && !TextUtils.isEmpty(variation.getValueAsString(""))) {
                return variation.getValueAsString("");
            }
        }
        return obj;
    }

    private Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tnodeOsVersion", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("tnodeBrand", Build.BRAND);
        hashMap.put("tnodeModel", Build.MODEL);
        hashMap.put("tnodeDevice", Build.DEVICE);
        IDeviceInfo w = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().w();
        if (w != null) {
            hashMap.put("tnodeDeviceLevel", w.a(ab.a()).get("deviceLevel"));
        }
        return hashMap;
    }
}
