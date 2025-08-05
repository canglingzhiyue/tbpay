package com.taobao.oversea.baobao.view;

import android.content.Context;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.oversea.baobao.c;
import com.taobao.oversea.baobao.d;
import com.taobao.tao.util.StringUtil;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXVContainer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class WXProgress extends WXVContainer<FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_TYPE = "tmgbaobaoprogress";
    private BaobaoProgress mRootView;

    public static /* synthetic */ Object ipc$super(WXProgress wXProgress, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.destroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ BaobaoProgress access$000(WXProgress wXProgress) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaobaoProgress) ipChange.ipc$dispatch("253e54dc", new Object[]{wXProgress}) : wXProgress.mRootView;
    }

    public WXProgress(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    /* renamed from: initComponentHostView  reason: collision with other method in class */
    public FrameLayout mo1592initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("2b290a72", new Object[]{this, context});
        }
        this.mRootView = BaobaoProgress.build(context);
        d.a().a(WXProgress.class.getName(), this.mRootView);
        try {
            if (this.mRootView != null) {
                String valueOf = String.valueOf(getAttrs().get("data"));
                if (!StringUtil.isEmpty(valueOf)) {
                    this.mRootView.init((Map) JSON.parseObject(valueOf, new TypeReference<HashMap<String, String>>() { // from class: com.taobao.oversea.baobao.view.WXProgress.1
                    }, new Feature[0]));
                }
            }
        } catch (Exception e) {
            String str = "updateAttrs" + e.toString();
        }
        return this.mRootView;
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        d.a().a(WXProgress.class.getName());
    }

    @WXComponentProp(name = "data")
    public void setData(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cd3172", new Object[]{this, map});
        } else if (this.mRootView == null) {
        } else {
            c.a().a(new Runnable() { // from class: com.taobao.oversea.baobao.view.WXProgress.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WXProgress.access$000(WXProgress.this).update(map);
                    }
                }
            });
        }
    }
}
