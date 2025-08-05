package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.listener.a;
import java.util.Map;

/* loaded from: classes8.dex */
public class pkg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f32716a;
    public String b;
    public Object c;
    public pkf d;
    public a e;
    public Map<String, Object> f;
    private tna g;

    static {
        kge.a(575085555);
    }

    public pkg(Context context, String str, pkf pkfVar, a aVar, Map<String, Object> map) {
        this.f32716a = context;
        this.b = str;
        this.d = pkfVar;
        this.e = aVar;
        this.f = map;
        a(str);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Shop2F.toString())) {
            this.g = new tnb();
        } else {
            this.g = new tna();
        }
    }

    public tna a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tna) ipChange.ipc$dispatch("f0b08d7", new Object[]{this}) : this.g;
    }
}
