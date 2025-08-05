package com.taobao.tao.recommend2.view.widget.weex;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXVContainer;
import java.util.Map;
import tb.kge;
import tb.ooa;

/* loaded from: classes8.dex */
public class NestedScrollViewWXContainer extends WXVContainer<AutoDispatchScrollView> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AutoDispatchScrollView container;

    static {
        kge.a(1048575075);
    }

    public static /* synthetic */ Object ipc$super(NestedScrollViewWXContainer nestedScrollViewWXContainer, String str, Object... objArr) {
        if (str.hashCode() == -87098777) {
            super.addChild((WXComponent) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public NestedScrollViewWXContainer(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    /* renamed from: initComponentHostView  reason: collision with other method in class */
    public AutoDispatchScrollView mo1592initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutoDispatchScrollView) ipChange.ipc$dispatch("cb67dde9", new Object[]{this, context});
        }
        ooa.a(AutoDispatchScrollView.TAG, "initComponentHostView");
        this.container = new AutoDispatchScrollView(context);
        return this.container;
    }

    @Override // com.taobao.weex.ui.component.WXVContainer
    public void addChild(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("facefa67", new Object[]{this, wXComponent});
            return;
        }
        ooa.a(AutoDispatchScrollView.TAG, "addChild");
        super.addChild(wXComponent);
        this.container.addView(wXComponent.mo1286getHostView());
    }

    @WXComponentProp(name = "showContent")
    public void setShowParam(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdea3410", new Object[]{this, map});
        } else if (map == null || map.get("show") == null) {
        } else {
            try {
                this.container.setShowParam(((Boolean) map.get("show")).booleanValue());
            } catch (Exception e) {
                ooa.a("Weex component param error.", e);
            }
        }
    }
}
