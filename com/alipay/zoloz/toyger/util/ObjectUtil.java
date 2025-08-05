package com.alipay.zoloz.toyger.util;

import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ObjectUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private ObjectUtil() {
    }

    public static HashMap<String, String> objectToStringMap(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("fbe758d7", new Object[]{obj});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            Map<String, Object> a2 = a(obj);
            if (a2 != null && !a2.isEmpty()) {
                for (Map.Entry<String, Object> entry : a2.entrySet()) {
                    String key = entry.getKey();
                    hashMap.put(key, "" + entry.getValue());
                }
            }
        } catch (Throwable th) {
            BioLog.w(th);
        }
        return hashMap;
    }

    private static Map<String, Object> a(Object obj) throws Exception {
        if (obj == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        if (declaredFields == null || declaredFields.length == 0) {
            declaredFields = obj.getClass().getFields();
        }
        for (Field field : declaredFields) {
            field.setAccessible(true);
            hashMap.put(field.getName(), field.get(obj));
        }
        return hashMap;
    }
}
