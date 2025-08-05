package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.homepage.windvane.b;
import com.taobao.tao.homepage.windvane.d;
import com.taobao.tao.topmultitab.c;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public class szz implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f33976a;

    static {
        kge.a(1001136726);
        kge.a(-1531379759);
        f33976a = Pattern.compile("&");
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : Collections.singletonList("passThroughData");
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = JSON.parseObject(str2);
        } catch (Exception e) {
            ldf.d("PassThroughDataHandler", "parse string exception: " + e);
        }
        String string = jSONObject == null ? "" : jSONObject.getString("homePageViewId");
        JSONObject jSONObject2 = jSONObject == null ? null : jSONObject.getJSONObject("data");
        d dVar = new d(jSONObject2, jSONObject == null ? 0L : a(jSONObject));
        String a2 = a(string);
        String b = b(string);
        r rVar = new r();
        if (!a(a2, jSONObject2)) {
            ldf.d("PassThroughDataHandler", "参数不合法，sectionBizCode或者passData为空，sectionBizCode： " + a2);
            rVar.a("errorMessage", "参数不合法，sectionBizCode或者passData为空");
            wVCallBackContext.error(rVar);
            return false;
        }
        wVCallBackContext.success();
        return a(a2, b, dVar);
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            ldf.d("PassThroughDataHandler", "parseSectionBizCode homePageViewId == null");
            return null;
        } else if (!str.contains("&")) {
            ldf.d("PassThroughDataHandler", "parseSectionBizCode homePageViewId 里没有&");
            return str;
        } else {
            String str2 = f33976a.split(str)[0];
            ldf.d("PassThroughDataHandler", "parseSectionBizCode sectionBizCode: " + str2);
            return str2;
        }
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            ldf.d("PassThroughDataHandler", "parseItemBizCode homePageViewId == null");
            return null;
        } else if (!str.contains("&")) {
            ldf.d("PassThroughDataHandler", "parseItemBizCode homePageViewId 里没有&");
            return null;
        } else {
            String[] split = f33976a.split(str);
            if (split.length < 2) {
                return null;
            }
            String str2 = split[1];
            ldf.d("PassThroughDataHandler", "parseItemBizCode itemBizCode: " + str2);
            return str2;
        }
    }

    private boolean a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6635bd02", new Object[]{this, str, jSONObject})).booleanValue() : !TextUtils.isEmpty(str) && jSONObject != null;
    }

    private boolean a(String str, String str2, tmv tmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("413089b3", new Object[]{this, str, str2, tmvVar})).booleanValue();
        }
        if (TextUtils.equals(str, "DXSearchBar")) {
            return a(tmvVar, str2);
        }
        return b(str, str2, tmvVar);
    }

    private boolean b(String str, String str2, tmv tmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40ba23b4", new Object[]{this, str, str2, tmvVar})).booleanValue();
        }
        IHomeSubTabController z = c.a().z();
        if (z == null) {
            return false;
        }
        z.passThroughData(tmvVar, str, str2);
        return true;
    }

    private boolean a(tmv tmvVar, String str) {
        IHomeSubTabController c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("543515a9", new Object[]{this, tmvVar, str})).booleanValue();
        }
        String c2 = c(str);
        if (TextUtils.isEmpty(c2) || (c = c.a().c(c2)) == null) {
            return false;
        }
        c.passThroughData(tmvVar, null, null);
        return true;
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        JSONObject d = sqg.d();
        String str2 = null;
        if (d == null) {
            return null;
        }
        List<JSONObject> b = sqg.b(d);
        for (int i = 0; i < b.size(); i++) {
            JSONObject jSONObject = b.get(i).getJSONObject("content");
            if (jSONObject != null && TextUtils.equals(jSONObject.getString("tabContentID"), str)) {
                str2 = jSONObject.getString("type");
            }
        }
        return str2;
    }

    private long a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("266fb7c", new Object[]{this, jSONObject})).longValue();
        }
        String string = jSONObject.getString("effectiveTime");
        if (TextUtils.isEmpty(string)) {
            ldf.d("PassThroughDataHandler", "effectiveTime == null");
            return -1L;
        }
        try {
            return Long.parseLong(string);
        } catch (Exception e) {
            ldf.d("PassThroughDataHandler", "出现异常: " + e);
            return -1L;
        }
    }
}
