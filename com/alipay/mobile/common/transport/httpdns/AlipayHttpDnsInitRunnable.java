package com.alipay.mobile.common.transport.httpdns;

import android.content.Context;
import com.alipay.android.msp.framework.dns.DnsValue;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.ReadSettingServerUrl;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URL;

/* loaded from: classes3.dex */
public final class AlipayHttpDnsInitRunnable implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f5577a;
    private int b;
    private boolean c;

    public AlipayHttpDnsInitRunnable(Context context, int i) {
        this.b = 0;
        this.c = true;
        this.f5577a = context;
        this.b = i;
    }

    public AlipayHttpDnsInitRunnable(Context context, int i, boolean z) {
        this.b = 0;
        this.c = true;
        this.f5577a = context;
        this.b = i;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            AlipayHttpDnsClient.dnsClientInit(this.f5577a, a(), this.b, this.c);
        }
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(20);
        if (MiscUtils.isInAlipayClient(this.f5577a)) {
            Context context = this.f5577a;
            if (context != null && MiscUtils.isRCVersion(context)) {
                sb.append("mygwrc.alipay.com,");
            }
            sb.append("mygw.alipay.com,");
            sb.append("alipay.up.django.t.taobao.com,");
            sb.append("alipay.dl.django.t.taobao.com,");
            sb.append("api.django.t.taobao.com,");
            sb.append("oalipay-dl-django.alicdn.com,");
            sb.append("mobilepmgw.alipay.com,");
            sb.append("mcgw.alipay.com,");
            sb.append("img01.taobaocdn.com,");
        }
        try {
            String host = new URL(ReadSettingServerUrl.getInstance().getGWFURL(this.f5577a)).getHost();
            if (!DnsValue.DOMAIN_MOBILE_GW.equals(host)) {
                sb.append(host);
                sb.append(",");
            }
        } catch (Exception e) {
            LogCatUtil.warn("AlipayHttpDnsInitRunnable", "equals gwHost  exception : " + e.toString());
        }
        sb.append("mobilegw.alipay.com,");
        sb.append("bkmobilegw.mybank.cn,");
        sb.append("t.alipayobjects.com,");
        sb.append("tfs.alipayobjects.com,");
        sb.append("i.alipayobjects.com,");
        sb.append("pic.alipayobjects.com,");
        sb.append("mdgw.alipay.com,");
        sb.append("mugw.alipay.com,");
        sb.append("os.alipayobjects.com,");
        sb.append("mygwshort.alipay.com,");
        sb.append("zos.alipayobjects.com,");
        sb.append("dl-sh.django.t.taobao.com,");
        sb.append("amdc.alipay.com,");
        sb.append("dl.django.t.taobao.com,");
        sb.append("render.alipay.com,");
        sb.append("api-mayi.django.t.taobao.com,");
        sb.append("up-mayi.django.t.taobao.com,");
        sb.append("gw.alicdn.com,");
        sb.append("gw.alipayobjects.com,");
        sb.append("mdap.alipaylog.com,");
        return sb.toString();
    }
}
