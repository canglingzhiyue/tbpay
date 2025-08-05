package com.taobao.vessel.base;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vessel.utils.VesselType;
import java.util.Map;
import tb.kge;
import tb.rgu;
import tb.rgv;
import tb.rgw;
import tb.rgx;
import tb.rgy;

/* loaded from: classes9.dex */
public abstract class VesselBaseView extends FrameLayout implements rgu, rgv, rgx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mAutoResize;
    public String mDowngradeUrl;
    public a mEventCallback;
    public volatile String mInstanceId;
    public rgu mOnLoadListener;
    public Object mOriginParams;
    public String mOriginUrl;
    public rgv mScrollViewListener;
    public rgw mVesselViewCallback;

    /* loaded from: classes9.dex */
    public interface a {
        boolean a();
    }

    static {
        kge.a(-788959324);
        kge.a(1398523061);
        kge.a(625213565);
        kge.a(-1043076822);
    }

    public abstract void fireEvent(String str, Map<String, Object> map);

    public abstract View getChildView();

    public void loadData(VesselType vesselType, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a4f349", new Object[]{this, vesselType, str, map});
        }
    }

    public abstract void loadUrl(String str, Object obj);

    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    @Override // tb.rgu
    public void onDowngrade(rgy rgyVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("775d4b7c", new Object[]{this, rgyVar, map});
        }
    }

    public boolean refresh(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a612d42", new Object[]{this, obj})).booleanValue();
        }
        return true;
    }

    public abstract void releaseMemory();

    public VesselBaseView(Context context) {
        super(context);
        this.mDowngradeUrl = null;
        this.mAutoResize = false;
    }

    public VesselBaseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VesselBaseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDowngradeUrl = null;
        this.mAutoResize = false;
    }

    public void loadData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbd1c41", new Object[]{this, str});
        } else {
            loadData(null, str);
        }
    }

    public void loadData(VesselType vesselType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7900d8bc", new Object[]{this, vesselType, str});
        } else {
            loadData(vesselType, str, null);
        }
    }

    public boolean refresh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad3d31e6", new Object[]{this})).booleanValue() : refresh(null);
    }

    public void createView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c27592", new Object[]{this, str});
            return;
        }
        this.mOriginUrl = str;
        loadUrl(str, null);
    }

    public void setVesselViewCallback(rgw rgwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431a7c37", new Object[]{this, rgwVar});
        } else {
            this.mVesselViewCallback = rgwVar;
        }
    }

    public void setOnLoadListener(rgu rguVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc27ad2", new Object[]{this, rguVar});
        } else {
            this.mOnLoadListener = rguVar;
        }
    }

    public void setOnScrollViewListener(rgv rgvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7eebe9d", new Object[]{this, rgvVar});
        } else {
            this.mScrollViewListener = rgvVar;
        }
    }

    public boolean needIntercept(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f3767ac", new Object[]{this, motionEvent})).booleanValue();
        }
        a aVar = this.mEventCallback;
        if (aVar == null) {
            return false;
        }
        return aVar.a();
    }

    public void onLoadStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f829aa04", new Object[]{this});
            return;
        }
        rgu rguVar = this.mOnLoadListener;
        if (rguVar == null) {
            return;
        }
        rguVar.onLoadStart();
    }

    public void onLoadFinish(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c38c0593", new Object[]{this, view});
            return;
        }
        rgu rguVar = this.mOnLoadListener;
        if (rguVar == null) {
            return;
        }
        rguVar.onLoadFinish(view);
    }

    public void onLoadError(rgy rgyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36981b6", new Object[]{this, rgyVar});
            return;
        }
        rgu rguVar = this.mOnLoadListener;
        if (rguVar == null) {
            return;
        }
        rguVar.onLoadError(rgyVar);
    }

    @Override // tb.rgv
    public void onScrollChanged(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e75cdfa3", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        rgv rgvVar = this.mScrollViewListener;
        if (rgvVar == null) {
            return;
        }
        rgvVar.onScrollChanged(view, i, i2, i3, i4);
    }

    public void onScrollToBottom(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58dac99", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        rgv rgvVar = this.mScrollViewListener;
        if (rgvVar == null) {
            return;
        }
        rgvVar.onScrollToBottom(view, i, i2);
    }

    public void onScrollToTop(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a369839d", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        rgv rgvVar = this.mScrollViewListener;
        if (rgvVar == null) {
            return;
        }
        rgvVar.onScrollToTop(view, i, i2);
    }

    public void onScrollRightOrLeftEdge(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb0f4f4", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        rgv rgvVar = this.mScrollViewListener;
        if (rgvVar == null) {
            return;
        }
        rgvVar.onScrollRightOrLeftEdge(view, i, i2);
    }

    public boolean onScrollEnabled(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a67b062", new Object[]{this, view, new Boolean(z)})).booleanValue();
        }
        rgv rgvVar = this.mScrollViewListener;
        if (rgvVar != null) {
            rgvVar.onScrollEnabled(view, z);
        }
        return z;
    }

    public void setEventCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b2d5a7c", new Object[]{this, aVar});
        } else {
            this.mEventCallback = aVar;
        }
    }

    public boolean isAutoResize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a2eda18", new Object[]{this})).booleanValue() : this.mAutoResize;
    }

    public void setAutoResize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8201508", new Object[]{this, new Boolean(z)});
        } else {
            this.mAutoResize = z;
        }
    }
}
