package tb;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.share.globalmodel.b;

/* loaded from: classes8.dex */
public abstract class oud<T extends b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1667302974);
    }

    public abstract View a(boolean z, JSONObject jSONObject);

    public abstract void a(T t, int i);

    public oud(Context context) {
    }

    public int a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{this, context})).intValue() : ((WindowManager) context.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getWidth();
    }
}
