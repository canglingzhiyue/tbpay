package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.SymbolExpUtil;
import tb.bnm;
import tb.dtc;

/* loaded from: classes4.dex */
public class dta implements dtc.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f26950a;

    static {
        kge.a(-1158909472);
        kge.a(793826524);
    }

    public dta(Context context) {
        this.f26950a = context;
    }

    @Override // tb.dtc.a
    public Map<String, List<String>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        JSONObject b = b();
        if (b != null) {
            for (String str : b.keySet()) {
                if (!StringUtils.isEmpty(str)) {
                    String string = b.getString(str);
                    if (!StringUtils.isEmpty(string)) {
                        String[] split = string.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
                        if (split.length > 0) {
                            ArrayList arrayList = new ArrayList();
                            Collections.addAll(arrayList, split);
                            hashMap.put(str, arrayList);
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    private JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        if (this.f26950a == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(AssetsDelegate.proxy_open(this.f26950a.getAssets(), bnm.a.PATH)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    return JSONObject.parseObject(sb.toString());
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
