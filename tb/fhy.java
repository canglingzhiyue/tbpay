package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class fhy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Class<?> f27963a;
    private Method b;

    public String a(String str) {
        String str2;
        if (this.f27963a == null || this.b == null) {
            try {
                this.f27963a = Class.forName("android.os.SystemProperties");
                this.b = this.f27963a.getMethod("get", String.class);
            } catch (Throwable th) {
                th = th;
                str2 = "init fail";
                Log.e("SystemPropertiesProxy", str2, th);
                return null;
            }
        }
        try {
            return (String) this.b.invoke(this.f27963a, str);
        } catch (Throwable th2) {
            th = th2;
            str2 = "invoke fail";
            Log.e("SystemPropertiesProxy", str2, th);
            return null;
        }
    }
}
