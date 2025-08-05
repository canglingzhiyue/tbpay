package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.android.xsearchplugin.weex.weex.a;
import com.taobao.search.common.util.m;
import com.taobao.search.mmd.util.g;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.WeexActivateCellBean;
import com.taobao.search.searchdoor.sf.widgets.e;
import com.ut.mini.l;
import java.util.HashMap;
import java.util.Map;
import tb.itb;

/* loaded from: classes7.dex */
public class nqn extends jzd<WeexActivateCellBean, e> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ise<itb.b, jzd> CREATOR;
    private static int l;
    private static int m;

    public static /* synthetic */ Object ipc$super(nqn nqnVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.itd
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "WeexActivateCellWidget";
    }

    @Override // tb.jzd
    public /* synthetic */ WeexBean d(WeexActivateCellBean weexActivateCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexBean) ipChange.ipc$dispatch("bd8ddc02", new Object[]{this, weexActivateCellBean}) : a(weexActivateCellBean);
    }

    static {
        kge.a(-980305238);
        l = j.a(128.0f);
        m = j.a(172.0f);
        CREATOR = new ise<itb.b, jzd>() { // from class: tb.nqn.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public jzd<WeexActivateCellBean, e> a(itb.b bVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (jzd) ipChange.ipc$dispatch("f42feb6f", new Object[]{this, bVar}) : new nqn(bVar.f29303a, bVar.b, bVar.d, bVar.c, bVar.e, (e) bVar.f);
            }
        };
    }

    public nqn(Activity activity, ium iumVar, ListStyle listStyle, ViewGroup viewGroup, int i, e eVar) {
        super(activity, iumVar, listStyle, viewGroup, i, eVar);
        E();
    }

    @Override // tb.jzd
    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
        } else {
            a((a) new nqc(getActivity(), getCore(), j().b(), this, this));
        }
    }

    @Override // tb.jzd
    public int a(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7ce43e6e", new Object[]{this, weexBean})).intValue() : l;
    }

    @Override // tb.jzd
    public int b(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8d9a0b2f", new Object[]{this, weexBean})).intValue() : m;
    }

    public WeexBean a(WeexActivateCellBean weexActivateCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexBean) ipChange.ipc$dispatch("82f5c4b5", new Object[]{this, weexActivateCellBean}) : weexActivateCellBean.weexBean;
    }

    @Override // tb.jzd
    public Map<String, Object> a(WeexActivateCellBean weexActivateCellBean, int i, boolean z, ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6e5a703d", new Object[]{this, weexActivateCellBean, new Integer(i), new Boolean(z), listStyle});
        }
        float f = z ? imk.c : (imk.c - (this.d << 1)) / 2.0f;
        HashMap hashMap = new HashMap();
        hashMap.put("width", Float.valueOf(j.c(f)));
        hashMap.put("layoutStyle", Integer.valueOf(ListStyle.toNum(listStyle)));
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("suggestRN", weexActivateCellBean.suggestRn);
        hashMap.put("tab", weexActivateCellBean.tab);
        hashMap.put("pageName", b());
        hashMap.put(noa.KEY_EDITION_CODE, g.d());
        hashMap.put("elderHome", String.valueOf(com.taobao.search.mmd.util.j.INSTANCE.a()));
        boolean equals = "true".equals(j().a().a(noa.KEY_SEARCH_ELDER_HOME_OPEN));
        m mVar = m.INSTANCE;
        hashMap.put("fontSizeLevel", Integer.valueOf(m.a(equals)));
        hashMap.put(noa.KEY_GRAY_HAIR, String.valueOf(equals));
        WeexBean weexBean = weexActivateCellBean.weexBean;
        HashMap hashMap2 = new HashMap();
        if (weexBean != null) {
            hashMap2.put("__nxType__", weexBean.type);
            hashMap2.put("model", weexBean.model);
            hashMap2.put("status", hashMap);
        }
        return hashMap2;
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        String currentPageName = l.getInstance().getCurrentPageName();
        if (currentPageName == null || currentPageName.startsWith("Page_")) {
            return currentPageName;
        }
        return "Page_" + currentPageName;
    }
}
