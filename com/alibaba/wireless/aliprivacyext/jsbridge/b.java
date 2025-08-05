package com.alibaba.wireless.aliprivacyext.jsbridge;

import android.content.Context;
import com.alibaba.security.ccrc.service.build.C1215ha;
import com.alibaba.wireless.aliprivacyext.jsbridge.api.d;
import com.alibaba.wireless.aliprivacyext.jsbridge.api.e;
import com.alibaba.wireless.aliprivacyext.jsbridge.api.f;
import com.alibaba.wireless.aliprivacyext.jsbridge.api.g;
import com.alibaba.wireless.aliprivacyext.jsbridge.api.h;
import com.alibaba.wireless.aliprivacyext.jsbridge.api.i;
import com.alibaba.wireless.aliprivacyext.jsbridge.api.j;
import com.alibaba.wireless.aliprivacyext.jsbridge.api.k;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List<Class<? extends a>> f4245a;

    static {
        ArrayList arrayList = new ArrayList();
        f4245a = arrayList;
        arrayList.add(com.alibaba.wireless.aliprivacyext.jsbridge.api.b.class);
        f4245a.add(g.class);
        f4245a.add(com.alibaba.wireless.aliprivacyext.jsbridge.api.a.class);
        f4245a.add(f.class);
        f4245a.add(k.class);
        f4245a.add(com.alibaba.wireless.aliprivacyext.jsbridge.api.c.class);
        f4245a.add(h.class);
        f4245a.add(d.class);
        f4245a.add(i.class);
        f4245a.add(j.class);
        f4245a.add(e.class);
    }

    public static boolean a(Context context, String str, String str2, com.alibaba.wireless.aliprivacyext.plugins.b bVar) {
        com.alibaba.wireless.aliprivacy.c.a(C1215ha.a.f3308a, "action:" + str);
        com.alibaba.wireless.aliprivacy.c.a(C1215ha.a.f3308a, "params:" + str2);
        Iterator<Class<? extends a>> it = f4245a.iterator();
        while (true) {
            if (it.hasNext()) {
                Class<? extends a> next = it.next();
                String[] name = ((c) next.getAnnotation(c.class)).name();
                if (name != null && name.length > 0) {
                    for (String str3 : name) {
                        if (str3.equals(str)) {
                            try {
                                return next.newInstance().a(context, str, str2, bVar);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    continue;
                }
            } else {
                return false;
            }
        }
    }
}
