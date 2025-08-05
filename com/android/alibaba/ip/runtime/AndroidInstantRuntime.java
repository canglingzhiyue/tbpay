package com.android.alibaba.ip.runtime;

import com.android.alibaba.ip.common.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tb.kge;

/* loaded from: classes3.dex */
public class AndroidInstantRuntime {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1446370248);
    }

    public static void setLogger(final Logger logger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d1d2e28", new Object[]{logger});
        } else {
            Log.logging = new Log.Logging() { // from class: com.android.alibaba.ip.runtime.AndroidInstantRuntime.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.android.alibaba.ip.common.Log.Logging
                public void log(Level level, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b26a33ac", new Object[]{this, level, str});
                    } else {
                        logger.log(level, str);
                    }
                }

                @Override // com.android.alibaba.ip.common.Log.Logging
                public boolean isLoggable(Level level) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("193a3bc3", new Object[]{this, level})).booleanValue() : logger.isLoggable(level);
                }

                @Override // com.android.alibaba.ip.common.Log.Logging
                public void log(Level level, String str, Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ee5503c9", new Object[]{this, level, str, th});
                    } else {
                        logger.log(level, str, th);
                    }
                }
            };
        }
    }

    public static Object getStaticPrivateField(Class cls, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("1568b90d", new Object[]{cls, str}) : getPrivateField(null, cls, str);
    }

    public static void setStaticPrivateField(Object obj, Class cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7f535d", new Object[]{obj, cls, str});
        } else {
            setPrivateField(null, obj, cls, str);
        }
    }

    public static void setPrivateField(Object obj, Object obj2, Class cls, String str) {
        try {
            getField(cls, str).set(obj, obj2);
        } catch (IllegalAccessException e) {
            if (Log.logging != null) {
                Log.logging.log(Level.SEVERE, String.format("Exception during setPrivateField %s", str), e);
            }
            throw new RuntimeException(e);
        }
    }

    public static Object getPrivateField(Object obj, Class cls, String str) {
        try {
            return getField(cls, str).get(obj);
        } catch (IllegalAccessException e) {
            if (Log.logging != null) {
                Log.Logging logging = Log.logging;
                Level level = Level.SEVERE;
                Object[] objArr = new Object[2];
                objArr[0] = obj == null ? " static" : "";
                objArr[1] = str;
                logging.log(level, String.format("Exception during%1$s getField %2$s", objArr), e);
            }
            throw new RuntimeException(e);
        }
    }

    private static Field getField(Class cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("90de8d19", new Object[]{cls, str});
        }
        Field fieldByName = getFieldByName(cls, str);
        if (fieldByName == null) {
            throw new RuntimeException(new NoSuchElementException(str));
        }
        fieldByName.setAccessible(true);
        return fieldByName;
    }

    public static Object invokeProtectedMethod(Object obj, Object[] objArr, Class[] clsArr, String str) throws Throwable {
        if (Log.logging != null && Log.logging.isLoggable(Level.FINE)) {
            Log.logging.log(Level.FINE, String.format("protectedMethod:%s on %s", str, obj));
        }
        try {
            Method methodByName = getMethodByName(obj.getClass(), str, clsArr);
            if (methodByName == null) {
                throw new RuntimeException(new NoSuchMethodException(str));
            }
            methodByName.setAccessible(true);
            return methodByName.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            if (Log.logging != null) {
                Log.logging.log(Level.SEVERE, String.format("Exception while invoking %s", str), e);
            }
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static Object invokeProtectedStaticMethod(Object[] objArr, Class[] clsArr, String str, Class cls) throws Throwable {
        if (Log.logging != null && Log.logging.isLoggable(Level.FINE)) {
            Log.logging.log(Level.FINE, String.format("protectedStaticMethod:%s on %s", str, cls.getName()));
        }
        try {
            Method methodByName = getMethodByName(cls, str, clsArr);
            if (methodByName == null) {
                throw new RuntimeException(new NoSuchMethodException(str + " in class " + cls.getName()));
            }
            methodByName.setAccessible(true);
            return methodByName.invoke(null, objArr);
        } catch (IllegalAccessException e) {
            if (Log.logging != null) {
                Log.logging.log(Level.SEVERE, String.format("Exception while invoking %s", str), e);
            }
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static <T> T newForClass(Object[] objArr, Class[] clsArr, Class<T> cls) throws Throwable {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            try {
                return cls.cast(declaredConstructor.newInstance(objArr));
            } catch (IllegalAccessException e) {
                if (Log.logging != null) {
                    Log.logging.log(Level.SEVERE, String.format("Exception while instantiating %s", cls), e);
                }
                throw new RuntimeException(e);
            } catch (InstantiationException e2) {
                if (Log.logging != null) {
                    Log.logging.log(Level.SEVERE, String.format("Exception while instantiating %s", cls), e2);
                }
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (NoSuchMethodException e4) {
            if (Log.logging != null) {
                Log.logging.log(Level.SEVERE, "Exception while resolving constructor", e4);
            }
            throw new RuntimeException(e4);
        }
    }

    private static Field getFieldByName(Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("dd32a037", new Object[]{cls, str});
        }
        ArrayList<Class> arrayList = new ArrayList();
        while (true) {
            if (cls == null && arrayList.size() <= 0) {
                return null;
            }
            if (cls != null) {
                try {
                    return cls.getDeclaredField(str);
                } catch (NoSuchFieldException unused) {
                }
            }
            for (Class cls2 : arrayList) {
                try {
                    return cls2.getDeclaredField(str);
                } catch (NoSuchFieldException unused2) {
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Class cls3 : arrayList) {
                arrayList2.addAll(Arrays.asList(cls3.getInterfaces()));
            }
            if (cls != null) {
                arrayList2.addAll(Arrays.asList(cls.getInterfaces()));
                cls = cls.getSuperclass();
            }
            arrayList.clear();
            arrayList.addAll(arrayList2);
        }
    }

    private static Method getMethodByName(Class<?> cls, String str, Class[] clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("82e9fa4f", new Object[]{cls, str, clsArr});
        }
        if (cls == null) {
            return null;
        }
        while (cls != null) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
                if (cls != null && Log.logging != null && Log.logging.isLoggable(Level.FINE)) {
                    Log.logging.log(Level.FINE, String.format("getMethodByName:Looking in %s now", cls.getName()));
                }
            }
        }
        return null;
    }

    public static void trace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d6ba16", new Object[]{str});
        } else if (Log.logging == null) {
        } else {
            Log.logging.log(Level.FINE, str);
        }
    }

    public static void trace(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c5ca60", new Object[]{str, str2});
        } else if (Log.logging == null) {
        } else {
            Log.logging.log(Level.FINE, String.format("%s %s", str, str2));
        }
    }

    public static void trace(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30511c2a", new Object[]{str, str2, str3});
        } else if (Log.logging == null) {
        } else {
            Log.logging.log(Level.FINE, String.format("%s %s %s", str, str2, str3));
        }
    }

    public static void trace(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17b4f74", new Object[]{str, str2, str3, str4});
        } else if (Log.logging == null) {
        } else {
            Log.logging.log(Level.FINE, String.format("%s %s %s %s", str, str2, str3, str4));
        }
    }
}
