package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.uikit.api.TBLiveBaseComponentView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class psb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static psb f32847a;
    private Map<Object, psd> b = new HashMap();

    static {
        kge.a(554897028);
    }

    public static psb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (psb) ipChange.ipc$dispatch("f094a3f", new Object[0]);
        }
        if (f32847a == null) {
            f32847a = new psb();
        }
        return f32847a;
    }

    public void a(Object obj, pry pryVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e945369d", new Object[]{this, obj, pryVar});
            return;
        }
        psd psdVar = this.b.get(obj);
        if (psdVar == null) {
            psdVar = new psd();
            this.b.put(obj, psdVar);
        }
        psdVar.a(pryVar);
    }

    public void b(Object obj, pry pryVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe2dfede", new Object[]{this, obj, pryVar});
            return;
        }
        psd psdVar = this.b.get(obj);
        if (psdVar == null) {
            return;
        }
        psdVar.b(pryVar);
    }

    public void a(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7de910", new Object[]{this, obj, new Boolean(z)});
            return;
        }
        psd psdVar = this.b.get(obj);
        if (psdVar == null) {
            return;
        }
        psdVar.a(z);
    }

    public void a(Object obj, TBLiveBaseComponentView tBLiveBaseComponentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d97acf52", new Object[]{this, obj, tBLiveBaseComponentView});
            return;
        }
        psd psdVar = this.b.get(obj);
        if (psdVar == null) {
            psdVar = new psd();
            this.b.put(obj, psdVar);
        }
        psdVar.a(tBLiveBaseComponentView);
    }

    public void b(Object obj, TBLiveBaseComponentView tBLiveBaseComponentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da494dd3", new Object[]{this, obj, tBLiveBaseComponentView});
            return;
        }
        psd psdVar = this.b.get(obj);
        if (psdVar == null) {
            return;
        }
        psdVar.b(tBLiveBaseComponentView);
    }
}
