package tb;

import android.content.Context;
import android.graphics.Paint;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.tao.Globals;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;

/* loaded from: classes7.dex */
public class nmj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int SCREEN_HEIGHT;
    public static final int SCREEN_WIDTH;

    /* renamed from: a  reason: collision with root package name */
    private static ImageStrategyConfig f31572a;
    private static Paint b;

    static {
        kge.a(1018981098);
        SCREEN_WIDTH = ((WindowManager) Globals.getApplication().getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getWidth();
        SCREEN_HEIGHT = ((WindowManager) Globals.getApplication().getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getHeight();
        f31572a = ImageStrategyConfig.a(ImageStrategyConfig.WEITAO, 86).a();
        b = new Paint();
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue() : (int) ((f * Globals.getApplication().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        TBToast makeText = TBToast.makeText(Globals.getApplication(), "", 3000L);
        makeText.setText(str);
        makeText.show();
    }

    public static final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a((Context) null, str);
        }
    }

    public static String a(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe74945d", new Object[]{context, new Integer(i)}) : (i < 0 || context == null) ? "" : context.getResources().getString(i);
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue();
        }
        if (str == null) {
            return 0;
        }
        if (str.length() > 1) {
            try {
            } catch (Exception unused) {
                return 0;
            }
        }
        return Integer.parseInt(str.substring(1), 16) | (-16777216);
    }
}
