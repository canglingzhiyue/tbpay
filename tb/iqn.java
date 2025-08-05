package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.interact.view.BootImageInteractBaseView;

/* loaded from: classes6.dex */
public class iqn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public BootImageInteractBaseView f29231a;
    public BootImageInfo b;
    public JSONObject c;
    public Context d;

    static {
        kge.a(-2026584276);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public BootImageInteractBaseView d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageInteractBaseView) ipChange.ipc$dispatch("26d0398f", new Object[]{this});
        }
        return null;
    }

    public void a(Context context, BootImageInfo bootImageInfo, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff7d91a", new Object[]{this, context, bootImageInfo, jSONObject});
            return;
        }
        this.d = context;
        this.b = bootImageInfo;
        this.c = jSONObject;
    }
}
