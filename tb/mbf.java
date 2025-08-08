package tb;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.c;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public class mbf implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static b f31008a;
    private Object b;
    private Context c;

    /* loaded from: classes7.dex */
    public interface a {
        void a(boolean z);
    }

    /* loaded from: classes7.dex */
    public interface b {
        boolean a(Intent intent, String str, String str2, Context context, a aVar);
    }

    static {
        kge.a(-317560191);
        kge.a(16938580);
    }

    public static /* synthetic */ Object a(mbf mbfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d513364b", new Object[]{mbfVar}) : mbfVar.b;
    }

    public mbf(Object obj, Context context) {
        this.b = obj;
        this.c = context;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, final Method method, final Object[] objArr) throws Throwable {
        if ("startActivity".equals(method.getName())) {
            c.a("linkx", "ready to startActivity：" + method.getName());
            if (a(objArr, new a() { // from class: tb.mbf.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.mbf.a
                public void a(boolean z) {
                    if (z) {
                        try {
                            method.invoke(mbf.a(mbf.this), objArr);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            })) {
                try {
                    return method.invoke(this.b, objArr);
                } catch (InvocationTargetException e) {
                    throw e.getTargetException();
                }
            }
            return 0;
        }
        try {
            return method.invoke(this.b, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getTargetException();
        }
    }

    private boolean a(Object[] objArr, a aVar) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1580ee4f", new Object[]{this, objArr, aVar})).booleanValue();
        }
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
            } catch (Exception e) {
                c.a("linkx", "AMSInvocationHandler === redirectIntent === 外跳拦截异常：" + e.toString());
            }
        }
        Intent intent = (Intent) objArr[i];
        if (intent != null) {
            if (intent.getComponent() != null) {
                str = intent.getComponent().getPackageName();
                str2 = intent.getComponent().getClassName();
            } else {
                ResolveInfo resolveActivity = this.c.getPackageManager().resolveActivity(intent, 0);
                if (resolveActivity == null || resolveActivity.activityInfo == null) {
                    str = "";
                    str2 = str;
                } else {
                    String str3 = resolveActivity.activityInfo.packageName;
                    str2 = resolveActivity.activityInfo.name;
                    str = str3;
                }
            }
            c.a("linkx", "AMSInvocationHandler === packageName:" + str + "  componentName:" + str2 + "  intent:" + intent);
            if (StringUtils.equals(str, "com.taobao.taobao")) {
                c.a("linkx", "AMSInvocationHandler === redirectIntent === 内部跳转调用！！！");
                return true;
            } else if (f31008a != null) {
                return f31008a.a(intent, str, str2, this.c, aVar);
            }
        }
        return true;
    }
}
