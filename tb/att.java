package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class att {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1598904588);
    }

    private static void a(Map<String, atw> map, atw atwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8077e269", new Object[]{map, atwVar});
        } else {
            map.put(atwVar.a().toLowerCase(), atwVar);
        }
    }

    public static Map<String, atw> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        a(hashMap, new atw() { // from class: tb.att.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.atw
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : "linear";
            }

            @Override // tb.atw
            public atz a(AURARenderComponent aURARenderComponent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (atz) ipChange2.ipc$dispatch("33e1a98c", new Object[]{this, aURARenderComponent}) : new aud(aURARenderComponent);
            }
        });
        a(hashMap, new atw() { // from class: tb.att.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.atw
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : "card";
            }

            @Override // tb.atw
            public atz a(AURARenderComponent aURARenderComponent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (atz) ipChange2.ipc$dispatch("33e1a98c", new Object[]{this, aURARenderComponent}) : new aub(aURARenderComponent);
            }
        });
        a(hashMap, new atw() { // from class: tb.att.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.atw
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : "sticky";
            }

            @Override // tb.atw
            public atz a(AURARenderComponent aURARenderComponent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (atz) ipChange2.ipc$dispatch("33e1a98c", new Object[]{this, aURARenderComponent}) : new auf(aURARenderComponent);
            }
        });
        a(hashMap, new atw() { // from class: tb.att.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.atw
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : "overlay";
            }

            @Override // tb.atw
            public atz a(AURARenderComponent aURARenderComponent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (atz) ipChange2.ipc$dispatch("33e1a98c", new Object[]{this, aURARenderComponent}) : new aue(aURARenderComponent);
            }
        });
        a(hashMap, new atw() { // from class: tb.att.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.atw
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : a.ATOM_EXT_column;
            }

            @Override // tb.atw
            public atz a(AURARenderComponent aURARenderComponent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (atz) ipChange2.ipc$dispatch("33e1a98c", new Object[]{this, aURARenderComponent}) : new auc(aURARenderComponent);
            }
        });
        return hashMap;
    }
}
