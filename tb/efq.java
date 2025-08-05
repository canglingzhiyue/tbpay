package tb;

import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class efq extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f27283a;
    public String b;
    public String c;
    public JSONArray d;

    static {
        kge.a(-1229349803);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public efq() {
        emu.a("com.taobao.android.detail.core.event.title.TitleLongClickEvent");
    }
}
