package com.taobao.android.detail.ttdetail.component;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Fatigue;
import com.taobao.android.detail.ttdetail.utils.ai;
import com.taobao.android.detail.ttdetail.utils.bf;
import com.taobao.android.detail.ttdetail.utils.i;
import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.d;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/taobao/android/detail/ttdetail/component/ComponentFatigueManager;", "", "()V", "ComponentFatigueContainer", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes4.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a ComponentFatigueContainer;
    public static final String GENERATE_FATIGUE_PARAMS_COST = "generateFatigueParams";

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, b> f10530a;
    private static final HashMap<String, String> b;
    private static boolean c;
    private static boolean d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004J\u001a\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0016\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0004J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u0004J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\tH\u0002J\u000e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u001f\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020'H\u0002J\u001a\u0010(\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020\u0015H\u0002J\u000e\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\fJ\u0010\u0010,\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/taobao/android/detail/ttdetail/component/ComponentFatigueManager$ComponentFatigueContainer;", "", "()V", "FATIGUE_FILE_NAME", "", "GENERATE_FATIGUE_PARAMS_COST", RPCDataItems.SWITCH_TAG_LOG, "componentFatigueMap", "Ljava/util/HashMap;", "Lcom/taobao/android/detail/ttdetail/component/ComponentFatigueInfoModel;", "Lkotlin/collections/HashMap;", "isFatigueInfoUpdate", "", "isSwitchOpen", "requestParamsMap", "addStampIntoList", "", "componentFatigueTag", "createComponentFatigue", "componentName", "validDuration", "", "destroy", "context", "Landroid/content/Context;", "uniqueToken", "generateRequestParams", "getComponentExposureCount", "", "componentFatigueInfoModel", "init", "onMainRequestResponse", "fatigue", "Lcom/taobao/android/detail/ttdetail/data/meta/Fatigue;", "parseJSONObject", "jsonObject", "Lcom/alibaba/fastjson/JSONObject;", "readFatigueInfoFromDisk", "file", "Ljava/io/File;", "refreshValidTime", "duration", "setSwitch", "isOrangeSwitchOpen", "writeFatigueInfoIntoDisk", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 16})
        /* renamed from: com.taobao.android.detail.ttdetail.component.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class RunnableC0405a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CopyOnWriteArrayList f10531a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;

            public RunnableC0405a(CopyOnWriteArrayList copyOnWriteArrayList, int i, int i2) {
                this.f10531a = copyOnWriteArrayList;
                this.b = i;
                this.c = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f10531a.subList(0, this.b - this.c).clear();
                }
            }
        }

        static {
            kge.a(1764548529);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final void a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
                return;
            }
            q.c(context, "context");
            File file = context.getFilesDir();
            q.a((Object) file, "file");
            a(file);
        }

        public final void a(Context context, String uniqueToken) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, uniqueToken});
                return;
            }
            q.c(context, "context");
            q.c(uniqueToken, "uniqueToken");
            if (c.a().containsKey(uniqueToken)) {
                c.a().remove(uniqueToken);
            }
            if (!c.b()) {
                return;
            }
            b(context);
            c.a(false);
        }

        public final void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            c.b(z);
            if (c.c() || !(!c.d().isEmpty())) {
                return;
            }
            c.d().clear();
            c.a(true);
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : c.c();
        }

        private final void a(File file) {
            JSONObject parseObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a979fdf", new Object[]{this, file});
                return;
            }
            String a2 = ai.a(new File(file, "fatigueInfo.txt").getPath());
            if (a2 == null || (parseObject = JSON.parseObject(a2)) == null) {
                return;
            }
            a(parseObject);
        }

        private final void a(JSONObject jSONObject) {
            CopyOnWriteArrayList<Long> a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            try {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(entry.getKey());
                    if (jSONObject2 != null) {
                        long longValue = jSONObject2.getLongValue("validDuration");
                        if (longValue > 0) {
                            a(entry.getKey(), longValue);
                            JSONArray jSONArray = jSONObject2.getJSONArray("exposureTimeStampList");
                            if (jSONArray != null) {
                                Iterator<Object> it = jSONArray.iterator();
                                while (it.hasNext()) {
                                    long parseLong = Long.parseLong(it.next().toString());
                                    b bVar = (b) c.d().get(entry.getKey());
                                    if (bVar != null && (a2 = bVar.a()) != null) {
                                        a2.add(Long.valueOf(parseLong));
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                i.a("detailComponentFatigue", "JSON parse err", e);
            } catch (NumberFormatException e2) {
                i.a("detailComponentFatigue", "Number parse err", e2);
            } catch (Exception e3) {
                i.a("detailComponentFatigue", "parse failed", e3);
            }
        }

        private final void a(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
            } else if (str == null) {
            } else {
                c.d().put(str, new b(j));
            }
        }

        private final void b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
                return;
            }
            File file = new File(context.getFilesDir(), "fatigueInfo.txt");
            if (c.d().isEmpty()) {
                ai.c(file.getPath());
                return;
            }
            String objectStr = JSON.toJSONString(c.d());
            q.a((Object) objectStr, "objectStr");
            Charset charset = d.UTF_8;
            if (objectStr == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = objectStr.getBytes(charset);
            q.a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            ai.a(file, bytes);
        }

        public final String a(String uniqueToken) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, uniqueToken});
            }
            q.c(uniqueToken, "uniqueToken");
            if (c.a().containsKey(uniqueToken)) {
                return (String) c.a().get(uniqueToken);
            }
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : c.d().entrySet()) {
                String valueOf = String.valueOf(a((b) entry.getValue()));
                sb.append((String) entry.getKey());
                sb.append('=');
                sb.append(valueOf);
                sb.append(';');
            }
            if (sb.length() == 0) {
                z = true;
            }
            if (z) {
                c.a().put(uniqueToken, "");
                return null;
            }
            sb.deleteCharAt(sb.length() - 1);
            String sb2 = sb.toString();
            q.a((Object) sb2, "params.toString()");
            c.a().put(uniqueToken, sb2);
            return sb2;
        }

        private final int a(b bVar) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("99ff920d", new Object[]{this, bVar})).intValue();
            }
            CopyOnWriteArrayList<Long> a2 = bVar.a();
            int size = a2.size();
            if (size <= 0) {
                return 0;
            }
            long currentTimeMillis = (System.currentTimeMillis() / 1000) - bVar.b();
            Iterator<Long> it = a2.iterator();
            while (it.hasNext() && it.next().longValue() < currentTimeMillis) {
                i++;
            }
            int i2 = size - i;
            if (i2 < size) {
                bf.a(new RunnableC0405a(a2, size, i2));
                c.a(true);
            }
            return i2;
        }

        private final void b(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d253fb1", new Object[]{this, str, new Long(j)});
                return;
            }
            b bVar = (b) c.d().get(str);
            if (bVar != null) {
                if (bVar.b() == j) {
                    return;
                }
                bVar.a(j);
                c.a(true);
                return;
            }
            a(str, j);
            c.a(true);
        }

        public final void a(Fatigue fatigue) {
            JSONObject data;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d671848", new Object[]{this, fatigue});
            } else if (fatigue != null && (data = fatigue.getData()) != null) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<String, Object> entry : data.entrySet()) {
                    hashSet.add(entry.getKey());
                    JSONObject jSONObject = data.getJSONObject(entry.getKey());
                    long longValue = jSONObject != null ? jSONObject.getLongValue("fatigueDuration") : 0L;
                    if (((int) longValue) > 0) {
                        b(entry.getKey(), longValue);
                    }
                }
                for (Map.Entry entry2 : c.d().entrySet()) {
                    if (!hashSet.contains(entry2.getKey())) {
                        c.d().remove(entry2.getKey());
                        c.a(true);
                    }
                }
            }
        }

        public final void b(String componentFatigueTag) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, componentFatigueTag});
                return;
            }
            q.c(componentFatigueTag, "componentFatigueTag");
            b bVar = (b) c.d().get(componentFatigueTag);
            if (bVar == null) {
                return;
            }
            bVar.a().add(Long.valueOf(System.currentTimeMillis() / 1000));
            c.a(true);
        }
    }

    public static final /* synthetic */ HashMap a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[0]) : b;
    }

    public static final /* synthetic */ void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            d = z;
        }
    }

    public static final /* synthetic */ void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z)});
        } else {
            c = z;
        }
    }

    public static final /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : d;
    }

    public static final /* synthetic */ boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : c;
    }

    public static final /* synthetic */ HashMap d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("9d11238e", new Object[0]) : f10530a;
    }

    static {
        kge.a(168683614);
        ComponentFatigueContainer = new a(null);
        f10530a = new HashMap<>();
        b = new HashMap<>();
        c = true;
    }
}
