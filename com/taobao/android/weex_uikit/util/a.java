package com.taobao.android.weex_uikit.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<o> f16155a;
    private List<AnimatorSet> b;
    private AnimatorSet c;
    private boolean d;
    private boolean e;
    private int f = -1;

    static {
        kge.a(770312219);
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9790ecb", new Object[]{aVar});
        } else {
            aVar.c();
        }
    }

    public a(List<AnimatorSet> list, ArrayList<o> arrayList) {
        this.b = list;
        this.f16155a = arrayList;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.d) {
            this.d = true;
            for (AnimatorSet animatorSet : this.b) {
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.weex_uikit.util.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        } else {
                            a.a(a.this);
                        }
                    }
                });
            }
            c();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.e || this.f >= this.b.size() - 1) {
        } else {
            List<AnimatorSet> list = this.b;
            int i = this.f + 1;
            this.f = i;
            this.c = list.get(i);
            AnimatorSet animatorSet = this.c;
            if (animatorSet == null) {
                return;
            }
            animatorSet.start();
        }
    }

    public void b() {
        AnimatorSet animatorSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.e = true;
        ArrayList<o> arrayList = this.f16155a;
        if (arrayList != null) {
            Iterator<o> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }
        if (!this.d || (animatorSet = this.c) == null) {
            return;
        }
        animatorSet.end();
    }
}
