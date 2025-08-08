package com.taobao.taolive.room.openarchitecture.single;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.t;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.kge;
import tb.ply;
import tb.plz;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-515909430);
    }

    public static String a(long j, long j2, boolean z, String str, VideoInfo videoInfo, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73d0616f", new Object[]{new Long(j), new Long(j2), new Boolean(z), str, videoInfo, context});
        }
        if (context != null && videoInfo != null && (j2 > j || z)) {
            try {
                return (!ply.X() || StringUtils.isEmpty(str)) ? plz.a(videoInfo) ? context.getString(R.string.taolive_topbar_online_number_for_taolive_flexalocal, t.a(j2)) : context.getString(R.string.taolive_topbar_online_number_flexalocal, t.a(j2)) : str;
            } catch (Exception unused) {
            }
        }
        return "0";
    }
}
