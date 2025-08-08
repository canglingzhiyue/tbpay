package com.alibaba.ability;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.a;
import kotlin.jvm.internal.q;
import tb.alv;
import tb.kge;

/* loaded from: classes2.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final h INSTANCE;

    static {
        kge.a(1732184558);
        INSTANCE = new h();
    }

    private h() {
    }

    public static /* synthetic */ Object a(h hVar, String str, String str2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5d22069e", new Object[]{hVar, str, str2, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        return hVar.a(str, str2);
    }

    public final Object a(String name, String nameSpace) {
        q.d(name, "name");
        q.d(nameSpace, "nameSpace");
        String b = b(name, nameSpace);
        if (StringUtils.isEmpty(b)) {
            return null;
        }
        try {
            return Class.forName(b).newInstance();
        } catch (Throwable th) {
            com.alibaba.ability.utils.c cVar = com.alibaba.ability.utils.c.INSTANCE;
            String name2 = getClass().getName();
            q.b(name2, "this.javaClass.name");
            cVar.a(name2, "加载能力实现类失败，错误原因：" + a.a(th));
            return null;
        }
    }

    public static /* synthetic */ String b(h hVar, String str, String str2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("871a46b", new Object[]{hVar, str, str2, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        return hVar.b(str, str2);
    }

    public final String b(String name, String nameSpace) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, name, nameSpace});
        }
        q.d(name, "name");
        q.d(nameSpace, "nameSpace");
        d.a();
        try {
            com.alibaba.ability.builder.c a2 = alv.a().a(name, nameSpace, "");
            return (a2 == null || !(a2 instanceof com.alibaba.ability.builder.f)) ? "" : ((com.alibaba.ability.builder.f) a2).c();
        } catch (Throwable th) {
            com.alibaba.ability.utils.c cVar = com.alibaba.ability.utils.c.INSTANCE;
            String name2 = getClass().getName();
            q.b(name2, "this.javaClass.name");
            cVar.a(name2, "获取能力实现类失败，错误原因：" + a.a(th));
            return "";
        }
    }
}
