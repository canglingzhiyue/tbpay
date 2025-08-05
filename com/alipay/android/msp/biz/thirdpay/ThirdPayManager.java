package com.alipay.android.msp.biz.thirdpay;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.SymbolExpUtil;

/* loaded from: classes3.dex */
public final class ThirdPayManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f4475a;
    private static final Map<String, ThirdPayImpl> b = new ConcurrentHashMap();

    /* loaded from: classes3.dex */
    public interface ThirdPayFinishCallback {
        void finish(ThirdPayInvokeResult thirdPayInvokeResult);
    }

    /* loaded from: classes3.dex */
    public interface ThirdPayImpl {
        void doThirdPay(JSONObject jSONObject, int i, Activity activity, ThirdPayFinishCallback thirdPayFinishCallback);

        boolean isAvailable(Context context);

        String targetType();
    }

    /* loaded from: classes3.dex */
    public @interface ThirdPayTypeVal {
        public static final String VAL_CUP = "CUP";
        public static final String VAL_MOCK = "mock";
        public static final String VAL_SCHEME = "scheme";
    }

    /* loaded from: classes3.dex */
    public static final class ThirdPayInvokeResult {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String invocationErr;
        public String payload;

        public final JSONObject toJson() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("705c882a", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("invocationErr", (Object) this.invocationErr);
            jSONObject.put("payload", (Object) this.payload);
            return jSONObject;
        }

        public static ThirdPayInvokeResult makeErr(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ThirdPayInvokeResult) ipChange.ipc$dispatch("a824acf9", new Object[]{str});
            }
            ThirdPayInvokeResult thirdPayInvokeResult = new ThirdPayInvokeResult();
            thirdPayInvokeResult.invocationErr = str;
            return thirdPayInvokeResult;
        }

        public static ThirdPayInvokeResult makeOk(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ThirdPayInvokeResult) ipChange.ipc$dispatch("43c55ac6", new Object[]{str});
            }
            ThirdPayInvokeResult thirdPayInvokeResult = new ThirdPayInvokeResult();
            thirdPayInvokeResult.payload = str;
            return thirdPayInvokeResult;
        }

        public static ThirdPayInvokeResult makeJumpSucc() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ThirdPayInvokeResult) ipChange.ipc$dispatch("162f185c", new Object[0]);
            }
            ThirdPayInvokeResult thirdPayInvokeResult = new ThirdPayInvokeResult();
            thirdPayInvokeResult.payload = "JumpSucc";
            return thirdPayInvokeResult;
        }

        public final boolean isJumpSucc() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("799bda65", new Object[]{this})).booleanValue() : "JumpSucc".equals(this.payload);
        }
    }

    public static void instrumentPredefinedImpl() {
        String[] strArr = {"com.alipay.android.msp.biz.thirdpay.CUPThirdPayImpl", "com.alipay.android.msp.biz.thirdpay.SchemeThirdPayImpl"};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            try {
                ThirdPayImpl thirdPayImpl = (ThirdPayImpl) Class.forName(str).newInstance();
                String targetType = thirdPayImpl.targetType();
                LogUtil.record(2, "ThirdPayManager", "instr: new " + str + " -> " + targetType + ", " + thirdPayImpl);
                registerThirdPayImplMap(targetType, thirdPayImpl);
            } catch (ClassNotFoundException unused) {
                LogUtil.record(8, "ThirdPayManager", "instr: exception on " + str + ", not found");
            } catch (Throwable th) {
                LogUtil.record(8, "ThirdPayManager", "instr: exception on ".concat(String.valueOf(str)));
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public static void registerThirdPayImplMap(String str, ThirdPayImpl thirdPayImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd2921c9", new Object[]{str, thirdPayImpl});
        } else if (TextUtils.isEmpty(str) || thirdPayImpl == null) {
            LogUtil.record(8, "ThirdPayManager", "provide: failed 1 of " + str + ", " + thirdPayImpl);
        } else {
            LogUtil.record(2, "ThirdPayManager", "provided " + str + ", " + thirdPayImpl);
            b.put(str, thirdPayImpl);
        }
    }

    public static void triggerThirdPay(String str, JSONObject jSONObject, int i, Activity activity, ThirdPayFinishCallback thirdPayFinishCallback, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdcb14b5", new Object[]{str, jSONObject, new Integer(i), activity, thirdPayFinishCallback, runnable});
        } else if (TextUtils.isEmpty(str) || jSONObject == null || thirdPayFinishCallback == null || runnable == null) {
            LogUtil.record(8, "ThirdPayManager", "pay: failed 1 of " + str + ", " + jSONObject + ", " + thirdPayFinishCallback + ", " + runnable);
            runnable.run();
        } else {
            ThirdPayImpl thirdPayImpl = b.get(str);
            if (thirdPayImpl == null) {
                LogUtil.record(8, "ThirdPayManager", "pay: failed 2 of ".concat(String.valueOf(str)));
                runnable.run();
                return;
            }
            try {
                LogUtil.record(2, "ThirdPayManager", "pay: trigger " + str + ", " + thirdPayImpl);
                thirdPayImpl.doThirdPay(jSONObject, i, activity, thirdPayFinishCallback);
            } catch (Throwable th) {
                LogUtil.record(8, "ThirdPayManager", "pay: exception on " + str + ", " + thirdPayImpl);
                LogUtil.printExceptionStackTrace(th);
                runnable.run();
            }
        }
    }

    public static boolean checkThirdPayAvailable(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2881f07b", new Object[]{str, context})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.record(8, "ThirdPayManager", "check: failed 1 of ".concat(String.valueOf(str)));
            return false;
        }
        ThirdPayImpl thirdPayImpl = b.get(str);
        if (thirdPayImpl == null) {
            LogUtil.record(8, "ThirdPayManager", "check: failed 2 of ".concat(String.valueOf(str)));
            return false;
        }
        try {
            boolean isAvailable = thirdPayImpl.isAvailable(context);
            LogUtil.record(2, "ThirdPayManager", "check: " + str + " -> " + isAvailable);
            return isAvailable;
        } catch (Throwable th) {
            LogUtil.record(8, "ThirdPayManager", "check: failed 3 of ".concat(String.valueOf(str)));
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    public static List<String> getAvailableThirdPayTypes(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("368096b", new Object[]{context});
        }
        ArrayList arrayList = new ArrayList();
        for (String str : b.keySet()) {
            ThirdPayImpl thirdPayImpl = b.get(str);
            if (thirdPayImpl != null) {
                try {
                    if (thirdPayImpl.isAvailable(context)) {
                        arrayList.add(str);
                    }
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace("ThirdPayManager", "check all: exception on " + str + ", " + thirdPayImpl, th);
                }
            }
        }
        LogUtil.i("ThirdPayManager", "getAvailableThirdPayTypes", "check all: ".concat(String.valueOf(arrayList)));
        return arrayList;
    }

    public static List<String> getExternalProvidedThirdPayTypes(MspContext mspContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8c1eecd6", new Object[]{mspContext});
        }
        ArrayList arrayList = new ArrayList();
        return (!(mspContext instanceof MspTradeContext) || (str = ((MspTradeContext) mspContext).getAllExtendParamsMap().get(MspGlobalDefine.EXT_LOCAL_ONLY_THIRD_PAY)) == null) ? arrayList : Arrays.asList(str.split(SymbolExpUtil.SYMBOL_VERTICALBAR));
    }

    public static List<String> getListCupDirectApps() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("752ac9b", new Object[0]) : f4475a;
    }

    public static void refreshListCupDirectApps(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f6d38b8", new Object[]{list});
            return;
        }
        f4475a = new LinkedList();
        if (list == null || list.size() <= 0) {
            return;
        }
        f4475a.addAll(list);
    }
}
