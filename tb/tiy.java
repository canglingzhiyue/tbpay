package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.utils.Global;

/* loaded from: classes7.dex */
public class tiy extends tit<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2138094481);
    }

    @Override // tb.tit
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "jumpNextPage";
    }

    public static /* synthetic */ tiq a(tiy tiyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tiq) ipChange.ipc$dispatch("96631b36", new Object[]{tiyVar}) : tiyVar.b;
    }

    @Override // tb.tit
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            stv.a("NavEvent", "targetUrl is empty");
        } else {
            Nav.from(Global.getApplication()).toUri(str);
            this.b.b().b().postDelayed(new Runnable() { // from class: tb.tiy.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    stv.a("NavEvent", "handleEvent getBootImageContentListener().onClose ");
                    tiy.a(tiy.this).a().c(2001);
                }
            }, 500L);
        }
    }
}
