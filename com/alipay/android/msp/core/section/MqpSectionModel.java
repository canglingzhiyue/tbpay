package com.alipay.android.msp.core.section;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.section.MqpSectionModel.BaseParams;
import com.alipay.android.msp.framework.dynfun.DynConstants;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b;
import com.taobao.trtc.api.TrtcConstants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class MqpSectionModel<P extends BaseParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f4558a;
    private P b;
    private MqpSectionModel<P>.Env c = new Env();
    private PageInfo d = new PageInfo();
    private MqpSectionModel<P>.PaySessionInfo e = new PaySessionInfo();
    private long f = System.currentTimeMillis();

    /* loaded from: classes3.dex */
    public static class CashierCmdParams extends BaseParams {
        public CashierCmdParams(String str, String str2, String[] strArr) {
            add("action", str);
            add("params", str2);
            add("paramsArray", strArr);
        }
    }

    /* loaded from: classes3.dex */
    public class Env extends JsonModelBuilder {
        public Env() {
            add("os", "android");
            add("sdkVersion", GlobalSdkConstant.getMspVersion());
            Context context = MspContextUtil.getContext();
            if (context != null) {
                add("appName", context.getPackageName());
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class NotificationClickedParams extends BaseParams {
        public NotificationClickedParams(String str, boolean z) {
            add("userInfo", str);
            add("handled", Boolean.valueOf(z));
        }
    }

    /* loaded from: classes3.dex */
    public static class RpcParams extends BaseParams {
        public RpcParams(String str, String str2) {
            add("opType", str);
            add("action", str2);
        }
    }

    /* loaded from: classes3.dex */
    public static class ServiceParams extends BaseParams {
        public ServiceParams(String str) {
            add("type", str);
        }
    }

    public MqpSectionModel(String str, P p, MspContext mspContext) {
        this.f4558a = str;
        this.b = p;
        MqpBizSection.fillSectionModel(str, this, mspContext);
    }

    public boolean dataReady() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("53550424", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.f4558a);
    }

    public JSONObject buildJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b2c32a6b", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(b.SECTION_NAME, this.f4558a);
            jSONObject.putOpt("sectionParams", this.b);
            jSONObject.putOpt("env", this.c);
            jSONObject.putOpt("pageInfo", this.d);
            jSONObject.putOpt("paySession", this.e);
            jSONObject.putOpt(TrtcConstants.TRTC_PARAMS_ELAPSED, Long.valueOf(System.currentTimeMillis() - this.f));
        } catch (JSONException e) {
            LogUtil.record(8, "MqpSectionModel", "build fail: ".concat(String.valueOf(e)));
        }
        return jSONObject;
    }

    public static MqpSectionModel buildBaseMode(String str, MspContext mspContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MqpSectionModel) ipChange.ipc$dispatch("378a8988", new Object[]{str, mspContext}) : new MqpSectionModel(str, new BaseParams(), mspContext);
    }

    public P getSectionParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (P) ipChange.ipc$dispatch("a90090e0", new Object[]{this}) : this.b;
    }

    public MqpSectionModel<P>.Env getEnv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Env) ipChange.ipc$dispatch("dc51cc94", new Object[]{this}) : this.c;
    }

    public PageInfo getPageInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageInfo) ipChange.ipc$dispatch("da3633fc", new Object[]{this}) : this.d;
    }

    public MqpSectionModel<P>.PaySessionInfo getPaySessionInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PaySessionInfo) ipChange.ipc$dispatch("e87d437e", new Object[]{this}) : this.e;
    }

    /* loaded from: classes3.dex */
    public static class JsonModelBuilder extends JSONObject {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public JsonModelBuilder add(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JsonModelBuilder) ipChange.ipc$dispatch("6836b54b", new Object[]{this, str, obj});
            }
            try {
                if (!StringUtils.isEmpty(str) && obj != null) {
                    putOpt(str, obj);
                }
            } catch (JSONException unused) {
            }
            return this;
        }

        public String build() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c5d594b", new Object[]{this}) : toString();
        }

        public boolean isEmpty() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue() : length() == 0;
        }
    }

    /* loaded from: classes3.dex */
    public static class PageInfo extends JsonModelBuilder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public PageInfo tplInfo(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PageInfo) ipChange.ipc$dispatch("7a5d325d", new Object[]{this, str, str2});
            }
            add("tplId", str);
            if (!StringUtils.isEmpty(str2)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject.length() > 0) {
                        add("tplTime", jSONObject.getString("time"));
                        add("tplVersion", jSONObject.getString("tplVersion"));
                    }
                } catch (JSONException e) {
                    LogUtil.record(8, "MqpSectionModel", "PageInfo.tplInfo exception:".concat(String.valueOf(e)));
                }
            }
            return this;
        }

        public PageInfo clickCnt(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PageInfo) ipChange.ipc$dispatch("9c8072bb", new Object[]{this, new Integer(i)});
            }
            add("clickCnt", Integer.valueOf(i));
            return this;
        }

        public PageInfo isPayFirstPage(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PageInfo) ipChange.ipc$dispatch("54ab65aa", new Object[]{this, new Boolean(z)});
            }
            add("isPayFirstPage", Boolean.valueOf(z));
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public class PaySessionInfo extends JsonModelBuilder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public PaySessionInfo() {
        }

        public MqpSectionModel<P>.PaySessionInfo sessionId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PaySessionInfo) ipChange.ipc$dispatch("b1f223d5", new Object[]{this, str});
            }
            add("sessionId", str);
            return this;
        }

        public MqpSectionModel<P>.PaySessionInfo endCode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PaySessionInfo) ipChange.ipc$dispatch("e9522c9e", new Object[]{this, str});
            }
            add("endCode", str);
            return this;
        }

        public MqpSectionModel<P>.PaySessionInfo orderStr(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PaySessionInfo) ipChange.ipc$dispatch("b97c8a63", new Object[]{this, str});
            }
            add("orderStr", str);
            return this;
        }

        public MqpSectionModel<P>.PaySessionInfo outTradeLaunchType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PaySessionInfo) ipChange.ipc$dispatch("c69f6183", new Object[]{this, str});
            }
            add("outTradeLaunchType", str);
            return this;
        }

        public MqpSectionModel<P>.PaySessionInfo clientBizType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PaySessionInfo) ipChange.ipc$dispatch("de4f5ea4", new Object[]{this, str});
            }
            add("clientBizType", str);
            return this;
        }

        public MqpSectionModel<P>.PaySessionInfo clientLogData(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PaySessionInfo) ipChange.ipc$dispatch("8416d2dc", new Object[]{this, map});
            }
            try {
                add(DynConstants.DynDataNames.D_CLIENT_LOG_DATA, new JSONObject(map));
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            return this;
        }

        public MqpSectionModel<P>.PaySessionInfo trdfrom(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PaySessionInfo) ipChange.ipc$dispatch("2faad93a", new Object[]{this, new Boolean(z)});
            }
            add(MspFlybirdDefine.TRDFROM, z ? "1" : "0");
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static class BaseParams extends JsonModelBuilder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public BaseParams() {
            add("timestamp", Long.valueOf(System.currentTimeMillis()));
        }

        public BaseParams serviceId(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseParams) ipChange.ipc$dispatch("8e9dbb50", new Object[]{this, new Integer(i)});
            }
            add("serviceId", String.valueOf(i));
            return this;
        }

        public BaseParams apLinkToken(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseParams) ipChange.ipc$dispatch("7eaafe1b", new Object[]{this, str});
            }
            add("apLinkToken", String.valueOf(str));
            return this;
        }
    }
}
