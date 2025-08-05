package com.taobao.alimama.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import tb.kge;

/* loaded from: classes4.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1369319735);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(OrangeConfig.getInstance().getConfig("alimama_ad", str, String.valueOf(i)));
        } catch (Throwable th) {
            th.printStackTrace();
            return i;
        }
    }

    public static Set<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("bf40e8a1", new Object[]{str});
        }
        HashSet hashSet = new HashSet();
        try {
            JSONArray parseArray = JSON.parseArray(OrangeConfig.getInstance().getConfig("alimama_ad", str, ""));
            if (parseArray != null) {
                Iterator<Object> it = parseArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        hashSet.add((String) next);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashSet;
    }
}
