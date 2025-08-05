package com.taobao.android.detail.alicom.mtop;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class RemoteBusinessListener implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(383902048);
        kge.a(-525336021);
    }

    public abstract void onFail(int i, MtopResponse mtopResponse, Object obj);

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            onFail(i, mtopResponse, obj);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            onFail(i, mtopResponse, obj);
        }
    }
}
