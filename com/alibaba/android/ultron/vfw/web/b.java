package com.alibaba.android.ultron.vfw.web;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Map;
import tb.bny;
import tb.kge;
import tb.rgw;

/* loaded from: classes2.dex */
public class b implements rgw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IDMComponent f2747a;
    private bny b;

    static {
        kge.a(-998439256);
        kge.a(1917561508);
    }

    public b(bny bnyVar) {
        this.b = bnyVar;
    }

    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
        } else {
            this.f2747a = iDMComponent;
        }
    }

    @Override // tb.rgw
    public void a(Map<String, Object> map, com.taobao.vessel.base.a aVar) {
        a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab6dfe3", new Object[]{this, map, aVar});
        } else if (this.b == null || map == null) {
        } else {
            Object obj = map.get("method");
            if (!(obj instanceof String) || (a2 = this.b.a((String) obj)) == null) {
                return;
            }
            a2.a(map, aVar, this.f2747a);
        }
    }
}
