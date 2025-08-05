package tb;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.android.icart.core.widget.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes2.dex */
public class bep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f25834a;
    private static final String b;
    private static final String c;

    static {
        kge.a(-1380942610);
        f25834a = b.a(R.string.taobao_app_1028_1_21674);
        b = b.a(R.string.taobao_app_1028_1_21654);
        c = b.a(R.string.taobao_app_1028_1_21652);
    }

    public static void a(Context context, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dae8c825", new Object[]{context, mtopResponse});
        } else if (mtopResponse == null || mtopResponse.getRet() == null || mtopResponse.getRet().length <= 0) {
        } else {
            String str = mtopResponse.getRet()[0];
            if (TextUtils.isEmpty(str) || !str.contains("CART_PRESALE_TIMEOUT")) {
                return;
            }
            a(context);
            bed.a("preheatTimeout", "预热态过期", false, 1.0f);
        }
    }

    private static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null) {
        } else {
            a aVar = new a(context);
            aVar.a().setCancelable(false);
            aVar.a((CharSequence) b).b(f25834a).b((CharSequence) null).c(c).a(new a.InterfaceC0081a() { // from class: tb.bep.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.icart.core.widget.a.InterfaceC0081a
                public void a(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c0d596fe", new Object[]{this, dialogInterface});
                        return;
                    }
                    dialogInterface.dismiss();
                    Context context2 = context;
                    if (!(context2 instanceof Activity)) {
                        return;
                    }
                    Activity activity = (Activity) context2;
                    if (activity.getClass().getName().contains("TBMainActivity")) {
                        return;
                    }
                    beg.a(context);
                    activity.finish();
                }

                @Override // com.alibaba.android.icart.core.widget.a.InterfaceC0081a
                public void b(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2228339d", new Object[]{this, dialogInterface});
                    } else {
                        dialogInterface.dismiss();
                    }
                }
            }).b();
        }
    }
}
