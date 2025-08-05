package com.alibaba.android.split.scene;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class d implements h<InputStream, Map> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private InputStream f2497a;

    static {
        kge.a(-338613809);
        kge.a(-2060263625);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    @Override // com.alibaba.android.split.scene.h
    public /* synthetic */ Map b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : a();
    }

    @Override // com.alibaba.android.split.scene.h
    public void a(Context context, i<InputStream> iVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de3a31b", new Object[]{this, context, iVar, str});
        } else {
            this.f2497a = iVar.b(context, str);
        }
    }

    public Map a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        try {
            byte[] bArr = new byte[this.f2497a.available()];
            this.f2497a.read(bArr);
            for (FeatureNode featureNode : JSON.parseArray(new String(bArr), FeatureNode.class)) {
                if (featureNode.activities != null && featureNode.activities.size() > 0) {
                    for (String str : featureNode.activities) {
                        if (hashMap.containsKey(str)) {
                            ((Map) hashMap.get(str)).put(featureNode.tabName, featureNode.dependsOn);
                        } else {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(featureNode.tabName, featureNode.dependsOn);
                            hashMap.put(str, hashMap2);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashMap;
    }
}
