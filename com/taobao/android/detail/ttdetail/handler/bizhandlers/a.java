package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.ShowLightOffMessage;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class a implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openLightOff";
    public static final String KEY_FRAME_COMPONENT_ID = "frameComponentId";
    public static final String KEY_OPEN_SOURCE = "openSource";
    public static final String KEY_TRIGGER_VIEW_RECT = "triggerViewRect";

    /* renamed from: a  reason: collision with root package name */
    private Context f10671a;

    static {
        kge.a(623753065);
        kge.a(1967244270);
    }

    public a(Context context) {
        this.f10671a = context;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10671a, new ShowLightOffMessage(a(runtimeAbilityParamArr), b(runtimeAbilityParamArr), c(runtimeAbilityParamArr)));
        return true;
    }

    private ShowLightOffMessage.Source a(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShowLightOffMessage.Source) ipChange.ipc$dispatch("88c5baa1", new Object[]{this, runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null) {
            return null;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if (KEY_OPEN_SOURCE.equals(runtimeAbilityParam.getKey())) {
                return (ShowLightOffMessage.Source) runtimeAbilityParam.getValue();
            }
        }
        return null;
    }

    private String b(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("daa744f3", new Object[]{this, runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null) {
            return null;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if (KEY_FRAME_COMPONENT_ID.equals(runtimeAbilityParam.getKey())) {
                return (String) runtimeAbilityParam.getValue();
            }
        }
        return null;
    }

    private Rect c(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("153508f5", new Object[]{this, runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null) {
            return null;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if (KEY_TRIGGER_VIEW_RECT.equals(runtimeAbilityParam.getKey())) {
                return (Rect) runtimeAbilityParam.getValue();
            }
        }
        return null;
    }
}
