package com.alibaba.android.ultron.vfw.weex2.highPerformance.management;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import tb.abm;
import tb.adh;
import tb.ifn;
import tb.iro;
import tb.jqg;
import tb.kge;
import tb.spk;

/* loaded from: classes2.dex */
public class d implements k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private abm f2776a;
    private ArrayList<com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request.a> b;

    static {
        kge.a(-2016553280);
        kge.a(718836347);
        kge.a(1900527407);
    }

    public void a(com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d51263", new Object[]{this, aVar});
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList<>();
        }
        this.b.add(aVar);
    }

    public d(abm abmVar) {
        this.f2776a = abmVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.management.k
    public void a(String str, String str2, JSONObject jSONObject) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
            return;
        }
        switch (str.hashCode()) {
            case -2096025532:
                if (str.equals(UltronTradeHybridStage.ON_MTOP_END)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -2015797284:
                if (str.equals(UltronTradeHybridStage.ON_CONTAINER_DESTROY)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1701402653:
                if (str.equals(UltronTradeHybridStage.ON_VIEW_SCROLL_END)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1012605245:
                if (str.equals(UltronTradeHybridStage.ON_NAV)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -961315111:
                if (str.equals(UltronTradeHybridStage.ON_RENDER_START)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -359179046:
                if (str.equals(UltronTradeHybridStage.ON_CONTAINER_CREATE)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 58688523:
                if (str.equals(UltronTradeHybridStage.ON_CONTAINER_RESUME)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 72234379:
                if (str.equals(UltronTradeHybridStage.ON_MTOP_START)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 263594596:
                if (str.equals(UltronTradeHybridStage.ON_EVENT_CHAIN_AFTER)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 776409915:
                if (str.equals(UltronTradeHybridStage.ON_VIEW_SCROLLING)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1093956882:
                if (str.equals(UltronTradeHybridStage.ON_RENDER_END)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1347699050:
                if (str.equals(UltronTradeHybridStage.ON_VIEW_SCROLL_START)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                a(str2, jSONObject, UltronTradeHybridStage.ON_NAV);
                return;
            case 1:
                a(str2, jSONObject, UltronTradeHybridStage.ON_MTOP_START);
                return;
            case 2:
                a(str2, jSONObject, UltronTradeHybridStage.ON_MTOP_END);
                return;
            case 3:
                a(str2, jSONObject, UltronTradeHybridStage.ON_RENDER_START);
                return;
            case 4:
                a(str2, jSONObject, UltronTradeHybridStage.ON_RENDER_END);
                return;
            case 5:
                a(str2, jSONObject, UltronTradeHybridStage.ON_EVENT_CHAIN_AFTER);
                return;
            case 6:
                a(str2, jSONObject, UltronTradeHybridStage.ON_CONTAINER_CREATE);
                return;
            case 7:
                a(str2, jSONObject, UltronTradeHybridStage.ON_CONTAINER_RESUME);
                return;
            case '\b':
                a(str2, jSONObject, UltronTradeHybridStage.ON_CONTAINER_DESTROY);
                return;
            case '\t':
                if (jSONObject == null || !(jSONObject.get("view") instanceof View)) {
                    jqg.a("UltronTradeHybridPreRequestManager", "ON_VIEW_SCROLL_START", "view is null");
                    return;
                } else {
                    a(str2, jSONObject, UltronTradeHybridStage.ON_VIEW_SCROLL_START);
                    return;
                }
            case '\n':
                if (jSONObject == null || !(jSONObject.get("view") instanceof View)) {
                    jqg.a("UltronTradeHybridPreRequestManager", "ON_VIEW_SCROLLING", "view is null");
                    return;
                } else {
                    a(str2, jSONObject, UltronTradeHybridStage.ON_VIEW_SCROLLING);
                    return;
                }
            case 11:
                if (jSONObject == null || !(jSONObject.get("view") instanceof View)) {
                    jqg.a("UltronTradeHybridPreRequestManager", "ON_VIEW_SCROLL_END", "view is null");
                    return;
                } else {
                    a(str2, jSONObject, UltronTradeHybridStage.ON_VIEW_SCROLL_END);
                    return;
                }
            default:
                jqg.a("UltronTradeHybridPreRequestManager", "onStage", "unknown stage");
                return;
        }
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : iro.a(str, str2);
    }

    private void a(String str, JSONObject jSONObject, String str2) {
        boolean booleanValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d490e348", new Object[]{this, str, jSONObject, str2});
            return;
        }
        abm abmVar = this.f2776a;
        if (abmVar == null) {
            UnifyLog.d("UltronTradeHybridPreRequestManager.sendPreRequestByScene", "mConfig is null");
            return;
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.model.e b = abmVar.b(str);
        if (b == null || b.c == null) {
            UnifyLog.d("UltronTradeHybridPreRequestManager.sendPreRequestByScene", "sceneModel or sceneModel.preRequestModels is null");
            return;
        }
        for (com.alibaba.android.ultron.vfw.weex2.highPerformance.model.d dVar : b.c) {
            if (dVar != null) {
                if (!a(str, dVar.f2791a)) {
                    jqg.b("UltronTradeHybridPreRequestManager.sendPreRequestByScene", String.format("%s switcher is off", str));
                } else if (!StringUtils.equals(dVar.d, str2)) {
                    UnifyLog.a("UltronTradeHybridPreRequestManager.sendPreRequestByScene", "no match stage");
                } else {
                    if (!StringUtils.isEmpty(dVar.e) && adh.a(dVar.e)) {
                        Object a2 = adh.a(dVar.e, jSONObject);
                        if (a2 instanceof String) {
                            booleanValue = Boolean.valueOf((String) a2).booleanValue();
                        } else {
                            booleanValue = a2 instanceof Boolean ? Boolean.valueOf(((Boolean) a2).booleanValue()).booleanValue() : false;
                        }
                        if (!booleanValue) {
                            UnifyLog.a("UltronTradeHybridPreRequestManager.sendPreRequestByScene", "no match enableCondition");
                        }
                    }
                    if (spk.a(iro.ORANGE_KEY_MY_TAOBAO, "enableRegisterPreRequestCallback", true) && this.b != null) {
                        ifn.a(dVar.b, jSONObject, new com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request.c(str, dVar, jSONObject, this.b));
                    } else {
                        ifn.a(dVar.b, jSONObject, new com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request.c(str, dVar, jSONObject));
                    }
                }
            }
        }
    }
}
