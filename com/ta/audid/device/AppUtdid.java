package com.ta.audid.device;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;
import tb.kge;

@Deprecated
/* loaded from: classes4.dex */
public class AppUtdid {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AppUtdid mInstance;

    static {
        kge.a(1413365760);
        mInstance = new AppUtdid();
    }

    private AppUtdid() {
    }

    public static AppUtdid getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppUtdid) ipChange.ipc$dispatch("14b16433", new Object[0]) : mInstance;
    }

    @Deprecated
    public synchronized String getUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this});
        }
        return com.ta.utdid2.device.AppUtdid.getInstance().getUtdidCache();
    }

    @Deprecated
    public synchronized String getUtdid(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f7eefe9", new Object[]{this, context});
        }
        return UTDevice.getUtdid(context);
    }
}
