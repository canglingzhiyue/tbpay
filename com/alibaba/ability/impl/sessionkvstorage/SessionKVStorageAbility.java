package com.alibaba.ability.impl.sessionkvstorage;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.g;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsSessionKVStorageAbility;
import com.taobao.android.abilityidl.ability.SessionKVStorageCurrentInfo;
import com.taobao.android.abilityidl.ability.ec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import kotlin.t;
import tb.als;
import tb.kge;
import tb.rwf;

/* loaded from: classes2.dex */
public final class SessionKVStorageAbility extends AbsSessionKVStorageAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final ReentrantReadWriteLock f1959a = new ReentrantReadWriteLock();
    private LinkedHashMap<String, String> b = new LinkedHashMap<>();
    private int c;

    static {
        kge.a(491460900);
        Companion = new a(null);
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.taobao.android.abilityidl.ability.AbsSessionKVStorageAbility
    public g<Object, ErrorResult> clear(als context) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("dd23b36e", new Object[]{this, context});
        }
        q.d(context, "context");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f1959a;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.b.clear();
            this.c = 0;
            t tVar = t.INSTANCE;
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
            return new g<>(null, null, 3, null);
        } catch (Throwable th) {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.taobao.android.abilityidl.ability.AbsSessionKVStorageAbility
    public g<List<String>, ErrorResult> getAllKeys(als context) {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("8462bafc", new Object[]{this, context});
        }
        q.d(context, "context");
        try {
            arrayList = x.f(new JSONArray());
        } catch (Throwable unused) {
            arrayList = new ArrayList();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.f1959a;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Set<String> keySet = this.b.keySet();
            q.b(keySet, "storageMap.keys");
            for (String it : keySet) {
                q.b(it, "it");
                arrayList.add(it);
            }
            t tVar = t.INSTANCE;
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
            return new g<>(arrayList, null, 2, null);
        } catch (Throwable th) {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSessionKVStorageAbility
    public g<SessionKVStorageCurrentInfo, ErrorResult> getCurrentInfo(als context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("c3664daa", new Object[]{this, context});
        }
        q.d(context, "context");
        SessionKVStorageCurrentInfo sessionKVStorageCurrentInfo = new SessionKVStorageCurrentInfo();
        ReentrantReadWriteLock.ReadLock readLock = this.f1959a.readLock();
        readLock.lock();
        try {
            sessionKVStorageCurrentInfo.totalSize = 5242880;
            sessionKVStorageCurrentInfo.freeSize = rwf.c(5242880 - this.c, 0);
            t tVar = t.INSTANCE;
            readLock.unlock();
            return new g<>(sessionKVStorageCurrentInfo, null, 2, null);
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSessionKVStorageAbility
    public g<String, ErrorResult> getItem(als context, ec params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("cfb72c9b", new Object[]{this, context, params});
        }
        q.d(context, "context");
        q.d(params, "params");
        ReentrantReadWriteLock.ReadLock readLock = this.f1959a.readLock();
        readLock.lock();
        try {
            String str = this.b.get(params.f8835a);
            if (str == null) {
                str = "";
            }
            readLock.unlock();
            q.b(str, "lock.read {\n            …rams.key] ?: \"\"\n        }");
            return new g<>(str, null, 2, null);
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:14:0x0047, B:16:0x0053, B:18:0x0057, B:20:0x0062, B:24:0x006d, B:26:0x0076, B:27:0x0078, B:21:0x0064, B:22:0x006b), top: B:37:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[LOOP:1: B:28:0x007a->B:29:0x007c, LOOP_END] */
    @Override // com.taobao.android.abilityidl.ability.AbsSessionKVStorageAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.ability.result.g<java.lang.Object, com.alibaba.ability.result.ErrorResult> removeItem(tb.als r6, com.taobao.android.abilityidl.ability.ec r7) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ability.impl.sessionkvstorage.SessionKVStorageAbility.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 3
            r3 = 0
            if (r1 == 0) goto L1b
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r5
            r2 = 1
            r1[r2] = r6
            r6 = 2
            r1[r6] = r7
            java.lang.String r6 = "960dbfad"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            com.alibaba.ability.result.g r6 = (com.alibaba.ability.result.g) r6
            return r6
        L1b:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.q.d(r6, r0)
            java.lang.String r6 = "params"
            kotlin.jvm.internal.q.d(r7, r6)
            java.util.concurrent.locks.ReentrantReadWriteLock r6 = r5.f1959a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r6.readLock()
            int r1 = r6.getWriteHoldCount()
            if (r1 != 0) goto L36
            int r1 = r6.getReadHoldCount()
            goto L37
        L36:
            r1 = 0
        L37:
            r4 = 0
        L38:
            if (r4 >= r1) goto L40
            r0.unlock()
            int r4 = r4 + 1
            goto L38
        L40:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r6.writeLock()
            r6.lock()
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r4 = r5.b     // Catch: java.lang.Throwable -> L8c
            java.lang.String r7 = r7.f8835a     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r7 = r4.remove(r7)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L8c
            if (r7 == 0) goto L6c
            java.nio.charset.Charset r4 = kotlin.text.d.UTF_8     // Catch: java.lang.Throwable -> L8c
            if (r7 == 0) goto L64
            byte[] r7 = r7.getBytes(r4)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r4 = "(this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.q.b(r7, r4)     // Catch: java.lang.Throwable -> L8c
            if (r7 == 0) goto L6c
            int r7 = r7.length     // Catch: java.lang.Throwable -> L8c
            goto L6d
        L64:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L8c
            throw r7     // Catch: java.lang.Throwable -> L8c
        L6c:
            r7 = 0
        L6d:
            int r4 = r5.c     // Catch: java.lang.Throwable -> L8c
            int r4 = r4 - r7
            r5.c = r4     // Catch: java.lang.Throwable -> L8c
            int r7 = r5.c     // Catch: java.lang.Throwable -> L8c
            if (r7 >= 0) goto L78
            r5.c = r3     // Catch: java.lang.Throwable -> L8c
        L78:
            kotlin.t r7 = kotlin.t.INSTANCE     // Catch: java.lang.Throwable -> L8c
        L7a:
            if (r3 >= r1) goto L82
            r0.lock()
            int r3 = r3 + 1
            goto L7a
        L82:
            r6.unlock()
            com.alibaba.ability.result.g r6 = new com.alibaba.ability.result.g
            r7 = 0
            r6.<init>(r7, r7, r2, r7)
            return r6
        L8c:
            r7 = move-exception
        L8d:
            if (r3 >= r1) goto L95
            r0.lock()
            int r3 = r3 + 1
            goto L8d
        L95:
            r6.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.sessionkvstorage.SessionKVStorageAbility.removeItem(tb.als, com.taobao.android.abilityidl.ability.ec):com.alibaba.ability.result.g");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9 A[LOOP:2: B:35:0x00c7->B:36:0x00c9, LOOP_END] */
    @Override // com.taobao.android.abilityidl.ability.AbsSessionKVStorageAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.ability.result.g<java.lang.Object, com.alibaba.ability.result.ErrorResult> setItem(tb.als r18, com.taobao.android.abilityidl.ability.ed r19) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.sessionkvstorage.SessionKVStorageAbility.setItem(tb.als, com.taobao.android.abilityidl.ability.ed):com.alibaba.ability.result.g");
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(-21436564);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
