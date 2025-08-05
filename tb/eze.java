package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.feature.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class eze extends ezg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HEADER_TYPE = "headerPic";
    public eyy g;
    public List<ezf> h;
    public List<ezd> i;
    public List<ezc> j;
    public eyy l;
    private List<lfn> n;

    static {
        kge.a(-943184440);
    }

    public static /* synthetic */ Object ipc$super(eze ezeVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public eze(JSONObject jSONObject, ezo ezoVar) {
        super(jSONObject, ezoVar);
        b(jSONObject, ezoVar);
    }

    private void b(JSONObject jSONObject, ezo ezoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6da0afd", new Object[]{this, jSONObject, ezoVar});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("dragEnd");
        if (jSONObject2 != null) {
            this.g = new eyy(jSONObject2, ezoVar);
        }
        JSONArray jSONArray = jSONObject.getJSONArray("locators");
        if (jSONArray != null) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                if (jSONObject3 != null) {
                    a(new ezf(jSONObject3));
                }
            }
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("groups");
        if (jSONArray2 != null) {
            int size2 = jSONArray2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                if (jSONObject4 != null) {
                    a(new ezd(jSONObject4, ezoVar));
                }
            }
        }
        JSONArray jSONArray3 = jSONObject.getJSONArray("smallWindow");
        if (jSONArray3 != null) {
            int size3 = jSONArray3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                JSONObject jSONObject5 = jSONArray3.getJSONObject(i3);
                if (jSONObject5 != null) {
                    String string = jSONObject5.getString("type");
                    JSONObject jSONObject6 = jSONObject5.getJSONObject("data");
                    if (jSONObject6 != null) {
                        if (TextUtils.equals("detailVideo", string)) {
                            a(new ezc(jSONObject6, ezoVar));
                        } else {
                            a(new lfn(jSONObject5, ezoVar));
                        }
                    }
                }
            }
            if (!q() && Boolean.TRUE.equals(a.mFeature.get(a.sEnableCompatibleSmallWindow))) {
                int size4 = jSONArray3.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    JSONObject jSONObject7 = jSONArray3.getJSONObject(i4);
                    if (jSONObject7 != null) {
                        a(new ezc(jSONObject7, ezoVar));
                    }
                }
            }
        }
        JSONObject jSONObject8 = jSONObject.getJSONObject("lightoffLayer");
        if (jSONObject8 != null) {
            this.l = new eyy(jSONObject8, ezoVar);
        }
        this.c = "native$headerPic";
    }

    private void a(ezd ezdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d40e29", new Object[]{this, ezdVar});
            return;
        }
        if (this.i == null) {
            this.i = new ArrayList();
        }
        this.i.add(ezdVar);
    }

    private void a(ezf ezfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d4f6e7", new Object[]{this, ezfVar});
            return;
        }
        if (this.h == null) {
            this.h = new ArrayList();
        }
        this.h.add(ezfVar);
    }

    public eyy h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyy) ipChange.ipc$dispatch("44dfe912", new Object[]{this}) : this.g;
    }

    public List<ezf> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9f84bbd7", new Object[]{this}) : this.h;
    }

    public List<ezd> j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("87269236", new Object[]{this}) : this.i;
    }

    private void a(lfn lfnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b0b024", new Object[]{this, lfnVar});
            return;
        }
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(lfnVar);
    }

    private void a(ezc ezcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d399ca", new Object[]{this, ezcVar});
            return;
        }
        if (this.j == null) {
            this.j = new ArrayList();
        }
        this.j.add(ezcVar);
    }

    private boolean q() {
        List<ezc> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        List<lfn> list2 = this.n;
        return (list2 != null && !list2.isEmpty()) || ((list = this.j) != null && !list.isEmpty());
    }

    public List<lfn> k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6ec86895", new Object[]{this}) : this.n;
    }

    public List<ezc> p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f4f19870", new Object[]{this}) : this.j;
    }

    public eyy l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyy) ipChange.ipc$dispatch("63a67e8e", new Object[]{this}) : this.l;
    }
}
