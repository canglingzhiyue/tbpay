package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.core.animation.data.AnimatorObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class kbh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_DURATION_TIME = 300;
    public static final String DEFAULT_ORITATION_BOTTOM = "bottom";
    public static final String DEFAULT_ORITATION_LEFT = "left";
    public static final String DEFAULT_ORITATION_RIGHT = "right";
    public static final String DEFAULT_ORITATION_UP = "top";
    public static final String TYPE_ALPHA_END = "TYPE_ALPHA_END";
    public static final String TYPE_ALPHA_START = "TYPE_ALPHA_START";
    public static final String TYPE_SCALE_END = "TYPE_SCALE_END";
    public static final String TYPE_SCALE_START = "TYPE_SCALE_START";
    public static final String TYPE_TRANSLATION_END1 = "TYPE_TRANSLATION_END1";
    public static final String TYPE_TRANSLATION_START1 = "TYPE_TRANSLATION_START1";

    static {
        kge.a(1546278222);
    }

    public static Animator a(List<AnimatorObject> list, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("c8bd617a", new Object[]{list, view});
        }
        if (list != null && !list.isEmpty()) {
            return c(list, view);
        }
        return null;
    }

    public static Animator b(List<AnimatorObject> list, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("a47edd3b", new Object[]{list, view});
        }
        if (list != null && !list.isEmpty()) {
            return d(list, view);
        }
        return null;
    }

    private static Animator c(List<AnimatorObject> list, View view) {
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("804058fc", new Object[]{list, view});
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (list == null || list.isEmpty() || view == null) {
            return null;
        }
        Map<String, Integer> a2 = a(view);
        if (a2 != null) {
            i2 = a2.get("parentWidth").intValue();
            i = a2.get("parentHeight").intValue();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (AnimatorObject animatorObject : list) {
            Animator a3 = a(animatorObject, view, i2, i);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        if (arrayList.size() > 0) {
            animatorSet.playTogether(arrayList);
        }
        return animatorSet;
    }

    private static Animator d(List<AnimatorObject> list, View view) {
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("5c01d4bd", new Object[]{list, view});
        }
        AnimatorSet animatorSet = new AnimatorSet();
        Map<String, Integer> a2 = a(view);
        if (a2 != null) {
            i2 = a2.get("parentWidth").intValue();
            i = a2.get("parentHeight").intValue();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (AnimatorObject animatorObject : list) {
            Animator a3 = a(animatorObject, view, i2, i);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        if (arrayList.size() > 0) {
            animatorSet.playTogether(arrayList);
        }
        return animatorSet;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
        if (r5.equals("TYPE_TRANSLATION_START2") != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.animation.Animator a(com.taobao.avplayer.core.animation.data.AnimatorObject r16, android.view.View r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kbh.a(com.taobao.avplayer.core.animation.data.AnimatorObject, android.view.View, int, int):android.animation.Animator");
    }

    private static Animator a(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("87886e8b", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4)});
        }
        ArrayList arrayList = new ArrayList();
        if (f != f2) {
            ObjectAnimator objectAnimator = new ObjectAnimator();
            objectAnimator.setFloatValues(f, f2);
            objectAnimator.setPropertyName("translationX");
            arrayList.add(objectAnimator);
        }
        if (f3 != f4) {
            ObjectAnimator objectAnimator2 = new ObjectAnimator();
            objectAnimator2.setFloatValues(f3, f4);
            objectAnimator2.setPropertyName("translationY");
            arrayList.add(objectAnimator2);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    private static Map<String, Integer> a(View view) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7904b41f", new Object[]{view});
        }
        HashMap hashMap = new HashMap();
        if (view.getParent() != null && (view.getParent() instanceof View)) {
            View view2 = (View) view.getParent();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                i2 = layoutParams.width;
                i = layoutParams.height;
            } else {
                i = 0;
                i2 = 0;
            }
            if (i2 <= 0 || i <= 0) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                i2 = view2.getMeasuredWidth();
                i = view2.getMeasuredHeight();
            }
            hashMap.put("parentWidth", Integer.valueOf(i2));
            hashMap.put("parentHeight", Integer.valueOf(i));
        }
        return hashMap;
    }
}
