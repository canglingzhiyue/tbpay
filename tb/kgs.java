package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.b;
import com.taobao.mrt.service.a;
import com.taobao.mrt.task.MRTRuntimeException;
import java.util.ArrayList;
import tb.kml;

/* loaded from: classes7.dex */
public class kgs implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.mrt.service.a
    public int a(String str, String str2, final a.InterfaceC0727a interfaceC0727a) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a6eddaad", new Object[]{this, str, str2, interfaceC0727a})).intValue() : b.a().a(a(str, str2, null, null), new kml() { // from class: tb.kgs.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.kml
            public void onDownloadProgress(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                }
            }

            @Override // tb.kml
            public void onDownloadStateChange(String str3, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("98fdb789", new Object[]{this, str3, new Boolean(z)});
                }
            }

            @Override // tb.kml
            public void onFinish(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                }
            }

            @Override // tb.kml
            public void onNetworkLimit(int i, kmq kmqVar, kml.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar});
                }
            }

            @Override // tb.kml
            public void onDownloadError(String str3, int i, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cc722e3b", new Object[]{this, str3, new Integer(i), str4});
                    return;
                }
                a.InterfaceC0727a interfaceC0727a2 = interfaceC0727a;
                if (interfaceC0727a2 == null) {
                    return;
                }
                interfaceC0727a2.a(false, new MRTRuntimeException(i, str4), null);
            }

            @Override // tb.kml
            public void onDownloadFinish(String str3, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("43d7a315", new Object[]{this, str3, str4});
                    return;
                }
                a.InterfaceC0727a interfaceC0727a2 = interfaceC0727a;
                if (interfaceC0727a2 == null) {
                    return;
                }
                interfaceC0727a2.a(true, null, str4);
            }
        });
    }

    private kmm a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmm) ipChange.ipc$dispatch("249eaa0b", new Object[]{this, str, str2, str3, str4});
        }
        kmm kmmVar = new kmm();
        kmmVar.f30166a = new ArrayList();
        kmo kmoVar = new kmo();
        kmoVar.f30167a = str;
        kmoVar.c = str2;
        kmoVar.d = str4;
        kmmVar.f30166a.add(kmoVar);
        kmq kmqVar = new kmq();
        kmqVar.h = str3;
        kmqVar.i = 0;
        kmqVar.d = 7;
        kmqVar.f30169a = "mrt";
        kmmVar.b = kmqVar;
        kmmVar.b.m = false;
        return kmmVar;
    }
}
