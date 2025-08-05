package com.taobao.live.home.dinamic.ability.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;

/* loaded from: classes7.dex */
public class a extends com.taobao.taolive.uikit.mtop.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public a(IRemoteBaseListener iRemoteBaseListener) {
        super(iRemoteBaseListener);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        TBLAddFollowRequest tBLAddFollowRequest = new TBLAddFollowRequest();
        tBLAddFollowRequest.accountId = str;
        a(0, tBLAddFollowRequest, null);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        TBLCancelFollowRequest tBLCancelFollowRequest = new TBLCancelFollowRequest();
        tBLCancelFollowRequest.accountId = str;
        a(0, tBLCancelFollowRequest, null);
    }
}
