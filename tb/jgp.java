package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes6.dex */
public class jgp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Object f29540a;
    private final Class b;

    public static jgp a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jgp) ipChange.ipc$dispatch("16bcaf4f", new Object[]{obj});
        }
        if (obj == null) {
            throw new NullPointerException();
        }
        if (obj instanceof Class) {
            return new jgp(null, (Class) obj);
        }
        return new jgp(obj, obj.getClass());
    }

    private jgp(Object obj, Class cls) {
        this.f29540a = obj;
        this.b = cls;
    }

    public <T> T a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : (T) this.f29540a;
    }

    public jgp a(String str) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jgp) ipChange.ipc$dispatch("7c710da1", new Object[]{this, str});
        }
        try {
            return a(b(str));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Field b(String str) throws RuntimeException {
        Field field;
        Class cls = this.b;
        while (true) {
            try {
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredField", String.class);
                declaredMethod.setAccessible(true);
                field = (Field) declaredMethod.invoke(cls, str);
                break;
            } catch (Exception unused) {
                cls = cls.getSuperclass();
                if (cls == Object.class) {
                    field = null;
                    break;
                }
            }
        }
        if (field != null) {
            return field;
        }
        throw new RuntimeException(new NoSuchFieldException(this.b.getName() + ":" + str));
    }

    public jgp c(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jgp) ipChange.ipc$dispatch("7dca64df", new Object[]{this, str}) : a(str, new Class[0], new Object[0]);
    }

    public jgp a(String str, Class<?>[] clsArr, Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        Method declaredMethod = this.b.getDeclaredMethod(str, clsArr);
        if (declaredMethod == null) {
            throw new NoSuchMethodException();
        }
        declaredMethod.setAccessible(true);
        Class<?> returnType = declaredMethod.getReturnType();
        Object obj = Modifier.isStatic(declaredMethod.getModifiers()) ? null : this.f29540a;
        if (declaredMethod.getReturnType() != Void.TYPE) {
            return new jgp(declaredMethod.invoke(obj, objArr), returnType);
        }
        declaredMethod.invoke(obj, objArr);
        return null;
    }

    private jgp a(Field field) throws Exception {
        field.setAccessible(true);
        return new jgp(field.get(Modifier.isStatic(field.getModifiers()) ? null : this.f29540a), field.getType());
    }
}
