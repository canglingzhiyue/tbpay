package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* loaded from: classes8.dex */
public class tdy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final float[] fontSizeFactors = {0.8f, 1.0f, 1.12f, 1.31f, 1.52f};

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (context == null) {
            context = Globals.getApplication();
        }
        return context.getSharedPreferences("fontSetting", 0).getInt("coefficient", 1);
    }
}
