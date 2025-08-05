package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;

/* loaded from: classes8.dex */
public class oua {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, otz> f32421a;

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Mtop f32422a;
        private otx b;

        static {
            kge.a(-610266838);
            kge.a(-994505382);
        }

        public a(Mtop mtop, otx otxVar) {
            this.f32422a = mtop;
            this.b = otxVar;
        }
    }

    static {
        kge.a(-2045049492);
        f32421a = new ConcurrentHashMap();
    }

    private static otz a(Mtop mtop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (otz) ipChange.ipc$dispatch("e8f605d0", new Object[]{mtop});
        }
        String instanceId = mtop == null ? "OPEN" : mtop.getInstanceId();
        otz otzVar = f32421a.get(instanceId);
        if (otzVar == null) {
            TBSdkLog.e("mtopsdk.RemoteAuth", instanceId + " [getAuth]remoteAuthImpl is null");
        }
        return otzVar;
    }

    public static void a(Mtop mtop, otx otxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510e5e", new Object[]{mtop, otxVar});
        } else if (otxVar == null) {
            TBSdkLog.e("mtopsdk.RemoteAuth", "[authorize] authParam is null");
        } else {
            otz a2 = a(mtop);
            if (a2 == null) {
                if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    return;
                }
                TBSdkLog.i("mtopsdk.RemoteAuth", "didn't set IRemoteAuth implement. remoteAuth=null");
                return;
            }
            oty otyVar = null;
            if (a2 instanceof oty) {
                otyVar = (oty) a2;
            }
            if (otyVar != null ? otyVar.b(otxVar) : a2.b()) {
                return;
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.RemoteAuth", "call authorize. " + otxVar);
            }
            new a(mtop, otxVar);
        }
    }

    public static boolean b(Mtop mtop, otx otxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ff8e1e3", new Object[]{mtop, otxVar})).booleanValue();
        }
        if (otxVar == null) {
            TBSdkLog.e("mtopsdk.RemoteAuth", "[isAuthInfoValid] authParam is null");
            return true;
        }
        otz a2 = a(mtop);
        if (a2 == null) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.RemoteAuth", "didn't set IRemoteAuth implement. remoteAuth=null");
            }
            return true;
        }
        oty otyVar = null;
        if (a2 instanceof oty) {
            otyVar = (oty) a2;
        }
        if (otyVar != null ? otyVar.b(otxVar) : a2.b()) {
            return false;
        }
        return otyVar != null ? otyVar.a(otxVar) : a2.a();
    }

    public static String c(Mtop mtop, otx otxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("552eab40", new Object[]{mtop, otxVar});
        }
        oty otyVar = null;
        if (otxVar == null) {
            TBSdkLog.e("mtopsdk.RemoteAuth", "[getAuthToken] authParam is null");
            return null;
        }
        otz a2 = a(mtop);
        if (a2 == null) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.RemoteAuth", "didn't set IRemoteAuth implement. remoteAuth=null");
            }
            return null;
        }
        if (a2 instanceof oty) {
            otyVar = (oty) a2;
        }
        return otyVar != null ? otyVar.c(otxVar) : a2.c();
    }
}
