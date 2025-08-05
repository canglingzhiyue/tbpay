package com.alibaba.android.nextrpc.internal.accs;

import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;

/* loaded from: classes2.dex */
public class AccsReceiveService extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        } else {
            UnifyLog.a("AccsReceiveService", "onBind", "serviceId", str, "errorCode", Integer.valueOf(i));
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        } else {
            UnifyLog.a("AccsReceiveService", "onUnbind", "serviceId", str, "errorCode", Integer.valueOf(i));
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        } else {
            UnifyLog.a("AccsReceiveService", "onSendData", "serviceId", str, "dataId", str2, "errorCode", Integer.valueOf(i));
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        } else {
            UnifyLog.a("AccsReceiveService", "onResponse", "serviceId", str, "dataId", str2, "errorCode", Integer.valueOf(i));
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
            return;
        }
        a.a().a(str, str3, bArr == null ? null : new String(bArr), extraInfo.extHeader.get(TaoBaseService.ExtHeaderType.TYPE_BUSINESS));
        UnifyLog.b("AccsReceiveService", "onData: " + new String(bArr), new Object[0]);
    }

    @Override // com.taobao.accs.base.TaoBaseService, com.taobao.accs.base.AccsDataListener
    public void onConnected(TaoBaseService.ConnectInfo connectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df10c6", new Object[]{this, connectInfo});
        } else {
            UnifyLog.a("AccsReceiveService", "onConnected", "host", connectInfo.host, "isInapp", Boolean.valueOf(connectInfo.isInapp));
        }
    }

    @Override // com.taobao.accs.base.TaoBaseService, com.taobao.accs.base.AccsDataListener
    public void onDisconnected(TaoBaseService.ConnectInfo connectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46188f6", new Object[]{this, connectInfo});
        } else {
            UnifyLog.d("AccsReceiveService", "onDisconnected", "host", connectInfo.host, "isInapp", Boolean.valueOf(connectInfo.isInapp), "errorCode", Integer.valueOf(connectInfo.errorCode), Constants.KEY_ERROR_DETAIL, connectInfo.errordetail);
        }
    }
}
