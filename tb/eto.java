package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.flowout.c;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class eto {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int DETAIL_CELL_HEIGHT;
    public static final int DETAIL_HMARGIN;

    static {
        kge.a(1210856574);
        DETAIL_HMARGIN = euz.SIZE_12;
        DETAIL_CELL_HEIGHT = (int) (euz.screen_density * 44.0f);
        tpc.a("com.taobao.android.detail.kit.utils.DetailUtils");
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
        } catch (Throwable th) {
            eva.a(th);
        }
        return c.TMALL.equalsIgnoreCase(euy.c().getApplication().getString(R.string.config_app_type));
    }
}
