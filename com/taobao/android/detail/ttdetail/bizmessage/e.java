package com.taobao.android.detail.ttdetail.bizmessage;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.minivideo.MiniVideoType;
import tb.kge;

/* loaded from: classes4.dex */
public class e extends com.taobao.android.detail.ttdetail.communication.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private MiniVideoType f10503a;

    static {
        kge.a(740695839);
    }

    public MiniVideoType a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MiniVideoType) ipChange.ipc$dispatch("b486873d", new Object[]{this}) : this.f10503a;
    }
}
