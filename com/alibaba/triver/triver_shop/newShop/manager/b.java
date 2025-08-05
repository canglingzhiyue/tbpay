package com.alibaba.triver.triver_shop.newShop.manager;

import android.app.Activity;
import android.view.View;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.ai;
import kotlin.j;
import tb.kge;

/* loaded from: classes3.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, String> f3871a;
    private static final ConcurrentHashMap<Activity, Pair<com.alibaba.triver.triver_shop.newShop.data.a, View>> b;

    private b() {
    }

    static {
        kge.a(-1757377644);
        INSTANCE = new b();
        f3871a = ai.c(j.a("hd_from_id", "tbshopmod-hd-task-visit-miniapp"));
        b = new ConcurrentHashMap<>();
    }

    public final void a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bb1504", new Object[]{this, activity, str});
        } else if (!com.alibaba.triver.triver_shop.newShop.ext.b.a(activity, str)) {
            for (Map.Entry<Activity, Pair<com.alibaba.triver.triver_shop.newShop.data.a, View>> entry : b.entrySet()) {
                if (!entry.getValue().getFirst().a(str)) {
                    o.d(entry.getValue().getSecond());
                } else {
                    o.b(entry.getValue().getSecond());
                }
            }
        }
    }

    public final void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else if (activity == null) {
        } else {
            b.remove(activity);
        }
    }
}
