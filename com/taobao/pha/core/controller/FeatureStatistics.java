package com.taobao.pha.core.controller;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class FeatureStatistics {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, c> f18715a = new HashMap();

    /* loaded from: classes7.dex */
    public @interface FeatureNames {
        public static final String DATA_PREFETCH = "dataPrefetch";
        public static final String HTML_TEMPLATE = "template";
        public static final String MANIFEST_CACHE = "manifestCache";
        public static final String OFFLINE_RESOURCE = "offlineResource";
    }

    static {
        kge.a(228080605);
    }

    public FeatureStatistics() {
        this.f18715a.put(FeatureNames.DATA_PREFETCH, new a());
        this.f18715a.put("offlineResource", new a());
        this.f18715a.put(FeatureNames.MANIFEST_CACHE, new c());
        this.f18715a.put("template", new c());
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        c cVar = this.f18715a.get(str);
        if (!(cVar instanceof a)) {
            return;
        }
        ((a) cVar).a();
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        c cVar = this.f18715a.get(str);
        if (cVar == null) {
            return;
        }
        cVar.c();
    }

    public void a(String str, String str2, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8fe8090", new Object[]{this, str, str2, serializable});
            return;
        }
        c cVar = this.f18715a.get(str);
        if (cVar == null) {
            return;
        }
        cVar.a(str2, serializable);
    }

    public Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, c> entry : this.f18715a.entrySet()) {
            hashMap.put("pha_feat_" + entry.getKey(), entry.getValue().b());
        }
        return hashMap;
    }
}
