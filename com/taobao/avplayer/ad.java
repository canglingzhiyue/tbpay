package com.taobao.avplayer;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.core.model.DWStabilityData;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.util.Map;
import tb.kge;
import tb.sku;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

/* loaded from: classes6.dex */
public class ad implements com.taobao.avplayer.common.ad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1822725281);
        kge.a(-1397291196);
    }

    public ad() {
        DimensionSet create = DimensionSet.create();
        create.addDimension("player_type");
        create.addDimension("videoUrl");
        create.addDimension(MonitorMediaPlayer.ABTEST_USE_CACHE_ENABLE);
        create.addDimension("hitCache");
        create.addDimension("completeHitCache");
        create.addDimension("usePlayManger");
        create.addDimension("videoDefinition");
        create.addDimension("useTBNet");
        create.addDimension("useHardwareHevc");
        create.addDimension("useHardwareAvc");
        create.addDimension("playToken");
        create.addDimension("interactId");
        create.addDimension(sku.KEY_VIDEO_SOURCE);
        create.addDimension(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID);
        create.addDimension("userId");
        create.addDimension("contentId");
        create.addDimension("page");
        MeasureSet create2 = MeasureSet.create();
        create2.addMeasure("first_frame_start");
        create2.addMeasure("first_frame_end");
        create2.addMeasure(TaoLiveVideoView.MornitorFirstFrameRender);
        AppMonitor.register("DWVideo", TaoLiveVideoView.MornitorFirstFrameRender, create2, create);
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWStabilityAdapter);
    }

    @Override // com.taobao.avplayer.common.ad
    public void a(Context context, String str, String str2, boolean z, DWStabilityData dWStabilityData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dce2b7f", new Object[]{this, context, str, str2, new Boolean(z), dWStabilityData});
        } else if (z) {
            if (dWStabilityData == null || TextUtils.isEmpty(dWStabilityData.args)) {
                AppMonitor.Alarm.commitSuccess(str, str2);
            } else {
                AppMonitor.Alarm.commitSuccess(str, str2, dWStabilityData.args);
            }
        } else {
            AppMonitor.Alarm.commitFail(str, str2, dWStabilityData.args, dWStabilityData.code, dWStabilityData.msg);
        }
    }

    @Override // com.taobao.avplayer.common.ad
    public void a(String str, String str2, Map<String, String> map, Map<String, Double> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37ab1dc", new Object[]{this, str, str2, map, map2});
        } else {
            AppMonitor.Stat.commit(str, str2, DimensionValueSet.fromStringMap(map), MeasureValueSet.create(map2));
        }
    }

    public static void a(Context context, String str, String str2, boolean z, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4fcbcf4", new Object[]{context, str, str2, new Boolean(z), str3, str4});
        } else if (z) {
            AppMonitor.Alarm.commitSuccess(str, str2);
        } else {
            AppMonitor.Alarm.commitFail(str, str2, null, str3, str4);
        }
    }
}
