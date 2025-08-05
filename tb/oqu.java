package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;

/* loaded from: classes8.dex */
public class oqu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DELTA_PASS_PARAMS = "deltaPassParams";
    public static final String IS_REPLACE_DELTA_PASS_PARAMS = "isReplaceDeltaPassParams";

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f32312a;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static oqu f32313a;

        static {
            kge.a(194260450);
            f32313a = new oqu();
        }

        public static /* synthetic */ oqu a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (oqu) ipChange.ipc$dispatch("f08d0ab", new Object[0]) : f32313a;
        }
    }

    static {
        kge.a(-1783726026);
    }

    public static oqu a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oqu) ipChange.ipc$dispatch("f08d0ab", new Object[0]) : a.a();
    }

    public void a(AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e236be4", new Object[]{this, awesomeGetContainerData});
            return;
        }
        JSONObject deltaExt = awesomeGetContainerData.getDeltaExt();
        if (deltaExt != null) {
            if (!"true".equals(deltaExt.getString(IS_REPLACE_DELTA_PASS_PARAMS))) {
                return;
            }
            this.f32312a = deltaExt.getJSONObject(DELTA_PASS_PARAMS);
            return;
        }
        JSONObject ext = awesomeGetContainerData.getExt();
        if (ext == null || !"true".equals(ext.getString(IS_REPLACE_DELTA_PASS_PARAMS))) {
            return;
        }
        this.f32312a = ext.getJSONObject(DELTA_PASS_PARAMS);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = this.f32312a;
        if (jSONObject2 == null) {
            return;
        }
        jSONObject.put(DELTA_PASS_PARAMS, (Object) jSONObject2);
        this.f32312a = null;
    }
}
