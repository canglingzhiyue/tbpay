package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.view.WindowManager;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.boutique.reflection.e;
import com.taobao.android.nav.Nav;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes6.dex */
public class nln implements igy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ihh f31563a;
    private final nof b;

    public nln(ihh ihhVar, nof nofVar) {
        this.f31563a = ihhVar;
        this.b = nofVar;
    }

    @Override // tb.igy
    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else if (!a() || !this.f31563a.a("shouldInterruptHCallback", this.b.a())) {
        } else {
            b(application);
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 24 && Build.VERSION.SDK_INT <= 31) {
            return true;
        }
        return Build.VERSION.SDK_INT == 33 && (Build.BRAND.equalsIgnoreCase("Redmi") || Build.BRAND.equalsIgnoreCase("meizu") || Build.BRAND.equalsIgnoreCase("Xiaomi"));
    }

    private void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{this, application});
            return;
        }
        try {
            e c = e.a(Class.forName(ProcessUtils.ACTIVITY_THREAD)).c(ProcessUtils.CURRENT_ACTIVITY_THREAD);
            e a2 = c.a("mH");
            a2.a("mCallback", new a(application, c.a(), (Handler) a2.a(), (Handler.Callback) a2.a("mCallback").a(), this.f31563a, this.b));
            ihc.a("HCallbackCommand", "init succ");
        } catch (Exception e) {
            ihc.a(e);
        }
    }

    /* loaded from: classes6.dex */
    public static class a implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static int e = 159;
        private static int f = 137;
        private static int g = 134;

        /* renamed from: a  reason: collision with root package name */
        public final Context f31564a;
        public final Object b;
        public final Handler.Callback c;
        public final Handler d;
        private final ihh h;
        private final nof i;

        static {
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread$H");
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredField", String.class);
                declaredMethod.setAccessible(true);
                Field field = (Field) declaredMethod.invoke(cls, "EXECUTE_TRANSACTION");
                field.setAccessible(true);
                e = ((Integer) field.get(null)).intValue();
                Field field2 = (Field) declaredMethod.invoke(cls, "SCHEDULE_CRASH");
                field2.setAccessible(true);
                g = ((Integer) field2.get(null)).intValue();
                Field field3 = (Field) declaredMethod.invoke(cls, "SLEEPING");
                field3.setAccessible(true);
                f = ((Integer) field3.get(null)).intValue();
            } catch (Exception e2) {
                ihc.a(e2);
            }
        }

        public a(Context context, Object obj, Handler handler, Handler.Callback callback, ihh ihhVar, nof nofVar) {
            this.f31564a = context;
            this.b = obj;
            this.d = handler;
            this.c = callback;
            this.h = ihhVar;
            this.i = nofVar;
        }

        private boolean d(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f72ac0c2", new Object[]{this, message})).booleanValue();
            }
            try {
                a(message);
            } catch (WindowManager.BadTokenException e2) {
                ihc.a("badTokenMsg", message);
                ihc.a(e2);
                if (!b(message)) {
                    ihc.a("clearActivityThenGotoHome", "clear failed");
                    throw e2;
                }
            } catch (IllegalArgumentException e3) {
                ihc.a(e3);
            } catch (IllegalStateException e4) {
                ihc.a(e4);
                if (!this.h.a("ignoreIllegalStateException", false)) {
                    throw e4;
                }
            } catch (Throwable th) {
                ihc.a(th);
                if (this.h.a("exceptionThenGoHome", false)) {
                    a();
                } else {
                    throw th;
                }
            }
            return true;
        }

        private boolean e(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7b5b0dc3", new Object[]{this, message})).booleanValue();
            }
            if (e == message.what || (100 == message.what && this.h.a("fixAndroid8BadToken", this.i.a()))) {
                try {
                    a(message);
                } catch (WindowManager.BadTokenException e2) {
                    ihc.a(e2);
                    if (!b(message)) {
                        ihc.a("clearActivityThenGotoHome", "clear failed");
                        throw e2;
                    }
                } catch (IllegalArgumentException e3) {
                    ihc.a(e3);
                }
                return true;
            } else if (g != message.what && f != message.what) {
                return false;
            } else {
                try {
                    a(message);
                } catch (Exception e4) {
                    ihc.a(e4);
                }
                return true;
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            Handler.Callback callback = this.c;
            if (callback != null && callback.handleMessage(message)) {
                if (message.what == e) {
                    try {
                        ihc.a("bad_EXECUTE_TRANSACTION", this.c);
                    } catch (Throwable th) {
                        ihc.a(th);
                    }
                }
                return true;
            } else if (this.h.a("doAllPartAction", this.i.a())) {
                return d(message);
            } else {
                return e(message);
            }
        }

        private void a(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
            } else {
                this.d.handleMessage(message);
            }
        }

        private boolean b(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("eeca26c0", new Object[]{this, message})).booleanValue();
            }
            try {
                if (c(message)) {
                    a();
                    return true;
                }
            } catch (Exception e2) {
                ihc.a(e2);
            }
            return false;
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            ihc.a("HCallbackCommand", "goto http://m.taobao.com/index.htm");
            Nav.from(this.f31564a).toUri("http://m.taobao.com/index.htm", new Nav.a() { // from class: tb.nln.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.nav.Nav.a
                public void a(boolean z, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6b74d729", new Object[]{this, new Boolean(z), intent});
                    } else {
                        ihc.a("HCallbackCommand", "nav", Boolean.valueOf(z));
                    }
                }
            });
        }

        private boolean c(Message message) throws Exception {
            Activity activity;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("72fa73c1", new Object[]{this, message})).booleanValue();
            }
            ihc.a("HCallbackCommand", "ensureClearCurrentActivity");
            e a2 = e.a(message.obj);
            if (Build.VERSION.SDK_INT >= 28) {
                IBinder iBinder = (IBinder) a2.a("mActivityToken").a();
                if (iBinder == null) {
                    ihc.a("token == null", new Object[0]);
                    return false;
                }
                Object obj = ((Map) e.a(this.b).a("mActivities").a()).get(iBinder);
                if (obj == null) {
                    ihc.a("HCallbackCommand", "activityClientRecord == null");
                    return false;
                }
                activity = (Activity) e.a(obj).a("activity").a();
            } else {
                activity = (Activity) a2.a("activity").a();
            }
            if (activity == null) {
                ihc.a("HCallbackCommand", "activity == null");
                return false;
            }
            ihc.a("HCallbackCommand", activity.getClass().getSimpleName());
            activity.finish();
            return true;
        }
    }
}
