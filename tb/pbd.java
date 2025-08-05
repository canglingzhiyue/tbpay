package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.tao.Globals;
import java.net.URLDecoder;
import java.util.List;

/* loaded from: classes8.dex */
public class pbd implements cgo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1014185274);
        kge.a(-618158119);
    }

    @Override // tb.cgo
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            AlimamaAdvertising.instance().handleAdUrlForClickid(str);
        }
    }

    @Override // tb.cgo
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            AlimamaAdvertising.instance().buildIfsExposure(Globals.getApplication(), str).withArgPid(str2).withArgNamespace(str3).commit();
        }
    }

    @Override // tb.cgo
    public void a(String str, String str2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3a26d", new Object[]{this, str, str2, list});
        } else {
            AlimamaAdvertising.instance().handleAdUrlForClickid(str, str2, list);
        }
    }

    @Override // tb.cgo
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            AlimamaAdvertising.instance().buildInteractTracking(URLDecoder.decode(str)).withArgPid(str2).withNameSpace("TargetQzt").commit();
        }
    }
}
