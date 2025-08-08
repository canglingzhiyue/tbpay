package com.tmall.android.dai.trigger.protocol;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.trigger.protocol.cep.pattern.CepNative;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.dqy;
import tb.kge;
import tb.noa;
import tb.rlj;
import tb.rlk;
import tb.rll;
import tb.rln;

/* loaded from: classes9.dex */
public class Cep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(287027814);
    }

    public static rlj createFromConfigAndSink(String str, String str2, String str3) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rlj) ipChange.ipc$dispatch("f0ad224f", new Object[]{str, str2, str3});
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (str3 == null) {
            str3 = parseObject.getString("id");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("cep_id#");
        sb.append(str2 == null ? "empty_model" : str2);
        sb.append("#");
        sb.append(str3 == null ? UUID.randomUUID().toString() : str3);
        CepNative cepNative = new CepNative(sb.toString(), str);
        if (cepNative.isFailed()) {
            throw new Exception("Create Native Cep Failed: " + cepNative.failedReason);
        }
        rln<List<Map<String, String>>> createSink = createSink(str3, parseObject.getJSONObject("sink"), str2);
        if (createSink == null) {
            throw new Exception("cannot fink sink ");
        }
        return new rlj(str3, new com.tmall.android.dai.trigger.protocol.cep.pattern.a(cepNative), createSink, str);
    }

    public static rll createStreamProtocolFromConfigAndSink(String str, String str2, String str3) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rll) ipChange.ipc$dispatch("e356e1e5", new Object[]{str, str2, str3});
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (str3 == null) {
            str3 = parseObject.getString("id");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("cep_id#");
        sb.append(str2 == null ? "empty_model" : str2);
        sb.append("#");
        sb.append(str3 == null ? UUID.randomUUID().toString() : str3);
        CepNative cepNative = new CepNative(sb.toString(), str);
        if (cepNative.isFailed()) {
            throw new Exception("Create Native Cep Failed: " + cepNative.failedReason);
        }
        rln<List<Map<String, String>>> createSink = createSink(str3, parseObject.getJSONObject("sink"), str2);
        if (createSink == null) {
            throw new Exception("cannot fink sink ");
        }
        return new rll(str3, new com.tmall.android.dai.trigger.protocol.cep.pattern.a(cepNative), createSink, str);
    }

    private static rln<List<Map<String, String>>> createSink(String str, JSONObject jSONObject, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rln) ipChange.ipc$dispatch("71be7098", new Object[]{str, jSONObject, str2});
        }
        if (jSONObject == null) {
            if (str2 != null) {
                return new rlk(str, str2, false);
            }
            return null;
        }
        String string = jSONObject.getString("type");
        JSONObject jSONObject2 = jSONObject.getJSONObject("config");
        if (!StringUtils.equals(dqy.TYPE, string)) {
            return null;
        }
        if (jSONObject2 == null) {
            if (str2 != null) {
                return new rlk(str, str2, false);
            }
            return null;
        }
        boolean equals = Boolean.TRUE.equals(jSONObject2.getBoolean("acceptSeq"));
        if (str2 == null) {
            str2 = jSONObject2.getString(noa.KEY_MODEL_NAME);
        }
        return new rlk(str, str2, equals);
    }
}
