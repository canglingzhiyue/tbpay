package com.alipay.android.msp.core.frame;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.AlertIntelligenceEngine;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspContainerContext;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventCreator;
import com.alipay.android.msp.framework.exception.DataErrorException;
import com.alipay.android.msp.framework.statistics.userfeedback.UserFeedBackUtil;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.widget.MspDialogHelper;
import com.alipay.android.msp.utils.ExceptionUtils;
import com.alipay.android.msp.utils.FingerDataUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class MspWindowFrameDispatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final MspContext f4547a;

    public MspWindowFrameDispatcher(MspContext mspContext) {
        this.f4547a = mspContext;
        UserFeedBackUtil.getInstance().setUserFeedBackTag(null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:6|(1:8)(1:169)|9|(3:11|12|13)(1:168)|14|(1:16)(1:161)|17|(2:19|(30:21|(1:23)(1:159)|24|25|(9:27|(1:29)|30|(1:32)|33|35|36|(2:38|(4:40|41|42|(1:44)))|153)(1:156)|46|47|48|(1:50)|51|(1:53)|54|(1:56)(1:146)|57|58|(5:60|(1:62)|63|(3:66|67|64)|68)|70|(2:74|(1:78))|79|(2:81|(1:83))|84|(1:86)(1:143)|87|(3:89|(1:91)(1:102)|(1:(1:101))(2:95|96))|103|(3:113|114|(2:116|117))|121|(5:129|130|131|132|(2:134|135))|141|142))|160|(0)(0)|24|25|(0)(0)|46|47|48|(0)|51|(0)|54|(0)(0)|57|58|(0)|70|(3:72|74|(2:76|78))|79|(0)|84|(0)(0)|87|(0)|103|(7:105|107|109|111|113|114|(0))|121|(7:123|127|129|130|131|132|(0))|141|142) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0130, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0131, code lost:
        r17 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0196, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0198, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0199, code lost:
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019a, code lost:
        com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf A[Catch: Exception -> 0x0130, TryCatch #0 {Exception -> 0x0130, blocks: (B:34:0x00b9, B:36:0x00bf, B:38:0x00cb, B:39:0x00e0, B:41:0x00e9, B:42:0x00f3), top: B:159:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0143 A[Catch: Exception -> 0x0198, TryCatch #3 {Exception -> 0x0198, blocks: (B:62:0x0138, B:64:0x0143, B:65:0x014a, B:67:0x0150, B:68:0x0157), top: B:165:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0150 A[Catch: Exception -> 0x0198, TryCatch #3 {Exception -> 0x0198, blocks: (B:62:0x0138, B:64:0x0143, B:65:0x014a, B:67:0x0150, B:68:0x0157), top: B:165:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0168 A[Catch: Exception -> 0x0196, TryCatch #4 {Exception -> 0x0196, blocks: (B:72:0x0160, B:74:0x0168, B:76:0x0170, B:77:0x0176, B:78:0x017e, B:80:0x0184), top: B:167:0x0160 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean parseRendDataFromUIShow(com.alibaba.fastjson.JSONObject r19, boolean r20, com.alipay.android.msp.framework.statisticsv2.model.StEvent r21) throws com.alipay.android.msp.framework.exception.MspServerErrorException, com.alipay.android.msp.framework.exception.DataErrorException {
        /*
            Method dump skipped, instructions count: 793
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.core.frame.MspWindowFrameDispatcher.parseRendDataFromUIShow(com.alibaba.fastjson.JSONObject, boolean, com.alipay.android.msp.framework.statisticsv2.model.StEvent):boolean");
    }

    private synchronized void a(JSONObject jSONObject, boolean z, StEvent stEvent, String str) throws DataErrorException {
        String str2;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3940f2f", new Object[]{this, jSONObject, new Boolean(z), stEvent, str});
        } else if (jSONObject == null) {
            LogUtil.e("MspWindowFrameDispatcher", "createWindowFrame", "params is null");
        } else {
            MspDialogHelper mspDialogHelper = this.f4547a.getMspDialogHelper();
            if (mspDialogHelper != null) {
                mspDialogHelper.setKeepLoading(false);
            }
            MspWindowFrame mspWindowFrame = new MspWindowFrame();
            JSONObject jSONObject2 = jSONObject.getJSONObject(MspFlybirdDefine.FLYBIRD_ONLOAD);
            if (jSONObject2 != null) {
                EventAction createMspEvent = MspEventCreator.get().createMspEvent("MspWindowFrameDispatcher.createWindowFrame", jSONObject2);
                if (createMspEvent != null) {
                    if (jSONObject.containsKey(MspFlybirdDefine.FLYBIRD_AJAX)) {
                        createMspEvent.setAjax(jSONObject.getIntValue(MspFlybirdDefine.FLYBIRD_AJAX) == 1);
                    }
                    if (createMspEvent.isDelayEventType()) {
                        createMspEvent.setDelayTime(300);
                    }
                    ActionsCreator.get(this.f4547a).createEventActionThisThread(createMspEvent);
                }
                mspWindowFrame.setOnLoadData(jSONObject2);
            }
            if ((this.f4547a instanceof MspTradeContext) && ((MspTradeContext) this.f4547a).getTradeLogicData().isViChannelMode() && !jSONObject.toJSONString().contains("VIData")) {
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                if (z) {
                    jSONObject4.put("channelError", (Object) "-1002");
                } else {
                    jSONObject4.put("channelError", (Object) "-1001");
                }
                jSONObject3.put("data", (Object) jSONObject4);
                PluginManager.getRender().callRender(jSONObject3.toString());
            }
            long j = 0;
            if (jSONObject.containsKey("wnd")) {
                mspWindowFrame.setStatisticEvent(stEvent);
                JSONObject jSONObject5 = jSONObject.getJSONObject("wnd");
                j = jSONObject5.getIntValue("time");
                mspWindowFrame.setWindowData(jSONObject5);
                if (MspFlybirdDefine.FLYBIRD_WIN_TYPE_DIALOG.equals(jSONObject5.getString("type"))) {
                    mspWindowFrame.setWindowType(13);
                } else {
                    mspWindowFrame.setWindowType(12);
                    if (jSONObject.containsKey(MspFlybirdDefine.FLYBIRD_AJAX)) {
                        mspWindowFrame.setAjax(jSONObject.getIntValue(MspFlybirdDefine.FLYBIRD_AJAX));
                    }
                }
                a(mspWindowFrame, jSONObject, z, str);
            } else {
                z2 = false;
            }
            if (!jSONObject.containsKey("tpl") && !jSONObject.containsKey(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID)) {
                if (jSONObject.containsKey("page")) {
                    mspWindowFrame.setStatisticEvent(stEvent);
                    JSONObject jSONObject6 = jSONObject.getJSONObject("page");
                    mspWindowFrame.setWindowData(jSONObject6);
                    mspWindowFrame.setWindowType(14);
                    JSONObject jSONObject7 = jSONObject6.getJSONObject("data");
                    if (jSONObject7 != null) {
                        mspWindowFrame.setUserId(jSONObject7.getString("userId"));
                    }
                    mspWindowFrame.setDelayTime(j);
                    a(mspWindowFrame, jSONObject, z, str);
                    return;
                } else if (z2) {
                    return;
                } else {
                    LogUtil.record(8, "MspWindowFrameDispatcher.createWindowFrame", "frameRecognized=false");
                    LogUtil.record(8, "MspWindowFrameDispatcher#unkown", jSONObject.toJSONString());
                    String localizedStringForKey = LanguageHelper.localizedStringForKey("mini_app_error", this.f4547a.getContext().getString(R.string.mini_app_error), new Object[0]);
                    if (jSONObject != null) {
                        String string = jSONObject.getString("msg");
                        String string2 = (!TextUtils.isEmpty(string) || !jSONObject.containsKey(MUSAppMonitor.ERROR_MSG)) ? string : jSONObject.getString(MUSAppMonitor.ERROR_MSG);
                        if (TextUtils.isEmpty(string2)) {
                            string2 = localizedStringForKey;
                        }
                        str2 = ExceptionUtils.createExceptionMsg(string2, 302);
                    } else {
                        str2 = "data null";
                    }
                    throw new DataErrorException(str2);
                }
            }
            mspWindowFrame.setStatisticEvent(stEvent);
            mspWindowFrame.setTplString(jSONObject.getString("tpl"));
            if (jSONObject.containsKey(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID)) {
                mspWindowFrame.setTplId(jSONObject.getString(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID));
            }
            if (jSONObject.containsKey("data")) {
                JSONObject jSONObject8 = jSONObject.getJSONObject("data");
                String str3 = null;
                if (jSONObject8 != null) {
                    str3 = jSONObject8.getString("userId");
                    mspWindowFrame.setUserId(str3);
                }
                String fingerUserStatus = FingerDataUtil.getFingerUserStatus(jSONObject8, str3);
                if (jSONObject8 != null && !TextUtils.isEmpty(fingerUserStatus)) {
                    jSONObject8.put(MspFlybirdDefine.FLYBIRD_LOCALDATA_FINGER_STATUS, (Object) fingerUserStatus);
                }
                mspWindowFrame.setTemplateContentData(jSONObject8);
            }
            mspWindowFrame.setWindowType(11);
            mspWindowFrame.setDelayTime(j);
            a(mspWindowFrame, jSONObject, z, str);
        }
    }

    private void a(final MspWindowFrame mspWindowFrame, JSONObject jSONObject, boolean z, String str) {
        JSONObject windowData;
        String str2;
        JSONObject templateContentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e139d9c", new Object[]{this, mspWindowFrame, jSONObject, new Boolean(z), str});
            return;
        }
        final MspUIClient mspUIClient = this.f4547a.getMspUIClient();
        if (mspUIClient == null) {
            return;
        }
        mspWindowFrame.setFromSync(z);
        mspWindowFrame.setBizId(this.f4547a.getBizId());
        mspWindowFrame.setDataChannelValue(str);
        if (jSONObject.containsKey(MspFlybirdDefine.FLYBIRD_NOBACK)) {
            mspWindowFrame.setNoBackTag(jSONObject.getIntValue(MspFlybirdDefine.FLYBIRD_NOBACK));
        }
        MspContext mspContext = this.f4547a;
        if (mspContext instanceof MspContainerContext) {
            MspContainerContext.fillStartupParams(mspWindowFrame, (MspContainerContext) mspContext);
            MspContainerContext.fillSceneParams(mspWindowFrame, (MspContainerContext) this.f4547a);
        }
        LogUtil.record(2, "phonecashiermsp#flybird", "MspWindowFrameDispatcher.createWindowFrame", " frame=".concat(String.valueOf(mspWindowFrame)));
        if (!TextUtils.isEmpty(mspWindowFrame.getUserId())) {
            this.f4547a.setServerFoundUserId(mspWindowFrame.getUserId());
        }
        if (this.f4547a.isBizAppCollectMoneyPage) {
            PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "PAGE_DATA_PARSE");
            PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "PAGE_DATA_START");
        }
        String str3 = "";
        if (mspWindowFrame.getWindowType() == 11) {
            if (mspWindowFrame.getTplId() != null && (templateContentData = mspWindowFrame.getTemplateContentData()) != null) {
                str3 = templateContentData.getString("bizErrorCode");
            }
        } else if (mspWindowFrame.getWindowType() == 13 && (windowData = mspWindowFrame.getWindowData()) != null) {
            str3 = windowData.getString("bizErrorCode");
        }
        if (!TextUtils.isEmpty(str3)) {
            AlertIntelligenceEngine.startAction(this.f4547a, "err", "se_".concat(String.valueOf(str3)), mspWindowFrame.getFrameId(), mspWindowFrame.getTplId());
        } else if (MspFlybirdDefine.FLYBIRD_ERROR_TPL.equals(mspWindowFrame.getTplId())) {
            JSONObject templateContentData2 = mspWindowFrame.getTemplateContentData();
            if (templateContentData2 != null) {
                if (templateContentData2.containsKey("title")) {
                    str2 = templateContentData2.getString("title");
                } else if (templateContentData2.containsKey("msg")) {
                    str2 = templateContentData2.getString("msg");
                }
                AlertIntelligenceEngine.startAction(this.f4547a, "err", str2, mspWindowFrame.getFrameId(), mspWindowFrame.getTplId());
            }
            str2 = "兜底";
            AlertIntelligenceEngine.startAction(this.f4547a, "err", str2, mspWindowFrame.getFrameId(), mspWindowFrame.getTplId());
        }
        if (mspWindowFrame.getDelayTime() > 0) {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.frame.MspWindowFrameDispatcher.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        mspUIClient.getFrameStack().pushFrame(mspWindowFrame);
                    }
                }
            }, mspWindowFrame.getDelayTime());
        } else {
            mspUIClient.getFrameStack().pushFrame(mspWindowFrame);
        }
    }
}
