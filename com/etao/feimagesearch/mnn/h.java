package com.etao.feimagesearch.mnn;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.NetConfig;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes3.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, f<?, ?>> f6780a;

    static {
        kge.a(-963377449);
        f6780a = new HashMap<>(10);
    }

    public static e<?, ?> a(NetConfig netConfig) {
        f<?, ?> fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("e1347497", new Object[]{netConfig});
        }
        if (netConfig != null && !StringUtils.isEmpty(netConfig.type) && (fVar = f6780a.get(netConfig.type)) != null) {
            return fVar.a(netConfig);
        }
        return null;
    }

    public static void a(String str, f<?, ?> fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af4438c", new Object[]{str, fVar});
        } else {
            f6780a.put(str, fVar);
        }
    }
}
