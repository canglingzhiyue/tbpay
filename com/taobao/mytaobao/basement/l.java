package com.taobao.mytaobao.basement;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.b;
import java.net.URLDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.mxj;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/mytaobao/basement/BasementTabLocalHelper;", "", "()V", "getLocalInfo", "Lcom/alibaba/fastjson/JSONObject;", b.KEY_NODE_ID, "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-64765135);
    }

    public final JSONObject a(String nodeId) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, nodeId});
        }
        q.c(nodeId, "nodeId");
        try {
            JSONObject jSONObject5 = com.taobao.mytaobao.ultron.b.a().b;
            if (jSONObject5 != null && (jSONObject = jSONObject5.getJSONObject("data")) != null && (jSONObject2 = jSONObject.getJSONObject("global")) != null && (jSONObject3 = jSONObject2.getJSONObject("secScreenFragment")) != null && (jSONObject4 = jSONObject3.getJSONObject("bizParams")) != null && (string = jSONObject4.getString("tab")) != null) {
                JSONArray parseArray = JSONArray.parseArray(URLDecoder.decode(string));
                JSONObject parseObject = JSONObject.parseObject(mxj.a("mtbTabInfoV2", "{\"column_1\":[{\"x\":89,\"y\":59}],\"column_2\":[{\"x\":89,\"y\":59},{\"x\":228,\"y\":59}],\"column_3\":[{\"x\":89,\"y\":59},{\"x\":228,\"y\":59},{\"x\":361,\"y\":59}]}"));
                int indexOf = parseArray.indexOf(nodeId);
                JSONArray jSONArray = parseObject.getJSONArray("column_" + parseArray.size());
                if (jSONArray != null) {
                    return jSONArray.getJSONObject(indexOf);
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
