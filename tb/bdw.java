package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class bdw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f25825a;
    private static final Map<Context, String> b;
    private static final Map<Context, Long> c;
    private static final Map<Context, Long> d;
    private static final Map<Context, Boolean> e;
    private static final Map<Context, Boolean> f;

    static {
        kge.a(947819927);
        b = new HashMap();
        c = new HashMap();
        d = new HashMap();
        e = new HashMap();
        f = new HashMap();
    }

    public static void a(b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0def87e", new Object[]{bVar, jSONObject});
            return;
        }
        Context D = bVar.D();
        if ((D instanceof Activity) && ((Activity) D).isFinishing()) {
            return;
        }
        String a2 = bee.a(jSONObject, "queryParamVersion", "");
        f25825a = a2;
        b.put(D, a2);
        Long a3 = bee.a(jSONObject, "queryParamExpireTime", (Long) 0L);
        c.put(D, a3);
        d.put(D, Long.valueOf(System.currentTimeMillis()));
        Boolean a4 = bee.a(jSONObject, "enableDeleteQueryParam", (Boolean) false);
        e.put(D, a4);
        Boolean a5 = bee.a(jSONObject, "enableDeleteQueryParamForQuery", (Boolean) false);
        f.put(D, a5);
        HashMap hashMap = new HashMap();
        hashMap.put("queryParamVersion", a2);
        hashMap.put("queryParamExpireTime", a3);
        hashMap.put("enableDeleteQueryParam", a4);
        hashMap.put("enableDeleteQueryParamForNextQuery", a5);
        jqg.b("DeleteQueryParamsState", "更新QueryParams优化状态", hashMap);
    }

    public static boolean a(RequestConfig requestConfig, jny jnyVar) {
        Context D;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3c5c996", new Object[]{requestConfig, jnyVar})).booleanValue();
        }
        if (!(jnyVar instanceof b) || (D = ((b) jnyVar).D()) == null) {
            return false;
        }
        Map<String, String> d2 = requestConfig.d();
        if (d2 != null && Boolean.parseBoolean(d2.get(RequestConfig.IS_POP_LAYE_RQUERY))) {
            return false;
        }
        Boolean bool = (RequestConfig.RequestType.QUERY_CART_NEXT_PAGE == requestConfig.e() ? f : e).get(D);
        if (bool == null) {
            jqg.b("DeleteQueryParamsState", "找不到页面对应的queryParams优化开关");
            bed.a("deleteQueryParamStatus", "上行QueryParams#找不到页面对应的queryParams优化开关", false, 0.001f);
            return false;
        } else if (!bool.booleanValue()) {
            return false;
        } else {
            String str = b.get(D);
            if (str == null || !str.equals(f25825a)) {
                HashMap hashMap = new HashMap();
                hashMap.put("当前页面版本", str);
                hashMap.put("最新请求版本", f25825a);
                jqg.b("DeleteQueryParamsState", "版本不一致，不裁剪queryParams", hashMap);
                bed.a("deleteQueryParamStatus", "上行QueryParams#版本不一致", false, 0.001f);
                return false;
            }
            Long l = c.get(D);
            Long l2 = d.get(D);
            if (l == null || l2 == null) {
                jqg.b("DeleteQueryParamsState", "超时数据为空，不裁剪queryParams");
                bed.a("deleteQueryParamStatus", "上行QueryParams#超时数据为空", false, 0.001f);
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis() - l2.longValue();
            if (currentTimeMillis >= l.longValue()) {
                z = false;
            }
            if (!z) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("超时间隔", l);
                hashMap2.put("开始计算超时的时间", l2);
                hashMap2.put("diff时间", Long.valueOf(currentTimeMillis));
                jqg.b("DeleteQueryParamsState", "缓存超时了，不裁剪queryParams", hashMap2);
                bed.a("deleteQueryParamStatus", "上行QueryParams#缓存超时了", false, 0.001f);
            }
            return z;
        }
    }

    public static void a(jny jnyVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db1860", new Object[]{jnyVar, new Integer(i)});
        } else if (!(jnyVar instanceof b)) {
        } else {
            a(((b) jnyVar).D(), i);
        }
    }

    public static void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{context, new Integer(i)});
        } else if (context == null) {
        } else {
            b.remove(context);
            c.remove(context);
            d.remove(context);
            e.remove(context);
            f.remove(context);
            jqg.b("DeleteQueryParamsState", "清除状态:" + i);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            f25825a = null;
        }
    }
}
