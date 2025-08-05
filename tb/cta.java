package tb;

import android.util.SparseArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class cta {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<JSONObject> f26503a = new SparseArray<>();

    static {
        kge.a(-1341666150);
    }

    public final JSONObject a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d06d742f", new Object[]{this, num});
        }
        if (num != null && num.intValue() >= 0) {
            return this.f26503a.get(num.intValue());
        }
        return null;
    }

    public final void a(Integer num, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c5893c1", new Object[]{this, num, jSONObject});
        } else if (jSONObject == null || num == null || num.intValue() < 0) {
        } else {
            this.f26503a.put(num.intValue(), jSONObject);
        }
    }

    public final void b(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68e053ee", new Object[]{this, num});
        } else if (num == null || num.intValue() < 0) {
        } else {
            this.f26503a.remove(num.intValue());
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f26503a.clear();
        }
    }
}
