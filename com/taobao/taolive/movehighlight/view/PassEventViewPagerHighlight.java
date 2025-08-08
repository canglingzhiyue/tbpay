package com.taobao.taolive.movehighlight.view;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.ViewPager;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.movehighlight.utils.c;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.controller.e;
import com.taobao.taolive.sdk.core.g;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.b;
import com.taobao.taolive.sdk.utils.d;
import com.taobao.taolive.sdk.utils.u;
import tb.kge;
import tb.pfb;
import tb.pmd;
import tb.poy;

/* loaded from: classes8.dex */
public class PassEventViewPagerHighlight extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean clearClick;
    private float lastX;
    private View mBackView;
    private boolean mCanScroll;
    private d mClickUtil;
    private a mFrameContext;
    private float mTouchX;
    private float mTouchY;
    public double screenHeight;

    static {
        kge.a(-157733451);
    }

    public static /* synthetic */ Object ipc$super(PassEventViewPagerHighlight passEventViewPagerHighlight, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1577577649) {
            super.scrollTo(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        } else {
            if (hashCode != -407533570) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
    }

    public PassEventViewPagerHighlight(Context context) {
        this(context, null);
    }

    public PassEventViewPagerHighlight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCanScroll = true;
        this.lastX = -1.0f;
        this.clearClick = false;
        this.screenHeight = b.c(getContext()) * c.c();
    }

    public void setFrameContext(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17230f1a", new Object[]{this, aVar});
        } else {
            this.mFrameContext = aVar;
        }
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

    public void setOnClearClickListener(d.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b95b28", new Object[]{this, aVar, new Boolean(z)});
            return;
        }
        this.mClickUtil = new d(getContext(), aVar);
        checkCleanScreenOptimize(z);
    }

    private void checkCleanScreenOptimize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65691183", new Object[]{this, new Boolean(z)});
        } else if (u.ag() && this.mClickUtil != null && !z) {
            int a2 = b.a(getContext(), 211.0f);
            int a3 = b.a(getContext(), 100.0f);
            this.mClickUtil.a(a2);
            this.mClickUtil.b(a3);
        } else {
            this.mClickUtil.a(0);
            this.mClickUtil.b(0);
        }
    }

    private void procSlidingClosePage(int i, int i2) {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec1ad76", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!u.S() || Math.abs(i) - Math.abs(i2) <= 5) {
        } else {
            int ah = u.ah();
            if (ah < 50) {
                ah = 50;
            }
            if (!(getContext() instanceof Activity) || i <= ah || getCurrentItem() != 0) {
                return;
            }
            VideoInfo u = poy.u(this.mFrameContext);
            pfb a2 = pfb.a(this.mFrameContext);
            if (u != null && u.status == 0 && c.i() && poy.B(this.mFrameContext) == 0) {
                if (a2.l() == null) {
                    return;
                }
                g b = n.b(this.mFrameContext);
                String str = "timemoveReturn";
                if ((b instanceof e) && c.w()) {
                    if (!StringUtils.isEmpty(((e) b).q)) {
                        str = "timemoveReturn." + eVar.q;
                    }
                }
                a2.l().j(this.mFrameContext, str);
            } else if (a2.l() == null) {
            } else {
                a2.l().a(this.mFrameContext, null);
            }
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!pmd.a().a("horizontalScroll")) {
            return false;
        }
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.lastX = motionEvent.getX();
            this.mTouchX = motionEvent.getX();
            this.mTouchY = motionEvent.getY();
            d dVar = this.mClickUtil;
            if (dVar != null) {
                dVar.a(this.mTouchX, this.mTouchY);
            }
        } else if ((action == 1 || action == 3) && y < this.screenHeight && c.e()) {
            procSlidingClosePage((int) (x - this.mTouchX), (int) (y - this.mTouchY));
        }
        try {
            if (this.mBackView != null && this.mBackView.getVisibility() == 0) {
                if (this.mBackView instanceof ViewGroup) {
                    if (this.mBackView.dispatchTouchEvent(motionEvent)) {
                        return true;
                    }
                    if (motionEvent.getAction() == 1 && this.mClickUtil != null) {
                        if (this.clearClick) {
                            this.clearClick = false;
                        } else {
                            this.mClickUtil.b(motionEvent.getX(), motionEvent.getY());
                        }
                    }
                    return super.onTouchEvent(motionEvent);
                } else if (this.mBackView.onTouchEvent(motionEvent)) {
                    return true;
                } else {
                    return super.onTouchEvent(motionEvent);
                }
            }
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mCanScroll && !poy.aj(this.mFrameContext) && pmd.a().a("horizontalScroll")) {
            try {
                this.clearClick = false;
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
}
