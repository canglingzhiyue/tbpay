package com.taobao.android.share.resource;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;
import com.taobao.monitor.procedure.m;
import com.taobao.orange.OrangeConfig;
import com.taobao.zcache.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SHAREBACKGETPASSWORDMTOPEND = "shareBackGetPasswordMtopEnd";
    public static final String KEY_SHAREBACKGETPASSWORDMTOPSTART = "shareBackGetPasswordMtopStart";
    public static final String KEY_SHAREBACKINITDIALOG = "shareBackInitDialog";
    public static final String KEY_SHAREBACKINITWEEX = "shareBackInitWeex";
    public static final String KEY_SHAREBACKISTAOPASSWORDMTOPEND = "shareBackIsTaoPasswordMtopEnd";
    public static final String KEY_SHAREBACKISTAOPASSWORDMTOPSTART = "shareBackIsTaoPasswordMtopStart";
    public static final String KEY_SHAREBACKPARSERMATCHEND = "shareBackParserMatchEnd";
    public static final String KEY_SHAREBACKPARSERMATCHSTART = "shareBackParserMatchStart";
    public static final String KEY_SHAREBACKPASSWORDCHECKEND = "shareBackPasswordCheckEnd";
    public static final String KEY_SHAREBACKPASSWORDCHECKSTART = "shareBackPasswordCheckStart";
    public static final String KEY_SHAREBACKPASSWORDVALIDEND = "shareBackPasswordValidEnd";
    public static final String KEY_SHAREBACKPASSWORDVALIDSTART = "shareBackPasswordValidStart";
    public static final String KEY_SHAREBACKPREPAREDATAEND = "shareBackPrepareDataEnd";
    public static final String KEY_SHAREBACKPREPAREDATASTART = "shareBackPrepareDataStart";
    public static final String KEY_SHAREBACKRENDER = "shareBackRenderWeex";
    public static final String KEY_SHAREBACKSHOWDIALOG = "shareBackShowDialog";
    public static final String KEY_SHARELIFECYCLEOBSERVERONSTARTED = "shareBackLifeCycleObserveronStart";
    public static final String KEY_SHAREPANELBUSINESSSERVICEEND = "sharePanelBusinessServiceEnd";
    public static final String KEY_SHAREPANELBUSINESSSERVICESTART = "sharePanelBusinessServiceStart";
    public static final String KEY_SHAREPANELCONTENTDEALPROCESSOREND = "sharePanelContentDealProcessorEnd";
    public static final String KEY_SHAREPANELCONTENTDEALPROCESSORSTART = "sharePanelContentDealProcessorStart";
    public static final String KEY_SHAREPANELDOSHAREEND = "sharePanelDoShareEnd";
    public static final String KEY_SHAREPANELDOSHARESTART = "sharePanelDoShareStart";
    public static final String KEY_SHAREPANELGETSHARECONFIGEND = "sharePanelGetShareConfigEnd";
    public static final String KEY_SHAREPANELGETSHARECONFIGSTART = "sharePanelGetShareConfigStart";
    public static final String KEY_SHAREPANELINITSHAREPANELDATAEND = "sharePanelInitSharePanelDataEnd";
    public static final String KEY_SHAREPANELINITSHAREPANELDATASTART = "sharePanelInitSharePanelDataStart";
    public static final String KEY_SHAREPANELINITSHAREPANELEND = "sharePanelInitSharePanelEnd";
    public static final String KEY_SHAREPANELINITSHAREPANELSTART = "sharePanelInitSharePanelStart";
    public static final String KEY_SHAREPANELLOGININTERCEPTOREND = "sharePanelLoginInterceptorEnd";
    public static final String KEY_SHAREPANELLOGININTERCEPTORSTART = "sharePanelLoginInterceptorStart";
    public static final String KEY_SHAREPANELPARSESHARECONTENTEND = "sharePanelParseShareContentEnd";
    public static final String KEY_SHAREPANELPARSESHARECONTENTSTART = "sharePanelParseShareContentStart";
    public static final String KEY_SHAREPANELRENDERPANELACTIVITYINFOEND = "sharePanelRenderPanelActivityinfoEnd";
    public static final String KEY_SHAREPANELRENDERPANELACTIVITYINFOSTART = "sharePanelRenderPanelActivityinfoStart";
    public static final String KEY_SHAREPANELRENDERPANELEND = "sharePanelRenderPanelEnd";
    public static final String KEY_SHAREPANELRENDERPANELSTART = "sharePanelRenderPanelStart";
    public static final String KEY_SHAREPANELSHOWWEEX2START = "sharePanelShowWeex2Start";
    public static final String KEY_SHAREPANELSTART = "sharePanelStart";
    public static final String KEY_SHAREPANELSTATERESETPROCESSOREND = "sharePanelStateResetProcessorEnd";
    public static final String KEY_SHAREPANELSTATERESETPROCESSORSTART = "sharePanelStateResetProcessorStart";
    public static final String SHARE_BACKFLOW_CREATE = "shareBackflowCreate";
    public static final String SHARE_BACKFLOW_DESTROYE = "shareBackflowDestroy";
    public static final String SHARE_BACKFLOW_PAGENAME = "shareBackFlowPage";
    public static final String SHARE_PANEL_CREATE = "sharePanelCreate";
    public static final String SHARE_PANEL_DESTROY = "sharePanelDestroy";
    public static final String SHARE_PANEL_PAGENAME = "sharePanelPage";
    private static a d;

    /* renamed from: a  reason: collision with root package name */
    private IPage f15069a;
    private final Map<String, String> b = new HashMap();
    private String c;

    static {
        kge.a(-1551394366);
        d = null;
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("13e65a56", new Object[0]);
        }
        if (d == null) {
            d = new a();
        }
        return d;
    }

    private List<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
        }
        String config = OrangeConfig.getInstance().getConfig("android_share_bizconfig", "shareZcachelist", null);
        ArrayList arrayList = new ArrayList();
        arrayList.add("https://web.m.taobao.com/app/message-social-front/share-panel/N4");
        arrayList.add("https://web.m.taobao.com/app/message-social-front/share-back/home");
        if (!StringUtils.isEmpty(config)) {
            try {
                List<ShareZCacheConfig> parseArray = JSON.parseArray(config, ShareZCacheConfig.class);
                if (parseArray != null) {
                    for (ShareZCacheConfig shareZCacheConfig : parseArray) {
                        if (!StringUtils.isEmpty(shareZCacheConfig.zcacheurl)) {
                            arrayList.add(shareZCacheConfig.zcacheurl);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    private a() {
        d();
        this.c = OrangeConfig.getInstance().getConfig("android_share_bizconfig", "isUseApmReport", "true");
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            if (!"true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "isUseZCache", "true"))) {
                return;
            }
            n.a(c());
        } catch (Throwable unused) {
        }
    }

    private IPage a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("808f8d67", new Object[]{this, view});
        }
        if (this.f15069a == null) {
            this.f15069a = m.a().a(view, true);
        }
        return this.f15069a;
    }

    public void a(View view, String str, String str2, String str3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd560bd", new Object[]{this, view, str, str2, str3, map});
            return;
        }
        try {
            if (!"true".equals(this.c)) {
                return;
            }
            a(view).d().a(str2, str3, map);
            a(view).g().a(str, (Object) this.b);
        } catch (Throwable unused) {
        }
    }

    public void a(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c0c6b4", new Object[]{this, view, str});
            return;
        }
        try {
            if (!"true".equals(this.c)) {
                return;
            }
            a(view).d().d();
        } catch (Throwable unused) {
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            Map<String, String> map = this.b;
            map.put(str, e() + "");
        } catch (Throwable unused) {
        }
    }

    private long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        return currentTimeMillis > 0 ? currentTimeMillis - (System.currentTimeMillis() - SystemClock.uptimeMillis()) : currentTimeMillis;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Map<String, String> map = this.b;
        if (map != null) {
            map.clear();
        }
        this.f15069a = null;
    }
}
