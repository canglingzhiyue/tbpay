package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class kub {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, a> f30319a;
    private static final ksk[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        kua a(String str);
    }

    static {
        kge.a(46756166);
        f30319a = new HashMap();
        b = new ksk[]{ksk.REC_ORDER_LIST, ksk.REC_ORDER_LIST_CATAPULT, ksk.REC_ORDER_DETAIL, ksk.REC_LOGISTICS, ksk.REC_CART, ksk.REC_FAVORITE, ksk.REC_PAY_SUCCESS, ksk.REC_CONFIRM_RECEIPT};
        a();
    }

    public static kua a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kua) ipChange.ipc$dispatch("953c4c33", new Object[]{str, str2});
        }
        a aVar = f30319a.get(str);
        if (aVar == null) {
            com.taobao.tao.linklog.a.a("createBxFeatureRequestParam", "BxFeatureParamCreator", "builder 未注册" + str);
            return null;
        }
        return aVar.a(str2);
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        f30319a.put(ksk.NEW_FACE_CHILD.f30287a, new a() { // from class: tb.kub.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.kub.a
            public kua a(String str) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (kua) ipChange2.ipc$dispatch("7c71b4bd", new Object[]{this, str}) : kua.a(str);
            }
        });
        b();
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        int length = b.length;
        for (int i = 0; i < length; i++) {
            final ksk kskVar = b[i];
            final String str = kskVar.f30287a;
            f30319a.put(str, new a() { // from class: tb.kub.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.kub.a
                public kua a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (kua) ipChange2.ipc$dispatch("7c71b4bd", new Object[]{this, str2}) : kua.a(ksk.this.c, str, str2);
                }
            });
        }
    }
}
