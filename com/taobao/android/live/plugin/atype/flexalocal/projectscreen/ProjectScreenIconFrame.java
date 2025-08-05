package com.taobao.android.live.plugin.atype.flexalocal.projectscreen;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.ddv;
import tb.ddw;
import tb.kge;
import tb.xkw;

/* loaded from: classes6.dex */
public class ProjectScreenIconFrame extends BaseFrame implements ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ICON_URL = "https://gw.alicdn.com/imgextra/i2/O1CN015DpPfc1X4y3ncu5bx_!!6000000002871-2-tps-96-96.png";
    private TUrlImageView mProjectScreenImg;

    static {
        kge.a(904179813);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(ProjectScreenIconFrame projectScreenIconFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else if (hashCode != 248727432) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.inflateViewOnNeed();
            return null;
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "ProjectScreenIconFrame";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public boolean lazyInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4de9efe", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ TUrlImageView access$000(ProjectScreenIconFrame projectScreenIconFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("1cdd4d3b", new Object[]{projectScreenIconFrame}) : projectScreenIconFrame.mProjectScreenImg;
    }

    public ProjectScreenIconFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void inflateViewOnNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed34788", new Object[]{this});
            return;
        }
        super.inflateViewOnNeed();
        this.mProjectScreenImg = (TUrlImageView) this.mContainer.findViewById(R.id.taolive_video_project_screen_img);
        this.mProjectScreenImg.setImageUrl(ICON_URL);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        ddw.a().a(this);
        if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null && tBLiveDataModel.mVideoInfo.enableProjectScreen() && tBLiveDataModel.mVideoInfo.landScape && c.a().b() == null && ((tUrlImageView = this.mProjectScreenImg) == null || tUrlImageView.getVisibility() == 8)) {
            inflateViewOnNeed();
            this.mProjectScreenImg.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.projectscreen.ProjectScreenIconFrame.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int a2 = com.taobao.taolive.sdk.utils.b.a(ProjectScreenIconFrame.access$000(ProjectScreenIconFrame.this).getContext(), 320.0f);
                    if (ProjectScreenIconFrame.this.mFrameContext != null && ProjectScreenIconFrame.this.mFrameContext.i() != null && ProjectScreenIconFrame.this.mFrameContext.i().a() != null && ProjectScreenIconFrame.this.mFrameContext.i().a().r() != null) {
                        Rect rect = new Rect();
                        ProjectScreenIconFrame.this.mFrameContext.i().a().r().getGlobalVisibleRect(rect);
                        a2 = rect.bottom - com.taobao.taolive.sdk.utils.b.a(ProjectScreenIconFrame.this.mContext, 35.0f);
                    }
                    if (ProjectScreenIconFrame.this.mContainer.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                        ((RelativeLayout.LayoutParams) ProjectScreenIconFrame.this.mContainer.getLayoutParams()).topMargin = a2;
                    }
                    ProjectScreenIconFrame.access$000(ProjectScreenIconFrame.this).setVisibility(0);
                    ProjectScreenIconFrame.access$000(ProjectScreenIconFrame.this).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.projectscreen.ProjectScreenIconFrame.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            } else {
                                ddw.a().a(xkw.EVENT_PROJECT_SCREEN_SHOW);
                            }
                        }
                    });
                }
            });
            return;
        }
        TUrlImageView tUrlImageView2 = this.mProjectScreenImg;
        if (tUrlImageView2 == null) {
            return;
        }
        tUrlImageView2.setVisibility(8);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        TUrlImageView tUrlImageView = this.mProjectScreenImg;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(8);
        }
        ddw.a().b(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_project_screen_icon_frame_flexalocal;
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null || !this.mLiveDataModel.mVideoInfo.landScape) {
        } else {
            inflateViewOnNeed();
            if ("com.taobao.taolive.room.start_live_project_screen".equals(str)) {
                TUrlImageView tUrlImageView2 = this.mProjectScreenImg;
                if (tUrlImageView2 == null) {
                    return;
                }
                tUrlImageView2.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.projectscreen.ProjectScreenIconFrame.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ProjectScreenIconFrame.access$000(ProjectScreenIconFrame.this).setVisibility(8);
                        }
                    }
                });
            } else if (!"com.taobao.taolive.room.stop_live_project_screen".equals(str) || (tUrlImageView = this.mProjectScreenImg) == null) {
            } else {
                tUrlImageView.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.projectscreen.ProjectScreenIconFrame.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ProjectScreenIconFrame.access$000(ProjectScreenIconFrame.this).setVisibility(0);
                        }
                    }
                });
            }
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.start_live_project_screen", "com.taobao.taolive.room.stop_live_project_screen"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (this.mFrameContext != null) {
            return this.mFrameContext.G();
        }
        return null;
    }
}
