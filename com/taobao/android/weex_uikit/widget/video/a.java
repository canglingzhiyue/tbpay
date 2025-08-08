package com.taobao.android.weex_uikit.widget.video;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.video.f;
import tb.kge;

/* loaded from: classes6.dex */
public class a implements p.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final UINode f16237a;
    private final f.a b;

    static {
        kge.a(-1070222985);
        kge.a(1810451999);
    }

    public a(UINode uINode, f.a aVar) {
        this.f16237a = uINode;
        this.b = aVar;
    }

    @Override // com.taobao.android.weex_framework.p.b
    public void onNativeStateChange(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63f0e06", new Object[]{this, str, str2});
        } else if (StringUtils.equals(str, "visibility")) {
            if ("disappear".equals(str2)) {
                f.i(this.f16237a);
                if (this.b.f16244a) {
                    return;
                }
                f.a(this.f16237a, "pause", (JSONObject) null);
                this.b.f16244a = true;
                return;
            }
            UINode uINode = this.f16237a;
            f.a(uINode, uINode.getNativeState("videostatus"), this.b);
            f.a(this.f16237a, str2);
        } else if (f.j(this.f16237a)) {
        } else {
            f.a(this.f16237a, str2, this.b);
        }
    }
}
