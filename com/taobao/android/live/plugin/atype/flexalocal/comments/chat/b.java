package com.taobao.android.live.plugin.atype.flexalocal.comments.chat;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.v;
import java.net.URI;
import java.util.HashMap;
import tb.kge;
import tb.pmd;
import tb.pnj;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AB_KEY_EVERYBODY_SAYS_CLUSTER = "everyBodySaysCluster";
    public static final String ORANGE_KEY_CHAT_MESSAGES_UPDATE_INTERVAL = "commentUpdateInterval";
    public static final String ORANGE_KEY_CHAT_MESSAGES_UPDATE_SIZE = "normalCommentUpdateQps";
    public static final String ORANGE_KEY_ENABLE_ADD_ONE = "enableChatAddOne";
    public static final String ORANGE_KEY_ENABLE_COMMENT_RATE = "enableCommentRate";
    public static final String ORANGE_KEY_ENABLE_EVERY_SAYS_CLUSTER = "enableEveryBodySaysCluster";
    public static final String ORANGE_KEY_ENABLE_FOLLOW_SHARE_CLUSTER = "enableFollowShareCluster";
    public static final String ORANGE_KEY_ENABLE_SAYS_CLUSTER_ADD_ONE = "enableSaysClusterAddOne";
    public static final String ORANGE_KEY_EVERY_SAYS_CLUSTER_DURATION = "commentSaysClusterDuration";
    public static final String TBLIVE_AB_GROUP = "taolive";
    public static final String TBLIVE_ORANGE_GROUP = "tblive";

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f13610a;
    private static int b;
    private static int c;
    private static int d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", ORANGE_KEY_ENABLE_COMMENT_RATE, "true"));
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : v.b(pmd.a().d().a("tblive", ORANGE_KEY_CHAT_MESSAGES_UPDATE_INTERVAL, "500"));
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue() : v.b(pmd.a().d().a("tblive", ORANGE_KEY_CHAT_MESSAGES_UPDATE_SIZE, "2"));
    }

    static {
        kge.a(-557461135);
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        g = 0;
        h = 0;
        f13610a = new Handler(Looper.getMainLooper());
    }

    public static int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("631b569", new Object[0])).intValue();
        }
        int i = b;
        if (i > 0) {
            return i;
        }
        int b2 = v.b(pmd.a().d().a("tblive", "getWarmOptCommentUpdateInterval", "500"));
        b = b2;
        return b2;
    }

    public static int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fccea", new Object[0])).intValue();
        }
        int i = g;
        if (i > 0) {
            return i;
        }
        int b2 = v.b(pmd.a().d().a("tblive", "getWarmOptChatFrameTriggerThird", "2500"));
        g = b2;
        return b2;
    }

    public static int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64de46b", new Object[0])).intValue();
        }
        int i = h;
        if (i > 0) {
            return i;
        }
        int b2 = v.b(pmd.a().d().a("tblive", "getWarmOptChatFrameTriggerFourth", "8500"));
        h = b2;
        return b2;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", ORANGE_KEY_ENABLE_ADD_ONE, "false"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", ORANGE_KEY_ENABLE_SAYS_CLUSTER_ADD_ONE, "true"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", ORANGE_KEY_ENABLE_EVERY_SAYS_CLUSTER, "true"));
    }

    public static int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[0])).intValue() : v.b(pmd.a().d().a("tblive", ORANGE_KEY_EVERY_SAYS_CLUSTER_DURATION, "3"));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : f();
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", ORANGE_KEY_ENABLE_FOLLOW_SHARE_CLUSTER, "true"));
    }

    public static String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[0]) : pmd.a().d().a("tblive", "avatarMixCommentMessage", "欢迎来到%s直播间");
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "fusionCommentSwitch", "false"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enablePersonalityNotice", "true"));
    }

    public static int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[0])).intValue() : v.a(pmd.a().d().a("tblive", "maxCntPersonalityNotice", "1"), 1);
    }

    public static String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[0]) : pmd.a().d().a("tblive", "personalityNoticeRegStr", "欢迎来到.*直播间，关注主播可享更多优惠福利");
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        pnj m = pmd.a().m();
        m.b("tlChat." + str, str2);
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            f13610a.post(runnable);
        }
    }

    public static HashMap<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a40d9915", new Object[]{str});
        }
        String query = URI.create(str).getQuery();
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : query.split("&")) {
            String[] split = str2.split("=");
            hashMap.put(split[0], split[1]);
        }
        return hashMap;
    }
}
