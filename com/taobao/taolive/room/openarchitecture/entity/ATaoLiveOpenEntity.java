package com.taobao.taolive.room.openarchitecture.entity;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.kge;
import tb.pkg;
import tb.pkj;

/* loaded from: classes8.dex */
public abstract class ATaoLiveOpenEntity extends ATaoliveOpenLiveRoomEntity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String bizCode;
    public String identifer;
    public Object params;
    public pkg taoliveOpenContext;
    public WeakReference<pkj> taoliveServicesWeakReference;

    static {
        kge.a(1537653556);
    }

    public void setTaoliveOpenService(WeakReference<pkj> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80e7c6b8", new Object[]{this, weakReference});
        } else {
            this.taoliveServicesWeakReference = weakReference;
        }
    }
}
