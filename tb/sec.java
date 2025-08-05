package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.e;
import com.taobao.infoflow.core.engine.env.protocol.d;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class sec implements d, sea {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(982496914);
        kge.a(1609820236);
        kge.a(1219916099);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.d
    public void a(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5d0b6a", new Object[]{this, str, str2, str3, jSONObject});
            return;
        }
        try {
            if (ldj.a("disableBxMapInterface", false)) {
                sed.a(str, str2, str3, luw.a(jSONObject));
            } else {
                sed.a(str, str2, str3, luw.b(jSONObject), new String[0]);
            }
        } catch (Throwable th) {
            ldf.a("TbDefaultBx", "TbDefaultBx commitTap ", th);
        }
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.d
    public void a(String str, String str2, float f, float f2, List<e> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b0c878", new Object[]{this, str, str2, new Float(f), new Float(f2), list, map});
        } else {
            sed.a(str, str2, f, f2, list, map);
        }
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.d
    public void b(String str, String str2, float f, float f2, List<e> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21c197", new Object[]{this, str, str2, new Float(f), new Float(f2), list, map});
        } else {
            sed.b(str, str2, f, f2, list, map);
        }
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.d
    public void c(String str, String str2, float f, float f2, List<e> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2892bab6", new Object[]{this, str, str2, new Float(f), new Float(f2), list, map});
        } else {
            sed.c(str, str2, f, f2, list, map);
        }
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.d
    public void a(String str, String str2, String str3, View view, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d594bda4", new Object[]{this, str, str2, str3, view, jSONObject});
            return;
        }
        try {
            if (ldj.a("disableBxMapInterface", false)) {
                sed.a(str, str2, str3, view, luw.a(jSONObject));
            } else {
                sed.a(str, str2, str3, view, luw.b(jSONObject), new String[0]);
            }
        } catch (Throwable th) {
            ldf.a("TbDefaultBx", "TbDefaultBx commitAppear ", th);
        }
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.d
    public void b(String str, String str2, String str3, View view, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a47c5be5", new Object[]{this, str, str2, str3, view, jSONObject});
            return;
        }
        try {
            if (ldj.a("disableBxMapInterface", false)) {
                sed.b(str, str2, str3, view, luw.a(jSONObject));
            } else {
                sed.b(str, str2, str3, view, luw.b(jSONObject), new String[0]);
            }
        } catch (Throwable th) {
            ldf.a("TbDefaultBx", "TbDefaultBx commitDisAppear ", th);
        }
    }

    @Override // tb.sea
    public void a(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f39fc7", new Object[]{this, str, str2, obj, strArr});
            return;
        }
        try {
            sed.a(str, str2, obj, strArr);
        } catch (Throwable th) {
            ldf.a("TbDefaultBx", "TbDefaultBx commitEnter ", th);
        }
    }

    @Override // tb.sea
    public void a(String str, String str2, String str3, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e601333d", new Object[]{this, str, str2, str3, obj, strArr});
            return;
        }
        try {
            sed.a(str, str2, str3, obj, strArr);
        } catch (Throwable th) {
            ldf.a("TbDefaultBx", "TbDefaultBx commitLeave ", th);
        }
    }

    @Override // tb.sea
    public void a(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50031319", new Object[]{this, str, str2, str3, strArr});
            return;
        }
        try {
            sed.b(str, str2, str3, strArr);
        } catch (Throwable th) {
            ldf.a("TbDefaultBx", "TbDefaultBx commitRequest ", th);
        }
    }

    @Override // tb.sea
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            sed.a();
        } catch (Throwable th) {
            ldf.a("TbDefaultBx", "TbDefaultBx push ", th);
        }
    }
}
