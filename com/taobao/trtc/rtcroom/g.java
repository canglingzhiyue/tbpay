package com.taobao.trtc.rtcroom;

import android.content.Context;
import android.os.PowerManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.utils.TrtcLog;
import tb.kge;

/* loaded from: classes9.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f23171a;
    private PowerManager.WakeLock b;

    static {
        kge.a(-531604834);
        f23171a = g.class.getName();
    }

    public g(Context context) {
        this.b = ((PowerManager) context.getSystemService("power")).newWakeLock(536870922, "trtc:rtc-room");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            this.b.acquire();
            String str = f23171a;
            TrtcLog.d(str, "PM, acquire wakelock: " + this.b.toString());
        } catch (Exception e) {
            String str2 = f23171a;
            TrtcLog.a(str2, "exception: " + e.getMessage());
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            this.b.release();
            String str = f23171a;
            TrtcLog.d(str, "PM, release wakelock: " + this.b.toString());
        } catch (Exception e) {
            String str2 = f23171a;
            TrtcLog.a(str2, "exception: " + e.getMessage());
        }
    }
}
