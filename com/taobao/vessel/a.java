package com.taobao.vessel;

import android.taobao.windvane.extra.uc.WVUCWebView;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f23444a;
    private C1011a b;

    static {
        kge.a(1449958652);
    }

    private a() {
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("343c6efe", new Object[0]);
        }
        if (f23444a == null) {
            synchronized (a.class) {
                if (f23444a == null) {
                    f23444a = new a();
                }
            }
        }
        return f23444a;
    }

    public void a(C1011a c1011a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a592a1", new Object[]{this, c1011a});
        } else {
            this.b = c1011a;
        }
    }

    public com.taobao.weex.appfram.navigator.a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.weex.appfram.navigator.a) ipChange.ipc$dispatch("cc96c442", new Object[]{this});
        }
        C1011a c1011a = this.b;
        if (c1011a == null) {
            return null;
        }
        return C1011a.a(c1011a);
    }

    public WVUCWebView c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("3e67794d", new Object[]{this});
        }
        C1011a c1011a = this.b;
        if (c1011a == null) {
            return null;
        }
        return C1011a.b(c1011a);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        C1011a c1011a = this.b;
        if (c1011a == null) {
            return;
        }
        if (C1011a.b(c1011a) != null) {
            if (C1011a.b(this.b).getParent() != null) {
                ((ViewGroup) C1011a.b(this.b).getParent()).removeView(C1011a.b(this.b));
            }
            if (com.taobao.vessel.utils.a.d()) {
                C1011a.b(this.b).destroy();
                TLog.logd("Vessel", "destroy");
            } else {
                C1011a.b(this.b).coreDestroy();
            }
        }
        if (C1011a.a(this.b) != null) {
            C1011a.a(this.b, null);
        }
        this.b = null;
    }

    /* renamed from: com.taobao.vessel.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C1011a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private com.taobao.weex.appfram.navigator.a f23445a;
        private WVUCWebView b;

        static {
            kge.a(974705674);
        }

        public static /* synthetic */ com.taobao.weex.appfram.navigator.a a(C1011a c1011a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.weex.appfram.navigator.a) ipChange.ipc$dispatch("1572d6fa", new Object[]{c1011a}) : c1011a.f23445a;
        }

        public static /* synthetic */ com.taobao.weex.appfram.navigator.a a(C1011a c1011a, com.taobao.weex.appfram.navigator.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.weex.appfram.navigator.a) ipChange.ipc$dispatch("4fc767c1", new Object[]{c1011a, aVar});
            }
            c1011a.f23445a = aVar;
            return aVar;
        }

        public static /* synthetic */ WVUCWebView b(C1011a c1011a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WVUCWebView) ipChange.ipc$dispatch("c12b3677", new Object[]{c1011a}) : c1011a.b;
        }
    }
}
