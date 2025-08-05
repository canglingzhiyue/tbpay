package com.taobao.oversea.baobao.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.support.v4.util.LruCache;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static LruCache<String, Long> f18642a = new LruCache<>(10);

    public static /* synthetic */ LruCache a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LruCache) ipChange.ipc$dispatch("9326d4ce", new Object[0]) : f18642a;
    }

    public static Animator a(View view, int i, PropertyValuesHolder... propertyValuesHolderArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("21787556", new Object[]{view, new Integer(i), propertyValuesHolderArr});
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
        ofPropertyValuesHolder.setDuration(i);
        ofPropertyValuesHolder.setInterpolator(new AccelerateInterpolator());
        return ofPropertyValuesHolder;
    }

    public static void a(final String str, final List<Animator> list, final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d63021", new Object[]{str, list, runnable});
            return;
        }
        final Long valueOf = Long.valueOf(System.currentTimeMillis());
        f18642a.put(str, valueOf);
        final int size = list.size() - 1;
        for (int i = 0; i <= size; i++) {
            final int i2 = i;
            list.get(i).addListener(new AnimatorListenerAdapter() { // from class: com.taobao.oversea.baobao.view.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else if (!valueOf.equals(a.a().get(str))) {
                    } else {
                        int i3 = i2;
                        if (i3 != size) {
                            ((Animator) list.get(i3 + 1)).start();
                            return;
                        }
                        Runnable runnable2 = runnable;
                        if (runnable2 == null) {
                            return;
                        }
                        runnable2.run();
                    }
                }
            });
        }
        list.get(0).start();
    }
}
