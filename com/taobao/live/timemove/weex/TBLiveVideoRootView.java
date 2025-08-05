package com.taobao.live.timemove.weex;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class TBLiveVideoRootView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mDetachedFromWindowListener;
    private b mVisibilityChangedListener;

    /* loaded from: classes7.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes7.dex */
    public interface b {
        void a(int i);
    }

    static {
        kge.a(883308347);
    }

    public static /* synthetic */ Object ipc$super(TBLiveVideoRootView tBLiveVideoRootView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 348684699) {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode != 949399698) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDetachedFromWindow();
            return null;
        }
    }

    public TBLiveVideoRootView(Context context) {
        super(context);
    }

    public TBLiveVideoRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TBLiveVideoRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        b bVar = this.mVisibilityChangedListener;
        if (bVar == null) {
            return;
        }
        bVar.a(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        a aVar = this.mDetachedFromWindowListener;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    public TBLiveVideoRootView whenVisibilityChanged(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveVideoRootView) ipChange.ipc$dispatch("31cbcfaf", new Object[]{this, bVar});
        }
        this.mVisibilityChangedListener = bVar;
        return this;
    }

    public TBLiveVideoRootView whenDetachedFromWindow(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveVideoRootView) ipChange.ipc$dispatch("3a309752", new Object[]{this, aVar});
        }
        this.mDetachedFromWindowListener = aVar;
        return this;
    }
}
