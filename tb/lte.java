package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.PlayControllerConfig;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.b;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.strategy.protocol.PlayControlStrategy;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.strategy.protocol.a;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class lte {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, a> f30913a = new HashMap<>();

    static {
        kge.a(-942016269);
    }

    public List<b> a(List<b> list, PlayControllerConfig playControllerConfig, com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7f38fa53", new Object[]{this, list, playControllerConfig, aVar});
        }
        if (list == null || list.isEmpty() || playControllerConfig == null) {
            return null;
        }
        String playControlFocusAreaType = playControllerConfig.getPlayControlFocusAreaType();
        ldf.d("VideoSequencer", "playControlStrategy : " + playControlFocusAreaType);
        a a2 = a(playControlFocusAreaType);
        if (a2 != null) {
            return a2.a(list, aVar);
        }
        ldf.d("VideoSequencer", "playControlStrategy 未找到对应策略实现 ： playControlStrategy ： " + playControlFocusAreaType);
        return null;
    }

    private a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("93a807dc", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        a aVar = this.f30913a.get(str);
        if (aVar != null) {
            return aVar;
        }
        a b = b(str);
        this.f30913a.put(str, b);
        return b;
    }

    private a b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e056315d", new Object[]{this, str});
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1108234311) {
            if (hashCode != -509845177) {
                if (hashCode == -490630287 && str.equals(PlayControlStrategy.PLAY_CONTROL_FOCUS_AREA_CENTER)) {
                    c = 1;
                }
            } else if (str.equals(PlayControlStrategy.PLAY_CONTROL_FOCUS_AREA_BOTTOM)) {
                c = 2;
            }
        } else if (str.equals(PlayControlStrategy.PLAY_CONTROL_FOCUS_AREA_TOP)) {
            c = 0;
        }
        if (c == 0) {
            return new lti();
        }
        if (c == 1) {
            return new lth();
        }
        if (c == 2) {
            return new ltg();
        }
        return null;
    }
}
