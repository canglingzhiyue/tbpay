package com.alipay.android.msp.utils;

import android.os.SystemClock;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.network.model.ReqData;
import com.alipay.android.msp.network.model.ResData;
import com.alipay.android.msp.pay.GlobalConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;

/* loaded from: classes3.dex */
public class NetParamLogUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "接口日志";

    private NetParamLogUtil() {
    }

    public static void pbLogPrint(String str, long j, ReqData<Map<String, String>> reqData, Map<String, String> map, Map<String, String> map2) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d70622", new Object[]{str, new Long(j), reqData, map, map2});
            return;
        }
        try {
            LogUtil.i(TAG, str + ".request", reqData.mData.get("action") + " " + reqData.getReqUuid() + " " + JSON.toJSONString(reqData.mData));
            JSONObject jSONObject = new JSONObject();
            for (String str3 : map.keySet()) {
                if ("data".equals(str3)) {
                    if (GlobalConstant.DEBUG && (str2 = map.get(str3)) != null) {
                        LogUtil.i(TAG, str + ".result.data", str2);
                    }
                } else if (!MspFlybirdDefine.EXTINFO.equals(str3)) {
                    jSONObject.put(str3, (Object) map.get(str3));
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            String str4 = "";
            if (map2 != null) {
                str4 = map2.get("mgw-traceid");
                jSONObject2.put("headers", (Object) map2);
            }
            jSONObject2.put("result", (Object) jSONObject);
            String str5 = str + ".result";
            LogUtil.i(TAG, str5, str4 + " " + (SystemClock.elapsedRealtime() - j) + "ms " + jSONObject2.toJSONString());
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(TAG, "pbLogPrint", th);
        }
    }

    public static void rpcLogPrint(boolean z, String str, long j, String str2, String str3, Map<String, String> map, JSONObject jSONObject, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b57feb", new Object[]{new Boolean(z), str, new Long(j), str2, str3, map, jSONObject, map2});
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("isPbFormat", (Object) Boolean.valueOf(z));
            jSONObject2.put("rpcSdk", (Object) str);
            jSONObject2.put("rpcOpType", (Object) str2);
            jSONObject2.put("params", (Object) str3);
            jSONObject2.put("headers", (Object) map);
            LogUtil.i(TAG, "rpc.request", str2 + " " + jSONObject2.toJSONString());
            String str4 = "";
            JSONObject jSONObject3 = new JSONObject();
            if (map2 != null) {
                str4 = map2.get("mgw-traceid");
                jSONObject3.put("headers", (Object) map2);
            }
            jSONObject3.put("result", (Object) jSONObject);
            LogUtil.i(TAG, "rpc.result", str4 + " " + (SystemClock.elapsedRealtime() - j) + "ms " + jSONObject3.toJSONString());
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(TAG, "rpcLogPrint", th);
        }
    }

    public static void httpReqLogPrint(HttpUriRequest httpUriRequest) {
        Header[] allHeaders;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a744c0", new Object[]{httpUriRequest});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            HashMap hashMap = new HashMap();
            for (Header header : httpUriRequest.getAllHeaders()) {
                hashMap.put(header.getName(), header.getValue());
            }
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((HttpPost) httpUriRequest).getEntity().getContent()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    jSONObject.put("headers", (Object) hashMap);
                    jSONObject.put("content", (Object) sb.toString());
                    LogUtil.i(TAG, "http.request", jSONObject.toJSONString());
                    return;
                }
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(TAG, "httpReqLogPrint", th);
        }
    }

    public static void httpResLogPrint(JSONObject jSONObject, ResData<?> resData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c28c2f0", new Object[]{jSONObject, resData});
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (resData.mHeaders != null) {
                HashMap hashMap = new HashMap();
                for (Header header : resData.mHeaders) {
                    hashMap.put(header.getName(), header.getValue());
                }
                jSONObject2.put("headers", (Object) hashMap);
            }
            jSONObject2.put("result", (Object) jSONObject);
            LogUtil.i(TAG, "http.result", jSONObject2.toJSONString());
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(TAG, "httpResLogPrint", th);
        }
    }
}
