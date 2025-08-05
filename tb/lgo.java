package tb;

import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService;
import java.util.HashMap;

/* loaded from: classes.dex */
public class lgo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30577a;
    private lgp b;
    private final HashMap<String, lgp> c = new HashMap<>(4);
    private boolean d = false;

    static {
        kge.a(-232972378);
    }

    public lgo(ljs ljsVar) {
        this.f30577a = ljsVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        lgp lgpVar = this.b;
        if (lgpVar == null) {
            return;
        }
        lgpVar.b();
    }

    public void a(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c6cddef", new Object[]{this, str, intent});
            return;
        }
        String a2 = a(str);
        this.b = b(a2);
        lgp lgpVar = this.b;
        if (lgpVar == null) {
            ldf.d("OutLinkScheduler", "IOutLinkOperator == null,eventType is:" + a2);
            return;
        }
        if (lgpVar instanceof lgs) {
            ((lgs) lgpVar).f = this.d;
        }
        c();
        this.b.a(str, intent);
    }

    public lli b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lli) ipChange.ipc$dispatch("16b904b4", new Object[]{this});
        }
        lgp lgpVar = this.b;
        if (lgpVar == null) {
            ldf.d("OutLinkScheduler", "IOutLinkOperator == null");
            return null;
        }
        return lgpVar.a();
    }

    private String a(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            jSONObject = JSON.parseObject(str);
        } catch (Exception unused) {
            ldf.d("OutLinkScheduler", "解析外链参数出错");
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("jump_ani");
        if ("scrollToItem".equals(string)) {
            string = "scrollToItem";
        }
        if ("scrollToBFace".equals(string)) {
            string = "postPopEvent";
        }
        return string == null ? "jumpWithReq" : string;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        IMulticlassTabService iMulticlassTabService = (IMulticlassTabService) this.f30577a.a(IMulticlassTabService.class);
        if (iMulticlassTabService == null || !iMulticlassTabService.isShowTabContent()) {
            return;
        }
        iMulticlassTabService.hideTabContent();
    }

    private lgp b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lgp) ipChange.ipc$dispatch("7d1ea1fe", new Object[]{this, str});
        }
        if (this.c.get(str) == null) {
            lgp c = c(str);
            this.c.put(str, c);
            return c;
        }
        return this.c.get(str);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    private lgp c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lgp) ipChange.ipc$dispatch("7dcb4d9d", new Object[]{this, str});
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1813527062) {
            if (hashCode == -715846309 && str.equals("scrollToItem")) {
                c = 1;
            }
        } else if (str.equals("jumpWithReq")) {
            c = 0;
        }
        if (c == 0) {
            return new lgs(this.f30577a);
        }
        if (c == 1) {
            return new lgr(this.f30577a);
        }
        return null;
    }
}
