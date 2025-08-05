package com.taobao.themis.kernel.metaInfo.manifest;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.FalcoLoadActionPageType;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-979998693);
    }

    public static final boolean a(AppManifest.Page isSwiper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbe5809a", new Object[]{isSwiper})).booleanValue();
        }
        q.d(isSwiper, "$this$isSwiper");
        if (q.a((Object) isSwiper.getPageType(), (Object) FalcoLoadActionPageType.SWIPER)) {
            List<String> children = isSwiper.getChildren();
            if (!(children == null || children.isEmpty())) {
                return true;
            }
        }
        return false;
    }

    public static final int b(AppManifest.Page getSwiperDefaultIndex) {
        int i;
        List<String> children;
        JSONObject groupConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("461508a8", new Object[]{getSwiperDefaultIndex})).intValue();
        }
        q.d(getSwiperDefaultIndex, "$this$getSwiperDefaultIndex");
        try {
            groupConfig = getSwiperDefaultIndex.getGroupConfig();
        } catch (Exception unused) {
        }
        if (groupConfig != null) {
            i = groupConfig.getIntValue("defaultIndex");
            children = getSwiperDefaultIndex.getChildren();
            if (children == null && i >= 0 && i < children.size()) {
                return i;
            }
            return 0;
        }
        i = 0;
        children = getSwiperDefaultIndex.getChildren();
        if (children == null) {
        }
        return 0;
    }
}
