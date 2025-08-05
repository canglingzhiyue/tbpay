package com.alibaba.ability.impl.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsBroadcastAbility;
import com.taobao.android.abilityidl.ability.BroadcastEventResult;
import com.taobao.android.abilityidl.ability.bg;
import com.taobao.android.abilityidl.ability.o;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

/* loaded from: classes2.dex */
public final class BroadcastAbility extends AbsBroadcastAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private com.alibaba.alibity.container.broadcast.b b;
    private LocalBroadcastManager c;

    /* renamed from: a */
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, BroadcastReceiver>> f1870a = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, com.alibaba.alibity.container.broadcast.a>> d = new ConcurrentHashMap<>();
    private final AtomicInteger e = new AtomicInteger(0);

    /* loaded from: classes2.dex */
    public static final class b extends com.alibaba.alibity.container.broadcast.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ o f1872a;
        public final /* synthetic */ ConcurrentHashMap b;
        public final /* synthetic */ String c;
        public final /* synthetic */ bg d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o oVar, ConcurrentHashMap concurrentHashMap, String str, bg bgVar, String str2, String str3, String str4, String str5, boolean z) {
            super(str4, str5, z);
            this.f1872a = oVar;
            this.b = concurrentHashMap;
            this.c = str;
            this.d = bgVar;
            this.e = str2;
            this.f = str3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.alibaba.alibity.container.broadcast.a
        public void a(Map<?, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                return;
            }
            if (this.f1872a.c) {
                this.b.remove(this.c);
            }
            bg bgVar = this.d;
            BroadcastEventResult broadcastEventResult = new BroadcastEventResult();
            boolean z = map instanceof Map;
            Map map2 = map;
            if (!z) {
                map2 = null;
            }
            broadcastEventResult.detail = map2;
            t tVar = t.INSTANCE;
            bgVar.onEvent(broadcastEventResult);
        }
    }

    static {
        kge.a(-660966144);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(BroadcastAbility broadcastAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ LocalBroadcastManager access$getLocalBroadcastManager(BroadcastAbility broadcastAbility, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LocalBroadcastManager) ipChange.ipc$dispatch("e1ae1f66", new Object[]{broadcastAbility, context}) : broadcastAbility.a(context);
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(1666981960);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d8, code lost:
        if (r0 == null) goto L34;
     */
    @Override // com.taobao.android.abilityidl.ability.AbsBroadcastAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addEventListener(tb.als r18, final com.taobao.android.abilityidl.ability.o r19, final com.taobao.android.abilityidl.ability.bg r20) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.broadcast.BroadcastAbility.addEventListener(tb.als, com.taobao.android.abilityidl.ability.o, com.taobao.android.abilityidl.ability.bg):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c3, code lost:
        if (r11 == null) goto L41;
     */
    @Override // com.taobao.android.abilityidl.ability.AbsBroadcastAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dispatchEvent(tb.als r11, com.taobao.android.abilityidl.ability.p r12, tb.gml r13) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ability.impl.broadcast.BroadcastAbility.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            if (r1 == 0) goto L1b
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r10
            r1[r2] = r11
            r11 = 2
            r1[r11] = r12
            r11 = 3
            r1[r11] = r13
            java.lang.String r11 = "20cde366"
            r0.ipc$dispatch(r11, r1)
            return
        L1b:
            java.lang.String r0 = "abilityContext"
            kotlin.jvm.internal.q.d(r11, r0)
            java.lang.String r0 = "params"
            kotlin.jvm.internal.q.d(r12, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.q.d(r13, r0)
            java.lang.String r0 = r12.b
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r1 = r1 ^ r2
            r3 = 0
            if (r1 == 0) goto L38
            goto L39
        L38:
            r0 = r3
        L39:
            if (r0 != 0) goto L47
            com.alibaba.ability.result.a$a$a r11 = com.alibaba.ability.result.a$a.Companion
            java.lang.String r12 = "eventName is empty"
            com.alibaba.ability.result.ErrorResult r11 = r11.b(r12)
            r13.a(r11)
            return
        L47:
            java.lang.String r1 = "params.eventName.takeIf …         return\n        }"
            kotlin.jvm.internal.q.b(r0, r1)
            java.lang.String r1 = r12.f8891a
            java.lang.String r4 = "__APP__"
            boolean r1 = kotlin.jvm.internal.q.a(r4, r1)
            if (r1 == 0) goto Lb3
            tb.alt r11 = r11.f()
            android.content.Context r11 = r11.f()
            if (r11 != 0) goto L71
            com.alibaba.ability.result.ErrorResult r11 = new com.alibaba.ability.result.ErrorResult
            r7 = 0
            r8 = 4
            r9 = 0
            java.lang.String r5 = "500"
            java.lang.String r6 = "env.getContext is null"
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r13.a(r11)
            return
        L71:
            android.support.v4.content.LocalBroadcastManager r11 = r10.a(r11)
            android.content.Intent r13 = new android.content.Intent
            r13.<init>(r0)
            java.util.Map<java.lang.String, ? extends java.lang.Object> r12 = r12.c
            if (r12 == 0) goto Lad
            java.lang.String r0 = "detail"
            kotlin.jvm.internal.q.b(r12, r0)
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L8b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto Lad
            java.lang.Object r0 = r12.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto La8
            java.lang.String r0 = r0.toString()
            goto La9
        La8:
            r0 = r3
        La9:
            r13.putExtra(r1, r0)
            goto L8b
        Lad:
            kotlin.t r12 = kotlin.t.INSTANCE
            r11.sendBroadcast(r13)
            return
        Lb3:
            java.lang.String r11 = r12.f8891a
            if (r11 == 0) goto Lc5
            r13 = r11
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            r13 = r13 ^ r2
            if (r13 == 0) goto Lc2
            goto Lc3
        Lc2:
            r11 = r3
        Lc3:
            if (r11 != 0) goto Lc7
        Lc5:
            java.lang.String r11 = "__MEGA_GLOBAL_MESSAGE__"
        Lc7:
            java.lang.String r13 = "params.bizId?.takeIf { !…_BROADCAST_DEFAULT_BIZ_ID"
            kotlin.jvm.internal.q.b(r11, r13)
            com.alibaba.alibity.container.broadcast.b r13 = r10.a()
            java.util.Map<java.lang.String, ? extends java.lang.Object> r12 = r12.c
            r13.a(r11, r0, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.broadcast.BroadcastAbility.dispatchEvent(tb.als, com.taobao.android.abilityidl.ability.p, tb.gml):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x00bf, code lost:
        if (r8 == null) goto L48;
     */
    @Override // com.taobao.android.abilityidl.ability.AbsBroadcastAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void removeEventListener(tb.als r8, com.taobao.android.abilityidl.ability.q r9, tb.gml r10) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.broadcast.BroadcastAbility.removeEventListener(tb.als, com.taobao.android.abilityidl.ability.q, tb.gml):void");
    }

    private final LocalBroadcastManager a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalBroadcastManager) ipChange.ipc$dispatch("ae27e295", new Object[]{this, context});
        }
        LocalBroadcastManager localBroadcastManager = this.c;
        if (localBroadcastManager != null) {
            return localBroadcastManager;
        }
        LocalBroadcastManager localBroadcastManager2 = LocalBroadcastManager.getInstance(context);
        this.c = localBroadcastManager2;
        q.b(localBroadcastManager2, "LocalBroadcastManager.ge…astManager = it\n        }");
        return localBroadcastManager2;
    }

    private final void a(LocalBroadcastManager localBroadcastManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86954351", new Object[]{this, localBroadcastManager, str});
            return;
        }
        ConcurrentHashMap<String, BroadcastReceiver> concurrentHashMap = this.f1870a.get(str);
        if (concurrentHashMap == null) {
            return;
        }
        for (BroadcastReceiver broadcastReceiver : concurrentHashMap.values()) {
            localBroadcastManager.unregisterReceiver(broadcastReceiver);
        }
        this.f1870a.remove(str);
    }

    private final com.alibaba.alibity.container.broadcast.b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.alibity.container.broadcast.b) ipChange.ipc$dispatch("7791a739", new Object[]{this});
        }
        com.alibaba.alibity.container.broadcast.b bVar = this.b;
        if (bVar != null) {
            return bVar;
        }
        com.alibaba.alibity.container.broadcast.b bVar2 = new com.alibaba.alibity.container.broadcast.b();
        this.b = bVar2;
        return bVar2;
    }

    private final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        return "listener_id#" + this.e.incrementAndGet();
    }

    @Override // com.taobao.android.abilityidl.b, com.taobao.android.abilityidl.c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        LocalBroadcastManager localBroadcastManager = this.c;
        if (localBroadcastManager != null) {
            Enumeration<String> keys = this.f1870a.keys();
            q.b(keys, "broadcastReceiverMap.keys()");
            Iterator a2 = p.a((Enumeration) keys);
            while (a2.hasNext()) {
                String key = (String) a2.next();
                q.b(key, "key");
                a(localBroadcastManager, key);
            }
            this.c = null;
        }
        com.alibaba.alibity.container.broadcast.b bVar = this.b;
        if (bVar != null) {
            bVar.a();
        }
        this.b = null;
        this.d.clear();
    }
}
