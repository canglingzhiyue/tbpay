package tb;

import com.alibaba.android.aura.dynamicFeature.model.AURADynamicFeatureBundleType;
import com.alibaba.android.aura.dynamicFeature.model.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class bxa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final a f26153a;
    private static Boolean b;
    private static aas c;

    public static /* synthetic */ Boolean a(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("42f93c22", new Object[]{bool});
        }
        b = bool;
        return bool;
    }

    static {
        kge.a(-293988331);
        f26153a = new a.C0067a().a(mqt.DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC).b("com.taobao.android.order").c(AURADynamicFeatureBundleType.AAR).a();
        b = null;
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        Boolean bool = b;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        boolean z = true;
        if (d()) {
            return true;
        }
        if (4 != aar.a().b(f26153a)) {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        b = valueOf;
        return valueOf.booleanValue();
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        if (!aar.a().a(f26153a)) {
            jqg.b(hzb.b, "不是动态模块");
        }
        if (a()) {
            return;
        }
        c();
        c = new aas() { // from class: tb.bxa.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.aas
            public void a(a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5aac472b", new Object[]{this, aVar});
                    return;
                }
                bxa.a(true);
                jqg.b(hzb.b, "地图模块安装成功");
            }

            @Override // tb.aas
            public void a(a aVar, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9de882bf", new Object[]{this, aVar, str, str2});
                    return;
                }
                bxa.a(false);
                HashMap hashMap = new HashMap();
                hashMap.put("errorCode", str);
                hashMap.put("errorMsg", str2);
                jqg.b(hzb.b, "地图模块安装失败", hashMap);
            }
        };
        aar.a().a(f26153a, c);
        aar.a().d(f26153a);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else if (c == null) {
        } else {
            aar.a().b(f26153a, c);
            c = null;
        }
    }
}
