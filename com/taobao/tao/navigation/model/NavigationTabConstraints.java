package com.taobao.tao.navigation.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes8.dex */
public class NavigationTabConstraints {
    public static final String MATERIAL_TYPE_ALIEN_EFFECTIVE = "alienEffect";
    public static final String MATERIAL_TYPE_COMMON_MARK = "commonMark";
    public static final String TAB_ALIEN_EFFECTIVE_CONTENT = "content";
    public static final String TAB_ALIEN_EFFECTIVE_INBOX = "inbox";
    public static final String TAB_ALIEN_EFFECTIVE_INBOX_NUM = "inboxNum";
    public static final String TAB_ALIEN_EFFECTIVE_INBOX_TEXT = "inboxText";
    public static final String TAB_ALIEN_EFFECTIVE_OUTBOX = "outbox";
    public static final String TAB_ALIEN_EFFECTIVE_OUTBOX_NUM = "outboxNum";
    public static final String TAB_ALIEN_EFFECTIVE_OUTBOX_TEXT = "outboxText";
    public static final String TAB_ALIEN_EFFECTIVE_PLACEHOLDER = "placeholder";
    public static final String TAB_ALIEN_EFFECTIVE_RED_ENVELOP = "redenvelope";
    public static final String TAB_ALIEN_EFFECTIVE_ROCKET = "rocket";
    public static final String TAB_BIZ_CART = "cart";
    public static final String TAB_BIZ_CATEGORY = "tmgcategory";
    public static final String TAB_BIZ_DISCOVERY = "discovery";
    public static final String TAB_BIZ_HOMEPAGE = "homePage";
    public static final String TAB_BIZ_MESSAGE = "message";
    public static final String TAB_BIZ_MYTAOBAO = "mytaobao";
    public static final String TAB_BIZ_PAILITAO = "tmgpailitao";
    public static final String TAB_BIZ_TAB2 = "tab2";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes8.dex */
    public @interface TabAlienEffectiveType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes8.dex */
    public @interface TabBiz {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes8.dex */
    public @interface TabMaterialType {
    }
}
