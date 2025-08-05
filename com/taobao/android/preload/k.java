package com.taobao.android.preload;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, j> f14693a = new ConcurrentHashMap();

    public static j a(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("114f06c2", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            if (!f14693a.containsKey(str)) {
                j jVar = new j();
                f14693a.put(str, jVar);
                return jVar;
            }
            obj = f14693a.get(str);
        }
        return (j) obj;
    }
}
