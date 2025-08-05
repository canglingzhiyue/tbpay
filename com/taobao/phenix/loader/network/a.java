package com.taobao.phenix.loader.network;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.loader.network.b;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.Future;
import tb.ado;
import tb.kge;
import tb.njf;

/* loaded from: classes7.dex */
public class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f18934a = 15000;
    private int b = 10000;

    static {
        kge.a(913280555);
        kge.a(-1986678964);
    }

    @Override // com.taobao.phenix.loader.network.b
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f18934a = i;
        }
    }

    @Override // com.taobao.phenix.loader.network.b
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    @Override // com.taobao.phenix.loader.network.b
    public Future<?> a(String str, Map<String, String> map, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("a90ab1ca", new Object[]{this, str, map, aVar});
        }
        try {
            if (!TextUtils.isEmpty(str) && str.startsWith(ado.URL_SEPARATOR)) {
                str = "http:" + str;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(this.f18934a);
            httpURLConnection.setReadTimeout(this.b);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                aVar.a(new njf(httpURLConnection.getInputStream(), httpURLConnection.getContentLength()));
                return null;
            }
            aVar.a(new HttpCodeResponseException(responseCode));
            return null;
        } catch (Exception e) {
            aVar.a(e);
            return null;
        }
    }
}
