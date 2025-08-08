package com.taobao.taolive.sdk.model.message;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class TopAtmosphereMessage implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ContentData data;
    public int msgSubType;

    /* loaded from: classes8.dex */
    public enum TopAtmosphereMessageType {
        UNKNOWN(-1),
        COMMENT_COMBO(20000),
        BRAND_HOT(20001),
        ANCHOR_CERTIFICATE(20002);
        
        private int value;

        TopAtmosphereMessageType(int i) {
            this.value = i;
        }

        public static TopAtmosphereMessageType getMessageType(int i) {
            TopAtmosphereMessageType topAtmosphereMessageType = UNKNOWN;
            switch (i) {
                case 20000:
                    return COMMENT_COMBO;
                case 20001:
                    return BRAND_HOT;
                case 20002:
                    return ANCHOR_CERTIFICATE;
                default:
                    return topAtmosphereMessageType;
            }
        }
    }

    static {
        kge.a(-117114233);
        kge.a(-540945145);
    }

    /* loaded from: classes8.dex */
    public static class ContentData implements INetDataObject {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String atmosphere;
        public String backgroundImg;
        public String backgroundTitle;
        public String content;
        public String contentHash;
        public int count;
        public String countShow;
        public String iconImg;
        public int maxCount;
        public String maxCountShow;
        public long pushTime;

        static {
            kge.a(-1348336378);
            kge.a(-540945145);
        }

        public ContentData() {
        }

        public ContentData(String str, String str2, String str3, String str4) {
            this.backgroundImg = str;
            this.iconImg = str2;
            this.backgroundTitle = str3;
            this.content = str4;
        }

        public ContentData(String str, String str2, String str3, String str4, String str5, String str6) {
            this.backgroundImg = str3;
            this.backgroundTitle = str;
            this.content = str2;
            this.contentHash = str4;
            this.countShow = str6;
            this.maxCount = 1000000;
            this.maxCountShow = "999999+";
            try {
                this.count = Integer.parseInt(str5);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        public String getCountShow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1b3e32c3", new Object[]{this});
            }
            String str = this.countShow;
            if (StringUtils.isEmpty(str) && this.count > 0) {
                str = this.count + "";
            }
            int i = this.maxCount;
            return (i <= 0 || this.count < i || StringUtils.isEmpty(this.maxCountShow)) ? str : this.maxCountShow;
        }
    }

    public static TopAtmosphereMessage buildFromCommentCountMessage(CommentCountMessage commentCountMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TopAtmosphereMessage) ipChange.ipc$dispatch("3481a39f", new Object[]{commentCountMessage});
        }
        TopAtmosphereMessage topAtmosphereMessage = new TopAtmosphereMessage();
        topAtmosphereMessage.msgSubType = TopAtmosphereMessageType.COMMENT_COMBO.value;
        topAtmosphereMessage.data = new ContentData(commentCountMessage.backgroundTitle, commentCountMessage.data.content, commentCountMessage.backgroundImg, commentCountMessage.data.commentHash, commentCountMessage.data.count, commentCountMessage.data.countShow);
        topAtmosphereMessage.data.atmosphere = commentCountMessage.data.atmosphere;
        topAtmosphereMessage.data.pushTime = commentCountMessage.pushTime;
        return topAtmosphereMessage;
    }

    public static TopAtmosphereMessage buildFromAccountTag(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TopAtmosphereMessage) ipChange.ipc$dispatch("4a429fbe", new Object[]{str, str2, str3, str4});
        }
        TopAtmosphereMessage topAtmosphereMessage = new TopAtmosphereMessage();
        topAtmosphereMessage.msgSubType = TopAtmosphereMessageType.ANCHOR_CERTIFICATE.value;
        topAtmosphereMessage.data = new ContentData(str4, str3, str, str2);
        topAtmosphereMessage.data.pushTime = System.currentTimeMillis();
        return topAtmosphereMessage;
    }

    public TopAtmosphereMessageType getMessageType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TopAtmosphereMessageType) ipChange.ipc$dispatch("52b7fbcc", new Object[]{this}) : TopAtmosphereMessageType.getMessageType(this.msgSubType);
    }
}
