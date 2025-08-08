package com.alibaba.security.realidentity.ui.webview.adapter;

import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.realidentity.c4;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.InetAddress;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class DnsHelper extends AsyncTask<String, Void, Map<String, Boolean>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DnsHelper";
    public final DnsWatcher mDnsWatcher;
    public final c4 mTrackLog;
    public final String mVerifyToken;

    /* loaded from: classes3.dex */
    public interface DnsWatcher {
        void onDnsResolved(Map<String, Boolean> map);
    }

    public DnsHelper(DnsWatcher dnsWatcher, c4 c4Var, String str) {
        this.mDnsWatcher = dnsWatcher;
        this.mTrackLog = c4Var;
        this.mVerifyToken = str;
    }

    private void collectLog(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4919566e", new Object[]{this, trackLog});
        } else {
            this.mTrackLog.a(this.mVerifyToken, trackLog);
        }
    }

    public static /* synthetic */ Object ipc$super(DnsHelper dnsHelper, String str, Object... objArr) {
        if (str.hashCode() == -1325021319) {
            super.onPostExecute((DnsHelper) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public Map<String, Boolean> getIpAddress(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fcbec99d", new Object[]{this, str});
        }
        try {
            if (!StringUtils.isEmpty(str)) {
                String host = URI.create(str).getHost();
                if (!StringUtils.isEmpty(host)) {
                    InetAddress[] allByName = InetAddress.getAllByName(host);
                    HashMap hashMap = new HashMap();
                    for (InetAddress inetAddress : allByName) {
                        hashMap.put(inetAddress.getHostAddress(), Boolean.valueOf(inetAddress.isReachable(100)));
                    }
                    return hashMap;
                }
            }
            return null;
        } catch (Throwable th) {
            collectLog(TrackLog.createSimpleSdk(TAG, "getIpAddress", th.getMessage()));
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public Map<String, Boolean> doInBackground(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b323cf", new Object[]{this, strArr});
        }
        if (strArr != null && strArr.length > 0) {
            return getIpAddress(strArr[0]);
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Map<String, Boolean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c677108", new Object[]{this, map});
            return;
        }
        super.onPostExecute((DnsHelper) map);
        this.mDnsWatcher.onDnsResolved(map);
    }
}
