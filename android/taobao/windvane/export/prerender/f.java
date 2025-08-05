package android.taobao.windvane.export.prerender;

import android.taobao.windvane.export.prerender.e;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.orange.OrangeConfig;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ)\u0010\u000b\u001a\u00020\n2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n0\rR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroid/taobao/windvane/export/prerender/TMSPrerenderService;", "", "()V", "currentConfigValue", "", "hasInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "tmsPrerenderModel", "Landroid/taobao/windvane/export/prerender/TMSPrerenderModel;", TBPlayerConst.TBPlayerMethodSetup, "", "start", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final f INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static AtomicBoolean f1611a;
    private static String b;
    private static TMSPrerenderModel c;

    static {
        kge.a(-1009871063);
        INSTANCE = new f();
        f1611a = new AtomicBoolean(false);
    }

    private f() {
    }

    public static final /* synthetic */ String a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91de4122", new Object[]{fVar}) : b;
    }

    public static final /* synthetic */ void a(f fVar, TMSPrerenderModel tMSPrerenderModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("441ff6b0", new Object[]{fVar, tMSPrerenderModel});
        } else {
            c = tMSPrerenderModel;
        }
    }

    public static final /* synthetic */ void a(f fVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eaa6d88", new Object[]{fVar, str});
        } else {
            b = str;
        }
    }

    public static final /* synthetic */ TMSPrerenderModel b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSPrerenderModel) ipChange.ipc$dispatch("db7644e9", new Object[]{fVar}) : c;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!f1611a.compareAndSet(false, true)) {
        } else {
            com.taobao.android.riverlogger.e.a(RVLLevel.Info, "Themis/Performance/Prerender").a(TBPlayerConst.TBPlayerMethodSetup).a();
            OrangeConfig.getInstance().registerListener(new String[]{"themis_prerender_config"}, a.INSTANCE, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032F\u0010\u0005\u001aB\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004* \u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00070\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "namespace", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "", "onConfigUpdate"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a implements com.taobao.orange.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // com.taobao.orange.d
        public final void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (!q.a((Object) "themis_prerender_config", (Object) str)) {
            } else {
                String customConfig = OrangeConfig.getInstance().getCustomConfig("themis_prerender_config", null);
                String str2 = customConfig;
                if (TextUtils.isEmpty(str2)) {
                    com.taobao.android.riverlogger.e.a(RVLLevel.Info, "Themis/Performance/Prerender").a("orangeUpdate").a("msg", (Object) "configValue is empty").a();
                } else if (TextUtils.equals(str2, f.a(f.INSTANCE))) {
                    com.taobao.android.riverlogger.e.a(RVLLevel.Info, "Themis/Performance/Prerender").a("orangeUpdate").a("msg", (Object) "configValue is same").a();
                } else {
                    com.taobao.android.riverlogger.b a2 = com.taobao.android.riverlogger.e.a(RVLLevel.Info, "Themis/Performance/Prerender").a("orangeUpdate");
                    synchronized (f.INSTANCE) {
                        try {
                            f.a(f.INSTANCE, customConfig);
                            f.a(f.INSTANCE, (TMSPrerenderModel) JSONObject.parseObject(customConfig, TMSPrerenderModel.class));
                            TMSPrerenderModel b = f.b(f.INSTANCE);
                            if (b != null && b.getAutoStart()) {
                                f.INSTANCE.a(TMSPrerenderService$setup$1$1$1.INSTANCE);
                            }
                            a2.a("updateSuccess", (Object) true);
                        } catch (Exception unused) {
                            a2.a("updateFail", (Object) false);
                        }
                    }
                    a2.a();
                }
            }
        }
    }

    public final void a(rul<? super Boolean, t> callback) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc03baf", new Object[]{this, callback});
            return;
        }
        q.d(callback, "callback");
        if (!f1611a.get()) {
            callback.mo2421invoke(false);
            return;
        }
        TMSPrerenderModel tMSPrerenderModel = c;
        if (tMSPrerenderModel != null) {
            if (!tMSPrerenderModel.getEnable()) {
                com.taobao.android.riverlogger.e.a(RVLLevel.Error, "Themis/Performance/Prerender").a("start").a("msg", (Object) "config.enable is false").a();
                callback.mo2421invoke(false);
                return;
            }
            Iterator<T> it = tMSPrerenderModel.getTasks().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (tMSPrerenderModel.isMatchCondition((TMSPrerenderTaskModel) obj)) {
                    break;
                }
            }
            TMSPrerenderTaskModel tMSPrerenderTaskModel = (TMSPrerenderTaskModel) obj;
            if (tMSPrerenderTaskModel != null) {
                com.taobao.android.riverlogger.e.a(RVLLevel.Error, "Themis/Performance/Prerender").a("start").a("config", (Object) JSONObject.toJSONString(tMSPrerenderTaskModel)).a();
                try {
                    Result.a aVar = Result.Companion;
                    e.a aVar2 = new e.a();
                    String url = tMSPrerenderTaskModel.getUrl();
                    q.a((Object) url);
                    e.a b2 = aVar2.a(url).a(1).b(tMSPrerenderTaskModel.getSpmBVerifyValue());
                    Long delayNextTime = tMSPrerenderTaskModel.getDelayNextTime();
                    d.INSTANCE.a(b2.a(delayNextTime != null ? delayNextTime.longValue() : -1L).a(), callback);
                    Result.m2371constructorimpl(t.INSTANCE);
                    return;
                } catch (Throwable th) {
                    Result.a aVar3 = Result.Companion;
                    Result.m2371constructorimpl(i.a(th));
                    return;
                }
            }
        }
        callback.mo2421invoke(false);
    }
}
