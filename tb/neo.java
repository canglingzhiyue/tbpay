package tb;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.alibaba.jsi.standard.JSEngine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.p;
import com.uc.webview.export.extension.U4Engine;

/* loaded from: classes7.dex */
public class neo implements nel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f31402a;

    static {
        kge.a(-40258475);
        kge.a(904050636);
        f31402a = false;
    }

    @Override // tb.nel
    public JSEngine a(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSEngine) ipChange.ipc$dispatch("5a82956c", new Object[]{this, context, str, str2, str3, str4});
        }
        if (!f31402a) {
            try {
                U4Engine.loadJsiSo(p.e(), JSEngine.class.getClassLoader(), null);
                f31402a = true;
            } catch (Throwable th) {
                Log.e("DefaultJsiHandler", "loadJsiSo failed", th);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("name", str);
        bundle.putString("version", str2);
        bundle.putString("flags", str3);
        bundle.putString("datadir", str4);
        return JSEngine.createInstance(context, bundle);
    }
}
