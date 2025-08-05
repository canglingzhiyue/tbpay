package tb;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.loader.config.ConfigItem;
import com.taobao.alilive.aliliveframework.frame.loader.config.a;
import com.taobao.alilive.aliliveframework.frame.loader.config.b;
import com.taobao.android.task.Coordinator;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.u;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class deg extends dea implements a, ezu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b c;
    private List<ConfigItem> d;
    private Handler e;
    private List<String> f;
    private boolean g;
    private Handler h;
    private final List<Runnable> i;

    static {
        kge.a(104894963);
        kge.a(-1770130644);
        kge.a(790070394);
    }

    public static /* synthetic */ Object ipc$super(deg degVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1783009265) {
            if (hashCode == 90991720) {
                super.a();
                return null;
            } else if (hashCode != 598332509) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return super.a((BaseFrame) objArr[0], (String) objArr[1], (ViewStub) objArr[2], (dec) objArr[3]);
            }
        }
        return super.a((BaseFrame) objArr[0], (String) objArr[1], (View) objArr[2], (dec) objArr[3]);
    }

    public static /* synthetic */ List a(deg degVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("acd026f5", new Object[]{degVar}) : degVar.i;
    }

    public static /* synthetic */ ded a(deg degVar, BaseFrame baseFrame, String str, View view, dec decVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ded) ipChange.ipc$dispatch("7741cea5", new Object[]{degVar, baseFrame, str, view, decVar}) : super.a(baseFrame, str, view, decVar);
    }

    public static /* synthetic */ ded a(deg degVar, BaseFrame baseFrame, String str, ViewStub viewStub, dec decVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ded) ipChange.ipc$dispatch("3614f7f3", new Object[]{degVar, baseFrame, str, viewStub, decVar}) : super.a(baseFrame, str, viewStub, decVar);
    }

    public deg(Context context, boolean z, boolean z2) {
        super(context);
        this.e = new Handler();
        this.f = new ArrayList();
        this.i = new ArrayList();
        this.c = new ddz();
        this.g = z2;
        f();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.h = new Handler(Coordinator.getWorkerLooper());
        }
    }

    @Override // tb.dea, tb.ded
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        this.c.a(this);
    }

    @Override // tb.dea, tb.ded
    public ded a(final BaseFrame baseFrame, final String str, final ViewStub viewStub, final dec decVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ded) ipChange.ipc$dispatch("23a9d45d", new Object[]{this, baseFrame, str, viewStub, decVar});
        }
        BaseFrame a2 = this.f26715a.a(str);
        if (a2 != null && a2.asyncRenderComponent() && this.h != null && (viewStub.getParent() instanceof ViewGroup)) {
            a2.asyncRenderComponentWithSerialFrameInstaller(baseFrame, (ViewGroup) viewStub.getParent(), viewStub, this.h, this.e, Integer.valueOf(hashCode()), b(str));
        } else {
            Runnable runnable = new Runnable() { // from class: tb.deg.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    deg.a(deg.this, baseFrame, str, viewStub, decVar);
                    deg.a(deg.this).remove(this);
                }
            };
            this.i.add(runnable);
            ADaemon.postMainLooper(runnable, b(str));
        }
        return this;
    }

    @Override // tb.dea, tb.ded
    public ded a(final BaseFrame baseFrame, final String str, final View view, final dec decVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ded) ipChange.ipc$dispatch("95b9700f", new Object[]{this, baseFrame, str, view, decVar});
        }
        Runnable runnable = new Runnable() { // from class: tb.deg.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                deg.a(deg.this, baseFrame, str, view, decVar);
                deg.a(deg.this).remove(this);
            }
        };
        this.i.add(runnable);
        ADaemon.postMainLooper(runnable, b(str));
        return this;
    }

    @Override // tb.dea, tb.ded
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        for (Runnable runnable : this.i) {
            ADaemon.removeMainLooperCallback(runnable);
        }
        Handler handler2 = this.h;
        if (handler2 == null) {
            return;
        }
        handler2.removeCallbacksAndMessages(Integer.valueOf(hashCode()));
    }

    @Override // com.taobao.alilive.aliliveframework.frame.loader.config.a
    public void a(List<ConfigItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.d = list;
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.loader.config.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        q.a("FrameInstaller", "Config load failure, errorMsg = " + str2);
    }

    private ConfigItem a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigItem) ipChange.ipc$dispatch("ccdaee8", new Object[]{this, str});
        }
        List<ConfigItem> list = this.d;
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (ConfigItem configItem : this.d) {
            if (configItem.component.equals(str)) {
                return configItem;
            }
        }
        return null;
    }

    @Override // tb.dea, tb.ded
    public long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{this, str})).longValue();
        }
        ConfigItem a2 = a(str);
        long j = 0;
        if (a2 != null && a2.delay > 0) {
            j = a2.delay;
        }
        if (this.g) {
            j += u.aX();
        }
        q.c("FrameInstaller", str + " delay = " + j);
        return j;
    }

    @Override // tb.ezu
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.h;
        if (handler2 == null) {
            return;
        }
        handler2.removeCallbacksAndMessages(Integer.valueOf(hashCode()));
    }
}
