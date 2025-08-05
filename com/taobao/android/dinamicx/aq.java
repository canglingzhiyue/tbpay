package com.taobao.android.dinamicx;

import android.util.Log;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.fpv;
import tb.fpw;
import tb.fuw;
import tb.fxe;
import tb.kge;

/* loaded from: classes5.dex */
public class aq extends ap {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public fpv<DXRuntimeContext> g;
    public Runnable h;

    static {
        kge.a(-250673419);
    }

    public static /* synthetic */ Object ipc$super(aq aqVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public aq(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, r rVar, ab abVar, View view, fpv<DXRuntimeContext> fpvVar) {
        super(dXRuntimeContext, dXRenderOptions, rVar, abVar, view);
        this.g = fpvVar;
    }

    @Override // com.taobao.android.dinamicx.ap
    public void a() {
        fpw q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            as b = b();
            if (bx.l()) {
                Log.e("RecyclerPrefetch", "开始预加载: " + this.f11806a.u());
            }
            b.a(this.f11806a.d(), null, this.f.get(), this.f11806a, this.d, -1);
            if (bx.l()) {
                Log.e("RecyclerPrefetch", "结束预加载: " + this.f11806a.u());
            }
            this.b = true;
            if (this.g != null && !this.d.f()) {
                if (!this.f11806a.o()) {
                    a(this.f11806a.d());
                    this.h = new Runnable() { // from class: com.taobao.android.dinamicx.aq.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                aq.this.g.a(aq.this.f11806a);
                            }
                        }
                    };
                } else {
                    this.h = new Runnable() { // from class: com.taobao.android.dinamicx.aq.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                aq.this.g.a(aq.this.f11806a, null);
                            }
                        }
                    };
                }
                fxe.c(this.h);
            } else if (bx.l() && this.f11806a.d() != null) {
                fuw.d("RecyclerPrefetch", this.f11806a.d().hashCode() + " 取消 ");
            }
            if (!this.f11806a.C().h() || (q = this.f11806a.C().b().q()) == null) {
                return;
            }
            q.e();
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
            this.b = true;
            if (this.g == null || this.d.f()) {
                return;
            }
            this.h = new Runnable() { // from class: com.taobao.android.dinamicx.aq.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        aq.this.g.a(aq.this.f11806a, th);
                    }
                }
            };
            fxe.c(this.h);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        if (bx.l()) {
            Log.e("RecyclerPrefetch", "异步任务被取消: " + this.f11806a.u());
        }
        if (this.h != null) {
            if (bx.l()) {
                Log.e("RecyclerPrefetch", "有callback，主线程回调被取消: " + this.f11806a.u());
            }
            fxe.d(this.h);
        }
        this.d.a(true);
        this.b = true;
    }

    private void a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613bf3c7", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode != null) {
            try {
                if (dXWidgetNode instanceof bs) {
                    ((bs) dXWidgetNode).onPrefetchSuccess();
                }
                if (dXWidgetNode.getChildren() == null || dXWidgetNode.getChildren().isEmpty()) {
                    return;
                }
                for (DXWidgetNode dXWidgetNode2 : dXWidgetNode.getChildren()) {
                    a(dXWidgetNode2);
                }
            } catch (Throwable th) {
                s sVar = new s(this.f11806a.A());
                s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_ENGINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_RENDER, s.DX_SIMPLE_PREFETCH_LISTENER_CRASH);
                aVar.e = com.taobao.android.dinamicx.exception.a.a(th);
                sVar.c.add(aVar);
                com.taobao.android.dinamicx.monitor.b.a(sVar);
            }
        }
    }
}
