package com.taobao.avplayer;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWInstance;
import com.taobao.avplayer.component.weex.WXSplayerModule;
import com.taobao.media.MediaSystemUtils;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import tb.kbf;
import tb.kck;
import tb.kge;

/* loaded from: classes6.dex */
public class bk extends DWInstance {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-69233412);
        ab.a();
        boolean isSupport = WXEnvironment.isSupport();
        kck.c = isSupport;
        if (isSupport) {
            try {
                WXSDKEngine.registerModule("SplayerModule", WXSplayerModule.class);
            } catch (WXException e) {
                e.printStackTrace();
            }
        }
        b.f16469a = new i();
        b.b = new com.taobao.avplayer.hiv.a();
        if (b.d == null) {
            b.d = new c();
        }
    }

    public bk(DWInstance.d dVar) {
        super(dVar);
    }

    @Override // com.taobao.avplayer.DWInstance
    public void initAdapter(DWInstance.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b746db07", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            if (dVar.x == null) {
                this.mDWContext.mConfigAdapter = b.d;
            }
            if (dVar.y == null) {
                this.mDWContext.mConfigParamsAdapter = new e();
            }
            if (dVar.t == null) {
                this.mDWContext.mNetworkAdapter = new DWNetworkAdapter();
            }
            if (dVar.u == null) {
                this.mDWContext.mUTAdapter = new ak();
            }
            if (dVar.N == null) {
                this.mDWContext.mNetworkFlowAdapter = new w();
            }
            if (dVar.z == null) {
                this.mDWContext.mDWAlarmAdapter = new ad();
            }
            if (dVar.B == null) {
                this.mDWContext.mSharedapter = new af();
            }
            if (dVar.aK == null) {
                MediaPlayControlContext mediaPlayControlContext = this.mDWContext.mPlayContext;
                DWContext dWContext = this.mDWContext;
                ah ahVar = new ah();
                dWContext.mTlogAdapter = ahVar;
                mediaPlayControlContext.mTLogAdapter = ahVar;
            }
            this.mDWContext.mNetworkUtilsAdapter = new kbf();
            this.mDWContext.mDWImageAdapter = new q(this.mDWContext.getActivity());
            this.mDWContext.mDWImageLoaderAdapter = new r();
            this.mDWContext.setUserInfoAdapter(new ai());
            this.mDWContext.setUserLoginAdapter(new aj());
        }
    }

    /* loaded from: classes6.dex */
    public static class a extends DWInstance.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-211224667);
        }

        @Override // com.taobao.avplayer.DWInstance.a
        public /* synthetic */ DWInstance b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DWInstance) ipChange.ipc$dispatch("d36b7cae", new Object[]{this}) : c();
        }

        public a(Activity activity) {
            super(activity);
            this.f16413a.aS = "tbdw";
            if (kck.f29959a == null) {
                kck.f29959a = activity.getApplication();
                MediaSystemUtils.sApplication = activity.getApplication();
            }
        }

        public bk c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bk) ipChange.ipc$dispatch("6a79e12c", new Object[]{this});
            }
            a();
            return new bk(this.f16413a);
        }
    }
}
