package com.taobao.android.detail.sdk.utils.ocr.request;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10353a;
    public String b;
    private HashMap<String, ArrayList<C0396a>> c = new HashMap<>();
    private HashMap<String, String> d = new HashMap<>();

    static {
        kge.a(106720127);
    }

    public a() {
        tpc.a("com.taobao.android.detail.sdk.utils.ocr.request.OCRBean");
    }

    public a(JSONObject jSONObject) {
        a(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.utils.ocr.request.OCRBean");
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32861656", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            try {
                this.f10353a = jSONObject.getString("code");
                this.b = jSONObject.getString("successful");
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                Iterator<String> keys = jSONObject2.keys();
                while (keys != null) {
                    if (!keys.hasNext()) {
                        return;
                    }
                    String next = keys.next();
                    JSONArray jSONArray = jSONObject2.getJSONArray(next);
                    ArrayList<C0396a> arrayList = new ArrayList<>();
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        C0396a c0396a = new C0396a(jSONArray.getJSONObject(i));
                        arrayList.add(c0396a);
                        sb.append(c0396a.b + "\n");
                    }
                    String sb2 = sb.toString();
                    if (StringUtils.isEmpty(sb2) || StringUtils.isEmpty(sb2.replace(" ", ""))) {
                        sb2 = "无文字或识别失败了";
                    }
                    this.d.put(next, sb2);
                    this.c.put(next, arrayList);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.taobao.android.detail.sdk.utils.ocr.request.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0396a {

        /* renamed from: a  reason: collision with root package name */
        public String f10354a;
        public String b;
        public ArrayList<C0397a> c;

        /* renamed from: com.taobao.android.detail.sdk.utils.ocr.request.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0397a {

            /* renamed from: a  reason: collision with root package name */
            public String f10355a;
            public String b;

            static {
                kge.a(1756229247);
            }
        }

        static {
            kge.a(-1947228641);
        }

        public C0396a() {
        }

        public C0396a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.c = new ArrayList<>();
            try {
                this.f10354a = jSONObject.getString("prob");
                this.b = jSONObject.getString("word") == null ? "" : jSONObject.getString("word");
                JSONArray jSONArray = jSONObject.getJSONArray(aw.PARAM_SEARCH_KEYWORD_POS);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    C0397a c0397a = new C0397a();
                    c0397a.f10355a = jSONObject2.getString("x");
                    c0397a.b = jSONObject2.getString("y");
                    this.c.add(c0397a);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[]{this}) : this.d;
    }
}
