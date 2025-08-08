package com.taobao.android.detail.ttdetail.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.MappingKey;
import com.taobao.android.detail.ttdetail.data.meta.Merged;
import tb.kge;

/* loaded from: classes5.dex */
public class aj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-630764781);
    }

    public static <M extends Merged> M a(JSONObject jSONObject, Class<M> cls) {
        StringBuilder sb;
        String str;
        JSONObject a2;
        JSONObject jSONObject2;
        if (jSONObject == null || cls == null) {
            return null;
        }
        MappingKey mappingKey = (MappingKey) cls.getAnnotation(MappingKey.class);
        if (mappingKey == null) {
            sb = new StringBuilder();
            str = "getMergedData failed for not MappingKey annotation, in class: ";
        } else {
            String key = mappingKey.key();
            if (StringUtils.isEmpty(key)) {
                sb = new StringBuilder();
                str = "getMergedData failed with an empty MappingKey key(), in class: ";
            } else {
                JSONObject jSONObject3 = jSONObject.getJSONObject(key);
                if (jSONObject3 == null && (a2 = g.a(jSONObject)) != null && (jSONObject2 = a2.getJSONObject("meta")) != null) {
                    jSONObject3 = jSONObject2.getJSONObject(key);
                }
                if (jSONObject3 != null) {
                    try {
                        return cls.getConstructor(JSONObject.class).newInstance(jSONObject3);
                    } catch (Throwable th) {
                        i.a("GlobalDataUtils", "getMergedData failed for not M(JSONObject) constructor", th);
                        return null;
                    }
                }
                sb = new StringBuilder();
                sb.append("getMergedData failed with an empty mergedValue for key: '");
                sb.append(key);
                str = "', in class: ";
            }
        }
        sb.append(str);
        sb.append(cls);
        i.a("GlobalDataUtils", sb.toString());
        return null;
    }
}
