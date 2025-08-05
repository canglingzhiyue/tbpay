package tb;

import android.content.Context;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class anu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, WXSDKInstance> f25457a;

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final anu f25458a;

        static {
            kge.a(1807952111);
            f25458a = new anu();
        }

        public static /* synthetic */ anu a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (anu) ipChange.ipc$dispatch("f026836", new Object[0]) : f25458a;
        }
    }

    static {
        kge.a(1067014204);
    }

    private anu() {
        this.f25457a = new ConcurrentHashMap();
    }

    public static anu a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (anu) ipChange.ipc$dispatch("f026836", new Object[0]) : a.a();
    }

    public WXSDKInstance a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("a3d2ce34", new Object[]{this, str, context});
        }
        WXSDKInstance remove = this.f25457a.remove(str);
        if (remove != null) {
            remove.a(context);
        }
        return remove;
    }

    public void a(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1b95e9", new Object[]{this, uri, str});
        } else {
            a(true, uri.toString(), null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(boolean r12, java.lang.String r13, java.util.Map<java.lang.String, java.lang.Object> r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.anu.a(boolean, java.lang.String, java.util.Map, java.lang.String):void");
    }
}
