package com.alibaba.ariver.kernel.common.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class StringUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1796510291);
    }

    public static <K, V> String map2String(Map<K, V> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("41381ec9", new Object[]{map}) : (map == null || map.isEmpty()) ? "" : collection2String(map.entrySet());
    }

    public static <T> String collection2String(Collection<T> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cba37d03", new Object[]{collection});
        }
        StringBuilder sb = new StringBuilder();
        if (collection != null && !collection.isEmpty()) {
            sb.append(riy.BLOCK_START_STR);
            for (T t : collection) {
                if (t != null) {
                    sb.append(t.toString());
                    sb.append(",");
                }
            }
            int lastIndexOf = sb.lastIndexOf(",");
            if (-1 != lastIndexOf) {
                sb.deleteCharAt(lastIndexOf);
            }
            sb.append(riy.BLOCK_END_STR);
        }
        return sb.toString();
    }

    public static <T> String array2String(T[] tArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccd13300", new Object[]{tArr});
        }
        StringBuilder sb = new StringBuilder();
        if (tArr != null && tArr.length > 0) {
            sb.append(riy.ARRAY_START_STR);
            for (T t : tArr) {
                if (t != null) {
                    sb.append(t.toString());
                    sb.append(",");
                }
            }
            int lastIndexOf = sb.lastIndexOf(",");
            if (-1 != lastIndexOf) {
                sb.deleteCharAt(lastIndexOf);
            }
            sb.append(riy.ARRAY_END_STR);
        }
        return sb.toString();
    }

    public static boolean isEmpty(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("42ff03f2", new Object[]{charSequence})).booleanValue() : charSequence == null || charSequence.length() == 0;
    }
}
