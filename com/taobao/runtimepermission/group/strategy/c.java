package com.taobao.runtimepermission.group.strategy;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.group.a;
import com.taobao.runtimepermission.group.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class c extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f18995a;
    private final Map<String, String> b;

    public c(Map<String, String> map, boolean z) {
        this.f18995a = z;
        this.b = map;
    }

    @Override // com.taobao.runtimepermission.group.a
    public com.taobao.runtimepermission.group.d a(Context context, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.runtimepermission.group.d) ipChange.ipc$dispatch("979a33f7", new Object[]{this, context, str, strArr});
        }
        if (this.f18995a) {
            return new com.taobao.runtimepermission.group.d(true, a(strArr), null, null);
        }
        Map<String, String> map = this.b;
        if (map == null) {
            return new com.taobao.runtimepermission.group.d(false, null, "UNKNOWN_BIZ_ERROR", "stub");
        }
        return a(context, str, strArr, map);
    }

    @Override // com.taobao.runtimepermission.group.a
    public void a(com.taobao.runtimepermission.group.c cVar, e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596070b7", new Object[]{this, cVar, aVar});
        } else if (this.f18995a) {
            aVar.a(new com.taobao.runtimepermission.group.d(true, a(cVar.b), null, null));
        } else {
            Map<String, String> map = this.b;
            if (map == null) {
                aVar.a(new com.taobao.runtimepermission.group.d(false, null, "UNKNOWN_BIZ_ERROR", "stub"));
            } else {
                a(cVar, aVar, map);
            }
        }
    }

    private static Map<String, String> a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("78cf35ac", new Object[]{strArr});
        }
        HashMap hashMap = new HashMap(strArr.length);
        for (String str : strArr) {
            hashMap.put(str, "AUTHORIZED");
        }
        return hashMap;
    }
}
