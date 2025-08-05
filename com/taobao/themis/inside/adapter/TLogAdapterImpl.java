package com.taobao.themis.inside.adapter;

import android.os.Process;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.e;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.concurrent.ExecutorService;
import tb.kge;

/* loaded from: classes9.dex */
public class TLogAdapterImpl implements TMSLogger.Adapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TLOG_MODULE = "Themis";

    /* renamed from: a  reason: collision with root package name */
    private ExecutorService f22429a;

    static {
        kge.a(-1906325918);
        kge.a(847946968);
    }

    public TLogAdapterImpl() {
        if (AdapterForTLog.isValid()) {
            e.a().a(TLOG_MODULE, LogLevel.D);
        }
        if (this.f22429a == null) {
            this.f22429a = VExecutors.newSingleThreadExecutor(new h() { // from class: com.taobao.themis.inside.adapter.TLogAdapterImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.virtual_thread.face.h
                public String newThreadName() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
                    }
                    return "ThemisLogThread-" + Process.myPid();
                }
            });
        }
    }

    private void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        ExecutorService executorService = this.f22429a;
        if (executorService != null) {
            executorService.execute(runnable);
        } else {
            TLog.loge(TLOG_MODULE, "TLog线程未准备好");
        }
    }

    @Override // com.taobao.themis.kernel.basic.TMSLogger.Adapter
    public void d(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
        } else {
            a(new Runnable() { // from class: com.taobao.themis.inside.adapter.TLogAdapterImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TLog.logd(TLogAdapterImpl.TLOG_MODULE, str, str2);
                    }
                }
            });
        }
    }

    @Override // com.taobao.themis.kernel.basic.TMSLogger.Adapter
    public void e(final String str, final String str2, final Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{this, str, str2, th});
        } else {
            a(new Runnable() { // from class: com.taobao.themis.inside.adapter.TLogAdapterImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Throwable th2 = th;
                    if (th2 == null) {
                        TLog.loge(TLogAdapterImpl.TLOG_MODULE, str, str2);
                        Log.e(str, str2);
                        return;
                    }
                    TLog.loge(TLogAdapterImpl.TLOG_MODULE, str, str2, th2);
                    Log.e(str, str2, th);
                }
            });
        }
    }

    @Override // com.taobao.themis.kernel.basic.TMSLogger.Adapter
    public void w(final String str, final String str2, final Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818e83a3", new Object[]{this, str, str2, th});
        } else {
            a(new Runnable() { // from class: com.taobao.themis.inside.adapter.TLogAdapterImpl.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TLog.logw(TLogAdapterImpl.TLOG_MODULE, str, str2, th);
                    }
                }
            });
        }
    }

    @Override // com.taobao.themis.kernel.basic.TMSLogger.Adapter
    public void i(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{this, str, str2});
        } else {
            a(new Runnable() { // from class: com.taobao.themis.inside.adapter.TLogAdapterImpl.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TLog.logi(TLogAdapterImpl.TLOG_MODULE, str, str2);
                    }
                }
            });
        }
    }

    @Override // com.taobao.themis.kernel.basic.TMSLogger.Adapter
    public void v(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625b1491", new Object[]{this, str, str2});
        } else {
            a(new Runnable() { // from class: com.taobao.themis.inside.adapter.TLogAdapterImpl.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TLog.logv(TLogAdapterImpl.TLOG_MODULE, str, str2);
                    }
                }
            });
        }
    }
}
