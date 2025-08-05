package anet.channel.assist.oppo;

import android.content.Context;
import anet.channel.assist.IDualWifiCapability;
import anet.channel.assist.NetworkAssist;
import anet.channel.assist.WorkExecutor;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class OppoDualWifiCapability implements IDualWifiCapability {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.OppoDualWifiCapability";
    private final Context mContext = NetworkAssist.getContext();
    private final boolean enable = true;

    public static /* synthetic */ Context access$000(OppoDualWifiCapability oppoDualWifiCapability) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("d8243071", new Object[]{oppoDualWifiCapability}) : oppoDualWifiCapability.mContext;
    }

    @Override // anet.channel.assist.ICapability
    public boolean isEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue() : this.enable;
    }

    @Override // anet.channel.assist.IDualWifiCapability
    public boolean checkStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("567722a5", new Object[]{this})).booleanValue();
        }
        boolean dualStaEnable = OppoOlkUnifyApi.getDualStaEnable(this.mContext);
        ALog.e(TAG, "[checkStatus]", null, "result", Boolean.valueOf(dualStaEnable));
        return dualStaEnable;
    }

    @Override // anet.channel.assist.IDualWifiCapability
    public void request() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("447a9796", new Object[]{this});
        } else {
            WorkExecutor.submitTask(new Runnable() { // from class: anet.channel.assist.oppo.OppoDualWifiCapability.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!OppoDualWifiCapability.this.checkStatus()) {
                    } else {
                        ALog.e(OppoDualWifiCapability.TAG, "[request]", null, "result", Integer.valueOf(OppoOlkUnifyApi.requestDualSta(OppoDualWifiCapability.access$000(OppoDualWifiCapability.this))));
                    }
                }
            });
        }
    }

    @Override // anet.channel.assist.IDualWifiCapability
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            WorkExecutor.submitTask(new Runnable() { // from class: anet.channel.assist.oppo.OppoDualWifiCapability.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!OppoDualWifiCapability.this.checkStatus()) {
                    } else {
                        ALog.e(OppoDualWifiCapability.TAG, "[release]", null, "result", Integer.valueOf(OppoOlkUnifyApi.releaseDualSta(OppoDualWifiCapability.access$000(OppoDualWifiCapability.this))));
                    }
                }
            });
        }
    }
}
