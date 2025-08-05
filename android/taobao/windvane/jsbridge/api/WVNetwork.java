package android.taobao.windvane.jsbridge.api;

import android.net.wifi.ScanResult;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class WVNetwork extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NETWORK_TYPE_IWLAN = 18;
    public static final int NETWORK_TYPE_LTE_CA = 19;
    public static final int NETWORK_TYPE_TD_SCDMA = 17;
    private final int NETWORK_TYPE_GPRS = 1;
    private final int NETWORK_TYPE_EDGE = 2;
    private final int NETWORK_TYPE_UMTS = 3;
    private final int NETWORK_TYPE_CDMA = 4;
    private final int NETWORK_TYPE_EVDO_0 = 5;
    private final int NETWORK_TYPE_EVDO_A = 6;
    private final int NETWORK_TYPE_1xRTT = 7;
    private final int NETWORK_TYPE_HSDPA = 8;
    private final int NETWORK_TYPE_HSUPA = 9;
    private final int NETWORK_TYPE_HSPA = 10;
    private final int NETWORK_TYPE_IDEN = 11;
    private final int NETWORK_TYPE_EVDO_B = 12;
    private final int NETWORK_TYPE_LTE = 13;
    private final int NETWORK_TYPE_EHRPD = 14;
    private final int NETWORK_TYPE_HSPAP = 15;
    private final int NETWORK_TYPE_GSM = 16;
    private final int NETWORK_TYPE_NR = 20;

    static {
        kge.a(-921357279);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"getNetworkType".equals(str)) {
            return false;
        }
        getNetworkType(str2, wVCallBackContext);
        return true;
    }

    public StringBuffer lookUpScan(List<ScanResult> list) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (StringBuffer) ipChange.ipc$dispatch("a95f9671", new Object[]{this, list});
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (i < list.size()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Index_");
            int i2 = i + 1;
            sb.append(new Integer(i2).toString());
            sb.append(":");
            stringBuffer.append(sb.toString());
            stringBuffer.append(list.get(i).SSID.toString());
            stringBuffer.append("\n");
            i = i2;
        }
        return stringBuffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void getNetworkType(java.lang.String r14, android.taobao.windvane.jsbridge.WVCallBackContext r15) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.jsbridge.api.WVNetwork.getNetworkType(java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):void");
    }
}
