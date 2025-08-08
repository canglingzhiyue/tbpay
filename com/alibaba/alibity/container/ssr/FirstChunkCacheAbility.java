package com.alibaba.alibity.container.ssr;

import android.net.Uri;
import android.taobao.windvane.config.j;
import android.taobao.windvane.export.network.Request;
import android.taobao.windvane.export.network.RequestCallback;
import android.taobao.windvane.export.network.f;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.storage.FirstChunkStorage;
import android.taobao.windvane.extra.storage.ResponseContext;
import android.taobao.windvane.thread.WVThreadPool;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.weex_framework.adapter.e;
import com.taobao.tao.log.TLog;
import com.taobao.themis.taobao.impl.TMS;
import com.taobao.themis.web.utils.HTMLPrefetchJob;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.i;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.alm;
import tb.aln;
import tb.als;
import tb.tbt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J2\u0010\u000f\u001a\u00020\u00102\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nj\u0002`\f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J2\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J2\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J2\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J2\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J2\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0019"}, d2 = {"Lcom/alibaba/alibity/container/ssr/FirstChunkCacheAbility;", "Lcom/alibaba/ability/base/AbsBaseAbility;", "()V", e.RECORD_EXECUTE, "Lcom/alibaba/ability/result/ExecuteResult;", "api", "", "context", "Lcom/alibaba/ability/env/IAbilityContext;", "params", "", "", "Lcom/alibaba/ability/AbilityData;", "callback", "Lcom/alibaba/ability/callback/AbilityCallback;", "getLongValue", "", "key", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, tbt.PRE_RENDER, "", "preload", "preloadFirstChunk", "removeFirstChunkCache", "setFirstChunkCache", "megability-kit-container-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class FirstChunkCacheAbility extends alm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/alibaba/alibity/container/ssr/FirstChunkCacheAbility$setFirstChunkCache$1$1"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ als f2001a;
        public final /* synthetic */ FirstChunkStorage b;
        public final /* synthetic */ ResponseContext c;
        public final /* synthetic */ aln d;

        public b(als alsVar, FirstChunkStorage firstChunkStorage, ResponseContext responseContext, aln alnVar) {
            this.f2001a = alsVar;
            this.b = firstChunkStorage;
            this.c = responseContext;
            this.d = alnVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Result.a aVar = Result.Companion;
                TLog.loge("WindVane", "FirstChunkCacheAbility", "setFirstChunkCacheAsync");
                com.taobao.themis.kernel.utils.a.a(new FirstChunkCacheAbility$setFirstChunkCache$$inlined$runCatching$lambda$1$1(this.b.write(this.c), this));
                Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                Result.m2371constructorimpl(i.a(th));
            }
        }
    }

    public static /* synthetic */ Object ipc$super(FirstChunkCacheAbility firstChunkCacheAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private final void a(als alsVar, Map<String, ? extends Object> map, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cd50642", new Object[]{this, alsVar, map, alnVar});
            return;
        }
        String str = (String) alsVar.c("url");
        if (StringUtils.isEmpty(str)) {
            alnVar.a(a$a.Companion.b("url is empty"));
            return;
        }
        String a2 = com.alibaba.ability.e.a(map, "html", (String) null);
        String a3 = com.alibaba.ability.e.a(map, "version", (String) null);
        FirstChunkStorage firstChunkStorage = new FirstChunkStorage(str);
        ResponseContext read = firstChunkStorage.read(str);
        if (read == null) {
            read = new ResponseContext();
        }
        if (read.getExpiredTime() == 0) {
            read.setExpiredTime(ResponseContext.getDefaultExpiredTime());
        }
        read.setExpiredTime(a(map, "expireTime", read.getExpiredTime()));
        if (!StringUtils.isEmpty(a3)) {
            read.setVersion(a3);
        }
        if (!StringUtils.isEmpty(a2)) {
            read.setHtml(a2);
        }
        read.setPriority(1);
        try {
            Result.a aVar = Result.Companion;
            if (com.taobao.themis.kernel.utils.t.h(alsVar.f().f()).b()) {
                WVThreadPool.getInstance().execute(new b(alsVar, firstChunkStorage, read, alnVar));
            } else {
                TLog.loge("WindVane", "FirstChunkCacheAbility", "setFirstChunkCacheSync");
                if (firstChunkStorage.write(read)) {
                    alnVar.a(new FinishResult(null, null, 3, null));
                } else {
                    alnVar.a(new ErrorResult("500", "内部未知错误", (Map) null, 4, (o) null));
                }
            }
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(i.a(th));
        }
    }

    private final void d(als alsVar, Map<String, ? extends Object> map, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b992af5f", new Object[]{this, alsVar, map, alnVar});
            return;
        }
        String a2 = com.alibaba.ability.e.a(map, "url", (String) null);
        if (a2 == null) {
            a2 = (String) alsVar.c("url");
        }
        if (StringUtils.isEmpty(a2)) {
            alnVar.a(a$a.Companion.b("url is empty"));
            return;
        }
        new FirstChunkStorage(a2).remove();
        alnVar.a(new FinishResult(null, null, 3, null));
    }

    private final void b(als alsVar, Map<String, ? extends Object> map, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1143ea1", new Object[]{this, alsVar, map, alnVar});
            return;
        }
        String a2 = com.alibaba.ability.e.a(map, "url", (String) null);
        if (a2 == null) {
            alnVar.a(a$a.Companion.b("url is empty"));
        } else if (!j.commonConfig.cF) {
            alnVar.a(a$a.Companion.b("api is disabled"));
        } else {
            WVCore wVCore = WVCore.getInstance();
            q.b(wVCore, "WVCore.getInstance()");
            if (!wVCore.isUCSupport()) {
                alnVar.a(a$a.Companion.b("uc is not support"));
                return;
            }
            if (n.b((CharSequence) a2, (CharSequence) com.taobao.themis.kernel.i.APP_ID, false, 2, (Object) null)) {
                TMS tms = TMS.INSTANCE;
                Uri parse = Uri.parse(a2);
                q.b(parse, "Uri.parse(url)");
                tms.prefetch(parse, true);
            } else {
                HTMLPrefetchJob.preloadHTMLResource(a2, true);
            }
            alnVar.a(new FinishResult(null, null, 3, null));
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v6, types: [T, java.lang.Integer] */
    private final void c(als alsVar, Map<String, ? extends Object> map, aln alnVar) {
        ResponseContext read;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45537700", new Object[]{this, alsVar, map, alnVar});
            return;
        }
        String a2 = com.alibaba.ability.e.a(map, "url", (String) null);
        Boolean a3 = com.alibaba.ability.e.a(map, "forceUpdate", (Boolean) false);
        if (StringUtils.isEmpty(a2)) {
            alnVar.a(a$a.Companion.b("url is empty"));
        } else if (a3 == null) {
            alnVar.a(a$a.Companion.b("forceUpdate shouldn't be null"));
        } else {
            FirstChunkStorage firstChunkStorage = new FirstChunkStorage(a2);
            if (a3.booleanValue() || (read = firstChunkStorage.read(a2)) == null || read.isExpired()) {
                z = true;
            }
            if (!z) {
                alnVar.a(new FinishResult(ai.a(kotlin.j.a("msg", "don't update cache")), null, 2, null));
                return;
            }
            Request.a aVar = new Request.a();
            q.a((Object) a2);
            Request a4 = aVar.a(a2).b("GET").a(true).a();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (Integer) 0;
            objectRef.element = Integer.valueOf(f.a(a4, new a(objectRef, alnVar)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/alibaba/alibity/container/ssr/FirstChunkCacheAbility$preloadFirstChunk$1", "Landroid/taobao/windvane/export/network/RequestCallback;", "onError", "", "code", "", "msg", "", "onFinish", "megability-kit-container-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a extends RequestCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f2000a;
        public final /* synthetic */ aln b;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 195948249) {
                super.onFinish();
                return null;
            } else if (hashCode != 2053577885) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onError(((Number) objArr[0]).intValue(), (String) objArr[1]);
                return null;
            }
        }

        public a(Ref.ObjectRef objectRef, aln alnVar) {
            this.f2000a = objectRef;
            this.b = alnVar;
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onError(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str});
                return;
            }
            super.onError(i, str);
            Integer num = (Integer) this.f2000a.element;
            if (num != null) {
                f.a(num.intValue());
            }
            this.b.a(new ErrorResult("500", "网络错误", (Map) null, 4, (o) null));
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
                return;
            }
            super.onFinish();
            Integer num = (Integer) this.f2000a.element;
            if (num != null) {
                f.a(num.intValue());
            }
            this.b.a(new FinishResult(null, null, 3, null));
        }
    }

    private final void e(als alsVar, Map<String, ? extends Object> map, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd1e7be", new Object[]{this, alsVar, map, alnVar});
            return;
        }
        String a2 = com.alibaba.ability.e.a(map, "url", (String) null);
        if (StringUtils.isEmpty(a2)) {
            alnVar.a(a$a.Companion.b("url is empty"));
            return;
        }
        q.a((Object) a2);
        if (HTMLPrefetchJob.preloadJSAPI(a2)) {
            alnVar.a(new FinishResult(null, null, 3, null));
        } else {
            alnVar.a(new ErrorResult("500", "preload failed", (Map) null, 4, (o) null));
        }
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        q.d(api, "api");
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        switch (api.hashCode()) {
            case -950587911:
                if (!api.equals("prerender")) {
                    return null;
                }
                b(context, params, callback);
                return null;
            case -910911709:
                if (!api.equals("setFirstChunkCache")) {
                    return null;
                }
                a(context, params, callback);
                return null;
            case -318476791:
                if (!api.equals("preload")) {
                    return null;
                }
                e(context, params, callback);
                return null;
            case 1686741126:
                if (!api.equals("preloadFirstChunk")) {
                    return null;
                }
                c(context, params, callback);
                return null;
            case 1806389953:
                if (!api.equals("removeFirstChunkCache")) {
                    return null;
                }
                d(context, params, callback);
                return null;
            default:
                return null;
        }
    }

    private final long a(Map<String, ? extends Object> map, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ec67cf1", new Object[]{this, map, str, new Long(j)})).longValue();
        }
        Object obj = map.get(str);
        return obj instanceof Long ? ((Number) obj).longValue() : j;
    }
}
