package com.etao.feimagesearch.ui.coordinatorcard;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.RectF;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import tb.cov;
import tb.ctl;
import tb.ctm;
import tb.ctq;
import tb.kge;

/* loaded from: classes3.dex */
public final class CoordinatorCardView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final List<Animator> animList;
    private final Map<String, ctl> cardLayoutStrategies;
    private final Map<String, RectF> cardLocateRecords;
    private final b cardManager;
    private float cardMarginLeft;
    private float cardMarginTop;
    private final Map<String, ctq> cardRecords;
    private boolean needReMeasure;
    private RectF parentOriginalEdge;
    private int regionRationHeight;
    private int regionRationWidth;
    private float rootScale;
    private float rootTranslationX;
    private float rootTranslationY;

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ View c;
        public final /* synthetic */ ctq d;

        public a(int i, View view, ctq ctqVar) {
            this.b = i;
            this.c = view;
            this.d = ctqVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Animator access$getBigCardAnim = this.b == 1 ? CoordinatorCardView.access$getBigCardAnim(CoordinatorCardView.this, this.c) : CoordinatorCardView.access$getSmallCardAnim(CoordinatorCardView.this, this.c, this.d.a());
            access$getBigCardAnim.addListener(new Animator.AnimatorListener() { // from class: com.etao.feimagesearch.ui.coordinatorcard.CoordinatorCardView.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    List access$getAnimList$p = CoordinatorCardView.access$getAnimList$p(CoordinatorCardView.this);
                    if (access$getAnimList$p == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                    }
                    x.c(access$getAnimList$p).remove(animator);
                }
            });
            CoordinatorCardView.access$getAnimList$p(CoordinatorCardView.this).add(access$getBigCardAnim);
            access$getBigCardAnim.start();
        }
    }

    static {
        kge.a(-925043926);
    }

    public CoordinatorCardView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CoordinatorCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public static /* synthetic */ Object ipc$super(CoordinatorCardView coordinatorCardView, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ void access$addViewWithAnim(CoordinatorCardView coordinatorCardView, int i, ctq ctqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3aea760", new Object[]{coordinatorCardView, new Integer(i), ctqVar});
        } else {
            coordinatorCardView.addViewWithAnim(i, ctqVar);
        }
    }

    public static final /* synthetic */ List access$getAnimList$p(CoordinatorCardView coordinatorCardView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("15cd24e8", new Object[]{coordinatorCardView}) : coordinatorCardView.animList;
    }

    public static final /* synthetic */ Animator access$getBigCardAnim(CoordinatorCardView coordinatorCardView, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animator) ipChange.ipc$dispatch("9b249006", new Object[]{coordinatorCardView, view}) : coordinatorCardView.getBigCardAnim(view);
    }

    public static final /* synthetic */ Animator access$getSmallCardAnim(CoordinatorCardView coordinatorCardView, View view, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animator) ipChange.ipc$dispatch("3ff889b3", new Object[]{coordinatorCardView, view, new Boolean(z)}) : coordinatorCardView.getSmallCardAnim(view, z);
    }

    public /* synthetic */ CoordinatorCardView(Context context, AttributeSet attributeSet, int i, int i2, o oVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinatorCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        q.c(context, "context");
        this.parentOriginalEdge = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.cardManager = new b();
        this.cardRecords = new LinkedHashMap();
        this.cardLocateRecords = new LinkedHashMap();
        this.cardLayoutStrategies = new LinkedHashMap();
        this.animList = new ArrayList();
        this.rootScale = 1.0f;
        this.needReMeasure = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (this.needReMeasure) {
            this.parentOriginalEdge.set(i, i2, i3, i4);
            this.needReMeasure = false;
        }
        customLayoutChildren();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.cardManager.a();
        for (Animator animator : this.animList) {
            animator.removeAllListeners();
            animator.cancel();
        }
        this.animList.clear();
    }

    public final void setMargin(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe00f77", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.cardMarginLeft = f;
        this.cardMarginTop = f2;
    }

    public final void setRegionRationSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b7586a1", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.regionRationWidth = i;
        this.regionRationHeight = i2;
    }

    public final void updateRootViewMetrics(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc1e8fa", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        this.needReMeasure = true;
        for (ctq ctqVar : this.cardRecords.values()) {
            ctqVar.b(false);
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        setLayoutParams(layoutParams);
    }

    public final void setLayoutTranslationX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("527f5fe6", new Object[]{this, new Float(f)});
            return;
        }
        this.rootTranslationX = f;
        requestLayout();
    }

    public final void setLayoutTranslationY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54343885", new Object[]{this, new Float(f)});
            return;
        }
        this.rootTranslationY = f;
        requestLayout();
    }

    public final void setLayoutScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a6105b", new Object[]{this, new Float(f)});
            return;
        }
        if (f < 1) {
            f = 1.0f;
        }
        this.rootScale = f;
        requestLayout();
    }

    public final void executeActions(List<ctm> list) {
        ctq ctqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f31fb40", new Object[]{this, list});
        } else if (list != null) {
            for (ctm ctmVar : list) {
                if (!StringUtils.isEmpty(ctmVar.g()) && ctmVar.f() != null) {
                    int a2 = ctmVar.a();
                    if (a2 == 0) {
                        attachCard(ctmVar);
                    } else if (a2 == 1) {
                        ctq remove = this.cardRecords.remove(ctmVar.g());
                        if (remove != null) {
                            detachCard(remove);
                        }
                    } else if (a2 == 2) {
                        ctq ctqVar2 = this.cardRecords.get(ctmVar.g());
                        if (ctqVar2 != null) {
                            ctqVar2.a(4);
                        }
                    } else if (a2 == 3) {
                        ctq ctqVar3 = this.cardRecords.get(ctmVar.g());
                        if (ctqVar3 != null) {
                            ctqVar3.a(0);
                        }
                    } else if (a2 == 4 && (ctqVar = this.cardRecords.get(ctmVar.g())) != null) {
                        ctqVar.a(ctmVar.d());
                    }
                }
            }
        }
    }

    private final void attachCard(ctm ctmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b402dbd0", new Object[]{this, ctmVar});
            return;
        }
        b bVar = this.cardManager;
        Context context = getContext();
        q.a((Object) context, "context");
        bVar.a(context, ctmVar.c(), new CoordinatorCardView$attachCard$1(this, ctmVar), CoordinatorCardView$attachCard$2.INSTANCE);
    }

    private final void detachCard(ctq ctqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a9f7a9a", new Object[]{this, ctqVar});
        } else {
            ctqVar.d();
        }
    }

    private final void customLayoutChildren() {
        ctq ctqVar;
        RectF layoutChild;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633a58a1", new Object[]{this});
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            q.a((Object) child, "child");
            Object tag = child.getTag();
            if ((tag instanceof String) && (ctqVar = this.cardRecords.get(tag)) != null && (layoutChild = layoutChild(i, (String) tag, ctqVar)) != null) {
                child.layout((int) layoutChild.left, (int) layoutChild.top, (int) layoutChild.right, (int) layoutChild.bottom);
                ctqVar.b(true);
            }
        }
    }

    private final RectF layoutChild(int i, String str, ctq ctqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("6202eec3", new Object[]{this, new Integer(i), str, ctqVar});
        }
        RectF rectF = this.cardLocateRecords.get(str);
        if (rectF == null || !ctqVar.h()) {
            rectF = relayoutNewRectF(i, str, ctqVar);
        }
        if (rectF != null) {
            int[] b = ctqVar.b();
            RectF rectF2 = new RectF();
            if (ctqVar.j()) {
                rectF2.left = (((rectF.centerX() * this.rootScale) + this.rootTranslationX) + this.cardMarginLeft) - (b[0] / 2.0f);
                rectF2.right = rectF2.left + b[0];
            } else if (ctqVar.a()) {
                rectF2.right = (rectF.right * this.rootScale) + this.rootTranslationX + this.cardMarginLeft;
                rectF2.left = rectF2.right - b[0];
            } else {
                rectF2.left = (rectF.left * this.rootScale) + this.rootTranslationX + this.cardMarginLeft;
                rectF2.right = rectF2.left + b[0];
            }
            if (ctqVar.k()) {
                rectF2.top = (((rectF.centerY() * this.rootScale) + this.rootTranslationY) + this.cardMarginTop) - (b[1] / 2.0f);
                rectF2.bottom = rectF2.top + b[1];
            } else if (ctqVar.i()) {
                rectF2.bottom = (rectF.bottom * this.rootScale) + this.rootTranslationY + this.cardMarginTop;
                rectF2.top = rectF2.bottom - b[1];
            } else {
                rectF2.top = (rectF.top * this.rootScale) + this.rootTranslationY + this.cardMarginTop;
                rectF2.bottom = rectF2.top + b[1];
            }
            return rectF2;
        }
        return null;
    }

    private final RectF relayoutNewRectF(int i, String str, ctq ctqVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("582b7a50", new Object[]{this, new Integer(i), str, ctqVar});
        }
        ctl ctlVar = this.cardLayoutStrategies.get(str);
        RectF a2 = cov.a(str, 1, 1);
        if (ctlVar != null) {
            z = ctlVar.a();
        }
        RectF generateCardPreLayoutRectF = generateCardPreLayoutRectF(a2, z, ctqVar);
        if (generateCardPreLayoutRectF == null) {
            return null;
        }
        if (ctlVar == null || ctlVar.b() != 0) {
            generateCardPreLayoutRectF = fixedLayoutRectFByMoveStrategy(generateCardPreLayoutRectF, ctlVar, i);
        }
        this.cardLocateRecords.put(str, generateCardPreLayoutRectF);
        return generateCardPreLayoutRectF;
    }

    private final RectF fixedLayoutRectFByMoveStrategy(RectF rectF, ctl ctlVar, int i) {
        RectF parseRatioRectF2RealRectF;
        RectF rectF2;
        RectF changeRectFAssignLeft;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("690affd0", new Object[]{this, rectF, ctlVar, new Integer(i)});
        }
        if (ctlVar == null || (parseRatioRectF2RealRectF = parseRatioRectF2RealRectF(ctlVar.d())) == null) {
            return rectF;
        }
        RectF rectF3 = new RectF(rectF);
        for (int i2 = 0; i2 < i; i2++) {
            View childView = getChildAt(i2);
            q.a((Object) childView, "childView");
            Object tag = childView.getTag();
            if ((tag instanceof String) && (rectF2 = this.cardLocateRecords.get(tag)) != null && isRectOverLap(rectF3, rectF2)) {
                if (ctlVar.b() == 1) {
                    float f = 4;
                    float height = (parseRatioRectF2RealRectF.height() / f) + parseRatioRectF2RealRectF.top;
                    if (rectF3.top != height) {
                        changeRectFAssignLeft = changeRectFAssignTop(rectF3, height);
                    } else {
                        float height2 = ((parseRatioRectF2RealRectF.height() * 3) / f) + parseRatioRectF2RealRectF.top;
                        if (rectF3.top == height2) {
                            break;
                        }
                        changeRectFAssignLeft = changeRectFAssignTop(rectF3, height2);
                    }
                    rectF3 = changeRectFAssignLeft;
                } else {
                    float f2 = 4;
                    float width = (parseRatioRectF2RealRectF.width() / f2) + parseRatioRectF2RealRectF.left;
                    if (rectF3.left != width) {
                        changeRectFAssignLeft = changeRectFAssignLeft(rectF3, width);
                    } else {
                        float height3 = ((parseRatioRectF2RealRectF.height() * 3) / f2) + parseRatioRectF2RealRectF.left;
                        if (rectF3.left == height3) {
                            break;
                        }
                        changeRectFAssignLeft = changeRectFAssignLeft(rectF3, height3);
                    }
                    rectF3 = changeRectFAssignLeft;
                }
            }
        }
        return rectF3;
    }

    private final boolean isRectOverLap(RectF rectF, RectF rectF2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eaa86946", new Object[]{this, rectF, rectF2})).booleanValue() : rectF.left <= rectF2.right && rectF.right >= rectF2.left && rectF.top <= rectF2.bottom && rectF.bottom >= rectF2.top;
    }

    private final RectF changeRectFAssignTop(RectF rectF, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("eb131333", new Object[]{this, rectF, new Float(f)}) : new RectF(rectF.left, f, rectF.right, rectF.height() + f);
    }

    private final RectF changeRectFAssignLeft(RectF rectF, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("8dc1bc87", new Object[]{this, rectF, new Float(f)}) : new RectF(f, rectF.top, rectF.width() + f, rectF.bottom);
    }

    private final RectF generateCardPreLayoutRectF(RectF rectF, boolean z, ctq ctqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("a7214615", new Object[]{this, rectF, new Boolean(z), ctqVar});
        }
        RectF parseRatioRectF2RealRectF = parseRatioRectF2RealRectF(rectF);
        if (parseRatioRectF2RealRectF == null) {
            return null;
        }
        int a2 = g.a(6.0f);
        float f = parseRatioRectF2RealRectF.right - parseRatioRectF2RealRectF.left;
        float f2 = parseRatioRectF2RealRectF.bottom - parseRatioRectF2RealRectF.top;
        int i = a2 << 1;
        if (f > getWidth() - i || f2 > getHeight() - i) {
            return null;
        }
        if (z) {
            return getCoverAnchorRect(parseRatioRectF2RealRectF, ctqVar);
        }
        return getNotCoverAnchorRect(parseRatioRectF2RealRectF, ctqVar);
    }

    private final RectF parseRatioRectF2RealRectF(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("c5a8ca53", new Object[]{this, rectF});
        }
        if (rectF == null) {
            return null;
        }
        float f = rectF.left * this.regionRationWidth;
        float f2 = rectF.right * this.regionRationWidth;
        float f3 = rectF.top * this.regionRationHeight;
        float f4 = rectF.bottom * this.regionRationHeight;
        if (f < this.parentOriginalEdge.left) {
            f = this.parentOriginalEdge.left;
        }
        if (f3 < this.parentOriginalEdge.top) {
            f3 = this.parentOriginalEdge.top;
        }
        if (f2 > this.parentOriginalEdge.right) {
            f2 = this.parentOriginalEdge.right;
        }
        if (f4 > this.parentOriginalEdge.bottom) {
            f4 = this.parentOriginalEdge.bottom;
        }
        return new RectF(f, f3, f2, f4);
    }

    private final RectF getCoverAnchorRect(RectF rectF, ctq ctqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("85d90a25", new Object[]{this, rectF, ctqVar});
        }
        RectF rectF2 = new RectF();
        int[] b = ctqVar.b();
        int i = b[1];
        int i2 = b[0];
        if (ctqVar.f() == null) {
            ctqVar.d(true);
            ctqVar.e(true);
        }
        float f = 0;
        if (ctqVar.m() <= f) {
            float f2 = i2;
            if (rectF.left + f2 + ctqVar.m() <= this.parentOriginalEdge.right) {
                float m = ctqVar.m();
                if (rectF.left + m < this.parentOriginalEdge.left) {
                    rectF2.left = this.parentOriginalEdge.left;
                } else {
                    rectF2.left = rectF.left + m;
                }
                rectF2.right = rectF2.left + f2;
            } else {
                ctqVar.a(true);
                float f3 = -ctqVar.m();
                if (rectF.right + f3 > this.parentOriginalEdge.right) {
                    rectF2.right = this.parentOriginalEdge.right;
                } else {
                    rectF2.right = rectF.right + f3;
                }
                rectF2.left = rectF2.right - f2;
            }
        } else {
            float f4 = i2;
            if (rectF.left + f4 + ctqVar.m() <= this.parentOriginalEdge.right) {
                rectF2.left = rectF.left + ctqVar.m();
                rectF2.right = rectF2.left + f4;
            } else if (rectF.left + f4 <= this.parentOriginalEdge.right) {
                rectF2.left = this.parentOriginalEdge.left;
                rectF2.right = rectF2.left + f4;
            } else {
                ctqVar.a(true);
                rectF2.right = rectF.right - ctqVar.m();
                rectF2.left = rectF2.right - f4;
            }
        }
        if (ctqVar.l() <= f) {
            float f5 = i;
            if (rectF.top + ctqVar.l() + f5 <= this.parentOriginalEdge.bottom) {
                float l = ctqVar.l();
                if (rectF.top + l < this.parentOriginalEdge.top) {
                    rectF2.top = this.parentOriginalEdge.top;
                } else {
                    rectF2.top = rectF.top + l;
                }
                rectF2.bottom = rectF2.top + f5;
            } else {
                ctqVar.c(true);
                float f6 = -ctqVar.l();
                if (rectF.bottom + f6 > this.parentOriginalEdge.bottom) {
                    rectF2.bottom = this.parentOriginalEdge.bottom;
                } else {
                    rectF2.bottom = rectF.bottom + f6;
                }
                rectF2.top = rectF2.bottom - f5;
            }
        } else {
            float f7 = i;
            if (rectF.top + ctqVar.l() + f7 <= this.parentOriginalEdge.bottom) {
                rectF2.top = rectF.top + ctqVar.l();
                rectF2.bottom = rectF2.top + f7;
            } else if (rectF.top + f7 <= this.parentOriginalEdge.bottom) {
                rectF2.top = rectF.top;
                rectF2.bottom = rectF2.top + f7;
            } else {
                ctqVar.c(true);
                rectF2.bottom = rectF.bottom - ctqVar.l();
                rectF2.top = rectF2.right - f7;
            }
        }
        return rectF2;
    }

    private final RectF getNotCoverAnchorRect(RectF rectF, ctq ctqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("7b3eb1ac", new Object[]{this, rectF, ctqVar});
        }
        float f = rectF.right - rectF.left;
        int a2 = g.a(6.0f);
        RectF rectF2 = new RectF();
        int[] b = ctqVar.b();
        int i = b[1];
        int i2 = b[0];
        float f2 = i;
        float f3 = a2;
        if ((rectF.top - f2) - f3 >= this.parentOriginalEdge.top) {
            rectF2.bottom = rectF.top - f3;
            rectF2.top = rectF2.bottom - f2;
            ctqVar.c(true);
        } else {
            rectF2.top = rectF.bottom + f3;
            rectF2.bottom = rectF2.top + f2;
        }
        float f4 = i2;
        float abs = Math.abs(f4 - f) / 2;
        if (f4 > f) {
            float f5 = rectF.left - abs;
            if (f5 <= this.parentOriginalEdge.left) {
                f5 = this.parentOriginalEdge.left;
            } else {
                ctqVar.d(true);
            }
            rectF2.left = f5;
            float f6 = rectF2.left + f4;
            if (f6 > this.parentOriginalEdge.right) {
                rectF2.right = this.parentOriginalEdge.right;
                rectF2.left = this.parentOriginalEdge.right - f4;
                ctqVar.a(true);
            } else {
                rectF2.right = f6;
            }
        } else {
            ctqVar.d(true);
            rectF2.left = rectF.left + abs;
            rectF2.right = rectF2.left + f4;
        }
        return rectF2;
    }

    private final void addViewWithAnim(int i, ctq ctqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15beb9cf", new Object[]{this, new Integer(i), ctqVar});
            return;
        }
        View c = ctqVar.c();
        c.setAlpha(0.0f);
        addView(c);
        c.post(new a(i, c, ctqVar));
    }

    private final Animator getSmallCardAnim(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("6dd89218", new Object[]{this, view, new Boolean(z)});
        }
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f);
        float[] fArr = new float[2];
        fArr[0] = (z ? view.getWidth() : -view.getWidth()) / 2.0f;
        fArr[1] = 0.0f;
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat("translationX", fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
        q.a((Object) ofPropertyValuesHolder, "ObjectAnimator.ofPropert…\n        0f\n      )\n    )");
        ofPropertyValuesHolder.setDuration(200L);
        ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
        return ofPropertyValuesHolder;
    }

    private final Animator getBigCardAnim(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("3bdfec93", new Object[]{this, view});
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("translationX", (-view.getWidth()) / 2.0f, 0.0f), PropertyValuesHolder.ofFloat("translationY", -view.getHeight(), 0.0f));
        q.a((Object) ofPropertyValuesHolder, "ObjectAnimator.ofPropert…ight.toFloat(), 0f)\n    )");
        ofPropertyValuesHolder.setDuration(300L);
        ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
        return ofPropertyValuesHolder;
    }
}
