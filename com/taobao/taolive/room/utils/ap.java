package com.taobao.taolive.room.utils;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.search.common.util.i;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.poy;

/* loaded from: classes8.dex */
public class ap {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f21761a;
    public static long b;
    public static boolean c;
    public static long d;
    public static boolean e;
    public static boolean f;

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e79dfff1", new Object[]{aVar, str, str2});
        } else if (aVar == null) {
        } else {
            Map<String, String> b2 = b(aVar, str);
            if (str2 == null || str2.isEmpty() || ag.SOURCE_UPDOWNSWITCH.equalsIgnoreCase(str)) {
                str2 = String.valueOf(f21761a);
            }
            b2.put("enterClickTs", str2);
            b2.put("onCreateTs", String.valueOf(b));
            ai.b("live_room_page_will_appear", b2);
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc30e1e7", new Object[]{aVar, str});
        } else if (aVar == null) {
        } else {
            ai.b("live_room_page_did_appear", b(aVar, str));
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738edca7", new Object[]{aVar, str, new Long(j), new Long(j2)});
        } else if (aVar == null) {
        } else {
            Map<String, String> b2 = b(aVar, str);
            b2.put("startPlayTs", String.valueOf(j));
            b2.put("decodeCompleteTs", String.valueOf(j2));
            ai.b("live_room_page_first_frame_finish", b2);
        }
    }

    static {
        kge.a(-1381405422);
        d = 0L;
    }

    public static void a(Context context) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        HashMap hashMap = new HashMap();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.getIntent() != null && (data = activity.getIntent().getData()) != null) {
                hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, data.getQueryParameter("id"));
            }
        }
        hashMap.put(i.b.MEASURE_ONCREATE, String.valueOf(d));
        long uptimeMillis = SystemClock.uptimeMillis();
        hashMap.put("surfaceRenderFirstFrame", String.valueOf(uptimeMillis));
        hashMap.put("duration", String.valueOf(uptimeMillis - d));
        ai.b("live_room_page_onSurfaceRender_finsh", hashMap);
    }

    private static Map<String, String> b(com.taobao.alilive.aliliveframework.frame.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("39f37dfb", new Object[]{aVar, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        hashMap.put("liveToken", aVar.j());
        hashMap.put("livesource", str);
        hashMap.put("entryLiveSource", poy.R(aVar));
        return hashMap;
    }
}
