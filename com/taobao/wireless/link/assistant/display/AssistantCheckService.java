package com.taobao.wireless.link.assistant.display;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Timer;
import java.util.TimerTask;
import tb.kge;
import tb.rkg;
import tb.rkj;

/* loaded from: classes9.dex */
public class AssistantCheckService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f23573a;
    private Timer b;

    static {
        kge.a(-1426449706);
    }

    public static /* synthetic */ Object ipc$super(AssistantCheckService assistantCheckService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else if (hashCode != 1992651935) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Integer(super.onStartCommand((Intent) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        this.f23573a = this;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        if (this.b == null) {
            this.b = new Timer();
            this.b.scheduleAtFixedRate(new a(this.f23573a), 0L, 1500L);
            rkg.a("link_tag", "AssistantCheckService === onStartCommand === 开启定时器，每隔1.5秒刷新一次");
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        Timer timer = this.b;
        if (timer == null) {
            return;
        }
        timer.cancel();
        this.b = null;
        rkg.a("link_tag", "AssistantCheckService === onDestroy === Service被终止的同时也停止定时器继续运行");
    }

    /* loaded from: classes9.dex */
    public static class a extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f23574a;

        static {
            kge.a(-639710702);
        }

        public a(Context context) {
            this.f23574a = context;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            rkg.a("link_tag", "AssistantCheckService === RefreshTask === 1.5s检测，显示小助手");
            if (rkj.b(this.f23574a)) {
                return;
            }
            com.taobao.wireless.link.assistant.display.a.a(this.f23574a);
        }
    }
}
