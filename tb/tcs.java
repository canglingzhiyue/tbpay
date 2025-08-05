package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes7.dex */
public class tcs extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BOOTIMAGE_GROUP_NAME = "android_bootimage_coldstart";
    public static final long DX_PARSER_MM_ORANGE = 4698627066052461374L;

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f34031a;

    static {
        kge.a(1152787062);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null) {
            try {
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (objArr.length >= 2) {
                String valueOf = String.valueOf(objArr[0]);
                boolean equals = String.valueOf(objArr[1]).equals("true");
                if (this.f34031a == null) {
                    this.f34031a = dXRuntimeContext.m().getSharedPreferences(BOOTIMAGE_GROUP_NAME, 0);
                }
                z = this.f34031a.getBoolean(valueOf, equals);
                return Boolean.valueOf(z);
            }
        }
        return false;
    }
}
