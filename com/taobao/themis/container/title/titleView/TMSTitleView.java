package com.taobao.themis.container.title.titleView;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.titlebar.NavigatorBarAnimType;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.utils.k;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\nH\u0016J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\nH\u0016J\u0012\u0010!\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u001bH\u0016J\b\u0010%\u001a\u00020\u001bH\u0016J\b\u0010&\u001a\u00020\u001bH\u0016J#\u0010'\u001a\u0004\u0018\u0001H(\"\u0004\b\u0000\u0010(2\f\u0010)\u001a\b\u0012\u0004\u0012\u0002H(0*H\u0016¢\u0006\u0002\u0010+J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0-H\u0016J\n\u0010.\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\nH\u0016J\u0010\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0010\u00106\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u0019H\u0016J\u0010\u00108\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\nH\u0016J\u0010\u0010:\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020\nH\u0016J\u0010\u0010<\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020\u0011H\u0016J\u000e\u0010>\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\nJ\u0010\u0010?\u001a\u00020\u001b2\u0006\u00103\u001a\u000204H\u0016R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/taobao/themis/container/title/titleView/TMSTitleView;", "Landroid/widget/RelativeLayout;", "Lcom/taobao/themis/container/title/titleView/ITitleView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mActions", "", "Lcom/taobao/themis/kernel/container/ui/titlebar/Action;", "mAlpha", "mBgDrawable", "Landroid/graphics/drawable/Drawable;", "mCenterLeftPanel", "Landroid/view/ViewGroup;", "mCenterPanel", "mCenterRightPanel", "mLeftPanel", "mRightPanel", "mTextStyle", "Lcom/taobao/themis/kernel/container/Window$Theme;", "addCenterAction", "", "action", "location", "addLeftAction", "index", "addRightAction", "attachPage", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "clearCenterActions", "clearLeftActions", "clearRightActions", "getAction", "T", "cls", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "getActions", "", "getBackgroundDrawable", "getContentView", "Landroid/view/View;", "getTitleViewHeight", "hideTitleBar", "animType", "Lcom/taobao/themis/kernel/container/ui/titlebar/NavigatorBarAnimType;", "removeAction", "setStyle", "style", "setTitleBarAlpha", "alpha", "setTitleBarBackgroundColor", "color", "setTitleBarBackgroundDrawable", com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, "setTitleViewAlpha", "showTitleBar", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSTitleView extends RelativeLayout implements com.taobao.themis.container.title.titleView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final List<com.taobao.themis.kernel.container.ui.titlebar.a> mActions;
    private int mAlpha;
    private Drawable mBgDrawable;
    private final ViewGroup mCenterLeftPanel;
    private final ViewGroup mCenterPanel;
    private final ViewGroup mCenterRightPanel;
    private final ViewGroup mLeftPanel;
    private final ViewGroup mRightPanel;
    private Window.Theme mTextStyle;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, animation});
                return;
            }
            q.b(animation, "animation");
            Object animatedValue = animation.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
            TMSTitleView.this.setAlpha(((Float) animatedValue).floatValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/container/title/titleView/TMSTitleView$hideTitleBar$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                return;
            }
            q.d(animation, "animation");
            super.onAnimationEnd(animation);
            TMSTitleView.this.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, animation});
                return;
            }
            q.b(animation, "animation");
            Object animatedValue = animation.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
            TMSTitleView.this.setAlpha(((Float) animatedValue).floatValue());
        }
    }

    static {
        kge.a(33464304);
        kge.a(528479425);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TMSTitleView(android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.container.title.titleView.TMSTitleView.<init>(android.content.Context):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TMSTitleView(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.container.title.titleView.TMSTitleView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TMSTitleView(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.container.title.titleView.TMSTitleView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // com.taobao.themis.container.title.titleView.a
    public View getContentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ce219891", new Object[]{this}) : this;
    }

    @Override // com.taobao.themis.container.title.titleView.a
    public Drawable getBackgroundDrawable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("c24857b1", new Object[]{this}) : this.mBgDrawable;
    }

    public final void setTitleViewAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e855f9", new Object[]{this, new Integer(i)});
            return;
        }
        this.mAlpha = i;
        Drawable drawable = this.mBgDrawable;
        if (drawable == null) {
            return;
        }
        drawable.setAlpha(i);
    }

    @Override // com.taobao.themis.container.title.titleView.a
    public void addLeftAction(com.taobao.themis.kernel.container.ui.titlebar.a action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("422c0cf6", new Object[]{this, action});
            return;
        }
        q.d(action, "action");
        action.m_(0);
        this.mActions.add(action);
        ViewGroup viewGroup = this.mLeftPanel;
        Context context = getContext();
        q.b(context, "context");
        viewGroup.addView(action.a(context));
        action.a(this.mTextStyle);
    }

    public void addLeftAction(com.taobao.themis.kernel.container.ui.titlebar.a action, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35604cd", new Object[]{this, action, new Integer(i)});
            return;
        }
        q.d(action, "action");
        action.m_(0);
        this.mActions.add(action);
        ViewGroup viewGroup = this.mLeftPanel;
        Context context = getContext();
        q.b(context, "context");
        viewGroup.addView(action.a(context), i);
        action.a(this.mTextStyle);
    }

    @Override // com.taobao.themis.container.title.titleView.a
    public void addRightAction(com.taobao.themis.kernel.container.ui.titlebar.a action, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83c16ffa", new Object[]{this, action, new Integer(i)});
            return;
        }
        q.d(action, "action");
        action.m_(1);
        this.mActions.add(action);
        ViewGroup viewGroup = this.mRightPanel;
        Context context = getContext();
        q.b(context, "context");
        viewGroup.addView(action.a(context), i);
        action.a(this.mTextStyle);
    }

    @Override // com.taobao.themis.container.title.titleView.a
    public void clearLeftActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9779270", new Object[]{this});
            return;
        }
        this.mLeftPanel.removeAllViews();
        p.a((List) this.mActions, (rul) TMSTitleView$clearLeftActions$1.INSTANCE);
    }

    @Override // com.taobao.themis.container.title.titleView.a
    public void addRightAction(com.taobao.themis.kernel.container.ui.titlebar.a action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4400829", new Object[]{this, action});
            return;
        }
        q.d(action, "action");
        action.m_(1);
        this.mActions.add(action);
        ViewGroup viewGroup = this.mRightPanel;
        Context context = getContext();
        q.b(context, "context");
        viewGroup.addView(action.a(context), 0);
        action.a(this.mTextStyle);
    }

    @Override // com.taobao.themis.container.title.titleView.a
    public void clearRightActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("430783b5", new Object[]{this});
            return;
        }
        this.mRightPanel.removeAllViews();
        p.a((List) this.mActions, (rul) TMSTitleView$clearRightActions$1.INSTANCE);
    }

    @Override // com.taobao.themis.container.title.titleView.a
    public void addCenterAction(com.taobao.themis.kernel.container.ui.titlebar.a action, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ecfff7f", new Object[]{this, action, new Integer(i)});
            return;
        }
        q.d(action, "action");
        action.m_(2);
        this.mActions.add(action);
        if (i == 0) {
            ViewGroup viewGroup = this.mCenterLeftPanel;
            Context context = getContext();
            q.b(context, "context");
            viewGroup.addView(action.a(context));
        } else if (i == 1) {
            ViewGroup viewGroup2 = this.mCenterRightPanel;
            Context context2 = getContext();
            q.b(context2, "context");
            viewGroup2.addView(action.a(context2));
        } else if (i == 2) {
            ViewGroup viewGroup3 = this.mCenterPanel;
            Context context3 = getContext();
            q.b(context3, "context");
            viewGroup3.addView(action.a(context3));
        }
        action.a(this.mTextStyle);
    }

    @Override // com.taobao.themis.container.title.titleView.a
    public void clearCenterActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88fc98a2", new Object[]{this});
            return;
        }
        p.a((List) this.mActions, (rul) TMSTitleView$clearCenterActions$1.INSTANCE);
        this.mCenterLeftPanel.removeAllViews();
        this.mCenterPanel.removeAllViews();
        this.mCenterRightPanel.removeAllViews();
    }

    @Override // com.taobao.themis.container.title.titleView.a
    public void removeAction(com.taobao.themis.kernel.container.ui.titlebar.a action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f544f32", new Object[]{this, action});
            return;
        }
        q.d(action, "action");
        this.mActions.remove(action);
        Context context = getContext();
        q.b(context, "context");
        View a2 = action.a(context);
        this.mLeftPanel.removeView(a2);
        this.mCenterLeftPanel.removeView(a2);
        this.mCenterPanel.removeView(a2);
        this.mCenterRightPanel.removeView(a2);
        this.mRightPanel.removeView(a2);
    }

    @Override // com.taobao.themis.container.title.titleView.a
    public <T> T getAction(Class<T> cls) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("b5e78488", new Object[]{this, cls});
        }
        q.d(cls, "cls");
        Iterator<T> it = this.mActions.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (cls.isInstance((com.taobao.themis.kernel.container.ui.titlebar.a) t)) {
                break;
            }
        }
        if (t instanceof Object) {
            return t;
        }
        return null;
    }

    @Override // com.taobao.themis.container.title.titleView.a
    public List<com.taobao.themis.kernel.container.ui.titlebar.a> getActions() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("39cd6eb9", new Object[]{this}) : this.mActions;
    }

    @Override // com.taobao.themis.container.title.titleView.a
    public void setTitleBarBackgroundDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75984f14", new Object[]{this, drawable});
            return;
        }
        q.d(drawable, "drawable");
        drawable.setAlpha(this.mAlpha);
        this.mBgDrawable = drawable;
        setBackground(drawable);
    }

    @Override // com.taobao.themis.container.title.titleView.a
    public void setTitleBarBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4704a64", new Object[]{this, new Integer(i)});
            return;
        }
        ColorDrawable colorDrawable = new ColorDrawable(i);
        colorDrawable.setAlpha(this.mAlpha);
        this.mBgDrawable = colorDrawable;
        setBackground(this.mBgDrawable);
    }

    @Override // com.taobao.themis.container.title.titleView.a
    public void setTitleBarAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1915bb", new Object[]{this, new Integer(i)});
            return;
        }
        this.mAlpha = i;
        Drawable drawable = this.mBgDrawable;
        if (drawable == null) {
            return;
        }
        drawable.setAlpha(i);
    }

    @Override // com.taobao.themis.container.title.titleView.a
    public void setStyle(Window.Theme style) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4570c", new Object[]{this, style});
            return;
        }
        q.d(style, "style");
        this.mTextStyle = style;
        for (com.taobao.themis.kernel.container.ui.titlebar.a aVar : this.mActions) {
            aVar.a(style);
        }
    }

    @Override // com.taobao.themis.container.title.titleView.a
    public void showTitleBar(NavigatorBarAnimType animType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdaae898", new Object[]{this, animType});
            return;
        }
        q.d(animType, "animType");
        if (getVisibility() == 0) {
            return;
        }
        int i = com.taobao.themis.container.title.titleView.b.$EnumSwitchMapping$0[animType.ordinal()];
        if (i == 1) {
            setAlpha(1.0f);
            setVisibility(0);
        } else if (i == 2) {
            setAlpha(0.0f);
            setVisibility(0);
            ValueAnimator valueAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
            q.b(valueAnimator, "valueAnimator");
            valueAnimator.setDuration(500L);
            valueAnimator.addUpdateListener(new d());
            valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimator.start();
        } else if (i != 3) {
            if (i != 4) {
                return;
            }
            setVisibility(0);
        } else {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, -getHeight(), 0.0f);
            setAlpha(1.0f);
            setVisibility(0);
            translateAnimation.setDuration(500L);
            translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            translateAnimation.setFillAfter(false);
            startAnimation(translateAnimation);
        }
    }

    @Override // com.taobao.themis.container.title.titleView.a
    public void hideTitleBar(NavigatorBarAnimType animType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b5c0f3", new Object[]{this, animType});
            return;
        }
        q.d(animType, "animType");
        if (getVisibility() == 8) {
            return;
        }
        int i = com.taobao.themis.container.title.titleView.b.$EnumSwitchMapping$1[animType.ordinal()];
        if (i == 1) {
            setAlpha(1.0f);
            setVisibility(8);
        } else if (i == 2) {
            setAlpha(1.0f);
            setVisibility(0);
            ValueAnimator valueAnimator = ValueAnimator.ofFloat(1.0f, 0.0f);
            q.b(valueAnimator, "valueAnimator");
            valueAnimator.setDuration(500L);
            valueAnimator.addUpdateListener(new a());
            valueAnimator.addListener(new b());
            valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimator.start();
        } else if (i != 3) {
            if (i != 4) {
                return;
            }
            setVisibility(8);
        } else {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -getHeight());
            setAlpha(1.0f);
            setVisibility(0);
            translateAnimation.setDuration(500L);
            translateAnimation.setAnimationListener(new c());
            translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            translateAnimation.setFillAfter(false);
            startAnimation(translateAnimation);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/taobao/themis/container/title/titleView/TMSTitleView$hideTitleBar$3", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            } else {
                q.d(animation, "animation");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            } else {
                q.d(animation, "animation");
            }
        }

        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            q.d(animation, "animation");
            TMSTitleView.this.setVisibility(8);
        }
    }

    @Override // com.taobao.themis.container.title.titleView.a
    public int getTitleViewHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1686c7e8", new Object[]{this})).intValue() : getLayoutParams().height;
    }

    @Override // com.taobao.themis.container.title.titleView.a
    public void attachPage(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cee1ba6", new Object[]{this, iTMSPage});
        } else if (iTMSPage == null || iTMSPage.c().g()) {
        } else {
            setPadding(0, 0, 0, 0);
            setLayoutParams(new RelativeLayout.LayoutParams(-1, k.a(getContext(), 44.0f)));
        }
    }
}
