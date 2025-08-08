package com.etao.feimagesearch.model;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chat.aura.messageflow.input.ChatInputConstant;
import tb.cpe;
import tb.kge;

/* loaded from: classes3.dex */
public interface PhotoFrom {

    /* loaded from: classes3.dex */
    public enum Values implements PhotoFrom {
        ALBUM(ChatInputConstant.PANEL_ID_ALBUM),
        ALBUM_SYS("sao_album"),
        ALBUM_GARBAGE("album_garbage"),
        TAKE("take"),
        TAKE_SYS("sao_take"),
        TAKE_GARBAGE("take_garbage"),
        TAKE_SYS_GARBAGE("take_sao_garbage"),
        OPE("ope"),
        SYSTEM_ALBUM("system_album", ChatInputConstant.PANEL_ID_ALBUM),
        MEDIA_IMAGE("media_image", "media_image"),
        PREVIEW("preview", ChatInputConstant.PANEL_ID_ALBUM),
        SCAN("take"),
        CAPTURE_DETECT("capturedetect"),
        INTELLI_SYS("intellisys"),
        INTELLI_PLT("intelliplt"),
        HISTORY("history"),
        SHOP("shop"),
        WIDGET("screen_widget"),
        AUTO_DETECT(cpe.a.SCENE_AUTO_DETECT),
        META_SIGHT(cpe.a.SCENE_META_SIGHT),
        SAO_PLT_AUTO_DETECT("sao_plt_autodetect"),
        VIDEO_SHOT("video_shot"),
        VIDEO_SEARCH("video_search"),
        FOOT_PRINT("recommend"),
        OUTER_ALBUM_REMOTE("outer_album_remote"),
        OUTER_ALBUM_LOCAL("outer_album_local"),
        SAO_AUTO_DETECT("sao_autodetect"),
        AUTO_DETECT_CARD("autodetect_card"),
        AUTO_DETECT_CARD_JUMP("autodetect_card_jump"),
        RESEARCH("PicSearchCard"),
        SSK_LOCAL("ssklocal"),
        SSK_REMOTE("sskremote"),
        LOGO("sys_logo"),
        PRODUCT_CODE("productCode"),
        SSK_HISTORY("sskhistory"),
        Got_CODE("gotcode"),
        FLOAT_BAR("floatbar"),
        OUTER_ALBUM_RESULT("outer_album_result"),
        UNKNOWN("unknown");
        
        private static final String LOG_TAG = "PhotoFrom";
        private final String mArg;
        private final String mValue;

        Values(String str) {
            this.mValue = str;
            this.mArg = str;
        }

        Values(String str, String str2) {
            this.mValue = str;
            this.mArg = str2;
        }

        public static PhotoFrom parseValue(String str) {
            if (StringUtils.isEmpty(str)) {
                return UNKNOWN;
            }
            Values[] values = values();
            for (int i = 0; i < values.length; i++) {
                if (str.equals(values[i].getValue())) {
                    return values[i];
                }
            }
            return new a(str);
        }

        @Override // com.etao.feimagesearch.model.PhotoFrom
        public String getArg() {
            return this.mArg;
        }

        @Override // com.etao.feimagesearch.model.PhotoFrom
        public String getValue() {
            return this.mValue;
        }
    }

    String getArg();

    String getValue();

    /* loaded from: classes3.dex */
    public static class a implements PhotoFrom {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f6805a;

        static {
            kge.a(1113285038);
            kge.a(1153097703);
        }

        public a(String str) {
            this.f6805a = str;
        }

        @Override // com.etao.feimagesearch.model.PhotoFrom
        public String getValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this}) : this.f6805a;
        }

        @Override // com.etao.feimagesearch.model.PhotoFrom
        public String getArg() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8dd337d9", new Object[]{this}) : this.f6805a;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                String str = this.f6805a;
                if (str != null) {
                    return str.equals(aVar.f6805a);
                }
                if (aVar.f6805a == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.f6805a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "CustomPhotoFrom{mValue='" + this.f6805a + "'}";
        }
    }
}
