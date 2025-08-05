package tb;

import android.content.Context;
import android.graphics.Typeface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.j;

/* loaded from: classes8.dex */
public class oef implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-582462237);
        kge.a(-1153914171);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.j
    public Typeface a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Typeface) ipChange.ipc$dispatch("53c5ec56", new Object[]{this, context}) : Typeface.createFromAsset(context.getAssets(), "uik_iconfont.ttf");
    }
}
