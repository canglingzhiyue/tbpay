package com.taobao.taolive.room.ui.view;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.room.utils.r;
import tb.kge;
import tb.pqa;

/* loaded from: classes8.dex */
public class TaoLiveKeyboardLayout extends RelativeLayout implements pqa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean mHasKeybord;
    private Object mInputFrame;
    private Rect mRect;
    private RecyclerView rvParent;

    static {
        kge.a(2106340336);
        kge.a(716394421);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKeyboardLayout taoLiveKeyboardLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    public static /* synthetic */ RecyclerView access$000(TaoLiveKeyboardLayout taoLiveKeyboardLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("7b2f6fca", new Object[]{taoLiveKeyboardLayout}) : taoLiveKeyboardLayout.rvParent;
    }

    public static /* synthetic */ void access$100(TaoLiveKeyboardLayout taoLiveKeyboardLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bb5b59", new Object[]{taoLiveKeyboardLayout});
        } else {
            taoLiveKeyboardLayout.tryShowInputFrame();
        }
    }

    public TaoLiveKeyboardLayout(Context context) {
        this(context, null);
    }

    public TaoLiveKeyboardLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TaoLiveKeyboardLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRect = new Rect();
        if (aa.cI()) {
            getRootView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.taolive.room.ui.view.TaoLiveKeyboardLayout.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                    } else if (TaoLiveKeyboardLayout.access$000(TaoLiveKeyboardLayout.this) != null && (TaoLiveKeyboardLayout.access$000(TaoLiveKeyboardLayout.this).getScrollState() != 0 || TaoLiveKeyboardLayout.access$000(TaoLiveKeyboardLayout.this).getChildCount() != 1)) {
                    } else {
                        TaoLiveKeyboardLayout.access$100(TaoLiveKeyboardLayout.this);
                    }
                }
            });
        }
    }

    private RecyclerView findParentTraversalByPredict() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("74fef176", new Object[]{this});
        }
        ViewParent parent = getParent();
        while (parent != null && !predict(parent)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return null;
        }
        return (RecyclerView) parent;
    }

    private boolean predict(ViewParent viewParent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6966ff6c", new Object[]{this, viewParent})).booleanValue() : viewParent instanceof RecyclerView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.rvParent != null) {
            return;
        }
        this.rvParent = findParentTraversalByPredict();
    }

    @Override // tb.pqa
    public void setAbsInputFrame2(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54663962", new Object[]{this, obj});
        } else {
            this.mInputFrame = obj;
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (!aa.cI()) {
            tryShowInputFrame();
        }
        super.onMeasure(i, i2);
    }

    public void onCreateView(Object obj, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed2e1341", new Object[]{this, obj, viewStub});
            return;
        }
        this.mInputFrame = obj;
        f.f().absInputFrameOnCreateView(this.mInputFrame, viewStub);
    }

    @Override // tb.pqa
    public void onDestory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
            return;
        }
        f.f().absInputFrameOnDestroy(this.mInputFrame);
        this.mInputFrame = null;
    }

    private void tryShowInputFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc636842", new Object[]{this});
            return;
        }
        getWindowVisibleDisplayFrame(this.mRect);
        int height = getRootView().getHeight();
        int i = this.mRect.bottom - this.mRect.top;
        int g = d.g(getContext());
        int i2 = height - i;
        if (i2 > height / 5) {
            if (!r.f21775a) {
                return;
            }
            this.mHasKeybord = true;
            if (this.mInputFrame == null) {
                return;
            }
            f.f().iInputFrameShowContentView(this.mInputFrame, (i2 - this.mRect.top) - g);
        } else if (!this.mHasKeybord) {
        } else {
            this.mHasKeybord = false;
            if (this.mInputFrame == null) {
                return;
            }
            f.f().iInputFrameHideContentView(this.mInputFrame);
            f.f().iInputFrameHideKeyBoard(this.mInputFrame);
        }
    }
}
