package com.alibaba.poplayer.info.misc;

import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.exception.PoplayerException;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bzn;
import tb.kge;

/* loaded from: classes.dex */
public class PopMiscInfoFileHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile JSONObject f3188a;
    private final bzn b = new bzn("poplayer_misc_page");
    private AtomicBoolean c = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public static class ConfigPersistentInfo implements Serializable {
        public boolean enable = true;
        public int lastP = 1000;

        static {
            kge.a(-2070400346);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final PopMiscInfoFileHelper f3189a;

        static {
            kge.a(-948980904);
            f3189a = new PopMiscInfoFileHelper();
        }

        public static /* synthetic */ PopMiscInfoFileHelper a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PopMiscInfoFileHelper) ipChange.ipc$dispatch("730e6eb8", new Object[0]) : f3189a;
        }
    }

    static {
        kge.a(-1837124475);
    }

    private static String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : "config_persistent_info";
    }

    public static PopMiscInfoFileHelper a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopMiscInfoFileHelper) ipChange.ipc$dispatch("730e6eb8", new Object[0]) : a.a();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c.a("PopMiscInfoFileHelper.readAndSetup.", new Object[0]);
        if (this.c.getAndSet(true)) {
            return;
        }
        c.a("PopMiscInfoFileHelper.readAndSetup.start", new Object[0]);
        this.f3188a = this.b.a();
        String d = d();
        if (this.f3188a != null && !this.f3188a.containsKey(d)) {
            this.f3188a.put(d, (Object) new JSONObject());
        }
        c.a("PopMiscInfoFileHelper.readAndSetup.end", new Object[0]);
    }

    private JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this});
        }
        if (this.f3188a == null) {
            this.f3188a = new JSONObject(new ConcurrentHashMap());
        }
        return this.f3188a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[Catch: Throwable -> 0x00b6, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0009, B:11:0x0022, B:15:0x002a, B:17:0x003b, B:18:0x0043, B:20:0x004c, B:37:0x00a2, B:39:0x00ad, B:22:0x0062, B:24:0x0066, B:32:0x0089, B:34:0x008f, B:25:0x006a, B:27:0x006e, B:28:0x0079, B:30:0x007d), top: B:53:0x0001 }] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.alibaba.fastjson.JSONObject] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean a(com.alibaba.poplayer.trigger.BaseConfigItem r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper.$ipChange     // Catch: java.lang.Throwable -> Lbe
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: java.lang.Throwable -> Lbe
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.lang.String r1 = "d997a272"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lbe
            r4[r2] = r8     // Catch: java.lang.Throwable -> Lbe
            r4[r3] = r9     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r9 = r0.ipc$dispatch(r1, r4)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> Lbe
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> Lbe
            monitor-exit(r8)
            return r9
        L1e:
            if (r9 != 0) goto L22
            monitor-exit(r8)
            return r2
        L22:
            com.alibaba.fastjson.JSONObject r0 = r8.e()     // Catch: java.lang.Throwable -> Lb6
            if (r0 != 0) goto L2a
            monitor-exit(r8)
            return r3
        L2a:
            java.lang.String r1 = "PopMiscInfoFileHelper.getConfigPercentEnableFor."
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lb6
            com.alibaba.poplayer.utils.c.a(r1, r4)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r1 = d()     // Catch: java.lang.Throwable -> Lb6
            com.alibaba.fastjson.JSONObject r4 = r0.getJSONObject(r1)     // Catch: java.lang.Throwable -> Lb6
            if (r4 != 0) goto L43
            com.alibaba.fastjson.JSONObject r4 = new com.alibaba.fastjson.JSONObject     // Catch: java.lang.Throwable -> Lb6
            r4.<init>()     // Catch: java.lang.Throwable -> Lb6
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> Lb6
        L43:
            r1 = 0
            java.lang.String r5 = r9.indexID     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r6 = r4.get(r5)     // Catch: java.lang.Throwable -> Lb6
            if (r6 != 0) goto L62
            com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper$ConfigPersistentInfo r1 = new com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper$ConfigPersistentInfo     // Catch: java.lang.Throwable -> Lb6
            r1.<init>()     // Catch: java.lang.Throwable -> Lb6
            int r6 = r9.enablePercent     // Catch: java.lang.Throwable -> Lb6
            r1.lastP = r6     // Catch: java.lang.Throwable -> Lb6
            int r9 = r9.enablePercent     // Catch: java.lang.Throwable -> Lb6
            boolean r9 = r8.a(r9)     // Catch: java.lang.Throwable -> Lb6
            r1.enable = r9     // Catch: java.lang.Throwable -> Lb6
            r4.put(r5, r1)     // Catch: java.lang.Throwable -> Lb6
        L60:
            r9 = 1
            goto La0
        L62:
            boolean r7 = r6 instanceof com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper.ConfigPersistentInfo     // Catch: java.lang.Throwable -> Lb6
            if (r7 == 0) goto L6a
            r1 = r6
            com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper$ConfigPersistentInfo r1 = (com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper.ConfigPersistentInfo) r1     // Catch: java.lang.Throwable -> Lb6
            goto L87
        L6a:
            boolean r7 = r6 instanceof com.alibaba.fastjson.JSONObject     // Catch: java.lang.Throwable -> Lb6
            if (r7 == 0) goto L79
            com.alibaba.fastjson.JSONObject r6 = (com.alibaba.fastjson.JSONObject) r6     // Catch: java.lang.Throwable -> Lb6
            java.lang.Class<com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper$ConfigPersistentInfo> r1 = com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper.ConfigPersistentInfo.class
            java.lang.Object r1 = r6.toJavaObject(r1)     // Catch: java.lang.Throwable -> Lb6
            com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper$ConfigPersistentInfo r1 = (com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper.ConfigPersistentInfo) r1     // Catch: java.lang.Throwable -> Lb6
            goto L87
        L79:
            boolean r7 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lb6
            if (r7 == 0) goto L87
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> Lb6
            java.lang.Class<com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper$ConfigPersistentInfo> r1 = com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper.ConfigPersistentInfo.class
            java.lang.Object r1 = com.alibaba.fastjson.JSON.parseObject(r6, r1)     // Catch: java.lang.Throwable -> Lb6
            com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper$ConfigPersistentInfo r1 = (com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper.ConfigPersistentInfo) r1     // Catch: java.lang.Throwable -> Lb6
        L87:
            if (r1 == 0) goto L9f
            int r6 = r1.lastP     // Catch: java.lang.Throwable -> Lb6
            int r7 = r9.enablePercent     // Catch: java.lang.Throwable -> Lb6
            if (r6 == r7) goto L9f
            int r6 = r9.enablePercent     // Catch: java.lang.Throwable -> Lb6
            r1.lastP = r6     // Catch: java.lang.Throwable -> Lb6
            int r9 = r9.enablePercent     // Catch: java.lang.Throwable -> Lb6
            boolean r9 = r8.a(r9)     // Catch: java.lang.Throwable -> Lb6
            r1.enable = r9     // Catch: java.lang.Throwable -> Lb6
            r4.put(r5, r1)     // Catch: java.lang.Throwable -> Lb6
            goto L60
        L9f:
            r9 = 0
        La0:
            if (r9 == 0) goto Lab
            tb.bzn r9 = r8.b     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = r0.toJSONString()     // Catch: java.lang.Throwable -> Lb6
            r9.a(r0)     // Catch: java.lang.Throwable -> Lb6
        Lab:
            if (r1 == 0) goto Lb4
            boolean r9 = r1.enable     // Catch: java.lang.Throwable -> Lb6
            if (r9 == 0) goto Lb2
            goto Lb4
        Lb2:
            monitor-exit(r8)
            return r2
        Lb4:
            monitor-exit(r8)
            return r3
        Lb6:
            r9 = move-exception
            java.lang.String r0 = "PopMiscInfoFileHelper getConfigPercentEnableFor error."
            com.alibaba.poplayer.utils.c.a(r0, r9)     // Catch: java.lang.Throwable -> Lbe
            monitor-exit(r8)
            return r3
        Lbe:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper.a(com.alibaba.poplayer.trigger.BaseConfigItem):boolean");
    }

    public synchronized void a(List<BaseConfigItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new PoplayerException("Please don't execute on UI Thread.");
        } else {
            JSONObject e = e();
            if (e == null) {
                return;
            }
            String d = d();
            JSONObject jSONObject = e.getJSONObject(d);
            JSONObject jSONObject2 = new JSONObject();
            for (BaseConfigItem baseConfigItem : list) {
                ConfigPersistentInfo configPersistentInfo = new ConfigPersistentInfo();
                if (jSONObject != null) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject(baseConfigItem.indexID);
                    if (jSONObject3 != null && jSONObject3.containsKey("lastP") && jSONObject3.containsKey("enable") && jSONObject3.getInteger("lastP").intValue() == baseConfigItem.enablePercent) {
                        ConfigPersistentInfo configPersistentInfo2 = (ConfigPersistentInfo) jSONObject3.toJavaObject(ConfigPersistentInfo.class);
                        configPersistentInfo.lastP = configPersistentInfo2.lastP;
                        configPersistentInfo.enable = configPersistentInfo2.enable;
                    } else {
                        configPersistentInfo.lastP = baseConfigItem.enablePercent;
                        configPersistentInfo.enable = a(baseConfigItem.enablePercent);
                    }
                } else {
                    configPersistentInfo.lastP = baseConfigItem.enablePercent;
                    configPersistentInfo.enable = a(baseConfigItem.enablePercent);
                }
                jSONObject2.put(baseConfigItem.indexID, (Object) configPersistentInfo);
            }
            e.put(d, (Object) jSONObject2);
            this.b.a(e.toJSONString());
        }
    }

    public synchronized void a(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b95557", new Object[]{this, set});
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new PoplayerException("Please don't execute on UI Thread.");
        } else {
            if (set == null) {
                return;
            }
            JSONObject e = e();
            if (e == null) {
                return;
            }
            String d = d();
            JSONObject jSONObject = e.getJSONObject(d);
            if (jSONObject == null) {
                return;
            }
            Iterator<Map.Entry<String, Object>> it = jSONObject.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> next = it.next();
                if (next != null && !set.contains(next.getKey())) {
                    it.remove();
                }
            }
            e.put(d, (Object) jSONObject);
            this.b.a(e.toJSONString());
        }
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.f3188a != null) {
            this.f3188a.remove(d());
        }
        this.b.a(this.f3188a.toJSONString());
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        Random random = new Random(System.nanoTime());
        if (i < 0) {
            i = 0;
        }
        if (i > 1000) {
            i = 1000;
        }
        return i != 0 && Math.abs(random.nextLong()) % 1000 <= ((long) (i - 1));
    }
}
