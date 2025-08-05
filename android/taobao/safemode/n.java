package android.taobao.safemode;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class n extends l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Field f1535a;
    private static Field b;
    private static Field c;
    private static Field d;

    public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
        if (str.hashCode() == 127220639) {
            return super.a((Message) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        Class<?> cls;
        try {
            cls = Class.forName("android.app.ActivityThread$ActivityClientRecord");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            c = a(cls, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            f1535a = a(cls, "referrer");
            b = a(cls, "activityInfo");
            d = a(cls, "state");
        }
    }

    @Override // android.taobao.safemode.l
    public k a(Message message) throws IllegalAccessException {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("7953b9f", new Object[]{this, message});
        }
        if (message.what != 100) {
            return super.a(message);
        }
        Field field = c;
        if (field == null) {
            return null;
        }
        Intent intent = (Intent) a(field, message.obj, null);
        String str3 = (String) a(f1535a, message.obj, null);
        ActivityInfo activityInfo = (ActivityInfo) a(b, message.obj, null);
        if (activityInfo != null) {
            String str4 = activityInfo.processName;
            str2 = activityInfo.packageName;
            str = str4;
        } else {
            str = null;
            str2 = null;
        }
        return new k(str, str2, str3, intent, a(d, message.obj, null) != null);
    }
}
