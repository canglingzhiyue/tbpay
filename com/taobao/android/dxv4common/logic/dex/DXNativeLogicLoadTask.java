package com.taobao.android.dxv4common.logic.dex;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.auth.mobile.common.AlipayAuthConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.b;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dxv4common.logic.dex.DXModuleManager;
import com.taobao.android.dxv4common.logic.dex.bridge.DXNativeLogicEngine;
import com.taobao.android.dxv4common.logic.dex.bridge.DXNativeLogicLoader;
import com.taobao.tao.image.c;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import tb.fqi;
import tb.fux;
import tb.fwj;
import tb.fwn;
import tb.fxb;
import tb.fxe;
import tb.kge;

/* loaded from: classes5.dex */
public class DXNativeLogicLoadTask implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAIN_DX_LENGTH = 7;
    private static final String PREFIX_LOGIC_CONFIG = "/config.json";
    private static final String PREFIX_LOGIC_FILE = "logic";
    public a callback;
    public WeakReference<DXWidgetNode> weakNode;

    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void a(String str);
    }

    static {
        kge.a(1429954838);
        kge.a(-1390502639);
    }

    public static void asyncLoadData(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c51b20bc", new Object[]{dXWidgetNode});
        } else if (dXWidgetNode.getDxv4Properties().j() != null) {
        } else {
            fxe.e(new DXNativeLogicLoadTask(new WeakReference(dXWidgetNode)));
        }
    }

    public static void syncLoadData(DXWidgetNode dXWidgetNode, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ad131", new Object[]{dXWidgetNode, aVar});
        } else {
            new DXNativeLogicLoadTask(new WeakReference(dXWidgetNode), aVar).run();
        }
    }

    public DXNativeLogicLoadTask(WeakReference<DXWidgetNode> weakReference) {
        this.weakNode = weakReference;
    }

    public DXNativeLogicLoadTask(WeakReference<DXWidgetNode> weakReference, a aVar) {
        this.weakNode = weakReference;
        this.callback = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            final DXWidgetNode dXWidgetNode = this.weakNode.get();
            if (dXWidgetNode == null) {
                return;
            }
            final String A = dXWidgetNode.getDXRuntimeContext().A();
            final DXTemplateItem c = dXWidgetNode.getDXRuntimeContext().c();
            if (c == null || c.g == null) {
                return;
            }
            String substring = c.g.f11934a.substring(0, c.g.f11934a.length() - 7);
            if (TextUtils.isEmpty(substring)) {
                return;
            }
            final String str = substring + PREFIX_LOGIC_FILE;
            String str2 = str + PREFIX_LOGIC_CONFIG;
            File file = new File(str2);
            if (!TextUtils.isEmpty(str2) && file.exists()) {
                JSONObject b = fwn.a().b(str2, dXWidgetNode.getDXRuntimeContext());
                if (b == null) {
                    return;
                }
                final String string = b.getString("fileName");
                JSONObject jSONObject = b.getJSONObject("clsConfig");
                final String string2 = jSONObject.getString(AlipayAuthConstant.FULL_CLASS_NAME);
                final String string3 = jSONObject.getString("eventClassName");
                final String string4 = jSONObject.getString("runtimeClassName");
                final String string5 = jSONObject.getString("bridgeClassName");
                DXModuleManager.getInstance().load(b.getString(c.MODULES), new DXModuleManager.b() { // from class: com.taobao.android.dxv4common.logic.dex.DXNativeLogicLoadTask.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.dxv4common.logic.dex.DXModuleManager.b
                    public void a(List<DXNativeLogicLoader> list) {
                        DXTemplateItem dXTemplateItem;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c7052959", new Object[]{this, list});
                            return;
                        }
                        String str3 = "";
                        try {
                            str3 = str + fxb.DIR + string;
                            dXWidgetNode.getDxv4Properties().a(new DXNativeLogicEngine(str3, string2, string3, string4, string5, list));
                            if (DXNativeLogicLoadTask.this.callback == null) {
                                return;
                            }
                            DXNativeLogicLoadTask.this.callback.a();
                        } catch (Throwable th) {
                            try {
                                File file2 = new File(str3);
                                StringBuilder sb = new StringBuilder();
                                File file3 = new File(c.g.f11934a);
                                sb.append(str3);
                                sb.append(" 文件是否存在 ");
                                sb.append(file2.exists());
                                sb.append("; mainFile ");
                                sb.append(c.g.f11934a);
                                sb.append(file3.exists());
                                sb.append("; 模板是否存在 ");
                                sb.append(fwj.a().a(A, c));
                                sb.append(com.taobao.android.dinamicx.exception.a.a(th));
                                if (fqi.aQ() && !file2.exists()) {
                                    String[] split = str3.split("/");
                                    if (split.length > 10 && str3.contains("/subTemplates/")) {
                                        dXTemplateItem = new DXTemplateItem();
                                        dXTemplateItem.f11925a = split[8];
                                        dXTemplateItem.b = Long.parseLong(split[9]);
                                    } else {
                                        dXTemplateItem = c;
                                    }
                                    String str4 = str3 + " !dexFile.exists() 直接移除该模板   hostItem " + dXTemplateItem.b();
                                    fwj.a().c(A, dXTemplateItem);
                                    fux.b(str4);
                                    sb.append(" errorReason ");
                                    sb.append(str4);
                                }
                                s sVar = new s(A);
                                sVar.b = c;
                                s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_V4_LOGIC, DXMonitorConstant.DX_MONITOR_V4_LOGIC_ERROR, s.DX_V4_LOGIC_4100001);
                                aVar.e = sb.toString();
                                sVar.c.add(aVar);
                                b.a(sVar);
                                com.taobao.android.dinamicx.exception.a.b(th);
                            } catch (Exception e) {
                                fux.b(com.taobao.android.dinamicx.exception.a.a(e));
                                com.taobao.android.dinamicx.exception.a.d(e);
                            }
                        }
                    }

                    @Override // com.taobao.android.dxv4common.logic.dex.DXModuleManager.b
                    public void a(String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                            return;
                        }
                        String str4 = " load module失败  " + str3;
                        if (DXNativeLogicLoadTask.this.callback != null) {
                            DXNativeLogicLoadTask.this.callback.a(str4);
                        }
                        s sVar = new s(A);
                        sVar.b = c;
                        s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_V4_LOGIC, DXMonitorConstant.DX_MONITOR_V4_LOGIC_ERROR, s.DX_V4_LOGIC_4100004);
                        aVar.e = str4;
                        sVar.c.add(aVar);
                        b.a(sVar);
                        fux.b(str4);
                    }
                });
                return;
            }
            fux.b("DXNativeLogicLoadTask  : " + str2 + " 文件不存在，无需在load ");
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.d(th);
        }
    }
}
