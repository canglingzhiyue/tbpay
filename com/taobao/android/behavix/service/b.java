package com.taobao.android.behavix.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.behavixswitch.e;
import com.taobao.android.behavix.utils.g;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.dro;
import tb.ief;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList<ief> f9204a;

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final b f9205a;

        static {
            kge.a(-1440684239);
            f9205a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("477a27ce", new Object[0]) : f9205a;
        }
    }

    static {
        kge.a(1071495774);
    }

    private b() {
        this.f9204a = new CopyOnWriteArrayList<>();
    }

    public static final b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("477a27ce", new Object[0]) : a.a();
    }

    private void b() {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        JSONArray jSONArray = null;
        if (com.taobao.application.common.c.a().a("deviceLevel", -1) == 2) {
            a2 = e.a().a(com.taobao.android.behavix.behavixswitch.a.ORANGE_GROUP_NAME, "dbSaveFilter", null);
        } else {
            a2 = e.a().a(com.taobao.android.behavix.behavixswitch.a.ORANGE_GROUP_NAME, "dbMHSaveFilter", null);
        }
        try {
            jSONArray = JSON.parseArray(a2);
        } catch (Throwable unused) {
        }
        if (g.a(jSONArray)) {
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            ief iefVar = (ief) jSONArray.getObject(i, ief.class);
            if (iefVar != null) {
                this.f9204a.add(iefVar);
            }
        }
    }

    public boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{this, str, str2, str3})).booleanValue();
        }
        if (dro.j()) {
            return false;
        }
        if (g.a(this.f9204a)) {
            b();
        }
        if (g.a(this.f9204a)) {
            return true;
        }
        Iterator<ief> it = this.f9204a.iterator();
        while (it.hasNext()) {
            ief next = it.next();
            List<String> list = next.f28962a;
            List<String> list2 = next.b;
            List<String> list3 = next.c;
            if (g.a(list)) {
                return false;
            }
            if (g.a(list2) || list2.contains(str2)) {
                if (g.a(list) || list.contains(str)) {
                    if (g.a(list3) || list3.contains(str3)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
