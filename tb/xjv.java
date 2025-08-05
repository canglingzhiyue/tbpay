package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.o2o.ad.a;
import com.taobao.alimama.c;
import com.taobao.android.nav.d;

/* loaded from: classes6.dex */
public class xjv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String[] f34342a;

    static {
        kge.a(552954567);
        kge.a(831766156);
        f34342a = new String[]{"e", "type", "tkFlag", "tk_cps_ut", "_cps9", c.E_URL, "etype", "eadt", "clickid", kuh.ALI_TRACK_ID, "acttype", a.O2O_URL, "epid", "eads", "tk_cps_param", "o2oclickid", "tkSid", "tkSid2"};
    }

    public xjw a(Intent intent, d dVar, xjw xjwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xjw) ipChange.ipc$dispatch("fade4667", new Object[]{this, intent, dVar, xjwVar});
        }
        if (xjwVar == null) {
            xjwVar = new xjw();
        }
        Uri uri = xjwVar.c;
        if (uri == null) {
            uri = xjx.a(intent.getData());
        }
        String a2 = xjx.a(f34342a, uri);
        xjwVar.b = a2;
        xjwVar.f34343a = !TextUtils.isEmpty(a2);
        return xjwVar;
    }
}
