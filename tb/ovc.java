package tb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public class ovc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f32448a;
    public String b;
    public String c;
    private String d;
    private String e;
    private Uri f;
    private HashMap<String, String> g;
    private String h;
    private final Map<String, String> i = new HashMap();

    static {
        kge.a(1401902080);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.d;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.e;
    }

    public HashMap<String, String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("52df8a4d", new Object[]{this}) : this.g;
    }

    public Map<String, String> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.i;
    }

    private ovc() {
    }

    public static ovc a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ovc) ipChange.ipc$dispatch("c3952e5", new Object[]{intent});
        }
        ovc ovcVar = new ovc();
        if (intent == null) {
            return ovcVar;
        }
        Uri data = intent.getData();
        HashMap<String, String> hashMap = new HashMap<>();
        if (data != null) {
            String a2 = a(data.toString());
            if (!TextUtils.isEmpty(a2)) {
                ovcVar.d = a2;
            }
            String str = "";
            for (String str2 : data.getQueryParameterNames()) {
                String queryParameter = data.getQueryParameter(str2);
                if ("id".equals(str2) || "item_id".equals(str2)) {
                    ovcVar.d = queryParameter;
                } else if ("skuId".equals(str2)) {
                    ovcVar.e = queryParameter;
                    str = str + "&skuId=" + queryParameter;
                } else if ("bizName".equals(str2)) {
                    ovcVar.f32448a = queryParameter;
                    str = str + "&bizName=" + queryParameter;
                } else if ("exParams".equals(str2)) {
                    ovcVar.b = queryParameter;
                    str = str + "&exParams=" + queryParameter;
                } else {
                    hashMap.put(str2, queryParameter);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                ovcVar.c = str.substring(1);
            }
        }
        if (TextUtils.isEmpty(ovcVar.d)) {
            ovcVar.d = intent.getStringExtra("id");
            if (TextUtils.isEmpty(ovcVar.a())) {
                ovcVar.d = intent.getStringExtra("item_id");
            }
        }
        if (TextUtils.isEmpty(ovcVar.f32448a)) {
            ovcVar.f32448a = intent.getStringExtra("bizName");
        }
        if (TextUtils.isEmpty(ovcVar.b)) {
            ovcVar.b = intent.getStringExtra("exParams");
        }
        if (TextUtils.isEmpty(ovcVar.e)) {
            ovcVar.e = intent.getStringExtra("skuId");
        }
        ovcVar.f = data;
        Bundle extras = intent.getExtras();
        if (extras != null && !extras.isEmpty()) {
            for (String str3 : extras.keySet()) {
                ovcVar.i.put(str3, String.valueOf(extras.get(str3)));
            }
            ovcVar.h = extras.getString(e.REQUEST_ID);
        }
        hashMap.put("itemNumId", ovcVar.a());
        ovcVar.g = hashMap;
        return ovcVar;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        Matcher matcher = Pattern.compile("//a\\.(?:m|wapa|waptest)\\.(?:taobao|tmall)\\.com/sku(\\d+)\\.htm").matcher(str);
        return matcher.find() ? matcher.group(1) : "";
    }
}
