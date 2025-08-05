package tb;

import android.content.Context;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.android.ultron.engine.utils.h;
import com.alibaba.android.ultron.vfw.widget.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ei;

/* loaded from: classes6.dex */
public class kpn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(721276757);
    }

    public static /* synthetic */ boolean a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("638f9910", new Object[]{charSequence})).booleanValue() : b(charSequence);
    }

    public static void a(final Context context, final CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95562904", new Object[]{context, charSequence});
        } else if (charSequence == null || charSequence.length() == 0) {
            jqg.b("ToastUtil", "toast content is EMPTY!");
        } else if (bxd.a("useMegaUnifyToast", true)) {
            h.a(new Runnable() { // from class: tb.kpn.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (kpn.a(charSequence)) {
                            return;
                        }
                        a.a(context, charSequence);
                    } catch (Throwable unused) {
                        a.a(context, charSequence);
                    }
                }
            });
        } else {
            a.a(context, charSequence);
        }
    }

    private static boolean b(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cdf7d91", new Object[]{charSequence})).booleanValue();
        }
        if (!(charSequence instanceof String)) {
            return false;
        }
        String str = (String) charSequence;
        jao a2 = jao.a();
        if (a2 == null) {
            jqg.b("UToast", "megaToast instance is null");
            return false;
        }
        ei a3 = ei.Companion.a(str);
        if (a3 == null) {
            jqg.b("UToast", "toastShowParams is null");
            return false;
        }
        a3.b = 3000.0d;
        a2.a(a3, new jzb() { // from class: tb.kpn.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jzb, tb.gml
            public void a(ErrorResult errorResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a5ed5e", new Object[]{this, errorResult});
                } else {
                    jqg.b("UToast", "megaToast show error");
                }
            }
        });
        return true;
    }
}
