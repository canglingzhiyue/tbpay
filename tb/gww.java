package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.workflow.e;
import com.taobao.android.litecreator.util.k;
import com.taobao.android.litecreator.util.u;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.tao.Globals;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class gww {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f28548a;
    private static final Map<String, gww> b;
    private JSONObject c;

    static {
        kge.a(929523408);
        f28548a = e.b;
        b = new HashMap();
    }

    public static gww a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gww) ipChange.ipc$dispatch("f054477", new Object[0]) : a(f28548a);
    }

    public static gww a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gww) ipChange.ipc$dispatch("7c6fed6d", new Object[]{str});
        }
        if (b.containsKey(str)) {
            return b.get(str);
        }
        return new gww(str);
    }

    private gww(String str) {
        b.put(str, this);
        c(str);
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        String d = d(str);
        if (TextUtils.isEmpty(d)) {
            u.d("LCRouter", "cann't read router. bizId:" + str);
            d = d(e.b);
            if (TextUtils.isEmpty(d)) {
                u.d("LCRouter", "cann't read router, default bizId is invalid, cur bizId:" + str);
                return;
            }
        }
        try {
            this.c = JSONObject.parseObject(d);
            u.b("LCRouter", "parse router sucess. bizId:" + str);
        } catch (Throwable unused) {
            u.d("LCRouter", "parse router failed!. bizId:" + str);
        }
    }

    private String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
        }
        String str2 = "router/router_" + str + ".json";
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(AssetsDelegate.proxy_open(Globals.getApplication().getAssets(), str2)));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    } catch (IOException e) {
                        e = e;
                        bufferedReader = bufferedReader2;
                        e.printStackTrace();
                        k.a(bufferedReader);
                        return sb.toString();
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        k.a(bufferedReader);
                        throw th;
                    }
                }
                k.a(bufferedReader2);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
        return sb.toString();
    }

    public String b(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && (jSONObject = this.c) != null) {
            return jSONObject.getString(str);
        }
        return null;
    }
}
