package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;

/* loaded from: classes5.dex */
public class iyt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Field f29413a;

    public static boolean a(Context context) {
        try {
            Field[] fieldArr = (Field[]) Class.class.getDeclaredMethod("getDeclaredFields", new Class[0]).invoke(context.getClass(), new Object[0]);
            int length = fieldArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Field field = fieldArr[i];
                if ("mFlags".equals(field.getName())) {
                    f29413a = field;
                    break;
                }
                i++;
            }
        } catch (Throwable unused) {
        }
        if (f29413a == null) {
            return false;
        }
        Field field2 = f29413a;
        field2.setAccessible(true);
        int intValue = ((Integer) field2.get(context)).intValue();
        if ((intValue & 16) == 16) {
            field2.set(context, Integer.valueOf(intValue & (-17)));
            field2.setAccessible(false);
            return true;
        }
        return false;
    }
}
