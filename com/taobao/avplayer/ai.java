package com.taobao.avplayer;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.login4android.api.Login;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import tb.kck;
import tb.kge;

/* loaded from: classes6.dex */
public class ai implements com.taobao.avplayer.common.af {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1296505565);
        kge.a(63303256);
    }

    @Override // com.taobao.avplayer.common.af
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWUserInfoAdapter);
        try {
            return Login.getUserId();
        } catch (Throwable unused) {
            return Build.ID;
        }
    }

    @Override // com.taobao.avplayer.common.af
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWUserInfoAdapter);
        if (kck.f29959a == null) {
            return "";
        }
        try {
            return UTDevice.getUtdid(kck.f29959a);
        } catch (Throwable unused) {
            return Build.ID;
        }
    }
}
