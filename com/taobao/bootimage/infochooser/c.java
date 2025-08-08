package com.taobao.bootimage.infochooser;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.data.SplashInteractData;
import com.taobao.bootimage.infochooser.b;
import java.util.List;
import java.util.Properties;
import tb.kej;
import tb.kek;
import tb.kem;
import tb.keo;
import tb.kes;
import tb.kge;

/* loaded from: classes6.dex */
public class c implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f16688a;
    private boolean b;
    private SplashInteractData c;

    static {
        kge.a(-1313531369);
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

    public c(boolean z, String str) {
        this.b = z;
        this.f16688a = str;
        this.c = kes.a().a(this.f16688a);
    }

    @Override // com.taobao.bootimage.infochooser.b
    public void a(b.a aVar) {
        SplashInteractData splashInteractData;
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efba1433", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.c = kes.a().a(this.f16688a);
            if (keo.e() && (splashInteractData = this.c) != null && splashInteractData.data != null && this.c.hasBannerImg) {
                BootImageInfo a2 = a(this.c.data.result, this.c.traceId);
                StringBuilder sb = new StringBuilder();
                sb.append("BootImageInteractChooser has info:");
                if (a2 == null) {
                    z = false;
                }
                sb.append(z);
                kej.a(kem.TAG, sb.toString());
                if (a2 == null) {
                    i = 101;
                }
                aVar.a(a2, i, a2 != null ? ResultCode.MSG_SUCCESS : "没有找到合适的投放计划");
                return;
            }
            kej.a(kem.TAG, "BootImageInteractChooser chooseInfo is null");
            aVar.a(null, 102, "normal chooseInfo 投放计划列表为空");
        }
    }

    public SplashInteractData a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SplashInteractData) ipChange.ipc$dispatch("1e4bb78a", new Object[]{this}) : this.c;
    }

    private BootImageInfo a(List<BootImageInfo> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageInfo) ipChange.ipc$dispatch("c3292189", new Object[]{this, list, str});
        }
        if (list == null) {
            return null;
        }
        for (BootImageInfo bootImageInfo : list) {
            if (bootImageInfo.getFromType() == BootImageInfo.FromType.NORMAL && bootImageInfo.hasPreLoad && kek.a(bootImageInfo, this.f16688a, this.b, str)) {
                return bootImageInfo;
            }
        }
        return null;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (StringUtils.isEmpty(this.f16688a)) {
            return false;
        }
        return kes.a().c(this.f16688a);
    }
}
