package com.alibaba.android.umbrella.link.export;

import com.alibaba.android.umbrella.link.j;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public enum UMDimKey {
    DIM_1("umb21"),
    DIM_2("umb22"),
    DIM_3("umb23"),
    DIM_4("umb24"),
    DIM_5("umb25"),
    DIM_6("umb26"),
    DIM_7("umb27"),
    DIM_8("umb28"),
    DIM_9("umb29"),
    DIM_10("umb30"),
    TAG_1("umb31"),
    TAG_2("umb32"),
    TAG_3("umb33"),
    TAG_4("umb34"),
    TAG_5("umb35");
    
    private static volatile Map<String, UMDimKey> sDimKeyMap;
    private final String key;

    UMDimKey(String str) {
        this.key = str;
    }

    public static Map<UMDimKey, Object> convertRawMap(Map<String, Object> map) {
        UMDimKey findDimKey;
        if (map == null || map.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry != null) {
                String key = entry.getKey();
                if (!j.a(key) && (findDimKey = findDimKey(key)) != null) {
                    Object value = entry.getValue();
                    if (value == null) {
                        value = "empty";
                    }
                    hashMap.put(findDimKey, value);
                }
            }
        }
        return hashMap;
    }

    public static UMDimKey findDimKey(String str) {
        return getDimKeyMap().get(str);
    }

    private static Map<String, UMDimKey> getDimKeyMap() {
        UMDimKey[] values;
        if (sDimKeyMap == null) {
            synchronized (UMDimKey.class) {
                if (sDimKeyMap == null) {
                    sDimKeyMap = new ConcurrentHashMap();
                    for (UMDimKey uMDimKey : values()) {
                        sDimKeyMap.put(uMDimKey.getUmbName(), uMDimKey);
                    }
                }
            }
        }
        return sDimKeyMap;
    }

    public String getUmbName() {
        return this.key;
    }
}
