package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.uikit.DebugFrameLayout;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import com.taobao.android.xsearchplugin.debugger.protocal.b;
import com.taobao.android.xsearchplugin.weex.weex.a;
import com.taobao.android.xsearchplugin.weex.weex.d;
import com.taobao.android.xsearchplugin.weex.weex.e;
import com.taobao.android.xsearchplugin.weex.weex.h;
import com.taobao.android.xsearchplugin.weex.weex.i;
import com.taobao.taolive.room.utils.aw;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXErrorCode;
import java.util.HashMap;
import java.util.Map;
import tb.isr;

/* loaded from: classes6.dex */
public class jzf extends ito implements a.InterfaceC0626a, d.a, h, itm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f29878a;
    private final TemplateBean b;
    private WeexBean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private JSONObject g;
    private jze h;
    private int i;

    static {
        kge.a(-1870793351);
        kge.a(367364596);
        kge.a(1995568207);
        kge.a(-1977052299);
        kge.a(248725262);
        kge.a(502437767);
        kge.a(1735786321);
    }

    public static /* synthetic */ Object ipc$super(jzf jzfVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1743784140:
                return super.dumpDebugInfo();
            case 217607196:
                super.onCtxResume();
                return null;
            case 299066517:
                super.onCtxPause();
                return null;
            case 593843865:
                super.onCtxDestroy();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        }
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "WeexModWidget";
    }

    @Override // tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((WeexBean) obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.FrameLayout, android.view.View] */
    @Override // tb.ius
    public /* synthetic */ FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : r();
    }

    public jzf(Activity activity, ium iumVar, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar, TemplateBean templateBean, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, iruVar, viewGroup, iurVar);
        this.i = -1;
        this.b = templateBean;
        ensureView();
    }

    public void a(WeexBean weexBean) {
        boolean b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce43e7b", new Object[]{this, weexBean});
        } else if (weexBean == null) {
            c().b().b("WeexModWidget", "bean is null");
        } else {
            boolean z = this.c != null && !TextUtils.equals(weexBean.type, this.c.type);
            this.c = weexBean;
            a aVar = this.f29878a;
            if (aVar != null && z) {
                aVar.f();
            }
            this.d = false;
            this.e = false;
            Map<String, Object> b2 = b(weexBean);
            if (c().a().c()) {
                this.g = c().e().b(b2);
            }
            if (this.f29878a == null) {
                c().b().c("WeexModWidget", "render weex cell: %s", weexBean);
                this.f29878a = p();
                this.f29878a.a(this.i);
                this.f29878a.a(this);
                b = this.f29878a.a(weexBean, b2);
            } else {
                c().b().c("WeexModWidget", "refresh weex cell: %s", weexBean);
                b = this.f29878a.b(weexBean, b2);
            }
            int c = c(weexBean);
            if (b) {
                if (c <= 0) {
                    return;
                }
                ((FrameLayout) getView()).getLayoutParams().height = c;
                ((FrameLayout) getView()).setLayoutParams(((FrameLayout) getView()).getLayoutParams());
                return;
            }
            a((d) this.f29878a.c(), WXErrorCode.WX_DEGRAD_ERR_INSTANCE_CREATE_FAILED.getErrorCode(), "template or data illegal");
            k b3 = c().b();
            b3.b("WeexModWidget", "render failed:" + weexBean);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e64f2be", new Object[]{this, hVar});
            return;
        }
        a aVar = this.f29878a;
        if (aVar == null) {
            return;
        }
        aVar.a(hVar);
    }

    public void a(jze jzeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f05cbda3", new Object[]{this, jzeVar});
            return;
        }
        this.h = jzeVar;
        if (this.d) {
            jzeVar.a(this.f29878a.c());
        } else if (!this.e) {
        } else {
            jzeVar.a();
        }
    }

    public a p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b97cef3c", new Object[]{this}) : new e(this.mActivity, c(), this, this, this.b, getModel());
    }

    public Map<String, Object> b(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("aac9c471", new Object[]{this, weexBean});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(aw.PARAM_SEARCH_KEYWORD_RN, weexBean.rn);
        hashMap.put("bucketId", weexBean.abtest);
        hashMap.put("pageType", weexBean.pageType);
        hashMap.put(TBSearchChiTuJSBridge.ABTEST, weexBean.abtest);
        com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?> d = getModel().d();
        if (d != null) {
            hashMap.put("keyword", d.getKeyword());
        }
        JSONObject extraStatus = getModel().d().getExtraStatus();
        if (extraStatus != null) {
            for (String str : extraStatus.keySet()) {
                hashMap.put(str, extraStatus.get(str));
            }
        }
        if (weexBean.pageInfoExtraStatus != null) {
            hashMap.put("pageInfo", weexBean.pageInfoExtraStatus);
        }
        a(hashMap);
        hashMap.putAll(weexBean.extraStatus);
        HashMap hashMap2 = new HashMap();
        hashMap2.putAll(weexBean.mStorage);
        hashMap2.put(i.INDEX_KEY, "mod");
        HashMap hashMap3 = new HashMap();
        if (weexBean != null) {
            hashMap3.put("__nxType__", weexBean.type);
            hashMap3.put("model", weexBean.model);
            hashMap3.put("status", hashMap);
            hashMap3.put(WXStorageModule.NAME, hashMap2);
        }
        return hashMap3;
    }

    public TemplateBean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateBean) ipChange.ipc$dispatch("d6cd45d8", new Object[]{this}) : this.b;
    }

    public FrameLayout r() {
        DebugFrameLayout debugFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("51c75940", new Object[]{this});
        }
        if (c().a().c()) {
            DebugFrameLayout debugFrameLayout2 = new DebugFrameLayout(getActivity());
            debugFrameLayout2.setDebugClickListener(new DebugFrameLayout.a() { // from class: tb.jzf.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.uikit.DebugFrameLayout.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    jzf jzfVar = jzf.this;
                    jzfVar.postEvent(new b(jzfVar));
                }
            });
            debugFrameLayout = debugFrameLayout2;
        } else {
            debugFrameLayout = new FrameLayout(getActivity());
        }
        debugFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return debugFrameLayout;
    }

    public int c(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e4fd7f0", new Object[]{this, weexBean})).intValue();
        }
        if (weexBean == null) {
            c().b().b("WeexModWidget", "obtainFixHeightFromTemplate:weex bean is null");
            return 0;
        }
        TemplateBean a2 = this.f29878a.a(weexBean);
        if (a2 == null) {
            c().b().b("WeexModWidget", "obtainFixHeightFromTemplate:template is null");
            return 0;
        }
        return a2.listHeight;
    }

    @Override // tb.iut
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        a aVar = this.f29878a;
        if (aVar == null) {
            return;
        }
        aVar.f();
    }

    @Override // tb.iut
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        a aVar = this.f29878a;
        if (aVar == null) {
            return;
        }
        aVar.f();
    }

    @Override // tb.iut
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        a aVar = this.f29878a;
        if (aVar == null) {
            return;
        }
        aVar.h();
    }

    @Override // tb.iut
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        a aVar = this.f29878a;
        if (aVar == null) {
            return;
        }
        aVar.g();
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e632142", new Object[]{this, dVar});
            return;
        }
        this.d = true;
        this.f29878a.a((ViewGroup) getView(), (WXSDKInstance) dVar, false);
        a();
        s();
        jze jzeVar = this.h;
        if (jzeVar == null) {
            return;
        }
        jzeVar.a(dVar);
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (getView() == 0) {
        } else {
            ((FrameLayout) getView()).getLayoutParams().height = -2;
            ((FrameLayout) getView()).setLayoutParams(((FrameLayout) getView()).getLayoutParams());
        }
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.a.InterfaceC0626a
    public void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1ee3f03", new Object[]{this, dVar});
            return;
        }
        this.d = true;
        a();
        s();
        jze jzeVar = this.h;
        if (jzeVar == null) {
            return;
        }
        jzeVar.a(dVar);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f) {
        } else {
            this.f = false;
            a aVar = this.f29878a;
            if (aVar == null) {
                return;
            }
            aVar.i();
        }
    }

    public void a(d dVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cce5d56", new Object[]{this, dVar, str, str2});
            return;
        }
        if (getRoot() instanceof itu) {
            ((itu) getRoot()).a(this, this.b.templateName, dVar, str, str2);
        }
        s();
        this.e = true;
        jze jzeVar = this.h;
        if (jzeVar == null) {
            return;
        }
        jzeVar.a();
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.d.a
    public void a(String str, JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcc897e", new Object[]{this, str, jSONObject, jSCallback, jSCallback2});
        } else {
            postEvent(isr.c.a(str, jSONObject, com.taobao.android.xsearchplugin.weex.weex.b.a(jSCallback), com.taobao.android.xsearchplugin.weex.weex.b.a(jSCallback2)));
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.d) {
            if (this.f) {
                return;
            }
            this.f = true;
        } else {
            a aVar = this.f29878a;
            if (aVar == null) {
                return;
            }
            aVar.i();
        }
    }

    private void d() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.f) {
            this.f = false;
        }
        if (!this.d || (aVar = this.f29878a) == null) {
            return;
        }
        aVar.j();
    }

    @Override // tb.itm
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            b();
        }
    }

    @Override // tb.itm
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            d();
        }
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.h
    public boolean a(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d34d2c5a", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        postEvent(isr.c.a(str, jSONObject, aVar, aVar2));
        return true;
    }

    public boolean b(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1409239", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -725085627) {
            if (hashCode == 914742642 && str.equals("updateStorage")) {
                c = 0;
            }
        } else if (str.equals("requestLostFocus")) {
            c = 1;
        }
        if (c != 0) {
            if (c != 1) {
                return false;
            }
            ioc.a(aVar);
            return true;
        }
        WeexBean weexBean = this.c;
        if (weexBean != null) {
            weexBean.mStorage.putAll(jSONObject.getInnerMap());
        }
        return true;
    }

    @Override // tb.iut
    public JSONObject dumpDebugInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("980ff734", new Object[]{this});
        }
        JSONObject dumpDebugInfo = super.dumpDebugInfo();
        JSONObject jSONObject = this.g;
        if (jSONObject != null) {
            dumpDebugInfo.put("查看init_data", (Object) jSONObject);
        }
        return dumpDebugInfo;
    }

    public WeexBean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexBean) ipChange.ipc$dispatch("e25bbf8e", new Object[]{this}) : this.c;
    }
}
