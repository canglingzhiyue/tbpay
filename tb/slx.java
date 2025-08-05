package tb;

import android.content.Intent;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public class slx implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Object f33712a;
    private a b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public interface a {
        void a(Intent intent);
    }

    public slx(Object obj, a aVar) {
        this.f33712a = obj;
        this.b = aVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if ("startActivity".equals(method.getName())) {
            int i = 0;
            while (true) {
                try {
                    if (i >= objArr.length) {
                        i = 0;
                        break;
                    } else if (objArr[i] instanceof Intent) {
                        break;
                    } else {
                        i++;
                    }
                } catch (Throwable th) {
                    ALog.e("falco.ActivityInvocation", "invoke error", null, th, new Object[0]);
                }
            }
            Intent intent = (Intent) objArr[i];
            if (intent != null && this.b != null) {
                this.b.a(intent);
            }
        }
        try {
            return method.invoke(this.f33712a, objArr);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        }
    }
}
