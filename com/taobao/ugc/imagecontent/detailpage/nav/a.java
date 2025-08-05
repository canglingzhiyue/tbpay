package com.taobao.ugc.imagecontent.detailpage.nav;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.d;
import com.taobao.android.nav.e;
import com.taobao.android.preload.g;
import com.taobao.android.preload.j;
import com.taobao.android.preload.k;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import tb.fjs;
import tb.fjt;
import tb.fjx;
import tb.flp;
import tb.kge;

/* loaded from: classes9.dex */
public class a implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_EXTRA_ENABLE_TRANSITION = "extraEnableTransition";
    public static final String KEY_EXTRA_ENABLE_TRA_STYLE_DATA = "extraEnableTraStyleData";
    public static final String KEY_ON_NAV_HIT_PRE_CACHE_DATA = "onNavHitPreCacheData";
    public static final String KEY_REAL_HIT_MASK_FRAME_ANIM = "realHitMaskFrameAnim";

    /* renamed from: a  reason: collision with root package name */
    private static long f23220a;
    private static boolean b;
    private static long c;
    private boolean d;

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "ImageContentDetailFragmentProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : f23220a;
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        b = z;
        return z;
    }

    static {
        kge.a(31933449);
        kge.a(-719787762);
        f23220a = 0L;
        b = false;
        c = 0L;
    }

    public static long a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8033c19", new Object[]{intent})).longValue();
        }
        long j = 0;
        if (intent == null) {
            return 0L;
        }
        long longExtra = intent.getLongExtra("image_content_current_nav_token", 0L);
        if (longExtra == 0) {
            return 0L;
        }
        if (longExtra == f23220a) {
            if (b) {
                fjt.a("ImageContentDetailFragmentNavProcessor", "ImageContentMainPic download success.");
                return 0L;
            }
            long currentTimeMillis = 140 - (System.currentTimeMillis() - c);
            if (currentTimeMillis >= 0) {
                j = currentTimeMillis > 60 ? 60L : currentTimeMillis;
            }
            fjt.a("ImageContentDetailFragmentNavProcessor", "ImageContentMainPic download wait , remainTime = " + currentTimeMillis + " realWaitTime: " + j);
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    @Override // com.taobao.android.nav.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean process(android.content.Intent r10, com.taobao.android.nav.d r11) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.ugc.imagecontent.detailpage.nav.a.process(android.content.Intent, com.taobao.android.nav.d):boolean");
    }

    private void a(Intent intent, d dVar, long j) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d47275", new Object[]{this, intent, dVar, new Long(j)});
        } else if (intent == null || dVar == null) {
        } else {
            fjt.a("ImageContentDetailFragmentNavProcessor", "preloadImageContentData will check.");
            String dataString = intent.getDataString();
            if (TextUtils.isEmpty(dataString)) {
                a(intent, j);
                fjt.a("ImageContentDetailFragmentNavProcessor", "preloadImageContentData Abort. intentDataStr is null.");
                return;
            }
            Uri parse = Uri.parse(dataString);
            if ("content".equals(parse.getQueryParameter("materialType"))) {
                queryParameter = parse.getQueryParameter("contentId");
            } else {
                queryParameter = parse.getQueryParameter("id");
            }
            j a2 = k.a(flp.PRELOAD_REQUESTER_BIZ_NAME_LITE);
            if (TextUtils.isEmpty(queryParameter) || a2 == null) {
                a(intent, j);
                fjt.a("ImageContentDetailFragmentNavProcessor", "preloadImageContentData Abort. targetId or preloadTaskStore is null.");
                return;
            }
            g a3 = a2.a(fjx.b(queryParameter, fjx.a(parse)));
            if (a3 == null || !(a3.e instanceof JSONObject)) {
                a(intent, j);
                fjt.a("ImageContentDetailFragmentNavProcessor", "preloadImageContentData Abort.preloadTaskCacheData is null.");
                return;
            }
            String a4 = fjs.a(fjs.a(fjs.b(fjs.a(fjs.b((JSONObject) a3.e, "mainImage")), "data")), "url");
            if (TextUtils.isEmpty(a4)) {
                fjt.a("ImageContentDetailFragmentNavProcessor", "preloadImageContentData Abort.firstPicUrl is null.");
                return;
            }
            this.d = true;
            fjt.a("ImageContentDetailFragmentNavProcessor", "preloadImageContentData Success.hit firstPicUrl = " + a4);
            a(a4, j);
        }
    }

    private void a(Intent intent, long j) {
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2864bf3f", new Object[]{this, intent, new Long(j)});
        } else if (intent == null || (extras = intent.getExtras()) == null) {
        } else {
            String string = extras.getString("targetParams");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                String a2 = fjs.a(fjs.a(fjs.b(fjs.a(fjs.b(JSONObject.parseObject(string).getJSONObject("simpleDeliverData"), "mainImage")), "data")), "url");
                if (TextUtils.isEmpty(a2)) {
                    fjt.a("ImageContentDetailFragmentNavProcessor", "preFetchDeliverPic Abort.firstPicUrl is null.");
                    return;
                }
                fjt.a("ImageContentDetailFragmentNavProcessor", "preFetchDeliverPic Success.hit firstPicUrl = " + a2);
                a(a2, j);
            } catch (Exception e) {
                fjt.a("ImageContentDetailFragmentNavProcessor", "preFetchDeliverPic exception", e);
            }
        }
    }

    private void a(final String str, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        com.taobao.phenix.intf.b.h().a(str).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.ugc.imagecontent.detailpage.nav.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
            }

            public boolean a(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                com.taobao.phenix.intf.b.h().a(str).fetch();
                fjt.a("ImageContentDetailFragmentNavProcessor", "ImageContentMainPic download time : " + (currentTimeMillis2 - currentTimeMillis));
                if (j == a.a()) {
                    a.a(true);
                }
                return false;
            }
        }).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.ugc.imagecontent.detailpage.nav.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
            }

            public boolean a(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                fjt.a("ImageContentDetailFragmentNavProcessor", "ImageContentMainPic download time : " + (currentTimeMillis2 - currentTimeMillis));
                if (j == a.a()) {
                    a.a(true);
                }
                return false;
            }
        }).fetch();
    }
}
