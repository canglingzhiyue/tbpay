package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.xsearchplugin.weex.weex.a;
import com.taobao.android.xsearchplugin.weex.weex.d;
import com.taobao.search.searchdoor.sf.widgets.b;
import com.taobao.weex.WXSDKInstance;
import tb.jvm;

/* loaded from: classes7.dex */
public class nqc extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b b;

    static {
        kge.a(-255906756);
    }

    public static /* synthetic */ Object ipc$super(nqc nqcVar, String str, Object... objArr) {
        if (str.hashCode() == 93762287) {
            return new Boolean(super.d());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public nqc(Activity activity, imn imnVar, b bVar, a.InterfaceC0626a interfaceC0626a, d.a aVar) {
        super(activity, imnVar, interfaceC0626a, aVar);
        this.b = bVar;
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.a
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (!super.d()) {
            return false;
        }
        if (this.b != null) {
            return true;
        }
        a().b().b("ActivateWeexRenderer", "datasource is null");
        return false;
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.a
    public void a(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421b9086", new Object[]{this, wXSDKInstance});
        } else {
            this.b.b(wXSDKInstance);
        }
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.a
    public TemplateBean a(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateBean) ipChange.ipc$dispatch("addf7135", new Object[]{this, weexBean}) : this.b.a(weexBean.type);
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.a
    public jvm.c a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvm.c) ipChange.ipc$dispatch("2535e2b4", new Object[]{this, str}) : this.b.b(str);
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.a
    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e632142", new Object[]{this, dVar});
        } else {
            this.b.a(dVar);
        }
    }
}
