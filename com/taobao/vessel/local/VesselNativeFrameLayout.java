package com.taobao.vessel.local;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;
import tb.rgu;
import tb.rgv;
import tb.rgw;
import tb.rgx;
import tb.rgy;

/* loaded from: classes9.dex */
public abstract class VesselNativeFrameLayout extends FrameLayout implements rgx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public rgu mOnLoadListener;
    public rgv mScrollViewListener;
    public b mVesselNativePlugin;
    public rgw mViewCallback;
    public Map<String, Object> mfireEventParams;
    public Object vesselParams;

    static {
        kge.a(2062468768);
        kge.a(1398523061);
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this;
    }

    public abstract View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // tb.rgx
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    @Override // tb.rgx
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    @Override // tb.rgx
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.rgx
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public VesselNativeFrameLayout(Context context) {
        this(context, null);
    }

    public VesselNativeFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VesselNativeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mVesselNativePlugin = new b();
        this.mVesselNativePlugin.f23449a = this.mViewCallback;
    }

    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
        } else if (view.getParent() != null) {
        } else {
            addView(view);
        }
    }

    public Object getVesselParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("64326ef9", new Object[]{this}) : this.vesselParams;
    }

    public void setVesselParams(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cad17b01", new Object[]{this, obj});
        } else {
            this.vesselParams = obj;
        }
    }

    @Override // tb.rgx
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mOnLoadListener = null;
        this.mScrollViewListener = null;
        this.mViewCallback = null;
        this.mVesselNativePlugin = null;
    }

    public void setOnLoadListener(rgu rguVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc27ad2", new Object[]{this, rguVar});
        } else {
            this.mOnLoadListener = rguVar;
        }
    }

    public void setScrollViewListener(rgv rgvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1acaad5e", new Object[]{this, rgvVar});
        } else {
            this.mScrollViewListener = rgvVar;
        }
    }

    public void setVesselViewCallback(rgw rgwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431a7c37", new Object[]{this, rgwVar});
            return;
        }
        this.mViewCallback = rgwVar;
        b bVar = this.mVesselNativePlugin;
        if (bVar == null) {
            return;
        }
        bVar.f23449a = this.mViewCallback;
    }

    public void onFireEvent(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87792119", new Object[]{this, map});
        } else {
            this.mfireEventParams = map;
        }
    }

    public void callVessel(Map<String, Object> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7faefaa0", new Object[]{this, map, aVar});
            return;
        }
        b bVar = this.mVesselNativePlugin;
        if (bVar == null) {
            return;
        }
        bVar.a(map, aVar);
    }

    public void notifyPageFinish(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f05da060", new Object[]{this, view});
            return;
        }
        rgu rguVar = this.mOnLoadListener;
        if (rguVar == null) {
            return;
        }
        rguVar.onLoadFinish(view);
    }

    public void notityPageError(rgy rgyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd18991", new Object[]{this, rgyVar});
            return;
        }
        rgu rguVar = this.mOnLoadListener;
        if (rguVar == null) {
            return;
        }
        rguVar.onLoadError(rgyVar);
    }

    public void notifyPositionOnBottom(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3ccd8c3", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        rgv rgvVar = this.mScrollViewListener;
        if (rgvVar == null) {
            return;
        }
        rgvVar.onScrollToBottom(this, i, i2);
    }

    public void notifyPositionOnTop(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c423a6ab", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        rgv rgvVar = this.mScrollViewListener;
        if (rgvVar == null) {
            return;
        }
        rgvVar.onScrollToBottom(this, i, i2);
    }

    public void notifyPositionOnScroll(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ca29f05", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        rgv rgvVar = this.mScrollViewListener;
        if (rgvVar == null) {
            return;
        }
        rgvVar.onScrollChanged(this, i, i2, i3, i4);
    }

    public void notifyPositionOnRightOrLeftEdge(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77a2f4f9", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        rgv rgvVar = this.mScrollViewListener;
        if (rgvVar == null) {
            return;
        }
        rgvVar.onScrollRightOrLeftEdge(this, i, i2);
    }
}
