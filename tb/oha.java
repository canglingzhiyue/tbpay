package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.graphics.ColorUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class oha {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f32049a;
    public static String b;

    /* loaded from: classes8.dex */
    public interface a {
        void onBack(String str);

        void onFinish(String str, float f);

        void onMove(String str);
    }

    static {
        kge.a(589058697);
        f32049a = "type_drag_layout";
        b = "type_sliding_layout";
    }

    public static Animator a(final Activity activity, long j, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("a49df3e9", new Object[]{activity, new Long(j), new Float(f), new Float(f2)});
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f, f2).setDuration(j);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.oha.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else {
                    oha.a(activity, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                }
            }
        });
        return duration;
    }

    public static void a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb0489", new Object[]{activity, new Integer(i)});
        } else {
            a(activity, i, 0, 0, 0, -1);
        }
    }

    private static void a(Activity activity, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b29c0c9", new Object[]{activity, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else {
            a(activity, Color.argb(i, i2, i3, i4), i5);
        }
    }

    public static void a(Activity activity, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca5ff9a", new Object[]{activity, new Integer(i), new Integer(i2)});
        } else {
            b(activity, ColorUtils.compositeColors(i, i2));
        }
    }

    public static void b(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb8c0be8", new Object[]{activity, new Integer(i)});
        } else if (Build.VERSION.SDK_INT < 21 || a(activity) == i) {
        } else {
            activity.getWindow().setNavigationBarColor(i);
        }
    }

    public static int a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68a25ad", new Object[]{activity})).intValue();
        }
        if (activity != null && Build.VERSION.SDK_INT >= 21) {
            return activity.getWindow().getNavigationBarColor();
        }
        return 1;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : f32049a.equals(str);
    }
}
