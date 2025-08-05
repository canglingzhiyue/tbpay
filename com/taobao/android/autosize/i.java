package com.taobao.android.autosize;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Pair;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.rwf;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/taobao/android/autosize/WindowMetricsCalculatorCompat;", "", "()V", "activityResourceIdsStatusBarHeight", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "computeCurrentWindowMetrics", "Landroid/graphics/Rect;", "activity", "Landroid/app/Activity;", WindvanePluginRegister.WVWindowInfoPlugin.ACTION_GET_STATUS_BAR_HEIGHT, "autosize_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes4.dex */
public final class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final i INSTANCE = new i();

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<String, Integer> f9112a = new ConcurrentHashMap<>();

    private i() {
    }

    @JvmStatic
    public static final Rect a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("28388f83", new Object[]{activity});
        }
        q.c(activity, "activity");
        Activity activity2 = activity;
        if (!l.d((Context) activity2) && !l.b((Context) activity2)) {
            Resources resources = activity.getResources();
            q.a((Object) resources, "activity.resources");
            int i = resources.getDisplayMetrics().widthPixels;
            Resources resources2 = activity.getResources();
            q.a((Object) resources2, "activity.resources");
            return new Rect(0, 0, i, resources2.getDisplayMetrics().heightPixels);
        }
        Window window = activity.getWindow();
        q.a((Object) window, "activity.window");
        if (window.getAttributes().width > 0) {
            Window window2 = activity.getWindow();
            q.a((Object) window2, "activity.window");
            WindowManager.LayoutParams attributes = window2.getAttributes();
            return new Rect(attributes.x, attributes.y, attributes.width + attributes.x, attributes.y + attributes.height);
        }
        Resources resources3 = activity.getResources();
        q.a((Object) resources3, "activity.resources");
        Configuration configuration = resources3.getConfiguration();
        Pair<Integer, Integer> d = f.d(activity2, false);
        int a2 = h.a(activity2, configuration.screenWidthDp);
        Object obj = d.first;
        q.a(obj, "it.first");
        Object obj2 = d.second;
        q.a(obj2, "it.second");
        if (q.a(((Number) obj).intValue() + a2, ((Number) obj2).intValue()) <= 0) {
            Object obj3 = d.first;
            q.a(obj3, "it.first");
            a2 += ((Number) obj3).intValue();
        }
        return new Rect(0, 0, a2, h.a(activity2, configuration.screenHeightDp) + b(activity));
    }

    @JvmStatic
    public static final int b(Activity activity) {
        Integer putIfAbsent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fdb366e", new Object[]{activity})).intValue();
        }
        q.c(activity, "activity");
        ConcurrentHashMap<String, Integer> concurrentHashMap = f9112a;
        String name = activity.getClass().getName();
        Integer num = concurrentHashMap.get(name);
        if (num == null && (putIfAbsent = concurrentHashMap.putIfAbsent(name, (num = Integer.valueOf(activity.getResources().getDimensionPixelSize(rwf.c(0, activity.getResources().getIdentifier("status_bar_height", "dimen", "android"))))))) != null) {
            num = putIfAbsent;
        }
        q.a((Object) num, "activityResourceIdsStatu…)\n            }\n        }");
        return num.intValue();
    }
}
