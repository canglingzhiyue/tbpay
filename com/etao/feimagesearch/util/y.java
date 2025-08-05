package com.etao.feimagesearch.util;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes4.dex */
public final class y {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final y INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static int f7038a;

    static {
        kge.a(837432707);
        INSTANCE = new y();
    }

    private y() {
    }

    public final Integer a(AppCompatActivity activity) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("d65e808", new Object[]{this, activity});
        }
        kotlin.jvm.internal.q.c(activity, "activity");
        View findViewById = activity.findViewById(R.id.action_bar);
        if (findViewById != null) {
            i = findViewById.getHeight();
            if (i == 0) {
                i = f7038a;
            } else {
                f7038a = i;
            }
        }
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            activity.getTheme().resolveAttribute(16843499, typedValue, true);
            i = activity.getResources().getDimensionPixelSize(typedValue.resourceId);
        }
        if (i == 0) {
            i = 182;
        }
        f7038a = i;
        return Integer.valueOf(i);
    }

    public final Integer a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("daf78a61", new Object[]{this, activity});
        }
        kotlin.jvm.internal.q.c(activity, "activity");
        Resources resources = activity.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return null;
        }
        return Integer.valueOf(resources.getDimensionPixelSize(identifier));
    }
}
