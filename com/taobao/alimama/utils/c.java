package com.taobao.alimama.utils;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.io.SharedPreferencesUtils;
import com.taobao.alimama.login.LoginManager;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import com.taobao.utils.ILoginInfoGetter;
import com.taobao.utils.LoginInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile List<String> f8468a;
    private static volatile List<String> b;
    private static boolean c;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ List a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{list});
        }
        b = list;
        return list;
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        c = z;
        return z;
    }

    public static /* synthetic */ void b(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{list});
        } else {
            c(list);
        }
    }

    public static /* synthetic */ List m() throws IllegalStateException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("3e0c1553", new Object[0]) : q();
    }

    public static /* synthetic */ List n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("25adebb2", new Object[0]) : f8468a;
    }

    public static /* synthetic */ List o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d4fc211", new Object[0]) : b;
    }

    static {
        kge.a(-1673371209);
        c = false;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : a("adv_cpm_crop_bitmap");
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : a("ad_nav_hook_enable");
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : a("ad_ifs_disk_filter_new");
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : a("ad_report_by_exposer");
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : l().contains(str);
    }

    public static List<String> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("566a3ef4", new Object[0]);
        }
        if (f8468a == null) {
            List<String> p = p();
            f8468a = p;
            b = p;
            OrangeConfig.getInstance().registerListener(new String[]{"alimama_ad"}, new g() { // from class: com.taobao.alimama.utils.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.g
                public void onConfigUpdate(String str, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                        return;
                    }
                    TaoLog.Logd(String.format("onConfigUpdate in getBucketOnFixedStatus, fromCache=%s", String.valueOf(z)));
                    c.a(c.m());
                    c.a(true);
                    if (c.o().equals(c.n())) {
                        return;
                    }
                    c.b(c.o());
                }
            });
        }
        return f8468a;
    }

    private static void c(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{list});
        } else if (list.isEmpty()) {
            SharedPreferencesUtils.removeKey("bucket");
        } else {
            SharedPreferencesUtils.putString("bucket", TextUtils.join("&", list));
        }
    }

    private static List<String> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f4f19870", new Object[0]);
        }
        String string = SharedPreferencesUtils.getString("bucket", "");
        if (TextUtils.isEmpty(string)) {
            return Collections.emptyList();
        }
        return Arrays.asList(string.split("&"));
    }

    private static List<String> q() throws IllegalStateException {
        JSONObject parseObject;
        LoginInfo lastLoginUserInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dc936ecf", new Object[0]);
        }
        long j = -1;
        ILoginInfoGetter a2 = LoginManager.a();
        if (a2 != null && (lastLoginUserInfo = a2.getLastLoginUserInfo()) != null && !TextUtils.isEmpty(lastLoginUserInfo.userId)) {
            try {
                j = Long.parseLong(lastLoginUserInfo.userId);
            } catch (NumberFormatException unused) {
            }
        }
        int i = j <= 0 ? 1000 : (int) (j % 1000);
        String config = OrangeConfig.getInstance().getConfig("alimama_ad", "bucket", "");
        ArrayList arrayList = new ArrayList();
        try {
            parseObject = JSONObject.parseObject(config);
        } catch (Exception unused2) {
        }
        if (parseObject == null) {
            return Collections.emptyList();
        }
        for (String str : parseObject.keySet()) {
            JSONArray jSONArray = parseObject.getJSONArray(str);
            for (String str2 : (String[]) jSONArray.toArray(new String[jSONArray.size()])) {
                String[] split = str2.split("-");
                if (split.length == 2) {
                    try {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (i >= parseInt && i <= parseInt2) {
                            arrayList.add(str);
                        }
                    } catch (NumberFormatException unused3) {
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
