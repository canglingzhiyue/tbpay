package com.taobao.tao.infoflow.multitab;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.syc;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, b> f20634a;
    private static final Map<String, Class<?>> b;

    static {
        kge.a(1446353208);
        f20634a = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        b = concurrentHashMap;
        concurrentHashMap.put(syc.DX_CONTAINER, syc.class);
    }

    public static b a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String b2 = e.b(jSONObject);
        String c = e.c(jSONObject);
        if (!StringUtils.isEmpty(b2) && !StringUtils.isEmpty(c)) {
            String str = b2 + "_" + c;
            b bVar = f20634a.get(str);
            if (bVar != null) {
                return bVar;
            }
            Class<?> cls = b.get(c);
            if (cls == null) {
                return null;
            }
            try {
                b bVar2 = (b) cls.newInstance();
                f20634a.put(str, bVar2);
                return bVar2;
            } catch (Exception e) {
                g.a("ContainerProviderFactory", "createContainerProvider error: ", e);
            }
        }
        return null;
    }
}
