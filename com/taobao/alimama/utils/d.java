package com.taobao.alimama.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, d> f8469a;
    private String b;
    private List<String> c = new ArrayList();
    private Map<String, String> d = new HashMap();

    static {
        kge.a(717722054);
    }

    private d(String str) {
        this.b = str;
    }

    public static d a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("af88e8a9", new Object[]{str});
        }
        d dVar = new d(str);
        if (f8469a == null) {
            f8469a = new HashMap();
        }
        f8469a.put(str, dVar);
        return dVar;
    }

    public static d b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("a1328ec8", new Object[]{str});
        }
        Map<String, d> map = f8469a;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public static d c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("92dc34e7", new Object[]{str});
        }
        d b = b(str);
        return b != null ? b : a(str);
    }

    public d a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("fded86fc", new Object[]{this, str, objArr});
        }
        if (objArr != null && objArr.length > 0) {
            str = String.format("%s:%s", str, StringUtils.join(":", objArr));
        }
        if (this.c.size() >= 128) {
            this.c.remove(0);
        }
        this.c.add(str);
        return this;
    }
}
