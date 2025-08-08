package com.taobao.tao.flexbox.layoutmanager.component;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ViewAnimator;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogl;

/* loaded from: classes8.dex */
public class SliderComponent extends Component<ViewGroup, a> implements com.taobao.tao.flexbox.layoutmanager.core.g, com.taobao.tao.flexbox.layoutmanager.core.s, com.taobao.tao.flexbox.layoutmanager.core.z {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANIMATION_DURATION = 300;
    private static final String DIRECTION_BOTTOM_TO_TOP = "up";
    private static final String DIRECTION_LEFT_TO_RIGHT = "right";
    private static final String DIRECTION_RIGHT_TO_LEFT = "left";
    private static final String DIRECTION_TOP_TO_BOTTOM = "down";
    private static final String MODE_MULTI = "multi";
    private static final String MODE_SINGLE = "single";
    private static final int UNSET = -1;
    private boolean mLastAutoPlay;
    private boolean pausedByElementCall;
    private Handler handler = new Handler(Looper.getMainLooper());
    private Runnable showNext = new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.SliderComponent.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!(SliderComponent.access$000(SliderComponent.this) instanceof TNodeViewAnimator)) {
                if (!(SliderComponent.access$1300(SliderComponent.this) instanceof MultiSlideRecyclerView) || !SliderComponent.access$1400(SliderComponent.this)) {
                    return;
                }
                MultiSlideRecyclerView multiSlideRecyclerView = (MultiSlideRecyclerView) SliderComponent.access$1500(SliderComponent.this);
                int currentPosition = multiSlideRecyclerView.getCurrentPosition() + 1;
                if (currentPosition >= multiSlideRecyclerView.getAdapter().getItemCount()) {
                    return;
                }
                multiSlideRecyclerView.smoothScrollToPosition(currentPosition);
                SliderComponent.access$1200(SliderComponent.this).removeCallbacks(SliderComponent.access$900(SliderComponent.this));
                SliderComponent.access$1200(SliderComponent.this).postDelayed(SliderComponent.access$900(SliderComponent.this), ((a) SliderComponent.access$1600(SliderComponent.this)).c + ((a) SliderComponent.access$1700(SliderComponent.this)).b);
            } else {
                TNodeViewAnimator tNodeViewAnimator = (TNodeViewAnimator) SliderComponent.access$100(SliderComponent.this);
                int displayedChild = tNodeViewAnimator.getDisplayedChild();
                if (displayedChild < SliderComponent.access$200(SliderComponent.this).d.size()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("index", Integer.valueOf(displayedChild));
                    SliderComponent sliderComponent = SliderComponent.this;
                    sliderComponent.sendMessage(Component.MSG_FLAG_DISAPPEAR, SliderComponent.access$300(sliderComponent).d.get(displayedChild), "onwilldisappear", null, hashMap, null);
                }
                int displayedChild2 = tNodeViewAnimator.getDisplayedChild() + 1;
                if (displayedChild2 < SliderComponent.access$400(SliderComponent.this).d.size()) {
                    com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = SliderComponent.access$500(SliderComponent.this).d.get(displayedChild2);
                    if (aaVar.n()) {
                        aaVar.l();
                    }
                    if (!aaVar.w()) {
                        aaVar.b(((ViewGroup) SliderComponent.access$600(SliderComponent.this)).getContext());
                    }
                }
                tNodeViewAnimator.showNext();
                int displayedChild3 = tNodeViewAnimator.getDisplayedChild();
                com.taobao.tao.flexbox.layoutmanager.core.aa b = SliderComponent.access$700(SliderComponent.this).b(displayedChild3);
                if (b != null) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("index", Integer.valueOf(displayedChild3));
                    SliderComponent.this.sendMessage(130, b, "onwillappear", null, hashMap2, null);
                }
                if (((Activity) ((ViewGroup) SliderComponent.access$800(SliderComponent.this)).getContext()).isFinishing()) {
                    return;
                }
                SliderComponent.access$1200(SliderComponent.this).postDelayed(SliderComponent.access$900(SliderComponent.this), ((a) SliderComponent.access$1000(SliderComponent.this)).c + ((a) SliderComponent.access$1100(SliderComponent.this)).b);
            }
        }
    };

    static {
        kge.a(-57923903);
        kge.a(-1420926486);
        kge.a(-1353647536);
        kge.a(328095190);
    }

    public static /* synthetic */ Object ipc$super(SliderComponent sliderComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2141646649) {
            super.applyAttrForView((SliderComponent) ((View) objArr[0]), (View) ((ogl) objArr[1]), (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        } else if (hashCode == 258418204) {
            return new Boolean(super.invoke((g.c) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (g.d) objArr[3]));
        } else {
            if (hashCode != 1052797818) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.detach(((Boolean) objArr[0]).booleanValue());
            return null;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public void scrollBy(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f06fc09", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public void scrollTo(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0b0965", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public void scrollToPosition(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d225a7a", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public void scrollToPositionWithNumber(int i, boolean z, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb0b758", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3)});
        }
    }

    public static /* synthetic */ View access$000(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("2c8be4c7", new Object[]{sliderComponent}) : sliderComponent.view;
    }

    public static /* synthetic */ View access$100(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("1593a9c8", new Object[]{sliderComponent}) : sliderComponent.view;
    }

    public static /* synthetic */ ogl access$1000(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("6c757fe", new Object[]{sliderComponent}) : sliderComponent.viewParams;
    }

    public static /* synthetic */ ogl access$1100(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("1fc8a99d", new Object[]{sliderComponent}) : sliderComponent.viewParams;
    }

    public static /* synthetic */ Handler access$1200(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("4afdef90", new Object[]{sliderComponent}) : sliderComponent.handler;
    }

    public static /* synthetic */ View access$1300(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("9c0bdb39", new Object[]{sliderComponent}) : sliderComponent.view;
    }

    public static /* synthetic */ boolean access$1400(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae195fc", new Object[]{sliderComponent})).booleanValue() : sliderComponent.attached;
    }

    public static /* synthetic */ View access$1500(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6e1b653b", new Object[]{sliderComponent}) : sliderComponent.view;
    }

    public static /* synthetic */ ogl access$1600(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("9ccf41b8", new Object[]{sliderComponent}) : sliderComponent.viewParams;
    }

    public static /* synthetic */ ogl access$1700(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("b5d09357", new Object[]{sliderComponent}) : sliderComponent.viewParams;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$1800(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("22ec5842", new Object[]{sliderComponent}) : sliderComponent.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$1900(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("99027aa1", new Object[]{sliderComponent}) : sliderComponent.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$200(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("cd5e5ed7", new Object[]{sliderComponent}) : sliderComponent.node;
    }

    public static /* synthetic */ ogl access$2000(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("df03a3f", new Object[]{sliderComponent}) : sliderComponent.viewParams;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$2200(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("ab15b389", new Object[]{sliderComponent}) : sliderComponent.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$2300(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("212bd5e8", new Object[]{sliderComponent}) : sliderComponent.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$2400(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("9741f847", new Object[]{sliderComponent}) : sliderComponent.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$300(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("43748136", new Object[]{sliderComponent}) : sliderComponent.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$400(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("b98aa395", new Object[]{sliderComponent}) : sliderComponent.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$500(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("2fa0c5f4", new Object[]{sliderComponent}) : sliderComponent.node;
    }

    public static /* synthetic */ View access$600(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a2ba82cd", new Object[]{sliderComponent}) : sliderComponent.view;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$700(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("1bcd0ab2", new Object[]{sliderComponent}) : sliderComponent.node;
    }

    public static /* synthetic */ View access$800(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("74ca0ccf", new Object[]{sliderComponent}) : sliderComponent.view;
    }

    public static /* synthetic */ Runnable access$900(SliderComponent sliderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("df769dc6", new Object[]{sliderComponent}) : sliderComponent.showNext;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component, com.taobao.tao.flexbox.layoutmanager.core.b
    public boolean sendViewAppearForAdd(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dfadc3ad", new Object[]{this, aaVar})).booleanValue() : this.view instanceof TNodeViewAnimator ? aaVar == this.node.b(((TNodeViewAnimator) this.view).getDisplayedChild()) : (this.view instanceof MultiSlideRecyclerView) && aaVar == this.node.b(((MultiSlideRecyclerView) this.view).getCurrentPosition());
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public ViewGroup onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("4783d8d4", new Object[]{this, context});
        }
        if ("multi".equalsIgnoreCase(((a) this.viewParams).e)) {
            return new MultiSlideRecyclerView(context);
        }
        TNodeViewAnimator tNodeViewAnimator = new TNodeViewAnimator(context);
        Animation[] animations = getAnimations(((a) this.viewParams).f20053a);
        tNodeViewAnimator.setInAnimation(animations[0]);
        tNodeViewAnimator.setOutAnimation(animations[1]);
        return tNodeViewAnimator;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        super.detach(z);
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this.showNext);
        }
        if (this.node.d == null) {
            return;
        }
        for (int i = 0; i < this.node.d.size(); i++) {
            this.node.d.get(i).d(z);
        }
    }

    private Animation[] getAnimations(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation[]) ipChange.ipc$dispatch("3cbd2fb", new Object[]{this, str});
        }
        Animation[] animationArr = new Animation[2];
        if (str.equals("right")) {
            animationArr[0] = new TranslateAnimation(2, -1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
            animationArr[1] = new TranslateAnimation(2, 0.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
        } else if (str.equals("left")) {
            animationArr[0] = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
            animationArr[1] = new TranslateAnimation(2, 0.0f, 2, -1.0f, 2, 0.0f, 2, 0.0f);
        } else if (str.equals("down")) {
            animationArr[0] = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, -1.0f, 2, 0.0f);
            animationArr[1] = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, 1.0f);
        } else {
            animationArr[0] = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 1.0f, 2, 0.0f);
            animationArr[1] = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, -1.0f);
        }
        animationArr[0].setDuration(((a) this.viewParams).b);
        animationArr[1].setDuration(((a) this.viewParams).b);
        animationArr[0].setInterpolator(new DecelerateInterpolator(1.2f));
        animationArr[1].setInterpolator(new DecelerateInterpolator(1.2f));
        return animationArr;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void applyAttrForView(ViewGroup viewGroup, a aVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f4e275", new Object[]{this, viewGroup, aVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView((SliderComponent) viewGroup, (ViewGroup) aVar, map, z);
        if (viewGroup instanceof MultiSlideRecyclerView) {
            if (!this.mLastAutoPlay && aVar.f) {
                startSlide(-1);
                return;
            } else if (!this.mLastAutoPlay || aVar.f) {
                return;
            } else {
                stopSlide();
                return;
            }
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa b = this.node.b(0);
        if (b != null) {
            if (b.n()) {
                b.l();
            }
            if (!b.w()) {
                b.b(viewGroup.getContext());
            }
        }
        startSlide(-1);
    }

    public void startSlide(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af60364d", new Object[]{this, new Integer(i)});
        } else if (this.pausedByElementCall) {
        } else {
            if (oeb.ce() && !this.node.o()) {
                return;
            }
            if ("multi".equalsIgnoreCase(((a) this.viewParams).e)) {
                if (this.mLastAutoPlay || !((a) this.viewParams).f) {
                    return;
                }
                if (i == -1) {
                    i = ((a) this.viewParams).d;
                }
                ViewGroup view = getView();
                if ((view instanceof MultiSlideRecyclerView) && !((a) this.viewParams).g) {
                    ((MultiSlideRecyclerView) view).reset();
                }
                this.handler.removeCallbacks(this.showNext);
                this.handler.postDelayed(this.showNext, i);
                this.mLastAutoPlay = true;
                return;
            }
            this.handler.removeCallbacks(this.showNext);
            if (this.node != null && this.node.d != null && this.node.d.size() < 2) {
                return;
            }
            if (i == -1) {
                i = ((a) this.viewParams).c + ((a) this.viewParams).d;
            }
            this.handler.postDelayed(this.showNext, i);
        }
    }

    public void stopSlide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("588c7bd6", new Object[]{this});
            return;
        }
        if ("multi".equalsIgnoreCase(((a) this.viewParams).e)) {
            this.mLastAutoPlay = false;
            if (!((a) this.viewParams).g) {
                ViewGroup view = getView();
                if (view instanceof MultiSlideRecyclerView) {
                    ((MultiSlideRecyclerView) view).reset();
                }
            }
        }
        this.handler.removeCallbacks(this.showNext);
    }

    public void resetSlide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daab0d29", new Object[]{this});
            return;
        }
        stopSlide();
        slideToIndex(0);
    }

    private void slideToIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b23e6f6", new Object[]{this, new Integer(i)});
            return;
        }
        this.handler.removeCallbacks(this.showNext);
        if (this.view instanceof TNodeViewAnimator) {
            int displayedChild = ((TNodeViewAnimator) this.view).getDisplayedChild();
            if (i >= this.node.d.size() || displayedChild == i) {
                return;
            }
            for (int i2 = 0; i2 <= i; i2++) {
                com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = this.node.d.get(i2);
                if (aaVar.n()) {
                    aaVar.l();
                }
                if (!aaVar.w()) {
                    aaVar.b(((ViewGroup) this.view).getContext());
                }
            }
            ((TNodeViewAnimator) this.view).setDisplayedChild(i);
            HashMap hashMap = new HashMap();
            hashMap.put("index", Integer.valueOf(i));
            sendMessage(130, this.node.d.get(i), "onwillappear", null, hashMap, null);
        } else if (this.view instanceof MultiSlideRecyclerView) {
            MultiSlideRecyclerView multiSlideRecyclerView = (MultiSlideRecyclerView) this.view;
            if (((MultiSlideRecyclerView) this.view).getCurrentPosition() == i || i >= multiSlideRecyclerView.getAdapter().getItemCount()) {
                return;
            }
            multiSlideRecyclerView.smoothScrollToPosition(i);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(aa.e eVar) {
        int displayedChild;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue();
        }
        if ((eVar.c.equals("onwilldisappear") || eVar.c.equals("onwillappear")) && getView() != null) {
            if (eVar.c.equals("onwillappear")) {
                startSlide(-1);
            } else {
                stopSlide();
            }
            if ((this.view instanceof TNodeViewAnimator) && (displayedChild = ((TNodeViewAnimator) this.view).getDisplayedChild()) < this.node.d.size()) {
                HashMap hashMap = new HashMap();
                hashMap.put("index", Integer.valueOf(displayedChild));
                sendMessage(eVar.c.equals("onwillappear") ? 130 : Component.MSG_FLAG_DISAPPEAR, this.node.d.get(displayedChild), eVar.c, null, hashMap, eVar.e);
            }
        }
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public a mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("d4f61400", new Object[]{this}) : new a();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public int getScrollCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce801786", new Object[]{this})).intValue() : this.node.R();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean invoke(g.c cVar, String str, JSONObject jSONObject, g.d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f67261c", new Object[]{this, cVar, str, jSONObject, dVar})).booleanValue();
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 3540994:
                if (str.equals("stop")) {
                    c = 2;
                    break;
                }
                break;
            case 106440182:
                if (str.equals("pause")) {
                    c = 1;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 0;
                    break;
                }
                break;
            case 298581833:
                if (str.equals("setSliderParams")) {
                    c = 3;
                    break;
                }
                break;
            case 2066202662:
                if (str.equals("slideToIndex")) {
                    c = 4;
                    break;
                }
                break;
        }
        if (c == 0) {
            int intValue = jSONObject != null ? jSONObject.getIntValue("delay") : 0;
            this.pausedByElementCall = false;
            startSlide(intValue);
        } else if (c == 1) {
            stopSlide();
            this.pausedByElementCall = true;
        } else if (c == 2) {
            resetSlide();
            this.pausedByElementCall = true;
        } else if (c != 3) {
            if (c != 4) {
                z = false;
            } else if (jSONObject != null) {
                slideToIndex(jSONObject.getIntValue("index"));
            }
        } else if (jSONObject != null) {
            int intValue2 = jSONObject.getIntValue(Constants.Name.INTERVAL);
            int intValue3 = jSONObject.getIntValue("duration");
            if (intValue2 > 0) {
                this.node.a(Constants.Name.INTERVAL, Integer.valueOf(intValue2));
                ((a) this.viewParams).c = intValue2;
            }
            if (intValue3 > 0) {
                this.node.a("duration", Integer.valueOf(intValue3));
                ((a) this.viewParams).b = intValue3;
                if (this.view instanceof TNodeViewAnimator) {
                    Animation inAnimation = ((TNodeViewAnimator) this.view).getInAnimation();
                    if (inAnimation != null) {
                        inAnimation.setDuration(intValue3);
                    }
                    Animation outAnimation = ((TNodeViewAnimator) this.view).getOutAnimation();
                    if (outAnimation != null) {
                        outAnimation.setDuration(intValue3);
                    }
                }
            }
        }
        return !z ? super.invoke(cVar, str, jSONObject, dVar) : z;
    }

    /* loaded from: classes8.dex */
    public static class a extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ATTR_MULTI_NOT_RESET = "multi-not-reset";
        public boolean f;

        /* renamed from: a  reason: collision with root package name */
        public String f20053a = "up";
        public int b = 300;
        public int c = 2000;
        public int d = 0;
        public String e = "single";
        public boolean g = false;

        static {
            kge.a(-1862479889);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1185345197) {
                super.a((Context) objArr[0], (HashMap) objArr[1]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // tb.ogl
        public void a(Context context, HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9591153", new Object[]{this, context, hashMap});
                return;
            }
            super.a(context, hashMap);
            if (hashMap != null && hashMap.containsKey("direction")) {
                this.f20053a = (String) hashMap.get("direction");
            } else {
                this.f20053a = "up";
            }
            this.b = oec.a(hashMap.get("duration"), 300);
            this.c = oec.a(hashMap.get(Constants.Name.INTERVAL), 2000);
            this.d = oec.a(hashMap.get("delay"), 0);
            String str = (String) hashMap.get("mode");
            if (!StringUtils.isEmpty(str)) {
                this.e = str;
            }
            this.f = oec.a(hashMap.get("autoplay"), false);
            this.g = oec.a(hashMap.get(ATTR_MULTI_NOT_RESET), false);
        }
    }

    /* loaded from: classes8.dex */
    public class TNodeViewAnimator extends ViewAnimator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1285249761);
        }

        public static /* synthetic */ Object ipc$super(TNodeViewAnimator tNodeViewAnimator, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 949399698) {
                super.onDetachedFromWindow();
                return null;
            } else if (hashCode != 1626033557) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onAttachedToWindow();
                return null;
            }
        }

        public TNodeViewAnimator(Context context) {
            super(context);
        }

        public TNodeViewAnimator(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
                return;
            }
            super.onAttachedToWindow();
            SliderComponent.this.startSlide(-1);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3896b092", new Object[]{this});
                return;
            }
            super.onDetachedFromWindow();
            SliderComponent.access$1200(SliderComponent.this).removeCallbacks(SliderComponent.access$900(SliderComponent.this));
        }
    }

    /* loaded from: classes8.dex */
    public class MultiSlideRecyclerView extends RecyclerView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final int ITEM_COUNT = 0;
        private b adapter;

        static {
            kge.a(-2138090241);
        }

        public static /* synthetic */ Object ipc$super(MultiSlideRecyclerView multiSlideRecyclerView, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 949399698) {
                super.onDetachedFromWindow();
                return null;
            } else if (hashCode != 1626033557) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onAttachedToWindow();
                return null;
            }
        }

        @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
            }
            return false;
        }

        @Override // android.support.v7.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
            }
            return false;
        }

        public MultiSlideRecyclerView(Context context) {
            super(context);
            setLayoutManager(new a(context));
            this.adapter = new b();
            setAdapter(this.adapter);
        }

        public void reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
            } else {
                setAdapter(this.adapter);
            }
        }

        public int getCurrentPosition() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
            }
            int findLastCompletelyVisibleItemPosition = ((LinearLayoutManager) getLayoutManager()).findLastCompletelyVisibleItemPosition();
            if (findLastCompletelyVisibleItemPosition >= 0) {
                return findLastCompletelyVisibleItemPosition;
            }
            return 0;
        }

        @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
                return;
            }
            super.onAttachedToWindow();
            SliderComponent.this.startSlide(-1);
        }

        @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3896b092", new Object[]{this});
                return;
            }
            super.onDetachedFromWindow();
            SliderComponent.this.stopSlide();
        }

        /* loaded from: classes8.dex */
        public class a extends LinearLayoutManager {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private float b;
            private RecyclerView c;

            static {
                kge.a(-1843863368);
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1078087916) {
                    super.offsetChildrenVertical(((Number) objArr[0]).intValue());
                    return null;
                } else if (hashCode == 1626618577) {
                    super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
                    return null;
                } else if (hashCode != 1769978169) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.layoutDecoratedWithMargins((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                    return null;
                }
            }

            public static /* synthetic */ float a(a aVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3c7669cd", new Object[]{aVar})).floatValue() : aVar.b;
            }

            public a(Context context) {
                super(context);
                this.b = 100.0f;
            }

            @Override // android.support.v7.widget.RecyclerView.LayoutManager
            public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("697fb939", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                    return;
                }
                super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
                this.c = (RecyclerView) view.getParent();
            }

            @Override // android.support.v7.widget.RecyclerView.LayoutManager
            public void offsetChildrenVertical(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bfbdaf14", new Object[]{this, new Integer(i)});
                    return;
                }
                super.offsetChildrenVertical(i);
                RecyclerView recyclerView = this.c;
                if (recyclerView == null) {
                    return;
                }
                int childCount = recyclerView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = this.c.getChildAt(i2);
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    int i3 = bottom - top;
                    int height = getHeight();
                    if (i3 > 0) {
                        if (top < i3) {
                            if (top < 0) {
                                childAt.setAlpha(0.0f);
                            } else {
                                childAt.setAlpha(top / i3);
                            }
                        } else if (bottom > height) {
                            childAt.setAlpha(((height * 1.0f) - top) / i3);
                        } else {
                            childAt.setAlpha(1.0f);
                        }
                    }
                }
            }

            @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("77e7cc6e", new Object[]{this, recyclerView, state, new Integer(i)});
                    return;
                }
                int size = SliderComponent.access$1800(SliderComponent.this).d.size();
                if (i < 0 || i >= size) {
                    return;
                }
                com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = SliderComponent.access$1900(SliderComponent.this).d.get(i);
                if (aaVar != null && aaVar.I() != null) {
                    this.b = aaVar.G().b + aaVar.I().getViewParams().am + aaVar.I().getViewParams().an;
                }
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) { // from class: com.taobao.tao.flexbox.layoutmanager.component.SliderComponent.MultiSlideRecyclerView.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.support.v7.widget.LinearSmoothScroller
                    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue() : (((a) SliderComponent.access$2000(SliderComponent.this)).b * 0.3356f) / a.a(a.this);
                    }
                };
                linearSmoothScroller.setTargetPosition(i);
                startSmoothScroll(linearSmoothScroller);
                if (aaVar == null || (str = (String) aaVar.e("onwillappear")) == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("index", Integer.valueOf(i));
                SliderComponent.this.sendMessage(130, aaVar, "onwillappear", str, hashMap, null);
            }

            @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
            public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("60f43ad1", new Object[]{this, recycler, state});
                    return;
                }
                try {
                    super.onLayoutChildren(recycler, state);
                } catch (Exception e) {
                    ogg.a("LocalLinearLayoutManager", e.getMessage());
                }
            }
        }

        /* loaded from: classes8.dex */
        public class b extends RecyclerView.Adapter {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* loaded from: classes8.dex */
            public class a extends RecyclerView.ViewHolder {
                static {
                    kge.a(-822566930);
                }

                public a(View view) {
                    super(view);
                }
            }

            static {
                kge.a(-553847834);
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                if (str.hashCode() == -1324657775) {
                    super.onViewRecycled((RecyclerView.ViewHolder) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.RecyclerView.Adapter
            public int getItemViewType(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
                }
                return 0;
            }

            public b() {
            }

            private FrameLayout.LayoutParams a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("80846399", new Object[]{this, aaVar});
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, aaVar.G().b);
                ogl viewParams = aaVar.I().getViewParams();
                layoutParams.topMargin = viewParams.am;
                layoutParams.bottomMargin = viewParams.an;
                layoutParams.leftMargin = viewParams.ak;
                layoutParams.rightMargin = viewParams.al;
                return layoutParams;
            }

            @Override // android.support.v7.widget.RecyclerView.Adapter
            /* renamed from: onCreateViewHolder */
            public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : new a(new FrameLayout(viewGroup.getContext()));
            }

            @Override // android.support.v7.widget.RecyclerView.Adapter
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("61bdb19b", new Object[]{this, viewHolder, new Integer(i), list});
                } else {
                    onBindViewHolder(viewHolder, i);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.Adapter
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                com.taobao.tao.flexbox.layoutmanager.core.aa a2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) viewHolder.itemView;
                frameLayout.removeAllViews();
                if (i < 0 || (a2 = a(i)) == null) {
                    return;
                }
                try {
                    if (a2.n()) {
                        a2.l();
                    }
                    if (!a2.w() || a2.s()) {
                        a2.b(frameLayout.getContext());
                    }
                    ViewParent parent = a2.x().getParent();
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(a2.x());
                    }
                    frameLayout.addView(a2.x(), a(a2));
                    frameLayout.setTag(R.id.layout_manager_cell_tag_id, a2);
                    Component I = a2.I();
                    frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, a2.G().b + I.getViewParams().am + I.getViewParams().an));
                } catch (Exception e) {
                    ogg.a("TNode", e.getMessage());
                }
            }

            @Override // android.support.v7.widget.RecyclerView.Adapter
            public int getItemCount() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : SliderComponent.access$2200(SliderComponent.this).d.size();
            }

            @Override // android.support.v7.widget.RecyclerView.Adapter
            public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b10b5391", new Object[]{this, viewHolder});
                    return;
                }
                super.onViewRecycled(viewHolder);
                com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = (com.taobao.tao.flexbox.layoutmanager.core.aa) viewHolder.itemView.getTag(R.id.layout_manager_cell_tag_id);
                if (aaVar == null) {
                    return;
                }
                aaVar.d(false);
            }

            public com.taobao.tao.flexbox.layoutmanager.core.aa a(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("e5ca1e03", new Object[]{this, new Integer(i)});
                }
                if (i < 0 || i >= SliderComponent.access$2300(SliderComponent.this).d.size()) {
                    return null;
                }
                return SliderComponent.access$2400(SliderComponent.this).d.get(i);
            }
        }
    }
}
