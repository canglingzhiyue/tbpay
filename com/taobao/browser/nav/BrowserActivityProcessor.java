package com.taobao.browser.nav;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.BrowserActivity;
import com.taobao.browser.exbrowser.BrowserUpperActivity;
import com.taobao.pha.core.h;
import com.taobao.pha.core.p;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.taobao.impl.TMS;
import tb.kge;
import tb.ngr;
import tb.ngu;
import tb.tlv;
import tb.tlx;

/* loaded from: classes6.dex */
public class BrowserActivityProcessor implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BrowserActivityProcessor";
    public static String TMS_WHITE_LIST;
    private static volatile boolean sPreInitUc;

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : TAG;
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
        kge.a(-1687106111);
        kge.a(-719787762);
        sPreInitUc = true;
        TMS_WHITE_LIST = null;
    }

    public static boolean enableEnterTMS(Uri uri) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43ca86ff", new Object[]{uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        try {
            h c = p.c();
            String uri2 = uri.toString();
            if (StringUtils.isEmpty(TMS_WHITE_LIST)) {
                str = c.a("h5_to_tms_list");
            } else {
                str = TMS_WHITE_LIST;
            }
            if (StringUtils.isEmpty(str)) {
                return false;
            }
            if (str.equals("*")) {
                return true;
            }
            for (String str2 : str.split(",")) {
                if (uri2.contains(str2)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        Uri data;
        ComponentName component;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        Context a2 = dVar.a();
        if (a2 == null || intent == null || (data = intent.getData()) == null || (component = intent.getComponent()) == null) {
            return true;
        }
        String className = component.getClassName();
        if (!(BrowserActivity.class.getName().equals(className) || BrowserUpperActivity.class.getName().equals(className))) {
            return true;
        }
        if (ngu.y() && intent.getBooleanExtra("from_browser", false)) {
            ngr.b(TAG, "fromBrowser=true, return");
            return true;
        }
        if (ngu.r()) {
            try {
                z = tlx.INSTANCE.a(new tlv(data.toString(), data, a2));
            } catch (Exception unused) {
            }
        } else if (enableEnterTMS(data) || e.a(data) || d.a(data.toString())) {
            z = true;
        }
        if (z) {
            TMS.startApp(intent, dVar, TMSSolutionType.WEB_SINGLE_PAGE);
        }
        return true;
    }
}
