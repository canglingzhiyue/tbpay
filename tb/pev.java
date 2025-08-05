package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class pev {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : pew.a(pmd.a().d().a("tblive", "liveMessageDeduplicationSize", "10000"));
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : pmd.a().d().a("tblive", "liveMessageDefaultColorRate", "{\"10036\":100000,\"10086\":100000,\"10131\":100000,\"10132\":100000}");
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : pew.b(pmd.a().d().a("tblive", "liveMessageUseCdnFetchMSG", "true"));
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue() : pew.a(pmd.a().d().a("tblive", "liveMessageCDNInterval", "5"));
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[0])).intValue() : pew.a(pmd.a().d().a("tblive", "liveMessageCDNMaxInterval", "10"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : pew.b(pmd.a().d().a("tblive", "isAddDeviceIdCdnFetchMSG", "true"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : pew.b(pmd.a().d().a("tblive", "isNeedCDNMessageGet", "true"));
    }

    public static int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[0])).intValue() : pew.a(pmd.a().d().a("tblive", "timeoutCDNMessageGet", "3000"));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : pew.b(pmd.a().d().a("tblive", "liveMessageLongPullDisable", "false"));
    }

    public static int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[0])).intValue() : pew.a(pmd.a().d().a("tblive", "timeOutCNDLongPull", "15000"));
    }

    public static String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[0]) : pmd.a().d().a("tblive", "liveMessageCDNUrl", "https://impaas.alicdn.com/live/message/");
    }

    public static String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[0]) : pmd.a().d().a("tblive", "liveMessageLongFetchCDNUrl", "https://livemsgconnect.taobao.com/live/message/");
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : pew.b(pmd.a().d().a("tblive", "liveMessageUseHeartbeat", "true"));
    }

    public static int n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de8", new Object[0])).intValue() : pew.a(pmd.a().d().a("tblive", "liveMessageHeartbeatInterval", "5"));
    }

    public static int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[0])).intValue() : pew.a(pmd.a().d().a("tblive", "liveMessageHeartFetchStatusInterval", "1"));
    }

    public static String p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ccd489", new Object[0]) : pmd.a().d().a("tblive", "liveMessageCommonExtraParams", "account_id;feed_id;livesource;livestatus;clickid;isAD;roomType;newRoomType;isChatRoom;roomStatus;streamStatus;scene;");
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue();
        }
        if (!pew.b(pmd.a().d().a("tblive", "enableCommentUseLMSDK", "true"))) {
            return false;
        }
        return pew.b(pmd.a().t().a("taolive", "enableCommentUseLMSDK", "enable", "false"));
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : pew.b(pmd.a().d().a("tblive", "enableUTFullLink", "false"));
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : pew.b(pmd.a().d().a("tblive", "stopHeartbeatDisable", "true"));
    }
}
