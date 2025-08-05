package com.taobao.android.home.component.utils;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.tao.Globals;
import com.taobao.tao.image.ImageStrategyConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "home.pageUtils";

    /* renamed from: a  reason: collision with root package name */
    private static ImageStrategyConfig f12728a;
    private static ImageStrategyConfig b;
    private static Map<String, String> c;
    private static String d;

    static {
        kge.a(173146390);
        f12728a = ImageStrategyConfig.a("home", 5111).a();
        b = ImageStrategyConfig.a("home", 5112).a();
        c = new ConcurrentHashMap(8);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return a(messageDigest);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String a(MessageDigest messageDigest) {
        byte[] digest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18fff0f0", new Object[]{messageDigest});
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : messageDigest.digest()) {
            sb.append(Integer.toHexString((b2 >> 4) & 15));
            sb.append(Integer.toHexString(b2 & 15));
        }
        return sb.toString();
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            d = str;
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        if (TextUtils.isEmpty(d)) {
            PositionInfo b2 = com.taobao.android.editionswitcher.l.b(Globals.getApplication());
            if ("CN".equalsIgnoreCase(b2.editionCode)) {
                d = "main";
            } else if ("CUN".equalsIgnoreCase(b2.editionCode)) {
                d = h.HOMEPAGE_CTAO;
            } else if ("OLD".equalsIgnoreCase(b2.editionCode)) {
                d = "old";
            } else {
                d = h.HOMEPAGE_HTAO;
            }
        }
        return d;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (TextUtils.isEmpty(str) || str2 == null) {
        } else {
            c.put(str, str2);
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            c.remove(str);
        }
    }

    public static void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("clickParam")) == null) {
        } else {
            a(a(), jSONObject2.getString("clickSubmitParams"));
        }
    }

    public static String b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{jSONObject}) : (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("args")) == null) ? "0" : jSONObject2.getString("dataFlag");
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue() : !"1".equals(str);
    }
}
