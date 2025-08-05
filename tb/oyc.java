package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.gateway.util.c;
import com.ut.mini.UTAnalytics;

/* loaded from: classes8.dex */
public class oyc extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BARCODE_TYPE_MEDICINE = 2;
    public static final int BARCODE_TYPE_PRODUCT = 1;

    /* renamed from: a  reason: collision with root package name */
    private Activity f32477a;
    private oyd b;

    static {
        kge.a(1144983825);
    }

    public static /* synthetic */ Object ipc$super(oyc oycVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public oyc(Activity activity, css cssVar) {
        super(cssVar);
        this.f32477a = activity;
    }

    public oyc(Activity activity, oyd oydVar, css cssVar) {
        super(cssVar);
        this.f32477a = activity;
        this.b = oydVar;
    }

    public boolean a(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed88149f", new Object[]{this, str, new Integer(i), str2})).booleanValue();
        }
        boolean a2 = a(str, i, str2, true, this.navigator);
        oys.a().a("BarcodeGateway_4g");
        return a2;
    }

    public void b(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ed49ba", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        a(str, i, str2, false, this.navigator);
        oys.a().a("BarcodeGateway_history");
    }

    private boolean a(String str, int i, String str2, boolean z, css cssVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bea18e2a", new Object[]{this, str, new Integer(i), str2, new Boolean(z), cssVar})).booleanValue();
        }
        boolean a2 = com.taobao.taobao.scancode.barcode.util.c.a(this.f32477a, this.b, str, i, str2, z, cssVar);
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_BarCodeDetail");
        return a2;
    }
}
