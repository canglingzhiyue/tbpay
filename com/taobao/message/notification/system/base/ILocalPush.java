package com.taobao.message.notification.system.base;

import android.app.NotificationChannel;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.widget.RemoteViews;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.kge;
import tb.nia;

/* loaded from: classes7.dex */
public interface ILocalPush {

    /* loaded from: classes7.dex */
    public interface RemoteViewListener {
        void on(RemoteViews remoteViews);
    }

    /* loaded from: classes7.dex */
    public interface RemoteViewsHolder {
        void fetch(RemoteViewListener remoteViewListener);
    }

    String getCategory();

    RemoteViewsHolder getCustomView();

    int getImportance();

    Bitmap getLargeIcon();

    Pair<String, nia> getLargeIconURL();

    NotificationChannel getNotificationChannel();

    Uri getNotificationSound();

    Content getPushContent();

    int getRequestId();

    int getSmallIcon();

    void performNotify();

    /* loaded from: classes7.dex */
    public static class Content {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String DIS_PLAY_TITLE = "您有新消息";
        private final CharSequence mContent;
        private final CharSequence mTicker;
        private final CharSequence mTitle;

        static {
            kge.a(-729584328);
        }

        public Content(CharSequence charSequence, CharSequence charSequence2) {
            this(charSequence, charSequence2, null);
        }

        public Content(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
            this.mTitle = charSequence;
            this.mContent = charSequence2;
            this.mTicker = charSequence3;
        }

        public void setData(NotificationCompat.Builder builder) {
            CharSequence charSequence;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e4ff54b", new Object[]{this, builder});
                return;
            }
            CharSequence charSequence2 = this.mTitle;
            CharSequence charSequence3 = DIS_PLAY_TITLE;
            if (charSequence2 == null) {
                charSequence2 = charSequence3;
            }
            if (this.mContent != null) {
                charSequence3 = this.mTicker;
                if (charSequence3 == null) {
                    charSequence3 = ((Object) charSequence2) + ResponseProtocolType.COMMENT + ((Object) this.mContent);
                }
                charSequence = this.mContent;
            } else {
                charSequence = charSequence3;
            }
            if (!StringUtils.isEmpty(this.mTicker)) {
                charSequence3 = this.mTicker;
            }
            builder.setTicker(charSequence3);
            builder.setContentTitle(charSequence2);
            builder.setContentText(charSequence);
        }
    }
}
