package com.taobao.weex.ui.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes9.dex */
public class WXScrollView extends ScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<WXScrollViewListener> mScrollViewListeners;

    /* loaded from: classes9.dex */
    public interface WXScrollViewListener {
        void onScroll(WXScrollView wXScrollView, int i, int i2);

        void onScrollChanged(WXScrollView wXScrollView, int i, int i2, int i3, int i4);

        void onScrollStopped(WXScrollView wXScrollView, int i, int i2);

        void onScrollToBottom(WXScrollView wXScrollView, int i, int i2);
    }

    static {
        kge.a(-487009347);
    }

    public WXScrollView(Context context) {
        super(context);
        this.mScrollViewListeners = new CopyOnWriteArrayList();
    }

    public WXScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mScrollViewListeners = new CopyOnWriteArrayList();
    }

    public WXScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mScrollViewListeners = new CopyOnWriteArrayList();
    }

    public void addScrollViewListener(WXScrollViewListener wXScrollViewListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60fc2065", new Object[]{this, wXScrollViewListener});
        } else if (this.mScrollViewListeners.contains(wXScrollViewListener)) {
        } else {
            this.mScrollViewListeners.add(wXScrollViewListener);
        }
    }

    public void removeScrollViewListener(WXScrollViewListener wXScrollViewListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c99ae2", new Object[]{this, wXScrollViewListener});
        } else {
            this.mScrollViewListeners.remove(wXScrollViewListener);
        }
    }

    public Rect getContentFrame() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("82dbf0fa", new Object[]{this}) : new Rect(0, 0, computeHorizontalScrollRange(), computeVerticalScrollRange());
    }
}
