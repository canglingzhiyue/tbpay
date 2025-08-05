package com.taobao.browser.urlFilter;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.taobao.util.k;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.browser.config.a;
import com.taobao.browser.urlFilter.UrlFilter;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.browser.utils.d;
import com.taobao.taobao.R;
import tb.bgy;
import tb.kge;

/* loaded from: classes6.dex */
public class ExtraUrlFilter implements UrlFilter.URLFilterinterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Handler mHandler;
    private String TAG = "ExtraUrlFilter";
    private VideoFilter mVideoFilter = new VideoFilter();

    static {
        kge.a(2002182201);
        kge.a(33568401);
    }

    public ExtraUrlFilter(Handler handler) {
        this.mHandler = handler;
    }

    @Override // com.taobao.browser.urlFilter.UrlFilter.URLFilterinterface
    public boolean doFilter(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebc59a6c", new Object[]{this, context, str})).booleanValue();
        }
        if (str == null) {
            k.a(this.TAG, "Error  load  url is null");
            return true;
        }
        if (!BrowserUtil.a(str, BrowserUtil.a(context, R.string.cmbchina))) {
            BrowserUtil.a(this.TAG, "doFilter", "url_filter_cmbchina", str, null);
            if (str.contains(bgy.APK_EXTENSION)) {
                try {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    AppMonitor.Alarm.commitFail("WindVane", "DownloadApp", "0", "1", str);
                } catch (ActivityNotFoundException unused) {
                    Toast makeText = Toast.makeText(context, "对不起，您的设备找不到相应程序", 1);
                    makeText.setGravity(17, 0, 0);
                    makeText.show();
                }
                return true;
            }
        }
        if (str.startsWith(MspGlobalDefine.ALIPAY_SCHEME) || str.startsWith("alipayqr:") || str.startsWith("alipay:")) {
            BrowserUtil.a(this.TAG, "doFilter", "url_filter_alipay", str, null);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            if (context != null) {
                try {
                    context.startActivity(intent);
                } catch (ActivityNotFoundException unused2) {
                }
            }
            return true;
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if ("gamecenter".equalsIgnoreCase(scheme)) {
            BrowserUtil.a(this.TAG, "doFilter", "url_filter_gamecenter", str, null);
            String queryParameter = parse.getQueryParameter("package_name");
            Intent intent2 = new Intent("android.intent.action.VIEW", parse);
            intent2.setFlags(268435456);
            if (!TextUtils.isEmpty(queryParameter)) {
                intent2.setPackage(queryParameter);
            }
            try {
                context.startActivity(intent2);
            } catch (ActivityNotFoundException unused3) {
                Toast.makeText(context, R.string.browser_gamecenter_callback_error_msg, 0).show();
            }
            Message obtain = Message.obtain();
            obtain.what = 1105;
            this.mHandler.sendMessage(obtain);
            return true;
        } else if (!TextUtils.isEmpty(scheme) && scheme.trim().matches("btaobao")) {
            String queryParameter2 = parse.getQueryParameter("client_id");
            if (!TextUtils.isEmpty(queryParameter2)) {
                BrowserUtil.a(this.TAG, "doFilter", "url_filter_btaobao", str, null);
                String queryParameter3 = parse.getQueryParameter("package_name");
                Uri.Builder builder = new Uri.Builder();
                builder.scheme(scheme + queryParameter2);
                builder.authority(parse.getAuthority());
                builder.path(parse.getPath());
                builder.query(parse.getQuery());
                builder.fragment(parse.getFragment());
                Intent intent3 = new Intent();
                intent3.setAction("android.intent.action.VIEW");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    intent3.setPackage(queryParameter3);
                }
                intent3.setData(builder.build());
                intent3.setFlags(268435456);
                try {
                    context.startActivity(intent3);
                } catch (ActivityNotFoundException unused4) {
                    Toast.makeText(context, R.string.browser_alimm_ad_callback_error_msg, 0).show();
                }
            }
            Message obtain2 = Message.obtain();
            obtain2.what = 1105;
            this.mHandler.sendMessage(obtain2);
            return true;
        } else {
            if (scheme != null && !"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme) && !"taobao".equalsIgnoreCase(scheme)) {
                d.a().b();
                if (d.a().a(str)) {
                    return true;
                }
                if (d.a().c() || d.a().b(str)) {
                    return Nav.from(context).allowEscape().toUri(Uri.parse(str));
                }
            }
            if (!a.commonConfig.y) {
                return this.mVideoFilter.videoFilter(context, str);
            }
            return false;
        }
    }
}
