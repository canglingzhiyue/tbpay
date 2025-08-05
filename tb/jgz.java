package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.tao.log.interceptor.RealTimeLogMessageManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class jgz extends AccsAbstractDataListener implements okk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f29547a = new AtomicBoolean(false);

    static {
        kge.a(988045316);
        kge.a(1063884521);
    }

    @Override // tb.okk
    public okj c(oki okiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (okj) ipChange.ipc$dispatch("7e2d86eb", new Object[]{this, okiVar});
        }
        return null;
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // tb.okk
    public void a(oki okiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81369ab", new Object[]{this, okiVar});
            return;
        }
        try {
            GlobalClientInfo.getInstance(okiVar.b).registerListener(okiVar.i, (AccsAbstractDataListener) this);
            this.f29547a.set(true);
        } catch (Exception e) {
            Log.e("RealtimeMessenger", "Init failed", e);
        }
    }

    @Override // tb.okk
    public okj b(oki okiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (okj) ipChange.ipc$dispatch("968bb08c", new Object[]{this, okiVar});
        }
        try {
        } catch (Exception e) {
            Log.e("RealtimeMessenger", "send accs message failure : ", e);
        }
        if (!this.f29547a.get()) {
            return null;
        }
        ACCSClient.getAccsClient(okiVar.j).sendRequest(new ACCSManager.AccsRequest(null, okiVar.i, okiVar.c.getBytes(), null));
        return null;
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
        } else if (!this.f29547a.get()) {
        } else {
            if (bArr == null || bArr.length <= 0) {
                Log.e("RealtimeMessenger", String.format("Receive accs push data is null. dataId:%s", str3));
            } else {
                RealTimeLogMessageManager.a(bArr);
            }
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        } else if (!this.f29547a.get()) {
        } else {
            if (bArr == null) {
                Log.e("RealtimeMessenger", String.format("Receive accs response data is null. dataId:%s, errCode: %d", str2, Integer.valueOf(i)));
            } else {
                RealTimeLogMessageManager.a(bArr);
            }
        }
    }
}
