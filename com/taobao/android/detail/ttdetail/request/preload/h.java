package com.taobao.android.detail.ttdetail.request.preload;

import android.support.v4.util.LruCache;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter;
import com.taobao.android.detail.ttdetail.request.preload.b;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.android.detail.ttdetail.utils.aw;
import com.taobao.android.detail.ttdetail.utils.bn;
import com.taobao.android.detail.ttdetail.utils.q;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes5.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private LruCache<String, b> f10797a = new LruCache<>(10);
    private Map<String, String> b = new ConcurrentHashMap();

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final h f10798a;

        static {
            kge.a(-709773276);
            f10798a = new h();
        }

        public static /* synthetic */ h a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("afeff9ce", new Object[0]) : f10798a;
        }
    }

    static {
        kge.a(-1009284788);
    }

    public static h a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("afeff9ce", new Object[0]) : a.a();
    }

    public JSONObject a(String str) {
        b b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str) || (b = b(str)) == null) {
            return null;
        }
        return b.a();
    }

    public b b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("826c90e9", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return this.f10797a.get(str);
        }
        return null;
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return this.b.get(str);
        }
        return null;
    }

    public void a(MtopResponse mtopResponse, List<c> list) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eaa611e", new Object[]{this, mtopResponse, list});
        } else if (mtopResponse != null) {
            JSONObject originFastJsonObject = mtopResponse.getOriginFastJsonObject();
            if (originFastJsonObject == null && mtopResponse.getBytedata() != null) {
                originFastJsonObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
            }
            if (originFastJsonObject == null) {
                ae.a(-200001, "预加载请求返回数据为空");
                return;
            }
            JSONObject jSONObject = originFastJsonObject.getJSONObject("data");
            if (jSONObject == null) {
                ae.a(-200001, "预加载请求返回数据为空");
                return;
            }
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof JSONObject) {
                    String key = entry.getKey();
                    if (!StringUtils.isEmpty(key)) {
                        JSONObject jSONObject2 = (JSONObject) value;
                        if (com.taobao.android.detail.ttdetail.utils.d.b(jSONObject2)) {
                            JSONObject c = com.taobao.android.detail.ttdetail.utils.g.c(jSONObject2);
                            if (DetailV3Converter.b(c)) {
                                JSONObject c2 = DetailV3Converter.c(c);
                                if (com.taobao.android.detail.ttdetail.utils.e.a().f30840a == 1 && Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sClipLowDevicePreloadData))) {
                                    com.taobao.android.detail.ttdetail.utils.d.f(c2);
                                } else {
                                    com.taobao.android.detail.ttdetail.utils.d.h(c2);
                                }
                                if (com.taobao.android.detail.ttdetail.utils.j.v()) {
                                    String a2 = bn.Companion.a(c2);
                                    if (!StringUtils.isEmpty(a2)) {
                                        this.b.put(key, a2);
                                    }
                                }
                                Iterator<c> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        str = com.taobao.android.detail.ttdetail.constant.a.UN_KNOW;
                                        str2 = "nav";
                                        break;
                                    }
                                    c next = it.next();
                                    if (StringUtils.equals(key, next.b)) {
                                        str = next.d;
                                        str2 = next.c;
                                        break;
                                    }
                                }
                                if (StringUtils.equals("nav", str2)) {
                                    a(jSONObject2);
                                    com.taobao.android.detail.ttdetail.utils.d.l(jSONObject2);
                                }
                                this.f10797a.put(key, new b.a().a(jSONObject2).a(str).b(str2).a(mtopResponse.getHeaderFields()).a());
                                com.taobao.android.detail.ttdetail.utils.i.a("PreloadTaskStore", "保存预加载数据, itemId=" + key);
                            }
                        }
                    }
                }
            }
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            List<String> a2 = aw.a(jSONObject);
            String b = aw.b(jSONObject);
            if (a2 != null) {
                for (String str : a2) {
                    q.a(str, 480, 480, true, q.a(TaobaoImageUrlStrategy.ImageQuality.q30));
                }
            }
            q.a(b, true);
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.f10797a.remove(str);
            this.b.remove(str);
        }
    }
}
