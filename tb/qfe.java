package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.base.MaterialRequestPolicy;
import com.taobao.taopai2.material.base.b;
import com.taobao.taopai2.material.request.Response;
import java.io.File;
import tb.qff;
import tb.qfg;

/* loaded from: classes8.dex */
public class qfe<T extends qfg> implements qff {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f32907a;

    static {
        kge.a(112569506);
        kge.a(-1640146124);
    }

    public void cancel() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        }
    }

    @Override // tb.qff
    public Response<T> a(qff.a aVar) {
        Response<T> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("5b20dd18", new Object[]{this, aVar});
        }
        this.f32907a = aVar.a();
        if (this.f32907a.getRequestPolicy() == MaterialRequestPolicy.NET || this.f32907a.getRequestPolicy() == MaterialRequestPolicy.NET_CACHE) {
            a2 = aVar.a(aVar.a());
            if (a2 != null) {
                a((qfe<T>) a2.data);
            }
        } else {
            a2 = a(aVar.b());
            if (a2 == null || a2.data == null || !a2.mo2429getData().isValid()) {
                if (this.f32907a.getRequestPolicy() == MaterialRequestPolicy.CACHE) {
                    return new Response<>(-100, "");
                }
                a2 = aVar.a(aVar.a());
                if (a2 != null) {
                    a((qfe<T>) a2.data);
                }
            }
        }
        return a2;
    }

    private void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb35bca6", new Object[]{this, t});
        } else if (t == null) {
        } else {
            String cachePath = this.f32907a.getCachePath();
            if (TextUtils.isEmpty(cachePath)) {
                return;
            }
            try {
                qcg.c(cachePath, JSON.toJSONString(t));
            } catch (Exception e) {
                Log.e("CacheInterceptor", "save cache fail " + e.toString());
            }
        }
    }

    private Response a(Class<T> cls) {
        qfg qfgVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("9e0bc9cd", new Object[]{this, cls});
        }
        String cachePath = this.f32907a.getCachePath();
        if (a(cachePath)) {
            return null;
        }
        try {
            String d = qcg.d(cachePath);
            if (!TextUtils.isEmpty(d) && (qfgVar = (qfg) JSON.parseObject(d, cls)) != null) {
                return new Response(qfgVar);
            }
        } catch (Exception e) {
            Log.e("CacheInterceptor", "parseCacheData fail " + e.toString());
        }
        return null;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        File file = new File(str);
        return !file.exists() || System.currentTimeMillis() - file.lastModified() > this.f32907a.getCacheTimeS();
    }
}
