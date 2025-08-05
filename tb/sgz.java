package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.tao.homepage.d;
import com.taobao.tao.homepage.windvane.b;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public class sgz implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-495264072);
        kge.a(-1531379759);
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : Collections.singletonList("getCardPopInfo");
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{this, str, str2, wVCallBackContext})).booleanValue() : a(wVCallBackContext);
    }

    private boolean a(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca15efa9", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        laq c = laq.a().a("Bridge").b("getCardPopInfo").c("homepage.HomePageWVPlugin.getCardPopInfo");
        ope f = d.f(null);
        if (f == null) {
            wVCallBackContext.error("首页dataSource信息为空");
            c.c("首页dataSource信息为空").b();
            return false;
        }
        AwesomeGetContainerInnerData c2 = f.c(oqc.j().f30287a);
        if (c2 == null) {
            wVCallBackContext.error("首页子容器信息为null");
            c.c("首页子容器信息为null").b();
            return false;
        }
        return a(c2, wVCallBackContext, c);
    }

    private boolean a(AwesomeGetContainerInnerData awesomeGetContainerInnerData, WVCallBackContext wVCallBackContext, laq laqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b99df8f7", new Object[]{this, awesomeGetContainerInnerData, wVCallBackContext, laqVar})).booleanValue();
        }
        if (awesomeGetContainerInnerData == null) {
            wVCallBackContext.error("信息流的pop信息获取失败");
            laqVar.a("AwesomeGetContainerInnerData", "null").c("信息流的pop信息获取失败").b();
            return false;
        } else if (awesomeGetContainerInnerData.extSections == null || awesomeGetContainerInnerData.extSections.getJSONObject(PopStrategy.IDENTIFIER_POPLAYER) == null) {
            wVCallBackContext.error("信息流的pop信息获取失败");
            laqVar.a("extSections", "null").c("信息流的pop信息获取失败").b();
            return false;
        } else {
            JSONObject jSONObject = awesomeGetContainerInnerData.extSections.getJSONObject(PopStrategy.IDENTIFIER_POPLAYER);
            if (jSONObject == null) {
                wVCallBackContext.error("信息流的pop信息获取失败");
                laqVar.a("popSection", "null").c("信息流的pop信息获取失败").b();
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("item");
            if (jSONObject2 == null) {
                wVCallBackContext.error("信息流的pop信息获取失败");
                laqVar.a("item", "null").c("信息流的pop信息获取失败").b();
                return false;
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject(PopStrategy.IDENTIFIER_POPLAYER);
            r rVar = new r();
            rVar.a(PopStrategy.IDENTIFIER_POPLAYER, jSONObject3);
            wVCallBackContext.success(rVar);
            laqVar.c("信息流pop信息获取success").b();
            return true;
        }
    }
}
