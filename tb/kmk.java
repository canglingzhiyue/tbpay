package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kml;

/* loaded from: classes7.dex */
public class kmk implements kml {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.kml
    public void onDownloadError(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
        }
    }

    @Override // tb.kml
    public void onDownloadFinish(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
        }
    }

    @Override // tb.kml
    public void onDownloadProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.kml
    public void onDownloadStateChange(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
        }
    }

    @Override // tb.kml
    public void onFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.kml
    public void onNetworkLimit(int i, kmq kmqVar, kml.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar});
        }
    }
}
