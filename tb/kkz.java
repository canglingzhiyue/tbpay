package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.downloader.sync.b;
import com.taobao.interact.publish.service.PublishService;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class kkz implements klb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Integer> f30135a = new HashMap();
    public Map<String, Integer> b = new HashMap();

    public kkz() {
        this.f30135a.put("taobaogame", 0);
        this.f30135a.put(PublishService.GROUP_NAME, 0);
        this.f30135a.put("lab", 0);
        this.f30135a.put("hotpatch", 20);
        this.f30135a.put("dexpatch", 20);
        this.f30135a.put("apkupdate", 20);
        this.f30135a.put("bundleupdate", 20);
        this.f30135a.put("lightapk", 19);
        this.f30135a.put("x86libsupdate", 20);
        this.f30135a.put("my3dZone", 0);
        this.f30135a.put("databord", 10);
        this.f30135a.put("windvane", 10);
        this.f30135a.put("taolib", 10);
        this.f30135a.put("trade", 20);
        this.f30135a.put("silence", 10);
        this.f30135a.put("silence-buchang", 10);
        this.f30135a.put("remoteso", 20);
        this.f30135a.put("splitdownload", 20);
        this.b.put(d.IMG_BIE_TYPE, 40);
        this.b.put("TBSubscribe", 40);
        this.b.put("libartc_engine", 40);
        this.b.put("ali_cart.so", 40);
        this.b.put("taobao_wangxin", 35);
        this.b.put("messagesdkwrapper", 35);
        this.b.put("libkernelu4_7z_uc.so", 35);
        this.b.put("triver_taobao", 30);
        this.b.put("libMNN.so", 25);
        this.b.put("libMNN_CL.so", 25);
        this.b.put("libMNN_Express.so", 25);
        this.b.put("libMNNOpenCV.so", 25);
        this.b.put("libmnnkitcore.so", 25);
        this.b.put("libAliNNPython.so", 25);
        this.b.put("libwalle_base.so", 25);
        this.b.put("libmnnpybridge.so", 25);
        this.b.put("libmnnface.so", 25);
    }

    @Override // tb.klb
    public int a(kmq kmqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f15fd91c", new Object[]{this, kmqVar})).intValue();
        }
        if (kmqVar == null || TextUtils.isEmpty(kmqVar.f30169a)) {
            throw new RuntimeException("request's bizId is Needed");
        }
        return a(kmqVar.f30169a);
    }

    @Override // tb.klb
    public int a(List<kmo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c705294c", new Object[]{this, list})).intValue();
        }
        if (list != null && list.size() != 0) {
            try {
                for (kmo kmoVar : list) {
                    for (String str : this.b.keySet()) {
                        if (kmoVar.f30167a.contains(str)) {
                            return this.b.get(str).intValue();
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return 20;
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        Integer num = this.f30135a.get(str);
        if (num == null) {
            OrangeConfig orangeConfig = OrangeConfig.getInstance();
            String config = orangeConfig.getConfig(b.GROUP, "BIZ_" + str, "");
            if (!TextUtils.isEmpty(config) && TextUtils.isDigitsOnly(config)) {
                num = Integer.valueOf(config);
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 10;
    }
}
