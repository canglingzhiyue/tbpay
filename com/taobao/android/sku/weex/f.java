package com.taobao.android.sku.weex;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static LinkedHashMap<String, WeakReference<d>> f15234a;

    static {
        kge.a(1884775386);
        f15234a = new LinkedHashMap<>();
    }

    public static void a(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0eab794", new Object[]{str, dVar});
        } else if (TextUtils.isEmpty(str) || dVar == null) {
        } else {
            f15234a.put(str, new WeakReference<>(dVar));
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (f15234a.isEmpty() || TextUtils.isEmpty(str)) {
        } else {
            f15234a.remove(str);
        }
    }

    public static d b(String str) {
        WeakReference<d> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("e84b6d29", new Object[]{str});
        }
        if (!f15234a.isEmpty() && !TextUtils.isEmpty(str) && (weakReference = f15234a.get(str)) != null) {
            return weakReference.get();
        }
        return null;
    }
}
