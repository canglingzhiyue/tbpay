package com.taobao.taobao.scancode.barcode.util;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Menu;
import android.widget.ImageView;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.ut.device.UTDevice;
import com.ut.mini.UTAnalytics;
import tb.kge;
import tb.oys;

/* loaded from: classes8.dex */
public class ScancodeBrowserActivity extends ScancodeBaseBrowserActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String c;

    public static /* synthetic */ Object ipc$super(ScancodeBrowserActivity scancodeBrowserActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
            case -1123919242:
                return super.c();
            case 94685804:
                super.e();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    static {
        kge.a(-1801532506);
        c = Globals.getApplication().getString(R.string.scancode_base_h5_url);
    }

    @Override // com.taobao.taobao.scancode.barcode.util.ScancodeBaseBrowserActivity
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : R.layout.scancode_barcode_browser;
    }

    @Override // com.taobao.taobao.scancode.barcode.util.ScancodeBaseBrowserActivity
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = (ImageView) findViewById(R.id.scancode_browser_bg);
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_BarCodeDetail");
        oys.a().a("Scan_Code_BrowserActivity");
    }

    @Override // com.taobao.taobao.scancode.barcode.util.ScancodeBaseBrowserActivity
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            super.e();
        }
    }

    @Override // com.taobao.taobao.scancode.barcode.util.ScancodeBaseBrowserActivity
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        try {
            Uri data = getIntent().getData();
            if (data != null && data.getPath().contains("/barcode/info")) {
                String queryParameter = data.getQueryParameter("barcode");
                if (data.getQueryParameter("type") != null) {
                    String str = data.getQueryParameter("linkUrl") + "&token=" + data.getQueryParameter("token");
                    try {
                        if (TextUtils.isEmpty(data.getQueryParameter("setActionBarHide"))) {
                            return str;
                        }
                        return str + "&setActionBarHide=true";
                    } catch (Throwable unused) {
                        return str;
                    }
                }
                return a(c + "/app/smg/index.html?barcode=" + queryParameter + "&type=" + (com.taobao.android.scancode.common.util.a.b(queryParameter) ? "2" : "1") + "&saveHistory=" + data.getQueryParameter("saveHistory") + "&utdid=" + UTDevice.getUtdid(getApplicationContext()), data.getQuery());
            }
            return super.c();
        } catch (Exception unused2) {
            return "";
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        super.onCreateOptionsMenu(menu);
        return false;
    }

    private String a(String str, String str2) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for (String str3 : str2.split("&", -1)) {
            String[] split2 = str3.split("=", -1);
            if (split2.length == 2 && str.indexOf(split2[0]) <= 0) {
                sb.append("&");
                sb.append(str3);
            }
        }
        return sb.toString();
    }
}
