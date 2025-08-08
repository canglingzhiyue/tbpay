package com.alibaba.poplayer.config.manager;

import android.os.Build;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.config.model.keep.KeepModel;
import com.alibaba.poplayer.config.model.trigger.UriModel;
import com.alibaba.poplayer.info.frequency.FrequencyManager;
import com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.alibaba.poplayer.utils.g;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.bzl;
import tb.bzt;
import tb.bzz;
import tb.cab;
import tb.cag;
import tb.kge;

/* loaded from: classes2.dex */
public class ConfigFilterRule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public enum ConfigStatus {
        INVALIED,
        VALIED,
        VALIED_BUT_UNSTARTED
    }

    static {
        kge.a(1116291991);
    }

    public static ConfigStatus a(com.alibaba.poplayer.trigger.d dVar, boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            return (ConfigStatus) ipChange.ipc$dispatch("9757480c", new Object[]{dVar, new Boolean(z)});
        }
        BaseConfigItem x = dVar.x();
        Event y = dVar.y();
        ConfigStatus configStatus = ConfigStatus.INVALIED;
        if (b(x)) {
            configStatus = ConfigStatus.VALIED;
        } else if (a(y, x)) {
            configStatus = ConfigStatus.VALIED;
        } else if (b(y, x)) {
            configStatus = ConfigStatus.VALIED_BUT_UNSTARTED;
        }
        if (!h(x)) {
            return ConfigStatus.INVALIED;
        }
        int i = -1;
        if (configStatus == ConfigStatus.VALIED) {
            i = c(x);
            if (i == 4 || i == 2) {
                configStatus = ConfigStatus.INVALIED;
            } else {
                configStatus = ConfigStatus.VALIED;
            }
        }
        try {
            z2 = PopLayer.getReference().isValidConfigBeforeMonitor(x);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("CommonConfigRule.checkConfigItemStatus.isValidConfigBeforeMonitor.error.", th);
            z2 = true;
        }
        if (!z2) {
            return a(dVar, "isValidConfigBeforeMonitor", false);
        }
        if (configStatus == ConfigStatus.VALIED) {
            if (z) {
                dVar.t().ac = PopLayer.getReference().getCurrentTimeStamp(false);
                dVar.t().ad = SystemClock.elapsedRealtime();
            }
            if (!f(x)) {
                return a(dVar, "appVersion", z);
            }
            if (!g(x)) {
                return a(dVar, "osVersion", z);
            }
            if (!e(x)) {
                return a(dVar, "disableDevice", z);
            }
            if (!c(y, x)) {
                return a(dVar, "protocolCheck", z);
            }
            if (!e(y, x)) {
                return a(dVar, "protocolChecks", z);
            }
            if (!d(y, x)) {
                return a(dVar, "sceneCheck", z);
            }
            Pair<Boolean, String> isValidConfigWithReason = PopLayer.getReference().isValidConfigWithReason(dVar);
            if (isValidConfigWithReason != null && !((Boolean) isValidConfigWithReason.first).booleanValue()) {
                return a(dVar, (String) isValidConfigWithReason.second, z);
            }
            if (!PopLayer.getReference().isValidConfig(x)) {
                return a(dVar, "validConfig", z);
            }
            if (!d(x)) {
                return a(dVar, "enablePercent", z);
            }
            int a2 = bzt.a().a(x.uuid, 0);
            if (!a(x, a2)) {
                return a(dVar, "finished", z);
            }
            if (!b(x, a2)) {
                return a(dVar, "popCount", z);
            }
            if (i == 5) {
                z3 = false;
            }
            if (!z3) {
                return a(dVar, "freqInterval", z);
            }
            if (!FrequencyManager.a(i)) {
                return a(dVar, "frequency", z);
            }
        }
        if (z) {
            OnePopModule t = dVar.t();
            t.x = String.valueOf(SystemClock.elapsedRealtime() - t.ad);
        }
        return configStatus;
    }

    private static ConfigStatus a(com.alibaba.poplayer.trigger.d dVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigStatus) ipChange.ipc$dispatch("35c3e002", new Object[]{dVar, str, new Boolean(z)});
        }
        if (z) {
            OnePopModule t = dVar.t();
            t.T = OnePopModule.OnePopLoseReasonCode.ConfigCheckFail;
            t.U = str;
            bzz.a(dVar);
        }
        dVar.a(PopRequest.Status.REMOVED);
        String b = com.alibaba.poplayer.trigger.d.b(dVar);
        com.alibaba.poplayer.utils.c.b("configCheck", b, "CommonConfigRule.checkFail.reason=" + str);
        return ConfigStatus.INVALIED;
    }

    public static String a(BaseConfigItem baseConfigItem) {
        int a2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b849bbf2", new Object[]{baseConfigItem});
        }
        try {
            a2 = bzt.a().a(baseConfigItem.uuid, 0);
        } catch (Throwable unused) {
        }
        if (!a(baseConfigItem, a2)) {
            return "finished";
        }
        if (!b(baseConfigItem, a2)) {
            return "popCount";
        }
        int c = c(baseConfigItem);
        if (!(c != 5)) {
            return "freqInterval";
        }
        if (!(c == -1 || c == 0)) {
            return "frequency";
        }
        if (bzl.a().b() != null && bzl.a().b().isRequestingFilterEnable()) {
            if (cag.i().a(baseConfigItem.indexID) != null) {
                z = false;
            }
            if (!z) {
                return "isTriggering";
            }
        }
        return "";
    }

    private static boolean b(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb414891", new Object[]{baseConfigItem})).booleanValue();
        }
        if (!baseConfigItem.appear) {
            return false;
        }
        com.alibaba.poplayer.utils.c.a("CommonConfigRule.checkAppear.indexId{%s}.ignoreTime", baseConfigItem.indexID);
        return true;
    }

    private static boolean a(Event event, BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("707e7538", new Object[]{event, baseConfigItem})).booleanValue();
        }
        long startTimeStamp = baseConfigItem.getStartTimeStamp();
        long endTimeStamp = baseConfigItem.getEndTimeStamp();
        if ((event.source == 3 || event.source == 5) && (startTimeStamp == Long.MAX_VALUE || endTimeStamp == Long.MAX_VALUE)) {
            return true;
        }
        if (endTimeStamp <= startTimeStamp) {
            com.alibaba.poplayer.utils.c.b("configCheck", baseConfigItem.indexID, "CommonConfigRule.checkTimeAndRescheduleIfNeed.error.endTime<=startTime");
            return false;
        }
        long currentTimeStamp = PopLayer.getReference().getCurrentTimeStamp();
        if (currentTimeStamp <= startTimeStamp || currentTimeStamp >= endTimeStamp) {
            com.alibaba.poplayer.utils.c.a("CommonConfigRule.checkTimeAndRescheduleIfNeed.indexId{%s}.return.outOfTime", baseConfigItem.indexID);
            return false;
        }
        BaseConfigItem.DisableTimeParam[] disableTimeParamArr = baseConfigItem.disableTimeConfigs;
        if (disableTimeParamArr != null) {
            for (BaseConfigItem.DisableTimeParam disableTimeParam : disableTimeParamArr) {
                if (disableTimeParam != null) {
                    long startTimeStamp2 = disableTimeParam.getStartTimeStamp();
                    long endTimeStamp2 = disableTimeParam.getEndTimeStamp();
                    if (endTimeStamp2 <= startTimeStamp2) {
                        com.alibaba.poplayer.utils.c.b("configCheck", baseConfigItem.indexID, "CommonConfigRule.checkTimeAndRescheduleIfNeed.error.disableEndTime<=disableStartTime");
                        cab.a("CommonConfigRule.checkTimeAndRescheduleIfNeed.timeError.", (Map<String, String>) null, baseConfigItem);
                    } else if (currentTimeStamp >= startTimeStamp2 && currentTimeStamp < endTimeStamp2) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("curTime", currentTimeStamp + "");
                        hashMap.put("disableStartTime", startTimeStamp2 + "");
                        hashMap.put("disableEndTime", endTimeStamp2 + "");
                        cab.a("CommonConfigRule.checkTimeAndRescheduleIfNeed.hitDisableTime.", hashMap, baseConfigItem);
                        com.alibaba.poplayer.utils.c.b("configCheck", baseConfigItem.indexID, "CommonConfigRule.checkTimeAndRescheduleIfNeed.return.inDisableTime");
                        return false;
                    }
                }
            }
        }
        com.alibaba.poplayer.utils.c.a("CommonConfigRule.checkTimeAndRescheduleIfNeed.indexId{%s}.return.timeToStart", baseConfigItem.indexID);
        return true;
    }

    private static int c(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bceaee9f", new Object[]{baseConfigItem})).intValue();
        }
        int a2 = com.alibaba.poplayer.info.frequency.b.e().a(baseConfigItem);
        String str = baseConfigItem.indexID;
        com.alibaba.poplayer.utils.c.b("configCheck", str, "checkFrequency.result=" + a2);
        return a2;
    }

    private static boolean b(Event event, BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b61fb7d7", new Object[]{event, baseConfigItem})).booleanValue();
        }
        if (2 == event.source) {
            long startTimeStamp = baseConfigItem.getStartTimeStamp();
            long endTimeStamp = baseConfigItem.getEndTimeStamp();
            long currentTimeStamp = PopLayer.getReference().getCurrentTimeStamp();
            if (startTimeStamp < endTimeStamp && currentTimeStamp < startTimeStamp) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(BaseConfigItem baseConfigItem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("595d1e59", new Object[]{baseConfigItem, new Integer(i)})).booleanValue();
        }
        if (i != -1) {
            return true;
        }
        com.alibaba.poplayer.utils.c.a("CommonConfigRule.popupCountCheck.This pop is finished.indexId=%s", baseConfigItem.indexID);
        return false;
    }

    private static boolean b(BaseConfigItem baseConfigItem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ce83c1a", new Object[]{baseConfigItem, new Integer(i)})).booleanValue();
        }
        if (i == -1) {
            com.alibaba.poplayer.utils.c.a("CommonConfigRule.popupCountCheck.This pop is finished.indexId=%s", baseConfigItem.indexID);
            return false;
        } else if (baseConfigItem.times == 0) {
            return true;
        } else {
            com.alibaba.poplayer.utils.c.a("CommonConfigRule.popupCountCheck?localCount=%s&configTimes=%s", Integer.valueOf(i), Integer.valueOf(baseConfigItem.times));
            return i < baseConfigItem.times;
        }
    }

    private static boolean d(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae9494cf", new Object[]{baseConfigItem})).booleanValue();
        }
        boolean a2 = PopMiscInfoFileHelper.a().a(baseConfigItem);
        String str = baseConfigItem.indexID;
        com.alibaba.poplayer.utils.c.b("pageLifeCycle", str, "CommonConfigRule.enablePercentCheck.enable=" + a2);
        return a2;
    }

    private static boolean c(Event event, BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbc0fa76", new Object[]{event, baseConfigItem})).booleanValue();
        }
        if (!Event.a.a(event.source) || baseConfigItem.protocolCheckInfo == null || !baseConfigItem.protocolCheckInfo.isValid() || StringUtils.isEmpty(event.curPage)) {
            return true;
        }
        if (event.curPage.equals(baseConfigItem.protocolCheckInfo.uri)) {
            z = true;
        } else {
            String[] strArr = baseConfigItem.protocolCheckInfo.uris;
            if (strArr != null) {
                boolean z2 = false;
                for (String str : strArr) {
                    if (event.curPage.equals(str)) {
                        z2 = true;
                    }
                }
                z = z2;
            }
        }
        return z ? d.a(event.curPageUrl, baseConfigItem.protocolCheckInfo.paramContains) : z;
    }

    private static boolean e(Event event, BaseConfigItem baseConfigItem) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87037fb4", new Object[]{event, baseConfigItem})).booleanValue();
        }
        if (!Event.a.a(event.source) || baseConfigItem.protocolChecks == null || baseConfigItem.protocolChecks.isEmpty() || StringUtils.isEmpty(event.curPage)) {
            return true;
        }
        boolean z2 = false;
        for (BaseConfigItem.ProtocolCheckItem protocolCheckItem : baseConfigItem.protocolChecks) {
            if (protocolCheckItem.uris != null) {
                String[] strArr = protocolCheckItem.uris;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    } else if (event.curPage.equals(strArr[i])) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    z2 = d.a(event.curPageUrl, protocolCheckItem.filter);
                }
                if (z2) {
                    break;
                }
            }
        }
        return z2;
    }

    private static boolean d(Event event, BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41623d15", new Object[]{event, baseConfigItem})).booleanValue();
        }
        if (Event.a.a(event.source) && !StringUtils.isEmpty(baseConfigItem.sceneCheck)) {
            return d.a(event.curPageUrl, baseConfigItem.sceneCheck);
        }
        return true;
    }

    private static boolean e(BaseConfigItem baseConfigItem) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a03e3aee", new Object[]{baseConfigItem})).booleanValue();
        }
        if (baseConfigItem.disableDeviceArray != null && baseConfigItem.disableDeviceArray.length != 0) {
            String str = Build.MODEL;
            if (StringUtils.isEmpty(str)) {
                return true;
            }
            for (String str2 : baseConfigItem.disableDeviceArray) {
                if (!StringUtils.isEmpty(str2) && str2.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean f(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("91e7e10d", new Object[]{baseConfigItem})).booleanValue() : g.a(baseConfigItem.appVersions, PopLayer.getReference().getFaceAdapter().getCurAppVersion(PopLayer.getReference().getApp()));
    }

    private static boolean g(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8391872c", new Object[]{baseConfigItem})).booleanValue() : g.a(baseConfigItem.osVersions, Build.VERSION.RELEASE);
    }

    private static boolean h(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("753b2d4b", new Object[]{baseConfigItem})).booleanValue();
        }
        boolean a2 = com.alibaba.poplayer.info.frequency.a.a().a(baseConfigItem);
        String str = baseConfigItem.indexID;
        com.alibaba.poplayer.utils.c.b("pageLifeCycle", str, "CommonConfigRule.coldLaunchedCheck.enable=" + a2);
        return a2;
    }

    public static boolean a(PopRequest popRequest) {
        KeepModel keepModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9690e78", new Object[]{popRequest})).booleanValue();
        }
        try {
            BaseConfigItem c = com.alibaba.poplayer.trigger.d.c(popRequest);
            if (c.isAppMode() && (keepModel = c.keepConfigs) != null && keepModel.isValid()) {
                UriModel uriModel = null;
                Iterator<UriModel> it = keepModel.pages.iterator();
                while (true) {
                    if (it.hasNext()) {
                        UriModel next = it.next();
                        if (next != null && next.isValid() && next.uris.contains(InternalTriggerController.d())) {
                            uriModel = next;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                return KeepModel.STRATEGY_WHITE_LIST.equals(keepModel.strategy) ? uriModel != null : !KeepModel.STRATEGY_BLACK_LIST.equals(keepModel.strategy) || uriModel == null;
            }
            return true;
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("LMAppModeCheck.error.", th);
            return true;
        }
    }
}
