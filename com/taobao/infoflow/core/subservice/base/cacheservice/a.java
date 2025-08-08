package com.taobao.infoflow.core.subservice.base.cacheservice;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.ICacheService;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class a implements ICacheService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f17351a = new ArrayList();
    private String b;

    static {
        kge.a(837373570);
        kge.a(-1159052416);
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.ICacheService.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.b = str;
            this.f17351a.add(str);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.ICacheService.a
    public List<String> a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87fd354c", new Object[]{this, new Integer(i)});
        }
        if (i <= 0) {
            return null;
        }
        if (this.f17351a.size() > i) {
            int size = this.f17351a.size() - 1;
            return this.f17351a.subList(size - i, size);
        }
        return this.f17351a;
    }
}
