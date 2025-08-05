package com.taobao.search.sf;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.ugc.h5.WVMicorPublishPlugin;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.xsearchplugin.muise.s;
import com.taobao.search.musie.MUSXSearchEventModule;
import tb.isr;
import tb.iuc;
import tb.kge;
import tb.nxz;

/* loaded from: classes8.dex */
public class p implements com.taobao.android.weex_framework.g, com.taobao.android.xsearchplugin.weex.weex.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private BaseResultActivity f19472a;
    private com.taobao.android.weex_framework.p b;
    private ViewGroup c;
    private boolean d = false;

    static {
        kge.a(1995379110);
        kge.a(502437767);
        kge.a(-311268728);
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.h
    public boolean b(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1409239", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onFatalException(com.taobao.android.weex_framework.p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onForeground(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onJSException(com.taobao.android.weex_framework.p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onPrepareSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshFailed(com.taobao.android.weex_framework.p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
        }
    }

    public static /* synthetic */ com.taobao.android.weex_framework.p a(p pVar, com.taobao.android.weex_framework.p pVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.p) ipChange.ipc$dispatch("d8d17afb", new Object[]{pVar, pVar2});
        }
        pVar.b = pVar2;
        return pVar2;
    }

    public static /* synthetic */ BaseResultActivity a(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseResultActivity) ipChange.ipc$dispatch("e70021db", new Object[]{pVar}) : pVar.f19472a;
    }

    public static /* synthetic */ boolean b(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("be419f4", new Object[]{pVar})).booleanValue() : pVar.d;
    }

    public static /* synthetic */ com.taobao.android.weex_framework.p c(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.p) ipChange.ipc$dispatch("55e76e", new Object[]{pVar}) : pVar.b;
    }

    public static /* synthetic */ ViewGroup d(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("7a2c06e3", new Object[]{pVar}) : pVar.c;
    }

    public p(ViewGroup viewGroup, BaseResultActivity baseResultActivity) {
        this.f19472a = baseResultActivity;
        this.c = viewGroup;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.c == null) {
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.search.sf.p.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    final JSONObject navigationInfo = MUSXSearchEventModule.getNavigationInfo(p.a(p.this));
                    if (navigationInfo == null) {
                        return;
                    }
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.search.sf.p.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            JSONObject jSONObject;
                            JSONObject jSONObject2;
                            JSONObject jSONObject3;
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (p.b(p.this) || (jSONObject = navigationInfo.getJSONObject("params")) == null || (jSONObject2 = jSONObject.getJSONObject("topHeader")) == null || (jSONObject3 = jSONObject2.getJSONObject("template")) == null) {
                            } else {
                                p.a(p.this, s.a(p.a(p.this), p.this, null));
                                p.c(p.this).registerRenderListener(p.this);
                                String string = jSONObject3.getString(WVMicorPublishPlugin.TEMPLATE_URL);
                                p.d(p.this).getLayoutParams().height = iuc.b(jSONObject3.getString("listHeight"));
                                JSONObject jSONObject4 = jSONObject2.getJSONObject("info");
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put("model", (Object) jSONObject4);
                                nxz.a(p.c(p.this), string, string, jSONObject5, null);
                                p.d(p.this).addView(p.c(p.this).getRenderRoot(), new ViewGroup.LayoutParams(-1, -2));
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.h
    public boolean a(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d34d2c5a", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        this.f19472a.onEventMainThread(isr.c.a(str, jSONObject, aVar, aVar2));
        return true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.d = true;
        com.taobao.android.weex_framework.p pVar = this.b;
        if (pVar == null) {
            return;
        }
        pVar.destroy();
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            return;
        }
        this.c.getLayoutParams().height = -2;
        this.c.requestLayout();
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderFailed(com.taobao.android.weex_framework.p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        this.c.getLayoutParams().height = 0;
        this.c.setVisibility(4);
    }
}
