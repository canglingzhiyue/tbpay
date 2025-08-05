package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.p;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class nxz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    static {
        kge.a(-2136489943);
        Companion = new a(null);
    }

    @JvmStatic
    public static final void a(p pVar, String str, String str2, JSONObject jSONObject, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b6da84e", new Object[]{pVar, str, str2, jSONObject, map});
        } else {
            Companion.a(pVar, str, str2, jSONObject, map);
        }
    }

    /* loaded from: classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-131576783);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final void a(p pVar, String str, String str2, JSONObject jSONObject, Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b6da84e", new Object[]{this, pVar, str, str2, jSONObject, map});
            } else if (pVar == null) {
            } else {
                pVar.initWithURL(Uri.parse(str));
                if (!TextUtils.equals(str, str2)) {
                    pVar.addInstanceEnv("bundleUrl", str2);
                }
                pVar.render(jSONObject, map);
            }
        }
    }
}
