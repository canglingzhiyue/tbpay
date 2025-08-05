package com.taobao.share.core.contacts.control;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.contacts.data.member.ContactMember;
import com.taobao.contacts.data.member.ShareResultMember;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.core.contacts.mtop.request.NewShareCheckApi;
import com.taobao.share.core.contacts.mtop.request.NewShareFriendsApi;
import com.taobao.share.core.contacts.mtop.response.ComTaobaoMclContactsSendshareResponse;
import com.taobao.share.core.contacts.mtop.response.ComTaobaoMclContactsSendshareResponseData;
import com.taobao.share.core.contacts.mtop.response.ShareCheckResponse;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.b;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.R;
import com.ut.share.ShareServiceApi;
import com.ut.share.business.ShareTargetType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.regex.Pattern;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.nyh;
import tb.nyl;
import tb.nym;
import tb.nyu;
import tb.nyy;

/* loaded from: classes8.dex */
public class ContactsSendShareBusiness implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ENCRYPTED_API_NAME = "mtop.taobao.aris.share.sendShareContactMsg";
    private static final String ERROR_CODE_KEY = "errorCode";
    private static final String ERROR_MESSAGE_KEY = "errorMsg";
    private static final String TAG = "ContactsSendShareBusiness";
    private String itemUrl;
    private Context mContext;
    private a mListener;
    private String msgType;
    private String remark;
    private String sendName;
    private String sendUrl;
    private com.taobao.share.core.contacts.control.a shareController;
    private String toId;
    private String toMobile;
    private final int SEND_SHARE = 101;
    private Toast preToast = null;
    private HashMap<String, ContactMember> sendMap = new HashMap<>();

    /* loaded from: classes8.dex */
    public interface a {
        void a();

        void a(ComTaobaoMclContactsSendshareResponseData comTaobaoMclContactsSendshareResponseData);
    }

    static {
        kge.a(-1515509021);
        kge.a(-525336021);
    }

    public static /* synthetic */ void access$000(ContactsSendShareBusiness contactsSendShareBusiness, String str, List list, List list2, List list3, TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85f86bad", new Object[]{contactsSendShareBusiness, str, list, list2, list3, tBShareContent});
        } else {
            contactsSendShareBusiness.shareWithMtop(str, list, list2, list3, tBShareContent);
        }
    }

    public static /* synthetic */ String access$100(ContactsSendShareBusiness contactsSendShareBusiness) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("53136d3c", new Object[]{contactsSendShareBusiness}) : contactsSendShareBusiness.sendUrl;
    }

    public static /* synthetic */ String access$102(ContactsSendShareBusiness contactsSendShareBusiness, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3380dbf0", new Object[]{contactsSendShareBusiness, str});
        }
        contactsSendShareBusiness.sendUrl = str;
        return str;
    }

    public static /* synthetic */ String access$200(ContactsSendShareBusiness contactsSendShareBusiness) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8b04485b", new Object[]{contactsSendShareBusiness}) : contactsSendShareBusiness.remark;
    }

    public static /* synthetic */ void access$300(ContactsSendShareBusiness contactsSendShareBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fcb19e6", new Object[]{contactsSendShareBusiness});
        } else {
            contactsSendShareBusiness.storeShareInfo();
        }
    }

    public static /* synthetic */ a access$400(ContactsSendShareBusiness contactsSendShareBusiness) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f2b0375e", new Object[]{contactsSendShareBusiness}) : contactsSendShareBusiness.mListener;
    }

    public static /* synthetic */ Context access$500(ContactsSendShareBusiness contactsSendShareBusiness) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("59300ee0", new Object[]{contactsSendShareBusiness}) : contactsSendShareBusiness.mContext;
    }

    public ContactsSendShareBusiness(Context context, com.taobao.share.core.contacts.control.a aVar, a aVar2) {
        this.mContext = context;
        this.shareController = aVar;
        this.mListener = aVar2;
    }

    public HashMap<String, ContactMember> getSendMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("7119c028", new Object[]{this}) : this.sendMap;
    }

    public void startShare(ArrayList<ContactMember> arrayList, String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32592e4", new Object[]{this, arrayList, str, str2, str3});
            return;
        }
        TBS.Page.ctrlClicked(CT.Button, "ContactsShare");
        if (arrayList == null || arrayList.size() > 5 || arrayList.size() <= 0) {
            return;
        }
        this.msgType = str3;
        this.sendName = str;
        this.remark = str2;
        String name = arrayList.get(0).getName();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i = 0;
        while (true) {
            str4 = "";
            if (i >= arrayList.size()) {
                break;
            }
            ContactMember contactMember = arrayList.get(i);
            if (!TextUtils.isEmpty(contactMember.getUserId())) {
                arrayList2.add(contactMember.getUserId());
                this.sendMap.put(contactMember.getUserId(), contactMember);
            } else if (!TextUtils.isEmpty(contactMember.getUniqueId())) {
                arrayList2.add(contactMember.getUniqueId());
                this.sendMap.put(contactMember.getUniqueId(), contactMember);
            }
            if (!TextUtils.isEmpty(contactMember.getCcode())) {
                arrayList3.add(contactMember.getCcode());
                this.sendMap.put(contactMember.getCcode(), contactMember);
            }
            if (!TextUtils.isEmpty(contactMember.getNumber())) {
                ShareResultMember shareResultMember = new ShareResultMember();
                shareResultMember.setName(contactMember.getName());
                shareResultMember.setPhone(Pattern.compile("[^0-9]").matcher(contactMember.getNumber()).replaceAll(str4).trim());
                arrayList4.add(shareResultMember);
            }
            i++;
        }
        TBShareContent j = e.b().j();
        if (j != null) {
            TBS.Ext.commitEvent(5002, j.businessId, "Contacts", j.url, j.originUTArgs());
            Properties properties = new Properties();
            properties.put("Type", "contacts");
            if (j.businessId != null) {
                str4 = j.businessId;
            }
            properties.put("bizID", str4);
            j.fillUTProperties(properties);
            TBS.Ext.commitEvent("ShareTypes", properties);
        }
        sendShare(name, arrayList4, arrayList2, arrayList3);
        saveRecentShare(arrayList);
    }

    private void saveRecentShare(ArrayList<ContactMember> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad4df4dc", new Object[]{this, arrayList});
            return;
        }
        com.taobao.share.core.contacts.control.a aVar = this.shareController;
        if (aVar == null) {
            return;
        }
        aVar.a(arrayList);
    }

    private void sendShare(final String str, final List<ShareResultMember> list, final List<String> list2, final List<String> list3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c1dd5b", new Object[]{this, str, list, list2, list3});
            return;
        }
        final TBShareContent j = e.b().j();
        if (j == null) {
            return;
        }
        this.itemUrl = ShareServiceApi.urlBackFlow(j.businessId, "Contacts", j.url);
        sendSceeenShot(j, list2, list3);
        if (!nyl.g()) {
            shareWithMtop(str, list, list2, list3, j);
            nyy.c(TAG, "SendMsgBridge#sendShareToMsgClient :isNeedCheckShare false");
            return;
        }
        RemoteBusiness remoteBusiness = (RemoteBusiness) RemoteBusiness.build(this.mContext, getNewShareCheckAPiRequest(str, list, list2, list3, j), ShareBizAdapter.getInstance().getAppEnv().a()).mo1305reqMethod(MethodEnum.POST);
        remoteBusiness.mo1335useWua();
        remoteBusiness.registeListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.share.core.contacts.control.ContactsSendShareBusiness.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                ContactsSendShareBusiness.access$000(ContactsSendShareBusiness.this, str, list, list2, list3, j);
                nyy.c(ContactsSendShareBusiness.TAG, "SendMsgBridge#sendShareToMsgClient :onSystemError");
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (baseOutDo != null && baseOutDo.mo2429getData() != null && (baseOutDo.mo2429getData() instanceof ShareCheckResponse.ShareCheckResponseData)) {
                    ShareCheckResponse.ShareCheckResponseData shareCheckResponseData = (ShareCheckResponse.ShareCheckResponseData) baseOutDo.mo2429getData();
                    if (!TextUtils.isEmpty(shareCheckResponseData.sendUrl)) {
                        ContactsSendShareBusiness.access$102(ContactsSendShareBusiness.this, shareCheckResponseData.sendUrl);
                        j.url = ContactsSendShareBusiness.access$100(ContactsSendShareBusiness.this);
                    }
                    if (shareCheckResponseData.canSend) {
                        try {
                            if (ShareBizAdapter.getInstance().getFriendsProvider().a(ContactsSendShareBusiness.access$200(ContactsSendShareBusiness.this), j, list, list2, list3)) {
                                nyy.b(ContactsSendShareBusiness.TAG, "SendMsgBridge#sendShareToMsgClient :suc");
                                ContactsSendShareBusiness.access$300(ContactsSendShareBusiness.this);
                                if (ContactsSendShareBusiness.access$400(ContactsSendShareBusiness.this) == null) {
                                    return;
                                }
                                ContactsSendShareBusiness.access$400(ContactsSendShareBusiness.this).a(null);
                                return;
                            }
                            ContactsSendShareBusiness.access$000(ContactsSendShareBusiness.this, str, list, list2, list3, j);
                            nyy.c(ContactsSendShareBusiness.TAG, "SendMsgBridge#sendShareToMsgClient :msg send fail use aris api");
                        } catch (Exception e) {
                            ContactsSendShareBusiness.access$000(ContactsSendShareBusiness.this, str, list, list2, list3, j);
                            nyy.c(ContactsSendShareBusiness.TAG, "SendMsgBridge#sendShareToMsgClient :msg send fail use aris api err:" + e.getMessage());
                        }
                    } else if (TextUtils.isEmpty(shareCheckResponseData.noSendMsg)) {
                        ContactsSendShareBusiness.access$000(ContactsSendShareBusiness.this, str, list, list2, list3, j);
                        nyy.c(ContactsSendShareBusiness.TAG, "SendMsgBridge#sendShareToMsgClient :canSend false other");
                    } else if (OrangeConfig.getInstance().getConfig("android_share", "checkMessageCode", "").contains(shareCheckResponseData.noSendCode)) {
                        if (!TextUtils.isEmpty(shareCheckResponseData.noSendMsg)) {
                            nyu.a(ContactsSendShareBusiness.access$500(ContactsSendShareBusiness.this), shareCheckResponseData.noSendMsg);
                        }
                        if (ContactsSendShareBusiness.access$400(ContactsSendShareBusiness.this) != null) {
                            ContactsSendShareBusiness.access$400(ContactsSendShareBusiness.this).a();
                        }
                        nyy.c(ContactsSendShareBusiness.TAG, "SendMsgBridge#sendShareToMsgClient :canSend false :" + shareCheckResponseData.noSendCode);
                    } else if ("SAFEHANDER".equals(shareCheckResponseData.noSendCode) || "TIREDNESS_CONTROL_OVER".equals(shareCheckResponseData.noSendCode)) {
                        if (!TextUtils.isEmpty(shareCheckResponseData.noSendMsg)) {
                            nyu.a(ContactsSendShareBusiness.access$500(ContactsSendShareBusiness.this), shareCheckResponseData.noSendMsg);
                        }
                        if (ContactsSendShareBusiness.access$400(ContactsSendShareBusiness.this) != null) {
                            ContactsSendShareBusiness.access$400(ContactsSendShareBusiness.this).a();
                        }
                        nyy.c(ContactsSendShareBusiness.TAG, "SendMsgBridge#sendShareToMsgClient :canSend false :" + shareCheckResponseData.noSendCode);
                    } else if ("INTERCEPT".equals(shareCheckResponseData.noSendCode)) {
                        ContactsSendShareBusiness.access$000(ContactsSendShareBusiness.this, str, list, list2, list3, j);
                        nyy.c(ContactsSendShareBusiness.TAG, "SendMsgBridge#sendShareToMsgClient :canSend false INTERCEPT");
                    } else {
                        ContactsSendShareBusiness.access$000(ContactsSendShareBusiness.this, str, list, list2, list3, j);
                        nyy.c(ContactsSendShareBusiness.TAG, "SendMsgBridge#sendShareToMsgClient :canSend false other");
                    }
                } else {
                    ContactsSendShareBusiness.access$000(ContactsSendShareBusiness.this, str, list, list2, list3, j);
                    nyy.c(ContactsSendShareBusiness.TAG, "SendMsgBridge#sendShareToMsgClient :res null");
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                ContactsSendShareBusiness.access$000(ContactsSendShareBusiness.this, str, list, list2, list3, j);
                nyy.c(ContactsSendShareBusiness.TAG, "SendMsgBridge#sendShareToMsgClient :onError");
            }
        });
        remoteBusiness.mo1340setBizId(37);
        remoteBusiness.startRequest(101, ShareCheckResponse.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1 A[Catch: Throwable -> 0x010a, TryCatch #0 {Throwable -> 0x010a, blocks: (B:6:0x001d, B:8:0x0025, B:10:0x002b, B:12:0x0038, B:14:0x0042, B:15:0x0052, B:17:0x0058, B:19:0x0060, B:21:0x0066, B:22:0x006e, B:24:0x0074, B:25:0x0079, B:27:0x0088, B:32:0x00a0, B:34:0x00a6, B:38:0x00b1, B:39:0x00b7, B:28:0x0090, B:30:0x0096), top: B:44:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void sendSceeenShot(com.taobao.share.globalmodel.TBShareContent r12, java.util.List<java.lang.String> r13, java.util.List<java.lang.String> r14) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.share.core.contacts.control.ContactsSendShareBusiness.sendSceeenShot(com.taobao.share.globalmodel.TBShareContent, java.util.List, java.util.List):void");
    }

    private void shareWithMtop(String str, List<ShareResultMember> list, List<String> list2, List<String> list3, TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fdf5bc", new Object[]{this, str, list, list2, list3, tBShareContent});
        } else {
            shareWithNewApi(str, list, list2, list3, tBShareContent);
        }
    }

    private void shareWithNewApi(String str, List<ShareResultMember> list, List<String> list2, List<String> list3, TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d381572a", new Object[]{this, str, list, list2, list3, tBShareContent});
            return;
        }
        NewShareFriendsApi newShareFriendsApi = new NewShareFriendsApi();
        if (nyh.a().equals("2")) {
            newShareFriendsApi.setAPI_NAME(ENCRYPTED_API_NAME);
        }
        newShareFriendsApi.setShareItemId(e.b().f());
        newShareFriendsApi.setShareRemark(this.remark);
        newShareFriendsApi.setFriendName(str);
        newShareFriendsApi.setShareSendName(this.sendName);
        newShareFriendsApi.setSharePicUrl(tBShareContent.imageUrl);
        newShareFriendsApi.setActivityId(tBShareContent.businessId);
        newShareFriendsApi.setShareRequestId(tBShareContent.shareId);
        newShareFriendsApi.setShareDesc(tBShareContent.description);
        newShareFriendsApi.setShareUrl(TextUtils.isEmpty(this.sendUrl) ? this.itemUrl : this.sendUrl);
        newShareFriendsApi.setShareType(tBShareContent.shareScene);
        this.msgType = "1";
        newShareFriendsApi.setMsgType(this.msgType);
        String jSONString = list.isEmpty() ? "" : JSONObject.toJSONString(list);
        newShareFriendsApi.setContacts(jSONString);
        this.toMobile = jSONString;
        StringBuilder sb = new StringBuilder();
        if (list2 != null && !list2.isEmpty()) {
            sb.append(TextUtils.join(",", list2.toArray()));
            newShareFriendsApi.setTaoFriends(TextUtils.join(",", list2.toArray()));
        }
        if (list3 != null && !list3.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(TextUtils.join(",", list3.toArray()));
            newShareFriendsApi.setGroupIds(TextUtils.join(",", list3.toArray()));
        }
        this.toId = sb.toString();
        HashMap hashMap = new HashMap();
        if (tBShareContent.extraParams != null && tBShareContent.extraParams.size() > 0) {
            hashMap.putAll(tBShareContent.extraParams);
        }
        if (tBShareContent.activityParams != null && tBShareContent.activityParams.size() > 0) {
            hashMap.putAll(tBShareContent.activityParams);
        }
        if (hashMap.size() > 0) {
            newShareFriendsApi.setExtendInfo(JSON.toJSONString(hashMap));
        }
        RemoteBusiness registeListener = ((RemoteBusiness) RemoteBusiness.build(this.mContext, newShareFriendsApi, ShareBizAdapter.getInstance().getAppEnv().a()).mo1305reqMethod(MethodEnum.POST).mo1335useWua()).registeListener((MtopListener) this);
        registeListener.mo1340setBizId(37);
        registeListener.startRequest(101, ComTaobaoMclContactsSendshareResponse.class);
    }

    private void storeShareInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5bb3d3", new Object[]{this});
            return;
        }
        e.b().a("contacts_remark", this.remark);
        e.b().a("contacts_sendName", this.sendName);
        e.b().a("contacts_toMobile", this.toMobile);
        e.b().a("contacts_toId", this.toId);
        b.a(ShareTargetType.Share2Contact.getValue());
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        String retCode = mtopResponse.getRetCode();
        String retMsg = mtopResponse.getRetMsg();
        TLog.logi(TAG, "errCode : " + retCode + " errMsg :" + retMsg);
        AppMonitor.Alarm.commitFail("ContactsShare", "ContactsShare", retCode, retMsg);
        a aVar = this.mListener;
        if (aVar != null) {
            aVar.a();
        }
        shareModuleCallback(null, retCode, retMsg);
        if (mtopResponse.isSystemError() || mtopResponse.isExpiredRequest() || mtopResponse.is41XResult() || mtopResponse.isApiLockedResult()) {
            retMsg = com.alibaba.ability.localization.b.a(R.string.share_server_busy);
        } else if ((mtopResponse.getResponseCode() != 200 || mtopResponse.getRetCode().startsWith("FAIL_SYS_")) && !"TIREDNESS_CONTROL_OVER".equals(retCode)) {
            retMsg = com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18286);
        }
        Toast toast = this.preToast;
        if (toast != null) {
            toast.cancel();
        }
        Toast makeText = Toast.makeText(nym.a(), retMsg, 0);
        makeText.setGravity(17, 0, 0);
        makeText.show();
        this.preToast = makeText;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (i <= 0 || baseOutDo == null) {
        } else {
            AppMonitor.Alarm.commitSuccess("ContactsShare", "ContactsShare");
            org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
            if (dataJsonObject != null) {
                shareModuleCallback(dataJsonObject.toString(), null, null);
            }
            ComTaobaoMclContactsSendshareResponseData comTaobaoMclContactsSendshareResponseData = (ComTaobaoMclContactsSendshareResponseData) baseOutDo.mo2429getData();
            if (comTaobaoMclContactsSendshareResponseData == null) {
                Toast.makeText(nym.a(), com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18300), 0).show();
                return;
            }
            storeShareInfo();
            a aVar = this.mListener;
            if (aVar == null) {
                return;
            }
            aVar.a(comTaobaoMclContactsSendshareResponseData);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        String retMsg;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        if (mtopResponse == null) {
            retMsg = com.alibaba.ability.localization.b.a(R.string.app_load_failed);
        } else {
            retMsg = mtopResponse.getRetMsg();
        }
        if (mtopResponse != null) {
            AppMonitor.Alarm.commitFail("ContactsShare", "ContactsShare", mtopResponse.getRetCode(), mtopResponse.getRetMsg());
        } else {
            AppMonitor.Alarm.commitFail("ContactsShare", "ContactsShare", "null response", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18284));
        }
        a aVar = this.mListener;
        if (aVar != null) {
            aVar.a();
        }
        shareModuleCallback(null, mtopResponse.getRetCode(), mtopResponse.getRetMsg());
        Toast toast = this.preToast;
        if (toast != null) {
            toast.cancel();
        }
        Toast makeText = Toast.makeText(nym.a(), retMsg, 0);
        makeText.setGravity(17, 0, 0);
        makeText.show();
        this.preToast = makeText;
    }

    private void shareModuleCallback(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425bcfb5", new Object[]{this, str, str2, str3});
        } else if (!TextUtils.isEmpty(str)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            if (TextUtils.isEmpty(str2)) {
                str2 = "EMPTY_DATA";
            }
            jSONObject.put("errorCode", (Object) str2);
            if (TextUtils.isEmpty(str3)) {
                str3 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18293);
            }
            jSONObject.put("errorMsg", (Object) str3);
            jSONObject.toJSONString();
        }
    }

    private NewShareCheckApi getNewShareCheckAPiRequest(String str, List<ShareResultMember> list, List<String> list2, List<String> list3, TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NewShareCheckApi) ipChange.ipc$dispatch("7d44f31b", new Object[]{this, str, list, list2, list3, tBShareContent});
        }
        NewShareCheckApi newShareCheckApi = new NewShareCheckApi();
        newShareCheckApi.setShareItemId(e.b().f());
        newShareCheckApi.setShareRemark(this.remark);
        newShareCheckApi.setFriendName(str);
        newShareCheckApi.setShareSendName(this.sendName);
        newShareCheckApi.setSharePicUrl(tBShareContent.imageUrl);
        newShareCheckApi.setActivityId(tBShareContent.businessId);
        newShareCheckApi.setShareRequestId(tBShareContent.shareId);
        newShareCheckApi.setShareDesc(tBShareContent.description);
        newShareCheckApi.setShareUrl(this.itemUrl);
        newShareCheckApi.setShareType(tBShareContent.shareScene);
        this.msgType = "1";
        newShareCheckApi.setMsgType(this.msgType);
        String jSONString = list.isEmpty() ? "" : JSONObject.toJSONString(list);
        newShareCheckApi.setContacts(jSONString);
        this.toMobile = jSONString;
        StringBuilder sb = new StringBuilder();
        if (list2 != null && !list2.isEmpty()) {
            sb.append(TextUtils.join(",", list2.toArray()));
            newShareCheckApi.setTaoFriends(TextUtils.join(",", list2.toArray()));
        }
        if (list3 != null && !list3.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(TextUtils.join(",", list3.toArray()));
            newShareCheckApi.setGroupIds(TextUtils.join(",", list3.toArray()));
        }
        this.toId = sb.toString();
        HashMap hashMap = new HashMap();
        if (tBShareContent.extraParams != null && tBShareContent.extraParams.size() > 0) {
            hashMap.putAll(tBShareContent.extraParams);
        }
        if (tBShareContent.activityParams != null && tBShareContent.activityParams.size() > 0) {
            hashMap.putAll(tBShareContent.activityParams);
        }
        if (hashMap.size() > 0) {
            newShareCheckApi.setExtendInfo(JSON.toJSONString(hashMap));
        }
        return newShareCheckApi;
    }
}
