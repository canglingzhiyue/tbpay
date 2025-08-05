package com.taobao.android.dxv4common.model.node.event;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ac;
import com.taobao.android.dxv4common.logic.dex.DXNativeLogicLoadTask;
import com.taobao.android.dxv4common.logic.dex.bridge.DXNativeLogicEngine;
import java.util.HashMap;
import tb.fuw;
import tb.fux;
import tb.kge;

/* loaded from: classes5.dex */
public class DXNativeLogicEventProperty extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String className;
    public String methodName;

    static {
        kge.a(1372283801);
    }

    public static /* synthetic */ Object ipc$super(DXNativeLogicEventProperty dXNativeLogicEventProperty, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public int getEventArgsExprIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3d2b776", new Object[]{this})).intValue();
        }
        return -1;
    }

    public long getEventNameExprIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2c6b889", new Object[]{this})).longValue();
        }
        return -1L;
    }

    public DXNativeLogicEventProperty(String str, String str2) {
        this.className = str;
        this.methodName = str2;
        this.eventType = (byte) 4;
    }

    public String getMethodName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c689e537", new Object[]{this}) : this.methodName;
    }

    @Override // tb.gfn
    public boolean executeEvent(final DXEvent dXEvent, final DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2a1a4e3", new Object[]{this, dXEvent, dXRuntimeContext})).booleanValue();
        }
        final long nanoTime = System.nanoTime();
        final DXRuntimeContext findRootRuntimeContext = findRootRuntimeContext(dXRuntimeContext.d());
        if (findRootRuntimeContext == null || dXRuntimeContext.C() == null || dXRuntimeContext.C().b() == null || findRootRuntimeContext.d() == null) {
            fuw.d("DXNativeLogicBridge", "call logic 失败 rootRuntimeContext == null");
            return false;
        } else if (dXRuntimeContext.c() == null) {
            fuw.d("DXNativeLogicBridge", "call logic 失败 runtimeContext.getDxTemplateItem() == null");
            return false;
        } else {
            DXNativeLogicEngine j = findRootRuntimeContext.d().getDxv4Properties().j();
            if (j == null) {
                DXNativeLogicLoadTask.syncLoadData(findRootRuntimeContext.d(), new DXNativeLogicLoadTask.a() { // from class: com.taobao.android.dxv4common.model.node.event.DXNativeLogicEventProperty.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.dxv4common.logic.dex.DXNativeLogicLoadTask.a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put(DXNativeLogicEngine.TAG_DXRUNTINECONTEXT, dXRuntimeContext);
                        hashMap.put("dx_event", dXEvent);
                        DXNativeLogicEngine j2 = findRootRuntimeContext.d().getDxv4Properties().j();
                        if (j2 != null) {
                            j2.callNativeLogicFunc(dXRuntimeContext, dXEvent, DXNativeLogicEventProperty.this.methodName, hashMap);
                        } else {
                            fuw.d("DXNativeLogicBridge", " dxNativeLogicEngine  是 null ");
                        }
                        long nanoTime2 = System.nanoTime();
                        fuw.d("DXNativeLogicBridge", "syncLoadData流程 消耗时间为" + ((nanoTime2 - nanoTime) / 1000000.0d) + "ms");
                    }

                    @Override // com.taobao.android.dxv4common.logic.dex.DXNativeLogicLoadTask.a
                    public void a(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                            return;
                        }
                        fux.b(" 构建engine失败，无法执行事件" + str);
                        if (DinamicXEngine.j()) {
                            throw new RuntimeException(str);
                        }
                    }
                });
                return true;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(DXNativeLogicEngine.TAG_DXRUNTINECONTEXT, dXRuntimeContext);
            hashMap.put("dx_event", dXEvent);
            if (j != null) {
                j.callNativeLogicFunc(dXRuntimeContext, dXEvent, this.methodName, hashMap);
            } else {
                fuw.d("DXNativeLogicBridge", " dxNativeLogicEngine  是 null ");
            }
            long nanoTime2 = System.nanoTime();
            fuw.d("DXNativeLogicBridge", "消耗时间为" + ((nanoTime2 - nanoTime) / 1000000.0d) + "ms");
            return true;
        }
    }

    private DXRuntimeContext findRootRuntimeContext(DXWidgetNode dXWidgetNode) {
        DXWidgetNode queryRootWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("9b3c0e51", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode == null || (queryRootWidgetNode = dXWidgetNode.queryRootWidgetNode()) == null) {
            return null;
        }
        if ((queryRootWidgetNode.getParentWidget() instanceof ac) && ((ac) queryRootWidgetNode.getParentWidget()).e() == 1) {
            return findRootRuntimeContext(queryRootWidgetNode.getParentWidget());
        }
        return queryRootWidgetNode.getDXRuntimeContext();
    }
}
