package com.taobao.android.live.plugin.atype.flexalocal.fullscreen.view;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.utils.r;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.core.e;
import com.taobao.taolive.sdk.utils.d;
import com.taobao.taolive.sdk.utils.u;
import tb.ddw;
import tb.hkk;
import tb.kge;
import tb.pmd;
import tb.poy;

/* loaded from: classes5.dex */
public class PassEventViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int enableScrollOpt;
    private boolean enableClose;
    private boolean enableLongClick;
    private boolean interceptUpAction;
    private View mBackView;
    private boolean mCanScroll;
    private d mClickUtil;
    private a mFrameContext;
    private Handler mHandler;
    private View.OnLongClickListener mOnLongClickListener;
    private Runnable mOnLongClickRunnable;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private boolean revertClickPadding;

    public static /* synthetic */ Object ipc$super(PassEventViewPager passEventViewPager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1577577649:
                super.scrollTo(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ View.OnLongClickListener access$000(PassEventViewPager passEventViewPager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnLongClickListener) ipChange.ipc$dispatch("c09de854", new Object[]{passEventViewPager}) : passEventViewPager.mOnLongClickListener;
    }

    public PassEventViewPager(Context context) {
        this(context, null);
    }

    public PassEventViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCanScroll = true;
        this.enableLongClick = true;
        this.enableClose = true;
        this.interceptUpAction = false;
        this.revertClickPadding = false;
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mOnLongClickRunnable = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.view.PassEventViewPager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (PassEventViewPager.access$000(PassEventViewPager.this) == null) {
                } else {
                    PassEventViewPager.this.requestDisallowInterceptTouchEvent(true);
                    PassEventViewPager.access$000(PassEventViewPager.this).onLongClick(PassEventViewPager.this);
                }
            }
        };
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public void setCanScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98fe6b92", new Object[]{this, new Boolean(z)});
        } else {
            this.mCanScroll = z;
        }
    }

    public void setBackView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f84967d", new Object[]{this, view});
        } else {
            this.mBackView = view;
        }
    }

    public void setFrameContext(a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17230f1a", new Object[]{this, aVar});
            return;
        }
        this.mFrameContext = aVar;
        a aVar2 = this.mFrameContext;
        if (aVar2 != null) {
            ATaoLiveOpenEntity o = aVar2.o();
            if (o != null && o.bizCode != null && (o.bizCode.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.toString()) || o.bizCode.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_NewShop.toString()))) {
                z = true;
            }
            if (o != null && o.abilityCompontent != null && o.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRCommentFeatMap)) {
                this.revertClickPadding = true;
            }
        }
        this.enableLongClick = !z;
        this.enableClose = !z;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f73f2f", new Object[]{this, onLongClickListener});
        } else {
            this.mOnLongClickListener = onLongClickListener;
        }
    }

    public void setOnClearClickListener(d.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b95b28", new Object[]{this, aVar, new Boolean(z)});
            return;
        }
        this.mClickUtil = new d(getContext(), aVar);
        checkCleanScreenOptimize(z);
    }

    public void setOnClearClickListener(d.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c772a9", new Object[]{this, bVar, new Boolean(z)});
            return;
        }
        this.mClickUtil = new d(getContext(), bVar);
        checkCleanScreenOptimize(z);
    }

    private void checkCleanScreenOptimize(boolean z) {
        ATaoLiveOpenEntity o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65691183", new Object[]{this, new Boolean(z)});
        } else if (u.ag() && this.mClickUtil != null && !z && !this.revertClickPadding) {
            int a2 = com.taobao.taolive.room.utils.d.a(getContext(), 211.0f);
            int a3 = com.taobao.taolive.room.utils.d.a(getContext(), 100.0f);
            a aVar = this.mFrameContext;
            if ((aVar instanceof e) && (o = ((e) aVar).o()) != null && o.uiCompontent != null && o.uiCompontent.a() != null) {
                a3 = (int) (o.uiCompontent.a().i().floatValue() + com.taobao.taolive.room.utils.d.a(getContext(), 100.0f));
            }
            this.mClickUtil.a(a2);
            this.mClickUtil.b(a3);
        } else {
            this.mClickUtil.a(0);
            this.mClickUtil.b(0);
        }
    }

    private void procSlidingClosePage(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec1ad76", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!this.enableClose || !u.S() || Math.abs(i) - Math.abs(i2) <= this.mTouchSlop) {
        } else {
            int ah = u.ah();
            if (ah < 200) {
                ah = 200;
            }
            if (!(getContext() instanceof Activity) || i <= ah || getCurrentItem() != 0) {
                return;
            }
            ddw.a().a("com.taobao.taolive.room.sliding_close_page", null, this.mFrameContext.G());
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if ((!enableScrollOpt() || this.mCanScroll) && !r.f21775a && pmd.a().a("horizontalScroll")) {
            int action = motionEvent.getAction();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (action == 0) {
                this.mTouchX = motionEvent.getX();
                this.mTouchY = motionEvent.getY();
                d dVar = this.mClickUtil;
                if (dVar != null) {
                    dVar.a(this.mTouchX, this.mTouchY);
                }
                postDelayedLongPressCallback();
            } else if ((action == 1 || (action != 2 && action == 3)) && (!hkk.L() || !this.interceptUpAction)) {
                procSlidingClosePage((int) (x - this.mTouchX), (int) (y - this.mTouchY));
                removeLongPressCallback();
            }
            try {
                if (this.mBackView != null && this.mBackView.getVisibility() == 0) {
                    if (this.mBackView instanceof ViewGroup) {
                        if (!this.mBackView.dispatchTouchEvent(motionEvent)) {
                            if (motionEvent.getAction() == 1 && this.mClickUtil != null) {
                                this.mClickUtil.b(motionEvent.getX(), motionEvent.getY());
                            }
                            return super.onTouchEvent(motionEvent);
                        }
                        interceptUpAction(motionEvent);
                        return true;
                    } else if (!this.mBackView.onTouchEvent(motionEvent)) {
                        return super.onTouchEvent(motionEvent);
                    } else {
                        interceptUpAction(motionEvent);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mCanScroll && !poy.aj(this.mFrameContext) && !r.f21775a && pmd.a().a("horizontalScroll")) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f8134f", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!this.mCanScroll) {
        } else {
            super.scrollTo(i, i2);
        }
    }

    private void interceptUpAction(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78280c2f", new Object[]{this, motionEvent});
        } else if (!hkk.L()) {
        } else {
            if (motionEvent.getAction() == 0) {
                this.interceptUpAction = true;
                removeLongPressCallback();
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            } else {
                this.interceptUpAction = false;
            }
        }
    }

    private void postDelayedLongPressCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec6d391", new Object[]{this});
        } else if (!this.enableLongClick) {
        } else {
            this.mHandler.postDelayed(this.mOnLongClickRunnable, 800L);
        }
    }

    private void removeLongPressCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5a2f8ef", new Object[]{this});
            return;
        }
        Runnable runnable = this.mOnLongClickRunnable;
        if (runnable == null) {
            return;
        }
        this.mHandler.removeCallbacks(runnable);
    }

    static {
        kge.a(2104344631);
        enableScrollOpt = -1;
    }

    private static boolean enableScrollOpt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a8bd96e", new Object[0])).booleanValue();
        }
        if (enableScrollOpt == -1 && pmd.a().d() != null) {
            enableScrollOpt = v.e(pmd.a().d().a("tblive", "enableScrollOpt", "true")) ? 1 : 0;
        }
        return enableScrollOpt == 1;
    }
}
