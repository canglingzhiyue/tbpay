package tb;

import android.app.Activity;
import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ah;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.uikit.screentype.a;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.android.xsearchplugin.muise.l;
import com.taobao.android.xsearchplugin.muise.o;
import com.taobao.android.xsearchplugin.weex.weex.h;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.r;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.datasource.c;
import java.util.HashMap;
import java.util.Map;
import tb.isv;

/* loaded from: classes8.dex */
public class ntd implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Activity f31745a;
    private final ViewGroup b;
    private final iur c = new iur() { // from class: tb.ntd.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.iur
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            } else {
                ntd.a(ntd.this).addView(view, new ViewGroup.LayoutParams(-1, -1));
            }
        }

        @Override // tb.iur
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            } else {
                ntd.a(ntd.this).removeView(view);
            }
        }
    };
    private final Map<String, iuk> d = new HashMap();
    private iuk e = null;

    static {
        kge.a(-304714873);
        kge.a(-1327398134);
    }

    public static /* synthetic */ ViewGroup a(ntd ntdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("ad1a0a1b", new Object[]{ntdVar}) : ntdVar.b;
    }

    public static /* synthetic */ int b(ntd ntdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e55e252e", new Object[]{ntdVar})).intValue() : ntdVar.c();
    }

    public ntd(Activity activity) {
        this.f31745a = activity;
        this.b = a(activity);
        ScreenType a2 = ScreenType.a(activity);
        if (a2 != null) {
            a2.a(this);
        }
    }

    private ViewGroup a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("7373231b", new Object[]{this, activity});
        }
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        return (viewGroup == null || r.bH()) ? (ViewGroup) activity.getWindow().getDecorView() : viewGroup;
    }

    private int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        ViewGroup viewGroup = (ViewGroup) this.f31745a.findViewById(16908290);
        if (viewGroup == null) {
            viewGroup = (ViewGroup) this.f31745a.getWindow().getDecorView();
        }
        return viewGroup.getMeasuredHeight();
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, ium iumVar, l lVar, Object obj) {
        iuk a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8899521", new Object[]{this, jSONObject, jSONObject2, iumVar, lVar, obj});
        } else if (jSONObject == null) {
        } else {
            int intValue = jSONObject.getIntValue("type");
            String string = jSONObject.getString("tag");
            String string2 = jSONObject.getString("url");
            if (StringUtils.isEmpty(string) || this.d.containsKey(string) || StringUtils.isEmpty(string2)) {
                return;
            }
            if (intValue == 1) {
                this.d.put(string, a(string2, jSONObject2, iumVar, obj));
            } else if (intValue != 2 || (a2 = a(string2, jSONObject2, lVar, obj)) == null) {
            } else {
                this.d.put(string, a2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View] */
    private iuk a(String str, JSONObject jSONObject, ium iumVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iuk) ipChange.ipc$dispatch("16a401de", new Object[]{this, str, jSONObject, iumVar, obj});
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("url", (Object) str);
        ntc ntcVar = new ntc(this.f31745a, iumVar, null, this.b, this.c);
        ntcVar.a(obj);
        ntcVar.attachToContainer();
        ntcVar.a(jSONObject);
        this.e = ntcVar;
        ntcVar.postEvent(new nte());
        ah.a((View) ntcVar.getView());
        return ntcVar;
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [android.view.View] */
    private iuk a(String str, JSONObject jSONObject, l lVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iuk) ipChange.ipc$dispatch("399797f", new Object[]{this, str, jSONObject, lVar, obj});
        }
        TemplateBean template = lVar.S().d().getTemplate(str);
        if (template == null) {
            q.c("NSPopContainer", "tItemType 对应的模板为空");
            return null;
        }
        ise<irp, ? extends itn> iseVar = lVar.getCore().m().b.f29267a;
        if (iseVar == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("model");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        jSONObject2.put("tItemType", (Object) str);
        MuiseBean muiseBean = (MuiseBean) lVar.getCore().g().a(jSONObject2, (BaseSearchResult) lVar.S().d().getTotalSearchResult(), null);
        if (muiseBean == null) {
            q.c("NSPopContainer", "info parse 失败");
            return null;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("status");
        if (jSONObject3 != null) {
            muiseBean.extraStatus.putAll(jSONObject3);
        }
        o oVar = (o) iseVar.a(new irp(a(lVar), template));
        oVar.attachToContainer();
        oVar.a(muiseBean);
        ah.a((View) oVar.getView());
        if (obj != null) {
            oVar.a((h) obj);
        }
        oVar.a("contentHeight", String.valueOf(j.c(c())));
        ScreenType a2 = ScreenType.a(this.f31745a);
        if (a2 != null) {
            a2.b(oVar);
        }
        this.e = oVar;
        oVar.postEvent(new nte());
        if (!oVar.getModel().d().isSubscribed(this)) {
            oVar.getModel().d().subscribe(this);
        }
        return oVar;
    }

    private irq a(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (irq) ipChange.ipc$dispatch("9b03cd28", new Object[]{this, lVar});
        }
        irq irqVar = new irq(lVar.getActivity(), lVar.getParent(), lVar.S());
        irqVar.a(this.c);
        return irqVar;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("tag");
        if (StringUtils.isEmpty(string)) {
            return;
        }
        iuk remove = this.d.remove(string);
        if (remove != null) {
            remove.destroyAndRemoveFromParent();
        }
        if (this.e != remove) {
            return;
        }
        this.e = null;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (Map.Entry<String, iuk> entry : this.d.entrySet()) {
            entry.getValue().destroyAndRemoveFromParent();
        }
        this.d.clear();
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        for (Map.Entry<String, iuk> entry : this.d.entrySet()) {
            iuk value = entry.getValue();
            if (value instanceof o) {
                ((o) value).a(str, jSONObject);
            }
        }
    }

    private void a(isv.a aVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dce6fef", new Object[]{this, aVar});
        } else if (!(aVar.a().getTotalSearchResult() instanceof CommonSearchResult)) {
        } else {
            CommonSearchResult commonSearchResult = (CommonSearchResult) aVar.a().getTotalSearchResult();
            if (commonSearchResult.noResultMod == null) {
                i = commonSearchResult.getTotalResult();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("totalResults", (Object) String.valueOf(i));
            a("searchFinish", jSONObject);
        }
    }

    public void onEventMainThread(isv.k kVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a107c02", new Object[]{this, kVar});
        } else if (!r.bA()) {
        } else {
            iuk b = b();
            if (!(b instanceof o)) {
                return;
            }
            o oVar = (o) b;
            if (!(oVar.getModel().d() instanceof c)) {
                return;
            }
            c cVar = (c) oVar.getModel().d();
            if (cVar.getTotalSearchResult() == 0) {
                return;
            }
            if (((CommonSearchResult) cVar.getTotalSearchResult()).noResultMod == null) {
                i = ((CommonSearchResult) cVar.getTotalSearchResult()).getTotalResult();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("totalResults", (Object) String.valueOf(i));
            a("searchFinish", jSONObject);
        }
    }

    public void onEventMainThread(isv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0bf04c", new Object[]{this, aVar});
        } else {
            a(aVar);
        }
    }

    public iuk b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iuk) ipChange.ipc$dispatch("16b7c99e", new Object[]{this}) : this.e;
    }

    @Override // com.taobao.android.searchbaseframe.uikit.screentype.a
    public void i_(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57263006", new Object[]{this, new Integer(i)});
            return;
        }
        iuk iukVar = this.e;
        if (!(iukVar instanceof o)) {
            return;
        }
        final o oVar = (o) iukVar;
        new Handler().post(new Runnable() { // from class: tb.ntd.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                oVar.i_(i);
                oVar.a("contentHeight", String.valueOf(j.c(ntd.b(ntd.this))));
            }
        });
    }
}
