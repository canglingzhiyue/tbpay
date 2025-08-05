package com.taobao.message.kit.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public final class CollectionUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CollectionUtil";

    /* loaded from: classes7.dex */
    public interface FuncMap<T, R> {
        R map(T t);
    }

    /* loaded from: classes7.dex */
    public interface Function2<T1, T2, R> {
        R map(T1 t1, T2 t2);
    }

    static {
        kge.a(-1128014279);
    }

    public static <R, T> Map<R, T> collectionToMap(Collection<T> collection, FuncMap<T, R> funcMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("67aef3b2", new Object[]{collection, funcMap});
        }
        if (collection == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (T t : collection) {
            hashMap.put(funcMap.map(t), t);
        }
        return hashMap;
    }

    public static <T, R> List<R> listConvert(List<T> list, FuncMap<T, R> funcMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d2494b18", new Object[]{list, funcMap});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            arrayList.add(funcMap.map(t));
        }
        return arrayList;
    }

    public static boolean isEmpty(Collection collection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1b35377f", new Object[]{collection})).booleanValue() : collection == null || collection.isEmpty();
    }

    public static boolean isEmpty(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("489e80ff", new Object[]{map})).booleanValue() : map == null || map.isEmpty();
    }

    public static int size(Collection collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("babc13ac", new Object[]{collection})).intValue();
        }
        if (collection != null && !collection.isEmpty()) {
            return collection.size();
        }
        return 0;
    }

    public static <T> T getOrNull(List<T> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8f5fe107", new Object[]{list, new Integer(i)});
        }
        if (i >= 0 && i < list.size()) {
            return list.get(i);
        }
        return null;
    }
}
