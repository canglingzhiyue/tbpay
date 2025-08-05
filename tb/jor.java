package tb;

import android.content.Context;
import android.os.AsyncTask;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* loaded from: classes6.dex */
public final class jor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(959507326);
    }

    public static void a(Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564cf206", new Object[]{context, str, jSONObject});
        } else {
            a(context, str, (Object) jSONObject);
        }
    }

    public static void a(Context context, String str, org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ebb59d4", new Object[]{context, str, jSONObject});
        } else {
            a(context, str, (Object) jSONObject);
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [tb.jor$1] */
    private static void a(Context context, final String str, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("840caf86", new Object[]{context, str, obj});
        } else if (context == null || str == null || obj == null || !jqi.a(str, "enableTraceMtop", false)) {
        } else {
            long b = jqe.b(context);
            if (b < jqi.a(str, "minFreeMemoSizeMBTraceMtop", 200)) {
                jpt a2 = jpt.a(str, "doNotTraceMtopOfLowMemory");
                jpr.a(a2.a("可用内存：" + b + "MB").a(1.0f));
                return;
            }
            new AsyncTask() { // from class: tb.jor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.AsyncTask
                public Object doInBackground(Object[] objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr});
                    }
                    try {
                        String str2 = str;
                        UnifyLog.EventType eventType = UnifyLog.EventType.NET;
                        UnifyLog.a(str2, "UltronMtopTracer", "onSuccess", "", "", eventType, "response: " + obj);
                        return null;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            }.execute(new Object[0]);
        }
    }
}
