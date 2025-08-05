package com.taobao.vpm.pixai;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class MapAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Map<String, String> getMapParams() {
        Class<?> cls = getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        Field[] declaredFields = cls.getDeclaredFields();
        Field[] declaredFields2 = superclass.getDeclaredFields();
        if (declaredFields == null || declaredFields.length == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        try {
            for (Field field : declaredFields) {
                field.setAccessible(true);
                hashMap.put(field.getName(), String.valueOf(field.get(this)));
            }
            for (Field field2 : declaredFields2) {
                field2.setAccessible(true);
                hashMap.put(field2.getName(), String.valueOf(field2.get(this)));
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }
}
