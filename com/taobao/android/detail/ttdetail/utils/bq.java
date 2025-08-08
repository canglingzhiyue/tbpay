package com.taobao.android.detail.ttdetail.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.runtime.RuntimeParam;
import tb.eyy;
import tb.kge;
import tb.soy;

/* loaded from: classes5.dex */
public class bq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2142246346);
    }

    public static RuntimeParam[] a(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuntimeParam[]) ipChange.ipc$dispatch("2f1490b5", new Object[]{runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null || runtimeAbilityParamArr.length == 0) {
            return null;
        }
        RuntimeParam[] runtimeParamArr = new RuntimeParam[runtimeAbilityParamArr.length];
        int length = runtimeAbilityParamArr.length;
        for (int i = 0; i < length; i++) {
            RuntimeAbilityParam runtimeAbilityParam = runtimeAbilityParamArr[i];
            runtimeParamArr[i] = new RuntimeParam(runtimeAbilityParam.getKey(), runtimeAbilityParam.getValue());
        }
        return runtimeParamArr;
    }

    public static com.taobao.android.detail.ttdetail.component.module.d a(RuntimeParam... runtimeParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.ttdetail.component.module.d) ipChange.ipc$dispatch("f88213c0", new Object[]{runtimeParamArr});
        }
        if (runtimeParamArr == null) {
            return null;
        }
        for (RuntimeParam runtimeParam : runtimeParamArr) {
            if ("ttTriggerComponent".equals(runtimeParam.getKey())) {
                Object value = runtimeParam.getValue();
                if (value instanceof com.taobao.android.detail.ttdetail.component.module.d) {
                    return (com.taobao.android.detail.ttdetail.component.module.d) value;
                }
            }
        }
        return null;
    }

    public static String a(com.taobao.android.detail.ttdetail.component.module.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b8c78cd", new Object[]{dVar});
        }
        String str = null;
        if (dVar == null) {
            return null;
        }
        if (dVar instanceof soy) {
            return com.taobao.android.detail.ttdetail.behavior.c.COMPONENT_NAME_NAVI_BAR;
        }
        if (dVar instanceof com.taobao.android.detail.ttdetail.component.module.u) {
            return com.taobao.android.detail.ttdetail.behavior.c.COMPONENT_NAME_GALLERY_CONTAINER;
        }
        eyy componentData = dVar.getComponentData();
        if (componentData == null) {
            return null;
        }
        String b = componentData.b();
        if ((dVar.getParentComponent() instanceof com.taobao.android.detail.ttdetail.component.module.i) && !StringUtils.isEmpty(b)) {
            str = "GalleryLightoff_" + b;
        }
        if (StringUtils.isEmpty(str)) {
            str = componentData.r();
        }
        return StringUtils.isEmpty(str) ? componentData.b() : str;
    }

    public static String b(com.taobao.android.detail.ttdetail.component.module.d dVar) {
        eyy componentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c5af74e", new Object[]{dVar});
        }
        if (dVar == null || (componentData = dVar.getComponentData()) == null) {
            return null;
        }
        String r = componentData.r();
        return StringUtils.isEmpty(r) ? componentData.b() : r;
    }
}
