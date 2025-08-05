package com.taobao.taolive.room.ui.fanslevel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.room.utils.m;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.FandomPreLiveInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.tbliveinteractive.e;
import java.util.HashMap;
import tb.kge;
import tb.kqq;
import tb.phq;
import tb.plk;
import tb.pmd;
import tb.pnj;
import tb.poy;
import tb.poz;
import tb.qmr;

/* loaded from: classes8.dex */
public class H5DynamicSDKFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public com.taobao.tbliveinteractive.container.h5.b mH5Container;
    public long setupTime;

    static {
        kge.a(1025100063);
    }

    public static /* synthetic */ Object ipc$super(H5DynamicSDKFrame h5DynamicSDKFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -1073179481:
                super.onFreezeLayout();
                return null;
            case -908767872:
                super.onUnfreezeLayout();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1659846701:
                super.onScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : "dynamic_h5_sdk";
    }

    public H5DynamicSDKFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        com.taobao.tbliveinteractive.container.h5.b bVar = this.mH5Container;
        if (bVar == null) {
            return;
        }
        bVar.k();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        com.taobao.tbliveinteractive.container.h5.b bVar = this.mH5Container;
        if (bVar == null) {
            return;
        }
        bVar.l();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        } else if (viewStub == null) {
        } else {
            viewStub.setLayoutResource(R.layout.taolive_fansrights_bubble);
            this.mContainer = viewStub.inflate();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            return;
        }
        super.onStatusChange(i, obj);
        if (i != 1) {
            return;
        }
        setupView();
    }

    private void setupView() {
        int i;
        int i2;
        String str;
        ATaoLiveOpenEntity o;
        kqq kqqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7423b649", new Object[]{this});
            return;
        }
        if (this.mFrameContext == null || (o = this.mFrameContext.o()) == null || o.uiCompontent == null || !(o.uiCompontent.a() instanceof kqq) || (kqqVar = (kqq) o.uiCompontent.a()) == null) {
            i = 0;
            i2 = 0;
        } else {
            Float a2 = kqqVar.a();
            i2 = a2 != null ? a2.intValue() : 0;
            Float b = kqqVar.b();
            i = b != null ? b.intValue() : 0;
        }
        if (this.mContainer != null) {
            this.mContainer.setPadding(0, i2, 0, i);
        }
        this.setupTime = System.currentTimeMillis();
        e tBLiveInteractiveManager = getTBLiveInteractiveManager();
        if (tBLiveInteractiveManager == null) {
            return;
        }
        m.d(this.mFrameContext);
        if (tBLiveInteractiveManager.c() != null) {
            tBLiveInteractiveManager.c().dl_();
        }
        this.mH5Container = tBLiveInteractiveManager.a((ViewGroup) this.mContainer, poz.p(n.b(this.mFrameContext)));
        this.mH5Container.a(new c(this.mContext, this.mFrameContext));
        this.mH5Container.a(new b(this.mContext, this.mFrameContext));
        VideoInfo a3 = k.a(this.mLiveDataModel);
        FandomInfo a4 = poy.a(this.mLiveDataModel, this.mFrameContext);
        String str2 = null;
        if (a3 != null) {
            str = a3.liveId;
            if (a3.dynamicRender != null) {
                str2 = a3.dynamicRender.h5DynamicRenderUrl;
            }
        } else if (a4 != null) {
            FandomPreLiveInfo G = poy.G(this.mFrameContext);
            if (G != null) {
                str2 = G.liveId;
            }
            String str3 = a4.h5DynamicRenderUrl;
            str = str2;
            str2 = str3;
        } else {
            str = null;
        }
        final long nanoTime = System.nanoTime();
        this.mH5Container.a(new qmr.a() { // from class: com.taobao.taolive.room.ui.fanslevel.H5DynamicSDKFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.qmr.a
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    return;
                }
                if (H5DynamicSDKFrame.this.mContainer != null) {
                    H5DynamicSDKFrame.this.mContainer.setBackgroundColor(0);
                    H5DynamicSDKFrame.this.mContainer.setVisibility(0);
                }
                HashMap hashMap = new HashMap();
                long j = 0;
                String valueOf = String.valueOf(nanoTime > 0 ? System.nanoTime() - nanoTime : 0L);
                if (H5DynamicSDKFrame.this.setupTime > 0) {
                    j = System.currentTimeMillis() - H5DynamicSDKFrame.this.setupTime;
                }
                String valueOf2 = String.valueOf(j);
                hashMap.put("renderTime", valueOf);
                hashMap.put("isReloadRender", "false");
                ai.a(H5DynamicSDKFrame.this.mFrameContext, "Show-H5DynamicFrame", (HashMap<String, String>) hashMap);
                com.taobao.alilive.aliliveframework.frame.a aVar = H5DynamicSDKFrame.this.mFrameContext;
                ai.a(aVar, "h5Render", "renderTime=" + valueOf, "isReloadRender=false", "duration=" + valueOf2, "status=1");
                pnj m = pmd.a().m();
                m.c(pnj.LOG_TAG, "renderSuccess---renderTime:" + valueOf + " isReloadH5Container:false");
            }

            @Override // tb.qmr.a
            public void a(String str4, String str5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str4, str5});
                    return;
                }
                if (H5DynamicSDKFrame.this.mContainer != null) {
                    H5DynamicSDKFrame.this.mContainer.setVisibility(8);
                }
                if (d.a()) {
                    Context context = H5DynamicSDKFrame.this.mContext;
                    plk.a(context, "errorCode :" + str4 + "\nerrorMsg :" + str5);
                }
                long j = 0;
                String valueOf = String.valueOf(nanoTime > 0 ? System.nanoTime() - nanoTime : 0L);
                if (H5DynamicSDKFrame.this.setupTime > 0) {
                    j = System.currentTimeMillis() - H5DynamicSDKFrame.this.setupTime;
                }
                String valueOf2 = String.valueOf(j);
                com.taobao.alilive.aliliveframework.frame.a aVar = H5DynamicSDKFrame.this.mFrameContext;
                ai.a(aVar, "h5Render", "renderTime=" + valueOf, "isReloadRender=false", "duration=" + valueOf2, "status=0", "errorMsg=" + str5);
            }
        });
        this.mH5Container.c(str2);
        pmd.a().m().c(pnj.LOG_TAG, "H5ContainerRender---" + str + " url---" + str2);
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

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onScrollStateChanged(int i) {
        e tBLiveInteractiveManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(i);
        if (!aa.cQ()) {
            return;
        }
        if (i == 1) {
            e tBLiveInteractiveManager2 = getTBLiveInteractiveManager();
            if (tBLiveInteractiveManager2 == null) {
                return;
            }
            tBLiveInteractiveManager2.a("TBLiveWVPlugin.Event.liveroom.h5_onTouchScroll_DRAGGING", "");
        } else if (i != 0 || (tBLiveInteractiveManager = getTBLiveInteractiveManager()) == null) {
        } else {
            tBLiveInteractiveManager.a("TBLiveWVPlugin.Event.liveroom.h5_onTouchScroll_IDLE", "");
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

    private void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ab.c("VideoAdapterFrame", "H5DynamicSDKFrame destroy");
        com.taobao.tbliveinteractive.container.h5.b bVar = this.mH5Container;
        if (bVar != null) {
            bVar.m();
            this.mH5Container = null;
        }
        if (!(this.mContainer instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.mContainer).removeAllViews();
    }

    private e getTBLiveInteractiveManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("a8e86078", new Object[]{this});
        }
        if (!(this.mFrameContext instanceof phq)) {
            return null;
        }
        return ((phq) this.mFrameContext).p();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onFreezeLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c00894a7", new Object[]{this});
            return;
        }
        super.onFreezeLayout();
        com.taobao.tbliveinteractive.container.h5.b bVar = this.mH5Container;
        if (bVar == null) {
            return;
        }
        bVar.l();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onUnfreezeLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d54d80", new Object[]{this});
            return;
        }
        super.onUnfreezeLayout();
        com.taobao.tbliveinteractive.container.h5.b bVar = this.mH5Container;
        if (bVar == null) {
            return;
        }
        bVar.k();
    }
}
