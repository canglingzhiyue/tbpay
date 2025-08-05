package anet.channel.assist.oppo;

import android.content.Context;
import anet.channel.assist.ISysNetworkCapability;
import anet.channel.assist.NetworkAssist;
import anet.channel.assist.WorkExecutor;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class OppoSysNetworkCapability implements ISysNetworkCapability {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.OppoSysNetworkCapability";
    private final Context mContext = NetworkAssist.getContext();
    private final boolean enable = true;

    public static /* synthetic */ Context access$000(OppoSysNetworkCapability oppoSysNetworkCapability) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("b4364b01", new Object[]{oppoSysNetworkCapability}) : oppoSysNetworkCapability.mContext;
    }

    @Override // anet.channel.assist.ICapability
    public boolean isEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue() : this.enable;
    }

    @Override // anet.channel.assist.ISysNetworkCapability
    public void syncAppState(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c47762", new Object[]{this, new Boolean(z)});
        } else {
            WorkExecutor.submitTask(new Runnable() { // from class: anet.channel.assist.oppo.OppoSysNetworkCapability.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ALog.e(OppoSysNetworkCapability.TAG, "[syncAppState]", null, "result", Integer.valueOf(OppoOlkUnifyApi.setApState(OppoSysNetworkCapability.access$000(OppoSysNetworkCapability.this), z)));
                    }
                }
            });
        }
    }

    @Override // anet.channel.assist.ISysNetworkCapability
    public void recoverCellularStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5245d07", new Object[]{this});
        } else {
            WorkExecutor.submitTask(new Runnable() { // from class: anet.channel.assist.oppo.OppoSysNetworkCapability.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ALog.e(OppoSysNetworkCapability.TAG, "[recoverCellularStatus]", null, "result", Integer.valueOf(OppoOlkUnifyApi.updateCellularEnable(OppoSysNetworkCapability.access$000(OppoSysNetworkCapability.this), true)));
                    }
                }
            });
        }
    }
}
