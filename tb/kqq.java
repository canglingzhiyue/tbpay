package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public abstract class kqq implements pkf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1060428812);
        kge.a(-1829180491);
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        return null;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        return -1;
    }

    public Float a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("62a8d0b1", new Object[]{this}) : Float.valueOf(0.0f);
    }

    public Float b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("6f41c632", new Object[]{this}) : Float.valueOf(0.0f);
    }
}
