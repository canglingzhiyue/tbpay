package com.alibaba.poplayer.factory.view.base;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import mtopsdk.common.util.StringUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.layermanager.f;
import com.alibaba.poplayer.track.UserResultTrack;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.d;
import com.alibaba.poplayer.trigger.e;
import com.alibaba.poplayer.utils.ConsoleLogger;
import com.alibaba.poplayer.utils.c;
import com.alibaba.poplayer.utils.g;
import com.alibaba.poplayer.utils.i;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.h;
import com.taobao.taobao.R;
import org.json.JSONObject;
import tb.bzm;
import tb.bzz;
import tb.caa;
import tb.cai;
import tb.kge;

/* loaded from: classes.dex */
public abstract class PopLayerBaseView<InnerView, Request extends PopRequest> extends PenetrateFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String POPLAYER_VIEW_TAG = "poplayer_view_tag";
    private i mAutoSize;
    public ImageView mBtnClose;
    private com.alibaba.poplayer.factory.view.base.a mDragHelper;
    public a mEventListener;
    public InnerView mInnerView;
    public boolean mIsClosed;
    public boolean mIsDisplaying;
    private boolean mIsHiding;
    private boolean mIsRetaining;
    private boolean mIsVisibled;
    private OnScreenChangedListener mOnScreenChangedListener;
    public Request mPopRequest;
    private bzm mPopViewStyle;
    private long mRetainTime;
    private int mViewAddTimes;

    /* loaded from: classes3.dex */
    public interface a {
    }

    static {
        kge.a(797236637);
    }

    public static /* synthetic */ Object ipc$super(PopLayerBaseView popLayerBaseView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2143807755:
                super.setClickableAreaFrame((ClickableAreaParam) objArr[0]);
                return null;
            case -1983604863:
                super.destroy();
                return null;
            case -1683596603:
                super.setUseTouchIntercept(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1448304568:
                super.setUseTouchPointBitmap(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -530651030:
                super.clearClickableInfo();
                return null;
            case -446122783:
                return new Boolean(super.onInterceptHoverEvent((MotionEvent) objArr[0]));
            case -444150275:
                super.setEnableClickArea(((Boolean) objArr[0]).booleanValue());
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case -169170370:
                super.setFindTextureSurfaceViewRectWhenTouch(((Boolean) objArr[0]).booleanValue());
                return null;
            case 683045380:
                super.addClickableArea((Rect) objArr[0]);
                return null;
            case 1701519427:
                super.setUseCacheMark(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public String getNativeNotifyInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58e6e2f5", new Object[]{this}) : "null";
    }

    public void onActivityStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
        }
    }

    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        }
    }

    @Deprecated
    public void onViewAdded(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51d80465", new Object[]{this, context});
        }
    }

    @Deprecated
    public void onViewRemoved(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd08805", new Object[]{this, context});
        }
    }

    public void resetContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18396fc1", new Object[]{this, context});
        }
    }

    @Deprecated
    public void selectAndOperate(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d48dbdee", new Object[]{this, jSONObject});
        }
    }

    public boolean shouldViewUIAdd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("312780", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame
    public /* bridge */ /* synthetic */ void addClickableArea(Rect rect) {
        super.addClickableArea(rect);
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame
    public /* bridge */ /* synthetic */ void clearClickableInfo() {
        super.clearClickableInfo();
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame
    public /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame, android.view.ViewGroup
    public /* bridge */ /* synthetic */ boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        return super.onInterceptHoverEvent(motionEvent);
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame
    public /* bridge */ /* synthetic */ void setClickableAreaFrame(ClickableAreaParam clickableAreaParam) {
        super.setClickableAreaFrame(clickableAreaParam);
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame
    public /* bridge */ /* synthetic */ void setEnableClickArea(boolean z) {
        super.setEnableClickArea(z);
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame
    public /* bridge */ /* synthetic */ void setFindTextureSurfaceViewRectWhenTouch(boolean z) {
        super.setFindTextureSurfaceViewRectWhenTouch(z);
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame
    public /* bridge */ /* synthetic */ void setUseCacheMark(boolean z) {
        super.setUseCacheMark(z);
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame
    public /* bridge */ /* synthetic */ void setUseTouchIntercept(boolean z) {
        super.setUseTouchIntercept(z);
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame
    public /* bridge */ /* synthetic */ void setUseTouchPointBitmap(boolean z) {
        super.setUseTouchPointBitmap(z);
    }

    public PopLayerBaseView(Context context) {
        super(context);
        this.mIsRetaining = false;
        this.mRetainTime = 0L;
        this.mViewAddTimes = 0;
        this.mIsDisplaying = false;
        this.mIsVisibled = false;
        this.mIsClosed = false;
        this.mIsHiding = false;
    }

    public Request getPopRequest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Request) ipChange.ipc$dispatch("8afce747", new Object[]{this}) : this.mPopRequest;
    }

    public void setPopRequest(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8fa5953", new Object[]{this, request});
        } else {
            this.mPopRequest = request;
        }
    }

    public void init(Context context, Request request) {
        cai processCallBack;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2216f45d", new Object[]{this, context, request});
            return;
        }
        this.mIsClosed = false;
        OnePopModule t = request.t();
        t.p = "true";
        t.q = "true";
        t.r = "true";
        long elapsedRealtime = SystemClock.elapsedRealtime();
        t.ak = elapsedRealtime;
        t.al = elapsedRealtime;
        c.a("PopLayerBaseView.init.start.loadStartTimeStamp=%s", Long.valueOf(elapsedRealtime));
        Event d = d.d(request);
        if (d != null && (processCallBack = d.getProcessCallBack()) != null) {
            processCallBack.a();
        }
        BaseConfigItem c = d.c(request);
        if (c != null && c.styleConfigs != null) {
            this.mDragHelper = new com.alibaba.poplayer.factory.view.base.a(request, request.q() && c.styleConfigs.isValid() && c.styleConfigs.drag, c.styleConfigs.dragMode);
        }
        caa.a(0, "track", (d) request, "PopViewLoaded", "");
        boolean b = h.a().b(context);
        this.mAutoSize = new i(context, b, true);
        c.a("PopLayerBaseView.init.isPortraitLayout=%s", Boolean.valueOf(b));
        this.mPopViewStyle = new bzm();
        setLayoutParams(this.mPopViewStyle.a(this, this.mPopRequest, this.mAutoSize));
        this.mOnScreenChangedListener = new OnScreenChangedListener() { // from class: com.alibaba.poplayer.factory.view.base.-$$Lambda$PopLayerBaseView$bCZq0eX2_KdWlXmbGJvcbUlkCAc
            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
            }

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public final void onScreenChanged(int i, Configuration configuration) {
                PopLayerBaseView.this.lambda$init$0$PopLayerBaseView(i, configuration);
            }
        };
        h.a().c(this.mOnScreenChangedListener);
        c.c("pageLifeCycle", d.b(this.mPopRequest), "registerOnScreenChangedListener");
    }

    public /* synthetic */ void lambda$init$0$PopLayerBaseView(int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e592d", new Object[]{this, new Integer(i), configuration});
            return;
        }
        try {
            c.a("PopLayerBaseView.OnScreenChanged.changeType=%s", Integer.valueOf(i));
            if (1 == i) {
                z = true;
            }
            if (!this.mAutoSize.a(z)) {
                return;
            }
            setLayoutParams(this.mPopViewStyle.a(this, this.mPopRequest, this.mAutoSize));
        } catch (Throwable th) {
            c.a("PopLayerBaseView.OnScreenChanged.error", th);
        }
    }

    public void addInnerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb166601", new Object[]{this});
            return;
        }
        InnerView innerview = this.mInnerView;
        if (!(innerview instanceof View)) {
            return;
        }
        View view = (View) innerview;
        view.setId(R.id.poplayer_inner_view);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (Build.VERSION.SDK_INT >= 16) {
            view.setImportantForAccessibility(2);
        }
        addView(view, layoutParams);
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        com.alibaba.poplayer.factory.view.base.a aVar = this.mDragHelper;
        if (aVar != null) {
            aVar.a(false);
        }
        if (super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        com.alibaba.poplayer.factory.view.base.a aVar2 = this.mDragHelper;
        if (aVar2 == null) {
            return false;
        }
        boolean a2 = aVar2.a(this, motionEvent);
        c.a("PopLayerBaseView.DragHelper.onInterceptTouchEvent.onInterceptTouchEvent=%s.", Boolean.valueOf(a2));
        return a2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        com.alibaba.poplayer.factory.view.base.a aVar = this.mDragHelper;
        if (aVar == null || !aVar.b(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        c.a("PopLayerBaseView.onTouchEvent.onTouchEvent=%s.", true);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        com.alibaba.poplayer.factory.view.base.a aVar = this.mDragHelper;
        if (aVar == null) {
            return;
        }
        aVar.a(this, z, i, i2, i3, i4);
    }

    public boolean isDisplaying() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1823cc35", new Object[]{this})).booleanValue() : this.mIsDisplaying;
    }

    public boolean isClosed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6afccc1", new Object[]{this})).booleanValue() : this.mIsClosed;
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        this.mIsHiding = true;
        setVisibility(4);
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        this.mIsHiding = false;
        if (!this.mIsDisplaying) {
            return;
        }
        setVisibility(0);
        if (!this.mIsVisibled) {
            dealCloseOnTime();
        }
        this.mIsVisibled = true;
    }

    public boolean isViewCreated() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("31498504", new Object[]{this})).booleanValue() : "true".equals(this.mPopRequest.t().r);
    }

    public void onViewUIAdded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155d0daf", new Object[]{this});
            return;
        }
        try {
            this.mViewAddTimes++;
            this.mPopRequest.t().k = false;
            this.mPopRequest.t().aa = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (isDisplaying()) {
                this.mPopRequest.t().am = elapsedRealtime;
                this.mRetainTime = 0L;
                if (this.mViewAddTimes > 1) {
                    this.mPopRequest.t().G = null;
                }
                if (this.mPopRequest instanceof d) {
                    UserResultTrack.a((d) this.mPopRequest, getCurBizTrackInfo(), false);
                }
            } else if (this.mViewAddTimes > 1) {
                this.mPopRequest.t().al = elapsedRealtime;
            }
        } catch (Throwable th) {
            c.a("PopLayerBaseView.onViewUIAdded.error.", th);
        }
        c.b("pageLifeCycle", d.b(this.mPopRequest), "PopLayerBaseView.onViewAdded.");
        onReceiveEvent("PopLayer.onViewAdded", null);
        Request request = this.mPopRequest;
        if (!(request instanceof d)) {
            return;
        }
        e.a((d) request);
    }

    public void onViewUIRemoved() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68572b0f", new Object[]{this});
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (isDisplaying()) {
                if (this.mIsRetaining) {
                    this.mRetainTime += elapsedRealtime - this.mPopRequest.t().am;
                }
                this.mPopRequest.t().H = this.mRetainTime + "";
                c.a("PopLayerBaseView.onViewUIRemoved.retainTime=%s", Long.valueOf(this.mRetainTime));
            } else {
                this.mPopRequest.t().G = (elapsedRealtime - this.mPopRequest.t().al) + "";
                c.a("PopLayerBaseView.onViewUIRemoved.invisibleTime=%s", this.mPopRequest.t().G);
            }
            trackMonitor();
        } catch (Throwable th) {
            c.a("PopLayerBaseView.onViewUIRemoved.error.", th);
        }
        c.b("pageLifeCycle", d.b(this.mPopRequest), "PopLayerBaseView.onViewRemoved.");
        onReceiveEvent("PopLayer.onViewRemoved", null);
        Request request = this.mPopRequest;
        if (!(request instanceof d)) {
            return;
        }
        e.a((d) request, this);
    }

    public void displayMe() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f5f181", new Object[]{this});
        } else {
            displayMe(false);
        }
    }

    public void displayMe(boolean z) {
        Event d;
        cai processCallBack;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95c8f173", new Object[]{this, new Boolean(z)});
        } else if (isDisplaying()) {
        } else {
            this.mIsDisplaying = true;
            setVisibility(0);
            if (!this.mIsVisibled) {
                dealCloseOnTime();
            }
            this.mIsVisibled = true;
            if (z) {
                increaseReadTimes();
            }
            OnePopModule t = this.mPopRequest.t();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            t.G = (elapsedRealtime - t.al) + "";
            t.s = "true";
            boolean z2 = this.mPopRequest instanceof d;
            c.a("PopLayerBaseView.displayMe.invisibleTime=%s", t.G);
            if (z2) {
                t.O = ((d) this.mPopRequest).y().getCreateSystemTime() > 0 ? String.valueOf(elapsedRealtime - ((d) this.mPopRequest).y().getCreateSystemTime()) : null;
            }
            t.am = elapsedRealtime;
            this.mIsRetaining = true;
            if (z2) {
                BaseConfigItem c = d.c(this.mPopRequest);
                com.alibaba.poplayer.info.frequency.a.a().b(c);
                Event y = ((d) this.mPopRequest).y();
                com.alibaba.poplayer.info.frequency.c.a().a(y.curPage, y.curPageUrl, c.layerType);
            }
            try {
                t.t = f.a().c(this.mPopRequest);
            } catch (Throwable th) {
                c.a("PopLayerBaseView.displayMe.notifyDisplay.error.", th);
            }
            onReceiveEvent("PopLayer.Displayed", null);
            if (z2) {
                e.b((d) this.mPopRequest);
            }
            if (this.mEventListener != null) {
                synchronized (PopLayerBaseView.class) {
                }
            }
            if (z2) {
                bzz.b((d) this.mPopRequest);
                UserResultTrack.a((d) this.mPopRequest, getCurBizTrackInfo(), z);
            }
            if (!z2 || (d = d.d(this.mPopRequest)) == null || (processCallBack = d.getProcessCallBack()) == null) {
                return;
            }
            processCallBack.a(((d) this.mPopRequest).z(), d.uri, d.curPage);
        }
    }

    public void destroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        this.mIsClosed = true;
        Request request = this.mPopRequest;
        if (request instanceof d) {
            e.b((d) request, this);
        }
        if (this.mEventListener != null) {
            synchronized (PopLayerBaseView.class) {
            }
        }
        if (this.mOnScreenChangedListener == null) {
            return;
        }
        c.c("pageLifeCycle", d.b(this.mPopRequest), "unregisterOnScreenChangedListener");
        h.a().d(this.mOnScreenChangedListener);
        this.mOnScreenChangedListener = null;
    }

    public void setUserResultInTrack(String str, com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d4e903", new Object[]{this, str, jSONObject});
        } else {
            setUserResultInTrack(str, false, jSONObject);
        }
    }

    public void setUserResultInTrack(String str, boolean z, com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620946e9", new Object[]{this, str, new Boolean(z), jSONObject});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            Request request = this.mPopRequest;
            if (!(request instanceof d)) {
                return;
            }
            UserResultTrack.b(request, str, z, jSONObject);
        }
    }

    public void showCloseButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb2ab40", new Object[]{this, new Boolean(z)});
        } else if (!z && this.mBtnClose == null) {
            c.a("showCloseButton.Not use closeButton.", Boolean.valueOf(z));
        } else if (this.mPopRequest.q()) {
            c.a("showCloseButton.isFloatStyle.return", Boolean.valueOf(z));
        } else {
            int i = z ? 0 : 8;
            if (this.mBtnClose == null) {
                this.mBtnClose = new ImageView(getContext());
                this.mBtnClose.setBackgroundResource(R.drawable.poplayer_close_btn);
                this.mBtnClose.setContentDescription("关闭弹窗");
                this.mBtnClose.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.poplayer.factory.view.base.-$$Lambda$PopLayerBaseView$0QyClzX6fnQbJ4VmYSVJ7Sd-8yU
                    {
                        PopLayerBaseView.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PopLayerBaseView.this.lambda$showCloseButton$1$PopLayerBaseView(view);
                    }
                });
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(80, 80);
                layoutParams.rightMargin = g.a(getContext(), 20);
                layoutParams.topMargin = g.a(getContext(), 20);
                layoutParams.gravity = 53;
                addView(this.mBtnClose, layoutParams);
            }
            this.mBtnClose.setVisibility(i);
            c.a("PopLayerBaseView.showCloseButton.show{%s}", Boolean.valueOf(z));
        }
    }

    public /* synthetic */ void lambda$showCloseButton$1$PopLayerBaseView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b7b768e", new Object[]{this, view});
        } else {
            close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "poplayerCloseBtn", null, null);
        }
    }

    public void removeCloseButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0908dad", new Object[]{this});
        } else if (this.mBtnClose == null) {
            c.a("removeCloseButton.Not use closeButton.", new Object[0]);
        } else {
            com.alibaba.poplayer.utils.f.b(new Runnable() { // from class: com.alibaba.poplayer.factory.view.base.-$$Lambda$PopLayerBaseView$WuFVZ6xeqLLtuiDwrZxRz2cTZd4
                {
                    PopLayerBaseView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerBaseView.this.lambda$removeCloseButton$2$PopLayerBaseView();
                }
            });
        }
    }

    public /* synthetic */ void lambda$removeCloseButton$2$PopLayerBaseView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b22fde", new Object[]{this});
            return;
        }
        try {
            removeView(this.mBtnClose);
            this.mBtnClose = null;
            c.a("PopLayerBaseView.removeCloseButton.", new Object[0]);
        } catch (Throwable th) {
            c.a("PopLayerBaseView.removeCloseButton.error", th);
        }
    }

    public void onReceiveEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12978511", new Object[]{this, str, str2});
        } else {
            c.a("PopLayerBaseView.onReceiveEvent:{eventName:%s,params:%s},You should overwrite this method to hold event.", str, str2);
        }
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "commonJsClose", null, null);
        }
    }

    public void close(OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c84d9553", new Object[]{this, onePopLoseReasonCode, str, str2, str3});
            return;
        }
        try {
            this.mIsClosed = true;
            if (this.mPopRequest != null) {
                this.mPopRequest.t().T = onePopLoseReasonCode;
                this.mPopRequest.t().U = str;
                this.mPopRequest.t().V = str2;
                this.mPopRequest.t().W = str3;
            }
            PopLayer.getReference().removeRequest(this.mPopRequest);
            trackMonitor();
            c.a("close.success", new Object[0]);
        } catch (Throwable th) {
            c.a("close.error.", th);
        }
    }

    public void syncJumpToUrlInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef2922a", new Object[]{this, str});
            return;
        }
        try {
            if (!StringUtils.isEmpty(str) && str.startsWith("poplayer")) {
                return;
            }
            this.mPopRequest.t().a(str);
        } catch (Throwable th) {
            c.a("syncJumpToUrlInfo.error.", th);
        }
    }

    public void navToUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce285562", new Object[]{this, str});
            return;
        }
        syncJumpToUrlInfo(str);
        PopLayer.getReference().getFaceAdapter().navToUrl(getContext(), str);
    }

    public void increaseReadTimes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7d14b5", new Object[]{this});
        } else {
            this.mPopRequest.v();
        }
    }

    public void finishPop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7649f645", new Object[]{this});
        } else {
            this.mPopRequest.w();
        }
    }

    public void setViewTimeLineTime(long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca76c79c", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
            return;
        }
        if (j > 0) {
            this.mPopRequest.t().I = String.valueOf(j);
        }
        if (j2 > 0) {
            this.mPopRequest.t().J = String.valueOf(j2);
        }
        if (j3 > 0) {
            this.mPopRequest.t().K = String.valueOf(j3);
        }
        if (j4 <= 0) {
            return;
        }
        this.mPopRequest.t().L = String.valueOf(j4);
    }

    public void setContentId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71029e43", new Object[]{this, str});
        } else {
            this.mPopRequest.t().S = str;
        }
    }

    public void putOnePopExtras(com.alibaba.fastjson.JSONObject jSONObject) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ff746c", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            try {
                for (String str : jSONObject.keySet()) {
                    if (!StringUtils.isEmpty(str) && (obj = jSONObject.get(str)) != null) {
                        this.mPopRequest.t().ar.put(str, obj);
                    }
                }
            } catch (Throwable th) {
                c.a("PopLayerBaseView.putOnePopExtras.error.", th);
            }
        }
    }

    public void setEventListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c304e694", new Object[]{this, aVar});
        } else {
            this.mEventListener = aVar;
        }
    }

    private void dealCloseOnTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9e045df", new Object[]{this});
            return;
        }
        BaseConfigItem c = d.c(this.mPopRequest);
        if (c == null || c.closeOnTime <= 1) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alibaba.poplayer.factory.view.base.-$$Lambda$PopLayerBaseView$X6IEZHrqMDI1eMM94ZVxpfi2y5s
            {
                PopLayerBaseView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                PopLayerBaseView.this.lambda$dealCloseOnTime$3$PopLayerBaseView();
            }
        }, c.closeOnTime * 1000);
    }

    public /* synthetic */ void lambda$dealCloseOnTime$3$PopLayerBaseView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce93e7d1", new Object[]{this});
        } else {
            close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "CloseOnTime", "", "");
        }
    }

    private void trackMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4408e96", new Object[]{this});
            return;
        }
        Request request = this.mPopRequest;
        if (!(request instanceof d)) {
            return;
        }
        d dVar = (d) request;
        bzz.a(dVar);
        if (dVar.t().T != OnePopModule.OnePopLoseReasonCode.OnViewErrorClose && dVar.t().T != OnePopModule.OnePopLoseReasonCode.OnViewJSClose) {
            return;
        }
        bzz.c(dVar);
    }

    public void onActivityResumed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a0dbf0", new Object[]{this});
        } else if (!isDisplaying()) {
        } else {
            this.mPopRequest.t().am = SystemClock.elapsedRealtime();
            this.mIsRetaining = true;
        }
    }

    public void onActivityPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
        } else if (!isDisplaying()) {
        } else {
            this.mRetainTime += SystemClock.elapsedRealtime() - this.mPopRequest.t().am;
            this.mIsRetaining = false;
        }
    }

    public com.alibaba.fastjson.JSONObject getCurBizTrackInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("ee79b897", new Object[]{this}) : new com.alibaba.fastjson.JSONObject();
    }

    public SpannableStringBuilder getInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpannableStringBuilder) ipChange.ipc$dispatch("e6e304e", new Object[]{this}) : new SpannableStringBuilder("simpleInfo");
    }

    public final void consoleLog(String str, ConsoleLogger.Level level) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb31712", new Object[]{this, str, level});
        } else {
            c.a("%s.%s.%s", ConsoleLogger.LOG_TAG_OUT_CONSOLE, Character.valueOf(level.sign), str);
        }
    }

    public String getUUID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8312b388", new Object[]{this}) : d.a(getPopRequest());
    }

    public String getIndexId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1ec6ba02", new Object[]{this}) : d.b(getPopRequest());
    }

    public void setHardwareAcceleration(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36251763", new Object[]{this, new Boolean(z)});
        } else if (z) {
        } else {
            setLayerType(1, null);
        }
    }
}
