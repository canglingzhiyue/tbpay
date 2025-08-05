package com.taobao.avplayer.component.weex;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.core.component.DWComponent;
import com.taobao.avplayer.core.component.f;
import com.taobao.weex.WXSDKInstance;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends WXSDKInstance implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DWComponent f16480a;
    public DWContext b;
    private boolean v;
    private List<Object> w;

    static {
        kge.a(1672758181);
        kge.a(-222551246);
        kge.a(563934243);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -17468269) {
            super.onActivityDestroy();
            return null;
        } else if (hashCode != 94685804) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.e();
            return null;
        }
    }

    @Override // com.taobao.weex.WXSDKInstance
    public boolean P_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8dd3ef1a", new Object[]{this})).booleanValue() : this.v;
    }

    @Override // com.taobao.weex.WXSDKInstance
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        this.w.clear();
        this.v = true;
    }

    @Override // com.taobao.weex.WXSDKInstance, com.taobao.weex.l
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        super.onActivityDestroy();
        this.w.clear();
        this.v = true;
        this.f16480a = null;
        this.b = null;
    }
}
