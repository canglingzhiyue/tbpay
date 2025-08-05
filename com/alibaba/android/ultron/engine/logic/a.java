package com.alibaba.android.ultron.engine.logic;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Map<String, b>> f2555a = new HashMap();

    static {
        kge.a(-575347942);
    }

    public void a(String str, String str2, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24753347", new Object[]{this, str, str2, bVar});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || bVar == null) {
        } else {
            Map<String, b> map = this.f2555a.get(str);
            if (map == null) {
                map = new HashMap<>();
                this.f2555a.put(str, map);
            }
            map.put(str2, bVar);
        }
    }

    public b a(String str, String str2) {
        Map<String, b> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("57b3e96f", new Object[]{this, str, str2});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (map = this.f2555a.get(str)) != null) {
            return map.get(str2);
        }
        return null;
    }
}
