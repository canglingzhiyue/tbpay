package com.taobao.search.m3.more;

import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.v;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.more.pk.PkButton;
import com.taobao.taobao.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class MoreAreaView extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final int addCartSize;
    private static final int expandSize;
    private static final int moreBtnSize;
    private static final String oldMoreUrl = "https://gw.alicdn.com/imgextra/i4/O1CN01lncuW41zjYNQq6yGO_!!6000000006750-2-tps-52-12.png";
    private static final String tb2024MoreUrl = "https://gw.alicdn.com/imgextra/i4/O1CN01KIXQDn1WIsV5yGmpa_!!6000000002766-2-tps-40-10.png";
    private static final int verticalExpandSize;
    private final MoreButton addCartButton;
    private final Rect currentTouchRect;
    private int currentType;
    private final Rect lastTouchRect;
    private b listener;
    private final MoreButton moreButton;
    private final PkButton pkButton;
    private boolean shouldExpand;
    private final Rect touchRect;

    public static /* synthetic */ Object ipc$super(MoreAreaView moreAreaView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-27489356);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreAreaView(Context context) {
        super(context);
        q.c(context, "context");
        int i = moreBtnSize;
        this.moreButton = new MoreButton(context, i, i, expandSize, oldMoreUrl);
        int i2 = addCartSize;
        this.addCartButton = new MoreButton(context, i2, i2, 0, "https://gw.alicdn.com/imgextra/i4/O1CN01fE3kPZ1EBOdeirK7R_!!6000000000313-2-tps-72-72.png");
        this.pkButton = new PkButton(context);
        this.currentType = 3;
        this.lastTouchRect = new Rect();
        this.currentTouchRect = new Rect();
        this.touchRect = new Rect();
        setOnClickListener(new View.OnClickListener() { // from class: com.taobao.search.m3.more.MoreAreaView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                b access$getListener$p = MoreAreaView.access$getListener$p(MoreAreaView.this);
                if (access$getListener$p == null) {
                    return;
                }
                access$getListener$p.a(MoreAreaView.access$getCurrentType$p(MoreAreaView.this));
            }
        });
        this.moreButton.setContentDescription(com.alibaba.ability.localization.b.a(R.string.app_more_options));
        setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
    }

    public static final /* synthetic */ int access$getCurrentType$p(MoreAreaView moreAreaView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e295f8a6", new Object[]{moreAreaView})).intValue() : moreAreaView.currentType;
    }

    public static final /* synthetic */ b access$getListener$p(MoreAreaView moreAreaView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("4ea88bd4", new Object[]{moreAreaView}) : moreAreaView.listener;
    }

    public static final /* synthetic */ void access$setCurrentType$p(MoreAreaView moreAreaView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dad16bc", new Object[]{moreAreaView, new Integer(i)});
        } else {
            moreAreaView.currentType = i;
        }
    }

    public static final /* synthetic */ void access$setListener$p(MoreAreaView moreAreaView, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85dc298", new Object[]{moreAreaView, bVar});
        } else {
            moreAreaView.listener = bVar;
        }
    }

    static {
        kge.a(1394210668);
        Companion = new a(null);
        moreBtnSize = l.a(13.0f);
        addCartSize = l.a(16.0f);
        expandSize = l.a(5.0f);
        verticalExpandSize = l.a(3.5f);
    }

    public final void update(boolean z, com.taobao.search.m3.more.pk.a aVar, boolean z2, com.taobao.search.m3.more.a aVar2, b listener, boolean z3) {
        MoreButton moreButton;
        MoreButton moreButton2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eedb6482", new Object[]{this, new Boolean(z), aVar, new Boolean(z2), aVar2, listener, new Boolean(z3)});
            return;
        }
        q.c(listener, "listener");
        removeAllViews();
        this.listener = listener;
        if (aVar != null && z) {
            this.currentType = 1;
            this.pkButton.update(aVar);
            this.shouldExpand = false;
            moreButton2 = this.pkButton;
        } else {
            if (z2) {
                this.currentType = 2;
                updateAddCart(aVar2);
                this.shouldExpand = false;
                moreButton = this.addCartButton;
            } else {
                this.currentType = 3;
                this.shouldExpand = true;
                this.moreButton.updateUrl(z3 ? tb2024MoreUrl : oldMoreUrl);
                moreButton = this.moreButton;
            }
            moreButton2 = moreButton;
        }
        if (getChildCount() > 0 && getChildAt(0) == moreButton2) {
            return;
        }
        removeAllViews();
        addView(moreButton2);
        this.lastTouchRect.setEmpty();
    }

    private final void updateAddCart(com.taobao.search.m3.more.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee939ec6", new Object[]{this, aVar});
            return;
        }
        this.addCartButton.updateUrl(aVar != null ? aVar.d() : null);
        if (aVar == null) {
            this.addCartButton.setW(addCartSize);
            this.addCartButton.setH(addCartSize);
            return;
        }
        float a2 = (aVar.a() <= 0 || aVar.b() <= 0) ? 1.0f : aVar.a() / aVar.b();
        int a3 = aVar.c() > 0 ? l.a(aVar.c()) : addCartSize;
        this.addCartButton.setW((int) (a3 * a2));
        this.addCartButton.setH(a3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (getChildCount() == 0) {
        } else {
            View view = getChildAt(0);
            q.a((Object) view, "view");
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            if (this.shouldExpand) {
                expandTouchArea();
            } else {
                this.lastTouchRect.setEmpty();
            }
        }
    }

    private final void expandTouchArea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc523679", new Object[]{this});
            return;
        }
        getHitRect(this.currentTouchRect);
        if (q.a(this.currentTouchRect, this.lastTouchRect)) {
            return;
        }
        this.lastTouchRect.set(this.currentTouchRect);
        this.touchRect.set(this.currentTouchRect);
        this.touchRect.left -= expandSize;
        this.touchRect.top -= verticalExpandSize;
        this.touchRect.right += expandSize;
        this.touchRect.bottom += verticalExpandSize;
        ViewParent parent = getParent();
        if (parent == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ((ViewGroup) parent).setTouchDelegate(new TouchDelegate(this.touchRect, this));
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (getChildCount() == 0) {
            setMeasuredDimension(0, 0);
        } else {
            View view = getChildAt(0);
            view.measure(i, i2);
            q.a((Object) view, "view");
            setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
