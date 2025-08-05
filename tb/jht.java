package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.request.base.a;
import com.taobao.weex.common.Constants;

/* loaded from: classes6.dex */
public class jht {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a[] b;
    public String c;
    private String d = "TLOG.Protocol.LogUploadRequest";

    /* renamed from: a  reason: collision with root package name */
    public Boolean f29564a = true;

    static {
        kge.a(1572249627);
    }

    public void a(JSON json, jhg jhgVar) throws Exception {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a32ca6e", new Object[]{this, json, jhgVar});
            return;
        }
        JSONObject jSONObject = (JSONObject) json;
        if (jSONObject.containsKey("allowNotWifi")) {
            this.f29564a = jSONObject.getBoolean("allowNotWifi");
        }
        if (jSONObject.containsKey("uploadId")) {
            this.c = jSONObject.getString("uploadId");
        }
        if (!jSONObject.containsKey("logFeatures") || (jSONArray = jSONObject.getJSONArray("logFeatures")) == null || jSONArray.size() <= 0) {
            return;
        }
        this.b = a(jSONArray);
    }

    private a[] a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a[]) ipChange.ipc$dispatch("fbeacf5e", new Object[]{this, jSONArray});
        }
        a[] aVarArr = new a[jSONArray.size()];
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            a aVar = new a();
            if (jSONObject.containsKey("appenderName")) {
                aVar.f15568a = jSONObject.getString("appenderName");
            }
            if (jSONObject.containsKey(Constants.Name.SUFFIX)) {
                aVar.b = jSONObject.getString(Constants.Name.SUFFIX);
            }
            if (jSONObject.containsKey("maxHistory")) {
                aVar.c = jSONObject.getInteger("maxHistory");
            }
            if (jSONObject.containsKey("startTime")) {
                aVar.d = jSONObject.getLong("startTime").longValue();
            }
            if (jSONObject.containsKey("endTime")) {
                aVar.e = jSONObject.getLong("endTime").longValue();
            }
            aVarArr[i] = aVar;
        }
        return aVarArr;
    }
}
