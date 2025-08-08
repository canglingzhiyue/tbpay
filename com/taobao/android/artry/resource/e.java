package com.taobao.android.artry.resource;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.i;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.rrv;

/* loaded from: classes4.dex */
public class e implements i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BASE64_KEY = "base64";
    private static final String e;

    /* renamed from: a  reason: collision with root package name */
    public boolean f9076a;
    public String b;
    public String c;
    public String d;
    private String f;
    private String g;
    private String h;
    private String i;
    private Map<String, String> j;
    private Map<String, String> k;

    public static /* synthetic */ String a(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18652b59", new Object[]{eVar, str});
        }
        eVar.g = str;
        return str;
    }

    public static /* synthetic */ Map a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4fe45b12", new Object[]{eVar}) : eVar.k;
    }

    public static /* synthetic */ Map a(e eVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ac08227d", new Object[]{eVar, map});
        }
        eVar.k = map;
        return map;
    }

    public static /* synthetic */ String b(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1933a9da", new Object[]{eVar, str});
        }
        eVar.f = str;
        return str;
    }

    public static /* synthetic */ String c(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a02285b", new Object[]{eVar, str});
        }
        eVar.h = str;
        return str;
    }

    static {
        kge.a(-1123592853);
        kge.a(671985108);
        e = e.class.getSimpleName();
    }

    private e() {
    }

    @Override // com.uploader.export.i
    public String getBizType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this}) : this.g;
    }

    @Override // com.uploader.export.i
    public String getFilePath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this}) : this.h;
    }

    @Override // com.uploader.export.i
    public String getFileType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("105a7e2d", new Object[]{this}) : this.i;
    }

    @Override // com.uploader.export.i
    public Map<String, String> getMetaInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8d01c005", new Object[]{this}) : this.j;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.c;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f9076a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.b;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.d;
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        if (this.f9076a && com.taobao.android.artry.utils.d.a(this.b)) {
            z = true;
        }
        try {
            jSONObject.put(rrv.UPLOAD_RESULT, (Object) Boolean.valueOf(z));
        } catch (Throwable unused) {
            Log.e(e, "failed to put %s, which value is " + z + rrv.UPLOAD_RESULT);
        }
        if (z) {
            try {
                jSONObject.put("ossUrl", (Object) this.b);
                String str = " the upload url is " + this.b;
            } catch (Throwable th) {
                Log.e(e, "failed to put %s, which value is  throwable " + th + " oss url ossUrl throwable " + this.b);
            }
        }
        if (!com.taobao.android.artry.utils.d.a(this.k) && this.k.containsKey("base64")) {
            jSONObject.put("base64", (Object) this.k.get("base64"));
        }
        return jSONObject;
    }

    public static JSONObject g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[0]) : new e().f();
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private e f9077a = new e();

        static {
            kge.a(-2078043838);
        }

        public a(String str, String str2) {
            if (StringUtils.isEmpty(str)) {
                throw new IllegalArgumentException("the bisType of the upload file task must not be null...");
            }
            e.a(this.f9077a, str);
            e.b(this.f9077a, str2);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dad0190a", new Object[]{this, str});
            }
            e.c(this.f9077a, str);
            return this;
        }

        public a a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("64b012d4", new Object[]{this, str, str2});
            }
            if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                if (e.a(this.f9077a) == null) {
                    e.a(this.f9077a, new HashMap());
                }
                e.a(this.f9077a).put(str, str2);
            }
            return this;
        }

        public e a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("852cce5d", new Object[]{this}) : this.f9077a;
        }
    }
}
