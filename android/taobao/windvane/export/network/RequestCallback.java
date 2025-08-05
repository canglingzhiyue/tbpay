package android.taobao.windvane.export.network;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class RequestCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public @interface CustomCallbackType {
        public static final int ON_REPORT_HIT_LOCAL_SNAPSHOT = 1;
        public static final int ON_REPORT_SNAPSHOT_HIT_TYPE = 0;
    }

    static {
        kge.a(-1170320036);
    }

    public void onCustomCallback(int i, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c344bdea", new Object[]{this, new Integer(i), objArr});
        }
    }

    public void onError(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str});
        }
    }

    public void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
        }
    }

    public void onNetworkResponse(int i, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d71559", new Object[]{this, new Integer(i), map});
        }
    }

    public void onReceiveData(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f24c16dc", new Object[]{this, bArr});
        }
    }

    public void onResponse(int i, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb214fe9", new Object[]{this, new Integer(i), map});
        }
    }
}
