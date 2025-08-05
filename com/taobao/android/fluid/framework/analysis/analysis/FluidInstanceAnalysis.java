package com.taobao.android.fluid.framework.analysis.analysis;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.f;
import com.taobao.android.fluid.core.FluidContext;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.pim;

/* loaded from: classes5.dex */
public class FluidInstanceAnalysis extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_APPEAR = "appear";
    public static final String KEY_APP_ENTER_BACKGROUND = "onAppEnterBackground";
    public static final String KEY_DISAPPEAR = "disappear";
    public static final String KEY_REFRESH = "refresh";
    public static final String KEY_SOURCE = "bizSource";
    public static final String KEY_TYPE = "bizType";
    public static final String KEY_USER_FIRST_FRAME_TIME = "userFirstFrameTime";

    /* loaded from: classes5.dex */
    public enum Stage {
        CREATE_SERVICE,
        PARSE_CONFIG,
        CREATE_CONTAINER,
        DETAIL_REQUEST,
        PRELOAD_DETAIL_REQUEST,
        PLAYER_CONTROL_REQUEST,
        PRELOAD_PLAYER_CONTROL_REQUEST,
        FIST_CARD
    }

    static {
        kge.a(-772313422);
    }

    @Override // com.taobao.android.fluid.framework.analysis.analysis.b
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "FluidInstance";
    }

    public FluidInstanceAnalysis(FluidContext fluidContext, f fVar) {
        super(fluidContext, fVar);
    }

    @Override // com.taobao.android.fluid.framework.analysis.analysis.b
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : pim.b();
    }

    @Override // com.taobao.android.fluid.framework.analysis.analysis.b
    public List<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (Stage stage : Stage.values()) {
            arrayList.add(stage.name());
        }
        return arrayList;
    }
}
