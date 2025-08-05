package com.taobao.android.order.bundle.helper;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f14548a;
    private static final Map<String, Class<?>> b;

    static {
        kge.a(-929878885);
        f14548a = false;
        b = new HashMap();
    }

    public static Class<?> a(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("582938df", new Object[]{str});
        } else if (TextUtils.isEmpty(str) || !b.containsKey(str)) {
            return null;
        } else {
            obj = b.get(str);
        }
        return (Class) obj;
    }
}
