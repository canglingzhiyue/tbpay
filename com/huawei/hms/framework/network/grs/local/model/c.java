package com.huawei.hms.framework.network.grs.local.model;

import mtopsdk.common.util.StringUtils;
import com.huawei.hms.framework.common.Logger;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private String f7445a;
    private final Map<String, d> b = new ConcurrentHashMap(16);
    private List<b> c = new ArrayList(16);

    public d a(String str) {
        if (StringUtils.isEmpty(str)) {
            Logger.w(Dispatchers.TYPE_SERVICE, "In servings.getServing(String groupId), the groupId is Empty or null");
            return null;
        }
        return this.b.get(str);
    }

    public List<b> a() {
        return this.c;
    }

    public void a(String str, d dVar) {
        if (StringUtils.isEmpty(str) || dVar == null) {
            return;
        }
        this.b.put(str, dVar);
    }

    public void a(List<b> list) {
        this.c = list;
    }

    public String b() {
        return this.f7445a;
    }

    public void b(String str) {
    }

    public void c(String str) {
        this.f7445a = str;
    }
}
