package com.taobao.android.preload;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, h> f14691a = new ConcurrentHashMap();

    public static h a(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("114f0684", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
            return null;
        } else {
            if (!f14691a.containsKey(str)) {
                h hVar = new h();
                f14691a.put(str, hVar);
                return hVar;
            }
            obj = f14691a.get(str);
        }
        return (h) obj;
    }
}
