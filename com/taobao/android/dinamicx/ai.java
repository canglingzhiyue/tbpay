package com.taobao.android.dinamicx;

import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.model.DXJSONObjectForVM;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import tb.fqi;
import tb.fuo;
import tb.fuw;
import tb.fux;
import tb.fva;
import tb.fvd;
import tb.fxe;
import tb.kge;

/* loaded from: classes5.dex */
public class ai {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ThreadLocal<Boolean> needNotifyMap;

    public static /* synthetic */ void a(ai aiVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e4286d", new Object[]{aiVar, dXRuntimeContext});
        } else {
            aiVar.b(dXRuntimeContext);
        }
    }

    public static /* synthetic */ boolean a(ai aiVar, aw awVar, DXTemplateItem dXTemplateItem, DXRuntimeContext dXRuntimeContext, com.taobao.android.dinamicx.widget.ac acVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("43096f9c", new Object[]{aiVar, awVar, dXTemplateItem, dXRuntimeContext, acVar, new Integer(i)})).booleanValue() : aiVar.b(awVar, dXTemplateItem, dXRuntimeContext, acVar, i);
    }

    static {
        kge.a(445620100);
        needNotifyMap = new ThreadLocal<Boolean>() { // from class: com.taobao.android.dinamicx.ai.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
            @Override // java.lang.ThreadLocal
            public /* synthetic */ Boolean initialValue() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2908671e", new Object[]{this}) : a();
            }

            public Boolean a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Boolean) ipChange.ipc$dispatch("5b7a33e5", new Object[]{this});
                }
                return false;
            }
        };
    }

    public boolean a(final DXTemplateItem dXTemplateItem, final DXRuntimeContext dXRuntimeContext, final com.taobao.android.dinamicx.widget.ac acVar, final aw awVar, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("565a823c", new Object[]{this, dXTemplateItem, dXRuntimeContext, acVar, awVar, new Integer(i)})).booleanValue();
        }
        boolean a2 = a();
        if (dXTemplateItem == null) {
            return false;
        }
        if (a2) {
            fxe.e(new Runnable() { // from class: com.taobao.android.dinamicx.ai.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (DinamicXEngine.j()) {
                        fuw.a("DXRemoteChildLoadTask", "开始在子线程处理的remote模版" + dXTemplateItem.b() + " threadId " + Thread.currentThread().getName());
                    }
                    ai.this.a(awVar, dXTemplateItem, dXRuntimeContext, acVar, i);
                    fuw.a("DXRemoteChildLoadTask", "处理完所有的remote模版，准备回调");
                    if (!ai.needNotifyMap.get().booleanValue()) {
                        fuw.a("不需要通知外层进行刷新");
                        return;
                    }
                    fuw.a("通知外层进行刷新");
                    ai.needNotifyMap.set(false);
                    ai.a(ai.this, dXRuntimeContext);
                }
            });
        } else {
            if (DinamicXEngine.j()) {
                fuw.a("DXRemoteChildLoadTask", "开始在当前线程处理的remote模版" + dXTemplateItem.b());
            }
            a(awVar, dXTemplateItem, dXRuntimeContext, acVar, i);
        }
        return true;
    }

    public boolean a(DXTemplateItem dXTemplateItem, DXRuntimeContext dXRuntimeContext, com.taobao.android.dinamicx.widget.ac acVar, aw awVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d13cb62f", new Object[]{this, dXTemplateItem, dXRuntimeContext, acVar, awVar})).booleanValue();
        }
        if (awVar != null && dXTemplateItem != null) {
            ArrayList arrayList = new ArrayList();
            dXTemplateItem.c(1);
            arrayList.add(dXTemplateItem);
            if (DinamicXEngine.j()) {
                fuw.a("DXRemoteChildTemplateManager 准备下载模版 " + dXTemplateItem.b());
            }
            if (dXRuntimeContext != null) {
                awVar.a(arrayList, dXRuntimeContext.A());
            } else {
                awVar.a(arrayList, "DinamicX");
            }
        }
        return false;
    }

    public DXWidgetNode a(final aw awVar, DXTemplateItem dXTemplateItem, final DXRuntimeContext dXRuntimeContext, final com.taobao.android.dinamicx.widget.ac acVar, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("f144c123", new Object[]{this, awVar, dXTemplateItem, dXRuntimeContext, acVar, new Integer(i)});
        }
        DXTemplateItem b = awVar.b(dXTemplateItem);
        if (b != null && b.b().equals(dXTemplateItem.b())) {
            b(awVar, b, dXRuntimeContext, acVar, i);
            if (DinamicXEngine.j()) {
                fuw.a("DXRemoteChildTemplateManager", "模版" + b.b() + "已经存在，直接构建构建完成");
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(dXTemplateItem);
        if (DinamicXEngine.j()) {
            fuw.a("DXRemoteChildTemplateManager", "模版" + dXTemplateItem.b() + "不存在，开始下载");
        }
        awVar.a(arrayList, dXRuntimeContext == null ? "DinamicX" : dXRuntimeContext.A(), new bk() { // from class: com.taobao.android.dinamicx.ai.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx.bk
            public void a(DXTemplateItem dXTemplateItem2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a042611", new Object[]{this, dXTemplateItem2});
                    return;
                }
                DXTemplateItem b2 = awVar.b(dXTemplateItem2);
                if (DinamicXEngine.j()) {
                    fuw.a("DXRemoteChildTemplateManager", "模版" + b2.b() + "下载完成，开始构建  thread " + Thread.currentThread().getName());
                }
                if (!b2.b().equals(dXTemplateItem2.b())) {
                    return;
                }
                ai.needNotifyMap.set(true);
                ai.a(ai.this, awVar, b2, dXRuntimeContext, acVar, i);
            }
        }, false);
        return null;
    }

    public DXWidgetNode a(DXTemplateItem dXTemplateItem, DXRuntimeContext dXRuntimeContext, aw awVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("f4a6049a", new Object[]{this, dXTemplateItem, dXRuntimeContext, awVar, new Integer(i)});
        }
        if (awVar == null || dXTemplateItem == null || dXRuntimeContext == null) {
            return null;
        }
        DXRuntimeContext a2 = dXRuntimeContext.a((DXWidgetNode) null);
        if (dXRuntimeContext.f() instanceof JSONObject) {
            a2.a((JSONObject) dXRuntimeContext.f());
        } else if (dXRuntimeContext.O() && (dXRuntimeContext.f() instanceof Object)) {
            DXJSONObjectForVM dXJSONObjectForVM = new DXJSONObjectForVM();
            dXJSONObjectForVM.setData(dXRuntimeContext.f());
            a2.a((JSONObject) dXJSONObjectForVM);
        }
        a2.a(dXTemplateItem);
        DXWidgetNode a3 = awVar.a(a2);
        if (a3 == null) {
            fux.b("DXRemoteChildTemplateManager createExpandWtSync manager.getTemplateWT(cloneRtx) == null");
            return null;
        }
        if (a3.getDXRuntimeContext() != null && a3.getDXRuntimeContext().o()) {
            a2.t.c.addAll(a3.getDXRuntimeContext().t.c);
        }
        DXWidgetNode deepClone = a3.deepClone(a2);
        if (i == 1) {
            a(deepClone);
        }
        return deepClone;
    }

    private void a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613bf3c7", new Object[]{this, dXWidgetNode});
            return;
        }
        if (dXWidgetNode != null) {
            dXWidgetNode.setSourceWidget(dXWidgetNode);
        }
        if (!(dXWidgetNode instanceof com.taobao.android.dinamicx.widget.m) || dXWidgetNode.getChildrenCount() <= 0) {
            return;
        }
        if (fqi.p()) {
            if (dXWidgetNode.isV4Node()) {
                if (dXWidgetNode.getDxv4Properties().c() != null && dXWidgetNode.getDxv4Properties().c().indexOfKey(fuo.DX_PARSER_LISTDATA) >= 0) {
                    return;
                }
            } else if (dXWidgetNode.getDataParsersExprNode() != null && dXWidgetNode.getDataParsersExprNode().indexOfKey(fuo.DX_PARSER_LISTDATA) >= 0) {
                return;
            }
        }
        for (DXWidgetNode dXWidgetNode2 : ((com.taobao.android.dinamicx.widget.m) dXWidgetNode).getChildren()) {
            a(dXWidgetNode2);
        }
    }

    private synchronized boolean b(aw awVar, DXTemplateItem dXTemplateItem, DXRuntimeContext dXRuntimeContext, com.taobao.android.dinamicx.widget.ac acVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f75d9509", new Object[]{this, awVar, dXTemplateItem, dXRuntimeContext, acVar, new Integer(i)})).booleanValue();
        }
        DXWidgetNode a2 = a(dXTemplateItem, dXRuntimeContext, awVar, i);
        if (a2 != null && acVar != null) {
            acVar.addChild(a2, false);
            a2.getDXRuntimeContext().e();
            new bc().a(a2, (DXRenderOptions) null);
            return true;
        }
        fux.b("createAndBindTree 失败");
        return false;
    }

    public DXTemplateItem a(aw awVar, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("aec61ac8", new Object[]{this, awVar, dXTemplateItem});
        }
        if (dXTemplateItem != null) {
            return awVar.b(dXTemplateItem);
        }
        return null;
    }

    public boolean a(DXTemplateItem dXTemplateItem, DXTemplateItem dXTemplateItem2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0ac6dfe", new Object[]{this, dXTemplateItem, dXTemplateItem2})).booleanValue() : dXTemplateItem != null && dXTemplateItem2 != null && dXTemplateItem.b == dXTemplateItem2.b && dXTemplateItem.f11925a.equals(dXTemplateItem2.f11925a);
    }

    public aw a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aw) ipChange.ipc$dispatch("aca5b263", new Object[]{this, dXRuntimeContext});
        }
        if (dXRuntimeContext != null && dXRuntimeContext.C() != null && dXRuntimeContext.C().b() != null) {
            return dXRuntimeContext.C().b().w();
        }
        return null;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    private void b(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c07f39a", new Object[]{this, dXRuntimeContext});
            return;
        }
        fva fvaVar = dXRuntimeContext.C().b().g;
        if (fvaVar == null || dXRuntimeContext == null) {
            return;
        }
        fvd fvdVar = new fvd();
        fvdVar.f28145a = dXRuntimeContext.c();
        fvdVar.d = dXRuntimeContext.a();
        fvdVar.b = dXRuntimeContext.e();
        fvdVar.c = 1004;
        fvaVar.a(fvdVar);
    }
}
