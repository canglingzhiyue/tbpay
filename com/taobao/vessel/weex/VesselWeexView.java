package com.taobao.vessel.weex;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.base.VesselBaseView;
import com.taobao.vessel.utils.VesselType;
import com.taobao.vessel.utils.c;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.adapter.IWXComputeScreenAdapter;
import com.taobao.weex.common.WXException;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.d;
import com.taobao.weex.ui.view.WXScrollView;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.rgy;

/* loaded from: classes9.dex */
public class VesselWeexView extends VesselBaseView implements d, WXScrollView.WXScrollViewListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private boolean isViewLoaded;
    private Handler mHandler;
    private IWXComputeScreenAdapter mInnerComputeScreenAdapter;
    private String mOriginJsBundleData;
    private Rect mRect;
    private String mRequestUrl;
    private WXSDKInstance mTBWXSDKInstance;
    private View weexView;

    public static /* synthetic */ Object ipc$super(VesselWeexView vesselWeexView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    @Override // com.taobao.weex.d
    public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.weex.ui.view.WXScrollView.WXScrollViewListener
    public void onScroll(WXScrollView wXScrollView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0964985", new Object[]{this, wXScrollView, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.weex.ui.view.WXScrollView.WXScrollViewListener
    public void onScrollStopped(WXScrollView wXScrollView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("253d571a", new Object[]{this, wXScrollView, new Integer(i), new Integer(i2)});
        }
    }

    public static /* synthetic */ Rect access$000(VesselWeexView vesselWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("4c654e4f", new Object[]{vesselWeexView}) : vesselWeexView.mRect;
    }

    public static /* synthetic */ WXSDKInstance access$100(VesselWeexView vesselWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXSDKInstance) ipChange.ipc$dispatch("be87f143", new Object[]{vesselWeexView}) : vesselWeexView.mTBWXSDKInstance;
    }

    public static /* synthetic */ String access$200(VesselWeexView vesselWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e26df45c", new Object[]{vesselWeexView}) : vesselWeexView.mRequestUrl;
    }

    static {
        kge.a(1493029284);
        kge.a(-748561575);
        kge.a(1760553262);
        TAG = VesselView.class.getSimpleName();
    }

    public VesselWeexView(Context context) {
        this(context, null);
    }

    public VesselWeexView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VesselWeexView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isViewLoaded = false;
        this.mHandler = new Handler();
        initModule();
    }

    private void initModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a44223", new Object[]{this});
            return;
        }
        try {
            WXSDKEngine.registerModule("vessel", VesselWeexModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void fireEvent(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78684150", new Object[]{this, str, map});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mTBWXSDKInstance;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.a(str, map);
    }

    @Override // com.taobao.weex.d
    public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            return;
        }
        removeAllViews();
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        this.weexView = view;
        if (this.mTBWXSDKInstance == null || this.mScrollViewListener == null || this.mTBWXSDKInstance.E() != null) {
            return;
        }
        this.mScrollViewListener.onScrollEnabled(this.weexView, false);
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void loadUrl(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b60501d6", new Object[]{this, str, obj});
            return;
        }
        this.mRequestUrl = str;
        this.mOriginUrl = str;
        this.mOriginParams = obj;
        createWxSdkInstance();
        onLoadStart();
        String c = com.taobao.vessel.utils.b.c(str);
        HashMap hashMap = new HashMap();
        hashMap.put("bundleUrl", this.mRequestUrl);
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.post(new a(c, hashMap));
    }

    public WXSDKInstance getWXSDKInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXSDKInstance) ipChange.ipc$dispatch("169676dd", new Object[]{this}) : this.mTBWXSDKInstance;
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void loadData(VesselType vesselType, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a4f349", new Object[]{this, vesselType, str, map});
            return;
        }
        this.mOriginJsBundleData = str;
        createWxSdkInstance();
        if (str == null) {
            onLoadError(new rgy(c.LOAD_ERROR, c.LOAD_DATA_NULL, c.WEEX_TYPE));
        } else {
            startWxRender(str, map);
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public boolean refresh(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a612d42", new Object[]{this, obj})).booleanValue();
        }
        if (!StringUtils.isEmpty(this.mOriginUrl)) {
            loadUrl(this.mOriginUrl, this.mOriginParams);
            return true;
        } else if (StringUtils.isEmpty(this.mOriginJsBundleData)) {
            return false;
        } else {
            loadData(this.mOriginJsBundleData);
            return true;
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void releaseMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f01c06f", new Object[]{this});
            return;
        }
        onDestroy();
        this.weexView = null;
        removeAllViews();
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public View getChildView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("5d844df4", new Object[]{this}) : this.weexView;
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mTBWXSDKInstance;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.a(i, i2, intent);
    }

    public void startWxRender(String str, Map<String, Object> map) {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e8ca1b", new Object[]{this, str, map});
        } else if (StringUtils.isEmpty(str) || (handler = this.mHandler) == null) {
        } else {
            handler.post(new b(str, map));
        }
    }

    private void createWxSdkInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258e7139", new Object[]{this});
            return;
        }
        if (this.mTBWXSDKInstance != null) {
            com.taobao.vessel.base.b.a().a(this.mTBWXSDKInstance);
            this.mTBWXSDKInstance.e();
        }
        this.mTBWXSDKInstance = new WXSDKInstance(getContext());
        this.mTBWXSDKInstance.a((d) this);
        this.mTBWXSDKInstance.a((WXScrollView.WXScrollViewListener) this);
        this.mTBWXSDKInstance.onActivityCreate();
        com.taobao.vessel.base.b.a().a(this.mTBWXSDKInstance, this);
    }

    @Override // tb.rgx
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mTBWXSDKInstance;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.onActivityStart();
    }

    @Override // tb.rgx
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mTBWXSDKInstance;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.onActivityResume();
    }

    @Override // tb.rgx
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mTBWXSDKInstance;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.onActivityPause();
    }

    @Override // tb.rgx
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mTBWXSDKInstance;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.onActivityStop();
    }

    @Override // tb.rgx
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        com.taobao.vessel.base.b.a().a(this.mTBWXSDKInstance);
        WXSDKInstance wXSDKInstance = this.mTBWXSDKInstance;
        if (wXSDKInstance != null) {
            wXSDKInstance.a((WXScrollView.WXScrollViewListener) null);
            this.mTBWXSDKInstance.onActivityDestroy();
        }
        this.mScrollViewListener = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (!com.taobao.vessel.utils.a.a()) {
            return;
        }
        onAppear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        if (!com.taobao.vessel.utils.a.a()) {
            return;
        }
        onDisappear();
    }

    public void onAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321cdedb", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mTBWXSDKInstance;
        if (wXSDKInstance == null || !this.isViewLoaded) {
            return;
        }
        wXSDKInstance.af();
    }

    public void onDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d60f0b", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mTBWXSDKInstance;
        if (wXSDKInstance == null || !this.isViewLoaded) {
            return;
        }
        wXSDKInstance.ad();
    }

    @Override // com.taobao.weex.d
    public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            return;
        }
        this.isViewLoaded = true;
        onLoadFinish(this.weexView);
    }

    @Override // com.taobao.weex.d
    public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
        } else {
            onLoadError(new rgy(str, str2, c.WEEX_TYPE));
        }
    }

    @Override // com.taobao.weex.ui.view.WXScrollView.WXScrollViewListener
    public void onScrollChanged(WXScrollView wXScrollView, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40baada1", new Object[]{this, wXScrollView, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.mScrollViewListener == null) {
        } else {
            if (wXScrollView.getHeight() - wXScrollView.getScrollY() <= 0) {
                this.mScrollViewListener.onScrollToBottom(wXScrollView, i, i2);
            } else if (wXScrollView.getScrollY() == 0) {
                this.mScrollViewListener.onScrollToTop(wXScrollView, i, i2);
            } else {
                this.mScrollViewListener.onScrollChanged(wXScrollView, i, i2, i3, i4);
            }
        }
    }

    @Override // com.taobao.weex.ui.view.WXScrollView.WXScrollViewListener
    public void onScrollToBottom(WXScrollView wXScrollView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3770d2b", new Object[]{this, wXScrollView, new Integer(i), new Integer(i2)});
        } else if (this.mScrollViewListener == null) {
        } else {
            this.mScrollViewListener.onScrollToBottom(wXScrollView, i, i2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (!isAutoResize()) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            return;
        }
        if (this.mRect == null) {
            this.mRect = new Rect();
        }
        if (this.mRect.right == measuredWidth && this.mRect.bottom == measuredHeight) {
            return;
        }
        Rect rect = this.mRect;
        rect.right = measuredWidth;
        rect.bottom = measuredHeight;
        if (this.mInnerComputeScreenAdapter != null || this.mTBWXSDKInstance == null) {
            return;
        }
        this.mInnerComputeScreenAdapter = new IWXComputeScreenAdapter() { // from class: com.taobao.vessel.weex.VesselWeexView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.weex.adapter.IWXComputeScreenAdapter
            public Rect computeCurrentScreenMetrics() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Rect) ipChange2.ipc$dispatch("e162c6e5", new Object[]{this}) : VesselWeexView.access$000(VesselWeexView.this);
            }
        };
        this.mTBWXSDKInstance.a(this.mInnerComputeScreenAdapter);
    }

    /* loaded from: classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String b;
        private Map<String, Object> c;

        static {
            kge.a(-1703347319);
            kge.a(-1390502639);
        }

        public a(String str, Map<String, Object> map) {
            this.b = str;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (com.taobao.vessel.utils.b.a(VesselWeexView.this.getContext()) || VesselWeexView.access$100(VesselWeexView.this) == null || StringUtils.isEmpty(this.b)) {
            } else {
                VesselWeexView.access$100(VesselWeexView.this).c(VesselWeexView.access$200(VesselWeexView.this), this.b, this.c, null, WXRenderStrategy.APPEND_ASYNC);
            }
        }
    }

    /* loaded from: classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String b;
        private Map<String, Object> c;

        static {
            kge.a(1079115057);
            kge.a(-1390502639);
        }

        public b(String str, Map<String, Object> map) {
            this.b = str;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (com.taobao.vessel.utils.b.a(VesselWeexView.this.getContext()) || VesselWeexView.access$100(VesselWeexView.this) == null || StringUtils.isEmpty(this.b)) {
            } else {
                VesselWeexView.access$100(VesselWeexView.this).a(com.taobao.vessel.utils.b.a(this.c), this.b, this.c, (String) null, WXRenderStrategy.APPEND_ASYNC);
            }
        }
    }
}
