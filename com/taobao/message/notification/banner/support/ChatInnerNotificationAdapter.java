package com.taobao.message.notification.banner.support;

import android.app.Activity;
import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.android.nav.Nav;
import com.taobao.message.notification.banner.InnerNotificationAdapter;
import com.taobao.message.notification.banner.InnerPushVO;
import com.taobao.message.notification.banner.view.DefaultBannerView;
import com.taobao.message.notification.constans.SettingContants;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.message.notification.util.ParseUtil;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import tb.kge;

/* loaded from: classes7.dex */
public class ChatInnerNotificationAdapter extends InnerNotificationAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mBizType;
    private String mMsgId;
    private String mMsgType;
    private String mTemplateId;
    private long mTime;
    private String mUrl;

    static {
        kge.a(-1218867040);
    }

    public static /* synthetic */ Object ipc$super(ChatInnerNotificationAdapter chatInnerNotificationAdapter, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1912803358) {
            super.onClick((View) objArr[0]);
            return null;
        } else if (hashCode == -1865040893) {
            super.onShow();
            return null;
        } else if (hashCode != -893949262) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDismiss();
            return null;
        }
    }

    public ChatInnerNotificationAdapter(Context context, InnerPushVO innerPushVO) {
        super(context, innerPushVO);
        Map<String, String> parseBody = ParseUtil.parseBody(innerPushVO.mParam.getString(AgooConstants.MESSAGE_BODY));
        if (parseBody != null) {
            this.mMsgId = parseBody.get("messageId");
            this.mBizType = parseBody.get("bizType");
            this.mTemplateId = parseBody.get("templateId");
            this.mMsgType = parseBody.get("msg_type_id");
            this.mUrl = parseBody.get(d.BUNDLE_BUSINESS_JUMP_URL);
            if (TextUtils.isEmpty(this.mUrl)) {
                this.mUrl = parseBody.get("url");
            }
        }
        this.mTime = System.currentTimeMillis();
        onInitUT();
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public boolean needShow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47da8fbe", new Object[]{this})).booleanValue() : PreferenceManager.getDefaultSharedPreferences(this.mContext.getApplicationContext()).getInt(SettingContants.IS_IM_NOTIFICATION, 1) == 1;
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        DefaultBannerView.ViewDataModel viewDataModel = new DefaultBannerView.ViewDataModel();
        viewDataModel.mContext = this.mContext.getApplicationContext();
        viewDataModel.mIcon = this.mVO.iconUrl;
        viewDataModel.mTitle = this.mVO.title;
        viewDataModel.mContent = this.mVO.content;
        viewDataModel.mGoodsUrl = this.mVO.img;
        viewDataModel.mTime = this.mTime;
        return DefaultBannerView.build(viewDataModel).getView();
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        super.onShow();
        onShowUT();
    }

    public void onInitUT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d813dff5", new Object[]{this});
            return;
        }
        TBS.Ext.commitEvent("Page_Extend", 2201, "SendTaoMessage", "Type=" + this.mMsgType, "msgid=" + this.mMsgId, "isBackground=" + EnvUtil.isAppBackGround());
    }

    public void onShowUT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7517022", new Object[]{this});
            return;
        }
        EnvUtil.UTShow(EnvUtil.createUTData("agoo^cc^" + this.mMsgId, this.mMsgId, this.mBizType, "1", this.mTemplateId, String.valueOf(this.mVO.mParam != null ? this.mVO.mParam.get("source") : null), null), 1, null);
        TBS.Ext.commitEvent("Page_Extend", 2001, "ShowTaoMessage", "Type=" + this.mBizType, "msgid=" + this.mMsgId, "isBackground=" + EnvUtil.isAppBackGround());
    }

    public void onClickUT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1d2fcf", new Object[]{this});
            return;
        }
        EnvUtil.UTClick(EnvUtil.createUTData("agoo^cc^" + this.mMsgId, this.mMsgId, this.mBizType, "1", this.mTemplateId, String.valueOf(this.mVO.mParam != null ? this.mVO.mParam.get("source") : null), null), 1, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("clickTime", (Object) String.valueOf(System.currentTimeMillis()));
        jSONObject.put(PushConstants.KEY_PUSH_ID, (Object) ("agoo^0^" + this.mMsgId));
        jSONObject.put("messageId", (Object) this.mMsgId);
        jSONObject.put("bizType", (Object) this.mBizType);
        jSONObject.put("messageType", (Object) this.mTemplateId);
        jSONObject.put("innerPush", (Object) "1");
        jSONObject.put("pushMsgId", (Object) ("sync^cc^" + this.mMsgId));
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(jSONObject.toJSONString());
        TBS.Ext.commitEvent("Page_Extend", 2101, "ClickTaoMessage", "Type=" + this.mBizType, "msgid=" + this.mMsgId, "isBackground=" + EnvUtil.isAppBackGround());
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public void onDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
        } else {
            super.onDismiss();
        }
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        super.onClick(view);
        onClickUT();
        Activity topActivity = EnvUtil.getTopActivity();
        String urlSplicingFromParam = ParseUtil.urlSplicingFromParam(this.mUrl);
        if (topActivity != null) {
            if (topActivity.isFinishing()) {
                return;
            }
            Nav.from(topActivity).withFlags(65536).disableTransition().toUri(urlSplicingFromParam);
            return;
        }
        Nav.from(this.mContext.getApplicationContext()).disableTransition().withFlags(65536).toUri(urlSplicingFromParam);
    }
}
