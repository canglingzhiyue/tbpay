package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes8.dex */
public class olm extends jhg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context n = null;
    public String o = null;
    public String p = null;
    public String q = null;
    public Map<String, String> r;

    static {
        kge.a(933339772);
    }

    public void a(jhg jhgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5fff4f", new Object[]{this, jhgVar});
        } else if (jhgVar == null) {
        } else {
            this.f29553a = jhgVar.f29553a;
            this.b = jhgVar.b;
            this.c = jhgVar.c;
            this.d = jhgVar.d;
            this.e = jhgVar.e;
            this.f = jhgVar.f;
            this.g = jhgVar.g;
            this.h = jhgVar.h;
            this.i = jhgVar.i;
            this.j = jhgVar.j;
            this.m = jhgVar.m;
        }
    }
}
