package com.taobao.bootimage.infochooser;

import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.infochooser.b;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.bootimage.linked.h;
import java.util.List;
import java.util.Properties;
import tb.kds;
import tb.kej;
import tb.kek;
import tb.kge;

/* loaded from: classes6.dex */
public class d implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CHOOSE_EMPTY_SOURCE = 102;
    public static final int CHOOSE_NON_SUITABLE = 101;
    public static final int CHOOSE_SUCCESS = 0;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f16689a;
    private final String b;
    private final h c;
    private final com.taobao.bootimage.linked.c d;
    private final kds e = new kds();
    private boolean f;

    static {
        kge.a(-1455245153);
        kge.a(973626783);
    }

    @Override // com.taobao.bootimage.infochooser.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // com.taobao.bootimage.infochooser.b
    public Properties c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Properties) ipChange.ipc$dispatch("ec83bba8", new Object[]{this});
        }
        return null;
    }

    public d(boolean z, String str, boolean z2) {
        this.f = z2;
        this.f16689a = z;
        this.b = str;
        this.c = h.a(this.b);
        this.d = h.b(this.b);
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.d.c();
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !this.c.c().isEmpty();
    }

    @Override // com.taobao.bootimage.infochooser.b
    public void a(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efba1433", new Object[]{this, aVar});
            return;
        }
        kej.a("BootImageLinkedSplashInfoChooser", "chooseInfo, start, listener = " + aVar);
        if (aVar == null) {
            return;
        }
        List<LinkedSplashData> c = this.c.c();
        if (c.size() > 0) {
            kej.a("BootImageLinkedSplashInfoChooser", "splashManager.getDataList(), data.size = " + c.size());
            BootImageInfo a2 = a(c);
            if (a2 == null) {
                aVar.a(null, 101, "没有找到合适的投放计划");
                kej.a("BootImageLinkedSplashInfoChooser", "info choose null");
                return;
            } else if (a2.getFromType().equals(BootImageInfo.FromType.COMMERCIALAD) && this.c.e().b()) {
                aVar.a(null, 101, "没有找到合适的投放计划");
                kej.a("BootImageLinkedSplashInfoChooser", "info choose isInAdLimit");
                return;
            } else {
                aVar.a(a2, 0, ResultCode.MSG_SUCCESS);
                return;
            }
        }
        kej.a("BootImageLinkedSplashInfoChooser", "splashManager.getDataList(), data.size = 0");
        aVar.a(null, 102, "commercial chooseInfo 投放计划列表为空");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.taobao.bootimage.data.BootImageInfo a(java.util.List<com.taobao.bootimage.linked.LinkedSplashData> r13) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.bootimage.infochooser.d.a(java.util.List):com.taobao.bootimage.data.BootImageInfo");
    }

    private BootImageInfo a(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageInfo) ipChange.ipc$dispatch("9bd0e456", new Object[]{this, linkedSplashData});
        }
        List<BootImageInfo> list = linkedSplashData.getData().result;
        if (list == null || list.isEmpty()) {
            kej.a("BootImageLinkedSplashInfoChooser", "pickFirstAvailableInfo, result is empty");
            return null;
        }
        for (BootImageInfo bootImageInfo : list) {
            if (bootImageInfo == null) {
                kej.a("BootImageLinkedSplashInfoChooser", "pickFirstAvailableInfo, info == null");
            } else if (!a(bootImageInfo)) {
                kej.a("BootImageLinkedSplashInfoChooser", "pickFirstAvailableInfo, info fromType is wrong");
            } else {
                bootImageInfo.linkedType = linkedSplashData.getLinkedDataType();
                bootImageInfo.LinkedTraceId = linkedSplashData.getTraceId();
                if (!kek.a(bootImageInfo, this.b, this.f16689a, linkedSplashData.getTraceId())) {
                    kej.a("BootImageLinkedSplashInfoChooser", "pickFirstAvailableInfo, checkBootInfoEnabled failed, info not available");
                } else if (bootImageInfo.times == 0 || bootImageInfo.times - this.e.b(bootImageInfo.itemId) > 0) {
                    return bootImageInfo;
                } else {
                    kej.a("BootImageLinkedSplashInfoChooser", "pickFirstAvailableInfo, info times limit");
                }
            }
        }
        return null;
    }

    private boolean a(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75806d92", new Object[]{this, bootImageInfo})).booleanValue();
        }
        kej.a("BootImageLinkedSplashInfoChooser", "isLinkedSplashInfo, info.fromType = " + bootImageInfo.getFromType());
        return (bootImageInfo.getFromType() == BootImageInfo.FromType.COMMERCIALAD) || (bootImageInfo.getFromType() == BootImageInfo.FromType.NORMAL && bootImageInfo.hasPreLoad);
    }
}
