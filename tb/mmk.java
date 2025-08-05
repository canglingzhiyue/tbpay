package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.tao.log.TLog;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class mmk extends mmc<mkv, mkw> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(mmk mmkVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public mmk(MetricContext metricContext, mly mlyVar, mkv mkvVar) {
        super(metricContext, mlyVar, mkvVar);
    }

    @Override // tb.mmc
    public int[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a821217c", new Object[]{this}) : new int[]{1};
    }

    @Override // tb.mmc
    public void a(mkw mkwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b0159f", new Object[]{this, mkwVar});
        } else {
            a(mkwVar.b(), mkwVar.a());
        }
    }

    private void a(List<mku> list, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a0788b", new Object[]{this, list, new Long(j)});
            return;
        }
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "ALIVE_OBJECTS");
            jSONObject.put("checkUpTime", j);
            JSONArray jSONArray = new JSONArray();
            for (mku mkuVar : list) {
                if (mkuVar.get() != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("object", mkuVar.c());
                    jSONObject2.put("tag", mkuVar.a());
                    jSONObject2.put("watchTime", uptimeMillis - mkuVar.b());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("detail", jSONArray);
            TLog.loge("MetricKit.LeakMetricProcessor", jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
