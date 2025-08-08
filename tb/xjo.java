package tb;

import android.os.Message;
import android.os.MessageQueue;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.h;
import java.lang.reflect.Field;

/* loaded from: classes5.dex */
public class xjo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Field f34339a = a(Message.class, "callback");
    private static final Field b = a(MessageQueue.class, "mMessages");
    private static final Field c = a(Message.class, "next");
    public static final boolean sAvailable;

    static {
        sAvailable = (b == null || c == null) ? false : true;
    }

    public static Message a(Message message, String str) {
        Runnable callback;
        if (f34339a == null || (callback = message.getCallback()) == null) {
            return message;
        }
        try {
            f34339a.set(message, xjm.a(str, callback));
        } catch (IllegalAccessException e) {
            h.a("MessageExtension", "decorateCallback failed due to", e);
        }
        return message;
    }

    public static Message a(Message message) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("bfde3c0e", new Object[]{message}) : (Message) a(c, message, null);
    }

    public static Message a(MessageQueue messageQueue) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("5997f205", new Object[]{messageQueue}) : (Message) a(b, messageQueue, null);
    }

    private static Field a(Class<?> cls, String str) {
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
        } catch (Throwable unused) {
            return null;
        }
    }

    private static <T> T a(Field field, Object obj, T t) {
        if (obj == null || field == null) {
            return t;
        }
        try {
            return (T) field.get(obj);
        } catch (Throwable unused) {
            return t;
        }
    }
}
