package com.taobao.vessel.local;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vessel.base.VesselBaseView;
import com.taobao.vessel.utils.VesselType;
import com.taobao.vessel.utils.c;
import java.lang.reflect.Constructor;
import java.util.Map;
import tb.kge;
import tb.rgy;

/* loaded from: classes9.dex */
public class VesselNativeView extends VesselBaseView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Runnable loadRunnabe;
    private String mBundleName;
    private String mClassName;
    private Handler mHandler;
    public VesselNativeFrameLayout mNativeFrameLayout;

    static {
        kge.a(222780188);
    }

    public static /* synthetic */ Object ipc$super(VesselNativeView vesselNativeView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    @Deprecated
    public void loadData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbd1c41", new Object[]{this, str});
        }
    }

    public static /* synthetic */ void access$000(VesselNativeView vesselNativeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e3580a", new Object[]{vesselNativeView});
        } else {
            vesselNativeView.loadView();
        }
    }

    public VesselNativeView(Context context) {
        this(context, null);
    }

    public VesselNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VesselNativeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHandler = new Handler();
        this.loadRunnabe = new Runnable() { // from class: com.taobao.vessel.local.VesselNativeView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (com.taobao.vessel.utils.b.a(VesselNativeView.this.getContext())) {
                } else {
                    VesselNativeView.access$000(VesselNativeView.this);
                }
            }
        };
        if (getId() == -1) {
            setId(com.taobao.vessel.utils.b.a());
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void fireEvent(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78684150", new Object[]{this, str, map});
        } else {
            fireEvent(map);
        }
    }

    public void fireEvent(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9667739a", new Object[]{this, map});
            return;
        }
        VesselNativeFrameLayout vesselNativeFrameLayout = this.mNativeFrameLayout;
        if (vesselNativeFrameLayout == null) {
            return;
        }
        vesselNativeFrameLayout.onFireEvent(map);
    }

    private void getExternalViewFromeBundle(String str) {
        String str2;
        if (str == null) {
            return;
        }
        this.mOriginUrl = str;
        this.mBundleName = com.taobao.vessel.utils.b.e(str);
        this.mClassName = com.taobao.vessel.utils.b.d(str);
        if (this.mBundleName == null || (str2 = this.mClassName) == null) {
            return;
        }
        try {
            Class<?> cls = Class.forName(str2);
            Constructor<?> constructor = cls.getConstructor(Context.class);
            if (cls == null) {
                return;
            }
            this.mNativeFrameLayout = (VesselNativeFrameLayout) constructor.newInstance(getContext());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public VesselNativeFrameLayout getNativeFragment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VesselNativeFrameLayout) ipChange.ipc$dispatch("23b7cc15", new Object[]{this}) : this.mNativeFrameLayout;
    }

    private void loadView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b9c7b2", new Object[]{this});
            return;
        }
        VesselNativeFrameLayout vesselNativeFrameLayout = this.mNativeFrameLayout;
        if (vesselNativeFrameLayout == null) {
            onLoadError(new rgy(c.LOAD_ERROR, c.LOAD_DATA_NULL, VesselType.Native));
            return;
        }
        vesselNativeFrameLayout.setVesselParams(this.mOriginParams);
        this.mNativeFrameLayout.setVesselViewCallback(this.mVesselViewCallback);
        this.mNativeFrameLayout.setOnLoadListener(this);
        this.mNativeFrameLayout.setScrollViewListener(this);
        this.mNativeFrameLayout.onViewCreated(this.mNativeFrameLayout.onCreateView(LayoutInflater.from(getContext()), this.mNativeFrameLayout, null), null);
        if (this.mNativeFrameLayout.getParent() != null) {
            return;
        }
        addView(this.mNativeFrameLayout);
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void loadUrl(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b60501d6", new Object[]{this, str, obj});
            return;
        }
        onLoadStart();
        if (obj != null) {
            this.mOriginParams = obj;
        }
        getExternalViewFromeBundle(str);
        loadView();
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void releaseMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f01c06f", new Object[]{this});
            return;
        }
        removeAllViews();
        if (this.mNativeFrameLayout != null) {
            this.mNativeFrameLayout = null;
        }
        onDestroy();
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public View getChildView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("5d844df4", new Object[]{this}) : this.mNativeFrameLayout;
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public boolean refresh(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a612d42", new Object[]{this, obj})).booleanValue();
        }
        if (obj != null) {
            loadUrl(this.mOriginUrl, obj);
        } else {
            loadUrl(this.mOriginUrl, this.mOriginParams);
        }
        return false;
    }

    @Override // tb.rgx
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        VesselNativeFrameLayout vesselNativeFrameLayout = this.mNativeFrameLayout;
        if (vesselNativeFrameLayout == null) {
            return;
        }
        vesselNativeFrameLayout.onStart();
    }

    @Override // tb.rgx
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        VesselNativeFrameLayout vesselNativeFrameLayout = this.mNativeFrameLayout;
        if (vesselNativeFrameLayout == null) {
            return;
        }
        vesselNativeFrameLayout.onResume();
    }

    @Override // tb.rgx
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        VesselNativeFrameLayout vesselNativeFrameLayout = this.mNativeFrameLayout;
        if (vesselNativeFrameLayout == null) {
            return;
        }
        vesselNativeFrameLayout.onPause();
    }

    @Override // tb.rgx
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        VesselNativeFrameLayout vesselNativeFrameLayout = this.mNativeFrameLayout;
        if (vesselNativeFrameLayout == null) {
            return;
        }
        vesselNativeFrameLayout.onStop();
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
        VesselNativeFrameLayout vesselNativeFrameLayout = this.mNativeFrameLayout;
        if (vesselNativeFrameLayout == null) {
            return;
        }
        vesselNativeFrameLayout.onDestroy();
    }
}
