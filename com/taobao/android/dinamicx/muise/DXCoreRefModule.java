package com.taobao.android.dinamicx.muise;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ag;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import tb.fuw;

/* loaded from: classes5.dex */
public class DXCoreRefModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Handler mHandler;

    public static /* synthetic */ Object ipc$super(DXCoreRefModule dXCoreRefModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ DXWidgetNode access$000(DXCoreRefModule dXCoreRefModule, DXWidgetNode dXWidgetNode, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("a8311d4b", new Object[]{dXCoreRefModule, dXWidgetNode, str}) : dXCoreRefModule.getWidgetNodeByRef(dXWidgetNode, str);
    }

    public DXCoreRefModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    @MUSMethod(uiThread = false)
    public JSONObject callRef(final String str, final String str2, final JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a0562eb8", new Object[]{this, str, str2, jSONArray});
        }
        FutureTask futureTask = new FutureTask(new Callable<JSONObject>() { // from class: com.taobao.android.dinamicx.muise.DXCoreRefModule.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.alibaba.fastjson.JSONObject] */
            @Override // java.util.concurrent.Callable
            public /* synthetic */ JSONObject call() throws Exception {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6d249ded", new Object[]{this}) : a();
            }

            public JSONObject a() throws Exception {
                DXWidgetNode d;
                DXWidgetNode queryRootWidgetNode;
                DXWidgetNode access$000;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (JSONObject) ipChange2.ipc$dispatch("709f7788", new Object[]{this});
                }
                Object executeContext = DXCoreRefModule.this.getInstance().getExecuteContext();
                if (!(executeContext instanceof DXRuntimeContext) || StringUtils.isEmpty(str) || (d = ((DXRuntimeContext) executeContext).d()) == null || (queryRootWidgetNode = d.queryRootWidgetNode()) == null || (access$000 = DXCoreRefModule.access$000(DXCoreRefModule.this, queryRootWidgetNode, str)) == null) {
                    return null;
                }
                if ("render".equals(str2)) {
                    JSONArray jSONArray2 = jSONArray;
                    if (jSONArray2 != null && jSONArray2.size() > 0) {
                        Object obj = jSONArray.get(0);
                        if (obj instanceof JSONObject) {
                            b.a((JSONObject) obj, access$000, true);
                        }
                    }
                } else if ("refresh".equals(str2)) {
                    JSONArray jSONArray3 = jSONArray;
                    if (jSONArray3 != null && jSONArray3.size() > 0) {
                        Object obj2 = jSONArray.get(0);
                        if (obj2 instanceof JSONObject) {
                            b.b((JSONObject) obj2, access$000, true);
                        }
                    }
                } else {
                    return access$000.invokeRefMethod(str2, jSONArray);
                }
                return null;
            }
        });
        this.mHandler.post(futureTask);
        try {
            return (JSONObject) futureTask.get(1000L, TimeUnit.MILLISECONDS);
        } catch (Throwable unused) {
            fuw.b("nativeApi err: timeout");
            return null;
        }
    }

    private DXWidgetNode getWidgetNodeByRef(DXWidgetNode dXWidgetNode, String str) {
        List<DXWidgetNode> children;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("b19832b1", new Object[]{this, dXWidgetNode, str});
        }
        if (dXWidgetNode == null) {
            return null;
        }
        if (str.equals(dXWidgetNode.getRef())) {
            return dXWidgetNode;
        }
        if (dXWidgetNode instanceof ag) {
            children = ((ag) dXWidgetNode).d();
        } else {
            children = dXWidgetNode.getChildren();
        }
        if (children == null) {
            return null;
        }
        for (DXWidgetNode dXWidgetNode2 : children) {
            DXWidgetNode widgetNodeByRef = getWidgetNodeByRef(dXWidgetNode2, str);
            if (widgetNodeByRef != null) {
                return widgetNodeByRef;
            }
        }
        return null;
    }
}
