package com.taobao.tao.messagekit.base;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-258662669);
    }

    public static long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{str})).longValue();
        }
        long j = 0;
        if (str == null) {
            return 0L;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length > 0) {
            for (char c : charArray) {
                j = (j * 31) + c;
            }
        }
        return j;
    }

    public static boolean a(int i, Map<String, Object> map, com.taobao.tao.messagekit.core.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d94f38b2", new Object[]{new Integer(i), map, aVar})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        aVar.a(i, map);
        return true;
    }
}
