package com.taobao.android.tbabilitykit.dx.webview;

import mtopsdk.common.util.StringUtils;
import android.webkit.ValueCallback;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ah;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.text.n;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dla;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.kge;

/* loaded from: classes6.dex */
public final class a extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final C0590a Companion;
    public static final String DXWEBVIEWABILITY = "-3676317293436189901";

    static {
        kge.a(1939430390);
        Companion = new C0590a(null);
    }

    /* renamed from: com.taobao.android.tbabilitykit.dx.webview.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0590a {
        static {
            kge.a(1698122686);
        }

        private C0590a() {
        }

        public /* synthetic */ C0590a(o oVar) {
            this();
        }
    }

    @Override // tb.dlg
    public dkx<?> a(final dlh dlhVar, final l lVar, final dll dllVar) {
        DXWidgetNode dXWidgetNode;
        DXWidgetNode j;
        DXWidgetNode I;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        if (dlhVar != null) {
            String c = dlhVar.c("targetNodeId");
            final String c2 = dlhVar.c("action");
            if (StringUtils.isEmpty(c) || StringUtils.isEmpty(c2)) {
                return new dkw(new dkv(-1999, "TsWebViewAbilityAbility empty userId or type or akCtx"), false);
            }
            if (lVar == null || (j = lVar.j()) == null) {
                dXWidgetNode = null;
            } else if (n.a(c, j.getUserId(), false, 2, (Object) null)) {
                dXWidgetNode = j;
            } else {
                DXWidgetNode queryWidgetNodeByUserId = j.queryWidgetNodeByUserId(c);
                if (queryWidgetNodeByUserId == null) {
                    DXRuntimeContext dXRuntimeContext = j.getDXRuntimeContext();
                    if (dXRuntimeContext == null || (I = dXRuntimeContext.I()) == null) {
                        queryWidgetNodeByUserId = null;
                    } else {
                        dXWidgetNode = I.queryWidgetNodeByUserId(c);
                    }
                }
                dXWidgetNode = queryWidgetNodeByUserId;
            }
            if (!(dXWidgetNode instanceof ah)) {
                dXWidgetNode = null;
            }
            ah ahVar = (ah) dXWidgetNode;
            if (ahVar != null) {
                if (n.a(c2, "reload", false, 2, (Object) null)) {
                    ahVar.a();
                } else if (n.a(c2, "loadUrl", false, 2, (Object) null)) {
                    ahVar.a(dlhVar.c("url"));
                } else if (n.a(c2, "destroy", false, 2, (Object) null)) {
                    ahVar.b();
                } else if (n.a(c2, "callJS", false, 2, (Object) null)) {
                    String c3 = dlhVar.c("functionName");
                    if (c3 == null) {
                        return new dkw(new dkv(-1999, "TsWebViewAbilityAbility callJS no functionName"), false);
                    }
                    ahVar.a(c3, new ValueCallback<String>() { // from class: com.taobao.android.tbabilitykit.dx.webview.DXWebViewAbilityAbility$onExecuteWithData$$inlined$let$lambda$1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.webkit.ValueCallback
                        public final void onReceiveValue(String str) {
                            IpChange ipChange2 = $ipChange;
                            boolean z = true;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                                return;
                            }
                            String str2 = str;
                            if (str2 != null && str2.length() != 0) {
                                z = false;
                            }
                            if (z) {
                                dll dllVar2 = dllVar;
                                if (dllVar2 == null) {
                                    return;
                                }
                                dllVar2.callback("onFail", new dla());
                                return;
                            }
                            dll dllVar3 = dllVar;
                            if (dllVar3 == null) {
                                return;
                            }
                            dllVar3.callback("onSucceed", new dla(new JSONObject(ai.a(j.a("result", str)))));
                        }
                    });
                }
            }
        }
        return new dla();
    }
}
