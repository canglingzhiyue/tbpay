package com.ut.mini.module.plugin;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Map<String, Object>> f24131a;

    static {
        kge.a(-629480717);
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        Map<String, Map<String, Object>> map = this.f24131a;
        if (map != null) {
            return map.containsKey(str);
        }
        return false;
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (!a(str)) {
            return true;
        }
        Map<String, Object> map = this.f24131a.get(str);
        if (map != null) {
            return "1".equalsIgnoreCase((String) map.get("sync"));
        }
        return false;
    }

    public List<String> c(String str) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb209513", new Object[]{this, str});
        }
        if (!a(str) || (map = this.f24131a.get(str)) == null) {
            return null;
        }
        try {
            return (List) map.get("wk");
        } catch (Exception unused) {
            return null;
        }
    }

    public List<String> d(String str) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4c7331b2", new Object[]{this, str});
        }
        if (!a(str) || (map = this.f24131a.get(str)) == null) {
            return null;
        }
        try {
            return (List) map.get("utparam-cnt");
        } catch (Exception unused) {
            return null;
        }
    }
}
