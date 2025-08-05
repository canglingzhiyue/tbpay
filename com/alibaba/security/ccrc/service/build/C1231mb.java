package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.wukong.bx.algo.BxData;
import com.alibaba.security.wukong.bx.workconf.BaseWorkConfHandler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.alibaba.security.ccrc.service.build.mb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1231mb extends BaseWorkConfHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private int[] a(List<Long> list, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("3372e46b", new Object[]{this, list, new Long(j), new Long(j2)});
        }
        try {
            int binarySearch = Collections.binarySearch(list, Long.valueOf(j));
            int i = binarySearch < 0 ? -(binarySearch + 1) : binarySearch + 1;
            int binarySearch2 = Collections.binarySearch(list, Long.valueOf(j2));
            int i2 = binarySearch2 < 0 ? (-(binarySearch2 + 1)) - 1 : binarySearch2 - 1;
            if (i >= list.size() || i2 < i) {
                return null;
            }
            return new int[]{i, i2};
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ Object ipc$super(C1231mb c1231mb, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.security.wukong.bx.workconf.BaseWorkConfHandler
    public Map<String, Object> b(Map<String, Object> map, Map<String, Object> map2, List<BxData.OpConfItemValue> list) {
        int[] a2;
        IpChange ipChange = $ipChange;
        if (!(ipChange instanceof IpChange)) {
            Iterator<BxData.OpConfItemValue> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BxData.OpConfItemValue next = it.next();
                List<Long> a3 = BaseWorkConfHandler.a(map2.get(next.name));
                if (a3.isEmpty()) {
                    return map2;
                }
                if ("between".equals(next.op)) {
                    Map<String, String> map3 = (Map) JsonUtils.parseObject(next.input, (Class<Object>) Map.class);
                    if (map3 != null && !map3.isEmpty()) {
                        long a4 = a(map, map3, "begin");
                        long a5 = a(map, map3, "end");
                        if (a4 == 0 || a5 == 0 || a4 > a5 || (a2 = a(a3, a4, a5)) == null) {
                            return map2;
                        }
                        for (Map.Entry<String, Object> entry : map2.entrySet()) {
                            map2.put(entry.getKey(), a(a2[0], a2[1], entry.getValue()));
                        }
                    }
                }
            }
        } else {
            return (Map) ipChange.ipc$dispatch("b3d8fb2f", new Object[]{this, map, map2, list});
        }
    }

    public static List<Object> a(int i, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9c12d523", new Object[]{new Integer(i), new Integer(i2), obj});
        }
        try {
            List a2 = BaseWorkConfHandler.a(obj);
            return new ArrayList(a2.subList(i, i2 < a2.size() ? i2 + 1 : a2.size()));
        } catch (Throwable unused) {
            return null;
        }
    }

    private long a(Map<String, Object> map, Map<String, String> map2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e25c7386", new Object[]{this, map, map2, str})).longValue();
        }
        try {
            String str2 = map2.get(str);
            if (str2.startsWith("$.")) {
                return Long.parseLong(map.get(str2.substring(2)).toString());
            }
            return Long.parseLong(str2);
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
