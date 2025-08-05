package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.widget.Scroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.view.edgepan.EdgePanViewPager;
import java.lang.reflect.Field;
import tb.kge;
import tb.oeb;

/* loaded from: classes8.dex */
public class SpeedEdgePanViewPager extends EdgePanViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DRAG_LEFT = 0;
    private static final int DRAG_NONE = -1;
    private static final int DRAG_RIGHT = 1;
    private int dragType;
    private a drawOrderDelegate;
    private boolean enableDragCrossItems;
    private int scrollState;

    /* loaded from: classes8.dex */
    public interface a {
        int a(int i, int i2);
    }

    static {
        kge.a(-306755388);
    }

    public static /* synthetic */ Object ipc$super(SpeedEdgePanViewPager speedEdgePanViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1577577649) {
            super.scrollTo(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        } else {
            if (hashCode != 2058294000) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Integer(super.getChildDrawingOrder(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
        }
    }

    public static /* synthetic */ int access$002(SpeedEdgePanViewPager speedEdgePanViewPager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32c35252", new Object[]{speedEdgePanViewPager, new Integer(i)})).intValue();
        }
        speedEdgePanViewPager.scrollState = i;
        return i;
    }

    public static /* synthetic */ int access$100(SpeedEdgePanViewPager speedEdgePanViewPager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c7fb8b8", new Object[]{speedEdgePanViewPager})).intValue() : speedEdgePanViewPager.dragType;
    }

    public static /* synthetic */ int access$102(SpeedEdgePanViewPager speedEdgePanViewPager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9cf3953", new Object[]{speedEdgePanViewPager, new Integer(i)})).intValue();
        }
        speedEdgePanViewPager.dragType = i;
        return i;
    }

    public SpeedEdgePanViewPager(Context context, int i) {
        super(context);
        this.dragType = -1;
        this.enableDragCrossItems = true;
        if (i > 0) {
            try {
                SpeedScroller speedScroller = new SpeedScroller(context, i);
                Field declaredField = ViewPager.class.getDeclaredField("mScroller");
                declaredField.setAccessible(true);
                declaredField.set(this, speedScroller);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: com.taobao.tao.flexbox.layoutmanager.view.SpeedEdgePanViewPager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -188663035) {
                    super.onPageScrolled(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode != 1703005214) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onPageScrollStateChanged(((Number) objArr[0]).intValue());
                    return null;
                }
            }

            @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i2)});
                    return;
                }
                super.onPageScrollStateChanged(i2);
                SpeedEdgePanViewPager.access$002(SpeedEdgePanViewPager.this, i2);
                if (i2 != 0) {
                    return;
                }
                SpeedEdgePanViewPager.access$102(SpeedEdgePanViewPager.this, -1);
            }

            @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i2, float f, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i2), new Float(f), new Integer(i3)});
                    return;
                }
                super.onPageScrolled(i2, f, i3);
                if (i2 <= 0 && SpeedEdgePanViewPager.this.getScrollX() < 0 && SpeedEdgePanViewPager.access$100(SpeedEdgePanViewPager.this) == -1) {
                    SpeedEdgePanViewPager.access$102(SpeedEdgePanViewPager.this, 0);
                } else if (i2 != 1 || f <= 0.0f || SpeedEdgePanViewPager.this.getScrollX() <= 0 || SpeedEdgePanViewPager.access$100(SpeedEdgePanViewPager.this) != -1) {
                } else {
                    SpeedEdgePanViewPager.access$102(SpeedEdgePanViewPager.this, 1);
                }
            }
        });
    }

    public void setDragCrossItemsEnable(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d278f4", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z && !oeb.a("forceDragCrossItems", false)) {
            z2 = false;
        }
        this.enableDragCrossItems = z2;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.edgepan.EdgePanViewPager, android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() != 0 || this.scrollState != 2 || this.enableDragCrossItems) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f8134f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (!this.enableDragCrossItems && ((i3 = this.scrollState) == 1 || i3 == 2)) {
            if (i < 0 && this.dragType == 1) {
                i = 0;
            }
            if (i > 0 && this.dragType == 0) {
                i = 0;
            }
        }
        super.scrollTo(i, i2);
    }

    /* loaded from: classes8.dex */
    public class SpeedScroller extends Scroller {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int mDuration;

        static {
            kge.a(244043169);
        }

        public static /* synthetic */ Object ipc$super(SpeedScroller speedScroller, String str, Object... objArr) {
            if (str.hashCode() == 948268333) {
                super.startScroll(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public SpeedScroller(Context context, int i) {
            super(context);
            this.mDuration = i;
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38856d2d", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            } else {
                super.startScroll(i, i2, i3, i4, this.mDuration);
            }
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af3e1896", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else {
                super.startScroll(i, i2, i3, i4, this.mDuration);
            }
        }
    }

    public void setDrawOrderDelegate(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("833bdb0c", new Object[]{this, aVar});
        } else {
            this.drawOrderDelegate = aVar;
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7aaf12f0", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        a aVar = this.drawOrderDelegate;
        if (aVar != null) {
            return aVar.a(i, i2);
        }
        return super.getChildDrawingOrder(i, i2);
    }
}
