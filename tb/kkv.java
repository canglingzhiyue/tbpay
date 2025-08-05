package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.sync.SyncItem;
import com.taobao.downloader.sync.b;
import com.taobao.orange.OrangeConfig;
import java.util.List;

/* loaded from: classes7.dex */
public class kkv implements klc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.klc
    public kmm a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmm) ipChange.ipc$dispatch("7c719829", new Object[]{this, str});
        }
        List<SyncItem> c = b.a().c();
        if (c != null) {
            for (SyncItem syncItem : c) {
                if (str.endsWith(syncItem.url)) {
                    return syncItem.convert();
                }
            }
        }
        return new kmm(str);
    }

    @Override // tb.klc
    public String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : OrangeConfig.getInstance().getConfig(b.GROUP, str, "");
    }
}
