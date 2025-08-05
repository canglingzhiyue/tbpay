package com.taobao.tao.remotebusiness.login;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.RequestPoolManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.ErrorConstant;
import tb.kge;

/* loaded from: classes8.dex */
public class f extends Handler implements i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LOGIN_CANCEL = 911103;
    public static final int LOGIN_FAILED = 911102;
    public static final int LOGIN_SUCCESS = 911101;
    public static final int LOGIN_TIMEOUT = 911104;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, f> f21036a;
    private static HandlerThread b;
    private Mtop c;
    private String d;

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-824716848);
        kge.a(917217071);
        f21036a = new ConcurrentHashMap();
    }

    private f(Mtop mtop, String str, Looper looper) {
        super(looper);
        this.c = mtop;
        this.d = str;
    }

    public static f a(Mtop mtop, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("fc77125", new Object[]{mtop, str});
        }
        Mtop instance = mtop == null ? Mtop.instance(null) : mtop;
        if (StringUtils.isBlank(str)) {
            str = "DEFAULT";
        }
        String b2 = b(mtop, str);
        f fVar = f21036a.get(b2);
        if (fVar == null) {
            synchronized (f.class) {
                fVar = f21036a.get(b2);
                if (fVar == null) {
                    if (b == null) {
                        HandlerThread handlerThread = new HandlerThread("mtopsdk.LoginHandler");
                        b = handlerThread;
                        handlerThread.start();
                    }
                    fVar = new f(instance, str, b.getLooper());
                    f21036a.put(b2, fVar);
                }
            }
        }
        return fVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        String b2 = b(this.c, this.d);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
            TBSdkLog.e("mtopsdk.LoginHandler", b2 + " [handleMessage]The MtopBusiness LoginHandler receive message .");
        }
        switch (message.what) {
            case 911101:
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    TBSdkLog.e("mtopsdk.LoginHandler", b2 + " [handleMessage]onReceive: NOTIFY_LOGIN_SUCCESS.");
                }
                a(b2);
                RequestPoolManager.a(RequestPoolManager.Type.SESSION).a(this.c, this.d);
                removeMessages(911104);
                break;
            case 911102:
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    TBSdkLog.e("mtopsdk.LoginHandler", b2 + "[handleMessage]onReceive: NOTIFY_LOGIN_FAILED.");
                }
                RequestPoolManager.a(RequestPoolManager.Type.SESSION).a(this.c, this.d, ErrorConstant.ERRCODE_ANDROID_SYS_LOGIN_FAIL, ErrorConstant.ERRMSG_ANDROID_SYS_LOGIN_FAIL);
                removeMessages(911104);
                break;
            case 911103:
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    TBSdkLog.e("mtopsdk.LoginHandler", b2 + "[handleMessage]onReceive: NOTIFY_LOGIN_CANCEL.");
                }
                RequestPoolManager.a(RequestPoolManager.Type.SESSION).a(this.c, this.d, "ANDROID_SYS_LOGIN_CANCEL", ErrorConstant.ERRMSG_ANDROID_SYS_LOGIN_CANCEL);
                removeMessages(911104);
                break;
            case 911104:
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    TBSdkLog.e("mtopsdk.LoginHandler", b2 + "[handleMessage]onReceive: NOTIFY_LOGIN_TIMEOUT.");
                }
                if (h.a(this.c, this.d)) {
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                        TBSdkLog.e("mtopsdk.LoginHandler", "Session valid, Broadcast may missed!");
                    }
                    a(b2);
                    RequestPoolManager.a(RequestPoolManager.Type.SESSION).a(this.c, this.d);
                    break;
                }
                break;
        }
        com.taobao.tao.remotebusiness.a a2 = com.taobao.tao.remotebusiness.c.a();
        if (a2 == null) {
            return;
        }
        a2.a(message.what, this.c);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        e b2 = h.b(this.c, this.d);
        if (b2 == null) {
            TBSdkLog.e("mtopsdk.LoginHandler", str + " [updateXStateSessionInfo] LoginContext is null.");
            return;
        }
        try {
            if (!StringUtils.isNotBlank(b2.f21035a) || b2.f21035a.equals(this.c.getMultiAccountSid(this.d))) {
                return;
            }
            this.c.registerMultiAccountSession(this.d, b2.f21035a, b2.b);
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                return;
            }
            TBSdkLog.e("mtopsdk.LoginHandler", str + " [updateXStateSessionInfo] invoked.");
        } catch (Exception e) {
            TBSdkLog.e("mtopsdk.LoginHandler", str + " [updateXStateSessionInfo] error.", e);
        }
    }

    private static String b(Mtop mtop, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad825f54", new Object[]{mtop, str});
        }
        if (StringUtils.isBlank(str)) {
            str = "DEFAULT";
        }
        return StringUtils.concatStr(mtop.getInstanceId(), str);
    }

    @Override // com.taobao.tao.remotebusiness.login.i
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            sendEmptyMessage(911101);
        }
    }

    @Override // com.taobao.tao.remotebusiness.login.i
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            sendEmptyMessage(911102);
        }
    }

    @Override // com.taobao.tao.remotebusiness.login.i
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            sendEmptyMessage(911103);
        }
    }
}
