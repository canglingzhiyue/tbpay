package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.k;

/* loaded from: classes6.dex */
public abstract class jxm implements gse {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "JarvisUnifiedCallback";
    public jxs mJarvisWidget;
    private jxo mRegistry;

    static {
        kge.a(999080735);
        kge.a(20055365);
    }

    public abstract void handleResult(JSONObject jSONObject);

    public jxm(jxs jxsVar) {
        this.mJarvisWidget = jxsVar;
        this.mRegistry = ((jxp) jxsVar.getCore().c().g()).f();
    }

    @Override // tb.gse
    public void notify(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12981c64", new Object[]{this, str, str2});
            return;
        }
        if (k.a().c()) {
            k.a("[XSearchJarvis]", "page:" + this.mJarvisWidget.e() + ", event:" + str + ", 返回:", JSON.parseObject(str2));
        }
        if (TextUtils.isEmpty(str2)) {
            k.a(TAG, "callback result is empty");
            return;
        }
        try {
            handleResult(JSON.parseObject(str2));
        } catch (Throwable th) {
            k.a(TAG, "parse callback result failed", th);
        }
    }

    @Override // tb.gse
    public void errorReport(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28fdfd81", new Object[]{this, str, str2, str3});
        } else {
            k.d("[XSearchJarvis]", "Jarvis返回出错，type:%s, errorMsg:%s", str2, str3);
        }
    }
}
