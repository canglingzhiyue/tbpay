package tb;

import android.graphics.RectF;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class coj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static con f26354a;

    static {
        kge.a(-700055098);
        f26354a = new a();
    }

    public static cow a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cow) ipChange.ipc$dispatch("24aec99e", new Object[]{map});
        }
        con conVar = f26354a;
        if (conVar == null) {
            return null;
        }
        return conVar.a(map);
    }

    /* loaded from: classes3.dex */
    public static class a implements con {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2025235575);
            kge.a(1233051099);
        }

        private a() {
        }

        private RectF a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RectF) ipChange.ipc$dispatch("4e2d74f5", new Object[]{this, str});
            }
            if (StringUtils.isEmpty(str)) {
                return null;
            }
            String[] split = str.split(",");
            if (split.length != 4) {
                return null;
            }
            try {
                return new RectF(Float.parseFloat(split[0]), Float.parseFloat(split[2]), Float.parseFloat(split[1]), Float.parseFloat(split[3]));
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return null;
            }
        }

        private List<RectF> b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{this, str});
            }
            if (StringUtils.isEmpty(str)) {
                return null;
            }
            String[] split = str.split(";");
            ArrayList arrayList = new ArrayList();
            if (split.length == 0) {
                return null;
            }
            for (String str2 : split) {
                try {
                    String[] split2 = str2.split(",");
                    if (split2.length < 4) {
                        return null;
                    }
                    arrayList.add(new RectF(Float.parseFloat(split2[0]), Float.parseFloat(split2[2]), Float.parseFloat(split2[1]), Float.parseFloat(split2[3])));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    return null;
                }
            }
            return arrayList;
        }

        @Override // tb.con
        public cow a(Map<String, Object> map) {
            JSONObject jSONObject;
            List<RectF> b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cow) ipChange.ipc$dispatch("24aec99e", new Object[]{this, map});
            }
            JSONObject jSONObject2 = (JSONObject) map.get("pageInfo");
            if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("pltInfo")) == null) {
                return null;
            }
            cow cowVar = new cow();
            String string = jSONObject.getString("bboxes_str");
            String string2 = jSONObject.getString("region");
            if (!StringUtils.isEmpty(string) && (b = b(string)) != null && b.size() > 0) {
                cowVar.a(b);
                return cowVar;
            }
            RectF a2 = a(string2);
            if (a2 != null) {
                cowVar.a(a2);
            }
            return cowVar;
        }
    }
}
