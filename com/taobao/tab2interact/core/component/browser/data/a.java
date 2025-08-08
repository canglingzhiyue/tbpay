package com.taobao.tab2interact.core.component.browser.data;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.utils.b;
import com.taobao.tab2interact.core.utils.c;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private InterfaceC0820a f19743a;
    private int b;

    /* renamed from: com.taobao.tab2interact.core.component.browser.data.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0820a {
        void a(String str, long j);

        void a(String str, JSONObject jSONObject, BrowserBadgeModel browserBadgeModel, long j);
    }

    static {
        kge.a(-1757517454);
    }

    public static /* synthetic */ int a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("297b0e70", new Object[]{aVar})).intValue() : aVar.b;
    }

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e73419", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.b = i;
        return i;
    }

    public static /* synthetic */ void a(a aVar, String str, long j, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f57922", new Object[]{aVar, str, new Long(j), mtopResponse});
        } else {
            aVar.b(str, j, mtopResponse);
        }
    }

    public static /* synthetic */ void b(a aVar, String str, long j, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286e8b23", new Object[]{aVar, str, new Long(j), mtopResponse});
        } else {
            aVar.a(str, j, mtopResponse);
        }
    }

    public a(InterfaceC0820a interfaceC0820a) {
        this.f19743a = interfaceC0820a;
    }

    public void a(final String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa210a1c", new Object[]{this, str, new Long(j), str2});
        } else if (this.b >= 5) {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeDataRequester", "请求数据，达到最大请求数据失败次数");
        } else {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", (Object) str);
            jSONObject.put("duration", (Object) Long.valueOf(j));
            if (!StringUtils.isEmpty(str2)) {
                jSONObject.put("extParams", (Object) str2);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("entityId", (Object) "94269");
            jSONObject2.put("params", (Object) JSONObject.toJSONString(jSONObject));
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeDataRequester", "请求数据，data=" + JSONObject.toJSONString(jSONObject2));
            BrowserBadgeRequestParams browserBadgeRequestParams = new BrowserBadgeRequestParams();
            browserBadgeRequestParams.setData(jSONObject2);
            com.taobao.tab2interact.core.utils.c.INSTANCE.a(browserBadgeRequestParams, new c.a() { // from class: com.taobao.tab2interact.core.component.browser.data.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tab2interact.core.utils.c.a
                public void a(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                        return;
                    }
                    a.a(a.this, 0);
                    a.b(a.this, str, elapsedRealtime, mtopResponse);
                }

                @Override // com.taobao.tab2interact.core.utils.c.a
                public void b(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("743cc56e", new Object[]{this, mtopResponse});
                        return;
                    }
                    a aVar = a.this;
                    a.a(aVar, a.a(aVar) + 1);
                    a.a(a.this, str, elapsedRealtime, mtopResponse);
                }
            });
        }
    }

    private void a(String str, long j, MtopResponse mtopResponse) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1e17817", new Object[]{this, str, new Long(j), mtopResponse});
            return;
        }
        try {
            String str2 = new String(mtopResponse.getBytedata());
            JSONObject jSONObject2 = JSON.parseObject(str2).getJSONObject("data");
            if (jSONObject2 != null && (this.f19743a instanceof com.taobao.tab2interact.core.component.browser.a) && (jSONObject = jSONObject2.getJSONObject(c.KEY_OPTBALANCES)) != null) {
                JSONObject jSONObject3 = new JSONObject(1);
                jSONObject3.put(c.KEY_OPTBALANCES, (Object) jSONObject);
                ((com.taobao.tab2interact.core.component.browser.a) this.f19743a).e(jSONObject3);
            }
            c.a(jSONObject2);
            BrowserBadgeModel b = c.b(jSONObject2);
            if (c.a(b)) {
                com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeDataRequester", "数据请求成功，判断解析的数据有效，result=" + str2);
                b.a("BrowserRequestData", null);
                c.b(b);
                a(str, j, jSONObject2, b);
                return;
            }
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeDataRequester", "数据请求成功，判断解析的数据无效，result=" + str2);
            b.a("BrowserRequestData", "VerifyNotValid", "验证数据无效", "result=" + str2);
            b(str, j);
        } catch (Exception e) {
            com.taobao.tab2interact.core.utils.a.a(this, "BrowserBadgeDataRequester", "数据请求成功，处理返回结果异常", e);
            b.a("BrowserRequestData", "HandleSuccessException", "处理成功数据异常", null, e);
            b(str, j);
        }
    }

    private void b(String str, long j, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ece8f36", new Object[]{this, str, new Long(j), mtopResponse});
            return;
        }
        try {
            String str2 = new String(mtopResponse.getBytedata());
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeDataRequester", "数据请求失败，result=" + str2);
            b.a("BrowserRequestData", "RequestError", "数据请求失败", "result=" + str2);
            b(str, j);
        } catch (Exception e) {
            com.taobao.tab2interact.core.utils.a.a(this, "BrowserBadgeDataRequester", "数据请求失败，处理返回结果异常", e);
            b.a("BrowserRequestData", "HandleErrorException", "处理失败数据异常", null, e);
            b(str, j);
        }
    }

    private void a(String str, long j, JSONObject jSONObject, BrowserBadgeModel browserBadgeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("776c89a", new Object[]{this, str, new Long(j), jSONObject, browserBadgeModel});
            return;
        }
        InterfaceC0820a interfaceC0820a = this.f19743a;
        if (interfaceC0820a == null) {
            return;
        }
        interfaceC0820a.a(str, jSONObject, browserBadgeModel, SystemClock.elapsedRealtime() - j);
    }

    private void b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253fb1", new Object[]{this, str, new Long(j)});
            return;
        }
        InterfaceC0820a interfaceC0820a = this.f19743a;
        if (interfaceC0820a == null) {
            return;
        }
        interfaceC0820a.a(str, SystemClock.elapsedRealtime() - j);
    }
}
