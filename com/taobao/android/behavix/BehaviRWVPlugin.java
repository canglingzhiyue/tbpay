package com.taobao.android.behavix;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.ability.impl.performance.PerformanceAbility;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.f;
import java.util.HashMap;
import java.util.Map;
import tb.dsb;
import tb.kge;
import tb.noa;

/* loaded from: classes4.dex */
public class BehaviRWVPlugin extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(118780348);
    }

    public static /* synthetic */ Object ipc$super(BehaviRWVPlugin behaviRWVPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("runComputeByName".equals(str)) {
            return a(str2, wVCallBackContext);
        }
        if ("runComputeByAlias".equals(str)) {
            return b(str2, wVCallBackContext);
        }
        if ("getModelInfo".equals(str)) {
            return c(str2, wVCallBackContext);
        }
        if (!PerformanceAbility.API_GET_DEVICE_LEVEL.equals(str)) {
            return false;
        }
        return d(str2, wVCallBackContext);
    }

    private boolean a(String str, final WVCallBackContext wVCallBackContext) {
        String string;
        String string2;
        String string3;
        final r rVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cebe5e73", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            string = parseObject.getString("pageName");
            string2 = parseObject.getString(BaseMnnRunUnit.KEY_TASK_NAME);
            string3 = parseObject.getString("inputArgs");
            rVar = new r();
        } catch (Exception e) {
            HashMap hashMap = new HashMap();
            hashMap.put("info", str);
            dsb.a("runComputeByName_Exception", null, hashMap, e);
            wVCallBackContext.error();
        }
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            HashMap hashMap2 = string3 == null ? null : (HashMap) JSONObject.parseObject(string3, new TypeReference<HashMap<String, Object>>() { // from class: com.taobao.android.behavix.BehaviRWVPlugin.1
            }, new Feature[0]);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("_walle_bizname", string);
            DAI.runCompute(string2, hashMap2, new com.tmall.android.dai.c() { // from class: com.taobao.android.behavix.BehaviRWVPlugin.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.tmall.android.dai.c
                public void a(boolean z, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8d794299", new Object[]{this, new Boolean(z), map});
                        return;
                    }
                    org.json.JSONObject jSONObject = new org.json.JSONObject(map);
                    if (z) {
                        rVar.a("data", jSONObject);
                        wVCallBackContext.success(rVar);
                        return;
                    }
                    rVar.a("data", jSONObject);
                    wVCallBackContext.error(rVar);
                }
            }, hashMap3);
            return true;
        }
        rVar.a("HY_PARAM_ERR");
        wVCallBackContext.error(rVar);
        return true;
    }

    private boolean b(String str, final WVCallBackContext wVCallBackContext) {
        String string;
        String string2;
        String string3;
        final r rVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26c8934", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            string = parseObject.getString("alias");
            string2 = parseObject.getString("pageName");
            string3 = parseObject.getString("inputArgs");
            rVar = new r();
        } catch (Throwable th) {
            HashMap hashMap = new HashMap();
            hashMap.put("info", str);
            dsb.a("runComputeByAlias_Exception", null, hashMap, th);
            wVCallBackContext.error();
        }
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            HashMap hashMap2 = string3 == null ? null : (HashMap) JSONObject.parseObject(string3, new TypeReference<HashMap<String, Object>>() { // from class: com.taobao.android.behavix.BehaviRWVPlugin.3
            }, new Feature[0]);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("_walle_bizname", string2);
            DAI.runComputeByAlias(string, hashMap2, new com.tmall.android.dai.c() { // from class: com.taobao.android.behavix.BehaviRWVPlugin.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.tmall.android.dai.c
                public void a(boolean z, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8d794299", new Object[]{this, new Boolean(z), map});
                        return;
                    }
                    org.json.JSONObject jSONObject = new org.json.JSONObject(map);
                    if (z) {
                        rVar.a("data", jSONObject);
                        wVCallBackContext.success(rVar);
                        return;
                    }
                    rVar.a("data", jSONObject);
                    wVCallBackContext.error(rVar);
                }
            }, hashMap3);
            return true;
        }
        rVar.a("HY_PARAM_ERR");
        wVCallBackContext.error(rVar);
        return true;
    }

    private boolean c(String str, WVCallBackContext wVCallBackContext) {
        String string;
        String string2;
        r rVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("361ab3f5", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            string = parseObject.getString(noa.KEY_MODEL_NAME);
            string2 = parseObject.getString("key");
            rVar = new r();
        } catch (Throwable th) {
            dsb.a("getModelInfo_Exception", null, null, th);
            wVCallBackContext.error();
        }
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            rVar.a("modelInfoResult", f.a(string, string2));
            wVCallBackContext.success(rVar);
            return true;
        }
        rVar.a("HY_PARAM_ERR");
        wVCallBackContext.error(rVar);
        return true;
    }

    private boolean d(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69c8deb6", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            r rVar = new r();
            rVar.a("deviceLevel", com.taobao.android.behavix.utils.c.c());
            wVCallBackContext.success(rVar);
        } catch (Throwable th) {
            dsb.a("getModelInfo_Exception", null, null, th);
            wVCallBackContext.error();
        }
        return false;
    }
}
