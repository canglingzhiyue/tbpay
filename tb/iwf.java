package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.FeedsData;

/* loaded from: classes7.dex */
public class iwf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private tiq f29372a;

    static {
        kge.a(-1395938443);
    }

    public iwf(tiq tiqVar) {
        this.f29372a = tiqVar;
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (jSONObject == null) {
        } else {
            jSONObject.put("sectionBizCode", "home_splash_linked_texiu");
            JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
                jSONObject.put("ext", (Object) jSONObject2);
            }
            jSONObject2.put("isTopShowCard", "true");
        }
    }

    private boolean b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{this, jSONObject})).booleanValue();
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("item");
        return (jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject("0")) == null || (jSONObject3 = jSONObject2.getJSONObject("content")) == null || jSONObject3.getIntValue("isResumable") != 1) ? false : true;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        stv.a("FeedsManager", "start insertSeekTimeToData currentSeekTime=" + i);
        JSONObject c = this.f29372a.d().c();
        if (c == null || !b(c)) {
            return;
        }
        JSONObject jSONObject = c.getJSONObject("ext");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            c.put("ext", (Object) jSONObject);
        }
        jSONObject.put(FeedsData.KEY_VIDEO_CURRENT_POSITION, (Object) Integer.valueOf(i));
        stv.a("FeedsManager", "end insertSeekTimeToData currentSeekTime=" + i);
    }
}
