package com.taobao.android.diagnose.message;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.android.diagnose.c;
import com.taobao.android.diagnose.e;
import com.taobao.android.diagnose.model.AppInfo;
import com.taobao.android.diagnose.v;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class DiagnoseAccsMessenger extends AccsAbstractDataListener implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DiagnoseAccsMessenger";
    private String accsServiceId = "ha-scene-diagnose";
    private String accsTag = "default";
    private AppInfo appInfo = null;
    private AtomicBoolean isInit = new AtomicBoolean(false);

    static {
        kge.a(-1552080419);
        kge.a(1053171984);
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.android.diagnose.message.b
    public void init(Context context, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b9c909", new Object[]{this, context, eVar});
            return;
        }
        if (eVar != null) {
            try {
                this.appInfo = c.a().d().i();
                this.accsServiceId = eVar.c;
                this.accsTag = eVar.d;
            } catch (Exception e) {
                v.a(TAG, "init", e);
                return;
            }
        }
        v.a(TAG, "init!!");
        GlobalClientInfo.getInstance(context).registerListener(this.accsServiceId, (AccsAbstractDataListener) this);
        this.isInit.set(true);
    }

    public void sendMessage(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f0536c", new Object[]{this, context, str});
            return;
        }
        try {
            if (!this.isInit.get()) {
                return;
            }
            ACCSClient.getAccsClient(this.accsTag).sendRequest(new ACCSManager.AccsRequest(this.appInfo.uid, this.accsServiceId, str.getBytes(), null));
        } catch (Exception e) {
            v.a(TAG, "send accs message failure : ", e);
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
        } else if (!this.isInit.get()) {
        } else {
            if (bArr == null || bArr.length <= 0) {
                v.d(TAG, String.format("Receive accs push data is null. dataId:%s", str3));
            } else {
                a.a(bArr);
            }
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        } else if (!this.isInit.get()) {
        } else {
            if (bArr == null) {
                v.d(TAG, String.format("Receive accs response data is null. dataId:%s, errCode: %d", str2, Integer.valueOf(i)));
            } else {
                a.a(bArr);
            }
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
            return;
        }
        v.a(TAG, "Send data to accs. dataID: " + str2);
    }
}
