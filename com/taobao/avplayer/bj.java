package com.taobao.avplayer;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.l;
import com.taobao.media.MediaSystemUtils;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import tb.kck;
import tb.kge;

/* loaded from: classes6.dex */
public class bj extends l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1759619406);
        ab.a();
        b.f16469a = new i();
    }

    public bj(l.b bVar) {
        super(bVar);
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_TBDWGifInstance);
    }

    @Override // com.taobao.avplayer.l
    public void a(l.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddec2135", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            if (bVar.l == null) {
                this.f16523a.mConfigAdapter = new c();
            }
            if (bVar.m == null) {
                this.f16523a.mConfigParamsAdapter = new e();
            }
            if (bVar.j == null) {
                this.f16523a.mNetworkAdapter = new DWNetworkAdapter();
            }
            if (bVar.k == null) {
                this.f16523a.mUTAdapter = new ak();
            }
            if (bVar.u == null) {
                this.f16523a.mDWAlarmAdapter = new ad();
            }
            this.f16523a.mDWImageAdapter = new q(this.f16523a.getActivity());
        }
    }

    /* loaded from: classes6.dex */
    public static class a extends l.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1585548763);
        }

        public a(Activity activity) {
            super(activity);
            if (kck.f29959a == null) {
                kck.f29959a = activity.getApplication();
                MediaSystemUtils.sApplication = activity.getApplication();
            }
        }

        public bj a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bj) ipChange.ipc$dispatch("88d7d24f", new Object[]{this}) : new bj(this.f16528a);
        }
    }
}
