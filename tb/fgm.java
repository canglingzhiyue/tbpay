package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.detail.core.performance.j;
import com.taobao.android.detail.core.utils.i;
import com.taobao.flowcustoms.afc.utils.b;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class fgm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(679876457);
        emu.a("com.taobao.android.detail.wrapper.utils.AdUtils");
    }

    public static void a(Context context, Uri uri, String str, String str2, String str3, boolean z, Activity activity, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c03764", new Object[]{context, uri, str, str2, str3, new Boolean(z), activity, map});
            return;
        }
        String a2 = j.a("AdUtils");
        i.a(a2, "alimama addTrack itemId = " + str3 + " shopId = " + str + " sellerId = " + str2 + " isTmall = " + z);
        String uri2 = uri == null ? null : uri.toString();
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        hashMap.put(b.AFC_ID, "");
        try {
            String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
            if (!StringUtils.isEmpty(globalProperty)) {
                hashMap.put(b.AFC_ID, globalProperty);
            }
        } catch (Throwable unused) {
        }
        if (ecu.ac) {
            try {
                AlimamaAdvertising.instance().commitTaokeInfo(uri2, str2, str3, z, hashMap);
                AlimamaAdvertising.instance().uploadUDTrack(uri2, str2, str3, z, hashMap);
            } catch (Throwable unused2) {
            }
        } else {
            AlimamaAdvertising.instance().commitTaokeInfo(uri2, str2, str3, z);
        }
        eps.a(context, "Page_Detail", 2101, "Page_Detail_Advert-SDKCall", null, null, String.format("shop_id=%s,seller_id=%s,item_id=%s", str, str2, str3));
        i.a(j.a("AdUtils"), "sendTaobaokeEnd");
    }
}
