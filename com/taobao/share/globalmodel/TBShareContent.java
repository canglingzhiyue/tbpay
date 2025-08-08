package com.taobao.share.globalmodel;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import com.ut.share.business.WWMessageType;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import tb.kge;

/* loaded from: classes8.dex */
public class TBShareContent implements Parcelable {
    public static final String COMMON_TEMPLATE = "common";
    public static final Parcelable.Creator<TBShareContent> CREATOR;
    private static final String DESCRIPTION = "share_card_description";
    public static final String DETAIL_TEMPLATE = "detail";
    public static final String GROUP_TEMPLATE = "group";
    public static final String LIVE_TEMPLATE = "live";
    private static final String NAME_SPACE = "shareui_theme";
    public static final String SHOP_TEMPLATE = "shop";
    public static final String WEEX_TEMPLATE = "weex";
    public String _defineToolUrl;
    public String _initShareUrl;
    public String _shareBizActivityInfo;
    public Map<String, String> activityParams;
    public String activityUrl;
    public String businessId;
    public Map<String, String> businessInfo;
    public String description;
    public String detailSharePosition;
    public boolean disableBackToClient;
    public Map<String, String> extraParams;
    public String headUrl;
    @Deprecated
    public Bitmap imageSoure;
    public String imageUrl;
    public String imgPath;
    public String isActivity;
    public Map<String, String> markMap;
    public JSONObject mediaInfo;
    public JSONObject mediaPublisher;
    public String needSaveContent;
    public String openMultiTargetUrl;
    public String originBizCode;
    public List<String> phoneNumberList;
    public String popUrl;
    public JSONObject qrConfig;
    public String qrTipsTxt;
    public String screenshot;
    public String serverDataTrackMap;
    public String shareId;
    public String shareScene;
    public String smsTemplate;
    public List<String> snapshotImages;
    public String suId;
    public String templateId;
    public Map<String, Object> templateParams;
    public String title;
    public String url;
    public String weixinAppId;
    public String weixinMsgType;
    public WWMessageType wwMsgType;
    public boolean disableQrcode = false;
    public boolean disableTextInfo = false;
    public boolean disableHeadUrl = false;
    public String maskAlpha = "";
    public TaoPasswordPopType popType = TaoPasswordPopType.NONE;
    public String validateTime = com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18143);

    /* loaded from: classes8.dex */
    public enum TaoPasswordPopType {
        WEEX("weex"),
        NONE("");
        
        public String name;

        TaoPasswordPopType(String str) {
            this.name = str;
        }

        public static TaoPasswordPopType findType(String str) {
            TaoPasswordPopType[] values;
            for (TaoPasswordPopType taoPasswordPopType : values()) {
                if (taoPasswordPopType.name.equals(str)) {
                    return taoPasswordPopType;
                }
            }
            return NONE;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void setDefault() {
        String str;
        if (StringUtils.isEmpty(this.businessId)) {
            this.businessId = "10000";
        }
        if (StringUtils.isEmpty(this.title)) {
            if (!StringUtils.isEmpty(this.templateId)) {
                String str2 = this.templateId;
                char c = 65535;
                int hashCode = str2.hashCode();
                if (hashCode != -1335224239) {
                    if (hashCode != 3322092) {
                        if (hashCode == 3529462 && str2.equals("shop")) {
                            c = 2;
                        }
                    } else if (str2.equals("live")) {
                        c = 1;
                    }
                } else if (str2.equals("detail")) {
                    c = 0;
                }
                if (c == 0) {
                    str = com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18111);
                } else if (c == 1) {
                    str = com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18110);
                } else if (c == 2) {
                    str = com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18129);
                }
                this.title = com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18140) + str;
            }
            str = "";
            this.title = com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18140) + str;
        } else if (com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18110).equals(this.title)) {
            this.title = com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18123);
        }
        if (StringUtils.isEmpty(this.description)) {
            String config = OrangeConfig.getInstance().getConfig(NAME_SPACE, DESCRIPTION, null);
            if (StringUtils.isEmpty(config)) {
                config = com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18113);
            }
            this.description = config;
        }
        if ("1".equals(this.businessId) || StringUtils.equals(this.businessId, "detail") || StringUtils.equals(this.businessId, "tm_detail")) {
            this.shareScene = "item";
        }
        if (StringUtils.isEmpty(this.shareScene)) {
            this.shareScene = "other";
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.businessId);
        parcel.writeString(this.suId);
        parcel.writeString(this.shareId);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.url);
        parcel.writeString(this.shareScene);
        parcel.writeString(this.wwMsgType.getValue());
        parcel.writeString(this.weixinMsgType);
        parcel.writeString(this.weixinAppId);
        parcel.writeString(this.isActivity);
        parcel.writeString(this.needSaveContent);
        parcel.writeMap(this.activityParams);
        parcel.writeMap(this.extraParams);
        parcel.writeString(this.templateId);
        parcel.writeList(this.snapshotImages);
        parcel.writeString(JSON.toJSONString(this.qrConfig));
        parcel.writeString(this.popType.name);
        parcel.writeString(this.popUrl);
        parcel.writeString(this.maskAlpha);
        parcel.writeString(this.screenshot);
        parcel.writeMap(this.businessInfo);
        parcel.writeMap(this.templateParams);
        parcel.writeString(JSON.toJSONString(this.mediaPublisher));
        parcel.writeString(JSON.toJSONString(this.mediaInfo));
    }

    static {
        kge.a(1931376468);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<TBShareContent>() { // from class: com.taobao.share.globalmodel.TBShareContent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.share.globalmodel.TBShareContent] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ TBShareContent createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.share.globalmodel.TBShareContent[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ TBShareContent[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public TBShareContent a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                boolean z = true;
                if (ipChange instanceof IpChange) {
                    return (TBShareContent) ipChange.ipc$dispatch("11daa562", new Object[]{this, parcel});
                }
                TBShareContent tBShareContent = new TBShareContent();
                tBShareContent.businessId = parcel.readString();
                tBShareContent.suId = parcel.readString();
                tBShareContent.shareId = parcel.readString();
                tBShareContent.title = parcel.readString();
                tBShareContent.description = parcel.readString();
                tBShareContent.imageUrl = parcel.readString();
                tBShareContent.url = parcel.readString();
                tBShareContent.shareScene = parcel.readString();
                tBShareContent.wwMsgType = WWMessageType.getEnum(parcel.readString());
                tBShareContent.weixinMsgType = parcel.readString();
                tBShareContent.weixinAppId = parcel.readString();
                tBShareContent.isActivity = parcel.readString();
                tBShareContent.needSaveContent = parcel.readString();
                tBShareContent.headUrl = parcel.readString();
                tBShareContent.disableQrcode = parcel.readByte() != 0;
                if (parcel.readByte() == 0) {
                    z = false;
                }
                tBShareContent.disableTextInfo = z;
                tBShareContent.qrConfig = JSON.parseObject(parcel.readString());
                tBShareContent.snapshotImages = parcel.readArrayList(List.class.getClassLoader());
                parcel.readMap(tBShareContent.activityParams, Map.class.getClassLoader());
                parcel.readMap(tBShareContent.extraParams, Map.class.getClassLoader());
                parcel.readMap(tBShareContent.templateParams, Map.class.getClassLoader());
                tBShareContent.popType = TaoPasswordPopType.findType(parcel.readString());
                tBShareContent.popUrl = parcel.readString();
                tBShareContent.maskAlpha = parcel.readString();
                tBShareContent.screenshot = parcel.readString();
                tBShareContent.mediaPublisher = JSON.parseObject(parcel.readString());
                tBShareContent.mediaInfo = JSON.parseObject(parcel.readString());
                return tBShareContent;
            }

            public TBShareContent[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (TBShareContent[]) ipChange.ipc$dispatch("2f40213", new Object[]{this, new Integer(i)}) : new TBShareContent[i];
            }
        };
    }

    public String originUTArgs() {
        StringBuilder sb = new StringBuilder();
        sb.append("serverDataTrackMap=");
        sb.append(StringUtils.isEmpty(this.serverDataTrackMap) ? "null" : this.serverDataTrackMap);
        String sb2 = sb.toString();
        if (!StringUtils.isEmpty(this.originBizCode) && !StringUtils.isEmpty(this.detailSharePosition)) {
            return sb2 + "&originBizCode=" + this.originBizCode + "&detailSharePosition=" + this.detailSharePosition;
        } else if (!StringUtils.isEmpty(this.originBizCode)) {
            return sb2 + "&originBizCode=" + this.originBizCode;
        } else if (StringUtils.isEmpty(this.detailSharePosition)) {
            return sb2;
        } else {
            return sb2 + "&detailSharePosition=" + this.detailSharePosition;
        }
    }

    public void fillUTProperties(Properties properties) {
        if (!StringUtils.isEmpty(this.originBizCode)) {
            properties.put("originBizCode", this.originBizCode);
        }
        if (!StringUtils.isEmpty(this.detailSharePosition)) {
            properties.put("detailSharePosition", this.detailSharePosition);
        }
    }
}
