package tb;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class fhq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final fhq INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static Handler f27958a;
    private static List<fhr> b;

    /* loaded from: classes3.dex */
    public static final class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            Bundle data;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, msg});
                return;
            }
            q.c(msg, "msg");
            if (fhq.a(fhq.INSTANCE).isEmpty()) {
                return;
            }
            int i = 4;
            int i2 = -1;
            try {
                data = msg.getData();
            } catch (Throwable unused) {
                i = -1;
            }
            if (true ^ q.a((Object) cpe.PLT_SCREENSHOT_FLOAT_WINDOW_BIZ_CODE, (Object) data.getString("bizCode"))) {
                return;
            }
            if (msg.what == 4) {
                try {
                    i2 = data.getInt("status");
                } catch (Throwable unused2) {
                }
            } else {
                i = msg.what;
            }
            Iterator it = fhq.a(fhq.INSTANCE).iterator();
            while (it.hasNext()) {
                fhr fhrVar = (fhr) it.next();
                fhrVar.b().mo2423invoke(Integer.valueOf(i), Integer.valueOf(i2));
                if (fhrVar.a()) {
                    it.remove();
                }
            }
            if (i != 3) {
                return;
            }
            fhq.a(fhq.INSTANCE, null);
            k.a(com.b(), cpe.IS_PLT_SCREENSHOT_FLOAT_BAR_OPEN_DEFAULT, "false");
        }
    }

    static {
        kge.a(1105759296);
        INSTANCE = new fhq();
        b = new ArrayList();
    }

    private fhq() {
    }

    public static final /* synthetic */ List a(fhq fhqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("858f669e", new Object[]{fhqVar}) : b;
    }

    public static final /* synthetic */ void a(fhq fhqVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("230af939", new Object[]{fhqVar, handler});
        } else {
            f27958a = handler;
        }
    }

    public final void a(fhr fhrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8919ce8", new Object[]{this, fhrVar});
        } else if (fhrVar == null) {
        } else {
            b.add(fhrVar);
        }
    }

    public final void b(fhr fhrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d714a369", new Object[]{this, fhrVar});
        } else if (fhrVar == null) {
        } else {
            b.remove(fhrVar);
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        pph d = d();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "needToast", (String) false);
        d.a(cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID, cpe.PLT_SCREENSHOT_FLOAT_WINDOW_BIZ_CODE, jSONObject);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            d().b(cpe.PLT_SCREENSHOT_FLOAT_WINDOW_BIZ_CODE);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            d().a(cpe.PLT_SCREENSHOT_FLOAT_WINDOW_BIZ_CODE);
        }
    }

    private final pph d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pph) ipChange.ipc$dispatch("261e2fd3", new Object[]{this});
        }
        if (f27958a == null) {
            f27958a = new a(Looper.getMainLooper());
        }
        pph a2 = pfp.a(com.b(), f27958a);
        q.a((Object) a2, "FloatWindowTriggerManage…ingBtnOptionHandler\n    )");
        return a2;
    }
}
