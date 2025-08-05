package com.taobao.android.detail2.core.framework.internallistener.detail;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.e;
import com.taobao.android.detail2.core.framework.floatwindow.c;
import com.taobao.android.detail2.core.framework.view.manager.ListViewManager;
import com.taobao.utils.Global;
import java.util.Map;
import tb.egl;
import tb.fjp;
import tb.fjt;
import tb.fmd;
import tb.kge;

/* loaded from: classes5.dex */
public class a implements egl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private e f11562a;
    private fmd b;
    @Deprecated
    private boolean c;
    @Deprecated
    private boolean d;
    private boolean e;
    private boolean f = false;
    private final BroadcastReceiver g = new BroadcastReceiver() { // from class: com.taobao.android.detail2.core.framework.internallistener.detail.NewDetailInsideLifecycleObserver$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            a.a(a.this, true);
            fjt.b(fjt.TAG_INSIDE_DETAIL, "mReceiveOtherPlayerBroadcast mVideoReceiver: " + intent.getAction());
        }
    };

    static {
        kge.a(177617171);
        kge.a(-2043234474);
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0ad4780", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.c = z;
        return z;
    }

    public a(e eVar, fmd fmdVar) {
        this.f11562a = eVar;
        this.b = fmdVar;
    }

    private boolean a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821885c", new Object[]{this, new Float(f)})).booleanValue();
        }
        fmd fmdVar = this.b;
        return f > ((fmdVar == null || fmdVar.a() == null) ? 0.95f : this.b.a().h().b().ah());
    }

    private String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        e eVar = this.f11562a;
        return eVar != null ? eVar.k() : "NoWeexInstanceId";
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (!this.f) {
        } else {
            Global.getApplication().unregisterReceiver(this.g);
            this.f = false;
        }
    }

    @Override // tb.egl
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        fmd fmdVar = this.b;
        if (fmdVar != null && fmdVar.a() != null) {
            this.b.a().c();
        }
        this.c = false;
        fjt.a(fjt.TAG_INSIDE_DETAIL, "NewDetailInsideLifecycleObserver onInsideCreate " + h());
        fmd fmdVar2 = this.b;
        if (fmdVar2 == null) {
            return;
        }
        fmdVar2.b();
    }

    @Override // tb.egl
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_INSIDE_DETAIL, "NewDetailInsideLifecycleObserver onInsideStart " + h());
        fmd fmdVar = this.b;
        if (fmdVar == null || fmdVar.a() == null || TextUtils.isEmpty(this.b.a().h().b().ag())) {
            return;
        }
        fjt.a(fjt.TAG_INSIDE_DETAIL, "NewDetailInsideLifecycleObserver onInsideStart " + h() + " >> resumeMedia");
        k();
    }

    @Override // tb.egl
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_INSIDE_DETAIL, "NewDetailInsideLifecycleObserver onInsideResume " + h());
    }

    @Override // tb.egl
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_INSIDE_DETAIL, "NewDetailInsideLifecycleObserver onInsidePause " + h());
        j();
    }

    @Override // tb.egl
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_INSIDE_DETAIL, "NewDetailInsideLifecycleObserver onInsideStop " + h());
    }

    @Override // tb.egl
    public void f() {
        c b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        fmd fmdVar = this.b;
        if (fmdVar != null && fmdVar.a() != null) {
            this.b.a().d();
        }
        this.d = true;
        i();
        fjt.a(fjt.TAG_INSIDE_DETAIL, "NewDetailInsideLifecycleObserver onInsideDestroy " + h());
        fmd fmdVar2 = this.b;
        if (fmdVar2 == null || (b = fmdVar2.b()) == null) {
            return;
        }
        b.d();
    }

    private void j() {
        ListViewManager t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        fmd fmdVar = this.b;
        if (fmdVar == null || (t = fmdVar.t()) == null) {
            return;
        }
        t.c(false);
        this.e = true;
    }

    private void k() {
        ListViewManager t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (!this.e) {
        } else {
            this.e = false;
            fmd fmdVar = this.b;
            if (fmdVar == null || (t = fmdVar.t()) == null) {
                return;
            }
            t.o();
        }
    }

    @Override // tb.egl
    public void a(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0ff5ab", new Object[]{this, new Float(f), new Integer(i)});
            return;
        }
        e eVar = this.f11562a;
        fmd fmdVar = this.b;
        if (eVar != null && fmdVar != null) {
            c b = fmdVar.b();
            ListViewManager t = fmdVar.t();
            if (b == null || t == null) {
                fjp.c(fjp.SCENE_INSIDE_DETAIL, fjp.ERROR_CODE_INSIDE_DETAIL_NO_FLOAT_ERROR, "onInsidePageScrolled ,floatManager or listViewManager is null.", (Map<String, String>) null);
                fjt.a(fjt.TAG_INSIDE_DETAIL, "onInsidePageScrolled 小窗未创建。 floatManager 或 listViewManager 为 null . ");
                return;
            }
            try {
                if (a(f)) {
                    if (b.b()) {
                        return;
                    }
                    b.a(false);
                    fjt.a(fjt.TAG_INSIDE_DETAIL, "小窗 展示 scrollPercent = " + f + " curHeight = " + i + " id:" + h());
                    return;
                } else if (!b.b()) {
                    return;
                } else {
                    b.c();
                    fjt.a(fjt.TAG_INSIDE_DETAIL, "小窗 收起 scrollPercent = " + f + " curHeight = " + i + " id:" + h());
                    t.p();
                    return;
                }
            } catch (Throwable th) {
                fjp.c(fjp.SCENE_INSIDE_DETAIL, fjp.ERROR_CODE_INSIDE_DETAIL_FLOAT_UNKNOWN_ERROR, "onInsidePageScrolled ,unknown error.", (Map<String, String>) null);
                fjt.a(fjt.TAG_INSIDE_DETAIL, "未知异常。onInsidePageScrolled 半屏详情滚动出错。" + f + " curHeight = " + i + " id:" + h(), th);
                return;
            }
        }
        fjt.a(fjt.TAG_INSIDE_DETAIL, "未知异常。当前 detailInstance 为空。是否界面已销毁？" + f + " curHeight = " + i + " id:" + h());
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_INSIDE_DETAIL, "NewDetailInsideLifecycleObserver destroy " + h());
        this.f11562a = null;
        this.b = null;
    }
}
