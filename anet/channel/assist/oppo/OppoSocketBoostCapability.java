package anet.channel.assist.oppo;

import android.content.Context;
import anet.channel.assist.ISocketBoostCapability;
import anet.channel.assist.NetworkAssist;
import anet.channel.assist.WorkExecutor;
import anet.channel.strategy.utils.Utils;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class OppoSocketBoostCapability implements ISocketBoostCapability {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.OppoSocketBoostCapability";
    private final Context mContext = NetworkAssist.getContext();
    private final boolean enable = true;

    public static /* synthetic */ void access$000(OppoSocketBoostCapability oppoSocketBoostCapability, String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb8111f3", new Object[]{oppoSocketBoostCapability, str, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            oppoSocketBoostCapability.doSet(str, i, i2, i3);
        }
    }

    public static /* synthetic */ void access$100(OppoSocketBoostCapability oppoSocketBoostCapability, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aa0a551", new Object[]{oppoSocketBoostCapability, str, new Integer(i), new Integer(i2)});
        } else {
            oppoSocketBoostCapability.doClear(str, i, i2);
        }
    }

    @Override // anet.channel.assist.ICapability
    public boolean isEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue() : this.enable;
    }

    @Override // anet.channel.assist.ISocketBoostCapability
    public void set(final String str, final int i, final int i2, final int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4fe2450", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            WorkExecutor.submitTask(new Runnable() { // from class: anet.channel.assist.oppo.OppoSocketBoostCapability.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        OppoSocketBoostCapability.access$000(OppoSocketBoostCapability.this, str, i, i2, i3);
                    }
                }
            });
        }
    }

    private void doSet(String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f4567b", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (Utils.isIPV6Address(str)) {
        } else {
            ALog.e(TAG, "[set]", null, "result", Integer.valueOf(OppoOlkUnifyApi.setSocketPriority(this.mContext, str, i, i2 == 0, i3 == 0 ? 16 : i3 == 2 ? 1 : 8)));
        }
    }

    @Override // anet.channel.assist.ISocketBoostCapability
    public void clear(final String str, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cf019fe", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else {
            WorkExecutor.submitTask(new Runnable() { // from class: anet.channel.assist.oppo.OppoSocketBoostCapability.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        OppoSocketBoostCapability.access$100(OppoSocketBoostCapability.this, str, i, i2);
                    }
                }
            });
        }
    }

    private void doClear(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98c02d33", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (Utils.isIPV6Address(str)) {
        } else {
            ALog.e(TAG, "[clear]", null, "result", Integer.valueOf(OppoOlkUnifyApi.clearSocketPriority(this.mContext, str, i, i2 == 0)));
        }
    }
}
