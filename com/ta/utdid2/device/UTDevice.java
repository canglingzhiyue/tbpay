package com.ta.utdid2.device;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Constants;
import com.ta.audid.Variables;
import tb.kge;

@Deprecated
/* loaded from: classes.dex */
public class UTDevice {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-292401435);
    }

    @Deprecated
    public static String getUtdid(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f7eefe9", new Object[]{context});
        }
        if (context == null) {
            return Constants.UTDID_INVALID;
        }
        Variables.getInstance().initContext(context);
        Variables.getInstance().init();
        return AppUtdid.getInstance().getUtdid(context);
    }

    @Deprecated
    public static String getUtdidForUpdate(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bdabf5e7", new Object[]{context}) : getUtdid(context);
    }

    public static int getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5378242a", new Object[0])).intValue() : UTUtdid.getType();
    }
}
