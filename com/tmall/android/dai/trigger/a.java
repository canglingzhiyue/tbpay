package com.tmall.android.dai.trigger;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.usertrack.UTExt;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import com.tmall.android.dai.internal.util.h;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.rkq;
import tb.rkr;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1073449510);
    }

    public static Map<String, String> a(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("67a60f2a", new Object[]{userTrackDO});
        }
        Map<String, Object> b = b(userTrackDO);
        HashMap hashMap = new HashMap(b.size());
        for (String str : b.keySet()) {
            hashMap.put(str, String.valueOf(b.get(str)));
        }
        return hashMap;
    }

    public static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    String str = map.get(key);
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(key);
                    sb.append("=");
                    if (str == null) {
                        sb.append("");
                    } else {
                        sb.append(str);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static Map<String, Object> b(UserTrackDO userTrackDO) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2eb1f62b", new Object[]{userTrackDO});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", "utext");
        String pageName = userTrackDO.getPageName();
        String str2 = "";
        if (!TextUtils.isEmpty(pageName)) {
            int pageNameSizeForUtext = userTrackDO.getPageNameSizeForUtext();
            if (pageNameSizeForUtext > 0 && pageNameSizeForUtext < pageName.length()) {
                hashMap.put("page", pageName.substring(0, pageNameSizeForUtext));
                hashMap.put("extraEventId", pageName.substring(pageNameSizeForUtext + 1));
            } else {
                hashMap.put("page", str2);
            }
        }
        hashMap.put("eventId", userTrackDO.getEventId() + str2);
        hashMap.put("arg1", userTrackDO.getArg1() == null ? str2 : userTrackDO.getArg1());
        hashMap.put("arg2", userTrackDO.getArg2() == null ? str2 : userTrackDO.getArg2());
        hashMap.put("arg3", userTrackDO.getArg3() == null ? str2 : userTrackDO.getArg3());
        Map<String, String> args = userTrackDO.getArgs();
        hashMap.put("args", a(args));
        if (rkr.a() != null) {
            String userId = rkr.a().getUserId();
            if (userId == null) {
                userId = str2;
            }
            hashMap.put("ownerId", userId);
        }
        if (userTrackDO.getAuctionId() <= 0) {
            userTrackDO.setAuctionId(h.a(args.get("item_id"), 0L));
        }
        if (userTrackDO.getAuctionId() == 0) {
            str = str2;
        } else {
            str = userTrackDO.getAuctionId() + str2;
        }
        hashMap.put("auctionId", str);
        hashMap.put("pageStayTime", userTrackDO.getPageStayTime() + str2);
        if (TextUtils.equals(userTrackDO.getArg3(), UTExt.ARG3_USE_NEW_UTEXT)) {
            hashMap.put("createTime", userTrackDO.getCreateTime() + str2);
        } else {
            hashMap.put("createTime", userTrackDO.getArg3() + str2);
        }
        if (userTrackDO.getSesionId() != null) {
            str2 = userTrackDO.getSesionId();
        }
        hashMap.put("sessionId", str2);
        return hashMap;
    }

    public static Map<String, String> c(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f5bddd2c", new Object[]{userTrackDO});
        }
        HashMap hashMap = new HashMap(16);
        if (userTrackDO != null) {
            try {
                Map<String, Object> d = d(userTrackDO);
                for (String str : d.keySet()) {
                    hashMap.put(str, String.valueOf(d.get(str)));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return hashMap;
    }

    public static Map<String, Object> d(UserTrackDO userTrackDO) {
        String str = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bcc9c42d", new Object[]{userTrackDO});
        }
        HashMap hashMap = new HashMap(16);
        if (userTrackDO != null) {
            try {
                hashMap.put("id", rkq.d().l() + str);
                hashMap.put("page", userTrackDO.getPageName() == null ? str : userTrackDO.getPageName());
                hashMap.put("eventId", Integer.valueOf(userTrackDO.getEventId()));
                hashMap.put("arg1", userTrackDO.getArg1() == null ? str : userTrackDO.getArg1());
                hashMap.put("arg2", userTrackDO.getArg2() == null ? str : userTrackDO.getArg2());
                hashMap.put("arg3", userTrackDO.getArg3() == null ? str : userTrackDO.getArg3());
                Map<String, String> args = userTrackDO.getArgs();
                StringBuilder sb = new StringBuilder();
                if (args != null) {
                    for (Map.Entry<String, String> entry : args.entrySet()) {
                        String key = entry.getKey();
                        if (key != null) {
                            String str2 = args.get(key);
                            if (sb.length() > 0) {
                                sb.append(",");
                            }
                            sb.append(key);
                            sb.append("=");
                            if (str2 == null) {
                                sb.append(str);
                            } else {
                                sb.append(String.valueOf(str2));
                            }
                        }
                    }
                }
                hashMap.put("args", sb.toString());
                hashMap.put("ownerId", userTrackDO.getOwnerId() == null ? str : userTrackDO.getOwnerId());
                hashMap.put("auctionId", userTrackDO.getAuctionId() == 0 ? str : userTrackDO.getAuctionId() + str);
                hashMap.put("pageStayTime", userTrackDO.getPageStayTime() + str);
                hashMap.put("createTime", userTrackDO.getCreateTime() + str);
                if (userTrackDO.getSesionId() != null) {
                    str = userTrackDO.getSesionId();
                }
                hashMap.put("sessionId", str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return hashMap;
    }
}
