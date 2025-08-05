package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.taopai.charge.data.TpChargeBean;

/* loaded from: classes6.dex */
public class izd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static izd f29417a;
    private final ize b;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static izd f29419a;

        static {
            kge.a(758952342);
            f29419a = new izd();
        }
    }

    static {
        kge.a(-1792309501);
        kge.a(-1930001879);
    }

    private izd() {
        this.b = new ize();
    }

    public static izd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (izd) ipChange.ipc$dispatch("f06362b", new Object[0]);
        }
        if (f29417a == null) {
            f29417a = a.f29419a;
        }
        return f29417a;
    }

    public static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: tb.izd.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        izh.a(context);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public void a(TpChargeBean tpChargeBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4f42a7", new Object[]{this, tpChargeBean});
            return;
        }
        String str = "sendCount Data = " + tpChargeBean.toString();
        if (TextUtils.isEmpty(tpChargeBean.getBizScene()) || TextUtils.isEmpty(tpChargeBean.getBizLine())) {
            Log.e("TaopaiCharge", "bizLine || bizScene is empty");
        } else if (!izg.a()) {
        } else {
            this.b.a(tpChargeBean);
        }
    }
}
