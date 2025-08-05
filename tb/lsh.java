package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.SplashInteractData;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.event.a;
import com.taobao.phenix.intf.event.e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class lsh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-264797699);
    }

    public void a(final SplashInteractData splashInteractData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a50bc84", new Object[]{this, splashInteractData});
            return;
        }
        List<String> b = b(splashInteractData);
        if (b == null || b.isEmpty()) {
            return;
        }
        ksp.a("TopViewDownloader", "preDownloadSplashImage()->  prefetch = " + b.toString());
        b.h().a("homepage-ads", b).a(new a<e>() { // from class: tb.lsh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(e eVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, eVar})).booleanValue() : a(eVar);
            }

            public boolean a(e eVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("fa9fe917", new Object[]{this, eVar})).booleanValue();
                }
                if (eVar != null && eVar.h != null && eVar.h.size() > 0) {
                    splashInteractData.hasBannerImg = false;
                    ldf.d("SplashManager", "splashManager", "downloadImg fail:" + eVar.getUrl());
                } else if (eVar != null && eVar.g != null) {
                    ksp.a("TopViewDownloader", "preDownloadSplashImage()->  fetch succ urls = " + eVar.g.toString());
                }
                return false;
            }
        }).a();
    }

    private List<String> b(SplashInteractData splashInteractData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b48b8562", new Object[]{this, splashInteractData});
        }
        if (splashInteractData == null || splashInteractData.banner == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JSONObject a2 = HomePageUtility.a(splashInteractData.banner, "item", "0", com.taobao.tao.infoflow.multitab.e.KEY_SMART_CONTENT);
        if (a2 == null) {
            return null;
        }
        String string = a2.getString("imageUrl");
        if (!TextUtils.isEmpty(string)) {
            arrayList.add(string);
        }
        String string2 = a2.getString("videoCoverUrl");
        if (!TextUtils.isEmpty(string2)) {
            arrayList.add(string2);
        }
        return arrayList;
    }
}
