package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.movehighlight.utils.o;
import com.taobao.taolive.sdk.controller.e;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class ibr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1729237567);
    }

    public static void a(Context context, a aVar) {
        e y;
        e y2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2df1065", new Object[]{context, aVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("business_id", "zhibo_corner");
        if (pfa.a(aVar).b() != null) {
            pfa.a(aVar).b().a((Activity) context, false, (Map<String, String>) hashMap);
        }
        HashMap hashMap2 = new HashMap();
        if (!phg.d().a() && (aVar instanceof com.taobao.taolive.sdk.core.e) && (y2 = ((com.taobao.taolive.sdk.core.e) aVar).y()) != null) {
            hashMap2.put("spm-url", y2.aJ_().a().b());
        }
        hashMap2.put("spm-cnt", o.c(aVar));
        if (!phg.d().a() && (aVar instanceof com.taobao.taolive.sdk.core.e) && (y = ((com.taobao.taolive.sdk.core.e) aVar).y()) != null) {
            ibt a2 = y.aJ_().a();
            a2.b();
            hashMap2.put("entrySpm", a2.r());
            hashMap2.put("livesource", a2.N());
            hashMap2.put("entryLiveSource", a2.p());
            hashMap2.put("entrySpmPre", a2.m());
        }
        hashMap2.put(cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID, "taobao");
        UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder("Page_TaobaoLive", "Button-Button-DownShare");
        uTControlHitBuilder.setProperty(UTHitBuilders.a.FIELD_PAGE, "Page_TaobaoLiveWatch");
        uTControlHitBuilder.setProperties(hashMap2);
        UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
        aVar.e().a("com.taobao.taolive.room.start_share_from_btns");
    }
}
