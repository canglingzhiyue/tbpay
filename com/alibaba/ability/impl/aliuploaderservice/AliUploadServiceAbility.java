package com.alibaba.ability.impl.aliuploaderservice;

import android.os.SystemClock;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsAliUploadServiceAbility;
import com.taobao.android.abilityidl.ability.AliUploadServiceCompleteResult;
import com.taobao.android.abilityidl.ability.AliUploadServiceProgressResult;
import com.taobao.android.abilityidl.ability.fx;
import com.uploader.export.e;
import com.uploader.export.g;
import com.uploader.export.i;
import com.uploader.export.j;
import com.uploader.export.l;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes2.dex */
public final class AliUploadServiceAbility extends AbsAliUploadServiceAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private i f1830a;

    static {
        kge.a(1273272567);
    }

    public static /* synthetic */ Object ipc$super(AliUploadServiceAbility aliUploadServiceAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ void access$setTask$p(AliUploadServiceAbility aliUploadServiceAbility, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15656bd0", new Object[]{aliUploadServiceAbility, iVar});
        } else {
            aliUploadServiceAbility.f1830a = iVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x015f, code lost:
        if (r1 == null) goto L71;
     */
    @Override // com.taobao.android.abilityidl.ability.AbsAliUploadServiceAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void upload(tb.als r19, com.taobao.android.abilityidl.ability.fw r20, com.taobao.android.abilityidl.ability.fx r21) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.aliuploaderservice.AliUploadServiceAbility.upload(tb.als, com.taobao.android.abilityidl.ability.fw, com.taobao.android.abilityidl.ability.fx):void");
    }

    /* loaded from: classes2.dex */
    public static final class a implements i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f1831a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        @Override // com.uploader.export.i
        public Map<String, String> getMetaInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("8d01c005", new Object[]{this});
            }
            return null;
        }

        public a(String str, String str2, String str3) {
            this.f1831a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // com.uploader.export.i
        public String getBizType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this}) : this.f1831a;
        }

        @Override // com.uploader.export.i
        public String getFilePath() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this}) : this.b;
        }

        @Override // com.uploader.export.i
        public String getFileType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("105a7e2d", new Object[]{this}) : this.c;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements com.uploader.export.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ fx b;
        public final /* synthetic */ int c;
        private volatile long d;

        /* loaded from: classes2.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.this.b.a();
                }
            }
        }

        /* renamed from: com.alibaba.ability.impl.aliuploaderservice.AliUploadServiceAbility$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class RunnableC0051b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ j b;

            public RunnableC0051b(j jVar) {
                this.b = jVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                fx fxVar = b.this.b;
                StringBuilder sb = new StringBuilder();
                sb.append("upload error, code: ");
                j jVar = this.b;
                String str = null;
                sb.append(jVar != null ? jVar.f24058a : null);
                sb.append(", subCode: ");
                j jVar2 = this.b;
                sb.append(jVar2 != null ? jVar2.b : null);
                sb.append(", info: ");
                j jVar3 = this.b;
                if (jVar3 != null) {
                    str = jVar3.c;
                }
                sb.append(str);
                fxVar.a(new ErrorResult("500", sb.toString(), (Map) null, 4, (o) null));
            }
        }

        /* loaded from: classes2.dex */
        public static final class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ int b;

            public c(int i) {
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                fx fxVar = b.this.b;
                AliUploadServiceProgressResult aliUploadServiceProgressResult = new AliUploadServiceProgressResult();
                aliUploadServiceProgressResult.progress = Double.valueOf(this.b);
                t tVar = t.INSTANCE;
                fxVar.a(aliUploadServiceProgressResult);
            }
        }

        /* loaded from: classes2.dex */
        public static final class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ e b;

            public d(e eVar) {
                this.b = eVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                fx fxVar = b.this.b;
                AliUploadServiceCompleteResult aliUploadServiceCompleteResult = new AliUploadServiceCompleteResult();
                e eVar = this.b;
                aliUploadServiceCompleteResult.path = eVar != null ? eVar.b() : null;
                t tVar = t.INSTANCE;
                fxVar.a(aliUploadServiceCompleteResult);
            }
        }

        @Override // com.uploader.export.d
        public void onPause(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88a48f02", new Object[]{this, iVar});
            }
        }

        @Override // com.uploader.export.d
        public void onResume(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc5b564d", new Object[]{this, iVar});
            }
        }

        @Override // com.uploader.export.d
        public void onStart(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93ee4d16", new Object[]{this, iVar});
            }
        }

        @Override // com.uploader.export.d
        public void onWait(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1be90445", new Object[]{this, iVar});
            }
        }

        public b(fx fxVar, int i) {
            this.b = fxVar;
            this.c = i;
        }

        @Override // com.uploader.export.d
        public void onSuccess(i iVar, e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0ea4aef", new Object[]{this, iVar, eVar});
                return;
            }
            com.alibaba.ability.e.c((Runnable) new d(eVar));
            AliUploadServiceAbility.access$setTask$p(AliUploadServiceAbility.this, null);
        }

        @Override // com.uploader.export.d
        public void onFailure(i iVar, j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b751f291", new Object[]{this, iVar, jVar});
                return;
            }
            com.alibaba.ability.e.c((Runnable) new RunnableC0051b(jVar));
            AliUploadServiceAbility.access$setTask$p(AliUploadServiceAbility.this, null);
        }

        @Override // com.uploader.export.d
        public void onCancel(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("227e67e0", new Object[]{this, iVar});
                return;
            }
            com.alibaba.ability.e.c((Runnable) new a());
            AliUploadServiceAbility.access$setTask$p(AliUploadServiceAbility.this, null);
        }

        @Override // com.uploader.export.d
        public void onProgress(i iVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43b04c96", new Object[]{this, iVar, new Integer(i)});
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (i != 100 && uptimeMillis - this.d < this.c) {
                return;
            }
            this.d = uptimeMillis;
            com.alibaba.ability.e.c((Runnable) new c(i));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAliUploadServiceAbility
    public void cancel(als abilityContext, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca6d833", new Object[]{this, abilityContext, callback});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(callback, "callback");
        a();
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        i iVar = this.f1830a;
        if (iVar == null) {
            return;
        }
        g a2 = l.a();
        if (a2 != null) {
            a2.cancelAsync(iVar);
        }
        this.f1830a = null;
    }

    @Override // com.taobao.android.abilityidl.b, com.taobao.android.abilityidl.c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        a();
    }
}
