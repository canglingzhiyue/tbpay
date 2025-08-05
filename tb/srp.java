package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageData;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.f;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.bootimage.linked.b;
import com.taobao.bootimage.linked.c;
import com.taobao.bootimage.linked.h;
import com.ut.device.UTDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class srp implements srq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, srs> f33870a = new HashMap();
    private int b = 1000;

    static {
        kge.a(-2037176957);
        kge.a(1911930312);
    }

    @Override // tb.srq
    public void a(int i, srs srsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("138e4097", new Object[]{this, new Integer(i), srsVar});
        } else {
            this.f33870a.put(Integer.valueOf(i), srsVar);
        }
    }

    @Override // tb.srq
    public boolean a(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a78e87f", new Object[]{this, jSONObject, new Integer(i)})).booleanValue();
        }
        if (jSONObject == null) {
            kej.a("2ARCH_Channel", "shouldShow: subSection null");
            return false;
        }
        JSONObject b = ssf.b(jSONObject);
        if (b == null) {
            kej.a("2ARCH_Channel", "shouldShow: splash null");
            return false;
        }
        BootImageInfo bootImageInfo = (BootImageInfo) JSON.parseObject(b.toJSONString(), BootImageInfo.class);
        if (bootImageInfo == null) {
            kej.a("2ARCH_Channel", "shouldShow: splashContentData null");
            return false;
        }
        LinkedSplashData a2 = a(jSONObject, bootImageInfo);
        if (a2 == null) {
            return false;
        }
        this.b = i;
        if (this.b == 1000) {
            h.b("").c(a2);
            return h.b("").d();
        }
        return h.b("").b(a2);
    }

    @Override // tb.srq
    public boolean a(b.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7b396a9b", new Object[]{this, aVar})).booleanValue() : h.b("").a(aVar);
    }

    @Override // tb.srq
    public void a(BootImageInfo bootImageInfo, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1729a26e", new Object[]{this, bootImageInfo, new Integer(i), new Integer(i2)});
            return;
        }
        kej.a("2ARCH_Channel", "notifyOnStart: " + bootImageInfo);
        srs srsVar = this.f33870a.get(100);
        if (srsVar == null) {
            kej.a("2ARCH_Channel", "notifyOnStart stateNotify null ");
        } else {
            srsVar.a(bootImageInfo, i, i2);
        }
    }

    @Override // tb.srq
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        kej.a("2ARCH_Channel", "notifyViewCreate: ");
        srs srsVar = this.f33870a.get(101);
        if (srsVar == null) {
            kej.a("2ARCH_Channel", "notifyViewCreate stateNotify null ");
        } else {
            srsVar.a(i);
        }
    }

    @Override // tb.srq
    public void b(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        kej.a("2ARCH_Channel", "notifyViewShown: ");
        c b = h.b("");
        if (this.b != 1000) {
            z = false;
        }
        b.a(z);
        srs srsVar = this.f33870a.get(102);
        if (srsVar == null) {
            kej.a("2ARCH_Channel", "notifyViewShown stateNotify null ");
        } else {
            srsVar.b(i);
        }
    }

    @Override // tb.srq
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        kej.a("2ARCH_Channel", "notifyAnimationStart: ");
        h.b("").e();
    }

    @Override // tb.srq
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        kej.a("2ARCH_Channel", "notifyAnimationEnd: ");
        h.b("").f();
    }

    @Override // tb.srq
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        kej.a("2ARCH_Channel", "notifyTerminate: ");
        h.b("").g();
        srs srsVar = this.f33870a.get(104);
        if (srsVar == null) {
            kej.a("2ARCH_Channel", "notifyTerminate stateNotify null ");
        } else {
            srsVar.c(i);
        }
    }

    @Override // tb.srq
    public void a(List<sru> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6e0ee3", new Object[]{this, list, str});
            return;
        }
        kej.a("2ARCH_Channel", "notifyDownload: " + str);
        if (list == null || list.isEmpty()) {
            return;
        }
        srt.a(list, str);
    }

    private LinkedSplashData a(JSONObject jSONObject, BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedSplashData) ipChange.ipc$dispatch("ade11470", new Object[]{this, jSONObject, bootImageInfo});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
        if (jSONObject2 == null) {
            return null;
        }
        String str = "topview_trace_" + SystemClock.uptimeMillis() + "_" + UTDevice.getUtdid(f.b());
        if (!TextUtils.isEmpty(bootImageInfo.itemId)) {
            str = str + "_" + bootImageInfo.itemId;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(bootImageInfo);
        BootImageData bootImageData = new BootImageData();
        bootImageData.result = arrayList;
        return new LinkedSplashData(jSONObject2, str, bootImageData);
    }
}
