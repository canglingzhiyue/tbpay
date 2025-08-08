package android.taobao.safemode;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Field f1532a = a(MessageQueue.class, "mMessages");
    private static final Field b = a(Message.class, "next");

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final l f1533a = l.a();
    }

    public static l a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("d73da02b", new Object[0]);
        }
        if (Build.VERSION.SDK_INT < 28) {
            return new n();
        }
        return new m();
    }

    public k a(Message message) throws IllegalAccessException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("7953b9f", new Object[]{this, message});
        }
        if (message.what != 121 && message.what != 114 && message.what != 115 && message.what != 113) {
            return null;
        }
        try {
            return new k(message.obj.toString());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static k b() {
        try {
            for (Message message = (Message) f1532a.get(Looper.myQueue()); message != null; message = (Message) b.get(message)) {
                k a2 = a.f1533a.a(message);
                if ((a2 == null || !a2.f1531a) && a2 == null) {
                }
                return a2;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field a(Class cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("4bb5245c", new Object[]{cls, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public static <T> T a(Field field, Object obj, T t) {
        if (field == null) {
            return t;
        }
        try {
            return (T) field.get(obj);
        } catch (IllegalAccessException unused) {
            return t;
        }
    }

    public static Field b(Class<?> cls, String str) {
        Field field = null;
        if (cls != null) {
            if (!StringUtils.isEmpty(str)) {
                field = Build.VERSION.SDK_INT >= 28 ? (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str) : cls.getDeclaredField(str);
                if (field != null) {
                    field.setAccessible(true);
                }
            }
        }
        return field;
    }
}
