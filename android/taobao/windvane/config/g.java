package android.taobao.windvane.config;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String[] x;
    private static final String[] y;
    private static final String[] z;

    /* renamed from: a  reason: collision with root package name */
    public String f1559a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h = "";
    public String i = "0^^*,map,video,camera,ai-camera,canvas,weex-view";
    public String j = "map";
    public String k = "2000";
    public boolean l = false;
    public List<String> m = new ArrayList();
    public List<String> n = new ArrayList();
    public int o = 5;
    public int p = 134217728;
    public boolean q = false;
    public int r = 60;
    public int s = 8388608;
    public boolean t = true;
    public int u = 100663296;
    public int v = 100663296;
    public int w = 10;

    static {
        kge.a(-2011083168);
        x = new String[]{"com.taobao.taobao", "com.youku.phone"};
        y = new String[]{"com.taobao.taobao"};
        z = new String[]{"com.tmall.wireless", "com.youku.phone", "com.huawei.hwvplayer.youku", "cn.damai"};
    }

    public g(String str) {
        a(str);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            android.taobao.windvane.util.m.b("UCParamData", str);
            JSONObject jSONObject = new JSONObject(str);
            this.f1559a = jSONObject.optString("hostUcmVersionsCd", "");
            this.b = jSONObject.optString("scLoadPolicyCd", a() ? "sc_lshco" : "");
            this.c = jSONObject.optString("scCopyToSdcardCd", "true");
            this.d = jSONObject.optString("thirtyUcmVersionsCd", d());
            this.e = jSONObject.optString("scPkgNames", "com.eg.android.AlipayGphone^^com.taobao.taobao");
            this.f = jSONObject.optString("scStillUpd", "true");
            this.g = jSONObject.optString("scWaitMilts", a() ? "1" : "600000");
            this.h = jSONObject.optString("u4FocusAutoPopupInputHostList", "");
            this.o = jSONObject.optInt("cachePageNumber", this.o);
            this.p = jSONObject.optInt("discardableLimitBytes", 134217728);
            this.q = jSONObject.optBoolean("discardableReleaseFreeAfterTimeSwitch", false);
            this.r = jSONObject.optInt("discardableReleaseFreeAfterSecond", 60);
            this.s = jSONObject.optInt("discardableReleaseFreeUntilByte", 8388608);
            this.t = jSONObject.optBoolean("discardableReleaseForAllocFailedSwitch", true);
            this.u = jSONObject.optInt("grDiscardableLimitByte", 100663296);
            this.v = jSONObject.optInt("grResourceCacheLimitByte", 100663296);
            this.i = jSONObject.optString("cdResourceEmbedSurfaceEmbedViewEnableList", this.i);
            this.j = jSONObject.optString("cdResourceEmbedViewReAttachList", this.j);
            this.k = jSONObject.optString("ucPageTimerCount", this.k);
            this.l = jSONObject.optBoolean("openGPUWatchDogOptimize", this.l);
            a(jSONObject);
            b(jSONObject);
            this.w = jSONObject.optInt("webglErrorRate", this.w);
        } catch (Throwable unused) {
            android.taobao.windvane.util.m.d("UCParamData", "failed to parse uc params", str);
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32861656", new Object[]{this, jSONObject});
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("glLostReloadArray");
        if (optJSONArray == null) {
            return;
        }
        if (this.m.size() > 0) {
            this.m.clear();
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            this.m.add(optJSONArray.optString(i));
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345f6975", new Object[]{this, jSONObject});
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("glLostUnreloadArray");
            if (optJSONArray == null) {
                return;
            }
            if (this.n.size() > 0) {
                this.n.clear();
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.n.add(optJSONArray.optString(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
            android.taobao.windvane.util.m.e("UCParamData", "obtainGLLostUnreloadList: obtatin unreload url list error!");
        }
    }

    private static boolean a(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d04957b1", new Object[]{str, strArr})).booleanValue();
        }
        for (String str2 : strArr) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (a.f == null) {
            return false;
        }
        return a(a.f.getPackageName(), z);
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (a.f == null) {
            return false;
        }
        return a(a.f.getPackageName(), y);
    }

    private static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        if (c()) {
        }
        return "";
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b() || c();
    }
}
