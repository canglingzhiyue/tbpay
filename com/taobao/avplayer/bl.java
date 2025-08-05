package com.taobao.avplayer;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.component.weex.WXSplayerModule;
import com.taobao.avplayer.n;
import com.taobao.media.MediaSystemUtils;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import tb.kbf;
import tb.kck;
import tb.kge;

/* loaded from: classes6.dex */
public class bl extends n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1983461214);
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
        if (b.d == null) {
            b.d = new c();
        }
    }

    public bl(n.c cVar) {
        super(cVar);
    }

    @Override // com.taobao.avplayer.n
    public void a(n.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15646d2", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            if (cVar.u == null) {
                this.f16536a.mConfigAdapter = b.d;
            }
            if (cVar.v == null) {
                this.f16536a.mConfigParamsAdapter = new e();
            }
            if (cVar.s == null) {
                this.f16536a.mNetworkAdapter = new DWNetworkAdapter();
            }
            if (cVar.t == null) {
                this.f16536a.mUTAdapter = new ak();
            }
            if (cVar.D == null) {
                this.f16536a.mNetworkFlowAdapter = new w();
            }
            if (cVar.w == null) {
                this.f16536a.mDWAlarmAdapter = new ad();
            }
            if (cVar.Q == null) {
                MediaPlayControlContext mediaPlayControlContext = this.f16536a.mPlayContext;
                DWContext dWContext = this.f16536a;
                ah ahVar = new ah();
                dWContext.mTlogAdapter = ahVar;
                mediaPlayControlContext.mTLogAdapter = ahVar;
            }
            this.f16536a.mNetworkUtilsAdapter = new kbf();
            this.f16536a.mDWImageAdapter = new q(this.f16536a.getActivity());
            this.f16536a.mDWImageLoaderAdapter = new r();
            this.f16536a.setUserInfoAdapter(new ai());
            this.f16536a.setUserLoginAdapter(new aj());
        }
    }

    /* loaded from: classes6.dex */
    public static class a extends n.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1468509237);
        }

        @Override // com.taobao.avplayer.n.b
        public /* synthetic */ n b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("3ecad72", new Object[]{this}) : c();
        }

        public a(Activity activity) {
            super(activity);
            if (kck.f29959a == null) {
                kck.f29959a = activity.getApplication();
                MediaSystemUtils.sApplication = activity.getApplication();
            }
            this.f16539a.ae = "tbhp";
        }

        public a(Context context) {
            super(context);
            if (kck.f29959a == null && (context instanceof Activity)) {
                Activity activity = (Activity) context;
                kck.f29959a = activity.getApplication();
                MediaSystemUtils.sApplication = activity.getApplication();
            }
            this.f16539a.ae = "tbhp";
        }

        public bl c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bl) ipChange.ipc$dispatch("6a79e14b", new Object[]{this});
            }
            a();
            return new bl(this.f16539a);
        }
    }
}
