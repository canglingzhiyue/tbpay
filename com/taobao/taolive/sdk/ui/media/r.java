package com.taobao.taolive.sdk.ui.media;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import tb.kge;

/* loaded from: classes8.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1343593833);
    }

    public static e a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("cb723057", new Object[]{hVar});
        }
        if (hVar != null) {
            return new f(hVar);
        }
        return null;
    }

    public static d b(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("e5e32957", new Object[]{hVar});
        }
        if (hVar != null) {
            return new f(hVar);
        }
        return null;
    }

    public static String a(MediaData mediaData, String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c4cb3ce", new Object[]{mediaData, str});
        }
        if (mediaData != null && mediaData.liveUrlList != null && mediaData.liveUrlList.size() > 1 && mediaData.liveUrlList.get(1) != null) {
            str = mediaData.liveUrlList.get(1).rtcLiveUrl != null ? mediaData.liveUrlList.get(1).rtcLiveUrl : null;
            if (TextUtils.isEmpty(str) && mediaData.liveUrlList.get(1).flvUrl != null) {
                str = mediaData.liveUrlList.get(1).flvUrl;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                String[] split = new URI(str).getPath().split("/");
                if (split.length - 1 >= 0) {
                    String str2 = split[split.length - 1];
                    return (str2 == null || (indexOf = str2.indexOf(".")) < 0) ? str2 : str2.substring(0, indexOf);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
