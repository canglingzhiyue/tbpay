package com.taobao.taolive.room.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.JoinNotifyMessage;
import java.text.DecimalFormat;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static DecimalFormat f21776a;
    private static DecimalFormat b;
    private static DecimalFormat c;
    private static DecimalFormat d;
    private static DecimalFormat e;

    static {
        kge.a(897453258);
        f21776a = new DecimalFormat("#.#");
        b = new DecimalFormat("0.0");
        c = new DecimalFormat("#.##");
        d = new DecimalFormat("#.#");
        e = new DecimalFormat("#.##");
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "ShowPv", "true"));
    }

    public static long a(JoinNotifyMessage joinNotifyMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1c038ee", new Object[]{joinNotifyMessage})).longValue();
        }
        if (joinNotifyMessage == null) {
            return 0L;
        }
        if (a()) {
            return joinNotifyMessage.pageViewCount;
        }
        return joinNotifyMessage.totalCount;
    }

    public static long a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ead9f959", new Object[]{videoInfo})).longValue();
        }
        if (videoInfo == null) {
            return 0L;
        }
        if (c(videoInfo)) {
            return videoInfo.taolivePv;
        }
        if (a()) {
            return videoInfo.viewCount;
        }
        return videoInfo.totalJoinCount;
    }

    public static String b(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af50e15c", new Object[]{videoInfo});
        }
        if (videoInfo == null) {
            return null;
        }
        if (c(videoInfo)) {
            return videoInfo.taolivePvFormat;
        }
        return videoInfo.viewCountFormat;
    }

    public static boolean c(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("468b2e27", new Object[]{videoInfo})).booleanValue() : videoInfo != null && (videoInfo.newRoomType & 256) == 256;
    }

    public static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        if (com.taobao.taolive.sdk.utils.p.c()) {
            return d(j);
        }
        return b(j);
    }

    private static String d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("569b4c87", new Object[]{new Long(j)});
        }
        if (j < 100000) {
            return String.valueOf(j);
        }
        if (j >= 10000000) {
            return "1000万+";
        }
        return f21776a.format(j / 10000.0d) + "万";
    }

    public static String b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2381a05", new Object[]{new Long(j)});
        }
        if (j < 100000) {
            return String.valueOf(j);
        }
        if (j < 100000000) {
            return f21776a.format(j / 10000.0d) + "万";
        }
        return c.format(j / 1.0E8d) + "亿";
    }

    public static String c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c69b346", new Object[]{new Long(j)});
        }
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j < 100000000) {
            return f21776a.format(j / 10000.0d) + "万";
        }
        return c.format(j / 1.0E8d) + "亿";
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "￥0";
        }
        try {
            return a(Float.parseFloat(str));
        } catch (Exception unused) {
            return "￥" + str;
        }
    }

    public static String a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d97f2748", new Object[]{new Float(f)});
        }
        if (f >= 1.0E7f) {
            return "￥" + Math.floor(f / 1.0E7f) + "千万";
        } else if (f >= 100000.0f) {
            return "￥" + (((float) Math.floor(f / 1000.0f)) / 10.0f) + "万";
        } else {
            return "￥" + f;
        }
    }
}
