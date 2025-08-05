package tb;

import android.text.TextUtils;
import anet.channel.strategy.HttpDnsAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.sync.b;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes7.dex */
public class kkx implements kld {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Set<String> f30133a = new HashSet(4);

    public kkx() {
        String config = OrangeConfig.getInstance().getConfig(b.GROUP, "httpdns_hosts", "appdownload.alicdn.com");
        if (TextUtils.isEmpty(config)) {
            return;
        }
        List asList = Arrays.asList(config.split(","));
        this.f30133a.addAll(asList);
        HttpDnsAdapter.setHosts(new ArrayList(asList));
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.f30133a.contains(str)) {
        } else {
            this.f30133a.add(str);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            HttpDnsAdapter.setHosts(arrayList);
        }
    }

    @Override // tb.kld
    public List<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        b(str);
        ArrayList<HttpDnsAdapter.HttpDnsOrigin> originsByHttpDns = HttpDnsAdapter.getOriginsByHttpDns(str);
        ArrayList arrayList = new ArrayList();
        if (originsByHttpDns != null) {
            for (HttpDnsAdapter.HttpDnsOrigin httpDnsOrigin : originsByHttpDns) {
                String originIP = httpDnsOrigin.getOriginIP();
                int originPort = httpDnsOrigin.getOriginPort();
                arrayList.add(originIP + ":" + originPort);
            }
        }
        return arrayList;
    }
}
