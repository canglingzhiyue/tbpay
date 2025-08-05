package com.alibaba.ability.impl.kvstorage;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.d;
import tb.kge;

/* loaded from: classes2.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private c f1903a;
    private final Adler32 b = new Adler32();
    private String c;
    private String d;
    private final boolean e;

    static {
        kge.a(157160290);
        Companion = new a(null);
    }

    public b(boolean z) {
        this.e = z;
    }

    public static final /* synthetic */ String a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("41a41c63", new Object[]{bVar}) : bVar.b();
    }

    public static final /* synthetic */ boolean b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7d371ca2", new Object[]{bVar})).booleanValue() : bVar.e;
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(-499209174);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    private final String b() {
        String userId;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (!this.e || (userId = Login.getUserId()) == null) {
            return null;
        }
        if (q.a((Object) userId, (Object) this.c) && (str = this.d) != null) {
            return str;
        }
        Adler32 adler32 = this.b;
        Charset charset = d.UTF_8;
        if (userId == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = userId.getBytes(charset);
        q.b(bytes, "(this as java.lang.String).getBytes(charset)");
        adler32.update(bytes);
        this.c = userId;
        this.d = String.valueOf(this.b.getValue());
        this.b.reset();
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.alibaba.ability.impl.kvstorage.c a(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ability.impl.kvstorage.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1e
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r7
            r2 = 1
            r1[r2] = r8
            r8 = 2
            r1[r8] = r9
            r8 = 3
            r1[r8] = r10
            java.lang.String r8 = "29fc68b6"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            com.alibaba.ability.impl.kvstorage.c r8 = (com.alibaba.ability.impl.kvstorage.c) r8
            return r8
        L1e:
            com.alibaba.ability.impl.kvstorage.c r0 = r7.f1903a
            if (r0 == 0) goto L30
            java.lang.String r1 = r0.f()
            boolean r1 = kotlin.jvm.internal.q.a(r9, r1)
            if (r1 == 0) goto L2d
            goto L2e
        L2d:
            r0 = 0
        L2e:
            if (r0 != 0) goto L4a
        L30:
            com.alibaba.ability.impl.kvstorage.c$a r1 = com.alibaba.ability.impl.kvstorage.c.Companion
            long r2 = tb.amh.b(r9)
            r0 = 10
            long r5 = r2 << r0
            r2 = r8
            r3 = r9
            r4 = r10
            com.alibaba.ability.impl.kvstorage.c r0 = r1.a(r2, r3, r4, r5)
            com.alibaba.ability.impl.kvstorage.c r8 = r7.f1903a
            if (r8 == 0) goto L48
            r8.e()
        L48:
            r7.f1903a = r0
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.kvstorage.b.a(android.content.Context, java.lang.String, java.lang.String):com.alibaba.ability.impl.kvstorage.c");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c cVar = this.f1903a;
        if (cVar == null) {
            return;
        }
        cVar.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.ability.result.g<java.lang.Object, com.alibaba.ability.result.ErrorResult> a(tb.als r11, java.lang.String r12) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ability.impl.kvstorage.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            r1[r2] = r11
            r11 = 2
            r1[r11] = r12
            java.lang.String r11 = "ec86de50"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            com.alibaba.ability.result.g r11 = (com.alibaba.ability.result.g) r11
            return r11
        L1b:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.q.d(r11, r0)
            java.lang.String r0 = "bizId"
            kotlin.jvm.internal.q.d(r12, r0)
            boolean r0 = b(r10)
            r1 = 0
            if (r0 == 0) goto L49
            boolean r0 = com.taobao.login4android.Login.checkSessionValid()
            if (r0 != 0) goto L33
            goto L3a
        L33:
            java.lang.String r0 = a(r10)
            if (r0 == 0) goto L3a
            r3 = 1
        L3a:
            if (r3 != 0) goto L49
            com.alibaba.ability.result.ErrorResult r0 = new com.alibaba.ability.result.ErrorResult
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            java.lang.String r5 = "NOT_LOGIN"
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            goto L4a
        L49:
            r0 = r1
        L4a:
            if (r0 == 0) goto L54
            com.alibaba.ability.result.g r11 = new com.alibaba.ability.result.g
            com.alibaba.ability.result.e r0 = (com.alibaba.ability.result.e) r0
            r11.<init>(r1, r0)
            return r11
        L54:
            tb.alt r11 = r11.f()
            android.content.Context r11 = r11.f()
            if (r11 != 0) goto L6e
            com.alibaba.ability.result.g r11 = new com.alibaba.ability.result.g
            com.alibaba.ability.result.a$a$a r12 = com.alibaba.ability.result.a$a.Companion
            java.lang.String r0 = "NoAppContext"
            com.alibaba.ability.result.ErrorResult r12 = r12.b(r0)
            com.alibaba.ability.result.e r12 = (com.alibaba.ability.result.e) r12
            r11.<init>(r1, r12)
            return r11
        L6e:
            java.lang.String r0 = r10.b()
            com.alibaba.ability.impl.kvstorage.c r11 = r10.a(r11, r12, r0)
            r11.d()
            r11 = r1
            com.alibaba.ability.impl.kvstorage.c r11 = (com.alibaba.ability.impl.kvstorage.c) r11
            r10.f1903a = r11
            com.alibaba.ability.result.g r11 = new com.alibaba.ability.result.g
            r11.<init>(r1, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.kvstorage.b.a(tb.als, java.lang.String):com.alibaba.ability.result.g");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.ability.result.g<java.util.List<java.lang.String>, com.alibaba.ability.result.ErrorResult> b(tb.als r11, java.lang.String r12) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ability.impl.kvstorage.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            r1[r2] = r11
            r11 = 2
            r1[r11] = r12
            java.lang.String r11 = "f28aa9af"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            com.alibaba.ability.result.g r11 = (com.alibaba.ability.result.g) r11
            return r11
        L1b:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.q.d(r11, r0)
            java.lang.String r0 = "bizID"
            kotlin.jvm.internal.q.d(r12, r0)
            boolean r0 = b(r10)
            r1 = 0
            if (r0 == 0) goto L49
            boolean r0 = com.taobao.login4android.Login.checkSessionValid()
            if (r0 != 0) goto L33
            goto L3a
        L33:
            java.lang.String r0 = a(r10)
            if (r0 == 0) goto L3a
            r3 = 1
        L3a:
            if (r3 != 0) goto L49
            com.alibaba.ability.result.ErrorResult r0 = new com.alibaba.ability.result.ErrorResult
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            java.lang.String r5 = "NOT_LOGIN"
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            goto L4a
        L49:
            r0 = r1
        L4a:
            if (r0 == 0) goto L54
            com.alibaba.ability.result.g r11 = new com.alibaba.ability.result.g
            com.alibaba.ability.result.e r0 = (com.alibaba.ability.result.e) r0
            r11.<init>(r1, r0)
            return r11
        L54:
            tb.alt r11 = r11.f()
            android.content.Context r11 = r11.f()
            if (r11 != 0) goto L6e
            com.alibaba.ability.result.g r11 = new com.alibaba.ability.result.g
            com.alibaba.ability.result.a$a$a r12 = com.alibaba.ability.result.a$a.Companion
            java.lang.String r0 = "NoAppContext"
            com.alibaba.ability.result.ErrorResult r12 = r12.b(r0)
            com.alibaba.ability.result.e r12 = (com.alibaba.ability.result.e) r12
            r11.<init>(r1, r12)
            return r11
        L6e:
            java.lang.String r0 = r10.b()
            com.alibaba.ability.impl.kvstorage.c r11 = r10.a(r11, r12, r0)
            com.alibaba.ability.result.g r12 = new com.alibaba.ability.result.g
            java.util.List r11 = r11.a()
            r12.<init>(r11, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.kvstorage.b.b(tb.als, java.lang.String):com.alibaba.ability.result.g");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.ability.result.g<com.taobao.android.abilityidl.ability.KVStorageCurrentInfo, com.alibaba.ability.result.ErrorResult> c(tb.als r11, java.lang.String r12) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ability.impl.kvstorage.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            r1[r2] = r11
            r11 = 2
            r1[r11] = r12
            java.lang.String r11 = "f88e750e"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            com.alibaba.ability.result.g r11 = (com.alibaba.ability.result.g) r11
            return r11
        L1b:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.q.d(r11, r0)
            java.lang.String r0 = "bizID"
            kotlin.jvm.internal.q.d(r12, r0)
            boolean r0 = b(r10)
            r1 = 0
            if (r0 == 0) goto L49
            boolean r0 = com.taobao.login4android.Login.checkSessionValid()
            if (r0 != 0) goto L33
            goto L3a
        L33:
            java.lang.String r0 = a(r10)
            if (r0 == 0) goto L3a
            r3 = 1
        L3a:
            if (r3 != 0) goto L49
            com.alibaba.ability.result.ErrorResult r0 = new com.alibaba.ability.result.ErrorResult
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            java.lang.String r5 = "NOT_LOGIN"
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            goto L4a
        L49:
            r0 = r1
        L4a:
            if (r0 == 0) goto L54
            com.alibaba.ability.result.g r11 = new com.alibaba.ability.result.g
            com.alibaba.ability.result.e r0 = (com.alibaba.ability.result.e) r0
            r11.<init>(r1, r0)
            return r11
        L54:
            tb.alt r11 = r11.f()
            android.content.Context r11 = r11.f()
            if (r11 != 0) goto L6e
            com.alibaba.ability.result.g r11 = new com.alibaba.ability.result.g
            com.alibaba.ability.result.a$a$a r12 = com.alibaba.ability.result.a$a.Companion
            java.lang.String r0 = "NoAppContext"
            com.alibaba.ability.result.ErrorResult r12 = r12.b(r0)
            com.alibaba.ability.result.e r12 = (com.alibaba.ability.result.e) r12
            r11.<init>(r1, r12)
            return r11
        L6e:
            java.lang.String r0 = r10.b()
            com.alibaba.ability.impl.kvstorage.c r11 = r10.a(r11, r12, r0)
            com.taobao.android.abilityidl.ability.KVStorageCurrentInfo r12 = new com.taobao.android.abilityidl.ability.KVStorageCurrentInfo
            r12.<init>()
            long r2 = r11.b()
            long r4 = r11.c()
            long r4 = r2 - r4
            r6 = 0
            long r4 = tb.rwf.a(r4, r6)
            int r11 = (int) r4
            r12.freeSize = r11
            int r11 = (int) r2
            r12.totalSize = r11
            kotlin.t r11 = kotlin.t.INSTANCE
            com.alibaba.ability.result.g r11 = new com.alibaba.ability.result.g
            r11.<init>(r12, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.kvstorage.b.c(tb.als, java.lang.String):com.alibaba.ability.result.g");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.ability.result.g<com.taobao.android.abilityidl.ability.KVStorageCurrentInfoAndKeys, com.alibaba.ability.result.ErrorResult> d(tb.als r11, java.lang.String r12) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ability.impl.kvstorage.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            r1[r2] = r11
            r11 = 2
            r1[r11] = r12
            java.lang.String r11 = "fe92406d"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            com.alibaba.ability.result.g r11 = (com.alibaba.ability.result.g) r11
            return r11
        L1b:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.q.d(r11, r0)
            java.lang.String r0 = "bizID"
            kotlin.jvm.internal.q.d(r12, r0)
            boolean r0 = b(r10)
            r1 = 0
            if (r0 == 0) goto L49
            boolean r0 = com.taobao.login4android.Login.checkSessionValid()
            if (r0 != 0) goto L33
            goto L3a
        L33:
            java.lang.String r0 = a(r10)
            if (r0 == 0) goto L3a
            r3 = 1
        L3a:
            if (r3 != 0) goto L49
            com.alibaba.ability.result.ErrorResult r0 = new com.alibaba.ability.result.ErrorResult
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            java.lang.String r5 = "NOT_LOGIN"
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            goto L4a
        L49:
            r0 = r1
        L4a:
            if (r0 == 0) goto L54
            com.alibaba.ability.result.g r11 = new com.alibaba.ability.result.g
            com.alibaba.ability.result.e r0 = (com.alibaba.ability.result.e) r0
            r11.<init>(r1, r0)
            return r11
        L54:
            tb.alt r11 = r11.f()
            android.content.Context r11 = r11.f()
            if (r11 != 0) goto L6e
            com.alibaba.ability.result.g r11 = new com.alibaba.ability.result.g
            com.alibaba.ability.result.a$a$a r12 = com.alibaba.ability.result.a$a.Companion
            java.lang.String r0 = "NoAppContext"
            com.alibaba.ability.result.ErrorResult r12 = r12.b(r0)
            com.alibaba.ability.result.e r12 = (com.alibaba.ability.result.e) r12
            r11.<init>(r1, r12)
            return r11
        L6e:
            java.lang.String r0 = r10.b()
            com.alibaba.ability.impl.kvstorage.c r11 = r10.a(r11, r12, r0)
            com.taobao.android.abilityidl.ability.KVStorageCurrentInfoAndKeys r12 = new com.taobao.android.abilityidl.ability.KVStorageCurrentInfoAndKeys
            r12.<init>()
            long r2 = r11.b()
            long r4 = r11.c()
            long r4 = r2 - r4
            r6 = 0
            long r4 = tb.rwf.a(r4, r6)
            int r0 = (int) r4
            r12.freeSize = r0
            int r0 = (int) r2
            r12.totalSize = r0
            java.util.List r11 = r11.a()
            r12.keys = r11
            kotlin.t r11 = kotlin.t.INSTANCE
            com.alibaba.ability.result.g r11 = new com.alibaba.ability.result.g
            r11.<init>(r12, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.kvstorage.b.d(tb.als, java.lang.String):com.alibaba.ability.result.g");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.ability.result.g<java.lang.String, com.alibaba.ability.result.ErrorResult> a(tb.als r11, java.lang.String r12, java.lang.String r13) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ability.impl.kvstorage.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            r1[r2] = r11
            r11 = 2
            r1[r11] = r12
            r11 = 3
            r1[r11] = r13
            java.lang.String r11 = "b7227b46"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            com.alibaba.ability.result.g r11 = (com.alibaba.ability.result.g) r11
            return r11
        L1e:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.q.d(r11, r0)
            java.lang.String r0 = "bizID"
            kotlin.jvm.internal.q.d(r12, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.q.d(r13, r0)
            boolean r0 = b(r10)
            r1 = 0
            if (r0 == 0) goto L51
            boolean r0 = com.taobao.login4android.Login.checkSessionValid()
            if (r0 != 0) goto L3b
            goto L42
        L3b:
            java.lang.String r0 = a(r10)
            if (r0 == 0) goto L42
            r3 = 1
        L42:
            if (r3 != 0) goto L51
            com.alibaba.ability.result.ErrorResult r0 = new com.alibaba.ability.result.ErrorResult
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            java.lang.String r5 = "NOT_LOGIN"
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            goto L52
        L51:
            r0 = r1
        L52:
            if (r0 == 0) goto L5c
            com.alibaba.ability.result.g r11 = new com.alibaba.ability.result.g
            com.alibaba.ability.result.e r0 = (com.alibaba.ability.result.e) r0
            r11.<init>(r1, r0)
            return r11
        L5c:
            tb.alt r11 = r11.f()
            android.content.Context r11 = r11.f()
            if (r11 != 0) goto L76
            com.alibaba.ability.result.g r11 = new com.alibaba.ability.result.g
            com.alibaba.ability.result.a$a$a r12 = com.alibaba.ability.result.a$a.Companion
            java.lang.String r13 = "NoAppContext"
            com.alibaba.ability.result.ErrorResult r12 = r12.b(r13)
            com.alibaba.ability.result.e r12 = (com.alibaba.ability.result.e) r12
            r11.<init>(r1, r12)
            return r11
        L76:
            java.lang.String r0 = r10.b()
            com.alibaba.ability.impl.kvstorage.c r11 = r10.a(r11, r12, r0)
            com.alibaba.ability.result.g r12 = new com.alibaba.ability.result.g
            java.lang.Object r11 = r11.a(r13)
            if (r11 == 0) goto L8b
            java.lang.String r11 = r11.toString()
            goto L8c
        L8b:
            r11 = r1
        L8c:
            r12.<init>(r11, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.kvstorage.b.a(tb.als, java.lang.String, java.lang.String):com.alibaba.ability.result.g");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.ability.result.g<java.lang.Object, com.alibaba.ability.result.ErrorResult> b(tb.als r11, java.lang.String r12, java.lang.String r13) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ability.impl.kvstorage.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            r1[r2] = r11
            r11 = 2
            r1[r11] = r12
            r11 = 3
            r1[r11] = r13
            java.lang.String r11 = "d023cce5"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            com.alibaba.ability.result.g r11 = (com.alibaba.ability.result.g) r11
            return r11
        L1e:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.q.d(r11, r0)
            java.lang.String r0 = "bizID"
            kotlin.jvm.internal.q.d(r12, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.q.d(r13, r0)
            boolean r0 = b(r10)
            r1 = 0
            if (r0 == 0) goto L51
            boolean r0 = com.taobao.login4android.Login.checkSessionValid()
            if (r0 != 0) goto L3b
            goto L42
        L3b:
            java.lang.String r0 = a(r10)
            if (r0 == 0) goto L42
            r3 = 1
        L42:
            if (r3 != 0) goto L51
            com.alibaba.ability.result.ErrorResult r0 = new com.alibaba.ability.result.ErrorResult
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            java.lang.String r5 = "NOT_LOGIN"
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            goto L52
        L51:
            r0 = r1
        L52:
            if (r0 == 0) goto L5c
            com.alibaba.ability.result.g r11 = new com.alibaba.ability.result.g
            com.alibaba.ability.result.e r0 = (com.alibaba.ability.result.e) r0
            r11.<init>(r1, r0)
            return r11
        L5c:
            tb.alt r11 = r11.f()
            android.content.Context r11 = r11.f()
            if (r11 != 0) goto L76
            com.alibaba.ability.result.g r11 = new com.alibaba.ability.result.g
            com.alibaba.ability.result.a$a$a r12 = com.alibaba.ability.result.a$a.Companion
            java.lang.String r13 = "NoAppContext"
            com.alibaba.ability.result.ErrorResult r12 = r12.b(r13)
            com.alibaba.ability.result.e r12 = (com.alibaba.ability.result.e) r12
            r11.<init>(r1, r12)
            return r11
        L76:
            java.lang.String r0 = r10.b()
            com.alibaba.ability.impl.kvstorage.c r11 = r10.a(r11, r12, r0)
            r11.b(r13)
            com.alibaba.ability.result.g r11 = new com.alibaba.ability.result.g
            r11.<init>(r1, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.kvstorage.b.b(tb.als, java.lang.String, java.lang.String):com.alibaba.ability.result.g");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.ability.result.g<java.lang.Object, com.alibaba.ability.result.ErrorResult> a(tb.als r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ability.impl.kvstorage.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L21
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            r1[r2] = r11
            r11 = 2
            r1[r11] = r12
            r11 = 3
            r1[r11] = r13
            r11 = 4
            r1[r11] = r14
            java.lang.String r11 = "a64906bc"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            com.alibaba.ability.result.g r11 = (com.alibaba.ability.result.g) r11
            return r11
        L21:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.q.d(r11, r0)
            java.lang.String r0 = "bizID"
            kotlin.jvm.internal.q.d(r12, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.q.d(r13, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.q.d(r14, r0)
            boolean r0 = b(r10)
            r1 = 0
            if (r0 == 0) goto L5a
            boolean r0 = com.taobao.login4android.Login.checkSessionValid()
            if (r0 != 0) goto L44
            goto L4b
        L44:
            java.lang.String r0 = a(r10)
            if (r0 == 0) goto L4b
            r3 = 1
        L4b:
            if (r3 != 0) goto L5a
            com.alibaba.ability.result.ErrorResult r0 = new com.alibaba.ability.result.ErrorResult
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            java.lang.String r5 = "NOT_LOGIN"
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            goto L5b
        L5a:
            r0 = r1
        L5b:
            if (r0 == 0) goto L65
            com.alibaba.ability.result.g r11 = new com.alibaba.ability.result.g
            com.alibaba.ability.result.e r0 = (com.alibaba.ability.result.e) r0
            r11.<init>(r1, r0)
            return r11
        L65:
            tb.alt r11 = r11.f()
            android.content.Context r11 = r11.f()
            if (r11 != 0) goto L7f
            com.alibaba.ability.result.g r11 = new com.alibaba.ability.result.g
            com.alibaba.ability.result.a$a$a r12 = com.alibaba.ability.result.a$a.Companion
            java.lang.String r13 = "NoAppContext"
            com.alibaba.ability.result.ErrorResult r12 = r12.b(r13)
            com.alibaba.ability.result.e r12 = (com.alibaba.ability.result.e) r12
            r11.<init>(r1, r12)
            return r11
        L7f:
            java.lang.String r0 = r10.b()
            com.alibaba.ability.impl.kvstorage.c r11 = r10.a(r11, r12, r0)
            kotlin.Pair r11 = r11.a(r13, r14)
            com.alibaba.ability.result.g r12 = new com.alibaba.ability.result.g
            if (r11 != 0) goto L91
            r13 = r1
            goto La8
        L91:
            com.alibaba.ability.result.ErrorResult r13 = new com.alibaba.ability.result.ErrorResult
            java.lang.Object r14 = r11.getFirst()
            r3 = r14
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r11 = r11.getSecond()
            r4 = r11
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7)
        La8:
            com.alibaba.ability.result.e r13 = (com.alibaba.ability.result.e) r13
            r12.<init>(r1, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.kvstorage.b.a(tb.als, java.lang.String, java.lang.String, java.lang.String):com.alibaba.ability.result.g");
    }
}
