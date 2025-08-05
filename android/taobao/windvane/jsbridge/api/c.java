package android.taobao.windvane.jsbridge.api;

import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.l;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f1662a;

    static {
        kge.a(-1505869427);
        f1662a = false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f1662a) {
        } else {
            f1662a = true;
            l.b().c();
            q.a("Base", (Class<? extends e>) WVBase.class);
            q.a("WVLocation", (Class<? extends e>) WVLocation.class);
            q.a("WVMotion", (Class<? extends e>) WVMotion.class);
            q.a("WVCookie", (Class<? extends e>) WVCookie.class);
            q.a("WVCamera", (Class<? extends e>) WVCamera.class);
            q.a("WVUI", (Class<? extends e>) WVUI.class);
            q.a("WVNotification", (Class<? extends e>) WVNotification.class);
            q.a("WVNetwork", (Class<? extends e>) WVNetwork.class);
            q.a("WVUIToast", (Class<? extends e>) WVUIToast.class);
            q.a("WVUIDialog", (Class<? extends e>) WVUIDialog.class);
            q.a("WVUIActionSheet", (Class<? extends e>) WVUIActionSheet.class);
            q.a("WVContacts", (Class<? extends e>) WVContacts.class);
            q.a("WVStandardEventCenter", (Class<? extends e>) WVStandardEventCenter.class);
            q.a("WVFile", (Class<? extends e>) WVFile.class);
            q.a("WVScreen", (Class<? extends e>) WVScreen.class);
            q.a("WVNativeDetector", (Class<? extends e>) WVNativeDetector.class, true);
            q.a("WVBluetooth", (Class<? extends e>) WVBluetooth.class, true);
            q.a("WVBluetoothSilence", (Class<? extends e>) WVBluetoothSilence.class, true);
            q.a("WVBroadcast", (Class<? extends e>) WVBroadcastChannel.class, true);
            q.a("Prefetch", (Class<? extends e>) WVPrefetch.class);
            q.a("WVImage", (Class<? extends e>) WVImage.class);
            q.a("WVNativeLog", (Class<? extends e>) WVNativeLog.class);
            android.taobao.windvane.embed.b.a();
        }
    }
}
