package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class dvr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CLOSE = "mega_dark_page_close";
    public static final String ACTION_CLOSE_INDEX_PARAM = "closeIndex";
    public static final String ACTION_CLOSE_TYPE_PARAM = "closeType";

    /* renamed from: a  reason: collision with root package name */
    private static volatile dvr f27022a;
    private dzg b;
    private epd c;
    private gwz d;

    private dvr() {
    }

    public static dvr a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dvr) ipChange.ipc$dispatch("f03e2fe", new Object[0]);
        }
        if (f27022a == null) {
            synchronized (dvr.class) {
                if (f27022a == null) {
                    f27022a = new dvr();
                }
            }
        }
        return f27022a;
    }

    public void a(dzg dzgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e62092a7", new Object[]{this, dzgVar});
        } else if (dzgVar == null) {
        } else {
            this.b = dzgVar;
        }
    }

    public void a(epd epdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e747231f", new Object[]{this, epdVar});
        } else {
            this.c = epdVar;
        }
    }

    public void a(gwz gwzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb1d790e", new Object[]{this, gwzVar});
        } else {
            this.d = gwzVar;
        }
    }

    public dzg b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dzg) ipChange.ipc$dispatch("16b5960c", new Object[]{this}) : this.b;
    }

    public epd c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (epd) ipChange.ipc$dispatch("1e6789e3", new Object[]{this}) : this.c;
    }

    public gwz d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gwz) ipChange.ipc$dispatch("261a34f1", new Object[]{this}) : this.d;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
