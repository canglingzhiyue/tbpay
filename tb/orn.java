package tb;

import android.app.Application;
import android.app.KeyguardManager;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.PowerManager;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.a;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.b;
import com.taobao.desktop.channel.desktoplinktask.trigger.e;
import com.taobao.desktop.channel.desktoplinktask.trigger.f;
import com.taobao.desktop.channel.desktoplinktask.widgetservice.c;
import com.taobao.desktop.channel.desktoplinktask.widgetservice.d;
import java.util.ArrayList;
import tb.orn;

/* loaded from: classes7.dex */
public abstract class orn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public a f32326a = new a();

    static {
        kge.a(-148315333);
    }

    public static /* synthetic */ void lambda$e6HHnB48jP7AnovL9VRpnmzhRZM(orn ornVar, f fVar) {
        ornVar.c(fVar);
    }

    public abstract String a();

    public abstract void a(b bVar, JSONObject jSONObject);

    public abstract void a(b bVar, String str);

    public abstract boolean a(b bVar);

    public abstract JSONObject b(b bVar);

    public abstract void c(b bVar);

    public void a(final f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c09d17ee", new Object[]{this, fVar});
        } else {
            kha.a(new Runnable() { // from class: tb.-$$Lambda$orn$e6HHnB48jP7AnovL9VRpnmzhRZM
                @Override // java.lang.Runnable
                public final void run() {
                    orn.lambda$e6HHnB48jP7AnovL9VRpnmzhRZM(orn.this, fVar);
                }
            });
        }
    }

    public /* synthetic */ void c(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e208b170", new Object[]{this, fVar});
            return;
        }
        try {
            String str = fVar.c;
            b bVar = new b(fVar);
            if (!TextUtils.isEmpty(str) && !d.a().a(bVar)) {
                kgz.a("popUpWindow.addNewRequestFailed.sameBizCode.AlreadyPopping.cancel.bizCode=%s", str);
                a(fVar, e.FUNNEL_STEP_LAUNCH_WIDGET, "triggerFailed.trigger.AlreadyPopping", "");
                return;
            }
            kgz.b("TaskProcessor.triggerType=%s", Integer.valueOf(fVar.f16953a));
            e(bVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void e(b bVar) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1134de2", new Object[]{this, bVar});
            return;
        }
        f fVar = bVar.f16946a;
        if (a(bVar) && (a2 = c.a().a(fVar.c)) != null && !a2.isEmpty()) {
            a(bVar, a2);
            return;
        }
        JSONObject b = b(bVar);
        if (b == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(a());
        khe.a("androidFloatWindow", arrayList, b, false, new AnonymousClass1(fVar, bVar), null, null);
        c(bVar);
    }

    /* renamed from: tb.orn$1 */
    /* loaded from: classes7.dex */
    public class AnonymousClass1 implements khf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ f f32327a;
        public final /* synthetic */ b b;

        public static /* synthetic */ void lambda$5IugrQj6YpGR6krLTBQZ72NJ3zI(AnonymousClass1 anonymousClass1, f fVar, b bVar, String str) {
            anonymousClass1.a(fVar, bVar, str);
        }

        public AnonymousClass1(f fVar, b bVar) {
            orn.this = r1;
            this.f32327a = fVar;
            this.b = bVar;
        }

        @Override // tb.khf
        public void a(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            final f fVar = this.f32327a;
            final b bVar = this.b;
            kha.a(new Runnable() { // from class: tb.-$$Lambda$orn$1$5IugrQj6YpGR6krLTBQZ72NJ3zI
                @Override // java.lang.Runnable
                public final void run() {
                    orn.AnonymousClass1.lambda$5IugrQj6YpGR6krLTBQZ72NJ3zI(orn.AnonymousClass1.this, fVar, bVar, str);
                }
            });
        }

        public /* synthetic */ void a(f fVar, b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0ca8dae", new Object[]{this, fVar, bVar, str});
                return;
            }
            try {
                e.a(fVar.f16953a, fVar.c, fVar.d);
                if (bVar.d()) {
                    kgz.b("requestData.onSuccess.butIsClosed.bizCode=%s.", fVar.c);
                    return;
                }
                kgz.b("requestData.onSuccess.response=%s", str);
                if (TextUtils.isEmpty(str)) {
                    orn.this.a(bVar, e.FUNNEL_STEP_AFTER_REQUEST, "mtopFailed.NoResponse", "");
                    return;
                }
                JSONObject b = c.a().b(JSONObject.parseObject(str));
                if (b == null) {
                    orn.this.a(bVar, e.FUNNEL_STEP_AFTER_REQUEST, "mtopFailed.NoContent", "");
                } else {
                    orn.this.a(bVar, b);
                }
            } catch (Throwable th) {
                kgz.a("DesktopRequest.fetchDSL.MTOP.onSuccess.error.", th);
                orn.this.a(bVar, e.FUNNEL_STEP_AFTER_REQUEST, "mtopFailed.catchError", th.getMessage());
            }
        }

        @Override // tb.khf
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
                return;
            }
            try {
                kgz.b("requestData.onError.retMsg=%s", str);
                orn.this.a(this.b, str);
            } catch (Throwable th) {
                kgz.a("DesktopRequest.fetchDSL.MTOP.onError.error.", th);
            }
        }
    }

    public void a(Messenger messenger, int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1706c20", new Object[]{this, messenger, new Integer(i), bundle});
            return;
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = i;
            if (bundle != null) {
                obtain.setData(bundle);
            }
            messenger.send(obtain);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public boolean b(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d152e4b3", new Object[]{this, fVar})).booleanValue();
        }
        Application b = khm.a().b();
        if (kgy.a(b)) {
            a(fVar, e.FUNNEL_STEP_LAUNCH_WIDGET, "filterWindowEnv.checkBackgroundFailed", "");
            return false;
        } else if (!kgy.b(b)) {
            a(fVar, e.FUNNEL_STEP_LAUNCH_WIDGET, "filterWindowEnv.checkFloatPermissionNotPass", "");
            return false;
        } else {
            ksz b2 = com.taobao.global.setting.c.a(khm.a().b(), "desktop_service").b();
            if (!(b2 == null || ((Boolean) b2.a("desktop_service", "desktop_float_window", true, null)).booleanValue())) {
                a(fVar, e.FUNNEL_STEP_LAUNCH_WIDGET, "filterWindowEnv.checkSettingsUserSwitchFailed", "");
                return false;
            } else if (!((PowerManager) b.getSystemService("power")).isScreenOn()) {
                a(fVar, e.FUNNEL_STEP_LAUNCH_WIDGET, "filterWindowEnv.checkIsScreenOnFailed", "");
                return false;
            } else if (((KeyguardManager) b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                a(fVar, e.FUNNEL_STEP_LAUNCH_WIDGET, "filterWindowEnv.checkIsScreenLockedFailed", "");
                return false;
            } else {
                Pair<Integer, Integer> e = kgy.e(b);
                if (((Integer) e.second).intValue() > ((Integer) e.first).intValue()) {
                    return true;
                }
                a(fVar, e.FUNNEL_STEP_LAUNCH_WIDGET, "filterWindowEnv.checkIsDevicePortraitScapeFailed", "");
                return false;
            }
        }
    }

    public void d(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd83c9a1", new Object[]{this, bVar});
            return;
        }
        try {
            f fVar = bVar.f16946a;
            kgz.b("TaskProcessor.onSuccess.bizCode=%s", fVar.c);
            if (fVar.f == null) {
                return;
            }
            fVar.f.a(fVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(b bVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f426ec3c", new Object[]{this, bVar, str, str2, str3});
        } else if (bVar == null) {
        } else {
            a(bVar.f16946a, str, str2, str3);
            d.a().b(bVar);
        }
    }

    public void a(f fVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1db4c", new Object[]{this, fVar, str, str2, str3});
            return;
        }
        e.a(fVar.f16953a, fVar.c, fVar.d, str, str2, str3);
        try {
            kgz.b("TaskProcessor.onFailed.bizCode=%s.closeStep=%s.failReason=%s.failMessage=%s", fVar.c, str, str2, str3);
            if (fVar.f == null) {
                return;
            }
            fVar.f.a(fVar, str2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
