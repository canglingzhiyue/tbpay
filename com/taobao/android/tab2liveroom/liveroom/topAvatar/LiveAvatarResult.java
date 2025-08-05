package com.taobao.android.tab2liveroom.liveroom.topAvatar;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class LiveAvatarResult implements Serializable {
    private static final long serialVersionUID = 721052845341218969L;
    public boolean enable;
    @JSONField(name = "liveAccounts")
    public List<LiveAccount> result;
    public int showSeconds;
    public String version;

    /* loaded from: classes6.dex */
    public static class AccountLiveTag implements Serializable {
        private static final long serialVersionUID = 231052663766344820L;
        public String backgroundColor;
        public String fontColor;
        public String pushReason;
        public String tagName;

        static {
            kge.a(-1440215918);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes6.dex */
    public static class LiveAccount implements Serializable {
        private static final long serialVersionUID = 4136873957268140937L;
        public String accountId;
        public AccountLiveTag accountLiveTag;
        public String accountNick;
        public String avatarUrl;
        public String cryptoId;
        public String cryptoKeyName;
        public String followed;
        public String showFollowStatus;
        public String specialType;
        public Status status;
        public String targetUrl;
        public String topParams;

        static {
            kge.a(-1807150896);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes6.dex */
    public static class Status implements Serializable {
        private static final long serialVersionUID = 634052846316637620L;
        public int height;
        public String redirectUrl;
        public String statusValue;
        public String tagPic;
        public int width;

        static {
            kge.a(1808223587);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(1455516787);
        kge.a(1028243835);
    }
}
