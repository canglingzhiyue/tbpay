package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.a;
import com.taobao.application.common.c;

/* loaded from: classes7.dex */
public class kfu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final kfu f30041a = new kfu();
    private static volatile boolean b = false;
    private Context c;
    private kfv d;

    public static /* synthetic */ void a(kfu kfuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0ff061e", new Object[]{kfuVar});
        } else {
            kfuVar.c();
        }
    }

    private kfu() {
    }

    public static kfu a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kfu) ipChange.ipc$dispatch("f06d5e4", new Object[0]) : f30041a;
    }

    public void a(Context context, kfv kfvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8314fa75", new Object[]{this, context, kfvVar});
            return;
        }
        this.d = kfvVar;
        a(context);
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (b) {
            Log.e(kga.MODULE_NAME, "hasInit==true, already init");
        } else {
            b = true;
            if (context == null) {
                Log.e(kga.MODULE_NAME, "argument context == null, kidding?");
                return;
            }
            this.c = context.getApplicationContext();
            kgb.a();
            boolean b2 = kgb.b();
            Log.e("codetrack", "init switch is " + b2);
            if (!b2) {
                return;
            }
            b();
            kft.a(kga.MODULE_NAME, "init finish");
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        kfv kfvVar = this.d;
        if (kfvVar == null || kfvVar.b()) {
            Log.e(kga.MODULE_NAME, "skip register apm task, cause 'codeTrackInfo == null || codeTrackInfo.isDisableApmCollect()' ");
            return;
        }
        Log.e(kga.MODULE_NAME, "performRegisterApmTask enter");
        c.a(new a.b() { // from class: tb.kfu.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.application.common.IApmEventListener
            public void onEvent(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                } else if (i != 50) {
                } else {
                    Log.e(kga.MODULE_NAME, "CodeTrack: APM is notifying for in background stat");
                    kfu.a(kfu.this);
                }
            }
        });
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c == null) {
            Log.e(kga.MODULE_NAME, "skip dump , context == null");
        } else {
            kft.a(kga.MODULE_NAME, "codeTrackInfo=" + this.d);
            kfv kfvVar = this.d;
            if (kfvVar == null) {
                kft.a(kga.MODULE_NAME, "skip dump , codeTrackInfo == null || buildId == empty");
                return;
            }
            try {
                if (!kgb.c()) {
                    kft.a(kga.MODULE_NAME, "!rateMatched");
                } else {
                    AsyncTask.execute(new kfw(this.c, kfvVar));
                }
            } catch (Throwable th) {
                kft.a(kga.MODULE_NAME, "CodeTrackInfo performDumpAndUpload error:", th);
            }
        }
    }
}
