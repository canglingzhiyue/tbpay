package com.etao.feimagesearch.mnn;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.text.n;
import tb.com;
import tb.cot;
import tb.cuj;
import tb.kge;

/* loaded from: classes3.dex */
public final class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUCKET_SEPARATOR = ",";
    public static final a Companion;
    private static final kotlin.d b;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, String> f6782a;

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.k[] f6783a;

        static {
            kge.a(1710206149);
            f6783a = new kotlin.reflect.k[]{t.a(new PropertyReference1Impl(t.b(a.class), "instance", "getInstance()Lcom/etao/feimagesearch/mnn/PltMnnBucketManager;"))};
        }

        public final j a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("5a233a44", new Object[]{this});
            } else {
                kotlin.d c = j.c();
                a aVar = j.Companion;
                value = c.getValue();
            }
            return (j) value;
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    private j() {
        this.f6782a = new ConcurrentHashMap<>();
    }

    public /* synthetic */ j(o oVar) {
        this();
    }

    public static final /* synthetic */ kotlin.d c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kotlin.d) ipChange.ipc$dispatch("8055a8c5", new Object[0]) : b;
    }

    static {
        kge.a(-1543566915);
        Companion = new a(null);
        b = kotlin.e.a(LazyThreadSafetyMode.SYNCHRONIZED, PltMnnBucketManager$Companion$instance$2.INSTANCE);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            d();
        }
    }

    private final void d() {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            String b2 = cuj.b(com.b(), "plt_mnn_bucket_id_v2", "");
            if (StringUtils.isEmpty(b2) || (parseObject = JSON.parseObject(b2)) == null) {
                return;
            }
            for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
                if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                    String key = entry.getKey();
                    if (key == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                    }
                    String str = key;
                    Object value = entry.getValue();
                    if (value == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                    }
                    this.f6782a.put(str, (String) value);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void a(String taskName, String cid) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, taskName, cid});
            return;
        }
        q.c(taskName, "taskName");
        q.c(cid, "cid");
        if (!q.a((Object) cid, (Object) this.f6782a.get(taskName))) {
            cot.c("PltMnnBucketManager", "update task " + taskName + ", newCid " + cid + ", oldValue " + this.f6782a.get(taskName) + ' ');
            this.f6782a.put(taskName, cid);
            String jSONString = JSON.toJSONString(this.f6782a);
            cuj.a(com.b(), "plt_mnn_bucket_id_v2", jSONString);
            StringBuilder sb = new StringBuilder();
            sb.append("update ");
            sb.append(jSONString);
            cot.c("PltMnnBucketManager", sb.toString());
            return;
        }
        cot.c("PltMnnBucketManager", "equal task " + taskName + ", newCid " + cid + ", oldValue " + this.f6782a.get(taskName));
    }

    public final String b(String taskName, String cid) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, taskName, cid});
        }
        q.c(taskName, "taskName");
        q.c(cid, "cid");
        return taskName + "_" + cid;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        try {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : this.f6782a.entrySet()) {
                q.a((Object) entry, "iterator.next()");
                Map.Entry<String, String> entry2 = entry;
                sb.append(entry2.getKey());
                sb.append("_");
                sb.append(entry2.getValue());
                sb.append(",");
            }
            String sb2 = sb.toString();
            q.a((Object) sb2, "stringBuilder.toString()");
            String a2 = n.a(sb2, (CharSequence) ",");
            return a2.length() > 1000 ? "" : a2;
        } catch (Exception unused) {
            return "";
        }
    }
}
