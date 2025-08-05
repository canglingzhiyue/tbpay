package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;

/* loaded from: classes4.dex */
public class emy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private emz f27450a;
    private ena b;

    static {
        kge.a(782151933);
    }

    public emy(Context context) {
        this.f27450a = new emz(context);
        emu.a("com.taobao.android.detail.datasdk.engine.dataengine.DetailDataEngine");
    }

    public enh a(epb epbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (enh) ipChange.ipc$dispatch("71fe7006", new Object[]{this, epbVar}) : this.f27450a.a(epbVar);
    }

    public b a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("82f2e07e", new Object[]{this, str}) : this.f27450a.a(JSONObject.parseObject(str));
    }

    public b a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f6a6d5e8", new Object[]{this, jSONObject}) : this.f27450a.a(jSONObject);
    }

    public enh a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (enh) ipChange.ipc$dispatch("c3bf8045", new Object[]{this, bVar}) : this.f27450a.a(bVar);
    }

    public boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue() : ena.a(obj);
    }

    public static boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{jSONObject})).booleanValue() : ena.b(jSONObject);
    }

    public b a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("7f7d7d86", new Object[]{this, context, str});
        }
        if (this.b == null) {
            this.b = new ena(context);
        }
        return this.b.a(str);
    }

    public b a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("967d87e0", new Object[]{this, context, jSONObject});
        }
        if (this.b == null) {
            this.b = new ena(context);
        }
        return this.b.a(jSONObject);
    }

    public enh a(b bVar, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (enh) ipChange.ipc$dispatch("5386fac5", new Object[]{this, bVar, jSONObject, jSONObject2}) : this.b.a(bVar, jSONObject, jSONObject2);
    }

    public JSONObject c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45647e6", new Object[]{this, jSONObject});
        }
        ena enaVar = this.b;
        if (enaVar == null) {
            return null;
        }
        return enaVar.c(jSONObject);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        ena enaVar = this.b;
        if (enaVar == null) {
            return false;
        }
        return enaVar.a();
    }
}
