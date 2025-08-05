package tb;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;

/* loaded from: classes2.dex */
public class bat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public interface a {
        void showToast(Activity activity, String str);
    }

    static {
        kge.a(-1666300479);
    }

    public static void a(final Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (bar.a("enableMegaToast", true)) {
            a(str);
        } else {
            a aVar = (a) AliAdaptServiceManager.getInstance().findAliAdaptService(a.class);
            if (aVar == null) {
                bbh.a(new Runnable() { // from class: tb.bat.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            Toast.makeText(context, str, 0).show();
                        } catch (Throwable unused) {
                        }
                    }
                }, 0L);
            } else if (context instanceof Activity) {
                aVar.showToast((Activity) context, str);
            } else {
                arc.a().c("AURAToastUtils", LoginConstants.SHOW_TOAST, "context is not activity");
            }
        }
    }

    private static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        jao a2 = jao.a();
        if (a2 == null) {
            return;
        }
        a2.a(str, new jzb() { // from class: tb.bat.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jzb, tb.gml
            public void a(ErrorResult errorResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a5ed5e", new Object[]{this, errorResult});
                }
            }
        });
    }
}
