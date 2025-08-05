package com.ut.share;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.ut.share.utils.ShareLinkWrapper;
import tb.kge;

/* loaded from: classes9.dex */
public class ShareServiceApi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2082713458);
    }

    public static String shortenURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aaf7dde5", new Object[]{str});
        }
        if (str != null) {
            return ShareLinkWrapper.shortenURL(str);
        }
        return null;
    }

    public static String urlBackFlow(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5b473c57", new Object[]{str, str2, str3}) : ShareLinkWrapper.wrapShareLink(str, str2, str3);
    }

    public static void commitUT(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5b15bb", new Object[]{str, str2, str3});
        } else {
            TBS.Ext.commitEvent(5002, str, str2, str3);
        }
    }
}
