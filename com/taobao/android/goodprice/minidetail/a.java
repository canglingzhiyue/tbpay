package com.taobao.android.goodprice.minidetail;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.android.weex_framework.f;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.q;
import com.taobao.weex.utils.WXViewUtils;
import tb.kge;
import tb.llu;

/* loaded from: classes5.dex */
public class a implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private p f12720a;
    private Context b;
    private b c;

    static {
        kge.a(1979139825);
        kge.a(-311268728);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onForeground(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onPrepareSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
        }
    }

    public a(b bVar) {
        this.c = bVar;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        mUSInstanceConfig.d(true);
        if (Build.VERSION.SDK_INT >= 29) {
            mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.image);
        } else {
            mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.texture);
        }
        mUSInstanceConfig.a(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
        mUSInstanceConfig.f(false);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizName", (Object) llu.a("https://web.m.taobao.com/app/ltao-fe/super-detail/index?wh_weex=true&weex_mode=dom"));
        jSONObject.put("bundleUrl", (Object) "https://web.m.taobao.com/app/ltao-fe/super-detail/index?wh_weex=true&weex_mode=dom");
        jSONObject.put("wlmUrl", (Object) "https://web.m.taobao.com/app/ltao-fe/super-detail/index?wh_weex=true&weex_mode=dom");
        q.a().a(context, mUSInstanceConfig, jSONObject, WXViewUtils.getScreenWidth(context), WXViewUtils.getFullScreenHeight(context));
    }

    private MUSDKInstance a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSDKInstance) ipChange.ipc$dispatch("4c36657c", new Object[]{this, str, context});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        return q.a().a(llu.a("https://web.m.taobao.com/app/ltao-fe/super-detail/index?wh_weex=true&weex_mode=dom"), jSONObject);
    }

    private void b(Context context, String str, final f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34bb1e6e", new Object[]{this, context, str, fVar});
            return;
        }
        this.f12720a = a(str, context);
        p pVar = this.f12720a;
        if (pVar != null) {
            if (fVar != null) {
                fVar.onCreateView(pVar.getRenderRoot());
            }
            a(str);
            return;
        }
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        mUSInstanceConfig.d(true);
        mUSInstanceConfig.a(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
        mUSInstanceConfig.f(false);
        if (Build.VERSION.SDK_INT >= 29) {
            mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.image);
        } else {
            mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.texture);
        }
        mUSInstanceConfig.a(new f() { // from class: com.taobao.android.goodprice.minidetail.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.f
            public void onCreateView(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1414cfeb", new Object[]{this, view});
                    return;
                }
                f fVar2 = fVar;
                if (fVar2 == null) {
                    return;
                }
                fVar2.onCreateView(view);
            }
        });
        this.f12720a = q.a().a(context, mUSInstanceConfig);
        this.f12720a.registerRenderListener(this);
        this.f12720a.initWithURL(Uri.parse(str));
        this.f12720a.render(null, null);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        this.f12720a.dispatchEvent(MUSEventTarget.MUS_WINDOW_TARGET, "refreshParams", jSONObject);
    }

    public void a(Context context, String str, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cceb0ed", new Object[]{this, context, str, fVar});
            return;
        }
        this.b = context;
        b(context, str, fVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        p pVar = this.f12720a;
        if (pVar != null) {
            pVar.destroy();
            this.f12720a = null;
        }
        Context context = this.b;
        if (context == null) {
            return;
        }
        a(context);
        this.b = null;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        p pVar = this.f12720a;
        if (pVar == null) {
            return;
        }
        pVar.onActivityResume();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        p pVar = this.f12720a;
        if (pVar == null) {
            return;
        }
        pVar.onActivityPause();
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        b bVar = this.c;
        if (bVar == null) {
            return;
        }
        bVar.a(i, str, z);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onJSException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
        } else {
            AppMonitor.Counter.commit("GoodPriceWeexInstance", "monitorPointJSException", str, 1.0d);
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onFatalException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
            return;
        }
        b bVar = this.c;
        if (bVar == null) {
            return;
        }
        bVar.a(i, str, true);
    }
}
