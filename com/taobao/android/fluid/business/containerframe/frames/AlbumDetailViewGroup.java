package com.taobao.android.fluid.business.containerframe.frames;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.SlidingLayout;
import tb.kge;

/* loaded from: classes5.dex */
public class AlbumDetailViewGroup extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Runnable mPullRightCallback;
    private SlidingLayout.a mPullRightHelper;

    static {
        kge.a(1598025079);
    }

    public static /* synthetic */ Object ipc$super(AlbumDetailViewGroup albumDetailViewGroup, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -614473710) {
            if (hashCode != 949399698) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onDetachedFromWindow();
            return null;
        }
        return new Boolean(super.canScrollHorizontally(((Number) objArr[0]).intValue()));
    }

    public static /* synthetic */ Runnable access$000(AlbumDetailViewGroup albumDetailViewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("8f8db065", new Object[]{albumDetailViewGroup}) : albumDetailViewGroup.mPullRightCallback;
    }

    public AlbumDetailViewGroup(Context context) {
        this(context, null);
    }

    public AlbumDetailViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlbumDetailViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue() : this.mPullRightHelper.a(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mPullRightHelper.c();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue() : this.mPullRightHelper.b(motionEvent);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i < 0 && isShown()) {
            return true;
        }
        return super.canScrollHorizontally(i);
    }

    public void setPullRightCallback(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4409af7f", new Object[]{this, runnable});
        } else {
            this.mPullRightCallback = runnable;
        }
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
        } else {
            this.mPullRightHelper = new SlidingLayout.a(this) { // from class: com.taobao.android.fluid.business.containerframe.frames.AlbumDetailViewGroup.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.layoutmanager.container.SlidingLayout.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    }
                }

                @Override // com.taobao.android.layoutmanager.container.SlidingLayout.a
                public void a(float f) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
                    }
                }

                @Override // com.taobao.android.layoutmanager.container.SlidingLayout.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else if (AlbumDetailViewGroup.access$000(AlbumDetailViewGroup.this) == null) {
                    } else {
                        AlbumDetailViewGroup.access$000(AlbumDetailViewGroup.this).run();
                    }
                }
            };
        }
    }
}
