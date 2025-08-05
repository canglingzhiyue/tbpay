package com.taobao.android.dinamicx;

import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.util.RequestConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliMonitorInterface;
import tb.fpt;

/* loaded from: classes.dex */
public class be implements fpt.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.fpt.b
    public byte[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{this, str});
        }
        RequestImpl requestImpl = new RequestImpl(str);
        requestImpl.setExtProperty(RequestConstant.CHECK_CONTENT_LENGTH, "true");
        Response syncSend = new DegradableNetwork(null).syncSend(requestImpl, null);
        if (syncSend.getStatusCode() == 200 && syncSend.getBytedata() != null && syncSend.getBytedata().length > 0) {
            return syncSend.getBytedata();
        }
        AliMonitorInterface a2 = com.taobao.android.s.a();
        if (a2 != null) {
            a2.a(com.taobao.android.dinamic.e.TAG, "DownloadTemplateError", "templateUrl=" + str + ",errorCode=" + syncSend.getStatusCode(), 1.0d);
        }
        return null;
    }
}
