package com.taobao.android.lightvane.jsbridge;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.gwo;
import tb.kge;
import tb.riy;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/taobao/android/lightvane/jsbridge/LVJsBridge;", "Landroid/os/Handler$Callback;", "()V", "CALL_EXECUTE", "", "CALL_METHOD", "CLOSED", "ERROR_DESTROY", "ERROR_EXECUTE", "NO_CLASS", "NO_METHOD", "NO_PERMISSION", "mainHandler", "Landroid/os/Handler;", "callMethod", "", "callmethod", "Lcom/taobao/android/lightvane/jsbridge/LVCallMethodContext;", "handleMessage", "", "msg", "Landroid/os/Message;", "startCall", "type", "lightvane_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class f implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final f INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f13291a;

    static {
        kge.a(-1334331601);
        kge.a(-1043440182);
        f fVar = new f();
        INSTANCE = fVar;
        f13291a = new Handler(Looper.getMainLooper(), fVar);
    }

    private f() {
    }

    public final void a(e callmethod) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3f5ac67", new Object[]{this, callmethod});
            return;
        }
        q.d(callmethod, "callmethod");
        com.taobao.android.lightvane.webview.a a2 = callmethod.a();
        Object jsObject = a2 != null ? a2.getJsObject(callmethod.c()) : null;
        if (jsObject != null) {
            if (jsObject instanceof c) {
                callmethod.a(jsObject);
                a(0, callmethod);
                return;
            }
            a(5, callmethod);
            return;
        }
        a(5, callmethod);
    }

    private final void a(int i, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d521fa94", new Object[]{this, new Integer(i), eVar});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = eVar;
        f13291a.sendMessage(obtain);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, msg})).booleanValue();
        }
        q.d(msg, "msg");
        Object obj = msg.obj;
        String str = null;
        if (!(obj instanceof e)) {
            obj = null;
        }
        e eVar = (e) obj;
        if (eVar == null) {
            gwo.a(6, "CallMethod is null, and do nothing", null);
            return false;
        }
        d dVar = new d(eVar.a(), eVar.c(), eVar.d(), eVar.f(), eVar.g());
        int i = msg.what;
        if (i == 0) {
            Object b = eVar.b();
            if (!(b instanceof c)) {
                b = null;
            }
            c cVar = (c) b;
            String e = TextUtils.isEmpty(eVar.e()) ? "{}" : eVar.e();
            if (cVar != null) {
                if (!cVar.executeSafe(eVar.d(), e, dVar)) {
                    a(6, eVar);
                }
            } else {
                a(5, eVar);
            }
        } else if (i == 5) {
            i iVar = new i();
            iVar.a("HY_NO_CLASS");
            StringBuilder sb = new StringBuilder();
            sb.append("No Class Error: method=[");
            sb.append(String.valueOf(eVar.c()));
            sb.append(".");
            sb.append(String.valueOf(eVar.d()));
            sb.append(riy.ARRAY_END_STR);
            sb.append(",url=[");
            if (dVar.a() == null) {
                str = "";
            } else {
                com.taobao.android.lightvane.webview.a a2 = dVar.a();
                if (a2 != null) {
                    str = a2.getUrl();
                }
            }
            sb.append(String.valueOf(str));
            sb.append(riy.ARRAY_END_STR);
            iVar.a("msg", sb.toString());
            dVar.b(iVar);
            return true;
        } else if (i == 6) {
            i iVar2 = new i();
            iVar2.a("HY_ERROR_EXECUTE");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Execute Error: method=[");
            sb2.append(String.valueOf(eVar.c()));
            sb2.append(".");
            sb2.append(String.valueOf(eVar.d()));
            sb2.append(riy.ARRAY_END_STR);
            sb2.append(",url=[");
            if (dVar.a() == null) {
                str = "";
            } else {
                com.taobao.android.lightvane.webview.a a3 = dVar.a();
                if (a3 != null) {
                    str = a3.getUrl();
                }
            }
            sb2.append(String.valueOf(str));
            sb2.append(riy.ARRAY_END_STR);
            iVar2.a("msg", sb2.toString());
            dVar.b(iVar2);
            return true;
        }
        return false;
    }
}
