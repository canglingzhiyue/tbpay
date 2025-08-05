package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.tao.util.TBSoundPlayer;
import java.util.HashMap;

/* loaded from: classes.dex */
public class gjf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2007403414);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            HashMap<Integer, String> configMap = TBSoundPlayer.getConfigMap();
            for (Integer num : configMap.keySet()) {
                TBSoundPlayer.getInstance().updateSound(num.intValue(), FestivalMgr.a().c(configMap.get(num)));
            }
        } catch (Throwable unused) {
        }
    }
}
