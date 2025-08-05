package com.alipay.android.msp.utils;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONException;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.framework.exception.AppErrorException;
import com.alipay.android.msp.framework.exception.DataErrorException;
import com.alipay.android.msp.framework.exception.MspServerErrorException;
import com.alipay.android.msp.framework.exception.NetErrorException;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.language.LanguageHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.io.IOException;
import java.util.Locale;
import tb.riy;

/* loaded from: classes3.dex */
public class ExceptionUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_CODE_001 = 1;
    public static final int ERROR_CODE_002 = 2;
    public static final int ERROR_CODE_003 = 3;
    public static final int ERROR_CODE_004 = 4;
    public static final int ERROR_CODE_005 = 5;
    public static final int ERROR_CODE_006 = 6;
    public static final int ERROR_CODE_101 = 101;
    public static final int ERROR_CODE_102 = 102;
    public static final int ERROR_CODE_103 = 103;
    public static final int ERROR_CODE_104 = 104;
    public static final int ERROR_CODE_105 = 105;
    public static final int ERROR_CODE_106 = 106;
    public static final int ERROR_CODE_107 = 107;
    public static final int ERROR_CODE_108 = 108;
    public static final int ERROR_CODE_109 = 109;
    public static final int ERROR_CODE_110 = 111;
    public static final int ERROR_CODE_201 = 201;
    public static final int ERROR_CODE_202 = 202;
    public static final int ERROR_CODE_203 = 203;
    public static final int ERROR_CODE_204 = 204;
    public static final int ERROR_CODE_205 = 205;
    public static final int ERROR_CODE_206 = 206;
    public static final int ERROR_CODE_301 = 301;
    public static final int ERROR_CODE_302 = 302;
    public static final int ERROR_CODE_303 = 303;
    public static final int ERROR_CODE_304 = 304;
    public static final int ERROR_CODE_305 = 305;
    public static final int ERROR_CODE_306 = 306;
    public static final int ERROR_CODE_307 = 307;
    public static final int ERROR_CODE_DEFAULT = 0;
    public static final String ERROR_MSG_DATA_ERROR = "数据解析异常";

    public static String createExceptionMsg(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("60554e12", new Object[]{new Integer(i)}) : createExceptionMsg(null, i);
    }

    public static String createExceptionMsg(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a247de1c", new Object[]{str, new Integer(i)});
        }
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str)) {
            Context context = GlobalHelper.getInstance().getContext();
            str = context != null ? LanguageHelper.localizedStringForKey("mini_app_error", context.getString(R.string.mini_app_error), new Object[0]) : "人气太旺啦，稍候再试试。";
        }
        sb.append(str);
        sb.append(riy.BRACKET_START_STR);
        sb.append(String.format(Locale.getDefault(), "%d", Integer.valueOf(i)));
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }

    public static void sendUiMsgWhenException(int i, Throwable th) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5de57ea9", new Object[]{new Integer(i), th});
            return;
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
        if (th instanceof IOException) {
            NetErrorException netErrorException = new NetErrorException(th);
            netErrorException.setChannel(NetErrorException.Channel.UNKNOWN);
            logForExceptionUI(mspContextByBizId, netErrorException, true);
            th = netErrorException;
        } else {
            boolean z2 = th instanceof NetErrorException;
            if (!z2 && !(th instanceof AppErrorException) && !(th instanceof DataErrorException) && !(th instanceof MspServerErrorException)) {
                logForExceptionUI(mspContextByBizId, th, true);
                String localizedStringForKey = LanguageHelper.localizedStringForKey("mini_app_error", MspContextUtil.getContext().getString(R.string.mini_app_error), new Object[0]);
                if ((th instanceof JSONException) || (th instanceof org.json.JSONException)) {
                    localizedStringForKey = createExceptionMsg(localizedStringForKey, 2);
                }
                th = new AppErrorException(localizedStringForKey, th);
            } else if (z2) {
                NetErrorException netErrorException2 = (NetErrorException) th;
                if (mspContextByBizId != null) {
                    mspContextByBizId.getStatisticInfo().addError(ErrorType.NETWORK, netErrorException2.toString(), netErrorException2.getShortMessageForLog());
                }
            } else if (th instanceof AppErrorException) {
                String message = th.getMessage();
                if (!TextUtils.isEmpty(message) && !message.contains("(6)")) {
                    logForExceptionUI(mspContextByBizId, th, false);
                }
            } else {
                if (th instanceof DataErrorException) {
                    z = false;
                }
                logForExceptionUI(mspContextByBizId, th, z);
            }
        }
        if (mspContextByBizId == null) {
            return;
        }
        ActionsCreator.get(mspContextByBizId).createExceptionAction(th);
    }

    private static void logForExceptionUI(MspContext mspContext, Throwable th, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f32e3f3a", new Object[]{mspContext, th, new Boolean(z)});
        } else if (mspContext == null || th == null) {
        } else {
            if (z) {
                StatisticInfo statisticInfo = mspContext.getStatisticInfo();
                statisticInfo.addError(ErrorType.DEFAULT, "ExAction_" + th.getClass().getSimpleName(), th);
                return;
            }
            StatisticInfo statisticInfo2 = mspContext.getStatisticInfo();
            statisticInfo2.addError(ErrorType.DEFAULT, "ExAction_" + th.getClass().getSimpleName(), th.getMessage());
        }
    }
}
