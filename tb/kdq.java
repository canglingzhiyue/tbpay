package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.bootimage.linked.h;
import java.util.List;
import tb.kdu;

/* loaded from: classes6.dex */
public class kdq implements kdu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String POP_VIEW = "popView";

    /* renamed from: a  reason: collision with root package name */
    private final List<LinkedSplashData> f29988a;
    private final Activity b;
    private final kds c;
    private final h d;

    static {
        kge.a(1134601756);
        kge.a(-130373671);
    }

    public kdq(kds kdsVar, Activity activity) {
        this.c = kdsVar;
        this.b = activity;
        this.f29988a = kdsVar.b();
        this.d = h.a(this.b.getLocalClassName());
    }

    private boolean a(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75806d92", new Object[]{this, bootImageInfo})).booleanValue();
        }
        kej.a("AdColdStartInfoChooser", "isLinkedSplashInfo, info.fromType = " + bootImageInfo.getFromType());
        return (bootImageInfo.getFromType() == BootImageInfo.FromType.COMMERCIALAD) || (bootImageInfo.getFromType() == BootImageInfo.FromType.NORMAL && bootImageInfo.hasPreLoad);
    }

    private kdt a(List<LinkedSplashData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kdt) ipChange.ipc$dispatch("fa5dd032", new Object[]{this, list});
        }
        for (int i = 0; i < list.size(); i++) {
            LinkedSplashData linkedSplashData = list.get(i);
            if (linkedSplashData == null) {
                kej.a("AdColdStartInfoChooser", "chooseInteractImageInfo, continue, linkedSplashData = null");
            } else {
                BootImageInfo a2 = a(linkedSplashData);
                if (a2 == null || !a2.coldStart) {
                    kej.a("AdColdStartInfoChooser", "chooseInteractImageInfo, continue, bootImageInfo = null");
                } else {
                    h.b(this.b.getLocalClassName()).c(linkedSplashData);
                    if (TextUtils.equals(linkedSplashData.getLinkedDataType(), "popView")) {
                        this.d.d().a();
                        if (!h.b(this.b.getLocalClassName()).d()) {
                            kej.a("AdColdStartInfoChooser", "chooseInteractImageInfo, continue, isShouldShow = false");
                        } else {
                            if (("commercialAdVideo".equals(a2.bizType) || "commercialAdNormal".equals(a2.bizType)) && !TextUtils.isEmpty(a2.animationType) && "1".equals(a2.animationType)) {
                                if (keo.a(tiq.BIZ_CODE, a2.animationLottie) == null) {
                                    ken.a(linkedSplashData, a2);
                                } else if ("commercialAdVideo".equals(a2.bizType) && keo.a(tiq.BIZ_CODE, a2.videoUrl) == null) {
                                    ken.b(linkedSplashData, a2);
                                }
                            }
                            if (TextUtils.isEmpty(a2.interactImage) && keo.a(tiq.BIZ_CODE, a2.interactImage) == null) {
                                kej.a("AdColdStartInfoChooser", "check interactImage local not exist.");
                            } else {
                                return new kdt(linkedSplashData, a2);
                            }
                        }
                    } else {
                        if (TextUtils.equals(linkedSplashData.getLinkedDataType(), "feeds") && ("commercialAdVideo".equals(a2.bizType) || "commercialAdNormal".equals(a2.bizType))) {
                            if (!kel.g()) {
                                kej.a("AdColdStartInfoChooser", "chooseInteractImageInfo, continue, isEnableLinkedTexiuAd = false");
                            } else if (!h.b(this.b.getLocalClassName()).d()) {
                                kej.a("AdColdStartInfoChooser", "chooseInteractImageInfo, continue, linked texiu, isShouldShow = false");
                            }
                        }
                        if (TextUtils.isEmpty(a2.interactImage)) {
                        }
                        return new kdt(linkedSplashData, a2);
                    }
                }
            }
        }
        kej.a("AdColdStartInfoChooser", "chooseInteractImageInfo, all splashDataList traversed, info = null");
        return null;
    }

    private BootImageInfo a(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageInfo) ipChange.ipc$dispatch("9bd0e456", new Object[]{this, linkedSplashData});
        }
        List<BootImageInfo> list = linkedSplashData.getData().result;
        if (list == null || list.isEmpty()) {
            kej.a("AdColdStartInfoChooser", "pickFirstAvailableInfo, result is empty");
            return null;
        }
        for (BootImageInfo bootImageInfo : list) {
            if (bootImageInfo == null) {
                kej.a("AdColdStartInfoChooser", "pickFirstAvailableInfo, info == null");
            } else if (!a(bootImageInfo)) {
                kej.a("AdColdStartInfoChooser", "pickFirstAvailableInfo, info fromType is wrong");
            } else {
                bootImageInfo.linkedType = linkedSplashData.getLinkedDataType();
                bootImageInfo.LinkedTraceId = linkedSplashData.getTraceId();
                if (!kek.a(bootImageInfo, this.b.getLocalClassName(), true, linkedSplashData.getTraceId())) {
                    kej.a("AdColdStartInfoChooser", "pickFirstAvailableInfo, checkBootInfoEnabled failed, info not available");
                } else if (System.currentTimeMillis() <= this.c.c(bootImageInfo.itemId)) {
                    kej.a("AdColdStartInfoChooser", "pickFirstAvailableInfo, isBootImageGlobalFatigue in period second");
                } else if (bootImageInfo.times == 0 || bootImageInfo.times - this.c.b(bootImageInfo.itemId) > 0) {
                    return bootImageInfo;
                } else {
                    kej.a("AdColdStartInfoChooser", "pickFirstAvailableInfo, info times limit");
                }
            }
        }
        return null;
    }

    public void a(kdu.a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425e783f", new Object[]{this, aVar});
            return;
        }
        kej.a("AdColdStartInfoChooser", "chooseInfo, start, listener = " + aVar);
        if (aVar == null) {
            return;
        }
        if (this.f29988a.size() > 0) {
            kej.a("AdColdStartInfoChooser", "splashManager.getDataList(), data.size = " + this.f29988a.size());
            kdt a2 = a(this.f29988a);
            if (a2 == null) {
                aVar.a(null, 102, "commercial chooseInfo 投放计划列表为空", this.b);
                return;
            }
            if (a2.f29996a == null || a2.b == null) {
                z = false;
            }
            if (!z) {
                i = 101;
            }
            aVar.a(a2, i, z ? ResultCode.MSG_SUCCESS : "没有找到合适的投放计划", this.b);
            return;
        }
        kej.a("AdColdStartInfoChooser", "splashManager.getDataList(), data.size = 0");
        aVar.a(null, 102, "commercial chooseInfo 投放计划列表为空", this.b);
    }
}
