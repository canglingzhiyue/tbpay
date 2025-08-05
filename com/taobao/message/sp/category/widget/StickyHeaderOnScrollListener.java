package com.taobao.message.sp.category.widget;

import android.animation.Animator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.tao.log.TLog;
import com.taobao.uikit.feature.view.TRecyclerView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import tb.kge;

/* loaded from: classes7.dex */
public class StickyHeaderOnScrollListener<T> extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "StickyHeader";
    private WidgetInstance headWidgetInstance;
    private CustomerFrameLayout headerViewPlaceHolder;
    private TRecyclerView recyclerView;
    private StickFrameLayout topLayout;
    private final int ANIMATOR_TIME = 150;
    private final int NORMAL_STATE = 0;
    private final int STICKY_STATE = 1;
    private final int PRE_STICKY_STATE = 2;
    private final int CANCEL_STICKY_STATE = 3;
    private int modeState = 0;
    private int mLastColor = 0;
    private boolean stickyHeaderAnimating = false;
    private boolean cancelStickyHeaderAnimating = false;
    private boolean isIdleReStickyHeader = false;

    static {
        kge.a(334384295);
    }

    public static /* synthetic */ Object ipc$super(StickyHeaderOnScrollListener stickyHeaderOnScrollListener, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ StickFrameLayout access$000(StickyHeaderOnScrollListener stickyHeaderOnScrollListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StickFrameLayout) ipChange.ipc$dispatch("8405fc6e", new Object[]{stickyHeaderOnScrollListener}) : stickyHeaderOnScrollListener.topLayout;
    }

    public static /* synthetic */ boolean access$102(StickyHeaderOnScrollListener stickyHeaderOnScrollListener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ba33936", new Object[]{stickyHeaderOnScrollListener, new Boolean(z)})).booleanValue();
        }
        stickyHeaderOnScrollListener.stickyHeaderAnimating = z;
        return z;
    }

    public static /* synthetic */ boolean access$202(StickyHeaderOnScrollListener stickyHeaderOnScrollListener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6dba6695", new Object[]{stickyHeaderOnScrollListener, new Boolean(z)})).booleanValue();
        }
        stickyHeaderOnScrollListener.isIdleReStickyHeader = z;
        return z;
    }

    public static /* synthetic */ boolean access$302(StickyHeaderOnScrollListener stickyHeaderOnScrollListener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afd193f4", new Object[]{stickyHeaderOnScrollListener, new Boolean(z)})).booleanValue();
        }
        stickyHeaderOnScrollListener.cancelStickyHeaderAnimating = z;
        return z;
    }

    public static /* synthetic */ int access$400(StickyHeaderOnScrollListener stickyHeaderOnScrollListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fdd6e816", new Object[]{stickyHeaderOnScrollListener})).intValue() : stickyHeaderOnScrollListener.getFirstPosition();
    }

    public static /* synthetic */ TRecyclerView access$500(StickyHeaderOnScrollListener stickyHeaderOnScrollListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TRecyclerView) ipChange.ipc$dispatch("2b47088e", new Object[]{stickyHeaderOnScrollListener}) : stickyHeaderOnScrollListener.recyclerView;
    }

    public static /* synthetic */ int access$600(StickyHeaderOnScrollListener stickyHeaderOnScrollListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65333d98", new Object[]{stickyHeaderOnScrollListener})).intValue() : stickyHeaderOnScrollListener.mLastColor;
    }

    public StickyHeaderOnScrollListener(FrameLayout frameLayout, TRecyclerView tRecyclerView, WidgetInstance widgetInstance) {
        this.recyclerView = tRecyclerView;
        this.topLayout = new StickFrameLayout(tRecyclerView.getContext());
        this.headerViewPlaceHolder = new CustomerFrameLayout(tRecyclerView.getContext());
        this.headWidgetInstance = widgetInstance;
        this.headerViewPlaceHolder.setHedaView(widgetInstance.getView());
        widgetInstance.getView().measure(View.MeasureSpec.makeMeasureSpec(-1, 0), View.MeasureSpec.makeMeasureSpec(-1, 0));
        int measuredHeight = widgetInstance.getView().getMeasuredHeight();
        if (measuredHeight == 0) {
            TLog.loge(TAG, " measuredHeight " + measuredHeight);
            measuredHeight = DisplayUtil.ap2DesignScalePx(ApplicationUtil.getApplication(), 93.0f);
        }
        this.headerViewPlaceHolder.setLayoutParams(new RecyclerView.LayoutParams(-1, measuredHeight));
        frameLayout.addView(this.topLayout, -1, -2);
        this.topLayout.setBackgroundColor(0);
        if (widgetInstance != null) {
            tRecyclerView.removeHeaderView(widgetInstance.getView());
            this.topLayout.addView(widgetInstance.getView(), -1, -2);
            tRecyclerView.addHeaderView(this.headerViewPlaceHolder);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        if (i == 0 && this.isIdleReStickyHeader) {
            stickyHeaderTop();
        }
        if (getFirstPosition() != 0) {
            return;
        }
        if (recyclerView.getChildAt(0).getTop() != this.topLayout.getTranslationY()) {
            Log.e(TAG, "onScrollStateChanged    check " + recyclerView.getChildAt(0).getTop() + " " + this.topLayout.getTranslationY());
            this.topLayout.setTranslationY((float) recyclerView.getChildAt(0).getTop());
        }
        Log.e(TAG, "onScrollStateChanged    " + recyclerView.getChildAt(0).getTop() + " " + this.topLayout.getTranslationY());
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else if (this.modeState == 1 && recyclerView.getScrollState() != 2 && !this.stickyHeaderAnimating) {
            cancelStickyHeader();
        } else {
            int firstPosition = getFirstPosition();
            if (i2 > 0) {
                if (firstPosition == 0 && !this.stickyHeaderAnimating && this.modeState != 1) {
                    this.topLayout.setTranslationY(recyclerView.getChildAt(0).getTop());
                }
                if (firstPosition > 1 && Math.abs(this.topLayout.getTranslationY()) < this.topLayout.getMeasuredHeight() && this.modeState != 1) {
                    StickFrameLayout stickFrameLayout = this.topLayout;
                    stickFrameLayout.setTranslationY(-stickFrameLayout.getMeasuredHeight());
                }
            } else if (firstPosition == 0 && this.modeState != 1) {
                this.topLayout.setTranslationY(recyclerView.getChildAt(0).getTop());
            }
            if (Math.abs(this.topLayout.getTranslationY()) >= this.topLayout.getMeasuredHeight()) {
                i3 = -1;
            }
            if (i3 == this.mLastColor) {
                return;
            }
            this.topLayout.setBackgroundColor(i3);
            this.mLastColor = i3;
        }
    }

    private int getFirstPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("952d873d", new Object[]{this})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return -1;
        }
        return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
    }

    public void stickyHeaderTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed05e0a6", new Object[]{this});
            return;
        }
        TLog.loge(TAG, "stickyHeaderTop animate start " + this.topLayout.getTranslationY() + " " + this.topLayout.getScrollY() + " " + this.modeState);
        if ((this.stickyHeaderAnimating && this.modeState == 1) || this.topLayout.getTranslationY() == 0.0f || getFirstPosition() == 0) {
            return;
        }
        if (this.recyclerView.getScrollState() != 0) {
            this.isIdleReStickyHeader = true;
        } else if (this.cancelStickyHeaderAnimating) {
            this.recyclerView.postDelayed(new Runnable() { // from class: com.taobao.message.sp.category.widget.StickyHeaderOnScrollListener.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        StickyHeaderOnScrollListener.this.stickyHeaderTop();
                    }
                }
            }, 150L);
        } else {
            this.modeState = 1;
            this.stickyHeaderAnimating = true;
            this.topLayout.animate().translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(150L).setListener(new Animator.AnimatorListener() { // from class: com.taobao.message.sp.category.widget.StickyHeaderOnScrollListener.2
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
                    StickyHeaderOnScrollListener.access$000(StickyHeaderOnScrollListener.this).setStick(true);
                    StickyHeaderOnScrollListener.access$102(StickyHeaderOnScrollListener.this, false);
                    StickyHeaderOnScrollListener.access$202(StickyHeaderOnScrollListener.this, false);
                    UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_MsgCenter", 2201, "TBMSGPlatform_StickHead_Show", null, null, null).build());
                    StickyHeaderOnScrollListener.access$000(StickyHeaderOnScrollListener.this).setBackgroundColor(-1);
                }
            }).start();
        }
    }

    public void cancelStickyHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa315f7", new Object[]{this});
        } else if (this.cancelStickyHeaderAnimating) {
        } else {
            if (this.stickyHeaderAnimating) {
                this.recyclerView.postDelayed(new Runnable() { // from class: com.taobao.message.sp.category.widget.StickyHeaderOnScrollListener.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            StickyHeaderOnScrollListener.this.cancelStickyHeader();
                        }
                    }
                }, 150L);
            } else if (getFirstPosition() <= 0 || this.topLayout.getTranslationY() != 0.0f) {
            } else {
                this.modeState = 3;
                this.topLayout.animate().translationY(-this.topLayout.getMeasuredHeight()).setInterpolator(new LinearInterpolator()).setListener(new Animator.AnimatorListener() { // from class: com.taobao.message.sp.category.widget.StickyHeaderOnScrollListener.4
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
                        StickyHeaderOnScrollListener.access$000(StickyHeaderOnScrollListener.this).setStick(false);
                        StickyHeaderOnScrollListener.access$302(StickyHeaderOnScrollListener.this, false);
                        if (StickyHeaderOnScrollListener.access$400(StickyHeaderOnScrollListener.this) != 0) {
                            return;
                        }
                        float top = StickyHeaderOnScrollListener.access$500(StickyHeaderOnScrollListener.this).getChildAt(0).getTop();
                        if (top == StickyHeaderOnScrollListener.access$000(StickyHeaderOnScrollListener.this).getTranslationY()) {
                            return;
                        }
                        StickyHeaderOnScrollListener.access$000(StickyHeaderOnScrollListener.this).setTranslationY(top);
                        StickyHeaderOnScrollListener.access$000(StickyHeaderOnScrollListener.this).setBackgroundColor(StickyHeaderOnScrollListener.access$600(StickyHeaderOnScrollListener.this));
                    }
                }).setDuration(150L).start();
            }
        }
    }

    public void onDispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efb0bc7", new Object[]{this});
        } else {
            this.topLayout.onDispose();
        }
    }
}
