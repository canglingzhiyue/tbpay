package android.taobao.safemode;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: classes.dex */
public class m extends l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Field f1534a;
    private static Field b;
    private static Field c;
    private static Field d;
    private static Field e;

    public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
        if (str.hashCode() == 127220639) {
            return super.a((Message) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        Class<?> cls;
        try {
            f1534a = a(Class.forName("android.app.servertransaction.ClientTransaction"), "mActivityCallbacks");
            cls = Class.forName("android.app.servertransaction.LaunchActivityItem");
            b = a(cls, "mIntent");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            e = a(cls, "mReferrer");
            d = a(cls, "mInfo");
            c = b(cls, "mState");
        }
    }

    @Override // android.taobao.safemode.l
    public k a(Message message) throws IllegalAccessException {
        List list;
        String str;
        String str2;
        if (message.what != 159) {
            return super.a(message);
        }
        Field field = f1534a;
        if (field != null && b != null && (list = (List) field.get(message.obj)) != null && list.size() > 0) {
            for (Object obj : list) {
                if ("android.app.servertransaction.LaunchActivityItem".equals(obj.getClass().getName())) {
                    ActivityInfo activityInfo = (ActivityInfo) a(d, obj, null);
                    if (activityInfo != null) {
                        String str3 = activityInfo.processName;
                        str2 = activityInfo.packageName;
                        str = str3;
                    } else {
                        str = null;
                        str2 = null;
                    }
                    return new k(str, str2, (String) a(e, obj, null), (Intent) a(b, obj, null), a(c, obj, null) != null);
                }
            }
        }
        return null;
    }
}
