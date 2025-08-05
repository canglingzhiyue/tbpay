package com.alibaba.wireless.security.open.middletier;

import com.alibaba.security.wukong.pipe.RiskDataPipeManager;
import com.alibaba.wireless.security.framework.IRouterComponent;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes3.dex */
public class MidBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static IRouterComponent f4297a;
    private static volatile int b;

    static {
        kge.a(-1707737697);
    }

    private static Object a(int i, String str, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("92142f18", new Object[]{new Integer(i), str, new Integer(i2), obj});
        }
        try {
            return f4297a.doCommand(13204, Integer.valueOf(i), str, Integer.valueOf(i2), obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static HashMap<String, Object> adf0mn(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ca5781a1", new Object[]{hashMap});
        }
        try {
            return (HashMap) f4297a.doCommand(71801, hashMap);
        } catch (Exception e) {
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("e", 1);
            if (e instanceof SecException) {
                hashMap2.put(RiskDataPipeManager.PIPE_RESULT_ERROR_CODE_KEY, Integer.valueOf(((SecException) e).getErrorCode()));
            }
            return hashMap2;
        }
    }

    public static int getWvmlfcdmSwitch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("99000a88", new Object[0])).intValue() : b;
    }

    public static void init(ISecurityGuardPlugin iSecurityGuardPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86399bfe", new Object[]{iSecurityGuardPlugin});
            return;
        }
        f4297a = iSecurityGuardPlugin.getRouter();
        Object obj = null;
        try {
            obj = a(0, "wvmlfcdm", 0, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!(obj instanceof Integer)) {
            return;
        }
        b = ((Integer) obj).intValue();
    }
}
