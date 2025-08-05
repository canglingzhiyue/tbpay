package com.alibaba.security.ccrc.common.util;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class JsonUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static <T> List<T> parseArray(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("bd8806e1", new Object[]{str, cls}) : JSON.parseArray(str, cls);
    }

    public static <T> T parseObject(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7e42d1b8", new Object[]{str, cls});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (T) JSON.parseObject(str, cls);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String toJSONString(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57f6b409", new Object[]{obj}) : obj == null ? "" : JSON.toJSONString(obj, SerializerFeature.DisableCircularReferenceDetect);
    }

    public static Map<String, Object> toMap(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3dd3e5f9", new Object[]{obj});
        }
        if (obj instanceof String) {
            return (Map) parseObject((String) obj, (Class<Object>) Map.class);
        }
        return (Map) JSON.toJSON(obj);
    }

    public static <T> T parseObject(String str, Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("5064a320", new Object[]{str, type});
        }
        if (!TextUtils.isEmpty(str)) {
            return (T) JSON.parseObject(str, type, new Feature[0]);
        }
        return null;
    }
}
