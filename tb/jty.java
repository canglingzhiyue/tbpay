package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.e;
import com.taobao.tao.Globals;

/* loaded from: classes6.dex */
public class jty {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public interface a {
        void a();

        void b();
    }

    static {
        kge.a(-1109943527);
    }

    public static void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fb461ec", new Object[]{aVar});
            return;
        }
        try {
            e.a().a(Globals.getApplication());
        } catch (Throwable th) {
            Log.e("WasmRuntime", "init weex before wasm failed", th);
        }
        ihq.a().a("wasm_runtime", new ihy() { // from class: tb.jty.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ihy
            public void onLoadFinished(ihz ihzVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6344c753", new Object[]{this, ihzVar});
                    return;
                }
                String str = "Remote Load wasm_runtime: " + ihzVar.g();
                if (ihzVar.g()) {
                    a aVar2 = a.this;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a();
                    return;
                }
                a aVar3 = a.this;
                if (aVar3 == null) {
                    return;
                }
                aVar3.b();
            }
        });
    }
}
