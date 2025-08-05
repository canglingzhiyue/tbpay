package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.model.SimpleLiveInfo;
import com.taobao.android.miniLive.services.c;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class huf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1111659933);
    }

    public static void a(String str, String str2, Map<String, String> map) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
        } else if (pmd.a().e() == null) {
        } else {
            if (!TextUtils.isEmpty(str)) {
                str3 = "Page_TBMiniLive_" + str;
            } else {
                str3 = htz.UT_PAGE_NAME;
            }
            pmd.a().e().a(str3, str2, map);
        }
    }

    public static void b(String str, String str2, Map<String, String> map) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{str, str2, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (pmd.a().e() == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            str3 = "Page_TBMiniLive_" + str;
        } else {
            str3 = htz.UT_PAGE_NAME;
        }
        pmd.a().e().b(str3, str3 + "-" + str2, map);
    }

    public static void a(SimpleLiveInfo simpleLiveInfo, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18fc304a", new Object[]{simpleLiveInfo, str, str2, str3});
        } else {
            a(simpleLiveInfo, str, str2, str3, (String) null);
        }
    }

    public static void a(SimpleLiveInfo simpleLiveInfo, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a559b94", new Object[]{simpleLiveInfo, str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        if (simpleLiveInfo != null) {
            hashMap.put("feedId", simpleLiveInfo.liveId);
            if (simpleLiveInfo.broadCaster != null) {
                hashMap.put("accountId", simpleLiveInfo.broadCaster.accountId);
            }
        }
        hashMap.put("mute", "true");
        hashMap.put("source", str2);
        if (pmd.a().q() != null) {
            hashMap.put("userId", pmd.a().q().a());
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("algParams", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("spm-cnt", str4);
        }
        b(str2, str, hashMap);
    }

    public static void a(VideoInfo videoInfo, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88678c8d", new Object[]{videoInfo, str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        if (videoInfo != null) {
            hashMap.put("feedId", videoInfo.liveId);
            if (videoInfo.broadCaster != null) {
                hashMap.put("accountId", videoInfo.broadCaster.accountId);
            }
        }
        hashMap.put("mute", "false");
        hashMap.put("source", str2);
        if (pmd.a().q() != null) {
            hashMap.put("userId", pmd.a().q().a());
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("algParams", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("spm-cnt", str4);
        }
        b(str2, str, hashMap);
    }

    public static void b(VideoInfo videoInfo, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4a0dfec", new Object[]{videoInfo, str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        if (videoInfo != null) {
            hashMap.put("feedId", videoInfo.liveId);
            if (videoInfo.broadCaster != null) {
                hashMap.put("accountId", videoInfo.broadCaster.accountId);
            }
        } else if (!TextUtils.isEmpty(c.a().c())) {
            hashMap.put("feedId", c.a().c());
        }
        hashMap.put("mute", "false");
        hashMap.put("source", str2);
        if (pmd.a().q() != null) {
            hashMap.put("userId", pmd.a().q().a());
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("algParams", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("spm-cnt", str4);
        }
        a(str2, str, hashMap);
    }

    public static void b(SimpleLiveInfo simpleLiveInfo, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa086acb", new Object[]{simpleLiveInfo, str, str2, str3});
        } else {
            b(simpleLiveInfo, str, str2, str3, (String) null);
        }
    }

    public static void b(SimpleLiveInfo simpleLiveInfo, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6297d5", new Object[]{simpleLiveInfo, str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        if (simpleLiveInfo != null) {
            hashMap.put("feedId", simpleLiveInfo.liveId);
            if (simpleLiveInfo.broadCaster != null) {
                hashMap.put("accountId", simpleLiveInfo.broadCaster.accountId);
            }
            if (simpleLiveInfo.item != null) {
                hashMap.put("itemId", simpleLiveInfo.item.itemId);
            }
        } else if (!TextUtils.isEmpty(c.a().c())) {
            hashMap.put("feedId", c.a().c());
        }
        hashMap.put("mute", "true");
        hashMap.put("source", str2);
        if (pmd.a().q() != null) {
            hashMap.put("userId", pmd.a().q().a());
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("algParams", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("spm-cnt", str4);
        }
        a(str2, str, hashMap);
    }
}
