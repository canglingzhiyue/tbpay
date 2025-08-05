package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class lug extends lua implements ljz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1416926783);
        kge.a(154736898);
    }

    public lug(lud ludVar) {
        super(ludVar);
    }

    @Override // tb.ljz
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            e().a(view);
        }
    }

    @Override // tb.ljz
    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : e().k();
    }

    @Override // tb.ljz
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : e().d();
    }
}
