package tb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.c;
import com.taobao.accs.utl.i;
import com.taobao.accs.utl.n;

/* loaded from: classes4.dex */
public class ddo extends ddm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String JSON_CMD_REGISTER = "register";

    /* renamed from: a  reason: collision with root package name */
    public String f26710a;
    public String b;
    public String c;
    public String d = String.valueOf(Constants.SDK_VERSION_CODE);
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;

    static {
        kge.a(1226545803);
    }

    public byte[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a8212175", new Object[]{this});
        }
        try {
            String jSONObject = new i.a().a("cmd", this.e).a("appKey", this.f26710a).a("utdid", this.b).a("appVersion", this.c).a("sdkVersion", this.d).a("ttid", this.f).a("packageName", this.g).a("notifyEnable", this.h).a("romInfo", this.i).a("c0", this.j).a("c1", this.k).a("c2", this.l).a("c3", this.m).a("c4", this.n).a("c5", this.o).a("c6", this.p).a().toString();
            ALog.i("RegisterDO", "buildData", "data", jSONObject);
            return jSONObject.getBytes("utf-8");
        } catch (Throwable th) {
            ALog.e("RegisterDO", "buildData", th, new Object[0]);
            return null;
        }
    }

    public static byte[] a(Context context, String str, String str2) {
        ddo ddoVar;
        String deviceId;
        String packageName;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("602f45e9", new Object[]{context, str, str2});
        }
        try {
            deviceId = UtilityImpl.getDeviceId(context);
            packageName = context.getPackageName();
            str3 = GlobalClientInfo.getInstance(context).getPackageInfo().versionName;
        } catch (Throwable th) {
            th = th;
            ddoVar = null;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(deviceId) && !TextUtils.isEmpty(str3)) {
            ddoVar = new ddo();
            try {
                ddoVar.e = "register";
                ddoVar.f26710a = str;
                ddoVar.b = deviceId;
                ddoVar.c = str3;
                ddoVar.f = str2;
                ddoVar.g = packageName;
                ddoVar.j = Build.BRAND;
                ddoVar.k = Build.MODEL;
                ddoVar.h = c.f(context);
                UtilityImpl.saveNotificationState(context, Constants.SP_CHANNEL_FILE_NAME, ddoVar.h);
                ddoVar.i = n.b().a();
            } catch (Throwable th2) {
                th = th2;
                try {
                    ALog.w("RegisterDO", "buildRegister", th.getMessage());
                    if (ddoVar == null) {
                        return null;
                    }
                    return ddoVar.a();
                } finally {
                    if (ddoVar != null) {
                        ddoVar.a();
                    }
                }
            }
            return ddoVar.a();
        }
        ALog.e("RegisterDO", "buildRegister param null", "appKey", str, "utdid", deviceId, "appVersion", str3);
        return null;
    }
}
