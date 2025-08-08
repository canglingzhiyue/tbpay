package com.taobao.bootimage.interact.pop;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.h;
import tb.kdz;
import tb.kej;
import tb.kge;
import tb.lsk;

/* loaded from: classes6.dex */
public class a implements kdz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(485511440);
        kge.a(-252000924);
    }

    @Override // tb.kdz
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "popView";
    }

    @Override // tb.kdz
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            String b = h.a(lsk.BIZ_NAME).d().b();
            if (StringUtils.isEmpty(b)) {
                kej.a("BootImage.Poplayer.BootImageInteractPopImpl", "onInteractSuccess, return, StringUtils.isEmpty(popIndexId), popIndexId = " + b);
                return;
            }
            String a2 = d.a(b);
            kej.a("BootImage.Poplayer.BootImageInteractPopImpl", "onInteractSuccess, finish, PopNativeApi.notifyPopToChangeImg popIndex= " + b + "result= " + a2);
        } catch (Throwable th) {
            kej.a("BootImage.Poplayer.BootImageInteractPopImpl", "onInteractSuccess, finish, PopNativeApi.notifyPopToChangeImg error= " + th.getMessage());
            th.printStackTrace();
        }
    }
}
