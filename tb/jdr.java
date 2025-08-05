package tb;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;

/* loaded from: classes6.dex */
public class jdr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Message f29481a = new Message();

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static Field f29482a;

        static {
            try {
                Field declaredField = MessageQueue.class.getDeclaredField("mMessages");
                f29482a = declaredField;
                declaredField.setAccessible(true);
            } catch (Exception unused) {
            }
        }
    }

    public Message a() {
        if (a.f29482a == null) {
            return f29481a;
        }
        Message message = f29481a;
        try {
            return Build.VERSION.SDK_INT >= 23 ? (Message) a.f29482a.get(Looper.getMainLooper().getQueue()) : message;
        } catch (Exception unused) {
            return message;
        }
    }
}
