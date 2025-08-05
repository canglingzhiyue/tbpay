package com.taobao.android.dinamicx;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.bpp;

/* loaded from: classes.dex */
public class az extends com.taobao.android.dinamicx.monitor.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile UMLinkLogInterface f11819a;

    public static /* synthetic */ Object ipc$super(az azVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.f11819a == null) {
            this.f11819a = bpp.a();
        }
    }

    @Override // com.taobao.android.dinamicx.monitor.a
    public void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b0c1eb", new Object[]{this, str, str2, str3, str4, str5, map});
            return;
        }
        if (this.f11819a == null) {
            a();
        }
        if (this.f11819a == null) {
            return;
        }
        this.f11819a.commitSuccess(str, str2, str3, str4, str5, map);
    }

    @Override // com.taobao.android.dinamicx.monitor.a
    public void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3969d7f", new Object[]{this, str, str2, str3, str4, str5, map, str6, str7});
            return;
        }
        if (this.f11819a == null) {
            a();
        }
        if (this.f11819a == null) {
            return;
        }
        this.f11819a.commitFailure(str, str2, str3, str4, str5, map, str6, str7);
    }

    @Override // com.taobao.android.dinamicx.monitor.a
    public void a(String str, String str2, String str3, String str4, String str5, String str6, Map<String, Object> map, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("387a5004", new Object[]{this, str, str2, str3, str4, str5, str6, map, map2});
            return;
        }
        if (this.f11819a == null) {
            a();
        }
        if (this.f11819a == null) {
            return;
        }
        com.alibaba.android.umbrella.link.export.a aVar = null;
        if (map2 != null) {
            aVar = com.alibaba.android.umbrella.link.export.a.a(map2);
        }
        this.f11819a.logErrorRawDim(str, str2, str3, null, str5, str6, map, aVar);
    }
}
