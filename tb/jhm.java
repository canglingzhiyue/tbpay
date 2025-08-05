package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;
import com.taobao.android.tlog.protocol.model.request.base.FileInfo;
import java.util.Map;

/* loaded from: classes6.dex */
public class jhm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(135624075);
    }

    public static UploadTokenInfo[] a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UploadTokenInfo[]) ipChange.ipc$dispatch("b9c0bbd4", new Object[]{jSONArray});
        }
        UploadTokenInfo[] uploadTokenInfoArr = new UploadTokenInfo[jSONArray.size()];
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            UploadTokenInfo uploadTokenInfo = new UploadTokenInfo();
            if (jSONObject.containsKey("fileInfo")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("fileInfo");
                FileInfo fileInfo = new FileInfo();
                if (jSONObject2.containsKey("fileName")) {
                    fileInfo.fileName = jSONObject2.getString("fileName");
                }
                if (jSONObject2.containsKey("absolutePath")) {
                    fileInfo.absolutePath = jSONObject2.getString("absolutePath");
                }
                if (jSONObject2.containsKey("lastModified")) {
                    fileInfo.lastModified = jSONObject2.getLong("lastModified");
                }
                if (jSONObject2.containsKey("contentLength")) {
                    fileInfo.contentLength = jSONObject2.getLong("contentLength");
                }
                if (jSONObject2.containsKey("contentType")) {
                    fileInfo.contentType = jSONObject2.getString("contentType");
                }
                if (jSONObject2.containsKey("contentMD5")) {
                    fileInfo.contentMD5 = jSONObject2.getString("contentMD5");
                }
                if (jSONObject2.containsKey("contentEncoding")) {
                    fileInfo.contentEncoding = jSONObject2.getString("contentEncoding");
                }
                uploadTokenInfo.fileInfo = fileInfo;
            }
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    uploadTokenInfo.put(key, String.valueOf(value));
                }
            }
            uploadTokenInfoArr[i] = uploadTokenInfo;
        }
        return uploadTokenInfoArr;
    }
}
