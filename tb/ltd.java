package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.PlayControllerConfig;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ltd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(734036895);
    }

    public List<b> a(List<b> list, PlayControllerConfig playControllerConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9e1b4256", new Object[]{this, list, playControllerConfig});
        }
        if (list == null) {
            ldf.d("ExposureRatioFilter", "无可用视频播控item");
            return null;
        }
        ldf.d("ExposureRatioFilter", "可用视频播控item：" + list.size());
        float playControlFocusAreaMinPercent = playControllerConfig.getPlayControlFocusAreaMinPercent();
        if (playControlFocusAreaMinPercent > 1.0f) {
            ldf.d("ExposureRatioFilter", "服务端配置最小曝光比例大于1，不播放视频。 serviceMinPercent:" + playControlFocusAreaMinPercent);
            return null;
        }
        List<b> a2 = a(list, 1.0f);
        if (!a2.isEmpty()) {
            ldf.d("ExposureRatioFilter", "存在100%曝光的视频播控item：" + a2.size());
            return a2;
        }
        List<b> a3 = a(list, playControlFocusAreaMinPercent);
        ldf.d("ExposureRatioFilter", "小于 100% 大于等于 " + playControlFocusAreaMinPercent + " 视频播控item：" + a3.size());
        return a3;
    }

    private List<b> a(List<b> list, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7ad249e0", new Object[]{this, list, new Float(f)});
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar : list) {
            if (bVar.b().a() >= f) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }
}
