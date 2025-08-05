package com.taobao.android.live.plugin.atype.flexalocal.projectscreen;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.dlna.DLNADeviceInfo;
import com.taobao.taobaoavsdk.dlna.DLNAManager;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.ddv;
import tb.ddw;
import tb.kge;
import tb.xkw;

/* loaded from: classes6.dex */
public class ProjectScreenSearchFrame extends BaseFrame implements Application.ActivityLifecycleCallbacks, View.OnClickListener, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ProjectScreenSearchPanel mProjectScreenPanel;
    private ViewGroup mRootView;
    private TBLiveDataModel mTbLiveDataModel;

    static {
        kge.a(2018292822);
        kge.a(191318335);
        kge.a(-1201612728);
        kge.a(-1894394539);
    }

    public static /* synthetic */ Object ipc$super(ProjectScreenSearchFrame projectScreenSearchFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode != -309961236) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCleanUp();
            return null;
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "ProjectScreenSearchFrame";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public boolean lazyInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4de9efe", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    public static /* synthetic */ ProjectScreenSearchPanel access$000(ProjectScreenSearchFrame projectScreenSearchFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProjectScreenSearchPanel) ipChange.ipc$dispatch("430fea28", new Object[]{projectScreenSearchFrame}) : projectScreenSearchFrame.mProjectScreenPanel;
    }

    public ProjectScreenSearchFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
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
        registerActivityLifecycle();
        this.mTbLiveDataModel = tBLiveDataModel;
    }

    private void registerActivityLifecycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae3493f", new Object[]{this});
        } else if (!(this.mContext instanceof Activity)) {
        } else {
            ((Activity) this.mContext).getApplication().registerActivityLifecycleCallbacks(this);
        }
    }

    private void unregisterActivityLifecycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3788d46", new Object[]{this});
        } else if (!(this.mContext instanceof Activity)) {
        } else {
            ((Activity) this.mContext).getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        c.a().a((DLNADeviceInfo) null);
        ProjectScreenSearchPanel projectScreenSearchPanel = this.mProjectScreenPanel;
        if (projectScreenSearchPanel != null) {
            projectScreenSearchPanel.onCleanUp();
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
        } else if (!xkw.EVENT_PROJECT_SCREEN_SHOW.equals(str) || c.a().b() != null) {
        } else {
            showPanel();
        }
    }

    private void showPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81573e0e", new Object[]{this});
            return;
        }
        inflateViewOnNeed();
        TBLiveDataModel tBLiveDataModel = this.mTbLiveDataModel;
        if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null && this.mTbLiveDataModel.mVideoInfo.enableProjectScreen() && this.mProjectScreenPanel == null) {
            this.mRootView = (ViewGroup) this.mContainer.findViewById(R.id.root);
            this.mRootView.setOnClickListener(this);
            String str = "";
            String v = (this.mFrameContext == null || this.mFrameContext.i() == null || this.mFrameContext.i().a() == null) ? str : this.mFrameContext.i().a().v();
            if (this.mLiveDataModel.mVideoInfo.broadCaster != null) {
                str = this.mLiveDataModel.mVideoInfo.broadCaster.accountId;
            }
            c.a().a(v, str, "0", this.mLiveDataModel.mVideoInfo.liveId, "LiveRoom");
            this.mProjectScreenPanel = new ProjectScreenSearchPanel(this.mContext, this.mFrameContext, this.mRootView, this.mLandscape, this.mTbLiveDataModel);
            this.mProjectScreenPanel.onDataReceived(this.mTbLiveDataModel);
        }
        this.mContainer.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.projectscreen.ProjectScreenSearchFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ProjectScreenSearchFrame.this.mContainer == null || ProjectScreenSearchFrame.access$000(ProjectScreenSearchFrame.this) == null || ProjectScreenSearchFrame.access$000(ProjectScreenSearchFrame.this).isShowing()) {
                } else {
                    ProjectScreenSearchFrame.this.mContainer.setBackgroundColor(Color.parseColor("#33000000"));
                    ProjectScreenSearchFrame.access$000(ProjectScreenSearchFrame.this).show();
                }
            }
        });
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

    private void hidePanel() {
        ProjectScreenSearchPanel projectScreenSearchPanel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b669f969", new Object[]{this});
        } else if (this.mContainer == null || (projectScreenSearchPanel = this.mProjectScreenPanel) == null || !projectScreenSearchPanel.isShowing()) {
        } else {
            this.mContainer.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.projectscreen.ProjectScreenSearchFrame.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ProjectScreenSearchFrame.this.mContainer.setBackgroundColor(0);
                    ProjectScreenSearchFrame.access$000(ProjectScreenSearchFrame.this).hide();
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else if (activity != this.mContext) {
        } else {
            unregisterActivityLifecycle();
            DLNAManager.getInstance().release();
        }
    }
}
