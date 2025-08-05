package com.taobao.taolive.room.controller2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.ai;
import java.util.HashMap;
import java.util.Map;
import tb.ddw;
import tb.kge;

/* loaded from: classes8.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f21602a;
    private int b = 0;

    private String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)}) : i != 0 ? i != 1 ? i != 2 ? "" : "STATE_ON_DID_APPEAR" : "STATE_ON_WILL_APPEAR" : "STATE_INIT";
    }

    static {
        kge.a(212625469);
        f21602a = l.class.getSimpleName();
    }

    public void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abeff0c6", new Object[]{this, aVar, str, new Integer(i), str2});
            return;
        }
        String str3 = f21602a;
        ab.c(str3, "onWillAppear liveContextKey = " + str2 + " hash = " + i);
        int i2 = this.b;
        if (i2 == 0) {
            this.b = 1;
        } else {
            a(aVar, str, i, str2, i2, "onWillAppear");
            this.b = 1;
        }
        if (!aa.dm()) {
            return;
        }
        ddw.a().a("com.taobao.taolive.room.updownswitch.willappear");
    }

    public void b(com.taobao.alilive.aliliveframework.frame.a aVar, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a770207", new Object[]{this, aVar, str, new Integer(i), str2});
            return;
        }
        String str3 = f21602a;
        ab.c(str3, "onDidAppear liveContextKey = " + str2 + " hash = " + i);
        int i2 = this.b;
        if (i2 == 1) {
            this.b = 2;
            return;
        }
        a(aVar, str, i, str2, i2, "onDidAppear");
        this.b = 2;
    }

    public void c(com.taobao.alilive.aliliveframework.frame.a aVar, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88fe1348", new Object[]{this, aVar, str, new Integer(i), str2});
            return;
        }
        String str3 = f21602a;
        ab.c(str3, "onWillDisAppear liveContextKey = " + str2 + " hash = " + i);
        int i2 = this.b;
        if (i2 == 1) {
            this.b = 0;
            return;
        }
        a(aVar, str, i, str2, i2, "onWillDisappear");
        this.b = 0;
    }

    public void d(com.taobao.alilive.aliliveframework.frame.a aVar, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7852489", new Object[]{this, aVar, str, new Integer(i), str2});
            return;
        }
        String str3 = f21602a;
        ab.c(str3, "onDidDisAppear liveContextKey = " + str2 + " hash = " + i);
        int i2 = this.b;
        if (i2 == 2) {
            this.b = 0;
            return;
        }
        a(aVar, str, i, str2, i2, "onDidDisappear");
        this.b = 0;
    }

    public void e(com.taobao.alilive.aliliveframework.frame.a aVar, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("660c35ca", new Object[]{this, aVar, str, new Integer(i), str2});
            return;
        }
        String str3 = f21602a;
        ab.c(str3, "onDestroy liveContextKey = " + str2 + " hash = " + i);
        this.b = 0;
    }

    private void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, int i, String str2, int i2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed83df87", new Object[]{this, aVar, str, new Integer(i), str2, new Integer(i2), str3});
            return;
        }
        String str4 = f21602a;
        ab.c(str4, "reportError curState" + a(i2) + " opportunity = " + str3 + " liveContextKey = " + str2 + " hash = " + i);
        HashMap hashMap = new HashMap();
        hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, str);
        hashMap.put("curState", a(i2));
        hashMap.put("opportunity", str3);
        ai.a(aVar, "LifeCycleMistake", (Map<String, String>) hashMap);
    }
}
