package com.taobao.avplayer.component.weex;

import android.graphics.Rect;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import java.util.LinkedList;
import java.util.List;
import tb.kcl;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static c f16481a;
    private List<WXInteractiveComponent> b = new LinkedList();

    static {
        kge.a(-744523057);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("8c496250", new Object[0]);
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_SplayerManager);
        if (f16481a == null) {
            f16481a = new c();
        }
        return f16481a;
    }

    public void a(WXInteractiveComponent wXInteractiveComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c13d8e67", new Object[]{this, wXInteractiveComponent});
        } else {
            this.b.add(wXInteractiveComponent);
        }
    }

    public void b(WXInteractiveComponent wXInteractiveComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f9e9246", new Object[]{this, wXInteractiveComponent});
            return;
        }
        wXInteractiveComponent.pause();
        this.b.remove(wXInteractiveComponent);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!StringUtils.isEmpty(str)) {
            WXInteractiveComponent wXInteractiveComponent = null;
            int b = kcl.b();
            int i2 = b;
            for (WXInteractiveComponent wXInteractiveComponent2 : this.b) {
                if (str.equals(wXInteractiveComponent2.mSplayerGroup)) {
                    if (wXInteractiveComponent2.mPriority > i) {
                        i = wXInteractiveComponent2.mPriority;
                        Rect componentSize = wXInteractiveComponent2.getComponentSize();
                        i2 = Math.abs((componentSize.top + componentSize.bottom) - b);
                        wXInteractiveComponent = wXInteractiveComponent2;
                    } else if (wXInteractiveComponent2.mPriority == i) {
                        Rect componentSize2 = wXInteractiveComponent2.getComponentSize();
                        int abs = Math.abs((componentSize2.top + componentSize2.bottom) - b);
                        if (abs < i2) {
                            wXInteractiveComponent = wXInteractiveComponent2;
                            i2 = abs;
                        }
                    }
                }
            }
            for (WXInteractiveComponent wXInteractiveComponent3 : this.b) {
                if (wXInteractiveComponent3 == wXInteractiveComponent) {
                    wXInteractiveComponent3.play();
                } else {
                    wXInteractiveComponent3.pause();
                }
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (WXInteractiveComponent wXInteractiveComponent : this.b) {
            wXInteractiveComponent.pause();
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!StringUtils.isEmpty(str)) {
            for (WXInteractiveComponent wXInteractiveComponent : this.b) {
                if (str.equals(wXInteractiveComponent.mSplayerGroup)) {
                    wXInteractiveComponent.pause();
                }
            }
        }
    }
}
