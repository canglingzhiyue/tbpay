package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.trade.event.d;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes7.dex */
public class kxg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1372112937);
    }

    public static void a(lbo lboVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f278c67f", new Object[]{lboVar});
            return;
        }
        kwz kwzVar = new kwz(lboVar);
        kyb kybVar = new kyb(lboVar);
        kxd a2 = kxd.a();
        kyg kygVar = new kyg(lboVar);
        kxm kxmVar = new kxm(lboVar);
        kxh kxhVar = new kxh(lboVar);
        kxy kxyVar = new kxy(lboVar);
        kxu kxuVar = new kxu(lboVar);
        kxi kxiVar = new kxi(lboVar);
        kxj kxjVar = new kxj(lboVar);
        kxw kxwVar = new kxw(lboVar);
        sdj sdjVar = new sdj();
        d a3 = kxf.a();
        a3.a(TaobaoMediaPlayer.FFP_PROP_INT64_AUDIO_DISABLE, sdjVar);
        a3.a(TaobaoMediaPlayer.FFP_PROP_INT64_AUDIO_DISABLE, kxuVar);
        a3.a(TaobaoMediaPlayer.FFP_PROP_INT64_AUDIO_DISABLE, kybVar);
        a3.a(TaobaoMediaPlayer.FFP_PROP_INT64_AUDIO_DISABLE, kxwVar);
        a3.a(TaobaoMediaPlayer.FFP_PROP_INT64_AUDIO_DISABLE, kwzVar);
        a3.a(TaobaoMediaPlayer.FFP_PROP_INT64_AUDIO_DISABLE, kxiVar);
        a3.a(TaobaoMediaPlayer.FFP_PROP_INT64_AUDIO_DISABLE, kxhVar);
        a3.a(50015, kxmVar);
        a3.a(50042, a2);
        a3.a(50041, kygVar);
        a3.a(50017, kxyVar);
        a3.a(50020, kxwVar);
        a3.a(50018, kxwVar);
        a3.a(50019, kxyVar);
        a3.a(50034, kxwVar);
        a3.a(50035, kxwVar);
        a3.a(50043, kxjVar);
        a3.a(50044, kxjVar);
        a3.a(50033, kxwVar);
        e.e("HomePageSubscribeRunner", "注册 subscriber");
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        kxf.a().c();
        e.e("HomePageSubscribeRunner", "销毁 subscriber");
    }
}
