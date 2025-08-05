package org.android.netutil;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class NetUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static native long native_CreateAndRegister(long j, NetListener netListener);

    private static native String native_GetDefaultGateway(String str);

    private static native void native_UnRegister(long j);

    public static boolean registerNetListener(NetListener netListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1686f83a", new Object[]{netListener})).booleanValue();
        }
        if (netListener != null) {
            netListener.native_ptr = native_CreateAndRegister(netListener.netListenerType.getValue(), netListener);
            if (netListener.native_ptr != 0) {
                return true;
            }
        }
        return false;
    }

    public static void unRegisterNetListener(NetListener netListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db40bef", new Object[]{netListener});
        } else if (netListener == null || netListener.native_ptr == 0) {
        } else {
            native_UnRegister(netListener.native_ptr);
        }
    }

    public static String getDefaultGateway(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d5918656", new Object[]{str}) : native_GetDefaultGateway(str);
    }

    public static String getPreferNextHop(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("910b77bf", new Object[]{str}) : getPreferNextHop(str, 1);
    }

    public static String getPreferNextHop(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1e268be", new Object[]{str, new Integer(i)});
        }
        Future<PingResponse> launch = new PingTask(str, 0, 1, 0, i).launch();
        if (launch == null) {
            return null;
        }
        try {
            PingResponse pingResponse = launch.get();
            if (pingResponse == null) {
                return null;
            }
            return pingResponse.b();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
