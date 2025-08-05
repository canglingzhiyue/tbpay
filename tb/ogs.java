package tb;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.a;
import com.taobao.tao.flexbox.layoutmanager.core.ab;

/* loaded from: classes8.dex */
public class ogs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_DURATION = 300;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f32044a;

    static {
        kge.a(-1711841935);
    }

    public static Animation a(String str) {
        TranslateAnimation translateAnimation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("9a44c324", new Object[]{str});
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1383228885:
                if (str.equals("bottom")) {
                    c = 0;
                    break;
                }
                break;
            case 115029:
                if (str.equals("top")) {
                    c = 1;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 2;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        } else if (c == 1) {
            translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
        } else if (c == 2) {
            translateAnimation = new TranslateAnimation(1, -1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        } else {
            translateAnimation = c != 3 ? null : new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        }
        if (translateAnimation != null) {
            translateAnimation.setDuration(300L);
        }
        return translateAnimation;
    }

    public static Animation b(String str) {
        TranslateAnimation translateAnimation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("9b7b1603", new Object[]{str});
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1383228885:
                if (str.equals("bottom")) {
                    c = 0;
                    break;
                }
                break;
            case 115029:
                if (str.equals("top")) {
                    c = 1;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 2;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        } else if (c == 1) {
            translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
        } else if (c == 2) {
            translateAnimation = new TranslateAnimation(1, 0.0f, 1, -1.0f, 1, 0.0f, 1, 0.0f);
        } else {
            translateAnimation = c != 3 ? null : new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
        }
        if (translateAnimation != null) {
            translateAnimation.setDuration(300L);
            translateAnimation.setFillAfter(true);
        }
        return translateAnimation;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (f32044a == null) {
            Context a2 = ab.a();
            if (a.a().w() != null && a.a().w().a(a2) != null) {
                if (a.a().w().a(a2).getIntValue("deviceLevel") == 2) {
                    z = true;
                }
                f32044a = Boolean.valueOf(z);
            }
        }
        return f32044a.booleanValue();
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
        } else if (view == null) {
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                view.resetPivot();
                return;
            }
            view.setPivotX(view.getMeasuredWidth() / 2.0f);
            view.setPivotY(view.getMeasuredHeight() / 2.0f);
        }
    }
}
