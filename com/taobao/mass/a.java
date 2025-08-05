package com.taobao.mass;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.i;
import com.taobao.accs.utl.l;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.login4android.activity.LoginProxyActivity;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f18005a;

    static {
        kge.a(-2122663354);
        f18005a = a.class.getSimpleName();
    }

    public static byte[] a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b8a4aa5f", new Object[]{context, str, str2, str3});
        }
        byte[] bArr = null;
        try {
            JSONObject a2 = new i.a().a("deviceId", l.s(context) ? l.q(context) : UTDevice.getUtdid(context)).a("appKey", str).a(FluidException.SERVICE_NAME, str2).a(LoginProxyActivity.ACTION_TYPE_OPERATION, str3).a("version", "1.0").a("appVersion", context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName).a();
            JSONArray jSONArray = new JSONArray();
            for (String str4 : MassClient.getInstance().getTopicsByService(str2)) {
                jSONArray.put(str4);
            }
            a2.put("topic", jSONArray);
            bArr = a2.toString().getBytes("utf-8");
            ALog.i(f18005a, "buildMassData", "data", a2.toString());
            return bArr;
        } catch (Throwable th) {
            ALog.e(f18005a, "buildMassData", th, new Object[0]);
            return bArr;
        }
    }
}
