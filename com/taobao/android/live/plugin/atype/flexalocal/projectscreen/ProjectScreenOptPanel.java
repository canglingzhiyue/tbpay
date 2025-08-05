package com.taobao.android.live.plugin.atype.flexalocal.projectscreen;

import android.content.Context;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.profile.BasePopupView;
import com.taobao.android.live.plugin.atype.flexalocal.projectscreen.model.ProjectScreenResult;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.dlna.DLNADeviceInfo;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.concurrent.atomic.AtomicLong;
import tb.ddv;
import tb.ddw;
import tb.hgt;
import tb.hhs;
import tb.hin;
import tb.hjy;
import tb.kge;
import tb.nlq;

/* loaded from: classes6.dex */
public class ProjectScreenOptPanel extends BasePopupView implements ddv, hjy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DX_TEMPLATE_NAME = "taolive_projectscreen_optview";
    private AtomicLong mDeviceRefreshTimeMillis;
    private DXRootView mDxRootView;
    private final com.taobao.alilive.aliliveframework.frame.a mFrameContext;
    private boolean mLandscape;
    private TBLiveDataModel mLiveDataModel;
    private AtomicLong mStopTimeMillis;
    private AtomicLong mSwitchDeviceTimeMillis;

    static {
        kge.a(1219170560);
        kge.a(191318335);
        kge.a(1956965820);
    }

    public static /* synthetic */ Object ipc$super(ProjectScreenOptPanel projectScreenOptPanel, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1775111991) {
            super.hide();
            return null;
        } else if (hashCode != -340027132) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.show();
            return null;
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "ProjectScreenOptPanel";
    }

    public static /* synthetic */ DXRootView access$000(ProjectScreenOptPanel projectScreenOptPanel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("93e3cd6d", new Object[]{projectScreenOptPanel}) : projectScreenOptPanel.mDxRootView;
    }

    public static /* synthetic */ JSONObject access$100(ProjectScreenOptPanel projectScreenOptPanel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("8bd653a9", new Object[]{projectScreenOptPanel}) : projectScreenOptPanel.getData();
    }

    public static /* synthetic */ Context access$200(ProjectScreenOptPanel projectScreenOptPanel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9ebc2e0", new Object[]{projectScreenOptPanel}) : projectScreenOptPanel.mContext;
    }

    public ProjectScreenOptPanel(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, ViewGroup viewGroup, boolean z, TBLiveDataModel tBLiveDataModel) {
        super(context, viewGroup);
        this.mDeviceRefreshTimeMillis = new AtomicLong();
        this.mSwitchDeviceTimeMillis = new AtomicLong();
        this.mStopTimeMillis = new AtomicLong();
        this.mFrameContext = aVar;
        this.mLandscape = z;
        this.mLiveDataModel = tBLiveDataModel;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.profile.BasePopupView
    public View onCreateContentView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a25b4d4b", new Object[]{this, viewGroup});
        }
        this.mContentView = viewGroup;
        this.mContentView.setVisibility(8);
        return this.mContentView;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.profile.BasePopupView
    public FrameLayout.LayoutParams onCreateLayoutParams(View view, DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("46bd761c", new Object[]{this, view, displayMetrics});
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return layoutParams == null ? new FrameLayout.LayoutParams(-1, -1) : layoutParams;
    }

    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        this.mLiveDataModel = tBLiveDataModel;
        ddw.a().a(this);
        createDx();
    }

    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        if (c.a().b() != null) {
            d.d();
        }
        ddw.a().b(this);
        c.a().a((DLNADeviceInfo) null);
        ddw.a().a("com.taobao.taolive.room.stop_live_project_screen");
        hideOnUiThread();
    }

    private void createDx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("420a0737", new Object[]{this});
        } else if (this.mDxRootView != null) {
            reRenderDx();
        } else {
            this.mDxRootView = hhs.a().b(this.mContext, DX_TEMPLATE_NAME);
            if (this.mDxRootView == null) {
                return;
            }
            f.m().renderDX(this.mDxRootView, getData(), nlq.a(this.mContext));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, hin.a(this.mContext, 575.0f));
            layoutParams.gravity = 85;
            this.mContentView.addView(this.mDxRootView, layoutParams);
        }
    }

    private void reRenderDx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf7fa24", new Object[]{this});
            return;
        }
        DXRootView dXRootView = this.mDxRootView;
        if (dXRootView == null) {
            return;
        }
        dXRootView.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.projectscreen.ProjectScreenOptPanel.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    f.m().renderDX(ProjectScreenOptPanel.access$000(ProjectScreenOptPanel.this), ProjectScreenOptPanel.access$100(ProjectScreenOptPanel.this), nlq.a(ProjectScreenOptPanel.access$200(ProjectScreenOptPanel.this)));
                }
            }
        });
    }

    private JSONObject getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        DLNADeviceInfo b = c.a().b();
        if (b != null) {
            String str = "0";
            jSONObject.put("showStyle", (Object) str);
            TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
            if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null && this.mLiveDataModel.mVideoInfo.landScape) {
                str = "1";
            }
            jSONObject.put("landscapeStyle", (Object) str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("deviceId", (Object) Long.valueOf(b.deviceId));
            jSONObject2.put("deviceName", (Object) b.deviceName);
            jSONObject.put("deviceInfo", (Object) jSONObject2);
        }
        return jSONObject;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.profile.BasePopupView
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        d.a();
        if (!this.mLandscape) {
            ddw.a().a("com.taobao.taolive.room.disable_updown_switch");
        }
        createDx();
        this.mViewGroup.setBackgroundColor(Color.parseColor("#33000000"));
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.profile.BasePopupView
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        super.hide();
        if (!this.mLandscape) {
            ddw.a().a("com.taobao.taolive.room.enable_updown_switch");
        }
        this.mViewGroup.setBackgroundColor(0);
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || this.mLiveDataModel.mVideoInfo.projectScreenInfo == null || !this.mLiveDataModel.mVideoInfo.enableProjectScreen()) {
            return;
        }
        if (b.EVENT_PROJECT_SCREEN_REFRESH.equals(str) && a.a(this.mDeviceRefreshTimeMillis)) {
            DLNADeviceInfo b = c.a().b();
            if (b == null) {
                return;
            }
            c.a().a(b, this.mLiveDataModel.mVideoInfo.projectScreenInfo, this);
        } else if (b.EVENT_SWITCH_DEVICE.equals(str) && a.a(this.mSwitchDeviceTimeMillis)) {
            hideOnUiThread();
        } else if (!b.EVENT_STOP_PROJECT_SCREEN.equals(str) || !a.a(this.mStopTimeMillis)) {
        } else {
            stopProjectScreen();
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{b.EVENT_PROJECT_SCREEN_REFRESH, b.EVENT_SWITCH_DEVICE, b.EVENT_STOP_PROJECT_SCREEN};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.mFrameContext;
        if (aVar != null) {
            return aVar.G();
        }
        return null;
    }

    @Override // tb.hjy
    public void onStartProjectScreen(ProjectScreenResult projectScreenResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c14952", new Object[]{this, projectScreenResult});
        } else if (projectScreenResult != null && projectScreenResult.a()) {
        } else {
            hgt.a(this.mContext.getApplicationContext(), this.mContext.getString(R.string.taolive_project_screen_refresh_failed_flexalocal));
        }
    }

    public void stopProjectScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7a6070a", new Object[]{this});
            return;
        }
        d.d();
        c.a().a((DLNADeviceInfo) null);
        ddw.a().a("com.taobao.taolive.room.stop_live_project_screen");
        hideOnUiThread();
        c.a().c();
        c.a().d();
    }

    private void hideOnUiThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812118a6", new Object[]{this});
        } else if (this.mContentView == null || !isShowing()) {
        } else {
            this.mContentView.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.projectscreen.ProjectScreenOptPanel.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ProjectScreenOptPanel.this.hide();
                    }
                }
            });
        }
    }
}
