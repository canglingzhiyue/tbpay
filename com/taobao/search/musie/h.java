package com.taobao.search.musie;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.interactive_common.CXCommonActivity;
import com.taobao.android.searchbaseframe.xsl.f;
import com.taobao.android.searchbaseframe.xsl.module.XslModule;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import tb.imn;
import tb.kge;

/* loaded from: classes7.dex */
public class h implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f19251a;
    private static final Set<String> b;
    private static final Set<String> c;

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "MUSPagePreprocessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(893210605);
        kge.a(-719787762);
        HashSet hashSet = new HashSet();
        f19251a = hashSet;
        hashSet.add(aw.PARAM_UT_PARAMS);
        f19251a.add("_mus_tpl");
        f19251a.add(CXCommonActivity.NAV_OVERLAY);
        f19251a.add("_wx_statusbar_hidden");
        f19251a.add("appId");
        f19251a.add("_xsl_flat_params");
        b = new HashSet();
        c = new HashSet();
        b.add("market.m.taobao.com");
        b.add("market.wapa.taobao.com");
        c.add("mo.m.taobao.com");
        c.add("pre-mo.m.taobao.com");
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (intent != null && dVar != null) {
            return a(intent);
        }
        return true;
    }

    private boolean a(Intent intent) {
        Uri data;
        String path;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        if (com.taobao.search.common.util.r.u() || (data = intent.getData()) == null) {
            return true;
        }
        String host = data.getHost();
        if ((!b.contains(host) && !c.contains(host)) || (path = data.getPath()) == null) {
            return true;
        }
        if (b.contains(host)) {
            if (!path.contains("/app/asr-pages/")) {
                return true;
            }
        } else if (c.contains(host) && (!path.contains("/search_rec/") || !"true".equals(data.getQueryParameter("wh_muise")))) {
            return true;
        }
        Set<String> queryParameterNames = data.getQueryParameterNames();
        final long currentTimeMillis = System.currentTimeMillis();
        final imn b2 = XslModule.b();
        if (b2 == null) {
            Log.e("MUSPageInterceptor", "No core");
            return true;
        }
        if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
            String queryParameter = data.getQueryParameter("_xsl_prld_id");
            if (TextUtils.isEmpty(queryParameter)) {
                com.taobao.android.searchbaseframe.util.k.f("[XS.xsl]", "Preload failed, no _xsl_prld_id in url.", new Object[0]);
                return true;
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("appId", queryParameter);
            boolean booleanQueryParameter = data.getBooleanQueryParameter("_xsl_flat_params", false);
            for (String str : queryParameterNames) {
                if (!f19251a.contains(str)) {
                    String queryParameter2 = data.getQueryParameter(str);
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        if (booleanQueryParameter) {
                            hashMap2.put(str, queryParameter2);
                        } else {
                            hashMap.put(str, queryParameter2);
                        }
                    }
                }
            }
            hashMap.put(RequestConfig.IS_ICART_IS_FIRST_REQUEST, "true");
            if (!com.taobao.android.searchbaseframe.xsl.f.a().a(data.toString(), "mtop.relationrecommend.WirelessRecommend.recommend", "2.0", hashMap2, hashMap, new f.a() { // from class: com.taobao.search.musie.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.xsl.f.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    b2.b().c("MUSPageInterceptor", "SaveTime %d", Long.valueOf(currentTimeMillis2 - currentTimeMillis));
                    new HashMap().put(ScheduleProtocolCallback.MERGE_TIME, String.valueOf(currentTimeMillis2));
                }
            }, booleanQueryParameter)) {
            }
            return true;
        }
        b2.b().b("MUSPageInterceptor", "Empty params");
        return true;
    }
}
