package com.taobao.bootimage.infochooser;

import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.bootimage.data.BootImageData;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.infochooser.b;
import java.util.List;
import java.util.Properties;
import tb.kek;
import tb.kge;

/* loaded from: classes6.dex */
public class e implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f16690a;
    private boolean b;

    static {
        kge.a(-2034694984);
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

    public e(boolean z) {
        this.b = z;
    }

    @Override // com.taobao.bootimage.infochooser.b
    public void a(b.a aVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efba1433", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            BootImageData f = BootImageDataMgr.a().f();
            if (f != null && f.result != null && f.result.size() > 0) {
                BootImageInfo a2 = a(f.result);
                if (a2 == null) {
                    i = 101;
                }
                aVar.a(a2, i, a2 != null ? ResultCode.MSG_SUCCESS : "没有找到合适的投放计划");
                return;
            }
            aVar.a(null, 102, "normal chooseInfo 投放计划列表为空");
        }
    }

    private BootImageInfo a(List<BootImageInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageInfo) ipChange.ipc$dispatch("c0f20dff", new Object[]{this, list});
        }
        if (list == null) {
            return null;
        }
        for (BootImageInfo bootImageInfo : list) {
            if (bootImageInfo.getFromType() == BootImageInfo.FromType.NORMAL && kek.a(bootImageInfo, this.f16690a, this.b)) {
                return bootImageInfo;
            }
        }
        return null;
    }
}
