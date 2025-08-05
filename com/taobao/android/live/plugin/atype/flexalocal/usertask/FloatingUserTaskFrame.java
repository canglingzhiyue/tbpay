package com.taobao.android.live.plugin.atype.flexalocal.usertask;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.utils.ad;
import com.taobao.taolive.sdk.utils.o;
import java.util.Random;
import tb.hkk;
import tb.kge;
import tb.phq;
import tb.poy;
import tb.pqj;

/* loaded from: classes6.dex */
public class FloatingUserTaskFrame extends BaseFrame implements d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FloatingUserTaskView mFloatingUserTaskView;
    private boolean mHasDidAppear;
    private a mUserTaskController;

    static {
        kge.a(-1606830204);
        kge.a(-2101054629);
    }

    public static /* synthetic */ Object ipc$super(FloatingUserTaskFrame floatingUserTaskFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1857981988:
                super.onDidAppear();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 91531079:
                super.onViewCreated((View) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ a access$000(FloatingUserTaskFrame floatingUserTaskFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3502af55", new Object[]{floatingUserTaskFrame}) : floatingUserTaskFrame.mUserTaskController;
    }

    public static /* synthetic */ FloatingUserTaskView access$100(FloatingUserTaskFrame floatingUserTaskFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatingUserTaskView) ipChange.ipc$dispatch("8ff78de6", new Object[]{floatingUserTaskFrame}) : floatingUserTaskFrame.mFloatingUserTaskView;
    }

    public static /* synthetic */ f access$200(FloatingUserTaskFrame floatingUserTaskFrame, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("b72472a2", new Object[]{floatingUserTaskFrame, new Boolean(z)}) : floatingUserTaskFrame.updateUserTask(z);
    }

    public static /* synthetic */ boolean access$300(FloatingUserTaskFrame floatingUserTaskFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2c3e9fe9", new Object[]{floatingUserTaskFrame})).booleanValue() : floatingUserTaskFrame.mHasDidAppear;
    }

    public static /* synthetic */ void access$400(FloatingUserTaskFrame floatingUserTaskFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac5b126", new Object[]{floatingUserTaskFrame});
        } else {
            floatingUserTaskFrame.destroy();
        }
    }

    public static /* synthetic */ void access$500(FloatingUserTaskFrame floatingUserTaskFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94cc267", new Object[]{floatingUserTaskFrame});
        } else {
            floatingUserTaskFrame.appear();
        }
    }

    public FloatingUserTaskFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
    }

    public FloatingUserTaskFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
    }

    public void setIUserTaskEventListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e29d061d", new Object[]{this, cVar});
            return;
        }
        FloatingUserTaskView floatingUserTaskView = this.mFloatingUserTaskView;
        if (floatingUserTaskView == null) {
            return;
        }
        floatingUserTaskView.setIUserTaskEventListener(cVar);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.mFloatingUserTaskView = (FloatingUserTaskView) view;
        this.mFloatingUserTaskView.setVisibility(8);
        this.mFloatingUserTaskView.setIUserTaskEntryClickListener(new b() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.FloatingUserTaskFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.live.plugin.atype.flexalocal.usertask.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (FloatingUserTaskFrame.this.mLiveDataModel == null || FloatingUserTaskFrame.this.mLiveDataModel.mVideoInfo == null || FloatingUserTaskFrame.access$000(FloatingUserTaskFrame.this) == null) {
                } else {
                    FloatingUserTaskFrame.access$000(FloatingUserTaskFrame.this).a(FloatingUserTaskFrame.this.mLiveDataModel.mVideoInfo.broadCaster != null ? FloatingUserTaskFrame.this.mLiveDataModel.mVideoInfo.broadCaster.accountId : "", FloatingUserTaskFrame.this.mLiveDataModel.mVideoInfo.liveId, (phq) FloatingUserTaskFrame.this.mFrameContext);
                }
            }
        });
        this.mFloatingUserTaskView.setIUserTaskPosChanged(new d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.FloatingUserTaskFrame.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.live.plugin.atype.flexalocal.usertask.d
            public void a(float f, float f2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
                } else if (FloatingUserTaskFrame.access$100(FloatingUserTaskFrame.this) == null) {
                } else {
                    k.f21821a = (int) (((f + (FloatingUserTaskFrame.access$100(FloatingUserTaskFrame.this).getWidth() / 2)) / com.taobao.taolive.sdk.utils.b.b(FloatingUserTaskFrame.this.mContext)) * 375.0f);
                    k.b = (int) (((f2 + (FloatingUserTaskFrame.access$100(FloatingUserTaskFrame.this).getHeight() / 2)) / com.taobao.taolive.sdk.utils.b.c(FloatingUserTaskFrame.this.mContext)) * 375.0f);
                }
            }
        });
    }

    private void changeLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efceada7", new Object[]{this});
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.mFloatingUserTaskView.getLayoutParams();
        if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.addRule(12);
        layoutParams2.addRule(11);
        if (this.mLandscape) {
            layoutParams2.bottomMargin = com.taobao.taolive.sdk.utils.b.a(this.mContext, 95.0f);
        } else {
            layoutParams2.bottomMargin = com.taobao.taolive.sdk.utils.b.a(this.mContext, 300.0f);
        }
        this.mFloatingUserTaskView.setLayoutParams(layoutParams);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_room_user_task_layout_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        a aVar = this.mUserTaskController;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        a aVar = this.mUserTaskController;
        if (aVar == null) {
            return;
        }
        aVar.c();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        super.onDidAppear();
        this.mHasDidAppear = true;
        this.mUserTaskController = createOrGetUserTaskController();
        if (this.mLiveDataModel != null) {
            appear();
        }
        if (this.mFrameContext == null || this.mFrameContext.f() == null) {
            return;
        }
        this.mFrameContext.f().registerMessageListener(this, new MessageTypeFilter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.FloatingUserTaskFrame.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1018;
            }
        });
    }

    private a createOrGetUserTaskController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c7e39c8d", new Object[]{this});
        }
        if (!(this.mFrameContext instanceof com.taobao.taolive.sdk.core.e) || ((com.taobao.taolive.sdk.core.e) this.mFrameContext).y() == null) {
            return null;
        }
        if (((com.taobao.taolive.sdk.core.e) this.mFrameContext).y().d() != null && (((com.taobao.taolive.sdk.core.e) this.mFrameContext).y().d() instanceof a)) {
            return (a) ((com.taobao.taolive.sdk.core.e) this.mFrameContext).y().d();
        }
        a aVar = new a("liveroom", poy.r(this.mFrameContext));
        ((com.taobao.taolive.sdk.core.e) this.mFrameContext).y().a(aVar);
        return aVar;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (this.mHasDidAppear) {
            appear();
        }
        if (this.mFrameContext == null || this.mFrameContext.f() == null) {
            return;
        }
        this.mFrameContext.f().unRegisterMessageListener(this);
    }

    private void appear() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aff7f9c", new Object[]{this});
        } else if (this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null) {
        } else {
            if ((this.mLiveDataModel.mVideoInfo.status != 0 && this.mLiveDataModel.mVideoInfo.status != 3) || poy.af(this.mFrameContext) || ad.a(this.mFrameContext, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive)) {
                return;
            }
            if (this.mUserTaskController != null) {
                String str3 = null;
                if (this.mLiveDataModel.mVideoInfo != null) {
                    String str4 = this.mLiveDataModel.mVideoInfo.liveId;
                    if (this.mLiveDataModel.mVideoInfo.broadCaster != null) {
                        str3 = this.mLiveDataModel.mVideoInfo.broadCaster.accountId;
                    }
                    str = str4;
                    str2 = str3;
                } else {
                    str = null;
                    str2 = null;
                }
                if (this.mUserTaskController.a(str2, str)) {
                    this.mUserTaskController.a(poy.R(this.mFrameContext), poy.R(this.mFrameContext), str, str2, this.mLiveDataModel.mInitParams.get(aw.PARAM_USER_TASK_JSON), true);
                }
            }
            changeLayoutParams();
            checkUserTask();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        super.onDidDisappear();
        destroy();
    }

    private void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mHasDidAppear = false;
        FloatingUserTaskView floatingUserTaskView = this.mFloatingUserTaskView;
        if (floatingUserTaskView != null) {
            floatingUserTaskView.setVisibility(8);
        }
        a aVar = this.mUserTaskController;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
        } else {
            super.onCleanUp();
        }
    }

    private void checkUserTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158db19f", new Object[]{this});
        } else if (this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null) {
        } else {
            if ((this.mLiveDataModel.mVideoInfo.status != 0 && this.mLiveDataModel.mVideoInfo.status != 3) || poy.af(this.mFrameContext) || !(this.mFrameContext instanceof com.taobao.taolive.sdk.core.e) || this.mUserTaskController == null) {
                return;
            }
            this.mUserTaskController.a(this.mFrameContext.g() != null ? this.mFrameContext.g().get("livesource") : "", new e() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.FloatingUserTaskFrame.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.live.plugin.atype.flexalocal.usertask.e
                public void a(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    } else if (FloatingUserTaskFrame.this.mLiveDataModel == null || FloatingUserTaskFrame.this.mLiveDataModel.mVideoInfo == null) {
                    } else {
                        if (FloatingUserTaskFrame.this.mLandscape) {
                            z = false;
                        }
                        f access$200 = FloatingUserTaskFrame.access$200(FloatingUserTaskFrame.this, z);
                        if (!z || FloatingUserTaskFrame.access$000(FloatingUserTaskFrame.this) == null) {
                            return;
                        }
                        FloatingUserTaskFrame.access$000(FloatingUserTaskFrame.this).a(access$200);
                    }
                }
            });
        }
    }

    private f updateUserTask(boolean z) {
        f userTaskView;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("e2da6dde", new Object[]{this, new Boolean(z)});
        }
        if (!o.b() || !z) {
            z2 = false;
        }
        if (!z2) {
            return null;
        }
        if (hkk.M()) {
            userTaskView = new UserTaskView2(this.mContext);
        } else {
            userTaskView = new UserTaskView(this.mContext);
        }
        f fVar = userTaskView;
        this.mFloatingUserTaskView.setVisibility(0);
        this.mFloatingUserTaskView.initView(fVar.getView());
        initFloatingViewPos(this.mFloatingUserTaskView);
        return fVar;
    }

    private void initFloatingViewPos(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf269d72", new Object[]{this, view});
        } else if (view == null) {
        } else {
            view.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.FloatingUserTaskFrame.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    View view2 = view;
                    if (view2 == null) {
                        return;
                    }
                    int[] iArr = new int[2];
                    view2.getLocationInWindow(iArr);
                    k.f21821a = (int) (((iArr[0] + (view.getWidth() / 2)) / com.taobao.taolive.sdk.utils.b.b(FloatingUserTaskFrame.this.mContext)) * 375.0f);
                    k.b = (int) (((iArr[1] + (view.getHeight() / 2)) / com.taobao.taolive.sdk.utils.b.c(FloatingUserTaskFrame.this.mContext)) * 375.0f);
                }
            }, 50L);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        destroy();
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        JSONObject b;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            return;
        }
        if (i == 1018) {
            try {
                if ((obj instanceof TLiveMsg) && (b = pqj.b(new String(((TLiveMsg) obj).data))) != null && "alivemodx-shopping-train".equals(b.getString("name")) && (jSONObject = b.getJSONArray("components").getJSONObject(0).getJSONObject("data").getJSONObject("bizData")) != null) {
                    String string = jSONObject.getString("actionType");
                    int intValue = jSONObject.getIntValue("entryDisperseTime");
                    if (string != null && string.equals("getEntry")) {
                        if (intValue > 0) {
                            this.mFloatingUserTaskView.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.usertask.FloatingUserTaskFrame.6
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (!FloatingUserTaskFrame.access$300(FloatingUserTaskFrame.this)) {
                                    } else {
                                        FloatingUserTaskFrame.access$400(FloatingUserTaskFrame.this);
                                        FloatingUserTaskFrame.access$500(FloatingUserTaskFrame.this);
                                    }
                                }
                            }, new Random().nextInt(5) * 1000);
                        } else {
                            destroy();
                            appear();
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
