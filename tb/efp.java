package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.artc.api.AConstants;
import java.text.DateFormat;
import java.util.Date;

/* loaded from: classes4.dex */
public class efp extends eei<efw> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WW_TIP_KEY = "ww_tip_key";

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27282a;
    private int b;
    private int c;
    private env d;

    static {
        kge.a(1875590564);
    }

    public static /* synthetic */ Object ipc$super(efp efpVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.eei
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.event.subscriber.wangwang.ShowWangWangTipSubscriber";
    }

    @Override // tb.eei, com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event}) : a((efw) event);
    }

    public efp(DetailCoreActivity detailCoreActivity) {
        this.f27282a = detailCoreActivity;
    }

    public i a(efw efwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("4d854e4d", new Object[]{this, efwVar});
        }
        DetailCoreActivity detailCoreActivity = this.f27282a;
        if (detailCoreActivity == null || detailCoreActivity.y() == null || this.f27282a.y().t == null) {
            return i.FAILURE;
        }
        if (efwVar.f27288a != 0 || efwVar.b != 0) {
            this.b = efwVar.f27288a - 20;
            this.c = efwVar.b + AConstants.ArtcErrorIceCandidateGatheringTimeOut;
            if (this.b < 0) {
                this.b = 0;
            }
            if (this.c < 0) {
                this.c = 0;
            }
            this.d = efwVar.c;
            return i.SUCCESS;
        } else if (this.d == null) {
            return i.FAILURE;
        } else {
            String x = this.f27282a.y().t.x();
            String i = this.f27282a.y().t.i();
            if (!StringUtils.isEmpty(x) && !StringUtils.isEmpty(i) && a(i)) {
                this.f27282a.y().o.a(this.b, this.c, this.d, x);
            }
            return i.SUCCESS;
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        JSONObject parseObject = JSON.parseObject(ecn.a(this.f27282a, WW_TIP_KEY));
        String format = DateFormat.getDateInstance().format(new Date());
        JSONArray jSONArray = null;
        if (parseObject != null) {
            jSONArray = parseObject.getJSONArray(format);
            if (jSONArray != null) {
                if (jSONArray.contains(str)) {
                    z = false;
                } else {
                    jSONArray.add(str);
                }
            }
            parseObject.clear();
        } else {
            parseObject = new JSONObject();
        }
        if (jSONArray == null) {
            jSONArray = new JSONArray();
            jSONArray.add(str);
        }
        parseObject.put(format, (Object) jSONArray);
        ecn.a(this.f27282a, WW_TIP_KEY, parseObject.toJSONString());
        return z;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
