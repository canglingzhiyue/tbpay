package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.mtop.a;
import com.taobao.homepage.pop.protocol.model.pop.IPopConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.homepage.pop.utils.c;
import com.taobao.homepage.pop.utils.d;
import com.taobao.homepage.pop.utils.g;

/* loaded from: classes.dex */
public class kzw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lad f30428a;

    public kzw(lad ladVar) {
        this.f30428a = ladVar;
    }

    public void a(int i, String str, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad2eaabb", new Object[]{this, new Integer(i), str, iPopData});
        } else if (this.f30428a == null) {
        } else {
            String businessID = iPopData.getBusinessID();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(businessID, (Object) g.a(i, str, iPopData));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(PopConst.POP_BIZ_PARAMS_KEY, (Object) JSON.toJSONString(jSONObject));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("bizParam", (Object) jSONObject2);
            this.f30428a.a(iPopData.getPopConfig().getRequestType(), jSONObject3);
            d.a("PopViewReqSendSuccess", iPopData);
            c.a("AbsPopListener ", "send req to server. BusinessId:" + businessID);
        }
    }

    public void a(IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ae3ed8", new Object[]{this, iPopData});
        } else if (this.f30428a == null || iPopData == null) {
        } else {
            String scrollToSection = iPopData.getPopConfig().getScrollToSection();
            int i = -1;
            if (!StringUtils.isEmpty(scrollToSection)) {
                i = this.f30428a.a(scrollToSection);
            }
            if (i < 0) {
                c.a("AbsPopListener ", "scroll to position invalid, return");
            } else {
                this.f30428a.a(i, 0);
            }
        }
    }

    public boolean a(String str) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (this.f30428a != null && !StringUtils.isEmpty(str) && (a2 = this.f30428a.a(str)) >= 0) {
            return this.f30428a.c(a2);
        }
        return false;
    }

    public void b(IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539b55f7", new Object[]{this, iPopData});
        } else if (iPopData == null) {
            c.a("AbsPopListener ", "fatigueReport popData == null");
        } else {
            IPopConfig popConfig = iPopData.getPopConfig();
            if (popConfig == null) {
                c.a("AbsPopListener ", "fatigueReport popConfig == null");
            } else if (!"active".equals(popConfig.getFatigueReportStyle())) {
            } else {
                new a().a(iPopData);
            }
        }
    }
}
