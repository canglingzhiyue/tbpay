package com.alipay.security.mobile.util;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.cache.AuthenticatorModel;
import com.alipay.security.mobile.rpc.ReadSettingServerUrl;
import com.alipay.security.mobile.util.log.BicLogReportRpcService;
import com.alipay.security.mobile.util.log.model.BicLogReportRequestPB;
import com.alipay.security.mobile.util.log.model.EntryStringString;
import com.alipay.security.mobile.util.log.model.MapStringString;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.p;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.application.common.c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ils;
import tb.riy;

/* loaded from: classes3.dex */
public class BioBehaviorUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String AUTH_EVENT = "bioAuth";
    private static final String CHECK_EVENT = "check_status";
    private static final String DEREG_EVENT = "bioDeReg";
    private static final String EXTEND_KEY_VERIFY_ID = "VERIFY_ID";
    private static final String FACE_2D_SEED = "2dface";
    private static final String FACE_3D_SEED = "3dface";
    private static final String FP_SEED = "fp";
    private static final String REG_EVENT = "bioReg";
    public static String TAG = "BioBehaviorUtils";
    public static final String mBehavorPro = "biosecurity";
    public static final String mUserCaseId = "XY-BIO-160805-09";
    private static BioBehaviorUtils sInstance;
    private static Object sInstanceLock = new Object();
    private Map<String, LogInfoEntity> logsContainerMap;

    private static String transType(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b6ddad46", new Object[]{new Integer(i)}) : (i == 3 || i == 9) ? AUTH_EVENT : (i == 2 || i == 8) ? REG_EVENT : (i == 4 || i == 10) ? DEREG_EVENT : i == 14 ? CHECK_EVENT : "bio_event";
    }

    public static BioBehaviorUtils getInstance() {
        BioBehaviorUtils bioBehaviorUtils;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioBehaviorUtils) ipChange.ipc$dispatch("159091a4", new Object[0]);
        }
        synchronized (sInstanceLock) {
            if (sInstance == null) {
                sInstance = new BioBehaviorUtils();
            }
            bioBehaviorUtils = sInstance;
        }
        return bioBehaviorUtils;
    }

    private BioBehaviorUtils() {
        if (this.logsContainerMap == null) {
            this.logsContainerMap = new HashMap();
        }
    }

    public void add(AuthenticatorMessage authenticatorMessage, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f46693", new Object[]{this, authenticatorMessage, str});
        } else {
            add(getLogTag(authenticatorMessage), str);
        }
    }

    public void add(Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707a05f6", new Object[]{this, bundle, str});
        } else {
            add(getLogTag(bundle), str);
        }
    }

    public void commit(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce7d5d6", new Object[]{this, bundle});
        } else if (bundle == null) {
        } else {
            commitAll(getLogTag(bundle), bundle.getString(AuthenticatorMessage.KEY_VERIFY_ID));
        }
    }

    public void commit(AuthenticatorMessage authenticatorMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b401f", new Object[]{this, authenticatorMessage});
        } else if (authenticatorMessage == null) {
        } else {
            commitAll(getLogTag(authenticatorMessage), authenticatorMessage.getId());
        }
    }

    private synchronized void add(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("406bc5bc", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            LogInfoEntity logInfoEntity = this.logsContainerMap.get(str);
            if (logInfoEntity == null) {
                logInfoEntity = new LogInfoEntity(str);
                this.logsContainerMap.put(str, logInfoEntity);
            }
            logInfoEntity.addLog(str2);
        }
    }

    private synchronized void commitAll(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d574c905", new Object[]{this, str, str2});
            return;
        }
        if (this.logsContainerMap != null && !TextUtils.isEmpty(str)) {
            LogInfoEntity logInfoEntity = this.logsContainerMap.get(str);
            if (logInfoEntity != null && logInfoEntity.logList != null) {
                if (logInfoEntity.logList.size() < 3) {
                    logInfoEntity.logList.clear();
                    return;
                }
                logInfoEntity.commitTimes++;
                Behavor behavor = new Behavor();
                behavor.setSeedID(getBioTypeByTag(str));
                behavor.setParam1(logInfoEntity.tag);
                behavor.setParam2(logInfoEntity.commitTimes + "");
                behavor.setParam3(logInfoEntity.toString());
                behavor.addExtParam(EXTEND_KEY_VERIFY_ID, str2);
                behavor.setBehaviourPro(mBehavorPro);
                behavor.setLoggerLevel(1);
                behavor.setUserCaseID(mUserCaseId);
                LoggerFactory.getBehavorLogger().event(getOperTypeByTag(str), behavor);
                AuthenticatorLOG.fpInfo(TAG + logInfoEntity.tag + " commitTimes:" + logInfoEntity.commitTimes + " " + logInfoEntity.toString());
                String logInfoEntity2 = logInfoEntity.toString();
                logInfoEntity.logList.clear();
                if (!"on".equals(ConfigServiceUtil.syncConfigMode(ConfigServiceUtil.KEY_IFAA_BIO_BEHAVIOR_LOG, ""))) {
                    return;
                }
                Activity b = c.b();
                if (b == null) {
                    return;
                }
                BicLogReportRequestPB bicLogReportRequestPB = new BicLogReportRequestPB();
                bicLogReportRequestPB.reportData = new MapStringString();
                bicLogReportRequestPB.reportData.entries = new ArrayList();
                bicLogReportRequestPB.reportData.entries.add(new EntryStringString("bizType", getBizTypeByTag(str)));
                bicLogReportRequestPB.reportData.entries.add(new EntryStringString("bizData", logInfoEntity2));
                bicLogReportRequestPB.reportData.entries.add(new EntryStringString("userId", AuthenticatorModel.getTempUserId(b)));
                bicLogReportRequestPB.reportData.entries.add(new EntryStringString(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL));
                bicLogReportRequestPB.reportData.entries.add(new EntryStringString("appVersion", getAppVersion(b)));
                bicLogReportRequestPB.reportData.entries.add(new EntryStringString("osVersion", Build.VERSION.RELEASE));
                bicLogReportRequestPB.reportData.entries.add(new EntryStringString(p.KEY_DEVICE_TYPE, "android"));
                bicLogReportRequestPB.reportData.entries.add(new EntryStringString("appName", b.getPackageName()));
                bicLogReportRequestPB.reportData.entries.add(new EntryStringString(Constants.VI_ENGINE_VERIFYID, str2));
                MpaasRpcServiceImpl mpaasRpcServiceImpl = new MpaasRpcServiceImpl(b.getApplicationContext());
                BicLogReportRpcService bicLogReportRpcService = (BicLogReportRpcService) mpaasRpcServiceImpl.getRpcProxy(BicLogReportRpcService.class);
                mpaasRpcServiceImpl.getRpcInvokeContext(bicLogReportRpcService).setGwUrl(ReadSettingServerUrl.getInstance().getGWFURL(b.getApplicationContext()));
                bicLogReportRpcService.report(bicLogReportRequestPB);
            }
        }
    }

    public static String getAppVersion(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e616e24c", new Object[]{context});
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static String getLogTag(AuthenticatorMessage authenticatorMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dcd830cc", new Object[]{authenticatorMessage});
        }
        if (authenticatorMessage == null || authenticatorMessage.getFeatureType() != 1) {
            return null;
        }
        return DigestUtil.hex(DigestUtil.MD5(authenticatorMessage.getData())).toString() + "_" + transType(authenticatorMessage.getType()) + "_" + authenticatorMessage.getAuthenticatorType();
    }

    private static String getLogTag(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94fa13ff", new Object[]{bundle});
        }
        if (bundle == null || bundle.getInt(AuthenticatorMessage.KEY_FEATURE) != 1) {
            return null;
        }
        String string = bundle.getString(AuthenticatorMessage.KEY_MESSAGE);
        int i = bundle.getInt(AuthenticatorMessage.KEY_OPERATIONT_TYPE);
        int i2 = bundle.getInt(AuthenticatorMessage.KEY_AUTHENTICATOR_TYPE);
        return DigestUtil.hex(DigestUtil.MD5(string)).toString() + "_" + transType(i) + "_" + i2;
    }

    private String getBioTypeByTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5edb9b58", new Object[]{this, str});
        }
        String[] split = str.split("_");
        if (split.length < 3) {
            return null;
        }
        String str2 = split[2];
        if (str2.equals("" + com.alipay.security.mobile.auth.Constants.TYPE_FINGERPRINT)) {
            return "fp";
        }
        if (split[2].equals(ils.ARCH_BIT32)) {
            return FACE_2D_SEED;
        }
        String str3 = split[2];
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(com.alipay.security.mobile.auth.Constants.TYPE_FACE);
        return str3.equals(sb.toString()) ? FACE_3D_SEED : "bio_seed";
    }

    private String getOperTypeByTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccaa904a", new Object[]{this, str});
        }
        String[] split = str.split("_");
        if (split.length >= 3) {
            return split[2];
        }
        return null;
    }

    private String getBizTypeByTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59c53963", new Object[]{this, str});
        }
        String[] split = str.split("_");
        if (split.length >= 2) {
            return split[1];
        }
        return null;
    }

    /* loaded from: classes3.dex */
    public class LogInfoEntity {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int commitTimes = 0;
        public List<String> logList;
        public String tag;

        public LogInfoEntity(String str) {
            this.tag = str;
            if (this.logList == null) {
                this.logList = new ArrayList();
            }
        }

        public void addLog(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f968134", new Object[]{this, str});
                return;
            }
            this.logList.add(format(str));
            AuthenticatorLOG.fpInfo(BioBehaviorUtils.TAG + " tag:" + this.tag + " logs:" + format(str));
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            for (String str : this.logList) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(riy.BRACKET_START_STR);
                sb.append(str);
                sb.append(riy.BRACKET_END_STR);
            }
            return sb.toString();
        }

        private String format(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("27a69e58", new Object[]{this, str});
            }
            return new SimpleDateFormat("yyyy-dd-MM HH:mm:ss:SSS").format(new Date()) + ";" + str;
        }
    }
}
