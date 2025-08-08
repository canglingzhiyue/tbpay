package com.taobao.browser.nav;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.tao.tbmainfragment.SupportActivity;
import com.taobao.tao.tbmainfragment.i;
import com.taobao.tao.util.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import tb.akt;
import tb.fpz;
import tb.kge;
import tb.nom;

/* loaded from: classes6.dex */
public class b implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f16834a;
    private boolean b = false;

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "BrowserFragmentProcessor";
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
        kge.a(857503648);
        kge.a(-719787762);
        f16834a = 0;
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue() : a(intent, dVar.a());
    }

    public boolean a(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7efd347", new Object[]{this, intent, context})).booleanValue();
        }
        try {
            if (com.taobao.tao.tbmainfragment.d.a(context, "BrowserFragmentCountLimit")) {
                synchronized (this) {
                    if (f16834a > 0) {
                        m.e("BFProcessor", "instanceCount limit " + f16834a);
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            m.e("BFProcessor", "error:" + th);
            th.printStackTrace();
            android.taobao.windvane.monitor.a.commitFail("BFProcessor", 0, "nav Process error", th.toString() + " trace::" + android.taobao.windvane.util.a.a(th));
        }
        if (!com.taobao.tao.tbmainfragment.d.b(context)) {
            m.e("BFProcessor", "FragmentSwitch FragmentModel is not Open");
            return true;
        }
        if (!com.taobao.tao.tbmainfragment.d.a(context, "BrowserFragment")) {
            m.e("BFProcessor", "FragmentSwitch BrowserFragment is not Open");
            int a2 = akt.a();
            if (!com.taobao.tao.tbmainfragment.d.a(context, "BrowserFragment_deviceLevel_" + a2)) {
                m.e("BFProcessor", "FragmentSwitch BrowserFragment_deviceLevel_" + a2 + " is not Open");
                return true;
            }
        }
        String a3 = a(context, intent.getDataString());
        m.e("BFProcessor", "BrowserFragmentProcessor process url=" + a3);
        if (StringUtils.isEmpty(a3) || a(a3)) {
            return true;
        }
        if (context instanceof fpz) {
            context = ((fpz) context).a();
            m.e("BFProcessor", "ViewContext getCurrentContext=" + context);
        }
        if (context instanceof SupportActivity) {
            Bundle bundle = new Bundle();
            bundle.putString(i.KEY_FRAGMENT_JUMP, "true");
            bundle.putString(i.KEY_FRAGMENT_NAME, "com.taobao.browser.fragment.BrowserFragment");
            bundle.putString(i.SUB_KEY_FRAGMENT_JUMP, "BrowserFragment");
            intent.putExtra(i.KEY_FRAGMENT_BUNDLE, bundle);
            if (this.b) {
                intent.setData(Uri.parse(a3));
            }
            android.taobao.windvane.monitor.a.commitSuccess("BFProcessorAbort", "BrowserFragment");
            m.e("BFProcessor", "try to start BrowserFragment " + intent.getDataString());
            return true;
        }
        m.e("BFProcessor", "context " + context);
        android.taobao.windvane.monitor.a.commitFail("BFProcessorAbort", 5, "context:" + context, a3);
        return true;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        com.taobao.browser.config.a.a().b();
        com.taobao.browser.config.a.a();
        if (!StringUtils.isEmpty(com.taobao.browser.config.a.commonConfig.g)) {
            com.taobao.browser.config.a.a();
            if (str.matches(com.taobao.browser.config.a.commonConfig.g)) {
                try {
                    Uri parse = Uri.parse(str);
                    if (parse.getBooleanQueryParameter(com.taobao.android.tschedule.protocol.b.PROTOCOL_BIZ_CODE_PHA, false)) {
                        m.e("BFProcessor", "pha, abort");
                        android.taobao.windvane.monitor.a.commitFail("BFProcessorAbort", 2, com.taobao.android.tschedule.protocol.b.PROTOCOL_BIZ_CODE_PHA, str);
                        return true;
                    }
                    Set<String> queryParameterNames = parse.getQueryParameterNames();
                    if (queryParameterNames != null && queryParameterNames.contains("pha_manifest")) {
                        m.e("BFProcessor", "pha_manifest, abort");
                        android.taobao.windvane.monitor.a.commitFail("BFProcessorAbort", 2, "pha_manifest", str);
                        return true;
                    } else if (!nom.VALUE_YES.equalsIgnoreCase(parse.getQueryParameter("disableNav")) && !"true".equalsIgnoreCase(parse.getQueryParameter("disableNav"))) {
                        m.e("BFProcessor", "not disableNav, abort");
                        android.taobao.windvane.monitor.a.commitFail("BFProcessorAbort", 3, "disableNav", str);
                        return true;
                    } else if (!parse.getBooleanQueryParameter("status_bar_transparent", false)) {
                        m.e("BFProcessor", "not status_bar_transparent, abort");
                        android.taobao.windvane.monitor.a.commitFail("BFProcessorAbort", 4, "status_bar_transparent", str);
                        return true;
                    } else if ("1".equals(parse.getQueryParameter("cpp"))) {
                        m.e("BFProcessor", "cpp, abort");
                        android.taobao.windvane.monitor.a.commitFail("BFProcessor", 1, "cpp", str);
                        return true;
                    } else if (parse.getBooleanQueryParameter("hybrid", false)) {
                        m.e("BFProcessor", "hybrid, abort");
                        android.taobao.windvane.monitor.a.commitFail("BFProcessor", 2, "hybrid", str);
                        return true;
                    } else if (parse.getBooleanQueryParameter("forceAllH5", false)) {
                        m.e("BFProcessor", "forceAllH5, abort");
                        android.taobao.windvane.monitor.a.commitFail("BFProcessor", 3, "forceAllH5", str);
                        return true;
                    } else if (parse.getBooleanQueryParameter("landscape", false)) {
                        m.e("BFProcessor", "landscape, abort");
                        android.taobao.windvane.monitor.a.commitFail("BFProcessor", 4, "landscape", str);
                        return true;
                    } else if (parse.getBooleanQueryParameter("wvUseSysWebView", false)) {
                        m.e("BFProcessor", "wvUseSysWebView, abort");
                        android.taobao.windvane.monitor.a.commitFail("BFProcessor", 5, "wvUseSysWebView", str);
                        return true;
                    } else if (!parse.getBooleanQueryParameter("alloweWebViewHistoryBack", true)) {
                        m.e("BFProcessor", "alloweWebViewHistoryBack, abort");
                        android.taobao.windvane.monitor.a.commitFail("BFProcessor", 6, "alloweWebViewHistoryBack", str);
                        return true;
                    } else if (parse.getBooleanQueryParameter("disallowback", false)) {
                        m.e("BFProcessor", "disallowback, abort");
                        android.taobao.windvane.monitor.a.commitFail("BFProcessor", 7, "disallowback", str);
                        return true;
                    } else if (!parse.getBooleanQueryParameter("SAVE_FORMAT_DATA", true)) {
                        m.e("BFProcessor", "SAVE_FORMAT_DATA, abort");
                        android.taobao.windvane.monitor.a.commitFail("BFProcessor", 8, "SAVE_FORMAT_DATA", str);
                        return true;
                    } else if (parse.getBooleanQueryParameter("waitUCPrepared", false)) {
                        m.e("BFProcessor", "waitUCPrepared, abort");
                        android.taobao.windvane.monitor.a.commitFail("BFProcessor", 9, "waitUCPrepared", str);
                        return true;
                    } else if (parse.getBooleanQueryParameter("isPostUrl", false)) {
                        m.e("BFProcessor", "isPostUrl, abort");
                        android.taobao.windvane.monitor.a.commitFail("BFProcessor", 10, "isPostUrl", str);
                        return true;
                    } else if (parse.getBooleanQueryParameter("hasCustomButton", false)) {
                        m.e("BFProcessor", "hasCustomButton, abort");
                        android.taobao.windvane.monitor.a.commitFail("BFProcessor", 11, "hasCustomButton", str);
                        return true;
                    } else if (!StringUtils.isEmpty(parse.getQueryParameter(Constants.MYBROWSERTITLE))) {
                        m.e("BFProcessor", "myBrowserTitle, abort");
                        android.taobao.windvane.monitor.a.commitFail("BFProcessor", 12, Constants.MYBROWSERTITLE, str);
                        return true;
                    } else if (parse.getBooleanQueryParameter(Constants.MYBROWSERHIDETITLE, false)) {
                        m.e("BFProcessor", "myBrowserHideTitle, abort");
                        android.taobao.windvane.monitor.a.commitFail("BFProcessor", 13, Constants.MYBROWSERHIDETITLE, str);
                        return true;
                    } else if (!StringUtils.isEmpty(parse.getQueryParameter("customtitle"))) {
                        m.e("BFProcessor", "customtitle, abort");
                        android.taobao.windvane.monitor.a.commitFail("BFProcessor", 14, "customtitle", str);
                        return true;
                    } else if (parse.getBooleanQueryParameter("is_refund_order_url", false)) {
                        m.e("BFProcessor", "is_refund_order_url, abort");
                        android.taobao.windvane.monitor.a.commitFail("BFProcessor", 15, "is_refund_order_url", str);
                        return true;
                    } else if (parse.getBooleanQueryParameter("disableScreenShot", false)) {
                        m.e("BFProcessor", "disableScreenShot, abort");
                        android.taobao.windvane.monitor.a.commitFail("BFProcessor", 16, "disableScreenShot", str);
                        return true;
                    } else if (StringUtils.isEmpty(parse.getQueryParameter(com.taobao.downgrade.e.HARDWARE))) {
                        return false;
                    } else {
                        m.e("BFProcessor", "hardware, abort");
                        android.taobao.windvane.monitor.a.commitFail("BFProcessor", 17, com.taobao.downgrade.e.HARDWARE, str);
                        return true;
                    }
                } catch (Throwable th) {
                    m.e("BFProcessor", "parse uri failed " + th);
                    android.taobao.windvane.monitor.a.commitFail("BFProcessor", 18, "parse uri failed", th + " url==" + str);
                    return true;
                }
            }
        }
        m.e("BFProcessor", "not match url, abort");
        StringBuilder sb = new StringBuilder();
        sb.append("not match ");
        com.taobao.browser.config.a.a();
        sb.append(com.taobao.browser.config.a.commonConfig.g);
        android.taobao.windvane.monitor.a.commitFail("BFProcessorAbort", 1, sb.toString(), str);
        return true;
    }

    private String a(Context context, String str) {
        BufferedReader bufferedReader;
        Throwable th;
        String str2;
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{this, context, str});
        }
        this.b = false;
        if (!BrowserUtil.b(context) || !new File("/data/local/tmp/.meetinghook").exists()) {
            return str;
        }
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("/data/local/tmp/.meetinghook"))));
            } catch (Throwable th2) {
                bufferedReader = bufferedReader2;
                th = th2;
            }
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null && readLine.trim().length() > 0) {
                        String trim = readLine.trim();
                        if (!StringUtils.isEmpty(trim)) {
                            try {
                                this.b = true;
                                m.e("BFProcessor", "meetinghook url=" + trim);
                                str = trim;
                            } catch (Exception e2) {
                                e = e2;
                                str2 = trim;
                                bufferedReader2 = bufferedReader;
                                e.printStackTrace();
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                return str2;
                            }
                        }
                    }
                    try {
                        bufferedReader.close();
                        return str;
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        return str;
                    }
                } catch (Exception e5) {
                    str2 = str;
                    e = e5;
                }
            } catch (Throwable th3) {
                th = th3;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e7) {
            str2 = str;
            e = e7;
        }
    }

    public static synchronized void a() {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            } else {
                f16834a++;
            }
        }
    }

    public static synchronized void b() {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[0]);
            } else {
                f16834a--;
            }
        }
    }
}
