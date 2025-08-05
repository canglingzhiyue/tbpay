package tb;

import android.taobao.windvane.jsbridge.IJsApiFailedCallBack;
import android.taobao.windvane.jsbridge.b;
import android.taobao.windvane.jsbridge.h;
import android.taobao.windvane.jsbridge.l;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.poplayer.utils.c;
import com.alibaba.poplayer.utils.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public class qnw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final IWVWebView b;

    /* loaded from: classes8.dex */
    public interface a {
        void a(String str);

        void b(String str);
    }

    static {
        kge.a(537149043);
    }

    public static /* synthetic */ void lambda$TBbqyopr29kHvJIghmoiMl4Alx8(h hVar, String str) {
        a(hVar, str);
    }

    public static /* synthetic */ void lambda$rLXAvhqkTEn1OVsWL00oo_AqRIU(AtomicBoolean atomicBoolean, a aVar, String str) {
        a(atomicBoolean, aVar, str);
    }

    public qnw(IWVWebView iWVWebView) {
        this.b = iWVWebView;
    }

    public boolean a(String str, String str2, final String str3, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c12f2da3", new Object[]{this, str, str2, str3, aVar})).booleanValue();
        }
        try {
            final h hVar = new h();
            String[] split = str.split("\\.");
            if (split.length != 2) {
                return false;
            }
            hVar.d = split[0];
            hVar.e = split[1];
            hVar.f1664a = this.b;
            hVar.g = "0";
            hVar.f = str2;
            if (TextUtils.isEmpty(hVar.f)) {
                hVar.f = "{}";
            }
            c.a("nativeRequestWindvane", new Object[0]);
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            hVar.i = new b() { // from class: tb.qnw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    qnw.this = this;
                }

                @Override // android.taobao.windvane.jsbridge.b
                public void a(String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str4});
                    } else if (!atomicBoolean.compareAndSet(false, true)) {
                    } else {
                        if (TextUtils.isEmpty(str4)) {
                            str4 = "{}";
                        }
                        c.a("PopWVJsBridge.successAndKeepAlive.ret=%s", str4);
                        a aVar2 = aVar;
                        if (aVar2 == null) {
                            return;
                        }
                        aVar2.a(str4);
                    }
                }

                @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
                public void succeed(String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e5b77b53", new Object[]{this, str4});
                    } else if (!atomicBoolean.compareAndSet(false, true)) {
                    } else {
                        if (TextUtils.isEmpty(str4)) {
                            str4 = "{}";
                        }
                        c.a("PopWVJsBridge.succeed.ret=%s", str4);
                        a aVar2 = aVar;
                        if (aVar2 == null) {
                            return;
                        }
                        aVar2.a(str4);
                    }
                }
            };
            hVar.h = new IJsApiFailedCallBack() { // from class: tb.-$$Lambda$qnw$rLXAvhqkTEn1OVsWL00oo_AqRIU
                @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
                public final void fail(String str4) {
                    qnw.lambda$rLXAvhqkTEn1OVsWL00oo_AqRIU(atomicBoolean, aVar, str4);
                }
            };
            f.a(new Runnable() { // from class: tb.-$$Lambda$qnw$TBbqyopr29kHvJIghmoiMl4Alx8
                @Override // java.lang.Runnable
                public final void run() {
                    qnw.lambda$TBbqyopr29kHvJIghmoiMl4Alx8(h.this, str3);
                }
            });
            return true;
        } catch (Throwable th) {
            c.a("NativeWindvaneRequest.nativeRequestWindvane.error.name=" + str + ".param=" + str2, th);
            return false;
        }
    }

    public static /* synthetic */ void a(AtomicBoolean atomicBoolean, a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb01ee4b", new Object[]{atomicBoolean, aVar, str});
        } else if (!atomicBoolean.compareAndSet(false, true)) {
        } else {
            if (TextUtils.isEmpty(str)) {
                str = "{}";
            }
            c.a("PopWVJsBridge.onFailed.ret=%s", str);
            if (aVar == null) {
                return;
            }
            aVar.b(str);
        }
    }

    public static /* synthetic */ void a(h hVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05e7292", new Object[]{hVar, str});
            return;
        }
        try {
            l.b().a(hVar, str);
        } catch (Throwable th) {
            c.a("NativeWindvaneRequest.WVJsBridge.callMethod.error", th);
        }
    }
}
