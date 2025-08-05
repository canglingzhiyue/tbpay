package com.ut.device;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Variables;
import com.ta.utdid2.android.utils.PhoneInfoUtils;
import com.ta.utdid2.device.AppUtdid;
import com.ta.utdid2.device.UTUtdid;
import tb.kge;

/* loaded from: classes.dex */
public class UTDevice {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2067327308);
    }

    @Deprecated
    public static String getAid(String str, String str2, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e66fa6b9", new Object[]{str, str2, context}) : "";
    }

    @Deprecated
    public static void getAidAsync(String str, String str2, Context context, AidCallback aidCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76a5480", new Object[]{str, str2, context, aidCallback});
        }
    }

    @Deprecated
    public static void setAppChannel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15dd135", new Object[]{str});
        }
    }

    @Deprecated
    public static void setAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77945e11", new Object[]{str});
        }
    }

    @Deprecated
    public static void setOldMode(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70891d7b", new Object[]{context, new Boolean(z)});
        }
    }

    public static String getUtdid(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f7eefe9", new Object[]{context}) : com.ta.utdid2.device.UTDevice.getUtdid(context);
    }

    public static void setPrivacyMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854b8544", new Object[]{new Boolean(z)});
        } else {
            PhoneInfoUtils.setPrivacyMode(z);
        }
    }

    public static void setExtendFactor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c2e6dc", new Object[]{str});
        } else {
            UTUtdid.setExtendFactor(str);
        }
    }

    @Deprecated
    public static int getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5378242a", new Object[0])).intValue() : com.ta.utdid2.device.UTDevice.getType();
    }

    @Deprecated
    public static String getUtdidForUpdate(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bdabf5e7", new Object[]{context}) : getUtdid(context);
    }

    @Deprecated
    public static void setDebug(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe02abc", new Object[]{new Boolean(z)});
        } else {
            Variables.getInstance().setDebug(z);
        }
    }

    @Deprecated
    public static void setCollectDelayTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("510eb2b5", new Object[]{new Long(j)});
        } else {
            AppUtdid.setCollectDelayTime(j);
        }
    }
}
