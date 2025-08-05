package com.taobao.themis.inside.adapter;

import com.alibaba.analytics.core.sync.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.logger.IRemoteLoggerAdapter;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import tb.kge;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J:\u0010\u000e\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016JB\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J:\u0010\u0012\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J:\u0010\u0013\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J:\u0010\u0014\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/taobao/themis/inside/adapter/TMSRemoteLoggerImpl;", "Lcom/taobao/themis/kernel/logger/IRemoteLoggerAdapter;", "()V", "mLogExecutorService", "Ljava/util/concurrent/ExecutorService;", Repeat.D, "", AliFestivalWVPlugin.PARAMS_MODULE_NAME, "", "eventName", "parentId", "eventId", "extra", "Lcom/alibaba/fastjson/JSONObject;", "e", "eventLog", "level", "Lcom/taobao/android/riverlogger/RVLLevel;", q.MSGTYPE_INTERVAL, "v", "w", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSRemoteLoggerImpl implements IRemoteLoggerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f22456a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RVLLevel f22457a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ JSONObject f;

        public a(RVLLevel rVLLevel, String str, String str2, String str3, String str4, JSONObject jSONObject) {
            this.f22457a = rVLLevel;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                RVLLevel rVLLevel = this.f22457a;
                String str = this.b;
                if (str == null) {
                    str = "";
                }
                com.taobao.android.riverlogger.b a2 = e.a(rVLLevel, str);
                String str2 = this.c;
                if (str2 == null) {
                    str2 = "";
                }
                a2.a(str2, this.d).b(this.e).a((Map<String, ?>) this.f).a();
            } catch (Throwable th) {
                TMSLogger.b("TMSRemoteLoggerImpl", "", th);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "newThreadName"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // com.taobao.android.virtual_thread.face.h
        public final String newThreadName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this}) : "Themis_Remote_Log_Executor";
        }
    }

    static {
        kge.a(-329235181);
        kge.a(988107731);
    }

    public TMSRemoteLoggerImpl() {
        ExecutorService newSingleThreadExecutor = VExecutors.newSingleThreadExecutor(b.INSTANCE);
        kotlin.jvm.internal.q.b(newSingleThreadExecutor, "VExecutors.newSingleThre…is_Remote_Log_Executor\"})");
        this.f22456a = newSingleThreadExecutor;
        IEnvironmentService iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class);
        e.a(iEnvironmentService != null ? iEnvironmentService.getApplicationContext() : null);
    }

    @Override // com.taobao.themis.kernel.logger.IRemoteLoggerAdapter
    public void v(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e91e6b", new Object[]{this, str, str2, str3, str4, jSONObject});
        } else {
            a(RVLLevel.Verbose, str, str2, str4, str3, jSONObject);
        }
    }

    @Override // com.taobao.themis.kernel.logger.IRemoteLoggerAdapter
    public void i(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa90558", new Object[]{this, str, str2, str3, str4, jSONObject});
        } else {
            a(RVLLevel.Info, str, str2, str4, str3, jSONObject);
        }
    }

    @Override // com.taobao.themis.kernel.logger.IRemoteLoggerAdapter
    public void d(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd41993d", new Object[]{this, str, str2, str3, str4, jSONObject});
        } else {
            a(RVLLevel.Debug, str, str2, str3, str4, jSONObject);
        }
    }

    @Override // com.taobao.themis.kernel.logger.IRemoteLoggerAdapter
    public void w(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8664340a", new Object[]{this, str, str2, str3, str4, jSONObject});
        } else {
            a(RVLLevel.Warn, str, str2, str3, str4, jSONObject);
        }
    }

    @Override // com.taobao.themis.kernel.logger.IRemoteLoggerAdapter
    public void e(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbcaedc", new Object[]{this, str, str2, str3, str4, jSONObject});
        } else {
            a(RVLLevel.Error, str, str2, str3, str4, jSONObject);
        }
    }

    private final void a(RVLLevel rVLLevel, String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5125c8d1", new Object[]{this, rVLLevel, str, str2, str3, str4, jSONObject});
        } else {
            this.f22456a.execute(new a(rVLLevel, str, str2, str4, str3, jSONObject));
        }
    }
}
