package tb;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public class jjs implements jka {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final LruCache<String, Method> f29586a;
    private static final LruCache<String, String> b;
    private static final LruCache<String, Field> c;
    private static final LruCache<String, String> d;

    @Override // tb.jka
    public boolean a(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("310b307", new Object[]{this, obj, cls, str})).booleanValue();
        }
        return true;
    }

    static {
        kge.a(-1724276302);
        kge.a(800696891);
        f29586a = new LruCache<>(64);
        b = new LruCache<>(16);
        c = new LruCache<>(32);
        d = new LruCache<>(16);
    }

    @Override // tb.jka
    public Object b(Object obj, Class<?> cls, String str) {
        String str2 = cls.getName() + MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264 + str;
        Method method = f29586a.get(str2);
        if (method != null) {
            try {
                return method.invoke(obj, new Object[0]);
            } catch (Exception e) {
                jjy.a(e.getMessage());
                return null;
            }
        }
        Field field = c.get(str2);
        if (field != null) {
            try {
                return field.get(obj);
            } catch (Exception e2) {
                jjy.a(e2.getMessage());
                return null;
            }
        }
        if (b.get(str2) != "") {
            try {
                try {
                    Method method2 = cls.getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]);
                    f29586a.put(str2, method2);
                    return method2.invoke(obj, new Object[0]);
                } catch (NoSuchMethodException unused) {
                    Method method3 = cls.getMethod("is" + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]);
                    f29586a.put(str2, method3);
                    return method3.invoke(obj, new Object[0]);
                } catch (Exception e3) {
                    jjy.a(e3.getMessage());
                    return null;
                }
            } catch (NoSuchMethodException unused2) {
                b.put(str2, "");
            } catch (Exception e4) {
                jjy.a(e4.getMessage());
                return null;
            }
        }
        if (d.get(str2) != "") {
            try {
                Field field2 = cls.getField(str);
                c.put(str2, field2);
                return field2.get(obj);
            } catch (NoSuchFieldException unused3) {
                d.put(str2, "");
            } catch (Exception e5) {
                jjy.a(e5.getMessage());
                return null;
            }
        }
        return null;
    }
}
