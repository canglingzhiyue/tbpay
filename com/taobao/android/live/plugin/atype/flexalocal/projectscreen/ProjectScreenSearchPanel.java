package com.taobao.android.live.plugin.atype.flexalocal.projectscreen;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
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
import com.taobao.taolive.room.utils.s;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.y;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import tb.ddv;
import tb.ddw;
import tb.hgt;
import tb.hhs;
import tb.hjx;
import tb.hjy;
import tb.hkk;
import tb.kge;
import tb.nlq;
import tb.xkw;

/* loaded from: classes6.dex */
public class ProjectScreenSearchPanel extends BasePopupView implements ddv, hjx, hjy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DX_TEMPLATE_NAME = "taolive_projectscreen_searchview";
    private AtomicLong mDeviceRefreshTimeMillis;
    private AtomicLong mDeviceSelectedTimeMillis;
    private DXRootView mDxRootView;
    private final com.taobao.alilive.aliliveframework.frame.a mFrameContext;
    private AtomicLong mHelpTimeMillis;
    private boolean mLandscape;
    private TBLiveDataModel mLiveDataModel;
    private AtomicLong mNetworkSettingTimeMillis;
    private com.taobao.android.live.plugin.atype.flexalocal.projectscreen.model.a mProjectScreenDxModel;
    private AtomicLong mSwitchDeviceTimeMillis;

    static {
        kge.a(2027033837);
        kge.a(191318335);
        kge.a(1366021588);
        kge.a(1956965820);
    }

    public static /* synthetic */ Object ipc$super(ProjectScreenSearchPanel projectScreenSearchPanel, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "ProjectScreenSearchPanel";
    }

    public static /* synthetic */ DXRootView access$000(ProjectScreenSearchPanel projectScreenSearchPanel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("62fbff9e", new Object[]{projectScreenSearchPanel}) : projectScreenSearchPanel.mDxRootView;
    }

    public static /* synthetic */ com.taobao.android.live.plugin.atype.flexalocal.projectscreen.model.a access$100(ProjectScreenSearchPanel projectScreenSearchPanel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.atype.flexalocal.projectscreen.model.a) ipChange.ipc$dispatch("85323ea6", new Object[]{projectScreenSearchPanel}) : projectScreenSearchPanel.mProjectScreenDxModel;
    }

    public static /* synthetic */ Context access$200(ProjectScreenSearchPanel projectScreenSearchPanel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("3a6cea93", new Object[]{projectScreenSearchPanel}) : projectScreenSearchPanel.mContext;
    }

    public static /* synthetic */ Context access$300(ProjectScreenSearchPanel projectScreenSearchPanel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("1436b7d4", new Object[]{projectScreenSearchPanel}) : projectScreenSearchPanel.mContext;
    }

    public static /* synthetic */ Context access$400(ProjectScreenSearchPanel projectScreenSearchPanel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("ee008515", new Object[]{projectScreenSearchPanel}) : projectScreenSearchPanel.mContext;
    }

    public static /* synthetic */ TBLiveDataModel access$500(ProjectScreenSearchPanel projectScreenSearchPanel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveDataModel) ipChange.ipc$dispatch("314ec1f1", new Object[]{projectScreenSearchPanel}) : projectScreenSearchPanel.mLiveDataModel;
    }

    public ProjectScreenSearchPanel(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, ViewGroup viewGroup, boolean z, TBLiveDataModel tBLiveDataModel) {
        super(context, viewGroup);
        this.mHelpTimeMillis = new AtomicLong();
        this.mDeviceRefreshTimeMillis = new AtomicLong();
        this.mNetworkSettingTimeMillis = new AtomicLong();
        this.mDeviceSelectedTimeMillis = new AtomicLong();
        this.mSwitchDeviceTimeMillis = new AtomicLong();
        this.mFrameContext = aVar;
        this.mLandscape = z;
        this.mLiveDataModel = tBLiveDataModel;
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

    private void createDx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("420a0737", new Object[]{this});
        } else if (this.mDxRootView != null) {
            f.m().renderDX(this.mDxRootView, this.mProjectScreenDxModel.e(), nlq.a(this.mContext));
        } else {
            this.mDxRootView = hhs.a().b(this.mContext, DX_TEMPLATE_NAME);
            if (this.mDxRootView == null) {
                return;
            }
            f.m().renderDX(this.mDxRootView, this.mProjectScreenDxModel.e(), nlq.a(this.mContext));
            if (this.mLandscape && !y.a() && !y.b(this.mContext) && !y.c(this.mContext)) {
                View view = new View(this.mContext);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.taobao.taolive.room.utils.d.a(this.mContext, 375.0f), -1);
                view.setLayoutParams(layoutParams);
                layoutParams.gravity = 53;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#000000"), Color.parseColor("#04091D")}));
                this.mContentView.addView(view, layoutParams);
            }
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams2.gravity = 85;
            this.mContentView.addView(this.mDxRootView, layoutParams2);
        }
    }

    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        this.mLiveDataModel = tBLiveDataModel;
        ddw.a().a(this);
        this.mProjectScreenDxModel = com.taobao.android.live.plugin.atype.flexalocal.projectscreen.model.a.a();
        createDx();
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
        com.taobao.android.live.plugin.atype.flexalocal.projectscreen.model.a aVar = this.mProjectScreenDxModel;
        if (aVar == null || !aVar.d()) {
            return;
        }
        startSearchDevices();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.profile.BasePopupView
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        super.hide();
        if (this.mLandscape) {
            return;
        }
        ddw.a().a("com.taobao.taolive.room.enable_updown_switch");
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || this.mLiveDataModel.mVideoInfo.projectScreenInfo == null || this.mProjectScreenDxModel == null) {
            return;
        }
        if (b.EVENT_OPEN_HELP.equals(str) && a.a(this.mHelpTimeMillis)) {
            s.a(this.mContext, hkk.h());
        } else if (b.EVENT_DEVICE_LIST_REFRESH.equals(str) && a.a(this.mDeviceRefreshTimeMillis)) {
            refreshDeviceList();
        } else if (b.EVENT_JUMP_NETWORK_SETTINGS.equals(str) && a.a(this.mNetworkSettingTimeMillis)) {
            this.mContext.startActivity(new Intent("android.settings.WIFI_SETTINGS"));
        } else if (b.EVENT_PROJECT_DEVICE_SELECTED.equals(str) && (obj instanceof JSONObject) && a.a(this.mDeviceSelectedTimeMillis)) {
            VideoInfo.ProjectScreenInfo projectScreenInfo = null;
            try {
                if (this.mLiveDataModel != null && this.mLiveDataModel.mVideoInfo != null && this.mLiveDataModel.mVideoInfo.projectScreenInfo != null) {
                    projectScreenInfo = this.mLiveDataModel.mVideoInfo.projectScreenInfo;
                }
                DLNADeviceInfo dLNADeviceInfo = new DLNADeviceInfo();
                dLNADeviceInfo.deviceId = ((JSONObject) obj).getLong("deviceId").longValue();
                dLNADeviceInfo.deviceName = ((JSONObject) obj).getString("deviceName");
                startProjectScreenToDevice(dLNADeviceInfo, projectScreenInfo);
            } catch (Exception unused) {
            }
        } else if (b.EVENT_SWITCH_DEVICE.equals(str) && a.a(this.mSwitchDeviceTimeMillis)) {
            toSwitchDeviceState(this.mProjectScreenDxModel.f13990a);
        } else if (!"com.taobao.taolive.room.stop_live_project_screen".equals(str)) {
        } else {
            this.mProjectScreenDxModel.b();
        }
    }

    private void toNotFoundState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("998893ae", new Object[]{this});
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.projectscreen.model.a aVar = this.mProjectScreenDxModel;
        if (aVar == null) {
            return;
        }
        aVar.c();
        reRender();
    }

    private void toFoundState(List<DLNADeviceInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60132582", new Object[]{this, list});
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.projectscreen.model.a aVar = this.mProjectScreenDxModel;
        if (aVar == null) {
            return;
        }
        aVar.a(list);
        reRender();
    }

    private void toSwitchDeviceState(DLNADeviceInfo dLNADeviceInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d914c1a", new Object[]{this, dLNADeviceInfo});
        } else if (this.mProjectScreenDxModel == null) {
        } else {
            if (!isShowing()) {
                this.mDxRootView.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.projectscreen.ProjectScreenSearchPanel.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ProjectScreenSearchPanel.this.show();
                        }
                    }
                });
            }
            this.mProjectScreenDxModel.a(dLNADeviceInfo);
            reRender();
        }
    }

    private void refreshDeviceList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("242d4656", new Object[]{this});
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.projectscreen.model.a aVar = this.mProjectScreenDxModel;
        if (aVar == null) {
            return;
        }
        aVar.b();
        reRender();
        startSearchDevices();
    }

    private void startSearchDevices() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb77afda", new Object[]{this});
        } else {
            c.a().a(this);
        }
    }

    private void startProjectScreenToDevice(DLNADeviceInfo dLNADeviceInfo, VideoInfo.ProjectScreenInfo projectScreenInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724cff3c", new Object[]{this, dLNADeviceInfo, projectScreenInfo});
            return;
        }
        toSwitchDeviceState(dLNADeviceInfo);
        d.b();
        c.a().a(dLNADeviceInfo, projectScreenInfo, this);
    }

    private void reRender() {
        DXRootView dXRootView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e94211b0", new Object[]{this});
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.projectscreen.model.a aVar = this.mProjectScreenDxModel;
        if (aVar == null || aVar == null || (dXRootView = this.mDxRootView) == null) {
            return;
        }
        dXRootView.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.projectscreen.ProjectScreenSearchPanel.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    f.m().renderDX(ProjectScreenSearchPanel.access$000(ProjectScreenSearchPanel.this), ProjectScreenSearchPanel.access$100(ProjectScreenSearchPanel.this).e(), nlq.a(ProjectScreenSearchPanel.access$200(ProjectScreenSearchPanel.this)));
                }
            }
        });
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{b.EVENT_OPEN_HELP, b.EVENT_DEVICE_LIST_REFRESH, b.EVENT_JUMP_NETWORK_SETTINGS, b.EVENT_PROJECT_DEVICE_SELECTED, b.EVENT_SWITCH_DEVICE, "com.taobao.taolive.room.stop_live_project_screen"};
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

    @Override // tb.hjx
    public void onProjectScreenSearchDevice(com.taobao.android.live.plugin.atype.flexalocal.projectscreen.model.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ae8d50", new Object[]{this, bVar});
        } else if (bVar == null || !bVar.a() || bVar.b() == null || bVar.b().isEmpty()) {
            toNotFoundState();
        } else {
            toFoundState(bVar.b());
        }
    }

    @Override // tb.hjy
    public void onStartProjectScreen(ProjectScreenResult projectScreenResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c14952", new Object[]{this, projectScreenResult});
        } else if (projectScreenResult == null || !projectScreenResult.a()) {
            this.mDxRootView.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.projectscreen.ProjectScreenSearchPanel.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        hgt.a(ProjectScreenSearchPanel.access$300(ProjectScreenSearchPanel.this).getApplicationContext(), ProjectScreenSearchPanel.access$400(ProjectScreenSearchPanel.this).getString(R.string.taolive_project_screen_failed_flexalocal));
                    }
                }
            });
        } else {
            DLNADeviceInfo c = projectScreenResult.c();
            c.a().a(c);
            d.c();
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("templateName", (Object) ProjectScreenOptPanel.DX_TEMPLATE_NAME);
            JSONObject jSONObject2 = new JSONObject();
            if (c != null) {
                jSONObject2.put("deviceId", (Object) Long.valueOf(c.deviceId));
                jSONObject2.put("deviceName", (Object) c.deviceName);
            }
            jSONObject.put("deviceInfo", (Object) jSONObject2);
            jSONObject.put("showStyle", (Object) "1");
            this.mDxRootView.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.projectscreen.ProjectScreenSearchPanel.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (ProjectScreenSearchPanel.access$500(ProjectScreenSearchPanel.this) != null && ProjectScreenSearchPanel.access$500(ProjectScreenSearchPanel.this).mVideoInfo != null && !ProjectScreenSearchPanel.access$500(ProjectScreenSearchPanel.this).mVideoInfo.landScape) {
                        ddw.a().a(xkw.EVENT_PROJECT_SCREEN_SHOW);
                    }
                    ddw.a().a("com.taobao.taolive.room.start_live_project_screen", jSONObject);
                    ProjectScreenSearchPanel.this.hide();
                }
            });
        }
    }

    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
        } else {
            ddw.a().b(this);
        }
    }
}
