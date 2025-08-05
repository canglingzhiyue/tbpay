package com.alipay.android.app.cctemplate;

import android.os.ConditionVariable;
import android.util.Pair;
import com.alipay.android.app.base.SPTaskHelper;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.app.template.FBResourceClient;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.FBTemplateDecider;
import com.flybird.deploy.model.FBTemplateContent;
import com.flybird.deploy.model.d;
import com.taobao.umipublish.draft.DraftMediaHelper;
import com.taobao.vessel.utils.b;
import java.util.concurrent.ConcurrentHashMap;
import tb.riy;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public final class DynResResourceClient implements FBResourceClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final NoneValue g = new NoneValue();
    private final ConcurrentHashMap<Pair<String, FBResourceClient.Type>, Object> f = new ConcurrentHashMap<>(32);

    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* renamed from: com.alipay.android.app.cctemplate.DynResResourceClient$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4334a = new int[FBResourceClient.Type.values().length];

        static {
            try {
                f4334a[FBResourceClient.Type.MAIN_FRAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4334a[FBResourceClient.Type.INNER_FRAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4334a[FBResourceClient.Type.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4334a[FBResourceClient.Type.DRAWABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.alipay.android.app.template.FBResourceClient
    public final Object shouldInterceptResource(String str, FBResourceClient.Type type) {
        String str2 = str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a4e0d8b8", new Object[]{this, str2, type});
        }
        Object a2 = a(str, type);
        if (a2 instanceof NoneValue) {
            return null;
        }
        if (a2 != null) {
            return a2;
        }
        if (str2 == null || str2.startsWith("http:") || str2.startsWith(b.HTTPS_SCHEMA) || str2.startsWith("data:")) {
            a(str2, type, null);
            return null;
        }
        LogUtils.record(2, "DynResResourceClient::shouldInterceptResource", this + " 拦截非缓存资源 [" + type + riy.ARRAY_END_STR + str2);
        str2.substring(str2.lastIndexOf("/") + 1);
        int i = AnonymousClass2.f4334a[type.ordinal()];
        if (i == 1 || i == 2) {
            LogUtils.record(2, "DynResResourceClient::shouldInterceptResource", "path=" + str2);
            if (str2.startsWith("mspFrameLocal/")) {
                if (str2.startsWith("mspFrameLocal/")) {
                    str2 = str2.substring(14);
                }
                final String str3 = str2;
                final FBTemplateDecider a3 = FBTemplateDecider.a("QUICKPAY");
                if (a3 == null) {
                    StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "missing-decider", "");
                    return null;
                }
                final FBTemplateContent[] fBTemplateContentArr = new FBTemplateContent[1];
                final ConditionVariable conditionVariable = new ConditionVariable();
                SPTaskHelper.execute(new Runnable() { // from class: com.alipay.android.app.cctemplate.DynResResourceClient.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        fBTemplateContentArr[0] = a3.a(d.a(str3));
                        conditionVariable.open();
                    }
                });
                conditionVariable.block(Constants.STARTUP_TIME_LEVEL_1);
                if (fBTemplateContentArr[0] == null) {
                    a3.b(str3, "cashier:resourceFail", "", "cannot get template from getLocalTemplate");
                    return null;
                }
                String data = fBTemplateContentArr[0].getData();
                a3.a(str3, fBTemplateContentArr[0], true);
                a(str3, type, data);
                return data;
            }
            a(str2, type, null);
            return null;
        }
        a(str2, type, null);
        return null;
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "<DynResResourceClient " + hashCode() + ">";
    }

    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* loaded from: classes3.dex */
    public class NoneValue {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public String toString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : "<NoneValue>";
        }

        private NoneValue() {
        }
    }

    private void a(String str, FBResourceClient.Type type, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("151f6fb2", new Object[]{this, str, type, obj});
        } else if (str == null || type == null) {
        } else {
            if (obj == null) {
                obj = g;
            }
            if (this.f.size() > 30) {
                this.f.clear();
            }
            this.f.put(new Pair<>(str, type), obj);
        }
    }

    private Object a(String str, FBResourceClient.Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("23e1449c", new Object[]{this, str, type});
        }
        String str2 = null;
        if (str == null || type == null) {
            return null;
        }
        Object obj = this.f.get(new Pair(str, type));
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" Get cache [");
        sb.append(type);
        sb.append(riy.ARRAY_END_STR);
        sb.append(str);
        sb.append(" -> ");
        if (obj != null) {
            str2 = obj.getClass().getSimpleName();
        }
        sb.append(str2);
        LogUtils.record(2, "DynResResourceClient::getFromCache", sb.toString());
        return obj;
    }
}
