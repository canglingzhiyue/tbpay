package com.taobao.zcache.network;

import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.j;
import com.taobao.zcache.k;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import tb.kge;

/* loaded from: classes9.dex */
public class e extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HttpURLConnection b;

    static {
        kge.a(2062805980);
    }

    public e(k kVar) {
        try {
            this.b = (HttpURLConnection) new URL(kVar.a()).openConnection();
            if (kVar.b() > 0) {
                this.b.setConnectTimeout(kVar.b() * 1000);
            }
            this.b.setInstanceFollowRedirects(true);
            try {
                this.b.setRequestMethod("GET");
            } catch (ProtocolException unused) {
            }
            if (kVar.c() == null) {
                return;
            }
            for (Map.Entry<String, String> entry : kVar.c().entrySet()) {
                this.b.setRequestProperty(entry.getKey(), entry.getValue());
            }
        } catch (Exception e) {
            a(-3, e);
        }
    }

    @Override // com.taobao.zcache.j
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        try {
            return this.b.getResponseCode();
        } catch (IOException e) {
            a(-4, e);
            return 0;
        }
    }

    @Override // com.taobao.zcache.j
    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : this.b.getHeaderField(str);
    }

    @Override // com.taobao.zcache.j
    public Map<String, List<String>> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.b.getHeaderFields();
    }

    @Override // com.taobao.zcache.j
    public InputStream d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("a0504a6e", new Object[]{this});
        }
        try {
            InputStream inputStream = this.b.getInputStream();
            if (!StringUtils.equals("gzip", a(HttpConstant.CONTENT_ENCODING))) {
                return inputStream;
            }
            try {
                return new GZIPInputStream(inputStream);
            } catch (IOException e) {
                a(-6, e);
                return null;
            }
        } catch (IOException e2) {
            a(-5, e2);
            return null;
        }
    }

    @Override // com.taobao.zcache.j
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.b.disconnect();
        }
    }
}
