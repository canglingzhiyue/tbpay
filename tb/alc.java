package tb;

import android.app.ActivityManager;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class alc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f25417a = 0.0f;
    public int b;

    @Deprecated
    public int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{this, new Float(f)})).intValue();
        }
        double d = f;
        int i = (d > 4.0d ? 1 : (d == 4.0d ? 0 : -1));
        if (i > 0) {
            return 10;
        }
        if (i >= 0) {
            return 9;
        }
        if (d >= 3.2d) {
            return 8;
        }
        if (d >= 3.1d) {
            return 7;
        }
        if (d >= 3.0d) {
            return 6;
        }
        return d >= 2.0d ? 3 : 8;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.f25417a != 0.0f || context == null) {
        } else {
            float f = 2.0f;
            try {
                String glEsVersion = ((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().getGlEsVersion();
                if (glEsVersion != null) {
                    f = Float.parseFloat(glEsVersion);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.f25417a = f;
            this.b = a(this.f25417a);
        }
    }
}
