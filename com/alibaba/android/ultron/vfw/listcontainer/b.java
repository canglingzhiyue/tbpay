package com.alibaba.android.ultron.vfw.listcontainer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import tb.bpd;
import tb.jpx;
import tb.kge;

@Deprecated
/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2124571521);
    }

    public static void a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{recyclerView, new Integer(i)});
        } else {
            a(recyclerView, i, null);
        }
    }

    public static void a(RecyclerView recyclerView, int i, c cVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e521027", new Object[]{recyclerView, new Integer(i), cVar});
        } else if (!bpd.a(bpd.KEY_ENABLE_LIST_CONTAINER_SCROLLER, true)) {
        } else {
            String b = b(recyclerView, i);
            if ("none".equals(b)) {
                return;
            }
            if (cVar != null && cVar.b() != null) {
                z = true;
            }
            if (z) {
                a(recyclerView, i, cVar, b);
            } else {
                b(recyclerView, i, cVar, b);
            }
        }
    }

    private static void a(RecyclerView recyclerView, final int i, final c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba81e31", new Object[]{recyclerView, new Integer(i), cVar, str});
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1902702491) {
            if (hashCode != -1118274959) {
                if (hashCode == 1019002514 && str.equals(UltronScrollPositionType.afterLast)) {
                    c = 2;
                }
            } else if (str.equals(UltronScrollPositionType.beforeFirst)) {
                c = 0;
            }
        } else if (str.equals(UltronScrollPositionType.betweenFirstAndLast)) {
            c = 1;
        }
        if (c == 0) {
            a(recyclerView, i, cVar, true);
        } else if (c == 1) {
            a(recyclerView, i, recyclerView.getChildAt(Math.max(0, Math.min(recyclerView.getChildCount() - 1, i - recyclerView.getChildLayoutPosition(recyclerView.getChildAt(0))))).getTop(), cVar);
        } else if (c != 2) {
        } else {
            final boolean[] zArr = {false};
            recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.alibaba.android.ultron.vfw.listcontainer.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str2, Object... objArr) {
                    if (str2.hashCode() == 2142696127) {
                        super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                }

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView2, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView2, new Integer(i2)});
                        return;
                    }
                    super.onScrollStateChanged(recyclerView2, i2);
                    if (i2 != 0) {
                        return;
                    }
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        return;
                    }
                    zArr2[0] = false;
                    b.a(recyclerView2, i, cVar);
                    recyclerView2.removeOnScrollListener(this);
                }
            });
            zArr[0] = true;
            a(recyclerView, i, cVar, false);
        }
    }

    private static void a(RecyclerView recyclerView, int i, c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf0a78d", new Object[]{recyclerView, new Integer(i), cVar, new Boolean(z)});
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            UnifyLog.d("UltronListContainer", "layoutManager is null");
            return;
        }
        Interpolator b = cVar.b();
        a aVar = new a(recyclerView.getContext());
        if (z) {
            aVar.a(cVar.d());
        }
        aVar.a(cVar.c());
        aVar.setTargetPosition(i);
        aVar.a(b, b);
        layoutManager.startSmoothScroll(aVar);
    }

    private static void b(RecyclerView recyclerView, int i, c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b44810", new Object[]{recyclerView, new Integer(i), cVar, str});
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            UnifyLog.d("UltronListContainer", "layoutManager is null");
            return;
        }
        int a2 = cVar == null ? 0 : cVar.a();
        if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, a2);
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            ((StaggeredGridLayoutManager) layoutManager).scrollToPositionWithOffset(i, a2);
        } else if (jpx.a()) {
            throw new IllegalStateException("LayoutManager of RecyclerView must be LinearLayoutManager or StaggeredGridLayoutManager");
        } else {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1902702491) {
                if (hashCode != -1118274959) {
                    if (hashCode == 1019002514 && str.equals(UltronScrollPositionType.afterLast)) {
                        c = 1;
                    }
                } else if (str.equals(UltronScrollPositionType.beforeFirst)) {
                    c = 0;
                }
            } else if (str.equals(UltronScrollPositionType.betweenFirstAndLast)) {
                c = 2;
            }
            if (c == 0 || c == 1) {
                layoutManager.scrollToPosition(i);
            } else if (c != 2) {
            } else {
                recyclerView.scrollBy(0, recyclerView.getChildAt(Math.max(0, Math.min(recyclerView.getChildCount() - 1, i - recyclerView.getChildLayoutPosition(recyclerView.getChildAt(0))))).getTop() - a2);
            }
        }
    }

    private static void a(RecyclerView recyclerView, final int i, int i2, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ffdf270", new Object[]{recyclerView, new Integer(i), new Integer(i2), cVar});
            return;
        }
        final RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, cVar.a());
        ofInt.setDuration(cVar.c());
        Interpolator b = cVar.b();
        if (b != null) {
            ofInt.setInterpolator(b);
        }
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alibaba.android.ultron.vfw.listcontainer.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else if (!(RecyclerView.LayoutManager.this instanceof LinearLayoutManager)) {
                } else {
                    ((LinearLayoutManager) RecyclerView.LayoutManager.this).scrollToPositionWithOffset(i, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            }
        });
        ofInt.addListener(new AnimatorListenerAdapter() { // from class: com.alibaba.android.ultron.vfw.listcontainer.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                if (str.hashCode() == -2145066406) {
                    super.onAnimationEnd((Animator) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                super.onAnimationEnd(animator);
                d d = c.this.d();
                if (d == null) {
                    return;
                }
                d.a();
            }
        });
        ofInt.start();
    }

    private static String b(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bd97854", new Object[]{recyclerView, new Integer(i)});
        }
        int childCount = recyclerView.getChildCount();
        if (childCount == 0) {
            return "none";
        }
        return i < recyclerView.getChildLayoutPosition(recyclerView.getChildAt(0)) ? UltronScrollPositionType.beforeFirst : i <= recyclerView.getChildLayoutPosition(recyclerView.getChildAt(childCount - 1)) ? UltronScrollPositionType.betweenFirstAndLast : UltronScrollPositionType.afterLast;
    }
}
