package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.room.utils.ah;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.n;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class plu implements phl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(695086683);
        kge.a(1719980992);
    }

    @Override // tb.phl
    public void a(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3202a441", new Object[]{this, str, hashMap});
        } else {
            ah.a(str, hashMap);
        }
    }

    @Override // tb.phl
    public void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{this, str, strArr});
        } else {
            ah.a(str, strArr);
        }
    }

    @Override // tb.phl
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            ah.a(str, map);
        }
    }

    @Override // tb.phl
    public pmt a(pmt pmtVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pmt) ipChange.ipc$dispatch("12a456ce", new Object[]{this, pmtVar}) : ah.a(pmtVar);
    }

    @Override // tb.phl
    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : poy.d(n.a());
    }

    @Override // tb.phl
    public void a(a aVar, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f06a806c", new Object[]{this, aVar, str, hashMap});
        } else {
            ai.a(aVar, str, (String) null, hashMap);
        }
    }

    @Override // tb.phl
    public void a(a aVar, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb133d8", new Object[]{this, aVar, str, strArr});
        } else {
            ai.a(aVar, str, strArr);
        }
    }

    @Override // tb.phl
    public void a(a aVar, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54c20ebe", new Object[]{this, aVar, str, map});
        } else {
            ai.a(aVar, str, map);
        }
    }

    @Override // tb.phl
    public void a(a aVar, int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c741bbf5", new Object[]{this, aVar, new Integer(i), str, map});
        } else {
            ai.a(i, str, map);
        }
    }

    @Override // tb.phl
    public void a(a aVar, Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d76748d0", new Object[]{this, aVar, context, str, map});
        } else {
            ai.a(aVar, context, str, map);
        }
    }

    @Override // tb.phl
    public void b(a aVar, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd384519", new Object[]{this, aVar, str, strArr});
        } else {
            ai.b(aVar, str, strArr);
        }
    }

    @Override // tb.phl
    public pmt a(a aVar, pmt pmtVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pmt) ipChange.ipc$dispatch("1fdfa539", new Object[]{this, aVar, pmtVar}) : ai.a(aVar, pmtVar);
    }

    @Override // tb.phl
    public Map<String, String> a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("da5060d2", new Object[]{this, aVar}) : poy.d(aVar);
    }

    @Override // tb.phl
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : poy.ac(n.a());
    }

    @Override // tb.phl
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : poy.R(n.a());
    }

    @Override // tb.phl
    public int b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9c31b6f", new Object[]{this, aVar})).intValue() : poy.ap(aVar);
    }

    @Override // tb.phl
    public String c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("131b3c65", new Object[]{this, aVar}) : poy.x(aVar);
    }

    @Override // tb.phl
    public void a(a aVar, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4460226c", new Object[]{this, aVar, obj, map});
        } else {
            ai.a(aVar, obj, map);
        }
    }
}
