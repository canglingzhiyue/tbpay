package tb;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.alipay.security.mobile.module.http.UploadFactory;
import com.alipay.security.mobile.module.http.model.DeviceDataReponseModel;
import com.alipay.security.mobile.module.http.model.DeviceDataRequestModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/* loaded from: classes3.dex */
public final class cju {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f26323a;
    private ckm b = ckm.a();
    private int c = 4;

    public cju(Context context) {
        this.f26323a = context;
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        String b = b(context);
        return cjw.a(b) ? clb.f(context) : b;
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        try {
            String a2 = clc.a(str);
            if (!cjw.a(a2)) {
                return a2;
            }
            String a3 = cla.a(context, str);
            clc.a(str, a3);
            return !cjw.a(a3) ? a3 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] strArr = {"2017-01-27 2017-01-28", "2017-11-10 2017-11-11", "2017-12-11 2017-12-12"};
        int random = (int) (Math.random() * 24.0d * 60.0d * 60.0d);
        for (int i = 0; i < 3; i++) {
            try {
                String[] split = strArr[i].split(" ");
                if (split != null && split.length == 2) {
                    Date date = new Date();
                    Date parse = simpleDateFormat.parse(split[0] + " 00:00:00");
                    Date parse2 = simpleDateFormat.parse(split[1] + " 23:59:59");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(parse2);
                    calendar.add(13, random);
                    Date time = calendar.getTime();
                    if (date.after(parse) && date.before(time)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private DeviceDataReponseModel b(Map<String, String> map) {
        String str;
        String str2;
        ckv c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceDataReponseModel) ipChange.ipc$dispatch("42483dd3", new Object[]{this, map});
        }
        try {
            Context context = this.f26323a;
            DeviceDataRequestModel deviceDataRequestModel = new DeviceDataRequestModel();
            String a2 = cjw.a(map, "appName", "");
            String a3 = cjw.a(map, "sessionId", "");
            String a4 = cjw.a(map, TransportConstants.KEY_RPC_VERSION, "");
            String a5 = a(context, a2);
            String securityToken = UmidSdkWrapper.getSecurityToken(context);
            String d = clb.d(context);
            if (cjw.b(a3)) {
                deviceDataRequestModel.token = a3;
            } else {
                deviceDataRequestModel.token = a5;
            }
            deviceDataRequestModel.umidToken = securityToken;
            deviceDataRequestModel.dynamicKey = d;
            deviceDataRequestModel.os = "android";
            ckw c2 = ckx.c(context);
            if (c2 != null) {
                str2 = c2.f26340a;
                str = c2.c;
            } else {
                str = "";
                str2 = str;
            }
            if (cjw.a(str2) && (c = cku.c(context)) != null) {
                str2 = c.f26339a;
                str = c.c;
            }
            deviceDataRequestModel.priApdid = str2;
            deviceDataRequestModel.pubApdid = "";
            deviceDataRequestModel.rpcVersion = a4;
            if (cjw.a(str2)) {
                deviceDataRequestModel.apdid = "";
                deviceDataRequestModel.lastTimeApdidGenerated = "";
            } else {
                deviceDataRequestModel.apdid = str2;
                deviceDataRequestModel.lastTimeApdidGenerated = str;
            }
            deviceDataRequestModel.dataMap = ckt.a(context, map);
            return UploadFactory.createV2(this.f26323a, this.b.b()).updateStaticData(deviceDataRequestModel);
        } catch (Throwable th) {
            th.printStackTrace();
            ckn.a(th);
            return null;
        }
    }

    private static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        try {
            String b = clc.b();
            if (!cjw.a(b)) {
                return b;
            }
            ckw b2 = ckx.b(context);
            if (b2 != null) {
                clc.a(b2);
                String str = b2.f26340a;
                if (cjw.b(str)) {
                    return str;
                }
            }
            ckv b3 = cku.b(context);
            if (b3 == null) {
                return "";
            }
            clc.a(b3);
            String str2 = b3.f26339a;
            return cjw.b(str2) ? str2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b A[Catch: Exception -> 0x0282, TryCatch #0 {Exception -> 0x0282, blocks: (B:6:0x0024, B:8:0x0055, B:17:0x007b, B:46:0x00f9, B:49:0x0100, B:79:0x021e, B:81:0x0239, B:83:0x023f, B:85:0x0245, B:89:0x024e, B:91:0x0254, B:52:0x0115, B:54:0x012b, B:59:0x0136, B:60:0x0146, B:62:0x014d, B:66:0x015f, B:68:0x01b4, B:70:0x01be, B:72:0x01c6, B:74:0x01d3, B:76:0x01dd, B:78:0x01e5, B:77:0x01e1, B:71:0x01c2, B:20:0x0090, B:22:0x009e, B:25:0x00a9, B:27:0x00af, B:30:0x00ba, B:33:0x00c3, B:36:0x00d0, B:11:0x006b, B:39:0x00dd, B:42:0x00eb), top: B:97:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115 A[Catch: Exception -> 0x0282, TryCatch #0 {Exception -> 0x0282, blocks: (B:6:0x0024, B:8:0x0055, B:17:0x007b, B:46:0x00f9, B:49:0x0100, B:79:0x021e, B:81:0x0239, B:83:0x023f, B:85:0x0245, B:89:0x024e, B:91:0x0254, B:52:0x0115, B:54:0x012b, B:59:0x0136, B:60:0x0146, B:62:0x014d, B:66:0x015f, B:68:0x01b4, B:70:0x01be, B:72:0x01c6, B:74:0x01d3, B:76:0x01dd, B:78:0x01e5, B:77:0x01e1, B:71:0x01c2, B:20:0x0090, B:22:0x009e, B:25:0x00a9, B:27:0x00af, B:30:0x00ba, B:33:0x00c3, B:36:0x00d0, B:11:0x006b, B:39:0x00dd, B:42:0x00eb), top: B:97:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0239 A[Catch: Exception -> 0x0282, TryCatch #0 {Exception -> 0x0282, blocks: (B:6:0x0024, B:8:0x0055, B:17:0x007b, B:46:0x00f9, B:49:0x0100, B:79:0x021e, B:81:0x0239, B:83:0x023f, B:85:0x0245, B:89:0x024e, B:91:0x0254, B:52:0x0115, B:54:0x012b, B:59:0x0136, B:60:0x0146, B:62:0x014d, B:66:0x015f, B:68:0x01b4, B:70:0x01be, B:72:0x01c6, B:74:0x01d3, B:76:0x01dd, B:78:0x01e5, B:77:0x01e1, B:71:0x01c2, B:20:0x0090, B:22:0x009e, B:25:0x00a9, B:27:0x00af, B:30:0x00ba, B:33:0x00c3, B:36:0x00d0, B:11:0x006b, B:39:0x00dd, B:42:0x00eb), top: B:97:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023f A[Catch: Exception -> 0x0282, TryCatch #0 {Exception -> 0x0282, blocks: (B:6:0x0024, B:8:0x0055, B:17:0x007b, B:46:0x00f9, B:49:0x0100, B:79:0x021e, B:81:0x0239, B:83:0x023f, B:85:0x0245, B:89:0x024e, B:91:0x0254, B:52:0x0115, B:54:0x012b, B:59:0x0136, B:60:0x0146, B:62:0x014d, B:66:0x015f, B:68:0x01b4, B:70:0x01be, B:72:0x01c6, B:74:0x01d3, B:76:0x01dd, B:78:0x01e5, B:77:0x01e1, B:71:0x01c2, B:20:0x0090, B:22:0x009e, B:25:0x00a9, B:27:0x00af, B:30:0x00ba, B:33:0x00c3, B:36:0x00d0, B:11:0x006b, B:39:0x00dd, B:42:0x00eb), top: B:97:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x024e A[Catch: Exception -> 0x0282, TryCatch #0 {Exception -> 0x0282, blocks: (B:6:0x0024, B:8:0x0055, B:17:0x007b, B:46:0x00f9, B:49:0x0100, B:79:0x021e, B:81:0x0239, B:83:0x023f, B:85:0x0245, B:89:0x024e, B:91:0x0254, B:52:0x0115, B:54:0x012b, B:59:0x0136, B:60:0x0146, B:62:0x014d, B:66:0x015f, B:68:0x01b4, B:70:0x01be, B:72:0x01c6, B:74:0x01d3, B:76:0x01dd, B:78:0x01e5, B:77:0x01e1, B:71:0x01c2, B:20:0x0090, B:22:0x009e, B:25:0x00a9, B:27:0x00af, B:30:0x00ba, B:33:0x00c3, B:36:0x00d0, B:11:0x006b, B:39:0x00dd, B:42:0x00eb), top: B:97:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cju.a(java.util.Map):int");
    }
}
