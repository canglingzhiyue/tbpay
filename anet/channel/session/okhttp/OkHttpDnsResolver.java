package anet.channel.session.okhttp;

import anet.channel.strategy.HttpDnsAdapter;
import anet.channel.strategy.utils.Utils;
import anet.channel.util.ALog;
import com.android.okhttp.Dns;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class OkHttpDnsResolver implements Dns {
    private static final String TAG = "awcn.OkHttpDnsResolver";

    static {
        kge.a(-88964072);
        kge.a(434751436);
    }

    public List<InetAddress> lookup(String str) throws UnknownHostException {
        ALog.i(TAG, "dns_lookup_start", null, "host", str);
        ArrayList arrayList = new ArrayList();
        try {
        } catch (Exception e) {
            ALog.e(TAG, "dns_lookup_error.", null, e, new Object[0]);
        }
        if (!Utils.checkHostValidAndNotIp(str)) {
            arrayList.add(InetAddress.getByName(str));
            ALog.i(TAG, "dns_lookup_no_need", null, "host", str);
            return arrayList;
        }
        ArrayList<HttpDnsAdapter.HttpDnsOrigin> originsByHttpDnsNoWait = HttpDnsAdapter.getOriginsByHttpDnsNoWait(str);
        if (originsByHttpDnsNoWait != null && !originsByHttpDnsNoWait.isEmpty()) {
            for (HttpDnsAdapter.HttpDnsOrigin httpDnsOrigin : originsByHttpDnsNoWait) {
                arrayList.add(InetAddress.getByName(httpDnsOrigin.getOriginIP()));
            }
            ALog.i(TAG, "dns_lookup_success", null, "host", str, "address", arrayList);
            return arrayList;
        }
        List<InetAddress> asList = Arrays.asList(InetAddress.getAllByName(str));
        ALog.i(TAG, "dns_lookup_system", null, "host", str, "address", asList);
        return asList;
    }
}
