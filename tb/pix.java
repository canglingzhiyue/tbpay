package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.listener.H5PlatfomListenerEnum;

/* loaded from: classes8.dex */
public class pix {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-396750792);
        kge.a(1047369549);
    }

    public Object a(pkg pkgVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a48337ad", new Object[]{this, pkgVar, objArr});
        }
        if (objArr == null || !(objArr[0] instanceof pkd)) {
            return null;
        }
        pkd pkdVar = (pkd) objArr[0];
        if ((objArr[1] instanceof H5PlatfomListenerEnum) && pkdVar.b() != null) {
            return a(pkdVar, objArr);
        }
        return null;
    }

    private Object a(pkd pkdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9f296510", new Object[]{this, pkdVar, objArr});
        }
        if ((objArr[1] instanceof H5PlatfomListenerEnum) && pkdVar.b() != null) {
            H5PlatfomListenerEnum h5PlatfomListenerEnum = (H5PlatfomListenerEnum) objArr[1];
            pjm n = pkdVar.b().n();
            Object[] objArr2 = objArr[2] != null ? (Object[]) objArr[2] : null;
            Object obj = (objArr2 == null || objArr2.length <= 0) ? null : objArr2[0];
            switch (h5PlatfomListenerEnum) {
                case play:
                    if (n != null) {
                        n.e(obj);
                        break;
                    }
                    break;
                case stop:
                    if (n != null) {
                        n.f(obj);
                        break;
                    }
                    break;
                case resume:
                    if (n != null) {
                        n.g(obj);
                        break;
                    }
                    break;
                case isMuted:
                    if (n != null) {
                        n.i(obj);
                        break;
                    }
                    break;
                case onPause:
                    if (n != null) {
                        n.l(obj);
                        break;
                    }
                    break;
                case onResume:
                    if (n != null) {
                        n.m(obj);
                        break;
                    }
                    break;
                case setMuted:
                    if (n != null) {
                        n.h(obj);
                        break;
                    }
                    break;
                case onDestroy:
                    if (n != null) {
                        n.p(obj);
                        break;
                    }
                    break;
                case subscribePM:
                    if (n != null) {
                        n.a(obj);
                        break;
                    }
                    break;
                case unsubscribePM:
                    if (n != null) {
                        n.b(obj);
                        break;
                    }
                    break;
                case getConfiguration:
                    if (n != null) {
                        n.c(obj);
                        break;
                    }
                    break;
                case setConfiguration:
                    if (n != null) {
                        n.d(obj);
                        break;
                    }
                    break;
                case onAttachedToWebView:
                    if (n != null) {
                        n.j(obj);
                        break;
                    }
                    break;
                case onVisibilityChanged:
                    if (n != null) {
                        n.n(obj);
                        break;
                    }
                    break;
                case onDetachedFromWebView:
                    if (n != null) {
                        n.k(obj);
                        break;
                    }
                    break;
                case getSessionInfo:
                    if (n != null) {
                        n.o(obj);
                        break;
                    }
                    break;
            }
        }
        return null;
    }
}
