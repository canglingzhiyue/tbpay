package com.alibaba.security.realidentity;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class a5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3362a = "statusBarView";
    public static final String b = "marginAdded";

    public static void a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb0489", new Object[]{activity, new Integer(i)});
            return;
        }
        Window window = activity.getWindow();
        window.addFlags(67108864);
        View childAt = ((ViewGroup) window.findViewById(16908290)).getChildAt(0);
        int a2 = a((Context) activity);
        a(activity);
        a(activity, i, a2);
        a(childAt, a2);
        if (childAt == null) {
            return;
        }
        childAt.setFitsSystemWindows(false);
    }

    public static void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{activity});
            return;
        }
        activity.getWindow().addFlags(67108864);
        View childAt = ((ViewGroup) activity.findViewById(16908290)).getChildAt(0);
        a(activity);
        b(childAt, a((Context) activity));
        if (childAt == null) {
            return;
        }
        childAt.setFitsSystemWindows(false);
    }

    public static void b(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f6b49da", new Object[]{view, new Integer(i)});
        } else if (view == null || !b.equals(view.getTag())) {
        } else {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.topMargin -= i;
            view.setLayoutParams(layoutParams);
            view.setTag(null);
        }
    }

    public static void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        View findViewWithTag = viewGroup.findViewWithTag(f3362a);
        if (findViewWithTag == null) {
            return;
        }
        viewGroup.removeView(findViewWithTag);
    }

    public static View a(Activity activity, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a5c1a55c", new Object[]{activity, new Integer(i), new Integer(i2)});
        }
        View view = new View(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i2);
        layoutParams.gravity = 48;
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(i);
        view.setTag(f3362a);
        ((ViewGroup) activity.getWindow().getDecorView()).addView(view);
        return view;
    }

    public static void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{view, new Integer(i)});
        } else if (view == null || b.equals(view.getTag())) {
        } else {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.topMargin += i;
            view.setLayoutParams(layoutParams);
            view.setTag(b);
        }
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelOffset(identifier);
    }
}
