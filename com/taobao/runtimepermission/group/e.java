package com.taobao.runtimepermission.group;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes7.dex */
    public interface a {
        void a(d dVar);
    }

    /* loaded from: classes7.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f18994a;
        public final String b;
        public final String c;
        public final String d;

        public b(boolean z, String str, String str2, String str3) {
            this.f18994a = z;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }
    }

    public static d a(Context context, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("979a33f7", new Object[]{context, str, strArr});
        }
        if (context == null || StringUtils.isEmpty(str)) {
            return new d(false, null, "UNKNOWN_BIZ_ERROR", "The context or bizName parameter is empty");
        }
        if (strArr == null || strArr.length == 0) {
            return new d(false, null, "UNKNOWN_BIZ_ERROR", "The permissionKeys parameter is empty");
        }
        b a2 = a(strArr);
        if (!a2.f18994a) {
            return new d(false, null, a2.c, a2.d);
        }
        return com.taobao.runtimepermission.group.strategy.d.a(a2.b).a(context, str, strArr);
    }

    public static void a(c cVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596070b7", new Object[]{cVar, aVar});
        } else if (cVar.f18992a == null || cVar.b == null || cVar.b.length == 0) {
            aVar.a(new d(false, null, "UNKNOWN_BIZ_ERROR", "The context or permissionKeys parameter is empty"));
        } else {
            b a2 = a(cVar.b);
            if (!a2.f18994a) {
                aVar.a(new d(false, null, a2.c, a2.d));
            } else {
                com.taobao.runtimepermission.group.strategy.d.a(a2.b).a(cVar, aVar);
            }
        }
    }

    private static b a(String[] strArr) {
        String str;
        Set<String> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f34b8916", new Object[]{strArr});
        }
        String str2 = strArr[0];
        Map<String, Set<String>> a2 = com.taobao.runtimepermission.group.b.a();
        Iterator<String> it = a2.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                set = null;
                break;
            }
            str = it.next();
            set = a2.get(str);
            if (set != null && set.contains(str2)) {
                break;
            }
        }
        if (str == null) {
            return new b(false, null, "PERMISSIONS_INVALID", "The permission parameter is illegal");
        }
        for (int i = 1; i < strArr.length; i++) {
            if (!set.contains(strArr[i])) {
                return new b(false, null, "PERMISSIONS_GROUP_ERROR", "The permissions parameter is not in the same group of contents");
            }
        }
        return new b(true, str, null, null);
    }
}
