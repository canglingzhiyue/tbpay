package tb;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.PersistableBundle;
import android.os.TransactionTooLargeException;
import mtopsdk.common.util.StringUtils;
import android.util.SparseArray;
import android.view.AbsSavedState;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.boutique.reflection.e;
import com.taobao.android.boutique.reflection.h;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.android.tcrash.UncaughtCrashType;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

/* loaded from: classes6.dex */
public class hht implements igy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ihh f28668a;
    private final nof b;

    private static <T> T b(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("eeb6464d", new Object[]{obj}) : obj;
    }

    public static /* synthetic */ Object a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("9798556e", new Object[]{obj}) : b(obj);
    }

    public hht(ihh ihhVar, nof nofVar) {
        this.f28668a = ihhVar;
        this.b = nofVar;
    }

    @Override // tb.igy
    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else if (Build.VERSION.SDK_INT != 31) {
        } else {
            if ((!Build.BRAND.equalsIgnoreCase("HUAWEI") && !Build.BRAND.equalsIgnoreCase("HONOR")) || !this.f28668a.a("shouldActivityClientHook", this.b.a())) {
                return;
            }
            try {
                a();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void a() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Object a2 = e.a(e.a(Class.forName("android.app.ActivityClient")).c("getInstance").a()).a("INTERFACE_SINGLETON").a();
        Object a3 = e.a(a2).a("mKnownInstance").a();
        Class<?> cls = Class.forName("android.app.IActivityClientController");
        if (a3 != null) {
            e.a(a2).a("mKnownInstance", Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{cls}, new a(a3)));
            return;
        }
        Object a4 = e.a(a2).c("get").a();
        e.a(a2).a("mInstance", Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{cls}, new a(a4)));
    }

    /* loaded from: classes6.dex */
    public static class a implements InvocationHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Object f28669a;

        public a(Object obj) {
            this.f28669a = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return method.invoke(this.f28669a, objArr);
            } catch (InvocationTargetException e) {
                Throwable targetException = e.getTargetException();
                if ((targetException instanceof TransactionTooLargeException) && "activityStopped".equals(method.getName())) {
                    try {
                        Bundle bundle = (Bundle) hht.a(objArr[1]);
                        PersistableBundle persistableBundle = (PersistableBundle) hht.a(objArr[2]);
                        CharSequence charSequence = (CharSequence) hht.a(objArr[3]);
                        UncaughtCrashHeader crashCaughtHeaderByType = TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.JAVA_ONLY);
                        if (bundle != null) {
                            crashCaughtHeaderByType.addHeaderInfo("activityStopped_icicle", a(bundle));
                        }
                        if (persistableBundle != null) {
                            crashCaughtHeaderByType.addHeaderInfo("activityStopped_persistentState", a(persistableBundle));
                        }
                        if (charSequence == null) {
                            return null;
                        }
                        crashCaughtHeaderByType.addHeaderInfo("activityStopped_description", charSequence.toString());
                        return null;
                    } catch (Throwable th) {
                        ihc.a(th);
                        return null;
                    }
                }
                throw targetException;
            }
        }

        private String a(Object obj) throws Throwable {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj});
            }
            StringBuilder sb = new StringBuilder();
            if (obj instanceof Bundle) {
                sb.append(a((Map) e.a(obj).a("mMap").a()));
            } else if (obj instanceof Parcel) {
                sb.append("parcel:" + ((Parcel) obj).dataSize());
            } else if (obj instanceof Map) {
                sb.append(riy.BLOCK_START_STR);
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    sb.append(key + "=" + a(value) + ",");
                }
                sb.append(riy.BLOCK_END_STR);
            } else if (obj instanceof AbsSavedState) {
                Field[] b = h.b(obj.getClass());
                sb.append(riy.BLOCK_START_STR);
                int length = b.length;
                while (i < length) {
                    Field field = b[i];
                    field.setAccessible(true);
                    sb.append(field.getName() + "=" + a(obj));
                    i++;
                }
                sb.append(riy.BLOCK_END_STR);
            } else if (obj instanceof SparseArray) {
                SparseArray sparseArray = (SparseArray) obj;
                int size = sparseArray.size();
                sb.append(riy.ARRAY_START_STR);
                while (i < size) {
                    String a2 = a(sparseArray.get(i));
                    if (!StringUtils.isEmpty(a2)) {
                        sb.append(a2 + ",");
                    }
                    i++;
                }
                sb.append(riy.ARRAY_END_STR);
            } else if (obj != null) {
                if (obj.getClass().isArray()) {
                    sb.append(riy.ARRAY_START_STR);
                    Object[] objArr = (Object[]) obj;
                    int length2 = objArr.length;
                    while (i < length2) {
                        Object obj2 = objArr[i];
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(a(obj2));
                        sb2.append(",");
                        sb.append(sb2.toString());
                        i++;
                    }
                    sb.append(riy.ARRAY_END_STR);
                } else {
                    sb.append(obj);
                }
            }
            return sb.toString();
        }
    }
}
