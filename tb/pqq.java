package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.taolivemorelive.common.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class pqq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ACCOUNT_ID = "account_id";
    public static final String KEY_ENTRY_SCM = "entryScm";
    public static final String KEY_ENTRY_SPM = "entrySpm";
    public static final String KEY_FEED_ID = "feed_id";
    public static final String KEY_LIVE_ADPARAMS = "liveAdParams";
    public static final String KEY_LIVE_ENTRY_LIVE_SOURCE = "entryLiveSource";
    public static final String KEY_LIVE_ENTRY_SOURCE = "entrySource";
    public static final String KEY_LIVE_SOURCE = "liveSource";
    public static final String KEY_NEW_ROOMTYPE = "newRoomType";
    public static final String KEY_ROOMTYPE = "roomType";
    public static final String KEY_SPM_URL = "spm-url";
    public static final String KEY_TRACKINFO = "trackInfo";
    public static final String PAGE_TAOLIVE_WATCH = "Page_TaobaoLiveWatch";

    public static a a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6712b19d", new Object[]{aVar});
        }
        a aVar2 = new a();
        aVar2.f(poy.L(aVar));
        aVar2.e(poy.ac(aVar));
        aVar2.a(poy.R(aVar));
        aVar2.b(poy.T(aVar));
        aVar2.c(poy.U(aVar));
        aVar2.g(poy.K(aVar));
        if (!l.e(poy.Z(aVar))) {
            aVar2.d(Uri.encode(poy.Z(aVar)));
        }
        return aVar2;
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54c20ebe", new Object[]{aVar, str, map});
        } else if (pmd.a().e() == null) {
        } else {
            b(aVar, str, map);
        }
    }

    public static void b(com.taobao.alilive.aliliveframework.frame.a aVar, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc3de87f", new Object[]{aVar, str, map});
        } else if (pmd.a().e() == null) {
        } else {
            if (map == null) {
                map = new HashMap<>();
            }
            a a2 = a(aVar);
            map.put(KEY_LIVE_SOURCE, a2.e());
            map.put("entrySource", a2.a());
            map.put("entryLiveSource", a2.a());
            map.put("entrySpm", a2.b());
            map.put(KEY_ENTRY_SCM, a2.c());
            if (!TextUtils.isEmpty(a2.f())) {
                map.put("trackInfo", a2.f());
            }
            map.put("liveAdParams", Uri.encode(a2.d()));
            VideoInfo u = poy.u(aVar);
            if (u != null) {
                map.put("roomType", String.valueOf(u.roomType));
                map.put("newRoomType", String.valueOf(u.newRoomType));
                map.put("feed_id", u.liveId);
                map.put("account_id", u.broadCaster != null ? u.broadCaster.accountId : "");
            }
            pmd.a().e().a("Page_TaobaoLiveWatch", str, map);
        }
    }

    public static void c(com.taobao.alilive.aliliveframework.frame.a aVar, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b9c240", new Object[]{aVar, str, map});
        } else if (pmd.a().e() == null) {
        } else {
            d(aVar, str, map);
        }
    }

    public static void d(com.taobao.alilive.aliliveframework.frame.a aVar, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b359c01", new Object[]{aVar, str, map});
        } else if (pmd.a().e() == null) {
        } else {
            if (map == null) {
                map = new HashMap<>();
            }
            a a2 = a(aVar);
            map.put(KEY_LIVE_SOURCE, a2.e());
            map.put("entrySource", a2.a());
            map.put("entryLiveSource", a2.a());
            map.put("entrySpm", a2.b());
            map.put(KEY_ENTRY_SCM, a2.c());
            map.put("spm-url", a2.g());
            if (!TextUtils.isEmpty(a2.f())) {
                map.put("trackInfo", a2.f());
            }
            map.put("liveAdParams", Uri.encode(a2.d()));
            VideoInfo u = poy.u(aVar);
            if (u != null) {
                map.put("roomType", String.valueOf(u.roomType));
                map.put("newRoomType", String.valueOf(u.newRoomType));
                map.put("feed_id", u.liveId);
                map.put("account_id", u.broadCaster != null ? u.broadCaster.accountId : "");
            }
            if (pmd.a().e() == null) {
                return;
            }
            pmd.a().e().b("Page_TaobaoLiveWatch", str, map);
        }
    }
}
