package com.taobao.search.musie.web;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import mtopsdk.common.util.StringUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.r;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class MusWebViewHost extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean disableTouch;
    private String mCurrentUrl;
    private WVUCWebView mWebView;

    static {
        kge.a(193566637);
    }

    public static /* synthetic */ Object ipc$super(MusWebViewHost musWebViewHost, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusWebViewHost(Context context) {
        super(context);
        q.c(context, "context");
    }

    private final void createWebViewIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("688726d6", new Object[]{this});
        } else if (this.mWebView != null) {
        } else {
            WVUCWebView wVUCWebView = new WVUCWebView(getContext());
            wVUCWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            wVUCWebView.setWebViewClient(new a(getContext()));
            if (r.M()) {
                wVUCWebView.setBackgroundColor(0);
            }
            addView(wVUCWebView);
            this.mWebView = wVUCWebView;
        }
    }

    private final void destroyWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5272a7c6", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.mWebView;
        if (wVUCWebView != null && !wVUCWebView.isDestroied()) {
            wVUCWebView.destroy();
        }
        removeAllViews();
        this.mWebView = null;
        this.mCurrentUrl = null;
    }

    public final void mount(String url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cd26dea", new Object[]{this, url});
            return;
        }
        q.c(url, "url");
        if (StringUtils.equals(url, this.mCurrentUrl)) {
            return;
        }
        createWebViewIfNeeded();
        WVUCWebView wVUCWebView = this.mWebView;
        if (wVUCWebView != null) {
            wVUCWebView.loadUrl(url);
        }
        this.mCurrentUrl = url;
    }

    public final void setDisableTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b3a014", new Object[]{this, new Boolean(z)});
        } else {
            this.disableTouch = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.disableTouch) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public final void unMount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96b27987", new Object[]{this});
        } else {
            destroyWebView();
        }
    }
}
