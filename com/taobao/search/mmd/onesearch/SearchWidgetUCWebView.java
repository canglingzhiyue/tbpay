package com.taobao.search.mmd.onesearch;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;
import com.uc.webview.export.WebSettings;
import tb.kge;

/* loaded from: classes7.dex */
public class SearchWidgetUCWebView extends WVUCWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int INVALID_POINTER = -1;
    public static final int MSG_KEYBOARD_WILL_HIDE = 1501;
    public static final int MSG_KEYBOARD_WILL_SHOW = 1500;
    private int mActivePointerId;
    private Context mContext;
    private boolean mIsBeingDragged;
    private int mLastMotionX;
    private int mPreBottom;
    private b mSearchUCWebViewClient;
    private int mSoftImHeight;
    private int mTouchSlop;
    private com.taobao.search.sf.widgets.onesearch.e widget;

    static {
        kge.a(-1099013249);
    }

    public static /* synthetic */ Object ipc$super(SearchWidgetUCWebView searchWidgetUCWebView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode != -244855388) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public SearchWidgetUCWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPreBottom = 0;
        this.mSoftImHeight = 0;
        this.mTouchSlop = -1;
        this.mIsBeingDragged = false;
        this.mActivePointerId = -1;
        this.mContext = context;
        init();
    }

    public SearchWidgetUCWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPreBottom = 0;
        this.mSoftImHeight = 0;
        this.mTouchSlop = -1;
        this.mIsBeingDragged = false;
        this.mActivePointerId = -1;
        this.mContext = context;
        init();
    }

    public SearchWidgetUCWebView(Context context) {
        super(context);
        this.mPreBottom = 0;
        this.mSoftImHeight = 0;
        this.mTouchSlop = -1;
        this.mIsBeingDragged = false;
        this.mActivePointerId = -1;
        this.mContext = context;
        init();
    }

    public void setWidget(com.taobao.search.sf.widgets.onesearch.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7529cf00", new Object[]{this, eVar});
        } else {
            this.widget = eVar;
        }
    }

    public void setFilter(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d12e7c", new Object[]{this, dVar});
            return;
        }
        this.mSearchUCWebViewClient = new b(this.mContext, dVar);
        this.mSearchUCWebViewClient.a(this.widget);
        setWebViewClient(this.mSearchUCWebViewClient);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        WebSettings settings = getSettings();
        setWebChromeClient(new a());
        this.mSoftImHeight = (int) (getResources().getDisplayMetrics().density * 120.0f);
        setBackgroundColor(0);
        try {
            settings.setBuiltInZoomControls(false);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
        } catch (Throwable unused) {
            q.b("SearchWidgetWebView", "初始化webview设置失败");
        }
    }

    public void setIntercept(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d5fcad", new Object[]{this, new Boolean(z)});
        } else {
            this.mSearchUCWebViewClient.a(z);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int i5 = this.mPreBottom;
        if (i5 > i4) {
            if (i5 - i4 > this.mSoftImHeight) {
                if (this.mHandler != null) {
                    this.mHandler.sendEmptyMessage(1500);
                }
                q.a("wwwap", "softimshowed ");
            }
        } else if (i4 - i5 > this.mSoftImHeight) {
            if (this.mHandler != null) {
                this.mHandler.sendEmptyMessage(1501);
            }
            q.a("wwwap", "softim hide ");
        }
        this.mPreBottom = i4;
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r0 != 3) goto L21;
     */
    @Override // com.uc.webview.export.WebView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.search.mmd.onesearch.SearchWidgetUCWebView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r5
            r1[r3] = r6
            java.lang.String r6 = "e7b587fe"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L1c:
            int r0 = r5.mTouchSlop
            if (r0 >= 0) goto L2e
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r5.mTouchSlop = r0
        L2e:
            int r0 = r6.getAction()
            if (r0 != r2) goto L39
            boolean r0 = r5.mIsBeingDragged
            if (r0 == 0) goto L39
            return r4
        L39:
            int r0 = android.support.v4.view.MotionEventCompat.getActionMasked(r6)
            if (r0 == 0) goto L74
            r1 = -1
            if (r0 == r3) goto L6f
            if (r0 == r2) goto L48
            r6 = 3
            if (r0 == r6) goto L6f
            goto L83
        L48:
            int r0 = r5.mActivePointerId
            if (r0 == r1) goto L83
            int r0 = android.support.v4.view.MotionEventCompat.findPointerIndex(r6, r0)
            if (r0 == r1) goto L83
            float r6 = android.support.v4.view.MotionEventCompat.getX(r6, r0)
            int r6 = (int) r6
            int r0 = r5.mLastMotionX
            int r0 = r6 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r5.mTouchSlop
            if (r0 <= r1) goto L83
            boolean r0 = r5.mIsBeingDragged
            if (r0 != 0) goto L6a
            r5.requestDisallowInterceptTouchEvent(r3)
        L6a:
            r5.mIsBeingDragged = r3
            r5.mLastMotionX = r6
            goto L83
        L6f:
            r5.mIsBeingDragged = r4
            r5.mActivePointerId = r1
            goto L83
        L74:
            r5.mIsBeingDragged = r4
            float r0 = r6.getX()
            int r0 = (int) r0
            r5.mLastMotionX = r0
            int r6 = android.support.v4.view.MotionEventCompat.getPointerId(r6, r4)
            r5.mActivePointerId = r6
        L83:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.mmd.onesearch.SearchWidgetUCWebView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r1 != 3) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.search.mmd.onesearch.SearchWidgetUCWebView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r6
            r1[r4] = r7
            java.lang.String r7 = "a9b14c3a"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L1c:
            boolean r0 = super.onTouchEvent(r7)
            int r1 = android.support.v4.view.MotionEventCompat.getActionMasked(r7)
            boolean r5 = r6.mIsBeingDragged
            if (r5 == 0) goto L29
            return r4
        L29:
            if (r0 == 0) goto L2c
            return r4
        L2c:
            int r5 = r6.mTouchSlop
            if (r5 >= 0) goto L3e
            android.content.Context r5 = r6.getContext()
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            int r5 = r5.getScaledTouchSlop()
            r6.mTouchSlop = r5
        L3e:
            if (r1 == 0) goto L79
            r5 = -1
            if (r1 == r4) goto L74
            if (r1 == r2) goto L49
            r7 = 3
            if (r1 == r7) goto L74
            goto L86
        L49:
            int r1 = r6.mActivePointerId
            int r1 = android.support.v4.view.MotionEventCompat.findPointerIndex(r7, r1)
            if (r1 != r5) goto L52
            return r3
        L52:
            float r7 = android.support.v4.view.MotionEventCompat.getX(r7, r1)
            int r7 = (int) r7
            int r1 = r6.mLastMotionX
            int r1 = r1 - r7
            boolean r2 = r6.mIsBeingDragged
            if (r2 != 0) goto L6c
            int r1 = java.lang.Math.abs(r1)
            int r2 = r6.mTouchSlop
            if (r1 <= r2) goto L6c
            r6.requestDisallowInterceptTouchEvent(r4)
            r6.mIsBeingDragged = r4
            goto L6d
        L6c:
            r4 = r0
        L6d:
            boolean r0 = r6.mIsBeingDragged
            if (r0 == 0) goto L87
            r6.mLastMotionX = r7
            goto L87
        L74:
            r6.mIsBeingDragged = r3
            r6.mActivePointerId = r5
            goto L87
        L79:
            float r1 = r7.getX()
            int r1 = (int) r1
            r6.mLastMotionX = r1
            int r7 = android.support.v4.view.MotionEventCompat.getPointerId(r7, r3)
            r6.mActivePointerId = r7
        L86:
            r4 = r0
        L87:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.mmd.onesearch.SearchWidgetUCWebView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, android.taobao.windvane.webview.IWVWebView
    public boolean back() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e58bdf2", new Object[]{this})).booleanValue();
        }
        if (canGoBack()) {
            goBack();
        }
        return true;
    }
}
