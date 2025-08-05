package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import com.taobao.homepage.datasource.OnDataSourceUpdatedListener;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes7.dex */
public class kwy implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f30366a;
    public int b = -1;
    public int c = -1;
    public boolean d;
    public JSONObject g;
    public ope h;
    private OnDataSourceUpdatedListener.DataSourceType i;
    private boolean j;

    static {
        kge.a(-1459774360);
        kge.a(-1834561497);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue() : TaobaoMediaPlayer.FFP_PROP_INT64_AUDIO_DISABLE;
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public kwy(OnDataSourceUpdatedListener.DataSourceType dataSourceType, boolean z, String str) {
        this.i = dataSourceType;
        this.j = z;
        this.f30366a = str;
    }

    public OnDataSourceUpdatedListener.DataSourceType a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnDataSourceUpdatedListener.DataSourceType) ipChange.ipc$dispatch("95f90905", new Object[]{this}) : this.i;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.j;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f30366a;
    }
}
