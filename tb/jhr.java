package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.request.base.FileInfo;
import com.taobao.android.tlog.protocol.model.request.base.b;

/* loaded from: classes6.dex */
public class jhr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(417322264);
    }

    public static jhh a(JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3, String str4) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jhh) ipChange.ipc$dispatch("79e33e4c", new Object[]{jSONObject, jSONObject2, str, str2, str3, str4});
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("type", (Object) str);
        jSONObject3.put("version", (Object) jhb.version);
        jSONObject3.put("headers", (Object) jSONObject2);
        jSONObject3.put("data", (Object) jSONObject);
        String a2 = jhf.a(jSONObject3.toString());
        jhh jhhVar = new jhh();
        jhhVar.f29554a = a2;
        jhhVar.b = str2;
        jhhVar.c = str3;
        jhhVar.d = str4;
        return jhhVar;
    }

    public static JSONArray a(FileInfo[] fileInfoArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("46dbd219", new Object[]{fileInfoArr});
        }
        JSONArray jSONArray = new JSONArray();
        for (FileInfo fileInfo : fileInfoArr) {
            JSONObject jSONObject = new JSONObject();
            if (fileInfo.fileName != null) {
                jSONObject.put("fileName", (Object) fileInfo.fileName);
            }
            if (fileInfo.absolutePath != null) {
                jSONObject.put("absolutePath", (Object) fileInfo.absolutePath);
            }
            if (fileInfo.lastModified != null) {
                jSONObject.put("lastModified", (Object) fileInfo.lastModified);
            }
            if (fileInfo.contentLength != null) {
                jSONObject.put("contentLength", (Object) fileInfo.contentLength);
            }
            if (fileInfo.contentType != null) {
                jSONObject.put("contentType", (Object) fileInfo.contentType);
            }
            if (fileInfo.contentMD5 != null) {
                jSONObject.put("contentMD5", (Object) fileInfo.contentMD5);
            }
            if (fileInfo.contentEncoding != null) {
                jSONObject.put("contentEncoding", (Object) fileInfo.contentEncoding);
            }
            jSONArray.add(jSONObject);
        }
        return jSONArray;
    }

    public static JSONObject a(b bVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("894abe38", new Object[]{bVar, str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(jhb.appKeyName, (Object) bVar.h);
        jSONObject.put(jhb.appIdName, (Object) bVar.i);
        jSONObject.put(jhb.deviceIdName, (Object) bVar.j);
        jSONObject.put(jhb.sessionIdName, (Object) str2);
        jSONObject.put(jhb.requestIdName, (Object) str);
        jSONObject.put(jhb.opCodeName, (Object) bVar.l);
        return jSONObject;
    }
}
