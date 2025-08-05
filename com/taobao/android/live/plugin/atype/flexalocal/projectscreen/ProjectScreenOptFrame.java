package com.taobao.android.live.plugin.atype.flexalocal.projectscreen;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.ddv;
import tb.ddw;
import tb.kge;
import tb.xkw;

/* loaded from: classes6.dex */
public class ProjectScreenOptFrame extends BaseFrame implements View.OnClickListener, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ProjectScreenOptPanel mProjectScreenPanel;
    private ViewGroup mRootView;

    static {
        kge.a(1210429545);
        kge.a(191318335);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(ProjectScreenOptFrame projectScreenOptFrame, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "ProjectScreenOptFrame";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public boolean lazyInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4de9efe", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ ProjectScreenOptPanel access$000(ProjectScreenOptFrame projectScreenOptFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProjectScreenOptPanel) ipChange.ipc$dispatch("5c409ed2", new Object[]{projectScreenOptFrame}) : projectScreenOptFrame.mProjectScreenPanel;
    }

    public ProjectScreenOptFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
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
        this.mRootView = (ViewGroup) this.mContainer.findViewById(R.id.root);
        this.mRootView.setOnClickListener(this);
        if (this.mProjectScreenPanel != null) {
            return;
        }
        this.mProjectScreenPanel = new ProjectScreenOptPanel(this.mContext, this.mFrameContext, this.mRootView, this.mLandscape, this.mLiveDataModel);
        this.mProjectScreenPanel.onDataReceived(this.mLiveDataModel);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        ddw.a().a(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        ProjectScreenOptPanel projectScreenOptPanel = this.mProjectScreenPanel;
        if (projectScreenOptPanel != null) {
            projectScreenOptPanel.onCleanUp();
            this.mProjectScreenPanel = null;
        }
        ddw.a().b(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_project_screen_flexalocal;
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (!xkw.EVENT_PROJECT_SCREEN_SHOW.equals(str) || c.a().b() == null || this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null || this.mLiveDataModel.mVideoInfo.landScape) {
        } else {
            inflateViewOnNeed();
            showPanel();
        }
    }

    private void showPanel() {
        ProjectScreenOptPanel projectScreenOptPanel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81573e0e", new Object[]{this});
        } else if (this.mContainer == null || (projectScreenOptPanel = this.mProjectScreenPanel) == null || projectScreenOptPanel.isShowing()) {
        } else {
            this.mContainer.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.projectscreen.ProjectScreenOptFrame.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ProjectScreenOptFrame.this.mContainer.setBackgroundColor(Color.parseColor("#33000000"));
                    ProjectScreenOptFrame.access$000(ProjectScreenOptFrame.this).show();
                }
            });
        }
    }

    private void hidePanel() {
        ProjectScreenOptPanel projectScreenOptPanel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b669f969", new Object[]{this});
        } else if (this.mContainer == null || (projectScreenOptPanel = this.mProjectScreenPanel) == null || !projectScreenOptPanel.isShowing()) {
        } else {
            this.mContainer.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.projectscreen.ProjectScreenOptFrame.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ProjectScreenOptFrame.this.mContainer.setBackgroundColor(0);
                    ProjectScreenOptFrame.access$000(ProjectScreenOptFrame.this).hide();
                }
            });
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_PROJECT_SCREEN_SHOW};
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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else {
            hidePanel();
        }
    }
}
