package tb;

import android.app.Activity;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.utils.h;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class kxb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1958133152);
    }

    public kxb() {
        emu.a("com.taobao.android.detail.core.detail.controller.PreloadRequestDataHandler");
    }

    public void a(DetailCoreActivity detailCoreActivity, enh enhVar, dya dyaVar, dyi dyiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6354124", new Object[]{this, detailCoreActivity, enhVar, dyaVar, dyiVar});
            return;
        }
        HashMap hashMap = new HashMap();
        if (dyiVar != null && dyiVar.a() != null) {
            hashMap.putAll(dyiVar.a());
        }
        eps.a((Activity) detailCoreActivity, (String) null, (Map<String, String>) hashMap);
        long uptimeMillis = SystemClock.uptimeMillis();
        dyaVar.a(enhVar.c, false);
        h.e(detailCoreActivity, SystemClock.uptimeMillis() - uptimeMillis);
    }
}
