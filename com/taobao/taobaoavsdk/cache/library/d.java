package com.taobao.taobaoavsdk.cache.library;

import android.os.RemoteException;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anetwork.channel.aidl.Connection;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.net.HttpURLConnection;
import tb.kge;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Connection f21318a;
    private HttpURLConnection b;

    static {
        kge.a(1837362116);
    }

    private d() {
    }

    public d(Connection connection) {
        this.f21318a = connection;
    }

    public d(HttpURLConnection httpURLConnection) {
        this.b = httpURLConnection;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        try {
            if (this.f21318a != null && this.f21318a.getStatisticData() != null) {
                return this.f21318a.getStatisticData().sumNetStat() + ",netType=TBNet,xCache=" + a(HttpConstant.X_CACHE);
            } else if (this.b == null) {
                return "";
            } else {
                StringBuilder sb = new StringBuilder(128);
                sb.append(",host=");
                sb.append(this.b.getRequestProperty(HttpConstant.HOST));
                sb.append(",resultCode=");
                sb.append(this.b.getResponseCode());
                sb.append(",connType=");
                sb.append(this.b.getHeaderField("X-Android-Selected-Protocol"));
                sb.append(",recDataTime=");
                sb.append(Long.valueOf(this.b.getHeaderField("X-Android-Received-Millis")).longValue() - Long.valueOf(this.b.getHeaderField("X-Android-Sent-Millis")).longValue());
                sb.append(",totalSize=");
                sb.append(this.b.getContentLength());
                sb.append(",netType=");
                sb.append("SYSNet");
                sb.append(",xCache=");
                sb.append(this.b.getHeaderField(HttpConstant.X_CACHE));
                return sb.toString();
            }
        } catch (RemoteException e) {
            AVSDKLog.e("TBNetStatistic", "getStatisticData error:" + e.getMessage());
            return "";
        } catch (Exception e2) {
            AVSDKLog.e("TBNetStatistic", "getStatisticData error:" + e2.getMessage());
            return "";
        }
    }

    public m b() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("e208a7b", new Object[]{this});
        }
        Connection connection = this.f21318a;
        if (connection != null) {
            return new m(connection.getInputStream());
        }
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection == null) {
            return null;
        }
        return new m(httpURLConnection.getInputStream());
    }

    public int c() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        Connection connection = this.f21318a;
        if (connection != null) {
            return connection.getStatusCode();
        }
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection == null) {
            return 0;
        }
        return httpURLConnection.getResponseCode();
    }

    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(a(str));
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            if (this.f21318a != null) {
                return HttpHelper.getSingleHeaderFieldByKey(this.f21318a.getConnHeadFields(), str);
            }
            return this.b != null ? this.b.getHeaderField(str) : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public void d() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        Connection connection = this.f21318a;
        if (connection != null) {
            connection.cancel();
        }
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection == null) {
            return;
        }
        httpURLConnection.disconnect();
    }
}
