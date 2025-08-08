package tb;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.f;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.q;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.c;
import com.taobao.homepage.pop.utils.d;
import com.taobao.homepage.pop.utils.g;
import com.taobao.infoflow.taobao.subservice.biz.pop.jsbridge.PopMessageModule;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.lang.ref.WeakReference;
import java.util.List;
import tb.laj;

/* loaded from: classes7.dex */
public class lrb implements laj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUSINESS_ID_KEY = "mus_key_business_id";
    public static final String HOME_POP_ENGINE_KEY = "mus_weak_ref_key_home_pop_engine";

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f30848a;
    private p b;

    @Override // tb.laj
    public void a(ViewGroup viewGroup, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80095b98", new Object[]{this, viewGroup, view, new Integer(i)});
        }
    }

    @Override // tb.laj
    public void a(kyu kyuVar, List<IPopData> list, laj.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33efc740", new Object[]{this, kyuVar, list, aVar});
        }
    }

    @Override // tb.laj
    public boolean a(View view, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("464c251a", new Object[]{this, view, iPopData})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(761579547);
        kge.a(307056569);
        MUSEngine.registerModule(PopMessageModule.NAME, PopMessageModule.class);
    }

    @Override // tb.laj
    public View a(ViewGroup viewGroup, IPopData iPopData, kyu kyuVar) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7ad83704", new Object[]{this, viewGroup, iPopData, kyuVar});
        }
        if (viewGroup == null || iPopData == null || !iPopData.valid() || !iPopData.isAllowShow() || (context = viewGroup.getContext()) == null) {
            return null;
        }
        String weexUrl = iPopData.getPopConfig().getWeexUrl();
        c.a("WeexPopViewProvider ", "create weex pop, url=" + weexUrl);
        if (StringUtils.isEmpty(weexUrl)) {
            return null;
        }
        if (this.b != null) {
            c.a("WeexPopViewProvider ", "destroy old weex instance, hashCode=" + this.b.hashCode());
            this.b.destroy();
            this.b = null;
        }
        this.f30848a = new FrameLayout(context);
        this.f30848a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (c.a()) {
            this.f30848a.setBackgroundColor(Color.parseColor("#33ff00ff"));
        }
        this.b = b(this.f30848a, iPopData, kyuVar);
        if (this.b == null) {
            return null;
        }
        c.a("WeexPopViewProvider ", "create new weex instance, hashCode=" + this.b.hashCode() + ", data=" + iPopData.hashCode());
        this.b.initWithURL(Uri.parse(weexUrl));
        JSONObject ext = iPopData.getExt();
        this.b.render(ext == null ? null : ext.getJSONObject("renderPassParams"), null);
        iPopData.recordShow();
        return this.f30848a;
    }

    @Override // tb.laj
    public View a(View view, int i, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9a451789", new Object[]{this, view, new Integer(i), iPopData});
        }
        if (this.b != null && g.a(i)) {
            this.b.destroy();
            this.b = null;
            this.f30848a = null;
        }
        return view;
    }

    @Override // tb.laj
    public View a(View view, String str, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e50be94e", new Object[]{this, view, str, iPopData});
        }
        if (this.b != null && "removePop".equals(str)) {
            this.b.destroy();
            this.b = null;
            this.f30848a = null;
        }
        return view;
    }

    private p b(final ViewGroup viewGroup, final IPopData iPopData, kyu kyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("3c72b75e", new Object[]{this, viewGroup, iPopData, kyuVar});
        }
        try {
            MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
            mUSInstanceConfig.d(true);
            mUSInstanceConfig.a(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
            mUSInstanceConfig.f(false);
            mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.texture);
            mUSInstanceConfig.a(new f() { // from class: tb.lrb.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.f
                public void onCreateView(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1414cfeb", new Object[]{this, view});
                        return;
                    }
                    viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
                    com.taobao.homepage.pop.utils.f.a(iPopData.mo1070fetchPopSection(), (JSONObject) null);
                    d.a("PopViewFirstVisible", iPopData);
                    c.a("WeexPopViewProvider ", "weex onCreateView callback");
                }
            });
            p a2 = q.a().a(viewGroup.getContext(), mUSInstanceConfig);
            if (!iPopData.getPopConfig().isInterceptClick()) {
                a2.setGestureConsumptionView(viewGroup);
            }
            a2.registerRenderListener(a(viewGroup, a2, iPopData));
            a2.setTag(HOME_POP_ENGINE_KEY, new WeakReference(kyuVar));
            a2.setTag(BUSINESS_ID_KEY, iPopData.getBusinessID());
            return a2;
        } catch (Throwable th) {
            c.a("create weex instance error", th);
            return null;
        }
    }

    private com.taobao.android.weex_framework.g a(final ViewGroup viewGroup, final p pVar, final IPopData iPopData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.g) ipChange.ipc$dispatch("1fb7c520", new Object[]{this, viewGroup, pVar, iPopData}) : new com.taobao.android.weex_framework.g() { // from class: tb.lrb.2
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private boolean e = false;

            @Override // com.taobao.android.weex_framework.g
            public void onForeground(p pVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6fafc624", new Object[]{this, pVar2});
                } else {
                    c.a("WeexPopViewProvider ", "weex callback onForeground");
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onPrepareSuccess(p pVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9635d60b", new Object[]{this, pVar2});
                } else {
                    c.a("WeexPopViewProvider ", "weex callback onPrepareSuccess");
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRenderSuccess(p pVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3fdf238", new Object[]{this, pVar2});
                } else {
                    c.a("WeexPopViewProvider ", "weex callback onRenderSuccess");
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRenderFailed(p pVar2, int i, String str, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4253181b", new Object[]{this, pVar2, new Integer(i), str, new Boolean(z)});
                    return;
                }
                a(String.valueOf(i), str);
                viewGroup.removeView(pVar2.getRenderRoot());
                pVar.destroy();
                c.a("WeexPopViewProvider ", "weex callback onRenderFailed");
                TBToast.makeText(viewGroup.getContext(), "加载失败，请稍后再试").show();
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRefreshSuccess(p pVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7cd7e3df", new Object[]{this, pVar2});
                } else {
                    c.a("WeexPopViewProvider ", "weex callback onRefreshSuccess");
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRefreshFailed(p pVar2, int i, String str, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f63c5f14", new Object[]{this, pVar2, new Integer(i), str, new Boolean(z)});
                } else {
                    c.a("WeexPopViewProvider ", "weex callback onRefreshFailed");
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onJSException(p pVar2, int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("831fc52e", new Object[]{this, pVar2, new Integer(i), str});
                } else {
                    c.a("WeexPopViewProvider ", "weex callback onJSException");
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onFatalException(p pVar2, int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bcd71451", new Object[]{this, pVar2, new Integer(i), str});
                    return;
                }
                a(String.valueOf(i), str);
                c.a("WeexPopViewProvider ", "weex callback onFatalException");
                viewGroup.removeView(pVar2.getRenderRoot());
                pVar.destroy();
            }

            @Override // com.taobao.android.weex_framework.g
            public void onDestroyed(MUSDKInstance mUSDKInstance) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
                    return;
                }
                c.a("WeexPopViewProvider ", "weex callback onDestroyed");
                viewGroup.removeView(mUSDKInstance.getRenderRoot());
            }

            private void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                } else if (this.e) {
                } else {
                    d.a("PopViewFirstVisible", iPopData, str, str2);
                    this.e = true;
                }
            }
        };
    }

    @Override // tb.laj
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        p pVar = this.b;
        if (pVar == null || pVar.isDestroyed()) {
            return;
        }
        this.b.onActivityPause();
    }

    @Override // tb.laj
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        p pVar = this.b;
        if (pVar == null || pVar.isDestroyed()) {
            return;
        }
        this.b.onActivityResume();
    }
}
