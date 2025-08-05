package tb;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter;
import com.taobao.android.detail.ttdetail.data.meta.MappingKey;
import com.taobao.android.detail.ttdetail.data.meta.Merged;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.request.stream.a;
import com.taobao.android.detail.ttdetail.utils.as;
import com.taobao.android.detail.ttdetail.utils.az;
import com.taobao.android.detail.ttdetail.utils.c;
import com.taobao.android.detail.ttdetail.utils.d;
import com.taobao.android.detail.ttdetail.utils.g;
import com.taobao.android.detail.ttdetail.utils.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes4.dex */
public class eyz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f27666a;
    private eyx b;
    private JSONObject c;
    private volatile MtopInfo h;
    private Map<String, Object> d = new HashMap(0);
    private Map<String, eza> e = new HashMap(0);
    private Map<String, Merged> f = new HashMap();
    private List<a> g = Collections.synchronizedList(new ArrayList());
    private final ReentrantLock i = new ReentrantLock();

    static {
        kge.a(1173099966);
    }

    public static /* synthetic */ JSONObject a(eyz eyzVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dba1997e", new Object[]{eyzVar, jSONObject});
        }
        eyzVar.c = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ List a(eyz eyzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("15b31d35", new Object[]{eyzVar}) : eyzVar.g;
    }

    public static /* synthetic */ void a(eyz eyzVar, MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("178598c6", new Object[]{eyzVar, mtopInfo});
        } else {
            eyzVar.b(mtopInfo);
        }
    }

    public eyz(Context context, eyx eyxVar) {
        this.f27666a = context;
        this.b = eyxVar;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        if (this.c != jSONObject) {
            this.d.clear();
            this.f.clear();
            this.h = null;
        }
        this.c = jSONObject;
        this.b.d().a(d.a(g.a(jSONObject)));
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("714aa894", new Object[]{this, aVar});
        } else if (aVar != null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                if (aVar == this.g.get(size)) {
                    this.g.remove(size);
                }
            }
        }
    }

    public boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe37bfb7", new Object[]{this, aVar})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        for (int size = this.g.size() - 1; size >= 0; size--) {
            if (aVar == this.g.get(size)) {
                return true;
            }
        }
        return false;
    }

    public void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b24d6d2", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            if (com.taobao.android.detail.ttdetail.request.a.a(this.h)) {
                MtopResponse b = this.h.b();
                JSONObject originFastJsonObject = b.getOriginFastJsonObject();
                if (originFastJsonObject == null && b.getBytedata() != null) {
                    originFastJsonObject = JSON.parseObject(new String(b.getBytedata()));
                }
                aVar.a(originFastJsonObject);
                a(true, b);
            } else if (com.taobao.android.detail.ttdetail.request.a.b(this.h)) {
                MtopResponse b2 = this.h.b();
                aVar.a(b2.getRetCode(), b2.getRetMsg());
                a(false, b2);
            } else {
                this.g.add(aVar);
            }
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        if (this.h != null) {
            return this.h.a();
        }
        return 0;
    }

    public void a(final MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("206474f0", new Object[]{this, mtopInfo});
            return;
        }
        final JSONObject jSONObject = null;
        final boolean z = az.a(mtopInfo) && com.taobao.android.detail.ttdetail.request.a.a(mtopInfo) && Boolean.FALSE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sInvokeStreamingFinish));
        if (z) {
            JSONObject c = g.c(as.a(mtopInfo));
            if (DetailV3Converter.b(c)) {
                jSONObject = DetailV3Converter.c(c);
            }
            z = jSONObject != null;
        }
        c.a(this.b, new Runnable() { // from class: tb.eyz.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (z) {
                    eyz.a(eyz.this, jSONObject);
                }
                eyz.a(eyz.this, mtopInfo);
            }
        });
    }

    private void b(MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad518c0f", new Object[]{this, mtopInfo});
            return;
        }
        this.h = mtopInfo;
        if (mtopInfo == null) {
            return;
        }
        MtopResponse b = mtopInfo.b();
        if (com.taobao.android.detail.ttdetail.request.a.a(mtopInfo)) {
            a(true, b);
        } else if (!com.taobao.android.detail.ttdetail.request.a.b(mtopInfo)) {
        } else {
            a(false, b);
        }
    }

    private void a(final boolean z, final MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("313a7431", new Object[]{this, new Boolean(z), mtopResponse});
        } else if (this.g.isEmpty()) {
        } else {
            Runnable runnable = new Runnable() { // from class: tb.eyz.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    for (a aVar : eyz.a(eyz.this)) {
                        if (aVar != null) {
                            if (z) {
                                JSONObject originFastJsonObject = mtopResponse.getOriginFastJsonObject();
                                if (originFastJsonObject == null && mtopResponse.getBytedata() != null) {
                                    originFastJsonObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
                                }
                                aVar.a(originFastJsonObject);
                            } else {
                                aVar.a(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                            }
                        }
                    }
                    eyz.a(eyz.this).clear();
                }
            };
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                this.b.b().a(runnable);
            }
        }
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.c;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.c;
        if (jSONObject != null) {
            return jSONObject.getBooleanValue("preload");
        }
        return false;
    }

    public <M extends Merged> M a(Class<M> cls) {
        JSONObject a2;
        JSONObject jSONObject;
        if (this.c == null || cls == null) {
            return null;
        }
        MappingKey mappingKey = (MappingKey) cls.getAnnotation(MappingKey.class);
        if (mappingKey == null) {
            i.a("DataEngine", "getMergedData failed for not MappingKey annotation, in class: " + cls);
            return null;
        }
        String key = mappingKey.key();
        if (TextUtils.isEmpty(key)) {
            i.a("DataEngine", "getMergedData failed with an empty MappingKey key(), in class: " + cls);
            return null;
        }
        JSONObject jSONObject2 = this.c.getJSONObject(key);
        if (jSONObject2 == null && (a2 = g.a(this.c)) != null && (jSONObject = a2.getJSONObject("meta")) != null) {
            jSONObject2 = jSONObject.getJSONObject(key);
        }
        if (jSONObject2 == null) {
            i.a("DataEngine", "getMergedData failed with an empty mergedValue for key: '" + key + "', in class: " + cls);
            return null;
        }
        String a3 = a(key, cls);
        this.i.lock();
        try {
            if (this.f.containsKey(a3)) {
                return (M) this.f.get(a3);
            }
            M newInstance = cls.getConstructor(JSONObject.class).newInstance(jSONObject2);
            this.f.put(a3, newInstance);
            return newInstance;
        } finally {
            this.i.unlock();
        }
    }

    private <M extends Merged> String a(String str, Class<M> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14a11eb5", new Object[]{this, str, cls});
        }
        return str + "-" + cls.hashCode();
    }

    public <O> O a(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (O) ipChange.ipc$dispatch("17307540", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        O o = (O) this.d.get(str);
        if (o != null) {
            return o;
        }
        eza ezaVar = this.e.get(str);
        if (ezaVar == null || (jSONObject = this.c) == null) {
            return null;
        }
        O o2 = (O) ezaVar.a(jSONObject);
        this.d.put(str, o2);
        return o2;
    }

    public void a(String str, eza ezaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27bd26d6", new Object[]{this, str, ezaVar});
        } else if (TextUtils.isEmpty(str) || ezaVar == null) {
        } else {
            if (this.e.get(str) != ezaVar) {
                this.d.remove(str);
            }
            this.e.put(str, ezaVar);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e.clear();
        this.d.clear();
        this.f.clear();
    }
}
