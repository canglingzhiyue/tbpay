package tb;

import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.net.FaceDetectionNet;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public class ppj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String A;
    public long c;
    public String d;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int l;
    public int m;
    public int n;
    public int o;
    public Rect r;

    /* renamed from: a  reason: collision with root package name */
    public String f32799a = "0";
    public String b = "0";
    public CopyOnWriteArrayList<PointF> e = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<Float> k = new CopyOnWriteArrayList<>();
    public int z = 0;
    public float p = 1.0f;
    public float q = 1.0f;
    public boolean s = false;
    public boolean t = false;
    public long u = 10;
    public int v = -1;
    public int w = 0;
    public boolean x = false;
    public boolean y = false;

    static {
        kge.a(1422074735);
    }

    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("queryParams")) == null) {
        } else {
            this.f32799a = jSONObject2.getString("accountId");
            this.b = jSONObject2.getString("feedId");
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.x) {
        } else {
            this.x = true;
            HashMap hashMap = new HashMap();
            hashMap.put(sft.LIVE_ALGO_NUMBER, String.valueOf(this.f));
            hashMap.put(sft.LIVE_ALGO_SUCCESS_NUMBER, String.valueOf(this.h));
            hashMap.put(sft.LIVE_ALGO_FAILURE_NUMBER, String.valueOf(this.g));
            hashMap.put("live_algo_hasPeople_number", String.valueOf(this.i));
            hashMap.put("live_algo_farApart_number", String.valueOf(this.j));
            hashMap.put("live_algo_firstOpen_number", String.valueOf(this.v));
            hashMap.put("live_algo_zoom_change_number", String.valueOf(this.w));
            float a2 = ppk.a(this.k);
            hashMap.put("live_algo_figure_area_ratio_mean", String.valueOf(a2));
            hashMap.put("live_first_frame_rendered", String.valueOf(this.y));
            hashMap.put("live_algo_figure_area_ratio_sd", String.valueOf(ppk.a(this.k, a2)));
            float[] b = ppk.b(this.e);
            if (b != null) {
                hashMap.put("live_algo_figure_center_x", String.valueOf(b[0]));
                hashMap.put("live_algo_figure_center_y", String.valueOf(b[1]));
                hashMap.put("live_algo_figure_center_x_sd", String.valueOf(b[2]));
                hashMap.put("live_algo_figure_center_y_sd", String.valueOf(b[3]));
            }
            hashMap.put("accountId", this.f32799a);
            hashMap.put("feedId", this.b);
            hashMap.put("liveDuration", String.valueOf(System.currentTimeMillis() - this.c));
            if (!TextUtils.isEmpty(this.A)) {
                hashMap.put("errorCode", this.A);
            }
            if (jqm.a()) {
                ldf.d(FaceDetectionNet.BIZ_NAME, "utdata: " + JSON.toJSONString(hashMap));
            }
            sft.a(sft.LIVE_ALGO_STATISTICS, (String) null, hashMap);
        }
    }
}
