package tb;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.f;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.uc.webview.export.WebView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class jbi extends jbh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final FluidContext b;
    private final Map c;
    private final long k;
    private boolean l;

    static {
        kge.a(-1899716070);
    }

    public static /* synthetic */ Object ipc$super(jbi jbiVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -152376096) {
            super.cI_();
            return null;
        } else if (hashCode != 201529414) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((WebView) objArr[0], (String) objArr[1], (String) objArr[2]);
            return null;
        }
    }

    public jbi(FluidContext fluidContext, ViewGroup viewGroup, Map map, long j) {
        super(fluidContext, viewGroup);
        this.c = map;
        this.b = fluidContext;
        this.k = j;
    }

    @Override // tb.jbh
    public String a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f6e6d446", new Object[]{this, fluidContext}) : ((IInteractionService) this.b.getService(IInteractionService.class)).getGlobalVCH5Url();
    }

    @Override // tb.jbh
    public boolean b(spy spyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("edb78e21", new Object[]{this, spyVar})).booleanValue() : spy.BIZ_OPEN_INTERACT.equals(spyVar.f33836a);
    }

    @Override // tb.jbh
    public Map d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.c;
    }

    @Override // tb.jbh
    public void a(WebView webView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c031846", new Object[]{this, webView, str, str2});
            return;
        }
        super.a(webView, str, str2);
        if (this.i != 3 && !this.l) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            a(str2, elapsedRealtime - this.r, elapsedRealtime - this.k, elapsedRealtime - this.q);
        }
        this.l = true;
        int pageState = ((ILifecycleService) this.b.getService(ILifecycleService.class)).getPageState();
        if (pageState != 4 && pageState != 5) {
            return;
        }
        webView.setVisibility(8);
    }

    private void a(String str, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7099cd2", new Object[]{this, str, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "";
        }
        hashMap.put("url", str);
        hashMap.put("costTime", String.valueOf(j));
        hashMap.put(iqw.UT_VC_H5_LOAD_URL_SUCCEED_EVENT_PROPERTY_FROM_PAGE_START_TIME, String.valueOf(j2));
        hashMap.put(iqw.UT_VC_H5_LOAD_URL_SUCCEED_EVENT_PROPERTY_FROM_INIT_WEB_VIEW_TIME, String.valueOf(j3));
        hashMap.put(FluidSDK.FLUID_SDK_FLAG, "1");
        hashMap.put(f.FLUID_SDK_REMOTE_VERSION, f.FLUID_SDK_REMOTE_VERSION_VALUE);
        spz.c("GlobalVCH5MessageHandler", "加载URL成功埋点，properties=" + hashMap);
        FluidSDK.getUTAdapter().trackCustom(iqw.UT_PAGE_NAME, iqw.UT_VC_H5_LOAD_URL_SUCCEED_EVENT_NAME, hashMap);
    }

    @Override // tb.jbh, tb.ptk, tb.spx, tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
        } else {
            super.cI_();
        }
    }

    @Override // tb.jbh
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (this.f29446a == null) {
        } else {
            View view = this.f29446a;
            while (!(view.getParent() instanceof TNodeView)) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            }
            if (!(view.getParent() instanceof TNodeView)) {
                return;
            }
            ((TNodeView) view.getParent()).removeUpperView(view);
        }
    }
}
