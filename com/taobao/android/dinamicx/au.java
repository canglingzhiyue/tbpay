package com.taobao.android.dinamicx;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.fqi;
import tb.fuw;
import tb.kge;

/* loaded from: classes5.dex */
public class au {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static com.taobao.android.dinamicx.widget.aj f11810a;
    public static boolean b;
    private static Map<String, List<String>> c;

    static {
        kge.a(430825573);
        c = new ConcurrentHashMap(5);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            String v = bx.v();
            if (TextUtils.isEmpty(v)) {
                return;
            }
            JSONObject parseObject = JSONObject.parseObject(v);
            for (String str : parseObject.keySet()) {
                JSONArray jSONArray = parseObject.getJSONArray(str);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.size(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
                c.put(str, arrayList);
            }
            b = true;
            Log.e("DinamicX", "本地开关上传成功" + v);
        } catch (Throwable th) {
            fuw.d("DinamicX", "ab 获取获取异常" + com.taobao.android.dinamicx.exception.a.a(th));
        }
    }

    public static boolean a(String str) {
        com.taobao.android.dinamicx.widget.aj ajVar;
        Map<String, Object> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (b) {
            return c.containsKey(str);
        }
        if (!fqi.aA() || TextUtils.isEmpty(str) || (ajVar = f11810a) == null || (a2 = ajVar.a("DXPerform", str)) == null) {
            return false;
        }
        Object obj = a2.get(str + "TemplateWhiteList");
        if (obj == null) {
            return false;
        }
        if (!TextUtils.isEmpty(obj.toString())) {
            c.put(str, Arrays.asList(obj.toString().trim().split(",")));
        }
        return true;
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        List<String> list = c.get(str);
        if (list == null) {
            return false;
        }
        for (String str3 : list) {
            if (str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (b) {
        } else {
            c.put(str, Arrays.asList(str2.trim().split(",")));
        }
    }
}
