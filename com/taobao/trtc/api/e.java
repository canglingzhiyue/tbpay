package com.taobao.trtc.api;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.impl.TrtcEngineImpl;
import com.taobao.trtc.utils.TrtcLog;
import tb.kge;
import tb.qvb;

/* loaded from: classes9.dex */
public abstract class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f23056a;

    static {
        kge.a(1763515667);
    }

    public abstract ITrtcInputStream a(String str, TrtcStreamConfig trtcStreamConfig, ITrtcInputStream.a aVar);

    public abstract void a(TrtcDefines.g gVar);

    public abstract void a(TrtcDefines.l lVar);

    public abstract void a(String str);

    public abstract void a(String str, String str2);

    public abstract void a(String str, String str2, int i);

    public abstract void a(String str, String str2, String str3);

    public abstract boolean a(TrtcConfig trtcConfig) throws TrtcException;

    public abstract ITrtcOutputStream b(String str);

    public abstract void b() throws TrtcException;

    public abstract void b(TrtcDefines.g gVar);

    public abstract void c() throws TrtcException;

    public abstract void c(String str);

    public abstract String d(String str);

    public abstract TrtcVideoDevice f();

    public abstract TrtcAudioDevice g();

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        boolean b = qvb.a().b();
        TrtcLog.d("TrtcEngine", "RemoteSo checkIsReady: " + b);
        return b;
    }

    public static e a(Context context) throws TrtcException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("e2db7b30", new Object[]{context}) : new TrtcEngineImpl(context);
    }
}
