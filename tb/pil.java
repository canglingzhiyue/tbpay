package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.monitor.procedure.s;
import com.taobao.tao.flexbox.layoutmanager.usertracker.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class pil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f32687a;
    private static long b;
    private static long c;

    static {
        kge.a(-1497995858);
        f32687a = pil.class.getSimpleName();
    }

    private pil() {
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
        } else if (context == null) {
            spz.c(f32687a, "【onSubTaskBegin】context is null");
        } else {
            String str3 = f32687a;
            spz.a(str3, "【onSubTaskBegin】context: " + context + ", name: " + str2);
            if (TextUtils.equals(str2, pio.GG_VIDEOTAB_VIDEO_PLAY)) {
                b = System.currentTimeMillis();
            }
            if (context instanceof Activity) {
                s.f18233a.b((Activity) context).a(str2);
                s.f18233a.d().a(str2);
            } else if (context instanceof Application) {
                s.f18233a.d().a(str2);
            }
            a.a().a(str, str2);
        }
    }

    public static void a(Context context, String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742d5b91", new Object[]{context, str, str2, map});
        } else if (context == null) {
            spz.c(f32687a, "【onSubTaskSuccess】context is null");
        } else {
            JSONObject jSONObject = null;
            HashMap hashMap = map != null ? new HashMap(map) : null;
            if (FluidSDK.isDebug()) {
                String str3 = f32687a;
                spz.a(str3, "【onSubTaskSuccess】context: " + context + ", name: " + str2 + ", subProperties: " + JSON.toJSONString(hashMap));
            }
            if (TextUtils.equals(str2, pio.GG_VIDEOTAB_VIDEO_PLAY)) {
                c = System.currentTimeMillis();
            }
            if (context instanceof Activity) {
                s.f18233a.b((Activity) context).e(str2, hashMap);
                s.f18233a.d().e(str2, hashMap);
            } else if (context instanceof Application) {
                s.f18233a.d().e(str2, hashMap);
            }
            a a2 = a.a();
            if (hashMap != null) {
                jSONObject = new JSONObject(hashMap);
            }
            a2.a(str, str2, jSONObject);
        }
    }

    public static void a(Context context, String str, String str2, String str3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c86b987", new Object[]{context, str, str2, str3, map});
        } else if (context == null) {
            spz.c(f32687a, "【onSubTaskFail】context is null");
        } else {
            JSONObject jSONObject = null;
            HashMap hashMap = map != null ? new HashMap(map) : null;
            if (FluidSDK.isDebug()) {
                String str4 = f32687a;
                spz.a(str4, "【onSubTaskFail】context: " + context + ", name: " + str2 + ", subProperties: " + JSON.toJSONString(hashMap));
            }
            if (context instanceof Activity) {
                s.f18233a.b((Activity) context).a(str2, str3, hashMap);
                s.f18233a.d().a(str2, str3, hashMap);
            } else if (context instanceof Application) {
                s.f18233a.d().a(str2, str3, hashMap);
            }
            a a2 = a.a();
            if (hashMap != null) {
                jSONObject = new JSONObject(hashMap);
            }
            a2.a(str, str2, str3, jSONObject);
        }
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : c - b;
    }
}
