package tb;

import android.os.Process;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public class qoq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Method f32995a;
    private static boolean b;

    public static JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            int a2 = a(Process.myPid());
            jSONObject.put("currendMemory", (Object) Integer.valueOf(a2));
            if (a2 < 2600000) {
                jSONObject.put("evaluatedStatus", (Object) "good");
            } else if (a2 >= 2600000) {
                jSONObject.put("evaluatedStatus", (Object) "normal");
            } else if (a2 >= 3000000) {
                jSONObject.put("evaluatedStatus", (Object) "dangerous");
            } else if (a2 >= 3200000) {
                jSONObject.put("evaluatedStatus", (Object) "fatal");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static final int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        long[] jArr = {-1};
        a("/proc/" + i + "/status", new String[]{"VmSize:"}, jArr);
        return (int) jArr[0];
    }

    private static void a(String str, String[] strArr, long[] jArr) {
        b();
        Method method = f32995a;
        if (method != null) {
            try {
                method.invoke(null, str, strArr, jArr);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (b) {
        } else {
            try {
                Method declaredMethod = Process.class.getDeclaredMethod("readProcLines", String.class, String[].class, long[].class);
                f32995a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            b = true;
        }
    }
}
