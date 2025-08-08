package com.taobao.android.detail.sdk.utils.ocr.request;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.request.d;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class b implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10356a = "mtop.taobao.ocr.image.check";
    public String b = "1.0";
    public HashMap<String, String> c;

    static {
        kge.a(-673025530);
        kge.a(-1535221011);
    }

    public b() {
        tpc.a("com.taobao.android.detail.sdk.utils.ocr.request.OCRRequestParams");
    }

    public void a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
        } else if (strArr != null) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (String str : strArr) {
                if (!StringUtils.isEmpty(str)) {
                    jSONArray.add(str);
                }
            }
            try {
                jSONObject.put("imgList", (Object) jSONArray.toString());
                if (this.c == null) {
                    this.c = new HashMap<>();
                }
                this.c.putAll((Map) JSONObject.toJavaObject(jSONObject, Map.class));
            } catch (Exception e) {
                Log.e("OCRRequestParams", "Fail to create OCR request params");
                e.printStackTrace();
            }
        }
    }

    @Override // com.taobao.android.detail.sdk.request.d
    public HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[]{this}) : this.c;
    }
}
