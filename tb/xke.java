package tb;

import android.app.ActivityManager;
import android.app.ActivityThread;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Pair;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IBindService;
import com.taobao.aranger.intf.IUnbindService;
import com.taobao.aranger.utils.FakeServiceCenter;
import com.taobao.aranger.utils.b;
import com.taobao.atools.StaticHook;
import com.taobao.weex.common.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public class xke extends jzw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Method d;
    private static Object e;
    private static Object f;
    private final String b;
    private final String c;

    static {
        kge.a(729766388);
    }

    public static /* synthetic */ Object ipc$super(xke xkeVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void lambda$SCc9a9DZb6VqCbUMfuLf5_K6Ee8(xke xkeVar, Object[] objArr) {
        xkeVar.b(objArr);
    }

    public xke(Call call) throws IPCException {
        super(call);
        this.b = call.getServiceWrapper().getTimeStamp();
        this.c = call.getServiceWrapper().getName();
    }

    @Override // tb.jzw
    public Object a(final Object[] objArr) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("32c10c89", new Object[]{this, objArr});
        }
        if (objArr == null || objArr.length == 0) {
            kak.b("ServiceReplyHandler", "[ServiceReplyHandler][invoke] IllegalArgs", new Object[0]);
            return null;
        }
        b.a(true, true, new Runnable() { // from class: tb.-$$Lambda$xke$SCc9a9DZb6VqCbUMfuLf5_K6Ee8
            @Override // java.lang.Runnable
            public final void run() {
                xke.lambda$SCc9a9DZb6VqCbUMfuLf5_K6Ee8(xke.this, objArr);
            }
        });
        return null;
    }

    public /* synthetic */ void b(Object[] objArr) {
        IBinder a2;
        try {
            if (objArr.length == 3 && (objArr[0] instanceof Intent) && (objArr[1] instanceof Integer) && (objArr[2] instanceof IBindService)) {
                Intent intent = (Intent) objArr[0];
                int intValue = ((Integer) objArr[1]).intValue();
                IBindService iBindService = (IBindService) objArr[2];
                FakeServiceCenter.FakeService a3 = FakeServiceCenter.a().a(this.c);
                if (a3 == null) {
                    Service service = (Service) Class.forName(this.c).newInstance();
                    a(service);
                    FakeServiceCenter a4 = FakeServiceCenter.a();
                    String str = this.b;
                    FakeServiceCenter.FakeService fakeService = new FakeServiceCenter.FakeService(this.b, service);
                    a4.a(str, fakeService);
                    fakeService.onCreate();
                    a3 = fakeService;
                }
                Pair<Boolean, Boolean> a5 = a3.a(intValue, intent);
                kak.b("ServiceReplyHandler", "invoke bind", "id", this.b, "timeStamp", a3.b(), "same intent", a5.first, "same conn", a5.second);
                if (!((Boolean) a5.first).booleanValue()) {
                    a2 = a3.onBind(intent);
                } else {
                    a2 = a3.a(intent);
                }
                if (((Boolean) a5.second).booleanValue()) {
                    return;
                }
                iBindService.onBind(a3.b(), a2);
            } else if (objArr.length != 2 || !(objArr[0] instanceof Integer) || !(objArr[1] instanceof IUnbindService)) {
            } else {
                int intValue2 = ((Integer) objArr[0]).intValue();
                IUnbindService iUnbindService = (IUnbindService) objArr[1];
                FakeServiceCenter.FakeService b = FakeServiceCenter.a().b(this.b);
                if (b == null) {
                    kak.b("ServiceReplyHandler", "invoke unbindService, FakeService not found", "timeStamp", this.b);
                    return;
                }
                kak.b("ServiceReplyHandler", "invoke unbind", "timeStamp", this.b);
                b.a(intValue2);
                if (!b.d()) {
                    return;
                }
                FakeServiceCenter.a().c(this.b);
                b.onDestroy();
                iUnbindService.onDestroy();
            }
        } catch (Throwable th) {
            kak.a("ServiceReplyHandler", "[ServiceReplyHandler][invoke]", th, "timeStamp", this.b);
        }
    }

    private void a(Service service) {
        try {
            if (d == null) {
                Field b = StaticHook.b(Class.forName(ProcessUtils.ACTIVITY_THREAD), "sCurrentActivityThread");
                b.setAccessible(true);
                f = b.get(null);
                Method a2 = StaticHook.a(ActivityManager.class, "getService", new Class[0]);
                if (a2 == null) {
                    a2 = StaticHook.a(Class.forName("android.app.ActivityManagerNative"), "getDefault", new Class[0]);
                }
                if (a2 != null) {
                    e = a2.invoke(null, new Object[0]);
                }
                d = StaticHook.a(Service.class, Constants.Event.SLOT_LIFECYCLE.ATTACH, Context.class, ActivityThread.class, String.class, IBinder.class, Application.class, Object.class);
                kak.b("ServiceReplyHandler", "attachService init", "amObj", e);
            }
            if (d == null) {
                kak.b("ServiceReplyHandler", "attachService, attachMtd is null", new Object[0]);
            } else {
                d.invoke(service, jzv.a(), f, service.getClass().getName(), null, jzv.a(), e);
            }
        } catch (Throwable th) {
            kak.a("ServiceReplyHandler", "attachService err", th, new Object[0]);
        }
    }
}
