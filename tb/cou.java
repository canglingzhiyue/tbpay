package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.IrpParamModel;

/* loaded from: classes3.dex */
public class cou {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f26362a;

    /* loaded from: classes3.dex */
    public interface a {
        void a(Activity activity, int i);

        void a(Activity activity, String str, String str2);

        void a(Context context, IrpParamModel irpParamModel);

        void a(Context context, String str);
    }

    static {
        kge.a(756524923);
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49399d12", new Object[]{aVar});
        } else {
            f26362a = aVar;
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else {
            f26362a.a(context, str);
        }
    }

    public static void a(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36e85ce", new Object[]{activity, str, str2});
        } else {
            f26362a.a(activity, str, str2);
        }
    }

    public static void a(Context context, IrpParamModel irpParamModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adcb4e01", new Object[]{context, irpParamModel});
        } else if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
        } else {
            f26362a.a(context, irpParamModel);
        }
    }

    public static void a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb0489", new Object[]{activity, new Integer(i)});
        } else {
            f26362a.a(activity, i);
        }
    }
}
