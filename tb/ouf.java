package tb;

import android.support.v7.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.b;

/* loaded from: classes8.dex */
public class ouf<T extends b> extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private oud f32426a;

    static {
        kge.a(-556935842);
    }

    public ouf(oud oudVar, boolean z, JSONObject jSONObject) {
        super(oudVar.a(z, jSONObject));
        this.f32426a = oudVar;
    }

    public void a(T t, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65520282", new Object[]{this, t, new Integer(i)});
            return;
        }
        oud oudVar = this.f32426a;
        if (oudVar == null) {
            return;
        }
        oudVar.a((oud) t, i);
    }
}
